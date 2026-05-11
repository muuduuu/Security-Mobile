package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.K1;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f35563a = Charset.forName("UTF-8");

    public static String a(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f35563a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                iLogger.b(K1.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th) {
                iLogger.c(K1.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        return null;
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(substring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static String c(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return (lastIndexOf < 0 || str.length() <= (i10 = lastIndexOf + 1)) ? str : str.substring(i10);
    }

    public static String d(String str) {
        return str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
    }

    public static String e(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    public static String f(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
