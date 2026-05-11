package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.util.c;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34858a;

    /* renamed from: b, reason: collision with root package name */
    private final ILogger f34859b;

    public a(Context context, ILogger iLogger) {
        this.f34858a = context;
        this.f34859b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public Properties a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f34858a.getAssets().open(c.f35553a));
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
        } catch (FileNotFoundException e10) {
            this.f34859b.a(K1.INFO, e10, "%s file was not found.", c.f35553a);
            return null;
        } catch (IOException e11) {
            this.f34859b.b(K1.ERROR, "Error getting Proguard UUIDs.", e11);
            return null;
        } catch (RuntimeException e12) {
            this.f34859b.a(K1.ERROR, e12, "%s file is malformed.", c.f35553a);
            return null;
        }
    }
}
