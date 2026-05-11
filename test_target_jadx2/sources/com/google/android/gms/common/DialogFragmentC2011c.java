package com.google.android.gms.common;

import V6.AbstractC1287s;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: com.google.android.gms.common.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogFragmentC2011c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f23480a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f23481b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f23482c;

    public static DialogFragmentC2011c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC2011c dialogFragmentC2011c = new DialogFragmentC2011c();
        Dialog dialog2 = (Dialog) AbstractC1287s.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC2011c.f23480a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC2011c.f23481b = onCancelListener;
        }
        return dialogFragmentC2011c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f23481b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f23480a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f23482c == null) {
            this.f23482c = new AlertDialog.Builder((Context) AbstractC1287s.m(getActivity())).create();
        }
        return this.f23482c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
