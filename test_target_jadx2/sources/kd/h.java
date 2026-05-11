package kd;

import Kc.C0953z;
import Kc.H;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.U;
import Kc.V;
import Kc.h0;
import Kc.k0;
import id.C3367b;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.M;
import yd.n0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final id.c f36292a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3367b f36293b;

    static {
        id.c cVar = new id.c("kotlin.jvm.JvmInline");
        f36292a = cVar;
        C3367b m10 = C3367b.m(cVar);
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        f36293b = m10;
    }

    public static final boolean a(InterfaceC0929a interfaceC0929a) {
        Intrinsics.checkNotNullParameter(interfaceC0929a, "<this>");
        if (interfaceC0929a instanceof V) {
            U J02 = ((V) interfaceC0929a).J0();
            Intrinsics.checkNotNullExpressionValue(J02, "getCorrespondingProperty(...)");
            if (f(J02)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return (interfaceC0941m instanceof InterfaceC0933e) && (((InterfaceC0933e) interfaceC0941m).H0() instanceof C0953z);
    }

    public static final boolean c(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 != null) {
            return b(d10);
        }
        return false;
    }

    public static final boolean d(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return (interfaceC0941m instanceof InterfaceC0933e) && (((InterfaceC0933e) interfaceC0941m).H0() instanceof H);
    }

    public static final boolean e(k0 k0Var) {
        C0953z n10;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        if (k0Var.s0() == null) {
            InterfaceC0941m b10 = k0Var.b();
            id.f fVar = null;
            InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
            if (interfaceC0933e != null && (n10 = AbstractC3778c.n(interfaceC0933e)) != null) {
                fVar = n10.d();
            }
            if (Intrinsics.b(fVar, k0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(k0 k0Var) {
        h0 H02;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        if (k0Var.s0() == null) {
            InterfaceC0941m b10 = k0Var.b();
            InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
            if (interfaceC0933e != null && (H02 = interfaceC0933e.H0()) != null) {
                id.f name = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (H02.a(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return b(interfaceC0941m) || d(interfaceC0941m);
    }

    public static final boolean h(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 != null) {
            return g(d10);
        }
        return false;
    }

    public static final boolean i(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        return (d10 == null || !d(d10) || kotlin.reflect.jvm.internal.impl.types.checker.o.f36699a.z0(abstractC5197E)) ? false : true;
    }

    public static final AbstractC5197E j(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        AbstractC5197E k10 = k(abstractC5197E);
        if (k10 != null) {
            return n0.f(abstractC5197E).p(k10, u0.INVARIANT);
        }
        return null;
    }

    public static final AbstractC5197E k(AbstractC5197E abstractC5197E) {
        C0953z n10;
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
        if (interfaceC0933e == null || (n10 = AbstractC3778c.n(interfaceC0933e)) == null) {
            return null;
        }
        return (M) n10.e();
    }
}
