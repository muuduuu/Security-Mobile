package com.swmansion.reanimated;

import com.facebook.react.InterfaceC1995x;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes2.dex */
public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, C4.d dVar) {
        if (reactApplicationContext.getApplicationContext() instanceof InterfaceC1995x) {
            C4.e i10 = reactApplicationContext.isBridgeless() ? ((InterfaceC1995x) reactApplicationContext.getApplicationContext()).b().i() : ((InterfaceC1995x) reactApplicationContext.getApplicationContext()).a().c().E();
            if (i10 == null) {
                throw new RuntimeException("[Reanimated] DevSupportManager is not available");
            }
            i10.r("Toggle slow animations (Reanimated)", dVar);
        }
    }
}
