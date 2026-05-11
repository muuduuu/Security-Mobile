package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2399x7;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class X2 implements InterfaceC2399x7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2656d3 f25729a;

    X2(C2656d3 c2656d3) {
        Objects.requireNonNull(c2656d3);
        this.f25729a = c2656d3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2399x7
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        A2 u10 = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.f25729a.f25694a.a().u() : z10 ? this.f25729a.f25694a.a().s() : !z11 ? this.f25729a.f25694a.a().t() : this.f25729a.f25694a.a().r() : this.f25729a.f25694a.a().w() : z10 ? this.f25729a.f25694a.a().p() : !z11 ? this.f25729a.f25694a.a().q() : this.f25729a.f25694a.a().o() : this.f25729a.f25694a.a().v();
        int size = list.size();
        if (size == 1) {
            u10.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            u10.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u10.a(str);
        } else {
            u10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
