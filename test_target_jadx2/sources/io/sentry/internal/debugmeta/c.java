package io.sentry.internal.debugmeta;

import io.sentry.ILogger;
import io.sentry.K1;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ILogger f35157a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f35158b;

    public c(ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    public Properties a() {
        InputStream resourceAsStream = this.f35158b.getResourceAsStream(io.sentry.util.c.f35553a);
        if (resourceAsStream == null) {
            this.f35157a.c(K1.INFO, "%s file was not found.", io.sentry.util.c.f35553a);
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            this.f35157a.a(K1.ERROR, e10, "Failed to load %s", io.sentry.util.c.f35553a);
            return null;
        } catch (RuntimeException e11) {
            this.f35157a.a(K1.ERROR, e11, "%s file is malformed.", io.sentry.util.c.f35553a);
            return null;
        }
    }

    c(ILogger iLogger, ClassLoader classLoader) {
        this.f35157a = iLogger;
        this.f35158b = io.sentry.util.a.a(classLoader);
    }
}
