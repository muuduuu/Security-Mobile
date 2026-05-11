package com.google.android.material.tabs;

import H7.k;
import H7.l;
import a8.AbstractC1367a;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.m0;
import androidx.core.util.Pools$SimplePool;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1524v;
import androidx.core.view.M;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import g.AbstractC3179j;
import h.AbstractC3220a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import z0.C5228A;

@ViewPager.e
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: n0, reason: collision with root package name */
    private static final int f27449n0 = k.f3334j;

    /* renamed from: o0, reason: collision with root package name */
    private static final y0.d f27450o0 = new y0.e(16);

    /* renamed from: A, reason: collision with root package name */
    boolean f27451A;

    /* renamed from: B, reason: collision with root package name */
    boolean f27452B;

    /* renamed from: C, reason: collision with root package name */
    int f27453C;

    /* renamed from: D, reason: collision with root package name */
    int f27454D;

    /* renamed from: E, reason: collision with root package name */
    boolean f27455E;

    /* renamed from: F, reason: collision with root package name */
    private com.google.android.material.tabs.c f27456F;

    /* renamed from: G, reason: collision with root package name */
    private c f27457G;

    /* renamed from: H, reason: collision with root package name */
    private final ArrayList f27458H;

    /* renamed from: I, reason: collision with root package name */
    private c f27459I;

    /* renamed from: J, reason: collision with root package name */
    private ValueAnimator f27460J;

    /* renamed from: K, reason: collision with root package name */
    ViewPager f27461K;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f27462a;

    /* renamed from: b, reason: collision with root package name */
    private g f27463b;

    /* renamed from: c, reason: collision with root package name */
    final f f27464c;

    /* renamed from: d, reason: collision with root package name */
    int f27465d;

    /* renamed from: e, reason: collision with root package name */
    int f27466e;

    /* renamed from: f, reason: collision with root package name */
    int f27467f;

    /* renamed from: g, reason: collision with root package name */
    int f27468g;

    /* renamed from: h, reason: collision with root package name */
    int f27469h;

    /* renamed from: h0, reason: collision with root package name */
    private androidx.viewpager.widget.a f27470h0;

    /* renamed from: i, reason: collision with root package name */
    ColorStateList f27471i;

    /* renamed from: i0, reason: collision with root package name */
    private DataSetObserver f27472i0;

    /* renamed from: j, reason: collision with root package name */
    ColorStateList f27473j;

    /* renamed from: j0, reason: collision with root package name */
    private h f27474j0;

    /* renamed from: k, reason: collision with root package name */
    ColorStateList f27475k;

    /* renamed from: k0, reason: collision with root package name */
    private b f27476k0;

    /* renamed from: l, reason: collision with root package name */
    Drawable f27477l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f27478l0;

    /* renamed from: m, reason: collision with root package name */
    private int f27479m;

    /* renamed from: m0, reason: collision with root package name */
    private final y0.d f27480m0;

    /* renamed from: n, reason: collision with root package name */
    PorterDuff.Mode f27481n;

    /* renamed from: o, reason: collision with root package name */
    float f27482o;

    /* renamed from: p, reason: collision with root package name */
    float f27483p;

    /* renamed from: q, reason: collision with root package name */
    final int f27484q;

    /* renamed from: r, reason: collision with root package name */
    int f27485r;

    /* renamed from: s, reason: collision with root package name */
    private final int f27486s;

    /* renamed from: t, reason: collision with root package name */
    private final int f27487t;

    /* renamed from: u, reason: collision with root package name */
    private final int f27488u;

    /* renamed from: v, reason: collision with root package name */
    private int f27489v;

    /* renamed from: w, reason: collision with root package name */
    int f27490w;

    /* renamed from: x, reason: collision with root package name */
    int f27491x;

    /* renamed from: y, reason: collision with root package name */
    int f27492y;

    /* renamed from: z, reason: collision with root package name */
    int f27493z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27495a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27461K == viewPager) {
                tabLayout.F(aVar2, this.f27495a);
            }
        }

        void b(boolean z10) {
            this.f27495a = z10;
        }
    }

    public interface c {
        void a(g gVar);

        void b(g gVar);

        void c(g gVar);
    }

    public interface d extends c {
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.y();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.y();
        }
    }

    class f extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        ValueAnimator f27498a;

        /* renamed from: b, reason: collision with root package name */
        int f27499b;

        /* renamed from: c, reason: collision with root package name */
        float f27500c;

        /* renamed from: d, reason: collision with root package name */
        private int f27501d;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f27503a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f27504b;

            a(View view, View view2) {
                this.f27503a = view;
                this.f27504b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.h(this.f27503a, this.f27504b, valueAnimator.getAnimatedFraction());
            }
        }

        class b extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f27506a;

            b(int i10) {
                this.f27506a = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f27499b = this.f27506a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f27499b = this.f27506a;
            }
        }

        f(Context context) {
            super(context);
            this.f27499b = -1;
            this.f27501d = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            View childAt = getChildAt(this.f27499b);
            com.google.android.material.tabs.c cVar = TabLayout.this.f27456F;
            TabLayout tabLayout = TabLayout.this;
            cVar.c(tabLayout, childAt, tabLayout.f27477l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f27477l;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f27477l.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.f27456F;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f27477l);
            }
            AbstractC1484a0.h0(this);
        }

        private void i(boolean z10, int i10, int i11) {
            View childAt = getChildAt(this.f27499b);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f27498a.removeAllUpdateListeners();
                this.f27498a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27498a = valueAnimator;
            valueAnimator.setInterpolator(I7.a.f4336b);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i10));
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f27498a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f27498a.cancel();
            }
            i(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f27477l.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f27477l.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f27492y;
            if (i10 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    height2 = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.f27477l.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f27477l.getBounds();
                TabLayout.this.f27477l.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f27477l;
                if (tabLayout.f27479m != 0) {
                    drawable = androidx.core.graphics.drawable.a.l(drawable);
                    androidx.core.graphics.drawable.a.h(drawable, TabLayout.this.f27479m);
                } else {
                    androidx.core.graphics.drawable.a.i(drawable, null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        void f(int i10, float f10) {
            ValueAnimator valueAnimator = this.f27498a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f27498a.cancel();
            }
            this.f27499b = i10;
            this.f27500c = f10;
            h(getChildAt(i10), getChildAt(this.f27499b + 1), this.f27500c);
        }

        void g(int i10) {
            Rect bounds = TabLayout.this.f27477l.getBounds();
            TabLayout.this.f27477l.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f27498a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                i(false, this.f27499b, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f27490w == 1 || tabLayout.f27493z == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) o.b(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f27490w = 0;
                    tabLayout2.M(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        private Object f27508a;

        /* renamed from: b, reason: collision with root package name */
        private Drawable f27509b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f27510c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f27511d;

        /* renamed from: f, reason: collision with root package name */
        private View f27513f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f27515h;

        /* renamed from: i, reason: collision with root package name */
        public i f27516i;

        /* renamed from: e, reason: collision with root package name */
        private int f27512e = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f27514g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f27517j = -1;

        public View e() {
            return this.f27513f;
        }

        public Drawable f() {
            return this.f27509b;
        }

        public int g() {
            return this.f27512e;
        }

        public int h() {
            return this.f27514g;
        }

        public CharSequence i() {
            return this.f27510c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f27515h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f27512e;
        }

        void k() {
            this.f27515h = null;
            this.f27516i = null;
            this.f27508a = null;
            this.f27509b = null;
            this.f27517j = -1;
            this.f27510c = null;
            this.f27511d = null;
            this.f27512e = -1;
            this.f27513f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f27515h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.D(this);
        }

        void m(int i10) {
            this.f27512e = i10;
        }

        public g n(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f27511d) && !TextUtils.isEmpty(charSequence)) {
                this.f27516i.setContentDescription(charSequence);
            }
            this.f27510c = charSequence;
            o();
            return this;
        }

        void o() {
            i iVar = this.f27516i;
            if (iVar != null) {
                iVar.r();
            }
        }
    }

    public static class h implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f27518a;

        /* renamed from: b, reason: collision with root package name */
        private int f27519b;

        /* renamed from: c, reason: collision with root package name */
        private int f27520c;

        public h(TabLayout tabLayout) {
            this.f27518a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            TabLayout tabLayout = (TabLayout) this.f27518a.get();
            if (tabLayout != null) {
                int i12 = this.f27520c;
                tabLayout.H(i10, f10, i12 != 2 || this.f27519b == 1, (i12 == 2 && this.f27519b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            this.f27519b = this.f27520c;
            this.f27520c = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            TabLayout tabLayout = (TabLayout) this.f27518a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f27520c;
            tabLayout.E(tabLayout.u(i10), i11 == 0 || (i11 == 2 && this.f27519b == 0));
        }

        void d() {
            this.f27520c = 0;
            this.f27519b = 0;
        }
    }

    public final class i extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        private g f27521a;

        /* renamed from: b, reason: collision with root package name */
        private TextView f27522b;

        /* renamed from: c, reason: collision with root package name */
        private ImageView f27523c;

        /* renamed from: d, reason: collision with root package name */
        private View f27524d;

        /* renamed from: e, reason: collision with root package name */
        private J7.a f27525e;

        /* renamed from: f, reason: collision with root package name */
        private View f27526f;

        /* renamed from: g, reason: collision with root package name */
        private TextView f27527g;

        /* renamed from: h, reason: collision with root package name */
        private ImageView f27528h;

        /* renamed from: i, reason: collision with root package name */
        private Drawable f27529i;

        /* renamed from: j, reason: collision with root package name */
        private int f27530j;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f27532a;

            a(View view) {
                this.f27532a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f27532a.getVisibility() == 0) {
                    i.this.q(this.f27532a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f27530j = 2;
            s(context);
            AbstractC1484a0.G0(this, TabLayout.this.f27465d, TabLayout.this.f27466e, TabLayout.this.f27467f, TabLayout.this.f27468g);
            setGravity(17);
            setOrientation(!TabLayout.this.f27451A ? 1 : 0);
            setClickable(true);
            AbstractC1484a0.H0(this, M.b(getContext(), 1002));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float e(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void f(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        private FrameLayout g() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        private J7.a getBadge() {
            return this.f27525e;
        }

        private J7.a getOrCreateBadge() {
            if (this.f27525e == null) {
                this.f27525e = J7.a.c(getContext());
            }
            p();
            J7.a aVar = this.f27525e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(Canvas canvas) {
            Drawable drawable = this.f27529i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f27529i.draw(canvas);
            }
        }

        private FrameLayout i(View view) {
            if ((view == this.f27523c || view == this.f27522b) && J7.c.f4846a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        private boolean j() {
            return this.f27525e != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void k() {
            FrameLayout frameLayout;
            if (J7.c.f4846a) {
                frameLayout = g();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(H7.h.f3281d, (ViewGroup) frameLayout, false);
            this.f27523c = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void l() {
            FrameLayout frameLayout;
            if (J7.c.f4846a) {
                frameLayout = g();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(H7.h.f3282e, (ViewGroup) frameLayout, false);
            this.f27522b = textView;
            frameLayout.addView(textView);
        }

        private void n(View view) {
            if (j() && view != null) {
                f(false);
                J7.c.a(this.f27525e, view, i(view));
                this.f27524d = view;
            }
        }

        private void o() {
            if (j()) {
                f(true);
                View view = this.f27524d;
                if (view != null) {
                    J7.c.b(this.f27525e, view);
                    this.f27524d = null;
                }
            }
        }

        private void p() {
            g gVar;
            g gVar2;
            if (j()) {
                if (this.f27526f != null) {
                    o();
                    return;
                }
                if (this.f27523c != null && (gVar2 = this.f27521a) != null && gVar2.f() != null) {
                    View view = this.f27524d;
                    ImageView imageView = this.f27523c;
                    if (view == imageView) {
                        q(imageView);
                        return;
                    } else {
                        o();
                        n(this.f27523c);
                        return;
                    }
                }
                if (this.f27522b == null || (gVar = this.f27521a) == null || gVar.h() != 1) {
                    o();
                    return;
                }
                View view2 = this.f27524d;
                TextView textView = this.f27522b;
                if (view2 == textView) {
                    q(textView);
                } else {
                    o();
                    n(this.f27522b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(View view) {
            if (j() && view == this.f27524d) {
                J7.c.c(this.f27525e, view, i(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void s(Context context) {
            int i10 = TabLayout.this.f27484q;
            if (i10 != 0) {
                Drawable b10 = AbstractC3220a.b(context, i10);
                this.f27529i = b10;
                if (b10 != null && b10.isStateful()) {
                    this.f27529i.setState(getDrawableState());
                }
            } else {
                this.f27529i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f27475k != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a10 = W7.b.a(TabLayout.this.f27475k);
                boolean z10 = TabLayout.this.f27455E;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a10, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            AbstractC1484a0.u0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        private void u(TextView textView, ImageView imageView) {
            g gVar = this.f27521a;
            Drawable mutate = (gVar == null || gVar.f() == null) ? null : androidx.core.graphics.drawable.a.l(this.f27521a.f()).mutate();
            if (mutate != null) {
                androidx.core.graphics.drawable.a.i(mutate, TabLayout.this.f27473j);
                PorterDuff.Mode mode = TabLayout.this.f27481n;
                if (mode != null) {
                    androidx.core.graphics.drawable.a.j(mutate, mode);
                }
            }
            g gVar2 = this.f27521a;
            CharSequence i10 = gVar2 != null ? gVar2.i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(i10);
            if (textView != null) {
                if (isEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(i10);
                    if (this.f27521a.f27514g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b10 = (isEmpty || imageView.getVisibility() != 0) ? 0 : (int) o.b(getContext(), 8);
                if (TabLayout.this.f27451A) {
                    if (b10 != AbstractC1524v.a(marginLayoutParams)) {
                        AbstractC1524v.c(marginLayoutParams, b10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b10;
                    AbstractC1524v.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f27521a;
            CharSequence charSequence = gVar3 != null ? gVar3.f27511d : null;
            if (isEmpty) {
                i10 = charSequence;
            }
            m0.a(this, i10);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f27529i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f27529i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f27522b, this.f27523c, this.f27526f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        int getContentWidth() {
            View[] viewArr = {this.f27522b, this.f27523c, this.f27526f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f27521a;
        }

        void m() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            J7.a aVar = this.f27525e;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f27525e.f()));
            }
            C5228A Y02 = C5228A.Y0(accessibilityNodeInfo);
            Y02.t0(C5228A.f.b(0, 1, this.f27521a.g(), 1, false, isSelected()));
            if (isSelected()) {
                Y02.r0(false);
                Y02.i0(C5228A.a.f45627i);
            }
            Y02.K0(getResources().getString(H7.j.f3311h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f27485r, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f27522b != null) {
                float f10 = TabLayout.this.f27482o;
                int i12 = this.f27530j;
                ImageView imageView = this.f27523c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f27522b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f27483p;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f27522b.getTextSize();
                int lineCount = this.f27522b.getLineCount();
                int d10 = androidx.core.widget.k.d(this.f27522b);
                if (f10 != textSize || (d10 >= 0 && i12 != d10)) {
                    if (TabLayout.this.f27493z != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f27522b.getLayout()) != null && e(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f27522b.setTextSize(0, f10);
                        this.f27522b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f27521a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f27521a.l();
            return true;
        }

        final void r() {
            g gVar = this.f27521a;
            View e10 = gVar != null ? gVar.e() : null;
            if (e10 != null) {
                ViewParent parent = e10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e10);
                    }
                    addView(e10);
                }
                this.f27526f = e10;
                TextView textView = this.f27522b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f27523c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f27523c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e10.findViewById(R.id.text1);
                this.f27527g = textView2;
                if (textView2 != null) {
                    this.f27530j = androidx.core.widget.k.d(textView2);
                }
                this.f27528h = (ImageView) e10.findViewById(R.id.icon);
            } else {
                View view = this.f27526f;
                if (view != null) {
                    removeView(view);
                    this.f27526f = null;
                }
                this.f27527g = null;
                this.f27528h = null;
            }
            if (this.f27526f == null) {
                if (this.f27523c == null) {
                    k();
                }
                if (this.f27522b == null) {
                    l();
                    this.f27530j = androidx.core.widget.k.d(this.f27522b);
                }
                androidx.core.widget.k.p(this.f27522b, TabLayout.this.f27469h);
                ColorStateList colorStateList = TabLayout.this.f27471i;
                if (colorStateList != null) {
                    this.f27522b.setTextColor(colorStateList);
                }
                u(this.f27522b, this.f27523c);
                p();
                d(this.f27523c);
                d(this.f27522b);
            } else {
                TextView textView3 = this.f27527g;
                if (textView3 != null || this.f27528h != null) {
                    u(textView3, this.f27528h);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f27511d)) {
                setContentDescription(gVar.f27511d);
            }
            setSelected(gVar != null && gVar.j());
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f27522b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f27523c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f27526f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.f27521a) {
                this.f27521a = gVar;
                r();
            }
        }

        final void t() {
            setOrientation(!TabLayout.this.f27451A ? 1 : 0);
            TextView textView = this.f27527g;
            if (textView == null && this.f27528h == null) {
                u(this.f27522b, this.f27523c);
            } else {
                u(textView, this.f27528h);
            }
        }
    }

    public static class j implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager f27534a;

        public j(ViewPager viewPager) {
            this.f27534a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
            this.f27534a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3123O);
    }

    private void C(int i10) {
        i iVar = (i) this.f27464c.getChildAt(i10);
        this.f27464c.removeViewAt(i10);
        if (iVar != null) {
            iVar.m();
            this.f27480m0.a(iVar);
        }
        requestLayout();
    }

    private void J(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f27461K;
        if (viewPager2 != null) {
            h hVar = this.f27474j0;
            if (hVar != null) {
                viewPager2.I(hVar);
            }
            b bVar = this.f27476k0;
            if (bVar != null) {
                this.f27461K.H(bVar);
            }
        }
        c cVar = this.f27459I;
        if (cVar != null) {
            B(cVar);
            this.f27459I = null;
        }
        if (viewPager != null) {
            this.f27461K = viewPager;
            if (this.f27474j0 == null) {
                this.f27474j0 = new h(this);
            }
            this.f27474j0.d();
            viewPager.c(this.f27474j0);
            j jVar = new j(viewPager);
            this.f27459I = jVar;
            c(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                F(adapter, z10);
            }
            if (this.f27476k0 == null) {
                this.f27476k0 = new b();
            }
            this.f27476k0.b(z10);
            viewPager.b(this.f27476k0);
            G(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f27461K = null;
            F(null, false);
        }
        this.f27478l0 = z11;
    }

    private void K() {
        int size = this.f27462a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.f27462a.get(i10)).o();
        }
    }

    private void L(LinearLayout.LayoutParams layoutParams) {
        if (this.f27493z == 1 && this.f27490w == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private void f(g gVar) {
        i iVar = gVar.f27516i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f27464c.addView(iVar, gVar.g(), n());
    }

    private void g(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private int getDefaultHeight() {
        int size = this.f27462a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            g gVar = (g) this.f27462a.get(i10);
            if (gVar == null || gVar.f() == null || TextUtils.isEmpty(gVar.i())) {
                i10++;
            } else if (!this.f27451A) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f27486s;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f27493z;
        if (i11 == 0 || i11 == 2) {
            return this.f27488u;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f27464c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !AbstractC1484a0.U(this) || this.f27464c.d()) {
            G(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int k10 = k(i10, 0.0f);
        if (scrollX != k10) {
            t();
            this.f27460J.setIntValues(scrollX, k10);
            this.f27460J.start();
        }
        this.f27464c.c(i10, this.f27491x);
    }

    private void i(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f27464c.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f27464c.setGravity(8388611);
    }

    private void j() {
        int i10 = this.f27493z;
        AbstractC1484a0.G0(this.f27464c, (i10 == 0 || i10 == 2) ? Math.max(0, this.f27489v - this.f27465d) : 0, 0, 0, 0);
        int i11 = this.f27493z;
        if (i11 == 0) {
            i(this.f27490w);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f27490w == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f27464c.setGravity(1);
        }
        M(true);
    }

    private int k(int i10, float f10) {
        View childAt;
        int i11 = this.f27493z;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f27464c.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f27464c.getChildCount() ? this.f27464c.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return AbstractC1484a0.A(this) == 0 ? left + i13 : left - i13;
    }

    private void l(g gVar, int i10) {
        gVar.m(i10);
        this.f27462a.add(i10, gVar);
        int size = this.f27462a.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            } else {
                ((g) this.f27462a.get(i10)).m(i10);
            }
        }
    }

    private static ColorStateList m(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams n() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        L(layoutParams);
        return layoutParams;
    }

    private i p(g gVar) {
        y0.d dVar = this.f27480m0;
        i iVar = dVar != null ? (i) dVar.b() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f27511d)) {
            iVar.setContentDescription(gVar.f27510c);
        } else {
            iVar.setContentDescription(gVar.f27511d);
        }
        return iVar;
    }

    private void q(g gVar) {
        for (int size = this.f27458H.size() - 1; size >= 0; size--) {
            ((c) this.f27458H.get(size)).a(gVar);
        }
    }

    private void r(g gVar) {
        for (int size = this.f27458H.size() - 1; size >= 0; size--) {
            ((c) this.f27458H.get(size)).b(gVar);
        }
    }

    private void s(g gVar) {
        for (int size = this.f27458H.size() - 1; size >= 0; size--) {
            ((c) this.f27458H.get(size)).c(gVar);
        }
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f27464c.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f27464c.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    private void t() {
        if (this.f27460J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27460J = valueAnimator;
            valueAnimator.setInterpolator(I7.a.f4336b);
            this.f27460J.setDuration(this.f27491x);
            this.f27460J.addUpdateListener(new a());
        }
    }

    private boolean v() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public void A() {
        for (int childCount = this.f27464c.getChildCount() - 1; childCount >= 0; childCount--) {
            C(childCount);
        }
        Iterator it = this.f27462a.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.k();
            z(gVar);
        }
        this.f27463b = null;
    }

    public void B(c cVar) {
        this.f27458H.remove(cVar);
    }

    public void D(g gVar) {
        E(gVar, true);
    }

    public void E(g gVar, boolean z10) {
        g gVar2 = this.f27463b;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                q(gVar);
                h(gVar.g());
                return;
            }
            return;
        }
        int g10 = gVar != null ? gVar.g() : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.g() == -1) && g10 != -1) {
                G(g10, 0.0f, true);
            } else {
                h(g10);
            }
            if (g10 != -1) {
                setSelectedTabView(g10);
            }
        }
        this.f27463b = gVar;
        if (gVar2 != null) {
            s(gVar2);
        }
        if (gVar != null) {
            r(gVar);
        }
    }

    void F(androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f27470h0;
        if (aVar2 != null && (dataSetObserver = this.f27472i0) != null) {
            aVar2.o(dataSetObserver);
        }
        this.f27470h0 = aVar;
        if (z10 && aVar != null) {
            if (this.f27472i0 == null) {
                this.f27472i0 = new e();
            }
            aVar.i(this.f27472i0);
        }
        y();
    }

    public void G(int i10, float f10, boolean z10) {
        H(i10, f10, z10, true);
    }

    public void H(int i10, float f10, boolean z10, boolean z11) {
        int round = Math.round(i10 + f10);
        if (round < 0 || round >= this.f27464c.getChildCount()) {
            return;
        }
        if (z11) {
            this.f27464c.f(i10, f10);
        }
        ValueAnimator valueAnimator = this.f27460J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27460J.cancel();
        }
        scrollTo(i10 < 0 ? 0 : k(i10, f10), 0);
        if (z10) {
            setSelectedTabView(round);
        }
    }

    public void I(ViewPager viewPager, boolean z10) {
        J(viewPager, z10, false);
    }

    void M(boolean z10) {
        for (int i10 = 0; i10 < this.f27464c.getChildCount(); i10++) {
            View childAt = this.f27464c.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            L((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        g(view);
    }

    public void c(c cVar) {
        if (this.f27458H.contains(cVar)) {
            return;
        }
        this.f27458H.add(cVar);
    }

    public void d(g gVar, int i10, boolean z10) {
        if (gVar.f27515h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        l(gVar, i10);
        f(gVar);
        if (z10) {
            gVar.l();
        }
    }

    public void e(g gVar, boolean z10) {
        d(gVar, this.f27462a.size(), z10);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f27463b;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f27462a.size();
    }

    public int getTabGravity() {
        return this.f27490w;
    }

    public ColorStateList getTabIconTint() {
        return this.f27473j;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f27454D;
    }

    public int getTabIndicatorGravity() {
        return this.f27492y;
    }

    int getTabMaxWidth() {
        return this.f27485r;
    }

    public int getTabMode() {
        return this.f27493z;
    }

    public ColorStateList getTabRippleColor() {
        return this.f27475k;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f27477l;
    }

    public ColorStateList getTabTextColors() {
        return this.f27471i;
    }

    protected g o() {
        g gVar = (g) f27450o0.b();
        return gVar == null ? new g() : gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y7.h.e(this);
        if (this.f27461K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                J((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27478l0) {
            setupWithViewPager(null);
            this.f27478l0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f27464c.getChildCount(); i10++) {
            View childAt = this.f27464c.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).h(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5228A.Y0(accessibilityNodeInfo).s0(C5228A.e.b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return v() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int round = Math.round(o.b(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int i12 = this.f27487t;
            if (i12 <= 0) {
                i12 = (int) (size - o.b(getContext(), 56));
            }
            this.f27485r = i12;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i13 = this.f27493z;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
                if (i13 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || v()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Y7.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f27451A != z10) {
            this.f27451A = z10;
            for (int i10 = 0; i10 < this.f27464c.getChildCount(); i10++) {
                View childAt = this.f27464c.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).t();
                }
            }
            j();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        t();
        this.f27460J.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f27477l != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f27477l = drawable;
            int i10 = this.f27453C;
            if (i10 == -1) {
                i10 = drawable.getIntrinsicHeight();
            }
            this.f27464c.g(i10);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f27479m = i10;
        M(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f27492y != i10) {
            this.f27492y = i10;
            AbstractC1484a0.h0(this.f27464c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f27453C = i10;
        this.f27464c.g(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f27490w != i10) {
            this.f27490w = i10;
            j();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f27473j != colorStateList) {
            this.f27473j = colorStateList;
            K();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(AbstractC3220a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f27454D = i10;
        if (i10 == 0) {
            this.f27456F = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.f27456F = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.f27456F = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f27452B = z10;
        this.f27464c.e();
        AbstractC1484a0.h0(this.f27464c);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f27493z) {
            this.f27493z = i10;
            j();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f27475k != colorStateList) {
            this.f27475k = colorStateList;
            for (int i10 = 0; i10 < this.f27464c.getChildCount(); i10++) {
                View childAt = this.f27464c.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).s(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(AbstractC3220a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f27471i != colorStateList) {
            this.f27471i = colorStateList;
            K();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        F(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f27455E != z10) {
            this.f27455E = z10;
            for (int i10 = 0; i10 < this.f27464c.getChildCount(); i10++) {
                View childAt = this.f27464c.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).s(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        I(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public g u(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (g) this.f27462a.get(i10);
    }

    public boolean w() {
        return this.f27452B;
    }

    public g x() {
        g o10 = o();
        o10.f27515h = this;
        o10.f27516i = p(o10);
        if (o10.f27517j != -1) {
            o10.f27516i.setId(o10.f27517j);
        }
        return o10;
    }

    void y() {
        int currentItem;
        A();
        androidx.viewpager.widget.a aVar = this.f27470h0;
        if (aVar != null) {
            int c10 = aVar.c();
            for (int i10 = 0; i10 < c10; i10++) {
                e(x().n(this.f27470h0.e(i10)), false);
            }
            ViewPager viewPager = this.f27461K;
            if (viewPager == null || c10 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            D(u(currentItem));
        }
    }

    protected boolean z(g gVar) {
        return f27450o0.a(gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f27449n0;
        this.f27462a = new ArrayList();
        this.f27477l = new GradientDrawable();
        this.f27479m = 0;
        this.f27485r = Integer.MAX_VALUE;
        this.f27453C = -1;
        this.f27458H = new ArrayList();
        this.f27480m0 = new Pools$SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f27464c = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray h10 = m.h(context2, attributeSet, l.f3420H5, i10, i11, l.f3636f6);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            Y7.g gVar = new Y7.g();
            gVar.X(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.M(context2);
            gVar.W(AbstractC1484a0.v(this));
            AbstractC1484a0.u0(this, gVar);
        }
        setSelectedTabIndicator(V7.c.d(context2, h10, l.f3474N5));
        setSelectedTabIndicatorColor(h10.getColor(l.f3501Q5, 0));
        fVar.g(h10.getDimensionPixelSize(l.f3528T5, -1));
        setSelectedTabIndicatorGravity(h10.getInt(l.f3519S5, 0));
        setTabIndicatorAnimationMode(h10.getInt(l.f3492P5, 0));
        setTabIndicatorFullWidth(h10.getBoolean(l.f3510R5, true));
        int dimensionPixelSize = h10.getDimensionPixelSize(l.f3573Y5, 0);
        this.f27468g = dimensionPixelSize;
        this.f27467f = dimensionPixelSize;
        this.f27466e = dimensionPixelSize;
        this.f27465d = dimensionPixelSize;
        this.f27465d = h10.getDimensionPixelSize(l.f3600b6, dimensionPixelSize);
        this.f27466e = h10.getDimensionPixelSize(l.f3609c6, this.f27466e);
        this.f27467f = h10.getDimensionPixelSize(l.f3591a6, this.f27467f);
        this.f27468g = h10.getDimensionPixelSize(l.f3582Z5, this.f27468g);
        int resourceId = h10.getResourceId(l.f3636f6, k.f3327c);
        this.f27469h = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, AbstractC3179j.f33333S2);
        try {
            this.f27482o = obtainStyledAttributes.getDimensionPixelSize(AbstractC3179j.f33337T2, 0);
            this.f27471i = V7.c.a(context2, obtainStyledAttributes, AbstractC3179j.f33349W2);
            obtainStyledAttributes.recycle();
            if (h10.hasValue(l.f3645g6)) {
                this.f27471i = V7.c.a(context2, h10, l.f3645g6);
            }
            if (h10.hasValue(l.f3627e6)) {
                this.f27471i = m(this.f27471i.getDefaultColor(), h10.getColor(l.f3627e6, 0));
            }
            this.f27473j = V7.c.a(context2, h10, l.f3456L5);
            this.f27481n = o.f(h10.getInt(l.f3465M5, -1), null);
            this.f27475k = V7.c.a(context2, h10, l.f3618d6);
            this.f27491x = h10.getInt(l.f3483O5, 300);
            this.f27486s = h10.getDimensionPixelSize(l.f3555W5, -1);
            this.f27487t = h10.getDimensionPixelSize(l.f3546V5, -1);
            this.f27484q = h10.getResourceId(l.f3429I5, 0);
            this.f27489v = h10.getDimensionPixelSize(l.f3438J5, 0);
            this.f27493z = h10.getInt(l.f3564X5, 1);
            this.f27490w = h10.getInt(l.f3447K5, 0);
            this.f27451A = h10.getBoolean(l.f3537U5, false);
            this.f27455E = h10.getBoolean(l.f3654h6, false);
            h10.recycle();
            Resources resources = getResources();
            this.f27483p = resources.getDimensionPixelSize(H7.d.f3205i);
            this.f27488u = resources.getDimensionPixelSize(H7.d.f3204h);
            j();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        g(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f27457G;
        if (cVar2 != null) {
            B(cVar2);
        }
        this.f27457G = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(AbstractC3220a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
