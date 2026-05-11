package io.sentry.util;

/* loaded from: classes2.dex */
public abstract class a {
    public static ClassLoader a(ClassLoader classLoader) {
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }
}
