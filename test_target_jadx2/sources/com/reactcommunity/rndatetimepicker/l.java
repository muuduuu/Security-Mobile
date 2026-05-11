package com.reactcommunity.rndatetimepicker;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class l extends a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNCDatePicker", new ReactModuleInfo("RNCDatePicker", "RNCDatePicker", false, false, false, false, true));
        hashMap.put("RNCTimePicker", new ReactModuleInfo("RNCTimePicker", "RNCTimePicker", false, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNCDatePicker")) {
            return new DatePickerModule(reactApplicationContext);
        }
        if (str.equals("RNCTimePicker")) {
            return new TimePickerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: com.reactcommunity.rndatetimepicker.k
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = l.f();
                return f10;
            }
        };
    }
}
