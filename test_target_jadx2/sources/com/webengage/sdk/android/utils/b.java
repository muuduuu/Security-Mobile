package com.webengage.sdk.android.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.webengage.sdk.android.C2964l;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.Response;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: com.webengage.sdk.android.utils.b$b, reason: collision with other inner class name */
    private static class C0446b extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f30907a;

        /* renamed from: b, reason: collision with root package name */
        private int f30908b;

        private C0446b(InputStream inputStream) {
            this.f30907a = inputStream;
            this.f30908b = 0;
        }

        @Override // java.io.InputStream
        public int read() {
            int read = this.f30907a.read();
            if (read != -1) {
                return read;
            }
            int i10 = this.f30908b;
            if (i10 > 0) {
                return 217;
            }
            this.f30908b = i10 + 1;
            return 255;
        }
    }

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 > i11 && i16 / i14 > i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    private static Bitmap a(BitmapFactory.Options options, File file, int i10, int i11) {
        if (options.inSampleSize > 32) {
            throw new OutOfMemoryError();
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (decodeFile != null) {
                int width = decodeFile.getWidth();
                int height = decodeFile.getHeight();
                return (((double) width) / ((double) height) != ((double) i10) / ((double) i11) || width < i10 || height < i11) ? decodeFile : Bitmap.createScaledBitmap(decodeFile, i10, i11, false);
            }
            FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
            Bitmap decodeStream = BitmapFactory.decodeStream(new C0446b(fileInputStream));
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
            return decodeStream;
        } catch (Exception unused2) {
            return null;
        } catch (OutOfMemoryError unused3) {
            options.inSampleSize *= 2;
            return a(options, file, i10, i11);
        }
    }

    public static Bitmap a(Response response, float f10, float f11, Context context) {
        return a(response, WebEngageUtils.a(f10, context.getApplicationContext()), WebEngageUtils.a(f11, context.getApplicationContext()), context);
    }

    public static Bitmap a(Response response, float f10, Context context) {
        return a(response, WebEngageUtils.d(context.getApplicationContext()).widthPixels, WebEngageUtils.a(f10, context.getApplicationContext()), context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(4:(15:13|14|15|16|18|19|20|21|22|(3:23|(1:25)(0)|26)|27|28|29|30|(2:32|(3:34|35|36)(3:37|38|39))(2:40|41))|29|30|(0)(0))|15|16|18|19|20|21|22|(4:23|(0)(0)|26|25)|27|28) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:5|(15:13|14|15|16|18|19|20|21|22|(3:23|(1:25)(0)|26)|27|28|29|30|(2:32|(3:34|35|36)(3:37|38|39))(2:40|41))|63|15|16|18|19|20|21|22|(4:23|(0)(0)|26|25)|27|28|29|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0060, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0066, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
    
        r0.close();
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006f, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0071, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0070, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[Catch: all -> 0x0060, Exception -> 0x0062, LOOP:0: B:23:0x0055->B:25:0x005c, LOOP_END, TRY_LEAVE, TryCatch #9 {Exception -> 0x0062, all -> 0x0060, blocks: (B:22:0x0053, B:23:0x0055, B:25:0x005c), top: B:21:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:30:0x0076, B:32:0x0080, B:34:0x0090, B:37:0x00a9), top: B:29:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap a(Response response, int i10, int i11, Context context) {
        long j10;
        File file;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        int read;
        InputStream inputStream = response.getInputStream();
        FileOutputStream fileOutputStream2 = null;
        if (inputStream == null) {
            return null;
        }
        Map<String, List<String>> responseHeaders = response.getResponseHeaders();
        try {
            try {
                if (responseHeaders != null && responseHeaders.containsKey("content-length") && responseHeaders.get("content-length") != null && responseHeaders.get("content-length").size() > 0) {
                    try {
                        j10 = Long.valueOf(responseHeaders.get("content-length").get(0)).longValue();
                    } catch (NumberFormatException unused) {
                    }
                    file = File.createTempFile("image__", ".temp", context.getCacheDir());
                    fileOutputStream = new FileOutputStream(file);
                    bArr = new byte[1024];
                    while (true) {
                        read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        }
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    inputStream.close();
                    fileOutputStream.close();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    if (file == null) {
                        return null;
                    }
                    if (file.length() >= j10 * 0.98d) {
                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        options.inSampleSize = a(options, i10, i11);
                        options.inJustDecodeBounds = false;
                        return a(options, file, i10, i11);
                    }
                    Logger.e("WebEngage", "Incomplete image downloaded [url: " + response.getRequestURL() + ", total image size: " + j10 + " bytes, downloaded image size: " + file.length() + " bytes]");
                    return null;
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                if (file == null) {
                }
            } finally {
                file.delete();
            }
            file = File.createTempFile("image__", ".temp", context.getCacheDir());
            fileOutputStream = new FileOutputStream(file);
            bArr = new byte[1024];
            while (true) {
                read = inputStream.read(bArr);
                if (read != -1) {
                }
                break;
                fileOutputStream.write(bArr, 0, read);
            }
            inputStream.close();
            fileOutputStream.close();
        } catch (Throwable th) {
            th = th;
        }
        j10 = 0;
    }

    public static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    inputStream.close();
                    return sb2.toString();
                }
                sb2.append(readLine);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Map<String, Object> a(InputStream inputStream, boolean z10) {
        return new com.webengage.sdk.android.utils.a(inputStream, z10).b();
    }

    public static void a(Set<String> set, Context context) {
        if (set == null || set.size() == 0) {
            return;
        }
        for (String str : set) {
            if (!str.isEmpty()) {
                C2964l.a(new RequestObject.Builder(str, RequestMethod.GET, context.getApplicationContext()).setCachePolicy(2).build(), context);
            }
        }
    }
}
