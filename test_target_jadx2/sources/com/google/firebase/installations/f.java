package com.google.firebase.installations;

import D7.C0787k;

/* loaded from: classes2.dex */
class f implements h {

    /* renamed from: a, reason: collision with root package name */
    final C0787k f28038a;

    public f(C0787k c0787k) {
        this.f28038a = c0787k;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(C8.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f28038a.e(dVar.d());
        return true;
    }
}
