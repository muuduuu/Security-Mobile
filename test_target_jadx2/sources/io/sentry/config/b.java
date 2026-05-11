package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.K1;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f35079a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f35080b;

    /* renamed from: c, reason: collision with root package name */
    private final ILogger f35081c;

    public b(String str, ClassLoader classLoader, ILogger iLogger) {
        this.f35079a = str;
        this.f35080b = io.sentry.util.a.a(classLoader);
        this.f35081c = iLogger;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f35080b.getResourceAsStream(this.f35079a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            this.f35081c.a(K1.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", this.f35079a);
            return null;
        }
    }

    public b(ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
