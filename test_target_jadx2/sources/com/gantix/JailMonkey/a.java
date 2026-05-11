package com.gantix.JailMonkey;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements P {

    /* renamed from: a, reason: collision with root package name */
    private boolean f23148a;

    public a() {
        this(false);
    }

    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new JailMonkeyModule(reactApplicationContext, this.f23148a));
        return arrayList;
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public a(boolean z10) {
        this.f23148a = z10;
    }
}
