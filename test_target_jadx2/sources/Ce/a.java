package Ce;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.linusu.RNGetRandomValuesModule;

/* loaded from: classes3.dex */
public class a implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGetRandomValuesModule(reactApplicationContext));
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
