package com.facebook.react.modules.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.appcompat.app.c;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m;
import com.facebook.react.modules.dialog.DialogModule;
import g.AbstractC3179j;

/* loaded from: classes.dex */
public class a extends DialogInterfaceOnCancelListenerC1571m implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    private final DialogModule.b f21806s;

    public a() {
        this.f21806s = null;
    }

    private static Dialog V(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        c.a o10 = new c.a(context).o(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            o10.l(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            o10.i(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            o10.j(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            o10.h(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            o10.g(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return o10.a();
    }

    private static Dialog W(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }

    public static Dialog X(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        return Y(context) ? V(context, bundle, onClickListener) : W(context, bundle, onClickListener);
    }

    private static boolean Y(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC3179j.f33483y0);
        boolean hasValue = obtainStyledAttributes.hasValue(AbstractC3179j.f33256D0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m
    public Dialog M(Bundle bundle) {
        return X(requireActivity(), requireArguments(), this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        DialogModule.b bVar = this.f21806s;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i10);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.f21806s;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    public a(DialogModule.b bVar, Bundle bundle) {
        this.f21806s = bVar;
        setArguments(bundle);
    }
}
