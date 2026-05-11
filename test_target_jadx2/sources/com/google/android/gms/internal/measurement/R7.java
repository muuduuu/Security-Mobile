package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class R7 extends AbstractC2275k {

    /* renamed from: c, reason: collision with root package name */
    final boolean f24355c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f24356d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ S7 f24357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(S7 s72, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(s72);
        this.f24357e = s72;
        this.f24355c = z10;
        this.f24356d = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2329q b(Y1 y12, List list) {
        int i10;
        int i11;
        AbstractC2412z2.b("log", 1, list);
        if (list.size() == 1) {
            S7 s72 = this.f24357e;
            s72.i().a(3, y12.a((InterfaceC2329q) list.get(0)).a(), Collections.emptyList(), this.f24355c, this.f24356d);
            return InterfaceC2329q.f24620U;
        }
        int g10 = AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue());
        if (g10 != 2) {
            i10 = 3;
            if (g10 == 3) {
                i11 = 1;
            } else if (g10 == 5) {
                i11 = 5;
            } else if (g10 == 6) {
                i11 = 2;
            }
            String a10 = y12.a((InterfaceC2329q) list.get(1)).a();
            if (list.size() != 2) {
                S7 s73 = this.f24357e;
                s73.i().a(i11, a10, Collections.emptyList(), this.f24355c, this.f24356d);
                return InterfaceC2329q.f24620U;
            }
            ArrayList arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(y12.a((InterfaceC2329q) list.get(i12)).a());
            }
            this.f24357e.i().a(i11, a10, arrayList, this.f24355c, this.f24356d);
            return InterfaceC2329q.f24620U;
        }
        i10 = 4;
        i11 = i10;
        String a102 = y12.a((InterfaceC2329q) list.get(1)).a();
        if (list.size() != 2) {
        }
    }
}
