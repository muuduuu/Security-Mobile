package com.google.android.material.progressindicator;

import s1.AbstractC4306a;

/* loaded from: classes2.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    protected j f27371a;

    /* renamed from: b, reason: collision with root package name */
    protected final float[] f27372b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f27373c;

    protected i(int i10) {
        this.f27372b = new float[i10 * 2];
        this.f27373c = new int[i10];
    }

    abstract void a();

    protected float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public abstract void d(AbstractC4306a abstractC4306a);

    protected void e(j jVar) {
        this.f27371a = jVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
