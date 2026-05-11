package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AbstractC1484a0;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f26602a;

    /* renamed from: b, reason: collision with root package name */
    private int f26603b;

    /* renamed from: c, reason: collision with root package name */
    private int f26604c;

    /* renamed from: d, reason: collision with root package name */
    private int f26605d;

    /* renamed from: e, reason: collision with root package name */
    private int f26606e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26607f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26608g = true;

    public e(View view) {
        this.f26602a = view;
    }

    void a() {
        View view = this.f26602a;
        AbstractC1484a0.b0(view, this.f26605d - (view.getTop() - this.f26603b));
        View view2 = this.f26602a;
        AbstractC1484a0.a0(view2, this.f26606e - (view2.getLeft() - this.f26604c));
    }

    public int b() {
        return this.f26605d;
    }

    void c() {
        this.f26603b = this.f26602a.getTop();
        this.f26604c = this.f26602a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f26608g || this.f26606e == i10) {
            return false;
        }
        this.f26606e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f26607f || this.f26605d == i10) {
            return false;
        }
        this.f26605d = i10;
        a();
        return true;
    }
}
