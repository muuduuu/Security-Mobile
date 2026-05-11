package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes2.dex */
abstract class h {

    /* renamed from: a, reason: collision with root package name */
    b f27369a;

    /* renamed from: b, reason: collision with root package name */
    protected g f27370b;

    public h(b bVar) {
        this.f27369a = bVar;
    }

    abstract void a(Canvas canvas, float f10);

    abstract void b(Canvas canvas, Paint paint, float f10, float f11, int i10);

    abstract void c(Canvas canvas, Paint paint);

    abstract int d();

    abstract int e();

    protected void f(g gVar) {
        this.f27370b = gVar;
    }

    void g(Canvas canvas, float f10) {
        this.f27369a.e();
        a(canvas, f10);
    }
}
