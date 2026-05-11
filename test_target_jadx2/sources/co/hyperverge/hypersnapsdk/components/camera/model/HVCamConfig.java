package co.hyperverge.hypersnapsdk.components.camera.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/camera/model/HVCamConfig;", BuildConfig.FLAVOR, "useBackCamera", BuildConfig.FLAVOR, "shouldRandomize", "shouldZoomPreview", "previewMegaPixel", BuildConfig.FLAVOR, "pictureMegaPixel", "enableLookStraight", "shouldRecordVideo", "diameter", BuildConfig.FLAVOR, "(ZZZFFZZI)V", "getDiameter", "()I", "getEnableLookStraight", "()Z", "getPictureMegaPixel", "()F", "getPreviewMegaPixel", "getShouldRandomize", "getShouldRecordVideo", "getShouldZoomPreview", "getUseBackCamera", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HVCamConfig {
    private final int diameter;
    private final boolean enableLookStraight;
    private final float pictureMegaPixel;
    private final float previewMegaPixel;
    private final boolean shouldRandomize;
    private final boolean shouldRecordVideo;
    private final boolean shouldZoomPreview;
    private final boolean useBackCamera;

    public HVCamConfig() {
        this(false, false, false, 0.0f, 0.0f, false, false, 0, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseBackCamera() {
        return this.useBackCamera;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldRandomize() {
        return this.shouldRandomize;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldZoomPreview() {
        return this.shouldZoomPreview;
    }

    /* renamed from: component4, reason: from getter */
    public final float getPreviewMegaPixel() {
        return this.previewMegaPixel;
    }

    /* renamed from: component5, reason: from getter */
    public final float getPictureMegaPixel() {
        return this.pictureMegaPixel;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableLookStraight() {
        return this.enableLookStraight;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldRecordVideo() {
        return this.shouldRecordVideo;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDiameter() {
        return this.diameter;
    }

    public final HVCamConfig copy(boolean useBackCamera, boolean shouldRandomize, boolean shouldZoomPreview, float previewMegaPixel, float pictureMegaPixel, boolean enableLookStraight, boolean shouldRecordVideo, int diameter) {
        return new HVCamConfig(useBackCamera, shouldRandomize, shouldZoomPreview, previewMegaPixel, pictureMegaPixel, enableLookStraight, shouldRecordVideo, diameter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HVCamConfig)) {
            return false;
        }
        HVCamConfig hVCamConfig = (HVCamConfig) other;
        return this.useBackCamera == hVCamConfig.useBackCamera && this.shouldRandomize == hVCamConfig.shouldRandomize && this.shouldZoomPreview == hVCamConfig.shouldZoomPreview && Float.compare(this.previewMegaPixel, hVCamConfig.previewMegaPixel) == 0 && Float.compare(this.pictureMegaPixel, hVCamConfig.pictureMegaPixel) == 0 && this.enableLookStraight == hVCamConfig.enableLookStraight && this.shouldRecordVideo == hVCamConfig.shouldRecordVideo && this.diameter == hVCamConfig.diameter;
    }

    public final int getDiameter() {
        return this.diameter;
    }

    public final boolean getEnableLookStraight() {
        return this.enableLookStraight;
    }

    public final float getPictureMegaPixel() {
        return this.pictureMegaPixel;
    }

    public final float getPreviewMegaPixel() {
        return this.previewMegaPixel;
    }

    public final boolean getShouldRandomize() {
        return this.shouldRandomize;
    }

    public final boolean getShouldRecordVideo() {
        return this.shouldRecordVideo;
    }

    public final boolean getShouldZoomPreview() {
        return this.shouldZoomPreview;
    }

    public final boolean getUseBackCamera() {
        return this.useBackCamera;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.useBackCamera;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.shouldRandomize;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.shouldZoomPreview;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int hashCode = (((((i12 + i13) * 31) + Float.hashCode(this.previewMegaPixel)) * 31) + Float.hashCode(this.pictureMegaPixel)) * 31;
        ?? r24 = this.enableLookStraight;
        int i14 = r24;
        if (r24 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode + i14) * 31;
        boolean z11 = this.shouldRecordVideo;
        return ((i15 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.diameter);
    }

    public String toString() {
        return "HVCamConfig(useBackCamera=" + this.useBackCamera + ", shouldRandomize=" + this.shouldRandomize + ", shouldZoomPreview=" + this.shouldZoomPreview + ", previewMegaPixel=" + this.previewMegaPixel + ", pictureMegaPixel=" + this.pictureMegaPixel + ", enableLookStraight=" + this.enableLookStraight + ", shouldRecordVideo=" + this.shouldRecordVideo + ", diameter=" + this.diameter + ')';
    }

    public HVCamConfig(boolean z10, boolean z11, boolean z12, float f10, float f11, boolean z13, boolean z14, int i10) {
        this.useBackCamera = z10;
        this.shouldRandomize = z11;
        this.shouldZoomPreview = z12;
        this.previewMegaPixel = f10;
        this.pictureMegaPixel = f11;
        this.enableLookStraight = z13;
        this.shouldRecordVideo = z14;
        this.diameter = i10;
    }

    public /* synthetic */ HVCamConfig(boolean z10, boolean z11, boolean z12, float f10, float f11, boolean z13, boolean z14, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? 0.3f : f10, (i11 & 16) != 0 ? 1.3f : f11, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? false : z14, (i11 & 128) == 0 ? i10 : 0);
    }
}
