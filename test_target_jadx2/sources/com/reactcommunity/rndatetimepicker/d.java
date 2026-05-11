package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import java.util.ArrayList;

/* loaded from: classes2.dex */
abstract class d extends TimePickerDialog {

    /* renamed from: a, reason: collision with root package name */
    private TimePicker f29210a;

    /* renamed from: b, reason: collision with root package name */
    private int f29211b;

    /* renamed from: c, reason: collision with root package name */
    private p f29212c;

    /* renamed from: d, reason: collision with root package name */
    private final TimePickerDialog.OnTimeSetListener f29213d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f29214e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f29215f;

    /* renamed from: g, reason: collision with root package name */
    private Context f29216g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TimePicker f29218b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29219c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f29220d;

        a(d dVar, int i10, TimePicker timePicker, int i11) {
            this.f29217a = i10;
            this.f29218b = timePicker;
            this.f29219c = i11;
            this.f29220d = dVar;
        }

        private void a() {
            this.f29218b.setHour(this.f29219c);
            this.f29218b.setMinute(this.f29217a);
        }

        private void b() {
            View findFocus = this.f29218b.findFocus();
            if (!(findFocus instanceof EditText)) {
                Log.e("RN-datetimepicker", "could not set selection on time picker, this is a known issue on some Huawei devices");
            } else {
                EditText editText = (EditText) findFocus;
                editText.setSelection(editText.getText().length());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f29220d.i()) {
                a();
            } else if (this.f29217a > 5) {
                a();
                b();
            }
        }
    }

    public d(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i10, int i11, int i12, boolean z10, p pVar) {
        super(context, onTimeSetListener, i10, i11, z10);
        this.f29214e = new Handler();
        this.f29211b = i12;
        this.f29213d = onTimeSetListener;
        this.f29212c = pVar;
        this.f29216g = context;
    }

    private void b(String str) {
        if (f()) {
            throw new RuntimeException(str);
        }
    }

    private void c(TimePicker timePicker, int i10, int i11) {
        b("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
        a aVar = new a(this, i11, timePicker, i10);
        this.f29215f = aVar;
        this.f29214e.postDelayed(aVar, 500L);
    }

    private int d() {
        return e(this.f29210a.getCurrentMinute().intValue());
    }

    private int e(int i10) {
        return f() ? i10 * this.f29211b : i10;
    }

    private boolean f() {
        return this.f29212c == p.SPINNER;
    }

    public static boolean g(int i10) {
        return i10 >= 1 && i10 <= 30 && 60 % i10 == 0;
    }

    private boolean h(int i10) {
        b("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
        return m() && i10 != l(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        View findViewById = findViewById(this.f29216g.getResources().getIdentifier("input_mode", "id", "android"));
        return findViewById != null && findViewById.hasFocus();
    }

    private void j() {
        NumberPicker numberPicker = (NumberPicker) findViewById(this.f29216g.getResources().getIdentifier("minute", "id", "android"));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((60 / this.f29211b) - 1);
        ArrayList arrayList = new ArrayList(60 / this.f29211b);
        int i10 = 0;
        while (i10 < 60) {
            arrayList.add(String.format("%02d", Integer.valueOf(i10)));
            i10 += this.f29211b;
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    private void k() {
        TimePicker timePicker = this.f29210a;
        if (timePicker == null) {
            Log.e("RN-datetimepicker", "time picker was null");
            return;
        }
        int intValue = timePicker.getCurrentMinute().intValue();
        if (!f()) {
            this.f29210a.setCurrentMinute(Integer.valueOf(l(intValue)));
        } else {
            j();
            this.f29210a.setCurrentMinute(Integer.valueOf(l(intValue) / this.f29211b));
        }
    }

    private int l(int i10) {
        int round = Math.round(i10 / this.f29211b);
        int i11 = this.f29211b;
        int i12 = round * i11;
        return i12 == 60 ? i12 - i11 : i12;
    }

    private boolean m() {
        return this.f29211b != 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29210a = (TimePicker) findViewById(this.f29216g.getResources().getIdentifier("timePicker", "id", "android"));
        if (m()) {
            k();
        }
    }

    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        boolean z10 = m() || f();
        TimePicker timePicker = this.f29210a;
        if (timePicker == null || i10 != -1 || !z10) {
            super.onClick(dialogInterface, i10);
            return;
        }
        timePicker.clearFocus();
        int intValue = this.f29210a.getCurrentHour().intValue();
        int d10 = d();
        if (m()) {
            d10 = l(d10);
        }
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f29213d;
        if (onTimeSetListener != null) {
            onTimeSetListener.onTimeSet(this.f29210a, intValue, d10);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f29214e.removeCallbacks(this.f29215f);
        super.onDetachedFromWindow();
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
        int e10 = e(i11);
        this.f29214e.removeCallbacks(this.f29215f);
        if (f() || !h(e10)) {
            super.onTimeChanged(timePicker, i10, i11);
        } else {
            c(timePicker, i10, l(e10));
        }
    }

    @Override // android.app.TimePickerDialog
    public void updateTime(int i10, int i11) {
        if (!m()) {
            super.updateTime(i10, i11);
        } else if (f()) {
            super.updateTime(i10, l(d()) / this.f29211b);
        } else {
            super.updateTime(i10, l(i11));
        }
    }

    public d(Context context, int i10, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z10, p pVar) {
        super(context, i10, onTimeSetListener, i11, i12, z10);
        this.f29214e = new Handler();
        this.f29211b = i13;
        this.f29213d = onTimeSetListener;
        this.f29212c = pVar;
        this.f29216g = context;
    }
}
