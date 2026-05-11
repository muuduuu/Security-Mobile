package com.google.android.gms.internal.measurement;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class D {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.google.android.gms.internal.measurement.q] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String] */
    public static InterfaceC2329q a(String str, C2230f c2230f, Y1 y12, List list) {
        String str2;
        char c10;
        InterfaceC2329q interfaceC2329q;
        double d10;
        String str3;
        double d11;
        double d12;
        C2230f c2230f2;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 0;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c10 = 2;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    str2 = "toString";
                    c10 = 3;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        AbstractC2275k abstractC2275k = null;
        switch (c10) {
            case 0:
                interfaceC2329q = (C2230f) c2230f.j();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2329q a10 = y12.a((InterfaceC2329q) it.next());
                        if (a10 instanceof C2248h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int w10 = interfaceC2329q.w();
                        if (a10 instanceof C2230f) {
                            C2230f c2230f3 = (C2230f) a10;
                            Iterator v10 = c2230f3.v();
                            while (v10.hasNext()) {
                                Integer num = (Integer) v10.next();
                                interfaceC2329q.D(num.intValue() + w10, c2230f3.B(num.intValue()));
                            }
                        } else {
                            interfaceC2329q.D(w10, a10);
                        }
                    }
                }
                return interfaceC2329q;
            case 1:
                AbstractC2412z2.a("every", 1, list);
                InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(0));
                if (a11 instanceof C2320p) {
                    return c2230f.w() == 0 ? InterfaceC2329q.f24625c0 : c(c2230f, y12, (C2320p) a11, Boolean.FALSE, Boolean.TRUE).w() != c2230f.w() ? InterfaceC2329q.f24626d0 : InterfaceC2329q.f24625c0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                AbstractC2412z2.a("filter", 1, list);
                InterfaceC2329q a12 = y12.a((InterfaceC2329q) list.get(0));
                if (!(a12 instanceof C2320p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c2230f.A() == 0) {
                    return new C2230f();
                }
                C2230f c2230f4 = (C2230f) c2230f.j();
                C2230f c11 = c(c2230f, y12, (C2320p) a12, null, Boolean.TRUE);
                interfaceC2329q = new C2230f();
                Iterator v11 = c11.v();
                while (v11.hasNext()) {
                    interfaceC2329q.D(interfaceC2329q.w(), c2230f4.B(((Integer) v11.next()).intValue()));
                }
                return interfaceC2329q;
            case 3:
                AbstractC2412z2.a("forEach", 1, list);
                InterfaceC2329q a13 = y12.a((InterfaceC2329q) list.get(0));
                if (!(a13 instanceof C2320p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c2230f.A() == 0) {
                    return InterfaceC2329q.f24620U;
                }
                c(c2230f, y12, (C2320p) a13, null, null);
                return InterfaceC2329q.f24620U;
            case 4:
                AbstractC2412z2.c("indexOf", 2, list);
                InterfaceC2329q interfaceC2329q2 = InterfaceC2329q.f24620U;
                if (!list.isEmpty()) {
                    interfaceC2329q2 = y12.a((InterfaceC2329q) list.get(0));
                }
                if (list.size() > 1) {
                    d10 = AbstractC2412z2.i(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue());
                    if (d10 >= c2230f.w()) {
                        return new C2266j(Double.valueOf(-1.0d));
                    }
                    if (d10 < 0.0d) {
                        d10 += c2230f.w();
                    }
                } else {
                    d10 = 0.0d;
                }
                Iterator v12 = c2230f.v();
                while (v12.hasNext()) {
                    int intValue = ((Integer) v12.next()).intValue();
                    double d13 = intValue;
                    if (d13 >= d10 && AbstractC2412z2.f(c2230f.B(intValue), interfaceC2329q2)) {
                        return new C2266j(Double.valueOf(d13));
                    }
                }
                return new C2266j(Double.valueOf(-1.0d));
            case 5:
                AbstractC2412z2.c("join", 1, list);
                if (c2230f.w() == 0) {
                    return InterfaceC2329q.f24627e0;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    InterfaceC2329q a14 = y12.a((InterfaceC2329q) list.get(0));
                    str3 = ((a14 instanceof C2311o) || (a14 instanceof C2373v)) ? BuildConfig.FLAVOR : a14.a();
                }
                return new C2364u(c2230f.J(str3));
            case 6:
                AbstractC2412z2.c("lastIndexOf", 2, list);
                InterfaceC2329q interfaceC2329q3 = InterfaceC2329q.f24620U;
                if (!list.isEmpty()) {
                    interfaceC2329q3 = y12.a((InterfaceC2329q) list.get(0));
                }
                int w11 = c2230f.w() - 1;
                if (list.size() > 1) {
                    InterfaceC2329q a15 = y12.a((InterfaceC2329q) list.get(1));
                    d12 = Double.isNaN(a15.f().doubleValue()) ? c2230f.w() - 1 : AbstractC2412z2.i(a15.f().doubleValue());
                    d11 = 0.0d;
                    if (d12 < 0.0d) {
                        d12 += c2230f.w();
                    }
                } else {
                    d11 = 0.0d;
                    d12 = w11;
                }
                if (d12 < d11) {
                    return new C2266j(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(c2230f.w(), d12); min >= 0; min--) {
                    if (c2230f.E(min) && AbstractC2412z2.f(c2230f.B(min), interfaceC2329q3)) {
                        return new C2266j(Double.valueOf(min));
                    }
                }
                return new C2266j(Double.valueOf(-1.0d));
            case 7:
                AbstractC2412z2.a("map", 1, list);
                InterfaceC2329q a16 = y12.a((InterfaceC2329q) list.get(0));
                if (a16 instanceof C2320p) {
                    return c2230f.w() == 0 ? new C2230f() : c(c2230f, y12, (C2320p) a16, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                AbstractC2412z2.a("pop", 0, list);
                int w12 = c2230f.w();
                if (w12 == 0) {
                    return InterfaceC2329q.f24620U;
                }
                int i10 = w12 - 1;
                interfaceC2329q = c2230f.B(i10);
                c2230f.I(i10);
                return interfaceC2329q;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c2230f.D(c2230f.w(), y12.a((InterfaceC2329q) it2.next()));
                    }
                }
                return new C2266j(Double.valueOf(c2230f.w()));
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return b(c2230f, y12, list, true);
            case 11:
                return b(c2230f, y12, list, false);
            case '\f':
                c2230f2 = c2230f;
                AbstractC2412z2.a("reverse", 0, list);
                int w13 = c2230f.w();
                if (w13 != 0) {
                    for (int i11 = 0; i11 < w13 / 2; i11++) {
                        if (c2230f2.E(i11)) {
                            InterfaceC2329q B10 = c2230f2.B(i11);
                            c2230f2.D(i11, null);
                            int i12 = (w13 - 1) - i11;
                            if (c2230f2.E(i12)) {
                                c2230f2.D(i11, c2230f2.B(i12));
                            }
                            c2230f2.D(i12, B10);
                        }
                    }
                }
                return c2230f2;
            case '\r':
                AbstractC2412z2.a("shift", 0, list);
                if (c2230f.w() == 0) {
                    return InterfaceC2329q.f24620U;
                }
                InterfaceC2329q B11 = c2230f.B(0);
                c2230f.I(0);
                return B11;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                AbstractC2412z2.c("slice", 2, list);
                if (list.isEmpty()) {
                    return c2230f.j();
                }
                double w14 = c2230f.w();
                double i13 = AbstractC2412z2.i(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue());
                double max = i13 < 0.0d ? Math.max(i13 + w14, 0.0d) : Math.min(i13, w14);
                if (list.size() == 2) {
                    double i14 = AbstractC2412z2.i(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue());
                    w14 = i14 < 0.0d ? Math.max(w14 + i14, 0.0d) : Math.min(w14, i14);
                }
                C2230f c2230f5 = new C2230f();
                for (int i15 = (int) max; i15 < w14; i15++) {
                    c2230f5.D(c2230f5.w(), c2230f.B(i15));
                }
                return c2230f5;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                AbstractC2412z2.a("some", 1, list);
                InterfaceC2329q a17 = y12.a((InterfaceC2329q) list.get(0));
                if (!(a17 instanceof AbstractC2275k)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c2230f.w() == 0) {
                    return InterfaceC2329q.f24626d0;
                }
                AbstractC2275k abstractC2275k2 = (AbstractC2275k) a17;
                Iterator v13 = c2230f.v();
                while (v13.hasNext()) {
                    int intValue2 = ((Integer) v13.next()).intValue();
                    if (c2230f.E(intValue2) && abstractC2275k2.b(y12, Arrays.asList(c2230f.B(intValue2), new C2266j(Double.valueOf(intValue2)), c2230f)).g().booleanValue()) {
                        return InterfaceC2329q.f24625c0;
                    }
                }
                return InterfaceC2329q.f24626d0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                c2230f2 = c2230f;
                AbstractC2412z2.c("sort", 1, list);
                if (c2230f.w() >= 2) {
                    List u10 = c2230f.u();
                    if (!list.isEmpty()) {
                        InterfaceC2329q a18 = y12.a((InterfaceC2329q) list.get(0));
                        if (!(a18 instanceof AbstractC2275k)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC2275k = (AbstractC2275k) a18;
                    }
                    Collections.sort(u10, new B(abstractC2275k, y12));
                    c2230f.F();
                    Iterator it3 = u10.iterator();
                    int i16 = 0;
                    while (it3.hasNext()) {
                        c2230f2.D(i16, (InterfaceC2329q) it3.next());
                        i16++;
                    }
                }
                return c2230f2;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                if (list.isEmpty()) {
                    return new C2230f();
                }
                int i17 = (int) AbstractC2412z2.i(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue());
                if (i17 < 0) {
                    i17 = Math.max(0, i17 + c2230f.w());
                } else if (i17 > c2230f.w()) {
                    i17 = c2230f.w();
                }
                int w15 = c2230f.w();
                C2230f c2230f6 = new C2230f();
                if (list.size() > 1) {
                    int max2 = Math.max(0, (int) AbstractC2412z2.i(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()));
                    if (max2 > 0) {
                        for (int i18 = i17; i18 < Math.min(w15, i17 + max2); i18++) {
                            c2230f6.D(c2230f6.w(), c2230f.B(i17));
                            c2230f.I(i17);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i19 = 2; i19 < list.size(); i19++) {
                            InterfaceC2329q a19 = y12.a((InterfaceC2329q) list.get(i19));
                            if (a19 instanceof C2248h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            c2230f.G((i17 + i19) - 2, a19);
                        }
                    }
                } else {
                    while (i17 < w15) {
                        c2230f6.D(c2230f6.w(), c2230f.B(i17));
                        c2230f.D(i17, null);
                        i17++;
                    }
                }
                return c2230f6;
            case 18:
                AbstractC2412z2.a(str2, 0, list);
                return new C2364u(c2230f.J(","));
            case 19:
                if (!list.isEmpty()) {
                    C2230f c2230f7 = new C2230f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        InterfaceC2329q a20 = y12.a((InterfaceC2329q) it4.next());
                        if (a20 instanceof C2248h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c2230f7.D(c2230f7.w(), a20);
                    }
                    int w16 = c2230f7.w();
                    Iterator v14 = c2230f.v();
                    while (v14.hasNext()) {
                        Integer num2 = (Integer) v14.next();
                        c2230f7.D(num2.intValue() + w16, c2230f.B(num2.intValue()));
                    }
                    c2230f.F();
                    Iterator v15 = c2230f7.v();
                    while (v15.hasNext()) {
                        Integer num3 = (Integer) v15.next();
                        c2230f.D(num3.intValue(), c2230f7.B(num3.intValue()));
                    }
                }
                return new C2266j(Double.valueOf(c2230f.w()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static InterfaceC2329q b(C2230f c2230f, Y1 y12, List list, boolean z10) {
        InterfaceC2329q interfaceC2329q;
        AbstractC2412z2.b("reduce", 1, list);
        AbstractC2412z2.c("reduce", 2, list);
        InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
        if (!(a10 instanceof AbstractC2275k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC2329q = y12.a((InterfaceC2329q) list.get(1));
            if (interfaceC2329q instanceof C2248h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c2230f.w() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC2329q = null;
        }
        AbstractC2275k abstractC2275k = (AbstractC2275k) a10;
        int w10 = c2230f.w();
        int i10 = z10 ? 0 : w10 - 1;
        int i11 = z10 ? w10 - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (interfaceC2329q == null) {
            interfaceC2329q = c2230f.B(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c2230f.E(i10)) {
                interfaceC2329q = abstractC2275k.b(y12, Arrays.asList(interfaceC2329q, c2230f.B(i10), new C2266j(Double.valueOf(i10)), c2230f));
                if (interfaceC2329q instanceof C2248h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC2329q;
    }

    private static C2230f c(C2230f c2230f, Y1 y12, AbstractC2275k abstractC2275k, Boolean bool, Boolean bool2) {
        C2230f c2230f2 = new C2230f();
        Iterator v10 = c2230f.v();
        while (v10.hasNext()) {
            int intValue = ((Integer) v10.next()).intValue();
            if (c2230f.E(intValue)) {
                InterfaceC2329q b10 = abstractC2275k.b(y12, Arrays.asList(c2230f.B(intValue), new C2266j(Double.valueOf(intValue)), c2230f));
                if (b10.g().equals(bool)) {
                    break;
                }
                if (bool2 == null || b10.g().equals(bool2)) {
                    c2230f2.D(intValue, b10);
                }
            }
        }
        return c2230f2;
    }
}
