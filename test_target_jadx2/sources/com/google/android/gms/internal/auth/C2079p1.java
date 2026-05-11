package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2079p1 extends RuntimeException {
    public C2079p1(Z0 z02) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final H0 a() {
        return new H0(getMessage());
    }
}
