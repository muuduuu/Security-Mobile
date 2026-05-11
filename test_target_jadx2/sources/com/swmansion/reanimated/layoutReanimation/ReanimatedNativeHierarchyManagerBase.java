package com.swmansion.reanimated.layoutReanimation;

import com.facebook.react.uimanager.C1936c0;
import com.facebook.react.uimanager.i1;
import com.facebook.yoga.h;

/* loaded from: classes2.dex */
public abstract class ReanimatedNativeHierarchyManagerBase extends C1936c0 {
    public ReanimatedNativeHierarchyManagerBase(i1 i1Var) {
        super(i1Var);
    }

    @Override // com.facebook.react.uimanager.C1936c0
    public synchronized void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, h hVar) {
        super.updateLayout(i10, i11, i12, i13, i14, i15, hVar);
        updateLayoutCommon(i10, i11, i12, i13, i14, i15);
    }

    public abstract void updateLayoutCommon(int i10, int i11, int i12, int i13, int i14, int i15);
}
