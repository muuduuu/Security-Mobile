package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class P extends S {

    /* renamed from: a, reason: collision with root package name */
    static final P f23635a = new P();

    private P() {
    }

    @Override // com.google.android.gms.internal.auth.S
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.S
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
