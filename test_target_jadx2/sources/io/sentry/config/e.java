package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.K1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f35083a;

    /* renamed from: b, reason: collision with root package name */
    private final ILogger f35084b;

    public e(String str, ILogger iLogger) {
        this.f35083a = str;
        this.f35084b = iLogger;
    }

    public Properties a() {
        try {
            File file = new File(this.f35083a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } finally {
            }
        } catch (IOException e10) {
            this.f35084b.a(K1.ERROR, e10, "Failed to load Sentry configuration from file: %s", this.f35083a);
            return null;
        }
    }
}
