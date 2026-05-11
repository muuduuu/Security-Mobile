package io.sentry.android.core;

import android.content.Context;
import io.sentry.Integration;

/* loaded from: classes2.dex */
public abstract class E {
    public static Integration a(Context context, N n10) {
        return n10.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
