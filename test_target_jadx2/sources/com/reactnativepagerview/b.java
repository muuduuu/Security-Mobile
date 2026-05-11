package com.reactnativepagerview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private Integer f29400a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29401b;

    /* renamed from: c, reason: collision with root package name */
    private int f29402c;

    /* renamed from: d, reason: collision with root package name */
    private float f29403d;

    /* renamed from: e, reason: collision with root package name */
    private float f29404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29402c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final boolean a(int i10, float f10) {
        int i11 = -((int) Math.signum(f10));
        if (i10 == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i11);
            }
            return false;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 != null) {
            return child2.canScrollVertically(i11);
        }
        return false;
    }

    private final void b(MotionEvent motionEvent) {
        androidx.viewpager2.widget.f parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            if (a(orientation, -1.0f) || a(orientation, 1.0f)) {
                if (motionEvent.getAction() == 0) {
                    this.f29403d = motionEvent.getX();
                    this.f29404e = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.f29403d;
                    float y10 = motionEvent.getY() - this.f29404e;
                    boolean z10 = orientation == 0;
                    float abs = Math.abs(x10) * (z10 ? 0.5f : 1.0f);
                    float abs2 = Math.abs(y10) * (z10 ? 1.0f : 0.5f);
                    int i10 = this.f29402c;
                    if (abs > i10 || abs2 > i10) {
                        if (z10 == (abs2 > abs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                            return;
                        }
                        if (!z10) {
                            x10 = y10;
                        }
                        if (a(orientation, x10)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
            }
        }
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final androidx.viewpager2.widget.f getParentViewPager() {
        View view;
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null && !(view instanceof androidx.viewpager2.widget.f)) {
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            if (view instanceof androidx.viewpager2.widget.f) {
                return (androidx.viewpager2.widget.f) view;
            }
            return null;
        }
        view = null;
    }

    public final boolean getDidSetInitialIndex() {
        return this.f29401b;
    }

    public final Integer getInitialIndex() {
        return this.f29400a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        b(e10);
        return super.onInterceptTouchEvent(e10);
    }

    public final void setDidSetInitialIndex(boolean z10) {
        this.f29401b = z10;
    }

    public final void setInitialIndex(Integer num) {
        this.f29400a = num;
    }
}
