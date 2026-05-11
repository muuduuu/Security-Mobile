package com.reactcommunity.rndatetimepicker;

import android.R;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class m extends DatePickerDialog {
    public m(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i10, int i11, int i12, j jVar) {
        super(context, onDateSetListener, i10, i11, i12);
        a(context, i10, i11, i12, jVar);
    }

    private void a(Context context, int i10, int i11, int i12, j jVar) {
        if (Build.VERSION.SDK_INT == 24 && jVar == j.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("DatePicker").get(null), R.attr.datePickerStyle, 0).recycle();
                DatePicker datePicker = (DatePicker) q.a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field a10 = q.a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                Object obj = a10.get(datePicker);
                if (obj.getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    a10.set(datePicker, null);
                    datePicker.removeAllViews();
                    Class cls = Integer.TYPE;
                    Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, cls, cls);
                    declaredMethod.setAccessible(true);
                    a10.set(datePicker, declaredMethod.invoke(datePicker, context, null, Integer.valueOf(R.attr.datePickerStyle), 0));
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(i10, i11, i12, this);
                }
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        if (jVar != j.SPINNER || getDatePicker() == null) {
            return;
        }
        getDatePicker().setCalendarViewShown(false);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }

    public m(Context context, int i10, DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13, j jVar) {
        super(context, i10, onDateSetListener, i11, i12, i13);
        a(context, i11, i12, i13, jVar);
    }
}
