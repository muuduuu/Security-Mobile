package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class U7 extends AbstractC2275k {

    /* renamed from: c, reason: collision with root package name */
    private final Y7 f24391c;

    public U7(Y7 y72) {
        super("internal.registerCallback");
        this.f24391c = y72;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    public final InterfaceC2329q b(Y1 y12, List list) {
        AbstractC2412z2.a(this.f24543a, 3, list);
        String a10 = y12.a((InterfaceC2329q) list.get(0)).a();
        InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(1));
        if (!(a11 instanceof C2320p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC2329q a12 = y12.a((InterfaceC2329q) list.get(2));
        if (!(a12 instanceof C2302n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C2302n c2302n = (C2302n) a12;
        if (!c2302n.t("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f24391c.a(a10, c2302n.t("priority") ? AbstractC2412z2.g(c2302n.e("priority").f().doubleValue()) : 1000, (C2320p) a11, c2302n.e("type").a());
        return InterfaceC2329q.f24620U;
    }
}
