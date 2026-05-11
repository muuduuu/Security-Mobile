package com.facebook.react.devsupport;

import C4.e;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.react.AbstractC1898m;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.AbstractC1901p;
import com.facebook.react.bridge.UiThreadUtil;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
class b0 implements C4.h {

    /* renamed from: a, reason: collision with root package name */
    private final y0.h f21577a;

    /* renamed from: b, reason: collision with root package name */
    private Dialog f21578b;

    public b0(y0.h hVar) {
        this.f21577a = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Dialog dialog = this.f21578b;
        if (dialog != null) {
            dialog.dismiss();
            this.f21578b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final e.a aVar, String str) {
        Dialog dialog = this.f21578b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) this.f21577a.get();
        if (context == null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(AbstractC1901p.f21911c, (ViewGroup) null);
        ((View) AbstractC4012a.c(inflate.findViewById(AbstractC1899n.f21892k))).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.a.this.a();
            }
        });
        ((TextView) AbstractC4012a.c((TextView) inflate.findViewById(AbstractC1899n.f21893l))).setText(str);
        Dialog dialog2 = new Dialog(context, com.facebook.react.r.f21952a);
        this.f21578b = dialog2;
        dialog2.setContentView(inflate);
        this.f21578b.setCancelable(false);
        Window window = this.f21578b.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(0.0f);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(AbstractC1898m.f21712a);
        }
        this.f21578b.show();
    }

    @Override // C4.h
    public void h() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.Z
            @Override // java.lang.Runnable
            public final void run() {
                b0.this.d();
            }
        });
    }

    @Override // C4.h
    public void j(final String str, final e.a aVar) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.Y
            @Override // java.lang.Runnable
            public final void run() {
                b0.this.f(aVar, str);
            }
        });
    }
}
