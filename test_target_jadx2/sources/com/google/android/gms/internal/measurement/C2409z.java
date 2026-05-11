package com.google.android.gms.internal.measurement;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2409z extends AbstractC2391x {
    public C2409z() {
        this.f24681a.add(N.EQUALS);
        this.f24681a.add(N.GREATER_THAN);
        this.f24681a.add(N.GREATER_THAN_EQUALS);
        this.f24681a.add(N.IDENTITY_EQUALS);
        this.f24681a.add(N.IDENTITY_NOT_EQUALS);
        this.f24681a.add(N.LESS_THAN);
        this.f24681a.add(N.LESS_THAN_EQUALS);
        this.f24681a.add(N.NOT_EQUALS);
    }

    private static boolean c(InterfaceC2329q interfaceC2329q, InterfaceC2329q interfaceC2329q2) {
        if (interfaceC2329q instanceof InterfaceC2293m) {
            interfaceC2329q = new C2364u(interfaceC2329q.a());
        }
        if (interfaceC2329q2 instanceof InterfaceC2293m) {
            interfaceC2329q2 = new C2364u(interfaceC2329q2.a());
        }
        if ((interfaceC2329q instanceof C2364u) && (interfaceC2329q2 instanceof C2364u)) {
            return interfaceC2329q.a().compareTo(interfaceC2329q2.a()) < 0;
        }
        double doubleValue = interfaceC2329q.f().doubleValue();
        double doubleValue2 = interfaceC2329q2.f().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean d(InterfaceC2329q interfaceC2329q, InterfaceC2329q interfaceC2329q2) {
        if (interfaceC2329q.getClass().equals(interfaceC2329q2.getClass())) {
            if ((interfaceC2329q instanceof C2373v) || (interfaceC2329q instanceof C2311o)) {
                return true;
            }
            return interfaceC2329q instanceof C2266j ? (Double.isNaN(interfaceC2329q.f().doubleValue()) || Double.isNaN(interfaceC2329q2.f().doubleValue()) || interfaceC2329q.f().doubleValue() != interfaceC2329q2.f().doubleValue()) ? false : true : interfaceC2329q instanceof C2364u ? interfaceC2329q.a().equals(interfaceC2329q2.a()) : interfaceC2329q instanceof C2239g ? interfaceC2329q.g().equals(interfaceC2329q2.g()) : interfaceC2329q == interfaceC2329q2;
        }
        if (((interfaceC2329q instanceof C2373v) || (interfaceC2329q instanceof C2311o)) && ((interfaceC2329q2 instanceof C2373v) || (interfaceC2329q2 instanceof C2311o))) {
            return true;
        }
        boolean z10 = interfaceC2329q instanceof C2266j;
        if (z10 && (interfaceC2329q2 instanceof C2364u)) {
            return d(interfaceC2329q, new C2266j(interfaceC2329q2.f()));
        }
        boolean z11 = interfaceC2329q instanceof C2364u;
        if (z11 && (interfaceC2329q2 instanceof C2266j)) {
            return d(new C2266j(interfaceC2329q.f()), interfaceC2329q2);
        }
        if (interfaceC2329q instanceof C2239g) {
            return d(new C2266j(interfaceC2329q.f()), interfaceC2329q2);
        }
        if (interfaceC2329q2 instanceof C2239g) {
            return d(interfaceC2329q, new C2266j(interfaceC2329q2.f()));
        }
        if ((z11 || z10) && (interfaceC2329q2 instanceof InterfaceC2293m)) {
            return d(interfaceC2329q, new C2364u(interfaceC2329q2.a()));
        }
        if ((interfaceC2329q instanceof InterfaceC2293m) && ((interfaceC2329q2 instanceof C2364u) || (interfaceC2329q2 instanceof C2266j))) {
            return d(new C2364u(interfaceC2329q.a()), interfaceC2329q2);
        }
        return false;
    }

    private static boolean e(InterfaceC2329q interfaceC2329q, InterfaceC2329q interfaceC2329q2) {
        if (interfaceC2329q instanceof InterfaceC2293m) {
            interfaceC2329q = new C2364u(interfaceC2329q.a());
        }
        if (interfaceC2329q2 instanceof InterfaceC2293m) {
            interfaceC2329q2 = new C2364u(interfaceC2329q2.a());
        }
        return (((interfaceC2329q instanceof C2364u) && (interfaceC2329q2 instanceof C2364u)) || !(Double.isNaN(interfaceC2329q.f().doubleValue()) || Double.isNaN(interfaceC2329q2.f().doubleValue()))) && !c(interfaceC2329q2, interfaceC2329q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        boolean d10;
        boolean d11;
        AbstractC2412z2.a(AbstractC2412z2.e(str).name(), 2, list);
        InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
        InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(1));
        int ordinal = AbstractC2412z2.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                d11 = d(a10, a11);
            } else if (ordinal == 42) {
                d10 = c(a10, a11);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        d10 = c(a11, a10);
                        break;
                    case 38:
                        d10 = e(a11, a10);
                        break;
                    case 39:
                        d10 = AbstractC2412z2.f(a10, a11);
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        d11 = AbstractC2412z2.f(a10, a11);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                d10 = e(a10, a11);
            }
            d10 = !d11;
        } else {
            d10 = d(a10, a11);
        }
        return d10 ? InterfaceC2329q.f24625c0 : InterfaceC2329q.f24626d0;
    }
}
