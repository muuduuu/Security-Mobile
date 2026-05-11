package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;

@Deprecated(since = "CompositeReactPackageTurboModuleManagerDelegate is deprecated and will be deleted in the future. Please use ReactPackage interface or BaseReactPackage instead.")
/* loaded from: classes.dex */
public class CompositeReactPackageTurboModuleManagerDelegate extends W {
    private native void addTurboModuleManagerDelegate(TurboModuleManagerDelegate turboModuleManagerDelegate);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    protected native HybridData initHybrid();
}
