package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2199b4 extends AbstractC2275k {

    /* renamed from: c, reason: collision with root package name */
    private final C2203c f24462c;

    public C2199b4(C2203c c2203c) {
        super("internal.eventLogger");
        this.f24462c = c2203c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    public final InterfaceC2329q b(Y1 y12, List list) {
        AbstractC2412z2.a(this.f24543a, 3, list);
        String a10 = y12.a((InterfaceC2329q) list.get(0)).a();
        long i10 = (long) AbstractC2412z2.i(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue());
        InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(2));
        this.f24462c.e(a10, i10, a11 instanceof C2302n ? AbstractC2412z2.k((C2302n) a11) : new HashMap());
        return InterfaceC2329q.f24620U;
    }
}
