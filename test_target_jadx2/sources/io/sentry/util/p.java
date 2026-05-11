package io.sentry.util;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f35561a;

    /* renamed from: b, reason: collision with root package name */
    static boolean f35562b;

    static {
        try {
            f35561a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f35561a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f35562b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f35562b = false;
            }
        } catch (Throwable unused2) {
            f35562b = false;
        }
    }

    public static boolean a() {
        return f35562b;
    }

    public static boolean b() {
        return !f35561a;
    }
}
