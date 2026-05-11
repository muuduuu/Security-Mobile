package s9;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.lugg.RNCConfig.RNCConfigModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: s9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4506a implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNCConfigModule(reactApplicationContext));
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
