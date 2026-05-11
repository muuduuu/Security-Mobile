package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class A extends AbstractC2391x {
    protected A() {
        this.f24681a.add(N.APPLY);
        this.f24681a.add(N.BLOCK);
        this.f24681a.add(N.BREAK);
        this.f24681a.add(N.CASE);
        this.f24681a.add(N.DEFAULT);
        this.f24681a.add(N.CONTINUE);
        this.f24681a.add(N.DEFINE_FUNCTION);
        this.f24681a.add(N.FN);
        this.f24681a.add(N.IF);
        this.f24681a.add(N.QUOTE);
        this.f24681a.add(N.RETURN);
        this.f24681a.add(N.SWITCH);
        this.f24681a.add(N.TERNARY);
    }

    private static InterfaceC2329q c(Y1 y12, List list) {
        AbstractC2412z2.b(N.FN.name(), 2, list);
        InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
        InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(1));
        if (!(a11 instanceof C2230f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", a11.getClass().getCanonicalName()));
        }
        List u10 = ((C2230f) a11).u();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C2320p(a10.a(), u10, arrayList, y12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        int ordinal = AbstractC2412z2.e(str).ordinal();
        if (ordinal == 2) {
            AbstractC2412z2.a(N.APPLY.name(), 3, list);
            InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
            String a11 = y12.a((InterfaceC2329q) list.get(1)).a();
            InterfaceC2329q a12 = y12.a((InterfaceC2329q) list.get(2));
            if (!(a12 instanceof C2230f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", a12.getClass().getCanonicalName()));
            }
            if (a11.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return a10.m(a11, y12, ((C2230f) a12).u());
        }
        if (ordinal == 15) {
            AbstractC2412z2.a(N.BREAK.name(), 0, list);
            return InterfaceC2329q.f24622W;
        }
        if (ordinal == 25) {
            return c(y12, list);
        }
        if (ordinal == 41) {
            AbstractC2412z2.b(N.IF.name(), 2, list);
            InterfaceC2329q a13 = y12.a((InterfaceC2329q) list.get(0));
            InterfaceC2329q a14 = y12.a((InterfaceC2329q) list.get(1));
            InterfaceC2329q a15 = list.size() > 2 ? y12.a((InterfaceC2329q) list.get(2)) : null;
            InterfaceC2329q interfaceC2329q = InterfaceC2329q.f24620U;
            InterfaceC2329q b10 = a13.g().booleanValue() ? y12.b((C2230f) a14) : a15 != null ? y12.b((C2230f) a15) : interfaceC2329q;
            return true != (b10 instanceof C2248h) ? interfaceC2329q : b10;
        }
        if (ordinal == 54) {
            return new C2230f(list);
        }
        if (ordinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC2329q.f24624b0;
            }
            AbstractC2412z2.a(N.RETURN.name(), 1, list);
            return new C2248h("return", y12.a((InterfaceC2329q) list.get(0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                AbstractC2412z2.b(N.DEFINE_FUNCTION.name(), 2, list);
                C2320p c2320p = (C2320p) c(y12, list);
                if (c2320p.d() == null) {
                    y12.e(BuildConfig.FLAVOR, c2320p);
                    return c2320p;
                }
                y12.e(c2320p.d(), c2320p);
                return c2320p;
            }
            if (ordinal == 60) {
                AbstractC2412z2.a(N.SWITCH.name(), 3, list);
                InterfaceC2329q a16 = y12.a((InterfaceC2329q) list.get(0));
                InterfaceC2329q a17 = y12.a((InterfaceC2329q) list.get(1));
                InterfaceC2329q a18 = y12.a((InterfaceC2329q) list.get(2));
                if (!(a17 instanceof C2230f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(a18 instanceof C2230f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C2230f c2230f = (C2230f) a17;
                C2230f c2230f2 = (C2230f) a18;
                boolean z10 = false;
                for (int i10 = 0; i10 < c2230f.w(); i10++) {
                    if (z10 || a16.equals(y12.a(c2230f.B(i10)))) {
                        InterfaceC2329q a19 = y12.a(c2230f2.B(i10));
                        if (a19 instanceof C2248h) {
                            return ((C2248h) a19).c().equals("break") ? InterfaceC2329q.f24620U : a19;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c2230f.w() + 1 == c2230f2.w()) {
                    InterfaceC2329q a20 = y12.a(c2230f2.B(c2230f.w()));
                    if (a20 instanceof C2248h) {
                        String c10 = ((C2248h) a20).c();
                        if (c10.equals("return") || c10.equals("continue")) {
                            return a20;
                        }
                    }
                }
                return InterfaceC2329q.f24620U;
            }
            if (ordinal == 61) {
                AbstractC2412z2.a(N.TERNARY.name(), 3, list);
                return y12.a((InterfaceC2329q) list.get(0)).g().booleanValue() ? y12.a((InterfaceC2329q) list.get(1)) : y12.a((InterfaceC2329q) list.get(2));
            }
            switch (ordinal) {
                case 11:
                    return y12.c().b(new C2230f(list));
                case 12:
                    AbstractC2412z2.a(N.BREAK.name(), 0, list);
                    return InterfaceC2329q.f24623a0;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC2329q.f24620U;
        }
        InterfaceC2329q a21 = y12.a((InterfaceC2329q) list.get(0));
        return a21 instanceof C2230f ? y12.b((C2230f) a21) : InterfaceC2329q.f24620U;
    }
}
