package yd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5202d {

    /* renamed from: a, reason: collision with root package name */
    public static final C5202d f45481a = new C5202d();

    private C5202d() {
    }

    private final boolean a(Ad.o oVar, Ad.j jVar, Ad.j jVar2) {
        if (oVar.s0(jVar) == oVar.s0(jVar2) && oVar.u(jVar) == oVar.u(jVar2)) {
            if ((oVar.Q(jVar) == null) == (oVar.Q(jVar2) == null) && oVar.h0(oVar.e(jVar), oVar.e(jVar2))) {
                if (oVar.G(jVar, jVar2)) {
                    return true;
                }
                int s02 = oVar.s0(jVar);
                for (int i10 = 0; i10 < s02; i10++) {
                    Ad.l s10 = oVar.s(jVar, i10);
                    Ad.l s11 = oVar.s(jVar2, i10);
                    if (oVar.E(s10) != oVar.E(s11)) {
                        return false;
                    }
                    if (!oVar.E(s10) && (oVar.r0(s10) != oVar.r0(s11) || !c(oVar, oVar.n0(s10), oVar.n0(s11)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(Ad.o oVar, Ad.i iVar, Ad.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        Ad.j b10 = oVar.b(iVar);
        Ad.j b11 = oVar.b(iVar2);
        if (b10 != null && b11 != null) {
            return a(oVar, b10, b11);
        }
        Ad.g i10 = oVar.i(iVar);
        Ad.g i11 = oVar.i(iVar2);
        if (i10 == null || i11 == null) {
            return false;
        }
        return a(oVar, oVar.g(i10), oVar.g(i11)) && a(oVar, oVar.f(i10), oVar.f(i11));
    }

    public final boolean b(Ad.o context, Ad.i a10, Ad.i b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return c(context, a10, b10);
    }
}
