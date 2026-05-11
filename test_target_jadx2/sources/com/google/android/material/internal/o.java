package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.I;
import androidx.core.view.K0;
import co.hyperverge.hypersnapsdk.objects.HVError;

/* loaded from: classes2.dex */
public abstract class o {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f27290a;

        a(View view) {
            this.f27290a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f27290a.getContext().getSystemService("input_method")).showSoftInput(this.f27290a, 1);
        }
    }

    class b implements I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f27291a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f27292b;

        b(d dVar, e eVar) {
            this.f27291a = dVar;
            this.f27292b = eVar;
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            return this.f27291a.a(view, k02, new e(this.f27292b));
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            AbstractC1484a0.n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        K0 a(View view, K0 k02, e eVar);
    }

    public static void a(View view, d dVar) {
        AbstractC1484a0.F0(view, new b(dVar, new e(AbstractC1484a0.F(view), view.getPaddingTop(), AbstractC1484a0.E(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += AbstractC1484a0.v((View) parent);
        }
        return f10;
    }

    public static boolean e(View view) {
        return AbstractC1484a0.A(view) == 1;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(View view) {
        if (AbstractC1484a0.T(view)) {
            AbstractC1484a0.n0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f27293a;

        /* renamed from: b, reason: collision with root package name */
        public int f27294b;

        /* renamed from: c, reason: collision with root package name */
        public int f27295c;

        /* renamed from: d, reason: collision with root package name */
        public int f27296d;

        public e(int i10, int i11, int i12, int i13) {
            this.f27293a = i10;
            this.f27294b = i11;
            this.f27295c = i12;
            this.f27296d = i13;
        }

        public e(e eVar) {
            this.f27293a = eVar.f27293a;
            this.f27294b = eVar.f27294b;
            this.f27295c = eVar.f27295c;
            this.f27296d = eVar.f27296d;
        }
    }
}
