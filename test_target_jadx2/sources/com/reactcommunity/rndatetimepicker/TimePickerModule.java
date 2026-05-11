package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
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

@K4.a(name = "RNCTimePicker")
/* loaded from: classes2.dex */
public class TimePickerModule extends NativeModuleTimePickerSpec {
    public static final String NAME = "RNCTimePicker";

    private class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Promise f29198a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f29199b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29200c = false;

        public a(Promise promise, Bundle bundle) {
            this.f29198a = promise;
            this.f29199b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f29200c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f29198a.resolve(writableNativeMap);
            this.f29200c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f29200c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f29198a.resolve(writableNativeMap);
            this.f29200c = true;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i10, int i11) {
            if (this.f29200c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            f fVar = new f(this.f29199b);
            Calendar calendar = Calendar.getInstance(b.h(this.f29199b));
            calendar.set(fVar.e(), fVar.d(), fVar.a(), i10, i11, 0);
            calendar.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "timeSetAction");
            writableNativeMap.putDouble("timestamp", calendar.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000) / 60);
            this.f29198a.resolve(writableNativeMap);
            this.f29200c = true;
        }
    }

    public TimePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle b10 = b.b(readableMap);
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            b10.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            b10.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            b10.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            b10.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            b10.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(G g10, ReadableMap readableMap, Promise promise) {
        o oVar = (o) g10.i0("RNCTimePicker");
        Bundle createFragmentArguments = createFragmentArguments(readableMap);
        if (oVar != null) {
            oVar.a0(createFragmentArguments);
            return;
        }
        o oVar2 = new o();
        oVar2.setArguments(createFragmentArguments);
        a aVar = new a(promise, createFragmentArguments);
        oVar2.X(aVar);
        oVar2.Z(aVar);
        oVar2.Y(aVar);
        oVar2.U(g10, "RNCTimePicker");
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        b.c((AbstractActivityC1577t) getCurrentActivity(), "RNCTimePicker", promise);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCTimePicker";
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        AbstractActivityC1577t abstractActivityC1577t = (AbstractActivityC1577t) getCurrentActivity();
        if (abstractActivityC1577t == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else {
            final G supportFragmentManager = abstractActivityC1577t.getSupportFragmentManager();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactcommunity.rndatetimepicker.r
                @Override // java.lang.Runnable
                public final void run() {
                    TimePickerModule.this.lambda$open$0(supportFragmentManager, readableMap, promise);
                }
            });
        }
    }
}
