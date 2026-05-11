package com.google.android.gms.common;

import V6.C1266b0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import e7.AbstractC3091c;

/* renamed from: com.google.android.gms.common.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2027t extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f23519a;

    /* renamed from: b, reason: collision with root package name */
    private int f23520b;

    /* renamed from: c, reason: collision with root package name */
    private View f23521c;

    /* renamed from: d, reason: collision with root package name */
    private View.OnClickListener f23522d;

    public ViewOnClickListenerC2027t(Context context) {
        this(context, null);
    }

    private final void b(Context context) {
        View view = this.f23521c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f23521c = C1266b0.c(context, this.f23519a, this.f23520b);
        } catch (AbstractC3091c.a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i10 = this.f23519a;
            int i11 = this.f23520b;
            V6.B b10 = new V6.B(context, null);
            b10.a(context.getResources(), i10, i11);
            this.f23521c = b10;
        }
        addView(this.f23521c);
        this.f23521c.setEnabled(isEnabled());
        this.f23521c.setOnClickListener(this);
    }

    public void a(int i10, int i11) {
        this.f23519a = i10;
        this.f23520b = i11;
        b(getContext());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f23522d;
        if (onClickListener == null || view != this.f23521c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        a(this.f23519a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f23521c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23522d = onClickListener;
        View view = this.f23521c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f23519a, this.f23520b);
    }

    public void setSize(int i10) {
        a(i10, this.f23520b);
    }

    public ViewOnClickListenerC2027t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC2027t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23522d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, P6.d.f7544b, 0, 0);
        try {
            this.f23519a = obtainStyledAttributes.getInt(P6.d.f7545c, 0);
            this.f23520b = obtainStyledAttributes.getInt(P6.d.f7546d, 2);
            obtainStyledAttributes.recycle();
            a(this.f23519a, this.f23520b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
