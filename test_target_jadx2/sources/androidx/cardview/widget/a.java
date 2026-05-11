package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d o(b bVar) {
        return (d) bVar.e();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.b(new d(colorStateList, f10));
        View f13 = bVar.f();
        f13.setClipToOutline(true);
        f13.setElevation(f11);
        n(bVar, f12);
    }

    @Override // androidx.cardview.widget.c
    public void b(b bVar, float f10) {
        o(bVar).h(f10);
    }

    @Override // androidx.cardview.widget.c
    public float c(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return o(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void e(b bVar) {
        n(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void f(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    @Override // androidx.cardview.widget.c
    public float g(b bVar) {
        return o(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList h(b bVar) {
        return o(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public void i() {
    }

    @Override // androidx.cardview.widget.c
    public float j(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float k(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void l(b bVar) {
        n(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, float f10) {
        o(bVar).g(f10, bVar.d(), bVar.c());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.d()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float g10 = g(bVar);
        float d10 = d(bVar);
        int ceil = (int) Math.ceil(e.a(g10, d10, bVar.c()));
        int ceil2 = (int) Math.ceil(e.b(g10, d10, bVar.c()));
        bVar.a(ceil, ceil2, ceil, ceil2);
    }
}
