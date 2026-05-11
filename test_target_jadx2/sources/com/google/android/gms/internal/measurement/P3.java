package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes2.dex */
final class P3 extends AbstractC2271j4 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24325a;

    /* renamed from: b, reason: collision with root package name */
    private final g8.k f24326b;

    P3(Context context, g8.k kVar) {
        this.f24325a = context;
        this.f24326b = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2271j4
    final Context a() {
        return this.f24325a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2271j4
    final g8.k b() {
        return this.f24326b;
    }

    public final boolean equals(Object obj) {
        g8.k kVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2271j4) {
            AbstractC2271j4 abstractC2271j4 = (AbstractC2271j4) obj;
            if (this.f24325a.equals(abstractC2271j4.a()) && ((kVar = this.f24326b) != null ? kVar.equals(abstractC2271j4.b()) : abstractC2271j4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f24325a.hashCode() ^ 1000003;
        g8.k kVar = this.f24326b;
        return (hashCode * 1000003) ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        String obj = this.f24325a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f24326b);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(obj);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
