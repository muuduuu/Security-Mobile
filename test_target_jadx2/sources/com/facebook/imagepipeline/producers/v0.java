package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f21042a = new v0();

    private v0() {
    }

    public static final int a(int i10) {
        return (int) (i10 * 1.3333334f);
    }

    public static final boolean b(int i10, int i11, a4.f fVar) {
        if (fVar == null) {
            if (a(i10) < 2048.0f || a(i11) < 2048) {
                return false;
            }
        } else if (a(i10) < fVar.f12599a || a(i11) < fVar.f12600b) {
            return false;
        }
        return true;
    }

    public static final boolean c(g4.i iVar, a4.f fVar) {
        if (iVar == null) {
            return false;
        }
        int t02 = iVar.t0();
        return (t02 == 90 || t02 == 270) ? b(iVar.getHeight(), iVar.getWidth(), fVar) : b(iVar.getWidth(), iVar.getHeight(), fVar);
    }
}
