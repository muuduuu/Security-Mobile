package io.sentry.android.core.internal.util;

import io.sentry.protocol.f;

/* loaded from: classes2.dex */
public abstract class h {
    public static f.b a(int i10) {
        if (i10 == 1) {
            return f.b.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return f.b.LANDSCAPE;
    }
}
