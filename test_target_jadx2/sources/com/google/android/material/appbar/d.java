package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
abstract class d extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private e f26599a;

    /* renamed from: b, reason: collision with root package name */
    private int f26600b;

    /* renamed from: c, reason: collision with root package name */
    private int f26601c;

    public d() {
        this.f26600b = 0;
        this.f26601c = 0;
    }

    public int E() {
        e eVar = this.f26599a;
        if (eVar != null) {
            return eVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.K(view, i10);
    }

    public boolean G(int i10) {
        e eVar = this.f26599a;
        if (eVar != null) {
            return eVar.e(i10);
        }
        this.f26600b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f26599a == null) {
            this.f26599a = new e(view);
        }
        this.f26599a.c();
        this.f26599a.a();
        int i11 = this.f26600b;
        if (i11 != 0) {
            this.f26599a.e(i11);
            this.f26600b = 0;
        }
        int i12 = this.f26601c;
        if (i12 == 0) {
            return true;
        }
        this.f26599a.d(i12);
        this.f26601c = 0;
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26600b = 0;
        this.f26601c = 0;
    }
}
