package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public class i extends DialogInterfaceOnCancelListenerC1571m {

    /* renamed from: s, reason: collision with root package name */
    private DatePickerDialog f29228s;

    /* renamed from: t, reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f29229t;

    /* renamed from: u, reason: collision with root package name */
    private DialogInterface.OnDismissListener f29230u;

    /* renamed from: v, reason: collision with root package name */
    private DialogInterface.OnClickListener f29231v;

    private DatePickerDialog W(final Bundle bundle) {
        AbstractActivityC1577t activity = getActivity();
        DatePickerDialog X10 = X(bundle, activity, this.f29229t);
        if (bundle != null) {
            b.n(bundle, X10, this.f29231v);
            if (activity != null) {
                X10.setOnShowListener(b.m(activity, X10, bundle, b.f(bundle) == j.SPINNER));
            }
        }
        final DatePicker datePicker = X10.getDatePicker();
        final long k10 = b.k(bundle);
        final long j10 = b.j(bundle);
        if (bundle.containsKey("minimumDate")) {
            datePicker.setMinDate(k10);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle.containsKey("maximumDate")) {
            datePicker.setMaxDate(j10);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (bundle.containsKey("firstDayOfWeek")) {
            datePicker.setFirstDayOfWeek(bundle.getInt("firstDayOfWeek"));
        }
        if (i10 >= 26 && (bundle.containsKey("maximumDate") || bundle.containsKey("minimumDate"))) {
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() { // from class: com.reactcommunity.rndatetimepicker.h
                @Override // android.widget.DatePicker.OnDateChangedListener
                public final void onDateChanged(DatePicker datePicker2, int i11, int i12, int i13) {
                    i.Y(bundle, k10, j10, datePicker, datePicker2, i11, i12, i13);
                }
            });
        }
        if (bundle.containsKey("testID")) {
            datePicker.setTag(bundle.getString("testID"));
        }
        return X10;
    }

    static DatePickerDialog X(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        f fVar = new f(bundle);
        int e10 = fVar.e();
        int d10 = fVar.d();
        int a10 = fVar.a();
        j f10 = (bundle == null || bundle.getString("display", null) == null) ? b.f(bundle) : j.valueOf(bundle.getString("display").toUpperCase(Locale.US));
        return f10 == j.SPINNER ? new m(context, e.f29221a, onDateSetListener, e10, d10, a10, f10) : new m(context, onDateSetListener, e10, d10, a10, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(Bundle bundle, long j10, long j11, DatePicker datePicker, DatePicker datePicker2, int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance(b.h(bundle));
        calendar.set(i10, i11, i12, 0, 0, 0);
        calendar.setTimeInMillis(Math.min(Math.max(calendar.getTimeInMillis(), j10), j11));
        if (datePicker.getYear() == calendar.get(1) && datePicker.getMonth() == calendar.get(2) && datePicker.getDayOfMonth() == calendar.get(5)) {
            return;
        }
        datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m
    public Dialog M(Bundle bundle) {
        DatePickerDialog W10 = W(getArguments());
        this.f29228s = W10;
        return W10;
    }

    void Z(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f29229t = onDateSetListener;
    }

    void a0(DialogInterface.OnDismissListener onDismissListener) {
        this.f29230u = onDismissListener;
    }

    void b0(DialogInterface.OnClickListener onClickListener) {
        this.f29231v = onClickListener;
    }

    public void c0(Bundle bundle) {
        f fVar = new f(bundle);
        this.f29228s.updateDate(fVar.e(), fVar.d(), fVar.a());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f29230u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
