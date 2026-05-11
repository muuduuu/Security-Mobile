package com.facebook.react.views.drawer;

import P0.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1948i0;
import com.facebook.react.uimanager.events.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z0.C5228A;

/* loaded from: classes2.dex */
public final class a extends P0.a {

    /* renamed from: p0, reason: collision with root package name */
    public static final b f22511p0 = new b(null);

    /* renamed from: m0, reason: collision with root package name */
    private int f22512m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f22513n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f22514o0;

    /* renamed from: com.facebook.react.views.drawer.a$a, reason: collision with other inner class name */
    public static final class C0384a extends C1483a {
        C0384a() {
        }

        @Override // androidx.core.view.C1483a
        public void f(View host, AccessibilityEvent event) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(event, "event");
            super.f(host, event);
            Object tag = host.getTag(AbstractC1899n.f21888g);
            if (tag instanceof C1948i0.e) {
                event.setClassName(C1948i0.e.getValue((C1948i0.e) tag));
            }
        }

        @Override // androidx.core.view.C1483a
        public void g(View host, C5228A info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.g(host, info);
            C1948i0.e fromViewTag = C1948i0.e.fromViewTag(host);
            if (fromViewTag != null) {
                info.q0(C1948i0.e.getValue(fromViewTag));
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f22512m0 = 8388611;
        this.f22513n0 = -1;
        AbstractC1484a0.q0(this, new C0384a());
    }

    public final void W() {
        d(this.f22512m0);
    }

    public final void X() {
        I(this.f22512m0);
    }

    public final void Y() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            a.f fVar = (a.f) layoutParams;
            fVar.f7418a = this.f22512m0;
            ((ViewGroup.MarginLayoutParams) fVar).width = this.f22513n0;
            childAt.setLayoutParams(fVar);
            childAt.setClickable(true);
        }
    }

    @Override // P0.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            if (!super.onInterceptTouchEvent(ev)) {
                return false;
            }
            l.b(this, ev);
            this.f22514o0 = true;
            return true;
        } catch (IllegalArgumentException e10) {
            AbstractC1721a.K("ReactNative", "Error intercepting touch event.", e10);
            return false;
        }
    }

    @Override // P0.a, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getActionMasked() == 1 && this.f22514o0) {
            l.a(this, ev);
            this.f22514o0 = false;
        }
        return super.onTouchEvent(ev);
    }

    public final void setDrawerPosition$ReactAndroid_release(int i10) {
        this.f22512m0 = i10;
        Y();
    }

    public final void setDrawerWidth$ReactAndroid_release(int i10) {
        this.f22513n0 = i10;
        Y();
    }
}
