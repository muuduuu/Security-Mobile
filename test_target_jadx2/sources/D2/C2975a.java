package d2;

import com.azendoo.reactnativesnackbar.SnackbarModule;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2975a implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new SnackbarModule(reactApplicationContext));
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
