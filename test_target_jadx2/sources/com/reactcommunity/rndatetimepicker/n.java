package com.reactcommunity.rndatetimepicker;

import android.R;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TimePicker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class n extends d {
    public n(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i10, int i11, int i12, boolean z10, p pVar) {
        super(context, onTimeSetListener, i10, i11, i12, z10, pVar);
        n(context, i10, i11, z10, pVar);
    }

    private void n(Context context, int i10, int i11, boolean z10, p pVar) {
        if (Build.VERSION.SDK_INT == 24 && pVar == p.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("TimePicker").get(null), R.attr.timePickerStyle, 0).recycle();
                TimePicker timePicker = (TimePicker) q.a(TimePickerDialog.class, TimePicker.class, "mTimePicker").get(this);
                Field a10 = q.a(TimePicker.class, Class.forName("android.widget.TimePicker$TimePickerDelegate"), "mDelegate");
                Object obj = a10.get(timePicker);
                Class<?> cls = Class.forName("android.widget.TimePickerSpinnerDelegate");
                if (obj.getClass() != cls) {
                    a10.set(timePicker, null);
                    timePicker.removeAllViews();
                    Class cls2 = Integer.TYPE;
                    Constructor<?> constructor = cls.getConstructor(TimePicker.class, Context.class, AttributeSet.class, cls2, cls2);
                    constructor.setAccessible(true);
                    a10.set(timePicker, constructor.newInstance(timePicker, context, null, Integer.valueOf(R.attr.timePickerStyle), 0));
                    timePicker.setIs24HourView(Boolean.valueOf(z10));
                    timePicker.setCurrentHour(Integer.valueOf(i10));
                    timePicker.setCurrentMinute(Integer.valueOf(i11));
                    timePicker.setOnTimeChangedListener(this);
                }
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // com.reactcommunity.rndatetimepicker.d, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.reactcommunity.rndatetimepicker.d, android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) {
        super.onClick(dialogInterface, i10);
    }

    @Override // com.reactcommunity.rndatetimepicker.d, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }

    @Override // com.reactcommunity.rndatetimepicker.d, android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public /* bridge */ /* synthetic */ void onTimeChanged(TimePicker timePicker, int i10, int i11) {
        super.onTimeChanged(timePicker, i10, i11);
    }

    @Override // com.reactcommunity.rndatetimepicker.d, android.app.TimePickerDialog
    public /* bridge */ /* synthetic */ void updateTime(int i10, int i11) {
        super.updateTime(i10, i11);
    }

    public n(Context context, int i10, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z10, p pVar) {
        super(context, i10, onTimeSetListener, i11, i12, i13, z10, pVar);
        n(context, i11, i12, z10, pVar);
    }
}
