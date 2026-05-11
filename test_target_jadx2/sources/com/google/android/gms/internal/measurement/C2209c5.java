package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2209c5 extends AbstractC2275k {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V5 f24471c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2209c5(C2370u5 c2370u5, String str, V5 v52) {
        super("getValue");
        this.f24471c = v52;
        Objects.requireNonNull(c2370u5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    public final InterfaceC2329q b(Y1 y12, List list) {
        AbstractC2412z2.a("getValue", 2, list);
        InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
        InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(1));
        String a12 = this.f24471c.a(a10.a());
        return a12 != null ? new C2364u(a12) : a11;
    }
}
