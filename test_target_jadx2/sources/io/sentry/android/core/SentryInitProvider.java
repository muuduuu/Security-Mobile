package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.I1;
import io.sentry.K1;
import io.sentry.Y0;

/* loaded from: classes2.dex */
public final class SentryInitProvider extends V {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C3389t c3389t = new C3389t();
        Context context = getContext();
        if (context == null) {
            c3389t.c(K1.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!d0.c(context, c3389t)) {
            return true;
        }
        k0.d(context, c3389t);
        I1.c().a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        Y0.h();
    }
}
