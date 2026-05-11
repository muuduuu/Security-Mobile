package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import wc.InterfaceC5068n;

/* loaded from: classes2.dex */
public final class f extends com.facebook.react.views.view.j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5068n f30096a;

    /* renamed from: b, reason: collision with root package name */
    private a f30097b;

    /* renamed from: c, reason: collision with root package name */
    private c f30098c;

    public f(Context context) {
        super(context);
    }

    private final void r() {
        a e10;
        InterfaceC5068n interfaceC5068n = this.f30096a;
        if (interfaceC5068n == null || (e10 = h.e(this)) == null) {
            return;
        }
        View rootView = getRootView();
        Intrinsics.e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        c a10 = h.a((ViewGroup) rootView, this);
        if (a10 == null) {
            return;
        }
        if (Intrinsics.b(this.f30097b, e10) && Intrinsics.b(this.f30098c, a10)) {
            return;
        }
        interfaceC5068n.n(this, e10, a10);
        this.f30097b = e10;
        this.f30098c = a10;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        r();
        return true;
    }

    public final void setOnInsetsChangeHandler(InterfaceC5068n interfaceC5068n) {
        this.f30096a = interfaceC5068n;
        r();
    }
}
