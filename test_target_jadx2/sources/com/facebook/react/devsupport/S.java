package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import g5.C3193c;
import kotlin.jvm.internal.Intrinsics;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public final class S implements v4.i {

    /* renamed from: a, reason: collision with root package name */
    private final C4.e f21546a;

    /* renamed from: b, reason: collision with root package name */
    private View f21547b;

    /* renamed from: c, reason: collision with root package name */
    private Q f21548c;

    public S(C4.e devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.f21546a = devSupportManager;
    }

    @Override // v4.i
    public boolean a() {
        Q q10 = this.f21548c;
        if (q10 != null) {
            return q10.isShowing();
        }
        return false;
    }

    @Override // v4.i
    public void b() {
        if (a() || !d()) {
            return;
        }
        Activity a10 = this.f21546a.a();
        if (a10 == null || a10.isFinishing()) {
            C3193c.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        Q q10 = new Q(a10, this.f21547b);
        this.f21548c = q10;
        q10.setCancelable(false);
        q10.show();
    }

    @Override // v4.i
    public void c() {
        Q q10;
        if (a() && (q10 = this.f21548c) != null) {
            q10.dismiss();
        }
        View view = this.f21547b;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.f21547b);
        }
        this.f21548c = null;
    }

    @Override // v4.i
    public boolean d() {
        return this.f21547b != null;
    }

    @Override // v4.i
    public void e() {
        View view = this.f21547b;
        if (view != null) {
            this.f21546a.e(view);
            this.f21547b = null;
        }
    }

    @Override // v4.i
    public void f(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        AbstractC4012a.b(Intrinsics.b(appKey, "LogBox"), "This surface manager can only create LogBox React application");
        View b10 = this.f21546a.b("LogBox");
        this.f21547b = b10;
        if (b10 == null) {
            C3193c.a("Unable to launch logbox because react was unable to create the root view");
        }
    }
}
