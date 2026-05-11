package yd;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.d0;

/* renamed from: yd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5201c {

    /* renamed from: a, reason: collision with root package name */
    public static final C5201c f45480a = new C5201c();

    private C5201c() {
    }

    private final boolean c(d0 d0Var, Ad.j jVar, Ad.m mVar) {
        Ad.o j10 = d0Var.j();
        if (j10.Z(jVar)) {
            return true;
        }
        if (j10.u(jVar)) {
            return false;
        }
        if (d0Var.n() && j10.f0(jVar)) {
            return true;
        }
        return j10.h0(j10.e(jVar), mVar);
    }

    private final boolean e(d0 d0Var, Ad.j jVar, Ad.j jVar2) {
        Ad.o j10 = d0Var.j();
        if (C5203e.f45497b) {
            if (!j10.d(jVar) && !j10.C(j10.e(jVar))) {
                d0Var.l(jVar);
            }
            if (!j10.d(jVar2)) {
                d0Var.l(jVar2);
            }
        }
        if (j10.u(jVar2) || j10.N(jVar) || j10.b0(jVar)) {
            return true;
        }
        if ((jVar instanceof Ad.d) && j10.l((Ad.d) jVar)) {
            return true;
        }
        C5201c c5201c = f45480a;
        if (c5201c.a(d0Var, jVar, d0.c.b.f45493a)) {
            return true;
        }
        if (j10.N(jVar2) || c5201c.a(d0Var, jVar2, d0.c.d.f45495a) || j10.w0(jVar)) {
            return false;
        }
        return c5201c.b(d0Var, jVar, j10.e(jVar2));
    }

    public final boolean a(d0 d0Var, Ad.j type, d0.c supertypesPolicy) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        Ad.o j10 = d0Var.j();
        if ((j10.w0(type) && !j10.u(type)) || j10.N(type)) {
            return true;
        }
        d0Var.k();
        ArrayDeque h10 = d0Var.h();
        Intrinsics.d(h10);
        Set i10 = d0Var.i();
        Intrinsics.d(i10);
        h10.push(type);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + CollectionsKt.l0(i10, null, null, null, 0, null, null, 63, null)).toString());
            }
            Ad.j jVar = (Ad.j) h10.pop();
            Intrinsics.d(jVar);
            if (i10.add(jVar)) {
                d0.c cVar = j10.u(jVar) ? d0.c.C0667c.f45494a : supertypesPolicy;
                if (Intrinsics.b(cVar, d0.c.C0667c.f45494a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Ad.o j11 = d0Var.j();
                    Iterator it = j11.q(j11.e(jVar)).iterator();
                    while (it.hasNext()) {
                        Ad.j a10 = cVar.a(d0Var, (Ad.i) it.next());
                        if ((j10.w0(a10) && !j10.u(a10)) || j10.N(a10)) {
                            d0Var.e();
                            return true;
                        }
                        h10.add(a10);
                    }
                }
            }
        }
        d0Var.e();
        return false;
    }

    public final boolean b(d0 state, Ad.j start, Ad.m end) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Ad.o j10 = state.j();
        if (f45480a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque h10 = state.h();
        Intrinsics.d(h10);
        Set i10 = state.i();
        Intrinsics.d(i10);
        h10.push(start);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + CollectionsKt.l0(i10, null, null, null, 0, null, null, 63, null)).toString());
            }
            Ad.j jVar = (Ad.j) h10.pop();
            Intrinsics.d(jVar);
            if (i10.add(jVar)) {
                d0.c cVar = j10.u(jVar) ? d0.c.C0667c.f45494a : d0.c.b.f45493a;
                if (Intrinsics.b(cVar, d0.c.C0667c.f45494a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Ad.o j11 = state.j();
                    Iterator it = j11.q(j11.e(jVar)).iterator();
                    while (it.hasNext()) {
                        Ad.j a10 = cVar.a(state, (Ad.i) it.next());
                        if (f45480a.c(state, a10, end)) {
                            state.e();
                            return true;
                        }
                        h10.add(a10);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean d(d0 state, Ad.j subType, Ad.j superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return e(state, subType, superType);
    }
}
