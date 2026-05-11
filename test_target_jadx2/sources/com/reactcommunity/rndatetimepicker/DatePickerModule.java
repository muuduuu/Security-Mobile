package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.G;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Calendar;

@K4.a(name = "RNCDatePicker")
/* loaded from: classes2.dex */
public class DatePickerModule extends NativeModuleDatePickerSpec {
    public static final String NAME = "RNCDatePicker";

    private class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Promise f29194a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f29195b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29196c = false;

        public a(Promise promise, Bundle bundle) {
            this.f29194a = promise;
            this.f29195b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f29196c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f29194a.resolve(writableNativeMap);
            this.f29196c = true;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            if (this.f29196c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            f fVar = new f(this.f29195b);
            Calendar calendar = Calendar.getInstance(b.h(this.f29195b));
            calendar.set(i10, i11, i12, fVar.b(), fVar.c(), 0);
            calendar.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putDouble("timestamp", calendar.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000) / 60);
            this.f29194a.resolve(writableNativeMap);
            this.f29196c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f29196c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f29194a.resolve(writableNativeMap);
            this.f29196c = true;
        }
    }

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle b10 = b.b(readableMap);
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            b10.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            b10.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            b10.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            b10.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            b10.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        if (readableMap.hasKey("testID") && !readableMap.isNull("testID")) {
            b10.putString("testID", readableMap.getString("testID"));
        }
        if (readableMap.hasKey("firstDayOfWeek") && !readableMap.isNull("firstDayOfWeek")) {
            b10.putInt("firstDayOfWeek", readableMap.getInt("firstDayOfWeek") + 1);
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(G g10, ReadableMap readableMap, Promise promise) {
        i iVar = (i) g10.i0("RNCDatePicker");
        Bundle createFragmentArguments = createFragmentArguments(readableMap);
        if (iVar != null) {
            iVar.c0(createFragmentArguments);
            return;
        }
        i iVar2 = new i();
        iVar2.setArguments(createFragmentArguments);
        a aVar = new a(promise, createFragmentArguments);
        iVar2.a0(aVar);
        iVar2.Z(aVar);
        iVar2.b0(aVar);
        iVar2.U(g10, "RNCDatePicker");
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        b.c((AbstractActivityC1577t) getCurrentActivity(), "RNCDatePicker", promise);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCDatePicker";
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        AbstractActivityC1577t abstractActivityC1577t = (AbstractActivityC1577t) getCurrentActivity();
        if (abstractActivityC1577t == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else {
            final G supportFragmentManager = abstractActivityC1577t.getSupportFragmentManager();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactcommunity.rndatetimepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    DatePickerModule.this.lambda$open$0(supportFragmentManager, readableMap, promise);
                }
            });
        }
    }
}
