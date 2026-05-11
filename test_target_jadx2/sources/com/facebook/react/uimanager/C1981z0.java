package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;

/* renamed from: com.facebook.react.uimanager.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1981z0 extends K0 {
    public C1981z0(ReactApplicationContext reactApplicationContext, i1 i1Var, EventDispatcher eventDispatcher, int i10) {
        super(reactApplicationContext, i1Var, new R0(reactApplicationContext, new ReanimatedNativeHierarchyManager(i1Var, reactApplicationContext), i10), eventDispatcher);
    }

    @Override // com.facebook.react.uimanager.K0
    public void u(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        super.u(i10, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }
}
