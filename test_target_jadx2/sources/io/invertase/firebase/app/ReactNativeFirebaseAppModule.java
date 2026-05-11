package io.invertase.firebase.app;

import Zb.g;
import Zb.i;
import Zb.j;
import Zb.k;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import j8.C3511e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";
    public static Map<String, String> authDomains = new HashMap();

    ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    public static void configureAuthDomain(String str, String str2) {
        if (str2 == null) {
            authDomains.remove(str);
            return;
        }
        Log.d(TAG, str + " custom authDomain " + str2);
        authDomains.put(str, str2);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        C3511e o10 = C3511e.o(str);
        if (o10 != null) {
            o10.i();
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        g.i().e(str);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(g.i().h());
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        g.i().m(bool);
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        g.i().o(new Zb.b(str, Zb.a.d(readableMap)));
        promise.resolve(Zb.a.d(readableMap));
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        g.i().n(str, bool);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = C3511e.m(getReactApplicationContext()).iterator();
        while (it.hasNext()) {
            arrayList.add(Zb.a.a((C3511e) it.next()));
        }
        hashMap.put("NATIVE_FIREBASE_APPS", arrayList);
        hashMap.put("FIREBASE_RAW_JSON", i.g().f());
        return hashMap;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        g.i().f(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        C3511e c10 = Zb.a.c(readableMap, readableMap2, getContext());
        configureAuthDomain(readableMap2.getString("name"), readableMap.getString("authDomain"));
        promise.resolve(Zb.a.b(c10));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(i.g().b());
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(j.c().a());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        k.d().a();
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(k.d().b());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z10, Promise promise) {
        k.d().e(str, z10);
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        k.d().f(str, str2);
        promise.resolve(null);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        C3511e.o(str).E(bool);
    }
}
