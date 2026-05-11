package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    static String f34804a;

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f34805b = Charset.forName("UTF-8");

    public static synchronized String a(Context context) {
        synchronized (Y.class) {
            try {
                if (f34804a == null) {
                    File file = new File(context.getFilesDir(), "INSTALLATION");
                    try {
                        if (!file.exists()) {
                            String c10 = c(file);
                            f34804a = c10;
                            return c10;
                        }
                        f34804a = b(file);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                return f34804a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static String b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f34805b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String c(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String uuid = UUID.randomUUID().toString();
            fileOutputStream.write(uuid.getBytes(f34805b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return uuid;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
