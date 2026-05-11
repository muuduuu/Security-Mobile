package com.mrousavy.mmkv;

import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes2.dex */
public class MmkvPlatformContextModule extends NativeMmkvPlatformContextSpec {
    private final ReactApplicationContext context;

    public MmkvPlatformContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
    }

    @Override // com.mrousavy.mmkv.NativeMmkvPlatformContextSpec
    public String getAppGroupDirectory() {
        return null;
    }

    @Override // com.mrousavy.mmkv.NativeMmkvPlatformContextSpec
    public String getBaseDirectory() {
        return this.context.getFilesDir().getAbsolutePath() + "/mmkv";
    }
}
