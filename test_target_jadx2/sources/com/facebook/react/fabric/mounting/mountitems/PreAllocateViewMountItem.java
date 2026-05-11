package com.facebook.react.fabric.mounting.mountitems;

import c3.AbstractC1721a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.E0;

/* loaded from: classes.dex */
final class PreAllocateViewMountItem implements MountItem {
    private final String mComponent;
    private final boolean mIsLayoutable;
    private final ReadableMap mProps;
    private final int mReactTag;
    private final E0 mStateWrapper;
    private final int mSurfaceId;

    PreAllocateViewMountItem(int i10, int i11, String str, ReadableMap readableMap, E0 e02, boolean z10) {
        this.mComponent = FabricNameComponentMapping.getFabricComponentName(str);
        this.mSurfaceId = i10;
        this.mProps = readableMap;
        this.mStateWrapper = e02;
        this.mReactTag = i11;
        this.mIsLayoutable = z10;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager != null) {
            surfaceManager.preallocateView(this.mComponent, this.mReactTag, this.mProps, this.mStateWrapper, this.mIsLayoutable);
            return;
        }
        AbstractC1721a.m(FabricUIManager.TAG, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.mSurfaceId + "]");
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreAllocateViewMountItem [");
        sb2.append(this.mReactTag);
        sb2.append("] - component: ");
        sb2.append(this.mComponent);
        sb2.append(" surfaceId: ");
        sb2.append(this.mSurfaceId);
        sb2.append(" isLayoutable: ");
        sb2.append(this.mIsLayoutable);
        if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            sb2.append(" props: ");
            ReadableMap readableMap = this.mProps;
            sb2.append(readableMap != null ? readableMap.toString() : "<null>");
            sb2.append(" state: ");
            E0 e02 = this.mStateWrapper;
            sb2.append(e02 != null ? e02.toString() : "<null>");
        }
        return sb2.toString();
    }
}
