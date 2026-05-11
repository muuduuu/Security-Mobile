package X9;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[0]);
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RSSignatureCaptureViewManager(reactApplicationContext));
    }
}
