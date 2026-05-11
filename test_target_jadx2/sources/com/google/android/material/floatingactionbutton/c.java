package com.google.android.material.floatingactionbutton;

import Y7.g;
import Y7.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import y0.f;

/* loaded from: classes2.dex */
class c extends b {

    static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        @Override // Y7.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    c(FloatingActionButton floatingActionButton, X7.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator f0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f27095w, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f27095w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(b.f27063D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void A(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void B(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(b.f27064E, f0(f10, f12));
        stateListAnimator.addState(b.f27065F, f0(f10, f11));
        stateListAnimator.addState(b.f27066G, f0(f10, f11));
        stateListAnimator.addState(b.f27067H, f0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f27095w, "elevation", f10).setDuration(0L));
        if (i10 <= 24) {
            FloatingActionButton floatingActionButton = this.f27095w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f27095w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(b.f27063D);
        stateListAnimator.addState(b.f27068I, animatorSet);
        stateListAnimator.addState(b.f27069J, f0(0.0f, 0.0f));
        this.f27095w.setStateListAnimator(stateListAnimator);
        if (V()) {
            b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean G() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void R(ColorStateList colorStateList) {
        Drawable drawable = this.f27075c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(W7.b.d(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean V() {
        return this.f27096x.d() || !X();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void Z() {
    }

    com.google.android.material.floatingactionbutton.a e0(int i10, ColorStateList colorStateList) {
        Context context = this.f27095w.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((k) f.g(this.f27073a));
        aVar.e(androidx.core.content.a.c(context, H7.c.f3158e), androidx.core.content.a.c(context, H7.c.f3157d), androidx.core.content.a.c(context, H7.c.f3155b), androidx.core.content.a.c(context, H7.c.f3156c));
        aVar.d(i10);
        aVar.c(colorStateList);
        return aVar;
    }

    g g0() {
        return new a((k) f.g(this.f27073a));
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float j() {
        return this.f27095w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void o(Rect rect) {
        if (this.f27096x.d()) {
            super.o(rect);
        } else if (X()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f27083k - this.f27095w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void t(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        g g02 = g0();
        this.f27074b = g02;
        g02.setTintList(colorStateList);
        if (mode != null) {
            this.f27074b.setTintMode(mode);
        }
        this.f27074b.M(this.f27095w.getContext());
        if (i10 > 0) {
            this.f27076d = e0(i10, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) f.g(this.f27076d), (Drawable) f.g(this.f27074b)});
        } else {
            this.f27076d = null;
            drawable = this.f27074b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(W7.b.d(colorStateList2), drawable, null);
        this.f27075c = rippleDrawable;
        this.f27077e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void w() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void y() {
        b0();
    }
}
