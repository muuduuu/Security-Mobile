package com.google.android.gms.internal.measurement;

import co.hyperverge.hypersnapsdk.objects.HVError;
import java.util.List;

/* loaded from: classes2.dex */
public final class K extends AbstractC2391x {
    protected K() {
        this.f24681a.add(N.ADD);
        this.f24681a.add(N.DIVIDE);
        this.f24681a.add(N.MODULUS);
        this.f24681a.add(N.MULTIPLY);
        this.f24681a.add(N.NEGATE);
        this.f24681a.add(N.POST_DECREMENT);
        this.f24681a.add(N.POST_INCREMENT);
        this.f24681a.add(N.PRE_DECREMENT);
        this.f24681a.add(N.PRE_INCREMENT);
        this.f24681a.add(N.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        int ordinal = AbstractC2412z2.e(str).ordinal();
        if (ordinal == 0) {
            AbstractC2412z2.a(N.ADD.name(), 2, list);
            InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
            InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(1));
            if (!(a10 instanceof InterfaceC2293m) && !(a10 instanceof C2364u) && !(a11 instanceof InterfaceC2293m) && !(a11 instanceof C2364u)) {
                return new C2266j(Double.valueOf(a10.f().doubleValue() + a11.f().doubleValue()));
            }
            return new C2364u(String.valueOf(a10.a()).concat(String.valueOf(a11.a())));
        }
        if (ordinal == 21) {
            AbstractC2412z2.a(N.DIVIDE.name(), 2, list);
            return new C2266j(Double.valueOf(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue() / y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()));
        }
        if (ordinal == 59) {
            AbstractC2412z2.a(N.SUBTRACT.name(), 2, list);
            return new C2266j(Double.valueOf(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue() + new C2266j(Double.valueOf(-y12.a((InterfaceC2329q) list.get(1)).f().doubleValue())).f().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            AbstractC2412z2.a(str, 2, list);
            InterfaceC2329q a12 = y12.a((InterfaceC2329q) list.get(0));
            y12.a((InterfaceC2329q) list.get(1));
            return a12;
        }
        if (ordinal == 55 || ordinal == 56) {
            AbstractC2412z2.a(str, 1, list);
            return y12.a((InterfaceC2329q) list.get(0));
        }
        switch (ordinal) {
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                AbstractC2412z2.a(N.MODULUS.name(), 2, list);
                return new C2266j(Double.valueOf(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue() % y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()));
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                AbstractC2412z2.a(N.MULTIPLY.name(), 2, list);
                return new C2266j(Double.valueOf(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue() * y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()));
            case 46:
                AbstractC2412z2.a(N.NEGATE.name(), 1, list);
                return new C2266j(Double.valueOf(-y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
