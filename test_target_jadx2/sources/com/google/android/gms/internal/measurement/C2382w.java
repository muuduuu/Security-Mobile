package com.google.android.gms.internal.measurement;

import com.appsflyer.attribution.RequestError;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2382w extends AbstractC2391x {
    public C2382w() {
        this.f24681a.add(N.BITWISE_AND);
        this.f24681a.add(N.BITWISE_LEFT_SHIFT);
        this.f24681a.add(N.BITWISE_NOT);
        this.f24681a.add(N.BITWISE_OR);
        this.f24681a.add(N.BITWISE_RIGHT_SHIFT);
        this.f24681a.add(N.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f24681a.add(N.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        C2266j c2266j;
        N n10 = N.ADD;
        switch (AbstractC2412z2.e(str).ordinal()) {
            case 4:
                AbstractC2412z2.a(N.BITWISE_AND.name(), 2, list);
                c2266j = new C2266j(Double.valueOf(AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()) & AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue())));
                break;
            case 5:
                AbstractC2412z2.a(N.BITWISE_LEFT_SHIFT.name(), 2, list);
                c2266j = new C2266j(Double.valueOf(AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()) << ((int) (AbstractC2412z2.h(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()) & 31))));
                break;
            case 6:
                AbstractC2412z2.a(N.BITWISE_NOT.name(), 1, list);
                c2266j = new C2266j(Double.valueOf(~AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue())));
                break;
            case 7:
                AbstractC2412z2.a(N.BITWISE_OR.name(), 2, list);
                c2266j = new C2266j(Double.valueOf(AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()) | AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue())));
                break;
            case 8:
                AbstractC2412z2.a(N.BITWISE_RIGHT_SHIFT.name(), 2, list);
                c2266j = new C2266j(Double.valueOf(AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()) >> ((int) (AbstractC2412z2.h(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()) & 31))));
                break;
            case 9:
                AbstractC2412z2.a(N.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                c2266j = new C2266j(Double.valueOf(AbstractC2412z2.h(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()) >>> ((int) (AbstractC2412z2.h(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()) & 31))));
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                AbstractC2412z2.a(N.BITWISE_XOR.name(), 2, list);
                c2266j = new C2266j(Double.valueOf(AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()) ^ AbstractC2412z2.g(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue())));
                break;
            default:
                return super.b(str);
        }
        return c2266j;
    }
}
