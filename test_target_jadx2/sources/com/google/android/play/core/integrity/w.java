package com.google.android.play.core.integrity;

import android.content.Context;
import c8.C1741a;

/* loaded from: classes2.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private final w f27863a = this;

    /* renamed from: b, reason: collision with root package name */
    private final e8.o f27864b;

    /* renamed from: c, reason: collision with root package name */
    private final e8.o f27865c;

    /* renamed from: d, reason: collision with root package name */
    private final e8.o f27866d;

    /* renamed from: e, reason: collision with root package name */
    private final e8.o f27867e;

    /* renamed from: f, reason: collision with root package name */
    private final e8.o f27868f;

    /* synthetic */ w(Context context, c8.e eVar) {
        C1741a c1741a;
        u uVar;
        u uVar2;
        e8.l b10 = e8.m.b(context);
        this.f27864b = b10;
        c1741a = e.f27830a;
        e8.o b11 = e8.k.b(c1741a);
        this.f27865c = b11;
        uVar = t.f27861a;
        q qVar = new q(b10, uVar);
        this.f27866d = qVar;
        uVar2 = t.f27861a;
        e8.o b12 = e8.k.b(new k(b10, b11, qVar, uVar2));
        this.f27867e = b12;
        this.f27868f = e8.k.b(new d(b12));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f27868f.a();
    }
}
