package com.google.android.gms.common;

import V6.AbstractC1287s;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m;

/* renamed from: com.google.android.gms.common.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2028u extends DialogInterfaceOnCancelListenerC1571m {

    /* renamed from: s, reason: collision with root package name */
    private Dialog f23523s;

    /* renamed from: t, reason: collision with root package name */
    private DialogInterface.OnCancelListener f23524t;

    /* renamed from: u, reason: collision with root package name */
    private Dialog f23525u;

    public static C2028u V(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C2028u c2028u = new C2028u();
        Dialog dialog2 = (Dialog) AbstractC1287s.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c2028u.f23523s = dialog2;
        if (onCancelListener != null) {
            c2028u.f23524t = onCancelListener;
        }
        return c2028u;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m
    public Dialog M(Bundle bundle) {
        Dialog dialog = this.f23523s;
        if (dialog != null) {
            return dialog;
        }
        S(false);
        if (this.f23525u == null) {
            this.f23525u = new AlertDialog.Builder((Context) AbstractC1287s.m(getContext())).create();
        }
        return this.f23525u;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m
    public void U(androidx.fragment.app.G g10, String str) {
        super.U(g10, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f23524t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
