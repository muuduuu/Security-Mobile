package la;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.zoontek.rnpermissions.NativeRNPermissionsSpec;
import com.zoontek.rnpermissions.RNPermissionsModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNPermissionsSpec.NAME, new ReactModuleInfo(NativeRNPermissionsSpec.NAME, NativeRNPermissionsSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, NativeRNPermissionsSpec.NAME)) {
            return new RNPermissionsModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: la.e
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = f.f();
                return f10;
            }
        };
    }
}
