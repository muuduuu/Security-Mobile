package com.facebook.soloader;

import q5.AbstractC3922b;

/* loaded from: classes2.dex */
public class o implements x {

    /* renamed from: a, reason: collision with root package name */
    private final x f23075a;

    public o(x xVar) {
        this.f23075a = xVar;
    }

    @Override // com.facebook.soloader.x
    public void a(String str, int i10) {
        AbstractC3922b.j(this.f23075a, "load", i10);
        try {
            this.f23075a.a(str, i10);
            AbstractC3922b.i(null);
        } finally {
        }
    }
}
