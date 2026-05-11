package pb;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.F0;
import expo.modules.adapters.react.NativeModulesProxy;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o {
    public static final NativeModulesProxy a(ReactContext reactContext) {
        NativeModule nativeModule;
        Object obj;
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        if (!reactContext.isBridgeless()) {
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            NativeModule nativeModule2 = catalystInstance != null ? catalystInstance.getNativeModule("NativeUnimoduleProxy") : null;
            if (nativeModule2 instanceof NativeModulesProxy) {
                return (NativeModulesProxy) nativeModule2;
            }
            return null;
        }
        Collection<NativeModule> nativeModules = ((F0) reactContext).b().getNativeModules();
        if (nativeModules != null) {
            Iterator<T> it = nativeModules.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((NativeModule) obj) instanceof NativeModulesProxy) {
                    break;
                }
            }
            nativeModule = (NativeModule) obj;
        } else {
            nativeModule = null;
        }
        if (nativeModule instanceof NativeModulesProxy) {
            return (NativeModulesProxy) nativeModule;
        }
        return null;
    }
}
