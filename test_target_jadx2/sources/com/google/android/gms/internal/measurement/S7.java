package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class S7 extends AbstractC2275k {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2399x7 f24368c;

    public S7(InterfaceC2399x7 interfaceC2399x7) {
        super("internal.logger");
        this.f24368c = interfaceC2399x7;
        this.f24544b.put("log", new R7(this, false, true));
        this.f24544b.put("silent", new C2380v6(this, "silent"));
        ((AbstractC2275k) this.f24544b.get("silent")).k("log", new R7(this, true, true));
        this.f24544b.put("unmonitored", new W6(this, "unmonitored"));
        ((AbstractC2275k) this.f24544b.get("unmonitored")).k("log", new R7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    public final InterfaceC2329q b(Y1 y12, List list) {
        return InterfaceC2329q.f24620U;
    }

    final /* synthetic */ InterfaceC2399x7 i() {
        return this.f24368c;
    }
}
