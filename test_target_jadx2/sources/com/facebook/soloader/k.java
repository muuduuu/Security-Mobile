package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class k extends G {

    private final class a extends G.e {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f23062a;

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r12 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        a(G g10) {
            File file;
            File file2;
            File file3 = new File("/data/local/tmp/exopackage/" + k.this.f23013d.getPackageName() + "/native-libs/");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] j10 = SysUtil.j();
            int length = j10.length;
            int i10 = 0;
            int i11 = 0;
            loop0: while (i11 < length) {
                String str = j10[i11];
                File file4 = new File(file3, str);
                if (file4.isDirectory()) {
                    linkedHashSet.add(str);
                    File file5 = new File(file4, "metadata.txt");
                    if (file5.isFile()) {
                        FileReader fileReader = new FileReader(file5);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        file = file3;
                                        bufferedReader.close();
                                        fileReader.close();
                                        break;
                                    }
                                    if (readLine.length() != 0) {
                                        int indexOf = readLine.indexOf(32);
                                        if (indexOf == -1) {
                                            break loop0;
                                        }
                                        String str2 = readLine.substring(i10, indexOf) + ".so";
                                        int size = arrayList.size();
                                        while (true) {
                                            if (i10 >= size) {
                                                file2 = file3;
                                                String substring = readLine.substring(indexOf + 1);
                                                arrayList.add(new b(str2, substring.substring(substring.indexOf(45), substring.indexOf(".so")), new File(file4, substring)));
                                                break;
                                            } else {
                                                file2 = file3;
                                                if (((b) arrayList.get(i10)).f23020a.equals(str2)) {
                                                    break;
                                                }
                                                i10++;
                                                file3 = file2;
                                            }
                                        }
                                        file3 = file2;
                                        i10 = 0;
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            i11++;
                            file3 = file;
                            i10 = 0;
                        } finally {
                        }
                    }
                }
                file = file3;
                i11++;
                file3 = file;
                i10 = 0;
            }
            g10.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.f23062a = (b[]) arrayList.toArray(new b[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] b() {
            return this.f23062a;
        }

        @Override // com.facebook.soloader.G.e
        public void c(File file) {
            byte[] bArr = new byte[32768];
            for (b bVar : this.f23062a) {
                FileInputStream fileInputStream = new FileInputStream(bVar.f23064c);
                try {
                    G.d dVar = new G.d(bVar, fileInputStream);
                    fileInputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    private static final class b extends G.c {

        /* renamed from: c, reason: collision with root package name */
        final File f23064c;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f23064c = file;
        }
    }

    public k(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.C2003f, com.facebook.soloader.E
    public String c() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a(this);
    }
}
