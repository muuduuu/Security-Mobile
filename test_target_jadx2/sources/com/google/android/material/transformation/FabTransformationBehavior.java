package com.google.android.material.transformation;

import H7.f;
import I7.d;
import I7.g;
import I7.h;
import I7.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f27806c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f27807d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f27808e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f27809f;

    /* renamed from: g, reason: collision with root package name */
    private float f27810g;

    /* renamed from: h, reason: collision with root package name */
    private float f27811h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27812a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f27814c;

        a(boolean z10, View view, View view2) {
            this.f27812a = z10;
            this.f27813b = view;
            this.f27814c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f27812a) {
                return;
            }
            this.f27813b.setVisibility(4);
            this.f27814c.setAlpha(1.0f);
            this.f27814c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f27812a) {
                this.f27813b.setVisibility(0);
                this.f27814c.setAlpha(0.0f);
                this.f27814c.setVisibility(4);
            }
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public g f27816a;

        /* renamed from: b, reason: collision with root package name */
        public i f27817b;

        protected b() {
        }
    }

    public FabTransformationBehavior() {
        this.f27806c = new Rect();
        this.f27807d = new RectF();
        this.f27808e = new RectF();
        this.f27809f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.f3232C);
        return findViewById != null ? a0(findViewById) : a0(view);
    }

    private void L(View view, b bVar, h hVar, h hVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float Q10 = Q(bVar, hVar, f10, f12);
        float Q11 = Q(bVar, hVar2, f11, f13);
        Rect rect = this.f27806c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f27807d;
        rectF2.set(rect);
        RectF rectF3 = this.f27808e;
        R(view, rectF3);
        rectF3.offset(Q10, Q11);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        R(view, rectF);
        rectF.offset(this.f27810g, this.f27811h);
    }

    private Pair N(float f10, float f11, boolean z10, b bVar) {
        h e10;
        h e11;
        if (f10 == 0.0f || f11 == 0.0f) {
            e10 = bVar.f27816a.e("translationXLinear");
            e11 = bVar.f27816a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            e10 = bVar.f27816a.e("translationXCurveDownwards");
            e11 = bVar.f27816a.e("translationYCurveDownwards");
        } else {
            e10 = bVar.f27816a.e("translationXCurveUpwards");
            e11 = bVar.f27816a.e("translationYCurveUpwards");
        }
        return new Pair(e10, e11);
    }

    private float O(View view, View view2, i iVar) {
        float centerX;
        float centerX2;
        float f10;
        RectF rectF = this.f27807d;
        RectF rectF2 = this.f27808e;
        M(view, rectF);
        R(view2, rectF2);
        int i10 = iVar.f4353a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + iVar.f4354b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f10 = centerX - centerX2;
        return f10 + iVar.f4354b;
    }

    private float P(View view, View view2, i iVar) {
        float centerY;
        float centerY2;
        float f10;
        RectF rectF = this.f27807d;
        RectF rectF2 = this.f27808e;
        M(view, rectF);
        R(view2, rectF2);
        int i10 = iVar.f4353a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + iVar.f4355c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f10 = centerY - centerY2;
        return f10 + iVar.f4355c;
    }

    private float Q(b bVar, h hVar, float f10, float f11) {
        long c10 = hVar.c();
        long d10 = hVar.d();
        h e10 = bVar.f27816a.e("expansion");
        return I7.a.a(f10, f11, hVar.e().getInterpolation((((e10.c() + e10.d()) + 17) - c10) / d10));
    }

    private void R(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f27809f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void S(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ViewGroup K10;
        ObjectAnimator ofFloat;
        if ((view2 instanceof ViewGroup) && (K10 = K(view2)) != null) {
            if (z10) {
                if (!z11) {
                    d.f4341a.set(K10, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(K10, (Property<ViewGroup, Float>) d.f4341a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(K10, (Property<ViewGroup, Float>) d.f4341a, 0.0f);
            }
            bVar.f27816a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    private void T(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void U(View view, View view2, boolean z10, b bVar, List list) {
        float O10 = O(view, view2, bVar.f27817b);
        float P10 = P(view, view2, bVar.f27817b);
        Pair N10 = N(O10, P10, z10, bVar);
        h hVar = (h) N10.first;
        h hVar2 = (h) N10.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            O10 = this.f27810g;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, O10);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            P10 = this.f27811h;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, P10);
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void V(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ObjectAnimator ofFloat;
        float v10 = AbstractC1484a0.v(view2) - AbstractC1484a0.v(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-v10);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -v10);
        }
        bVar.f27816a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void W(View view, View view2, boolean z10, boolean z11, b bVar, float f10, float f11, List list, List list2) {
    }

    private void X(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void Y(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float O10 = O(view, view2, bVar.f27817b);
        float P10 = P(view, view2, bVar.f27817b);
        Pair N10 = N(O10, P10, z10, bVar);
        h hVar = (h) N10.first;
        h hVar2 = (h) N10.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-O10);
                view2.setTranslationY(-P10);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            L(view2, bVar, hVar, hVar2, -O10, -P10, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -O10);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -P10);
        }
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private ViewGroup a0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        b Z10 = Z(view2.getContext(), z10);
        if (z10) {
            this.f27810g = view.getTranslationX();
            this.f27811h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        V(view, view2, z10, z11, Z10, arrayList, arrayList2);
        RectF rectF = this.f27807d;
        Y(view, view2, z10, z11, Z10, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        U(view, view2, z10, Z10, arrayList);
        X(view, view2, z10, z11, Z10, arrayList, arrayList2);
        W(view, view2, z10, z11, Z10, width, height, arrayList, arrayList2);
        T(view, view2, z10, z11, Z10, arrayList, arrayList2);
        S(view, view2, z10, z11, Z10, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        I7.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    protected abstract b Z(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f15677h == 0) {
            fVar.f15677h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27806c = new Rect();
        this.f27807d = new RectF();
        this.f27808e = new RectF();
        this.f27809f = new int[2];
    }
}
