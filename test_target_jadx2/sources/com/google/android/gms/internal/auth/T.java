package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class T extends S {

    /* renamed from: a, reason: collision with root package name */
    private final Object f23654a;

    T(Object obj) {
        this.f23654a = obj;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final Object a() {
        return this.f23654a;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return this.f23654a.equals(((T) obj).f23654a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23654a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f23654a.toString() + ")";
    }
}
