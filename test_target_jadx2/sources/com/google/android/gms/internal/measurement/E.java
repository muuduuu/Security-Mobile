package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class E extends AbstractC2391x {
    protected E() {
        this.f24681a.add(N.AND);
        this.f24681a.add(N.NOT);
        this.f24681a.add(N.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        int ordinal = AbstractC2412z2.e(str).ordinal();
        if (ordinal == 1) {
            AbstractC2412z2.a(N.AND.name(), 2, list);
            InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
            return a10.g().booleanValue() ? y12.a((InterfaceC2329q) list.get(1)) : a10;
        }
        if (ordinal == 47) {
            AbstractC2412z2.a(N.NOT.name(), 1, list);
            return new C2239g(Boolean.valueOf(!y12.a((InterfaceC2329q) list.get(0)).g().booleanValue()));
        }
        if (ordinal != 50) {
            return super.b(str);
        }
        AbstractC2412z2.a(N.OR.name(), 2, list);
        InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(0));
        return !a11.g().booleanValue() ? y12.a((InterfaceC2329q) list.get(1)) : a11;
    }
}
