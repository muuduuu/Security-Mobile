package com.google.android.gms.internal.measurement;

import co.hyperverge.hypersnapsdk.objects.HVError;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class J extends AbstractC2391x {
    protected J() {
        this.f24681a.add(N.FOR_IN);
        this.f24681a.add(N.FOR_IN_CONST);
        this.f24681a.add(N.FOR_IN_LET);
        this.f24681a.add(N.FOR_LET);
        this.f24681a.add(N.FOR_OF);
        this.f24681a.add(N.FOR_OF_CONST);
        this.f24681a.add(N.FOR_OF_LET);
        this.f24681a.add(N.WHILE);
    }

    private static InterfaceC2329q c(H h10, InterfaceC2329q interfaceC2329q, InterfaceC2329q interfaceC2329q2) {
        return e(h10, interfaceC2329q.h(), interfaceC2329q2);
    }

    private static InterfaceC2329q d(H h10, InterfaceC2329q interfaceC2329q, InterfaceC2329q interfaceC2329q2) {
        if (interfaceC2329q instanceof Iterable) {
            return e(h10, ((Iterable) interfaceC2329q).iterator(), interfaceC2329q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static InterfaceC2329q e(H h10, Iterator it, InterfaceC2329q interfaceC2329q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2329q b10 = h10.a((InterfaceC2329q) it.next()).b((C2230f) interfaceC2329q);
                if (b10 instanceof C2248h) {
                    C2248h c2248h = (C2248h) b10;
                    if ("break".equals(c2248h.c())) {
                        return InterfaceC2329q.f24620U;
                    }
                    if ("return".equals(c2248h.c())) {
                        return c2248h;
                    }
                }
            }
        }
        return InterfaceC2329q.f24620U;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02b0, code lost:
    
        if ("return".equals(r1.c()) != false) goto L70;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        C2248h c2248h;
        N n10 = N.ADD;
        int ordinal = AbstractC2412z2.e(str).ordinal();
        if (ordinal == 65) {
            AbstractC2412z2.a(N.WHILE.name(), 4, list);
            InterfaceC2329q interfaceC2329q = (InterfaceC2329q) list.get(0);
            InterfaceC2329q interfaceC2329q2 = (InterfaceC2329q) list.get(1);
            InterfaceC2329q interfaceC2329q3 = (InterfaceC2329q) list.get(2);
            InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(3));
            if (y12.a(interfaceC2329q3).g().booleanValue()) {
                InterfaceC2329q b10 = y12.b((C2230f) a10);
                if (b10 instanceof C2248h) {
                    c2248h = (C2248h) b10;
                    if ("break".equals(c2248h.c())) {
                        return InterfaceC2329q.f24620U;
                    }
                }
            }
            while (y12.a(interfaceC2329q).g().booleanValue()) {
                InterfaceC2329q b11 = y12.b((C2230f) a10);
                if (b11 instanceof C2248h) {
                    c2248h = (C2248h) b11;
                    if ("break".equals(c2248h.c())) {
                        return InterfaceC2329q.f24620U;
                    }
                    if ("return".equals(c2248h.c())) {
                        return c2248h;
                    }
                }
                y12.a(interfaceC2329q2);
            }
            return InterfaceC2329q.f24620U;
        }
        switch (ordinal) {
            case 26:
                AbstractC2412z2.a(N.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C2364u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new I(y12, ((InterfaceC2329q) list.get(0)).a()), y12.a((InterfaceC2329q) list.get(1)), y12.a((InterfaceC2329q) list.get(2)));
            case 27:
                AbstractC2412z2.a(N.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C2364u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new F(y12, ((InterfaceC2329q) list.get(0)).a()), y12.a((InterfaceC2329q) list.get(1)), y12.a((InterfaceC2329q) list.get(2)));
            case 28:
                AbstractC2412z2.a(N.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C2364u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new G(y12, ((InterfaceC2329q) list.get(0)).a()), y12.a((InterfaceC2329q) list.get(1)), y12.a((InterfaceC2329q) list.get(2)));
            case 29:
                AbstractC2412z2.a(N.FOR_LET.name(), 4, list);
                InterfaceC2329q a11 = y12.a((InterfaceC2329q) list.get(0));
                if (!(a11 instanceof C2230f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C2230f c2230f = (C2230f) a11;
                InterfaceC2329q interfaceC2329q4 = (InterfaceC2329q) list.get(1);
                InterfaceC2329q interfaceC2329q5 = (InterfaceC2329q) list.get(2);
                InterfaceC2329q a12 = y12.a((InterfaceC2329q) list.get(3));
                Y1 c10 = y12.c();
                for (int i10 = 0; i10 < c2230f.w(); i10++) {
                    String a13 = c2230f.B(i10).a();
                    c10.e(a13, y12.h(a13));
                }
                while (y12.a(interfaceC2329q4).g().booleanValue()) {
                    InterfaceC2329q b12 = y12.b((C2230f) a12);
                    if (b12 instanceof C2248h) {
                        C2248h c2248h2 = (C2248h) b12;
                        if ("break".equals(c2248h2.c())) {
                            return InterfaceC2329q.f24620U;
                        }
                        if ("return".equals(c2248h2.c())) {
                            return c2248h2;
                        }
                    }
                    Y1 c11 = y12.c();
                    for (int i11 = 0; i11 < c2230f.w(); i11++) {
                        String a14 = c2230f.B(i11).a();
                        c11.e(a14, c10.h(a14));
                    }
                    c11.a(interfaceC2329q5);
                    c10 = c11;
                }
                return InterfaceC2329q.f24620U;
            case 30:
                AbstractC2412z2.a(N.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C2364u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new I(y12, ((InterfaceC2329q) list.get(0)).a()), y12.a((InterfaceC2329q) list.get(1)), y12.a((InterfaceC2329q) list.get(2)));
            case HVError.INSTRUCTION_ERROR /* 31 */:
                AbstractC2412z2.a(N.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C2364u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new F(y12, ((InterfaceC2329q) list.get(0)).a()), y12.a((InterfaceC2329q) list.get(1)), y12.a((InterfaceC2329q) list.get(2)));
            case 32:
                AbstractC2412z2.a(N.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C2364u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new G(y12, ((InterfaceC2329q) list.get(0)).a()), y12.a((InterfaceC2329q) list.get(1)), y12.a((InterfaceC2329q) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
