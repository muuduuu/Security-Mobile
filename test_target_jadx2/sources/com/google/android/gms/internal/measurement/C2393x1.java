package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2393x1 {

    /* renamed from: a, reason: collision with root package name */
    final C2400y f24682a;

    /* renamed from: b, reason: collision with root package name */
    final Y1 f24683b;

    /* renamed from: c, reason: collision with root package name */
    final Y1 f24684c;

    /* renamed from: d, reason: collision with root package name */
    final B3 f24685d;

    public C2393x1() {
        C2400y c2400y = new C2400y();
        this.f24682a = c2400y;
        Y1 y12 = new Y1(null, c2400y);
        this.f24684c = y12;
        this.f24683b = y12.c();
        B3 b32 = new B3();
        this.f24685d = b32;
        y12.e("require", new V7(b32));
        b32.a("internal.platform", CallableC2223e1.f24488a);
        y12.e("runtime.counter", new C2266j(Double.valueOf(0.0d)));
    }

    public final InterfaceC2329q a(Y1 y12, G3... g3Arr) {
        InterfaceC2329q interfaceC2329q = InterfaceC2329q.f24620U;
        for (G3 g32 : g3Arr) {
            interfaceC2329q = AbstractC2189a3.b(g32);
            AbstractC2412z2.l(this.f24684c);
            if ((interfaceC2329q instanceof r) || (interfaceC2329q instanceof C2320p)) {
                interfaceC2329q = this.f24682a.b(y12, interfaceC2329q);
            }
        }
        return interfaceC2329q;
    }
}
