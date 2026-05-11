package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1514p0;
import androidx.core.view.K0;
import com.facebook.react.bridge.ReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ga.C3214g;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends com.facebook.react.views.view.j {

    /* renamed from: j, reason: collision with root package name */
    public static final a f30060j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ReactContext f30061a;

    /* renamed from: b, reason: collision with root package name */
    private int f30062b;

    /* renamed from: c, reason: collision with root package name */
    private int f30063c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30064d;

    /* renamed from: e, reason: collision with root package name */
    private float f30065e;

    /* renamed from: f, reason: collision with root package name */
    private int f30066f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30067g;

    /* renamed from: h, reason: collision with root package name */
    private final c f30068h;

    /* renamed from: i, reason: collision with root package name */
    private b f30069i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends BottomSheetBehavior.f {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            w.this.f30065e = Math.max(f10, 0.0f);
            if (w.this.f30064d) {
                return;
            }
            w wVar = w.this;
            int i10 = wVar.f30062b;
            int reactHeight = w.this.getReactHeight();
            w wVar2 = w.this;
            wVar.C(i10, reactHeight, wVar2.J(wVar2.f30065e), w.this.f30066f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (C3214g.f33640a.b(i10)) {
                if (i10 == 3 || i10 == 4 || i10 == 6) {
                    w wVar = w.this;
                    wVar.C(wVar.f30062b, w.this.getReactHeight(), w.this.I(i10), w.this.f30066f);
                }
                w.this.f30063c = i10;
            }
        }
    }

    public static final class c extends C1514p0.b {
        c() {
            super(0);
        }

        @Override // androidx.core.view.C1514p0.b
        public void onEnd(C1514p0 animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            w.this.f30064d = false;
        }

        @Override // androidx.core.view.C1514p0.b
        public K0 onProgress(K0 insets, List runningAnimations) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
            w.this.f30066f = insets.f(K0.m.b()).f15927d - insets.f(K0.m.e()).f15927d;
            w wVar = w.this;
            int i10 = wVar.f30062b;
            int reactHeight = w.this.getReactHeight();
            w wVar2 = w.this;
            wVar.C(i10, reactHeight, wVar2.J(wVar2.f30065e), w.this.f30066f);
            return insets;
        }

        @Override // androidx.core.view.C1514p0.b
        public C1514p0.a onStart(C1514p0 animation, C1514p0.a bounds) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            w.this.f30064d = true;
            C1514p0.a onStart = super.onStart(animation, bounds);
            Intrinsics.checkNotNullExpressionValue(onStart, "onStart(...)");
            return onStart;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f30061a = reactContext;
        this.f30063c = 5;
        c cVar = new c();
        this.f30068h = cVar;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        AbstractC1484a0.N0(decorView, cVar);
        this.f30069i = new b();
    }

    public static /* synthetic */ void D(w wVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        wVar.C(i10, i11, i12, i13);
    }

    private final r G() {
        r screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final BottomSheetBehavior H() {
        BottomSheetBehavior<r> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(int i10) {
        BottomSheetBehavior H10 = H();
        if (i10 == 3) {
            return H10.h0();
        }
        if (i10 == 4) {
            return this.f30062b - H10.l0();
        }
        if (i10 == 5) {
            return this.f30062b;
        }
        if (i10 == 6) {
            return (int) (this.f30062b * (1 - H10.i0()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J(float f10) {
        r screenParent = getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) R7.a.a(I(4), I(3), f10);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.f30062b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final r getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof r) {
            return (r) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<r> getSheetBehavior() {
        return G().getSheetBehavior();
    }

    public final void C(int i10, int i11, int i12, int i13) {
        int max = ((i10 - i11) - i12) - Math.max(i13, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(max, 0));
        setBottom(getTop() + reactHeight);
    }

    public final void E(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this.f30062b = i14;
        D(this, i14, getReactHeight(), I(H().m0()), 0, 8, null);
    }

    public final void F(BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.f30067g) {
            return;
        }
        behavior.W(this.f30069i);
        this.f30067g = true;
    }

    public final void K(BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.f30067g) {
            behavior.s0(this.f30069i);
            this.f30067g = false;
        }
    }

    public final ReactContext getReactContext() {
        return this.f30061a;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<r> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            F(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<r> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            K(sheetBehavior);
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getHasReceivedInitialLayoutFromParent()) {
            C(this.f30062b, i13 - i11, I(H().m0()), this.f30066f);
        }
    }
}
