package com.google.android.gms.internal.auth;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.auth.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2071n extends K {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23742a;

    /* renamed from: b, reason: collision with root package name */
    private final U f23743b;

    C2071n(Context context, U u10) {
        this.f23742a = context;
        this.f23743b = u10;
    }

    @Override // com.google.android.gms.internal.auth.K
    final Context a() {
        return this.f23742a;
    }

    @Override // com.google.android.gms.internal.auth.K
    final U b() {
        return this.f23743b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k10 = (K) obj;
            if (this.f23742a.equals(k10.a()) && this.f23743b.equals(k10.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23742a.hashCode() ^ 1000003) * 1000003) ^ this.f23743b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f23742a.toString() + ", hermeticFileOverrides=" + this.f23743b.toString() + "}";
    }
}
