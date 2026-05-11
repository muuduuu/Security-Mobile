package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.K1;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class f extends d {

    /* renamed from: d, reason: collision with root package name */
    private final ClassLoader f35174d;

    public f(ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f35174d.getResourceAsStream("sentry-external-modules.txt");
            if (resourceAsStream != null) {
                return c(resourceAsStream);
            }
            this.f35171a.c(K1.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (SecurityException e10) {
            this.f35171a.b(K1.INFO, "Access to resources denied.", e10);
            return treeMap;
        }
    }

    f(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.f35174d = io.sentry.util.a.a(classLoader);
    }
}
