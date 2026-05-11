package t9;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.mrousavy.mmkv.MmkvPlatformContextModule;
import com.mrousavy.mmkv.NativeMmkvPlatformContextSpec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4822b extends a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeMmkvPlatformContextSpec.NAME, new ReactModuleInfo(NativeMmkvPlatformContextSpec.NAME, NativeMmkvPlatformContextSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeMmkvPlatformContextSpec.NAME)) {
            return new MmkvPlatformContextModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: t9.a
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = C4822b.f();
                return f10;
            }
        };
    }
}
