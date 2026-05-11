package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.K0;
import c3.AbstractC1721a;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.devsupport.i0;
import java.util.Objects;

/* loaded from: classes.dex */
class i0 implements v4.i {

    /* renamed from: a, reason: collision with root package name */
    private final L f21622a = new L();

    /* renamed from: b, reason: collision with root package name */
    private final C4.e f21623b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f21624c;

    /* renamed from: d, reason: collision with root package name */
    private e0 f21625d;

    class a extends Dialog {
        a(Context context, int i10) {
            super(context, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ K0 b(int i10, View view, K0 k02) {
            androidx.core.graphics.e f10 = k02.f(i10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMargins(f10.f15924a, f10.f15925b, f10.f15926c, f10.f15927d);
            return K0.f16032b;
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            Objects.requireNonNull(getWindow());
            getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
            final int g10 = K0.m.g() | K0.m.a();
            AbstractC1484a0.F0(i0.this.f21625d, new androidx.core.view.I() { // from class: com.facebook.react.devsupport.h0
                @Override // androidx.core.view.I
                public final K0 p(View view, K0 k02) {
                    K0 b10;
                    b10 = i0.a.b(g10, view, k02);
                    return b10;
                }
            });
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            if (i10 == 82) {
                i0.this.f21623b.C();
                return true;
            }
            if (i0.this.f21622a.b(i10, getCurrentFocus())) {
                i0.this.f21623b.q();
            }
            return super.onKeyUp(i10, keyEvent);
        }
    }

    public i0(C4.e eVar) {
        this.f21623b = eVar;
    }

    @Override // v4.i
    public boolean a() {
        Dialog dialog = this.f21624c;
        return dialog != null && dialog.isShowing();
    }

    @Override // v4.i
    public void b() {
        String l10 = this.f21623b.l();
        Activity a10 = this.f21623b.a();
        if (a10 == null || a10.isFinishing()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
            if (l10 == null) {
                l10 = "N/A";
            }
            sb2.append(l10);
            AbstractC1721a.m("ReactNative", sb2.toString());
            return;
        }
        e0 e0Var = this.f21625d;
        if (e0Var == null || e0Var.getContext() != a10) {
            f(NativeRedBoxSpec.NAME);
        }
        this.f21625d.d();
        if (this.f21624c == null) {
            a aVar = new a(a10, com.facebook.react.r.f21954c);
            this.f21624c = aVar;
            aVar.requestWindowFeature(1);
            this.f21624c.setContentView(this.f21625d);
        }
        this.f21624c.show();
    }

    @Override // v4.i
    public void c() {
        Dialog dialog = this.f21624c;
        if (dialog != null) {
            dialog.dismiss();
            e();
            this.f21624c = null;
        }
    }

    @Override // v4.i
    public boolean d() {
        return this.f21625d != null;
    }

    @Override // v4.i
    public void e() {
        this.f21625d = null;
    }

    @Override // v4.i
    public void f(String str) {
        this.f21623b.y();
        Activity a10 = this.f21623b.a();
        if (a10 != null && !a10.isFinishing()) {
            e0 e0Var = new e0(a10);
            this.f21625d = e0Var;
            e0Var.e(this.f21623b).g(null).c();
            return;
        }
        String l10 = this.f21623b.l();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
        if (l10 == null) {
            l10 = "N/A";
        }
        sb2.append(l10);
        AbstractC1721a.m("ReactNative", sb2.toString());
    }
}
