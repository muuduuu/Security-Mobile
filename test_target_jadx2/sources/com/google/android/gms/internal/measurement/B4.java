package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class B4 extends C2302n {

    /* renamed from: b, reason: collision with root package name */
    private final C2203c f24196b;

    public B4(C2203c c2203c) {
        this.f24196b = c2203c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C2302n, com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            AbstractC2412z2.a("getEventName", 0, list);
            return new C2364u(this.f24196b.c().b());
        }
        if (c10 == 1) {
            AbstractC2412z2.a("getParamValue", 1, list);
            return AbstractC2189a3.a(this.f24196b.c().e(y12.a((InterfaceC2329q) list.get(0)).a()));
        }
        if (c10 == 2) {
            AbstractC2412z2.a("getParams", 0, list);
            Map f10 = this.f24196b.c().f();
            C2302n c2302n = new C2302n();
            for (String str2 : f10.keySet()) {
                c2302n.k(str2, AbstractC2189a3.a(f10.get(str2)));
            }
            return c2302n;
        }
        if (c10 == 3) {
            AbstractC2412z2.a("getTimestamp", 0, list);
            return new C2266j(Double.valueOf(this.f24196b.c().a()));
        }
        if (c10 != 4) {
            if (c10 != 5) {
                return super.m(str, y12, list);
            }
            AbstractC2412z2.a("setParamValue", 2, list);
            String a10 = y12.a((InterfaceC2329q) list.get(0)).a();
            InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(1));
            this.f24196b.c().d(a10, AbstractC2412z2.j(a11));
            return a11;
        }
        AbstractC2412z2.a("setEventName", 1, list);
        InterfaceC2329q a12 = y12.a((InterfaceC2329q) list.get(0));
        if (InterfaceC2329q.f24620U.equals(a12) || InterfaceC2329q.f24621V.equals(a12)) {
            throw new IllegalArgumentException("Illegal event name");
        }
        this.f24196b.c().c(a12.a());
        return new C2364u(a12.a());
    }
}
