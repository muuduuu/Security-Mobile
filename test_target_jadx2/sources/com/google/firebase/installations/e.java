package com.google.firebase.installations;

import D7.C0787k;

/* loaded from: classes2.dex */
class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final i f28036a;

    /* renamed from: b, reason: collision with root package name */
    private final C0787k f28037b;

    public e(i iVar, C0787k c0787k) {
        this.f28036a = iVar;
        this.f28037b = c0787k;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f28037b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(C8.d dVar) {
        if (!dVar.k() || this.f28036a.f(dVar)) {
            return false;
        }
        this.f28037b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
