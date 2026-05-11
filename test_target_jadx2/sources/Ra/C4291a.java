package ra;

import Ea.d;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Collections;
import java.util.List;

/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4291a implements Fa.a, d {

    /* renamed from: a, reason: collision with root package name */
    private ReactContext f40538a;

    public C4291a(ReactContext reactContext) {
        this.f40538a = reactContext;
    }

    @Override // Fa.a
    public void b(String str, Bundle bundle) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f40538a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, Arguments.fromBundle(bundle));
    }

    @Override // Ea.d
    public List e() {
        return Collections.singletonList(Fa.a.class);
    }
}
