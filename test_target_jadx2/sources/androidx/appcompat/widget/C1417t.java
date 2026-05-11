package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import g.AbstractC3179j;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1417t extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f14259b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14260a;

    public C1417t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        h0 v10 = h0.v(context, attributeSet, AbstractC3179j.f33356Y1, i10, i11);
        if (v10.s(AbstractC3179j.f33365a2)) {
            b(v10.a(AbstractC3179j.f33365a2, false));
        }
        setBackgroundDrawable(v10.g(AbstractC3179j.f33360Z1));
        v10.x();
    }

    private void b(boolean z10) {
        if (f14259b) {
            this.f14260a = z10;
        } else {
            androidx.core.widget.j.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f14259b && this.f14260a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f14259b && this.f14260a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f14259b && this.f14260a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
