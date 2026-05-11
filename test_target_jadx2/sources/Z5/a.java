package Z5;

import Z5.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class a implements c.a {

    /* renamed from: Z5.a$a, reason: collision with other inner class name */
    private static class C0229a {

        /* renamed from: a, reason: collision with root package name */
        public ZipFile f12443a;

        /* renamed from: b, reason: collision with root package name */
        public ZipEntry f12444b;

        public C0229a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f12443a = zipFile;
            this.f12444b = zipEntry;
        }
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    private C0229a d(Context context, String[] strArr, String str, d dVar) {
        String[] f10 = f(context);
        int length = f10.length;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = f10[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("lib");
                            char c10 = File.separatorChar;
                            sb2.append(c10);
                            sb2.append(str3);
                            sb2.append(c10);
                            sb2.append(str);
                            String sb3 = sb2.toString();
                            dVar.i("Looking for %s in APK %s...", sb3, str2);
                            ZipEntry entry = zipFile.getEntry(sb3);
                            if (entry != null) {
                                return new C0229a(zipFile, entry);
                            }
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
        }
    }

    private String[] e(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lib");
        char c10 = File.separatorChar;
        sb2.append(c10);
        sb2.append("([^\\");
        sb2.append(c10);
        sb2.append("]*)");
        sb2.append(c10);
        sb2.append(str);
        Pattern compile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // Z5.c.a
    public void a(Context context, String[] strArr, String str, File file, d dVar) {
        String[] strArr2;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        long c10;
        C0229a c0229a = null;
        Closeable closeable = null;
        try {
            C0229a d10 = d(context, strArr, str, dVar);
            try {
                if (d10 == null) {
                    try {
                        strArr2 = e(context, str);
                    } catch (Exception e10) {
                        strArr2 = new String[]{e10.toString()};
                    }
                    throw new b(str, strArr, strArr2);
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 >= 5) {
                        dVar.h("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile = d10.f12443a;
                            if (zipFile != null) {
                                zipFile.close();
                                return;
                            }
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    dVar.i("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = d10.f12443a.getInputStream(d10.f12444b);
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                } catch (FileNotFoundException unused2) {
                                    fileOutputStream = null;
                                } catch (IOException unused3) {
                                    fileOutputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = null;
                                }
                            } catch (FileNotFoundException unused4) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (IOException unused5) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                            }
                            try {
                                c10 = c(inputStream, fileOutputStream);
                                fileOutputStream.getFD().sync();
                            } catch (FileNotFoundException unused6) {
                                b(inputStream);
                                b(fileOutputStream);
                                i10 = i11;
                            } catch (IOException unused7) {
                                b(inputStream);
                                b(fileOutputStream);
                                i10 = i11;
                            } catch (Throwable th3) {
                                th = th3;
                                closeable = inputStream;
                                b(closeable);
                                b(fileOutputStream);
                                throw th;
                            }
                            if (c10 == file.length()) {
                                b(inputStream);
                                b(fileOutputStream);
                                file.setReadable(true, false);
                                file.setExecutable(true, false);
                                file.setWritable(true);
                                try {
                                    ZipFile zipFile2 = d10.f12443a;
                                    if (zipFile2 != null) {
                                        zipFile2.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException unused8) {
                                    return;
                                }
                            }
                            b(inputStream);
                            b(fileOutputStream);
                        }
                    } catch (IOException unused9) {
                    }
                    i10 = i11;
                }
            } catch (Throwable th4) {
                th = th4;
                c0229a = d10;
                if (c0229a != null) {
                    try {
                        ZipFile zipFile3 = c0229a.f12443a;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (IOException unused10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
