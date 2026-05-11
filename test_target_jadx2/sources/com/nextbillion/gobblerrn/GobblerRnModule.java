package com.nextbillion.gobblerrn;

import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import j9.C3519a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ma.InterfaceC3662a;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import u9.InterfaceC4875a;
import v9.C4973b;
import v9.h;
import v9.i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010#\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b(\u0010&¨\u0006+"}, d2 = {"Lcom/nextbillion/gobblerrn/GobblerRnModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lma/a;", "Lj9/a;", "getLazySkynet", "()Lma/a;", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", BuildConfig.FLAVOR, "flushInterval", "apiEndPoint", "apiKey", BuildConfig.FLAVOR, "enableDebugLog", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, BuildConfig.FLAVOR, "initialise", "(ILjava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "eventName", "eventData", "track", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "deviceIdV1", "setDeviceIdV1", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "name", "emailId", "accountId", "cuid", "setUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getUser", "(Lcom/facebook/react/bridge/Promise;)V", "logout", "release", "Companion", C4870a.f43493a, "gobblerrn_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GobblerRnModule extends ReactContextBaseJavaModule {
    public static final String NAME = "GobblerRn";

    public static final class b implements InterfaceC3662a {

        /* renamed from: a, reason: collision with root package name */
        private C3519a f29193a;

        b() {
        }

        @Override // ma.InterfaceC3662a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3519a get() {
            C3519a c3519a = this.f29193a;
            if (c3519a != null) {
                return c3519a;
            }
            C3519a a10 = new C3519a.C0516a().b(false).a();
            this.f29193a = a10;
            return a10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GobblerRnModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final InterfaceC3662a getLazySkynet() {
        return new b();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void getUser(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        i d10 = InterfaceC4875a.f43586a.a().d();
        writableNativeMap.putString("name", d10.d());
        writableNativeMap.putString("accountId", d10.a());
        writableNativeMap.putString("emailId", d10.c());
        writableNativeMap.putString("cuid", d10.b());
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public final void initialise(int flushInterval, String apiEndPoint, String apiKey, boolean enableDebugLog, Promise promise) {
        Intrinsics.checkNotNullParameter(apiEndPoint, "apiEndPoint");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(promise, "promise");
        long currentTimeMillis = System.currentTimeMillis();
        h a10 = new h.a(apiKey, apiEndPoint).a();
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        Intrinsics.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        C4973b.a aVar = new C4973b.a((Application) applicationContext, a10, getLazySkynet(), "WForWealth", currentTimeMillis);
        aVar.b(enableDebugLog);
        try {
            InterfaceC4875a.f43586a.b(aVar.a());
            promise.resolve("Gobbler initialised");
        } catch (IllegalStateException unused) {
            promise.reject("Gobbler is already initialized. If you want to re-initialize Gobbler with new Configuration, please call Gobbler#release first.");
        }
    }

    @ReactMethod
    public final void logout(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        InterfaceC4875a.f43586a.a().logout();
        promise.resolve("user logged out from gobbler");
    }

    @ReactMethod
    public final void release(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        InterfaceC4875a.f43586a.a().a();
        promise.resolve("gobbler instance released");
    }

    @ReactMethod
    public final void setDeviceIdV1(String deviceIdV1, Promise promise) {
        Intrinsics.checkNotNullParameter(deviceIdV1, "deviceIdV1");
        Intrinsics.checkNotNullParameter(promise, "promise");
        InterfaceC4875a.f43586a.a().b(deviceIdV1);
        promise.resolve("deviceIdV1 set for gobbler");
    }

    @ReactMethod
    public final void setUser(String name, String emailId, String accountId, String cuid, Promise promise) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(cuid, "cuid");
        Intrinsics.checkNotNullParameter(promise, "promise");
        InterfaceC4875a a10 = InterfaceC4875a.f43586a.a();
        i d10 = a10.d();
        if (name.length() != 0) {
            d10.h(name);
        }
        if (emailId.length() != 0) {
            d10.g(emailId);
        }
        if (accountId.length() != 0) {
            d10.e(accountId);
        }
        if (cuid.length() != 0) {
            d10.f(cuid);
        }
        a10.c(d10);
        promise.resolve("user details set for gobbler");
    }

    @ReactMethod
    public final void track(String eventName, String eventData, Promise promise) {
        byte[] I02;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (eventData.length() == 0) {
            I02 = new byte[0];
        } else {
            List split$default = StringsKt.split$default(eventData, new String[]{","}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(CollectionsKt.u(split$default, 10));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(StringsKt.S0((String) it.next()).toString())));
            }
            I02 = CollectionsKt.I0(arrayList);
        }
        InterfaceC4875a.b.a(InterfaceC4875a.f43586a.a(), eventName, I02, null, 4, null);
        promise.resolve("event tracked from gobbler");
    }
}
