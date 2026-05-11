package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2046e1 implements InterfaceC2067l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Z0 f23705a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2082q1 f23706b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2098w0 f23707c;

    private C2046e1(AbstractC2082q1 abstractC2082q1, AbstractC2098w0 abstractC2098w0, Z0 z02) {
        this.f23706b = abstractC2082q1;
        this.f23707c = abstractC2098w0;
        this.f23705a = z02;
    }

    static C2046e1 a(AbstractC2082q1 abstractC2082q1, AbstractC2098w0 abstractC2098w0, Z0 z02) {
        return new C2046e1(abstractC2082q1, abstractC2098w0, z02);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final int b(Object obj) {
        return this.f23706b.a(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final void c(Object obj) {
        this.f23706b.c(obj);
        this.f23707c.b(obj);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final boolean e(Object obj) {
        this.f23707c.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final Object f() {
        Z0 z02 = this.f23705a;
        return z02 instanceof C0 ? ((C0) z02).c() : ((B0) ((C0) z02).o(5, null, null)).f();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final void g(Object obj, byte[] bArr, int i10, int i11, C2045e0 c2045e0) {
        C0 c02 = (C0) obj;
        if (c02.zzc == C2087s1.a()) {
            c02.zzc = C2087s1.d();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final void h(Object obj, Object obj2) {
        AbstractC2073n1.c(this.f23706b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final boolean i(Object obj, Object obj2) {
        return this.f23706b.a(obj).equals(this.f23706b.a(obj2));
    }
}
