package expo.modules.adapters.react;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import expo.modules.core.BasePackage;
import java.util.Arrays;
import java.util.List;
import qa.e;
import ra.C4291a;
import ra.C4292b;

/* loaded from: classes2.dex */
public class ReactAdapterPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, Ea.g
    public List f(Context context) {
        ReactContext reactContext = (ReactContext) context;
        return Arrays.asList(new C4292b(reactContext), new C4291a(reactContext), new e(reactContext));
    }
}
