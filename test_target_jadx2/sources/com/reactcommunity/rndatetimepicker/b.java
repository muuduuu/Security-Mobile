package com.reactcommunity.rndatetimepicker;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import g5.C3193c;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class b {
    public static Bundle b(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("timeZoneName") && !readableMap.isNull("timeZoneName")) {
            bundle.putString("timeZoneName", readableMap.getString("timeZoneName"));
        }
        return bundle;
    }

    public static void c(AbstractActivityC1577t abstractActivityC1577t, String str, Promise promise) {
        if (abstractActivityC1577t == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            DialogInterfaceOnCancelListenerC1571m dialogInterfaceOnCancelListenerC1571m = (DialogInterfaceOnCancelListenerC1571m) abstractActivityC1577t.getSupportFragmentManager().i0(str);
            boolean z10 = dialogInterfaceOnCancelListenerC1571m != null;
            if (z10) {
                dialogInterfaceOnCancelListenerC1571m.H();
            }
            promise.resolve(Boolean.valueOf(z10));
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    private static Integer d(Bundle bundle, String str) {
        Bundle bundle2;
        int i10;
        Bundle bundle3 = bundle.getBundle("dialogButtons");
        if (bundle3 == null || (bundle2 = bundle3.getBundle(str)) == null || (i10 = (int) bundle2.getDouble("textColor", 0.0d)) == 0) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    public static int e(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        int i10 = typedValue.resourceId;
        return i10 != 0 ? androidx.core.content.a.c(context, i10) : typedValue.data;
    }

    public static j f(Bundle bundle) {
        j jVar = j.DEFAULT;
        return (bundle == null || bundle.getString("display", null) == null) ? jVar : j.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static p g(Bundle bundle) {
        p pVar = p.DEFAULT;
        return (bundle == null || bundle.getString("display", null) == null) ? pVar : p.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static TimeZone h(Bundle bundle) {
        if (bundle != null && bundle.containsKey("timeZoneOffsetInMinutes")) {
            return new SimpleTimeZone(((int) bundle.getLong("timeZoneOffsetInMinutes")) * 60000, "GMT");
        }
        if (bundle != null && bundle.containsKey("timeZoneName")) {
            String string = bundle.getString("timeZoneName");
            if ("GMT".equals(string)) {
                return TimeZone.getTimeZone("GMT");
            }
            if (!"GMT".equals(TimeZone.getTimeZone(string).getID())) {
                return TimeZone.getTimeZone(string);
            }
            C3193c.d(null, "'" + string + "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=" + TimeZone.getDefault().getID());
        }
        return TimeZone.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(AlertDialog alertDialog, Context context, Bundle bundle, boolean z10, DialogInterface dialogInterface) {
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        int e10 = e(context);
        o(button, "positive", bundle, z10, e10);
        o(button2, "negative", bundle, z10, e10);
        o(button3, "neutral", bundle, z10, e10);
    }

    public static long j(Bundle bundle) {
        if (!bundle.containsKey("maximumDate")) {
            return Long.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance(h(bundle));
        calendar.setTimeInMillis(bundle.getLong("maximumDate"));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static long k(Bundle bundle) {
        if (!bundle.containsKey("minimumDate")) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance(h(bundle));
        calendar.setTimeInMillis(bundle.getLong("minimumDate"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private static void l(Bundle bundle, AlertDialog alertDialog, int i10, DialogInterface.OnClickListener onClickListener) {
        if (bundle == null || bundle.getString("label") == null) {
            return;
        }
        alertDialog.setButton(i10, bundle.getString("label"), onClickListener);
    }

    public static DialogInterface.OnShowListener m(final Context context, final AlertDialog alertDialog, final Bundle bundle, final boolean z10) {
        return new DialogInterface.OnShowListener() { // from class: com.reactcommunity.rndatetimepicker.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                b.i(alertDialog, context, bundle, z10, dialogInterface);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
        Bundle bundle2 = bundle.getBundle("dialogButtons");
        if (bundle2 == null) {
            return;
        }
        l(bundle2.getBundle("neutral"), alertDialog, -3, onClickListener);
        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) alertDialog;
        l(bundle2.getBundle("positive"), alertDialog, -1, onClickListener2);
        l(bundle2.getBundle("negative"), alertDialog, -2, onClickListener2);
    }

    private static void o(Button button, String str, Bundle bundle, boolean z10, int i10) {
        if (button == null) {
            return;
        }
        Integer d10 = d(bundle, str);
        if (z10 || d10 != null) {
            if (d10 != null) {
                i10 = d10.intValue();
            }
            button.setTextColor(i10);
        }
    }
}
