package Zb;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import j8.C3511e;
import j8.C3517k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a {
    public static Map a(C3511e c3511e) {
        String p10 = c3511e.p();
        C3517k q10 = c3511e.q();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("name", p10);
        hashMap3.put("automaticDataCollectionEnabled", Boolean.valueOf(c3511e.w()));
        hashMap2.put("apiKey", q10.b());
        hashMap2.put("appId", q10.c());
        hashMap2.put("projectId", q10.g());
        hashMap2.put("databaseURL", q10.d());
        hashMap2.put("measurementId", q10.e());
        hashMap2.put("messagingSenderId", q10.f());
        hashMap2.put("storageBucket", q10.h());
        if (ReactNativeFirebaseAppModule.authDomains.get(p10) != null) {
            hashMap2.put("authDomain", ReactNativeFirebaseAppModule.authDomains.get(p10));
        }
        hashMap.put("options", hashMap2);
        hashMap.put("appConfig", hashMap3);
        return hashMap;
    }

    public static WritableMap b(C3511e c3511e) {
        return Arguments.makeNativeMap((Map<String, Object>) a(c3511e));
    }

    public static C3511e c(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        C3517k.b bVar = new C3517k.b();
        String string = readableMap2.getString("name");
        bVar.b(readableMap.getString("apiKey"));
        bVar.c(readableMap.getString("appId"));
        bVar.g(readableMap.getString("projectId"));
        bVar.d(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("measurementId")) {
            bVar.e(readableMap.getString("measurementId"));
        }
        bVar.h(readableMap.getString("storageBucket"));
        bVar.f(readableMap.getString("messagingSenderId"));
        C3511e u10 = string.equals("[DEFAULT]") ? C3511e.u(context, bVar.a()) : C3511e.v(context, bVar.a(), string);
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            u10.E(Boolean.valueOf(readableMap2.getBoolean("automaticDataCollectionEnabled")));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            u10.D(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return u10;
    }

    public static WritableMap d(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }
}
