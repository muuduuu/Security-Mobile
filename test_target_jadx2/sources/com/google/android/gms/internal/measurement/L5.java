package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class L5 implements S5 {

    /* renamed from: a, reason: collision with root package name */
    private final H5 f24278a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2219d6 f24279b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24280c = false;

    /* renamed from: d, reason: collision with root package name */
    private final U4 f24281d;

    private L5(AbstractC2219d6 abstractC2219d6, U4 u42, H5 h52) {
        this.f24279b = abstractC2219d6;
        this.f24281d = u42;
        this.f24278a = h52;
    }

    static L5 i(AbstractC2219d6 abstractC2219d6, U4 u42, H5 h52) {
        return new L5(abstractC2219d6, u42, h52);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final int a(Object obj) {
        int hashCode = ((AbstractC2245g5) obj).zzc.hashCode();
        if (!this.f24280c) {
            return hashCode;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void b(Object obj, Object obj2) {
        U5.d(this.f24279b, obj, obj2);
        if (this.f24280c) {
            U5.c(this.f24281d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final int c(Object obj) {
        int g10 = ((AbstractC2245g5) obj).zzc.g();
        if (!this.f24280c) {
            return g10;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final boolean d(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void e(Object obj, byte[] bArr, int i10, int i11, C2396x4 c2396x4) {
        AbstractC2245g5 abstractC2245g5 = (AbstractC2245g5) obj;
        if (abstractC2245g5.zzc == C2228e6.a()) {
            abstractC2245g5.zzc = C2228e6.b();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final boolean f(Object obj, Object obj2) {
        if (!((AbstractC2245g5) obj).zzc.equals(((AbstractC2245g5) obj2).zzc)) {
            return false;
        }
        if (!this.f24280c) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void g(Object obj) {
        this.f24279b.b(obj);
        this.f24281d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void h(Object obj, InterfaceC2336q6 interfaceC2336q6) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final Object zza() {
        H5 h52 = this.f24278a;
        return h52 instanceof AbstractC2245g5 ? ((AbstractC2245g5) h52).l() : h52.b().m1();
    }
}
