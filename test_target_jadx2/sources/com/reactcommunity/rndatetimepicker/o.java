package com.reactcommunity.rndatetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m;

/* loaded from: classes2.dex */
public class o extends DialogInterfaceOnCancelListenerC1571m {

    /* renamed from: s, reason: collision with root package name */
    private TimePickerDialog f29232s;

    /* renamed from: t, reason: collision with root package name */
    private TimePickerDialog.OnTimeSetListener f29233t;

    /* renamed from: u, reason: collision with root package name */
    private DialogInterface.OnDismissListener f29234u;

    /* renamed from: v, reason: collision with root package name */
    private DialogInterface.OnClickListener f29235v;

    private TimePickerDialog V(Bundle bundle) {
        AbstractActivityC1577t activity = getActivity();
        TimePickerDialog W10 = W(bundle, activity, this.f29233t);
        if (bundle != null) {
            b.n(bundle, W10, this.f29235v);
            if (activity != null) {
                W10.setOnShowListener(b.m(activity, W10, bundle, b.g(bundle) == p.SPINNER));
            }
        }
        return W10;
    }

    static TimePickerDialog W(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        f fVar = new f(bundle);
        int b10 = fVar.b();
        int c10 = fVar.c();
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        if (bundle != null) {
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        boolean z10 = is24HourFormat;
        int i10 = (bundle == null || !d.g(bundle.getInt("minuteInterval"))) ? 1 : bundle.getInt("minuteInterval");
        p g10 = b.g(bundle);
        return g10 == p.SPINNER ? new n(context, e.f29222b, onTimeSetListener, b10, c10, i10, z10, g10) : new n(context, onTimeSetListener, b10, c10, i10, z10, g10);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m
    public Dialog M(Bundle bundle) {
        TimePickerDialog V10 = V(getArguments());
        this.f29232s = V10;
        return V10;
    }

    public void X(DialogInterface.OnDismissListener onDismissListener) {
        this.f29234u = onDismissListener;
    }

    void Y(DialogInterface.OnClickListener onClickListener) {
        this.f29235v = onClickListener;
    }

    public void Z(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f29233t = onTimeSetListener;
    }

    public void a0(Bundle bundle) {
        f fVar = new f(bundle);
        this.f29232s.updateTime(fVar.b(), fVar.c());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f29234u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
