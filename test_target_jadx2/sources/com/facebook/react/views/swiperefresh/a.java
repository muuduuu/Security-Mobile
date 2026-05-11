package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.events.l;

/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: n0, reason: collision with root package name */
    private boolean f22741n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f22742o0;

    /* renamed from: p0, reason: collision with root package name */
    private float f22743p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f22744q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f22745r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f22746s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f22747t0;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.f22741n0 = false;
        this.f22742o0 = false;
        this.f22743p0 = 0.0f;
        this.f22747t0 = false;
        this.f22744q0 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22745r0 = motionEvent.getX();
            this.f22746s0 = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f22745r0);
            if (this.f22746s0 || abs > this.f22744q0) {
                this.f22746s0 = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public boolean c() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.canScrollVertically(-1) : super.c();
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!B(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        l.b(this, motionEvent);
        this.f22747t0 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f22741n0) {
            return;
        }
        this.f22741n0 = true;
        setProgressViewOffset(this.f22743p0);
        setRefreshing(this.f22742o0);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.f22747t0) {
            l.a(this, motionEvent);
            this.f22747t0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setProgressViewOffset(float f10) {
        this.f22743p0 = f10;
        if (this.f22741n0) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(C1944g0.g(f10)) - progressCircleDiameter, Math.round(C1944g0.g(f10 + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean z10) {
        this.f22742o0 = z10;
        if (this.f22741n0) {
            super.setRefreshing(z10);
        }
    }
}
