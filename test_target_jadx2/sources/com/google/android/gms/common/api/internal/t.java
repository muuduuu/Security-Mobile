package com.google.android.gms.common.api.internal;

import T6.U;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class t extends U {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f23428a;

    t(u uVar) {
        this.f23428a = new WeakReference(uVar);
    }

    @Override // T6.U
    public final void a() {
        u uVar = (u) this.f23428a.get();
        if (uVar == null) {
            return;
        }
        u.u(uVar);
    }
}
