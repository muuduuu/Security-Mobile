package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import s5.C4313a;

/* loaded from: classes.dex */
public final class k0 extends com.facebook.react.Z {

    /* renamed from: z, reason: collision with root package name */
    private static final a f22099z = new a(null);

    /* renamed from: t, reason: collision with root package name */
    private final j0 f22100t;

    /* renamed from: u, reason: collision with root package name */
    private final com.facebook.react.uimanager.T f22101u;

    /* renamed from: v, reason: collision with root package name */
    private com.facebook.react.uimanager.S f22102v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22103w;

    /* renamed from: x, reason: collision with root package name */
    private int f22104x;

    /* renamed from: y, reason: collision with root package name */
    private int f22105y;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, j0 surface) {
        super(context);
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f22100t = surface;
        this.f22101u = new com.facebook.react.uimanager.T(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f22102v = new com.facebook.react.uimanager.S(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.Z, com.facebook.react.uimanager.A0
    public void a(Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        ReactHostImpl l10 = this.f22100t.l();
        Intrinsics.checkNotNullExpressionValue(l10, "getReactHost(...)");
        String objects = Objects.toString(t10.getMessage(), BuildConfig.FLAVOR);
        Intrinsics.d(objects);
        l10.I0(new com.facebook.react.uimanager.Q(objects, this, t10));
    }

    @Override // com.facebook.react.Z, com.facebook.react.uimanager.A0
    public void b(View view, MotionEvent ev) {
        com.facebook.react.uimanager.S s10;
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher i10 = this.f22100t.i();
        if (i10 == null) {
            return;
        }
        this.f22101u.g(ev, i10);
        if (view == null || (s10 = this.f22102v) == null) {
            return;
        }
        s10.p(view, ev, i10);
    }

    @Override // com.facebook.react.Z, com.facebook.react.uimanager.A0
    public void d(View childView, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher i10 = this.f22100t.i();
        if (i10 == null) {
            return;
        }
        this.f22101u.f(ev, i10);
        com.facebook.react.uimanager.S s10 = this.f22102v;
        if (s10 != null) {
            s10.o();
        }
    }

    @Override // com.facebook.react.Z
    protected void g(MotionEvent event, boolean z10) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f22102v == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC1721a.J("ReactSurfaceView", "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher i10 = this.f22100t.i();
        if (i10 == null) {
            AbstractC1721a.J("ReactSurfaceView", "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        com.facebook.react.uimanager.S s10 = this.f22102v;
        if (s10 != null) {
            s10.k(event, i10, z10);
        }
    }

    @Override // com.facebook.react.Z
    public ReactContext getCurrentReactContext() {
        if (this.f22100t.o()) {
            return this.f22100t.l().k();
        }
        return null;
    }

    @Override // com.facebook.react.Z, com.facebook.react.uimanager.InterfaceC1965r0
    public String getJSModuleName() {
        String j10 = this.f22100t.j();
        Intrinsics.checkNotNullExpressionValue(j10, "<get-moduleName>(...)");
        return j10;
    }

    @Override // com.facebook.react.Z, com.facebook.react.uimanager.InterfaceC1965r0
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.Z
    protected void h(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher i10 = this.f22100t.i();
        if (i10 != null) {
            this.f22101u.d(event, i10, this.f22100t.l().k());
        } else {
            AbstractC1721a.J("ReactSurfaceView", "Unable to dispatch touch events to JS as the React instance has not been attached");
        }
    }

    @Override // com.facebook.react.Z
    public boolean i() {
        return this.f22100t.o() && this.f22100t.l().k() != null;
    }

    @Override // com.facebook.react.Z
    public boolean j() {
        return this.f22100t.o() && this.f22100t.l().K0();
    }

    @Override // com.facebook.react.Z
    public boolean o() {
        return this.f22100t.o();
    }

    @Override // com.facebook.react.Z, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f22103w && z10) {
            Point viewportOffset = getViewportOffset();
            this.f22100t.s(this.f22104x, this.f22105y, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.Z, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        C4313a.c(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                i14 = Math.max(i14, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            i12 = i14;
        } else {
            i12 = View.MeasureSpec.getSize(i10);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int i16 = 0;
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                i16 = Math.max(i16, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            i13 = i16;
        } else {
            i13 = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(i12, i13);
        this.f22103w = true;
        this.f22104x = i10;
        this.f22105y = i11;
        Point viewportOffset = getViewportOffset();
        this.f22100t.s(i10, i11, viewportOffset.x, viewportOffset.y);
        C4313a.i(0L);
    }

    @Override // com.facebook.react.Z, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override // com.facebook.react.Z
    public void setIsFabric(boolean z10) {
        super.setIsFabric(true);
    }
}
