package Jd;

import Od.C1080h;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import lc.o;

/* renamed from: Jd.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0872a0 {
    public static final void a(Z z10, int i10) {
        kotlin.coroutines.d e10 = z10.e();
        boolean z11 = i10 == 4;
        if (z11 || !(e10 instanceof C1080h) || b(i10) != b(z10.f5021c)) {
            d(z10, e10, z11);
            return;
        }
        C1080h c1080h = (C1080h) e10;
        J j10 = c1080h.f7321d;
        CoroutineContext context = c1080h.getContext();
        if (j10.y(context)) {
            j10.s(context, z10);
        } else {
            e(z10);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(Z z10, kotlin.coroutines.d dVar, boolean z11) {
        Object g10;
        Object j10 = z10.j();
        Throwable f10 = z10.f(j10);
        if (f10 != null) {
            o.a aVar = lc.o.f37128b;
            g10 = lc.p.a(f10);
        } else {
            o.a aVar2 = lc.o.f37128b;
            g10 = z10.g(j10);
        }
        Object b10 = lc.o.b(g10);
        if (!z11) {
            dVar.resumeWith(b10);
            return;
        }
        Intrinsics.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1080h c1080h = (C1080h) dVar;
        kotlin.coroutines.d dVar2 = c1080h.f7322e;
        Object obj = c1080h.f7324g;
        CoroutineContext context = dVar2.getContext();
        Object i10 = Od.K.i(context, obj);
        T0 m10 = i10 != Od.K.f7306a ? H.m(dVar2, context, i10) : null;
        try {
            c1080h.f7322e.resumeWith(b10);
            Unit unit = Unit.f36324a;
        } finally {
            if (m10 == null || m10.V0()) {
                Od.K.f(context, i10);
            }
        }
    }

    private static final void e(Z z10) {
        AbstractC0882f0 b10 = Q0.f5006a.b();
        if (b10.i1()) {
            b10.O0(z10);
            return;
        }
        b10.a1(true);
        try {
            d(z10, z10.e(), true);
            do {
            } while (b10.o1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
