package ka;

import android.util.Log;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.webengage.WebengageBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ka.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3556a implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        Log.d("WebEngage", "createNativeModules: " + reactApplicationContext);
        ArrayList arrayList = new ArrayList();
        arrayList.add(WebengageBridge.getInstance(reactApplicationContext));
        WebengageBridge.getInstance(reactApplicationContext).setReactNativeContext(reactApplicationContext);
        return arrayList;
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
