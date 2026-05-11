package io.sentry.cache;

import io.sentry.K1;
import io.sentry.P1;
import io.sentry.Z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f35038a = Charset.forName("UTF-8");

    static void a(P1 p12, String str, String str2) {
        File b10 = b(p12, str);
        if (b10 == null) {
            p12.getLogger().c(K1.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(b10, str2);
        if (file.exists()) {
            p12.getLogger().c(K1.DEBUG, "Deleting %s from scope cache", str2);
            if (file.delete()) {
                return;
            }
            p12.getLogger().c(K1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private static File b(P1 p12, String str) {
        String cacheDirPath = p12.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    static Object c(P1 p12, String str, String str2, Class cls, Z z10) {
        File b10 = b(p12, str);
        if (b10 == null) {
            p12.getLogger().c(K1.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(b10, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f35038a));
                try {
                    if (z10 == null) {
                        Object c10 = p12.getSerializer().c(bufferedReader, cls);
                        bufferedReader.close();
                        return c10;
                    }
                    Object e10 = p12.getSerializer().e(bufferedReader, cls, z10);
                    bufferedReader.close();
                    return e10;
                } finally {
                }
            } catch (Throwable th) {
                p12.getLogger().a(K1.ERROR, th, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            p12.getLogger().c(K1.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    static void d(P1 p12, Object obj, String str, String str2) {
        File b10 = b(p12, str);
        if (b10 == null) {
            p12.getLogger().c(K1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file = new File(b10, str2);
        if (file.exists()) {
            p12.getLogger().c(K1.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file.delete()) {
                p12.getLogger().c(K1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f35038a));
                try {
                    p12.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            p12.getLogger().a(K1.ERROR, th, "Error persisting entity: %s", str2);
        }
    }
}
