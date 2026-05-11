package com.google.android.material.bottomsheet;

import H7.h;
import H7.k;
import Y7.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.s;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import androidx.core.view.I;
import androidx.core.view.K0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import z0.C5228A;

/* loaded from: classes2.dex */
public class a extends s {

    /* renamed from: f, reason: collision with root package name */
    private BottomSheetBehavior f26714f;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f26715g;

    /* renamed from: h, reason: collision with root package name */
    private CoordinatorLayout f26716h;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f26717i;

    /* renamed from: j, reason: collision with root package name */
    boolean f26718j;

    /* renamed from: k, reason: collision with root package name */
    boolean f26719k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26720l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26721m;

    /* renamed from: n, reason: collision with root package name */
    private BottomSheetBehavior.f f26722n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26723o;

    /* renamed from: p, reason: collision with root package name */
    private BottomSheetBehavior.f f26724p;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0395a implements I {
        C0395a() {
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            if (a.this.f26722n != null) {
                a.this.f26714f.s0(a.this.f26722n);
            }
            if (k02 != null) {
                a aVar = a.this;
                aVar.f26722n = new f(aVar.f26717i, k02, null);
                a.this.f26714f.W(a.this.f26722n);
            }
            return k02;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f26719k && aVar.isShowing() && a.this.q()) {
                a.this.cancel();
            }
        }
    }

    class c extends C1483a {
        c() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            if (!a.this.f26719k) {
                c5228a.v0(false);
            } else {
                c5228a.a(1048576);
                c5228a.v0(true);
            }
        }

        @Override // androidx.core.view.C1483a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f26719k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    private static class f extends BottomSheetBehavior.f {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26730a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26731b;

        /* renamed from: c, reason: collision with root package name */
        private final K0 f26732c;

        /* synthetic */ f(View view, K0 k02, C0395a c0395a) {
            this(view, k02);
        }

        private void d(View view) {
            if (view.getTop() < this.f26732c.l()) {
                a.p(view, this.f26730a);
                view.setPadding(view.getPaddingLeft(), this.f26732c.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.p(view, this.f26731b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i10) {
            d(view);
        }

        private f(View view, K0 k02) {
            this.f26732c = k02;
            boolean z10 = (view.getSystemUiVisibility() & 8192) != 0;
            this.f26731b = z10;
            g j02 = BottomSheetBehavior.f0(view).j0();
            ColorStateList x10 = j02 != null ? j02.x() : AbstractC1484a0.r(view);
            if (x10 != null) {
                this.f26730a = M7.a.f(x10.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f26730a = M7.a.f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f26730a = z10;
            }
        }
    }

    public a(Context context) {
        this(context, 0);
        this.f26723o = getContext().getTheme().obtainStyledAttributes(new int[]{H7.b.f3148u}).getBoolean(0, false);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(H7.b.f3132e, typedValue, true) ? typedValue.resourceId : k.f3329e;
    }

    private FrameLayout m() {
        if (this.f26715g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f3278a, null);
            this.f26715g = frameLayout;
            this.f26716h = (CoordinatorLayout) frameLayout.findViewById(H7.f.f3252d);
            FrameLayout frameLayout2 = (FrameLayout) this.f26715g.findViewById(H7.f.f3253e);
            this.f26717i = frameLayout2;
            BottomSheetBehavior f02 = BottomSheetBehavior.f0(frameLayout2);
            this.f26714f = f02;
            f02.W(this.f26724p);
            this.f26714f.C0(this.f26719k);
        }
        return this.f26715g;
    }

    public static void p(View view, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private View r(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f26715g.findViewById(H7.f.f3252d);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f26723o) {
            AbstractC1484a0.F0(this.f26717i, new C0395a());
        }
        this.f26717i.removeAllViews();
        if (layoutParams == null) {
            this.f26717i.addView(view);
        } else {
            this.f26717i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(H7.f.f3248S).setOnClickListener(new b());
        AbstractC1484a0.q0(this.f26717i, new c());
        this.f26717i.setOnTouchListener(new d());
        return this.f26715g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior n10 = n();
        if (!this.f26718j || n10.m0() == 5) {
            super.cancel();
        } else {
            n10.J0(5);
        }
    }

    public BottomSheetBehavior n() {
        if (this.f26714f == null) {
            m();
        }
        return this.f26714f;
    }

    public void o(boolean z10) {
        this.f26718j = z10;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f26723o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f26715g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f26716h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            if (z10) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // androidx.appcompat.app.s, androidx.activity.j, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.j, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f26714f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.m0() != 5) {
            return;
        }
        this.f26714f.J0(4);
    }

    boolean q() {
        if (!this.f26721m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f26720l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f26721m = true;
        }
        return this.f26720l;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f26719k != z10) {
            this.f26719k = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f26714f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C0(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f26719k) {
            this.f26719k = true;
        }
        this.f26720l = z10;
        this.f26721m = true;
    }

    @Override // androidx.appcompat.app.s, androidx.activity.j, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(r(i10, null, null));
    }

    @Override // androidx.appcompat.app.s, androidx.activity.j, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(r(0, view, null));
    }

    @Override // androidx.appcompat.app.s, androidx.activity.j, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(r(0, view, layoutParams));
    }

    public a(Context context, int i10) {
        super(context, f(context, i10));
        this.f26719k = true;
        this.f26720l = true;
        this.f26724p = new e();
        h(1);
        this.f26723o = getContext().getTheme().obtainStyledAttributes(new int[]{H7.b.f3148u}).getBoolean(0, false);
    }
}
