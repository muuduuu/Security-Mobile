package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class m extends B7.d {

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference f23401f;

    m(p pVar) {
        this.f23401f = new WeakReference(pVar);
    }

    @Override // B7.f
    public final void a0(B7.l lVar) {
        x xVar;
        p pVar = (p) this.f23401f.get();
        if (pVar == null) {
            return;
        }
        xVar = pVar.f23404a;
        xVar.n(new l(this, pVar, pVar, lVar));
    }
}
