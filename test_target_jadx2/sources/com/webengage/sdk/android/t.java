package com.webengage.sdk.android;

import android.content.Context;

/* loaded from: classes2.dex */
class t implements d3 {

    /* renamed from: a, reason: collision with root package name */
    u f30811a;

    /* renamed from: b, reason: collision with root package name */
    z1 f30812b;

    /* renamed from: c, reason: collision with root package name */
    Context f30813c;

    t(u uVar, z1 z1Var, Context context) {
        this.f30811a = uVar;
        this.f30812b = z1Var;
        this.f30813c = context;
    }

    @Override // com.webengage.sdk.android.d3
    public boolean a(p0 p0Var) {
        this.f30811a.a(p0Var);
        if (this.f30811a.a() < 5 || !q2.d()) {
            return true;
        }
        this.f30812b.a(this.f30811a.a(5));
        return true;
    }
}
