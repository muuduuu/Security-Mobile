package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1580w {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1582y f17022a;

    private C1580w(AbstractC1582y abstractC1582y) {
        this.f17022a = abstractC1582y;
    }

    public static C1580w b(AbstractC1582y abstractC1582y) {
        return new C1580w((AbstractC1582y) y0.f.h(abstractC1582y, "callbacks == null"));
    }

    public void a(ComponentCallbacksC1573o componentCallbacksC1573o) {
        AbstractC1582y abstractC1582y = this.f17022a;
        abstractC1582y.f17028e.l(abstractC1582y, abstractC1582y, componentCallbacksC1573o);
    }

    public void c() {
        this.f17022a.f17028e.w();
    }

    public boolean d(MenuItem menuItem) {
        return this.f17022a.f17028e.z(menuItem);
    }

    public void e() {
        this.f17022a.f17028e.A();
    }

    public void f() {
        this.f17022a.f17028e.C();
    }

    public void g() {
        this.f17022a.f17028e.L();
    }

    public void h() {
        this.f17022a.f17028e.P();
    }

    public void i() {
        this.f17022a.f17028e.Q();
    }

    public void j() {
        this.f17022a.f17028e.S();
    }

    public boolean k() {
        return this.f17022a.f17028e.Z(true);
    }

    public G l() {
        return this.f17022a.f17028e;
    }

    public void m() {
        this.f17022a.f17028e.a1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f17022a.f17028e.x0().onCreateView(view, str, context, attributeSet);
    }
}
