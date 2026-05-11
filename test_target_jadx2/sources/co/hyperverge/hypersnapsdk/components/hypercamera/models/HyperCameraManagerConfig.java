package co.hyperverge.hypersnapsdk.components.hypercamera.models;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraManagerConfig;", BuildConfig.FLAVOR, "camera", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraSelector;", Keys.CAMERA_POSITION, "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraPosition;", "defaultZoom", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperDefaultZoomConfig;", "hyperPreviewConfig", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperPreviewConfig;", "(Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraSelector;Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraPosition;Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperDefaultZoomConfig;Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperPreviewConfig;)V", "getCamera", "()Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraSelector;", "getCameraPosition", "()Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraPosition;", "getDefaultZoom", "()Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperDefaultZoomConfig;", "getHyperPreviewConfig", "()Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperPreviewConfig;", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HyperCameraManagerConfig {
    private final HyperCameraSelector camera;
    private final HyperCameraPosition cameraPosition;
    private final HyperDefaultZoomConfig defaultZoom;
    private final HyperPreviewConfig hyperPreviewConfig;

    public HyperCameraManagerConfig() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ HyperCameraManagerConfig copy$default(HyperCameraManagerConfig hyperCameraManagerConfig, HyperCameraSelector hyperCameraSelector, HyperCameraPosition hyperCameraPosition, HyperDefaultZoomConfig hyperDefaultZoomConfig, HyperPreviewConfig hyperPreviewConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hyperCameraSelector = hyperCameraManagerConfig.camera;
        }
        if ((i10 & 2) != 0) {
            hyperCameraPosition = hyperCameraManagerConfig.cameraPosition;
        }
        if ((i10 & 4) != 0) {
            hyperDefaultZoomConfig = hyperCameraManagerConfig.defaultZoom;
        }
        if ((i10 & 8) != 0) {
            hyperPreviewConfig = hyperCameraManagerConfig.hyperPreviewConfig;
        }
        return hyperCameraManagerConfig.copy(hyperCameraSelector, hyperCameraPosition, hyperDefaultZoomConfig, hyperPreviewConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final HyperCameraSelector getCamera() {
        return this.camera;
    }

    /* renamed from: component2, reason: from getter */
    public final HyperCameraPosition getCameraPosition() {
        return this.cameraPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final HyperDefaultZoomConfig getDefaultZoom() {
        return this.defaultZoom;
    }

    /* renamed from: component4, reason: from getter */
    public final HyperPreviewConfig getHyperPreviewConfig() {
        return this.hyperPreviewConfig;
    }

    public final HyperCameraManagerConfig copy(HyperCameraSelector camera, HyperCameraPosition cameraPosition, HyperDefaultZoomConfig defaultZoom, HyperPreviewConfig hyperPreviewConfig) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        Intrinsics.checkNotNullParameter(defaultZoom, "defaultZoom");
        Intrinsics.checkNotNullParameter(hyperPreviewConfig, "hyperPreviewConfig");
        return new HyperCameraManagerConfig(camera, cameraPosition, defaultZoom, hyperPreviewConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperCameraManagerConfig)) {
            return false;
        }
        HyperCameraManagerConfig hyperCameraManagerConfig = (HyperCameraManagerConfig) other;
        return this.camera == hyperCameraManagerConfig.camera && this.cameraPosition == hyperCameraManagerConfig.cameraPosition && Intrinsics.b(this.defaultZoom, hyperCameraManagerConfig.defaultZoom) && Intrinsics.b(this.hyperPreviewConfig, hyperCameraManagerConfig.hyperPreviewConfig);
    }

    public final HyperCameraSelector getCamera() {
        return this.camera;
    }

    public final HyperCameraPosition getCameraPosition() {
        return this.cameraPosition;
    }

    public final HyperDefaultZoomConfig getDefaultZoom() {
        return this.defaultZoom;
    }

    public final HyperPreviewConfig getHyperPreviewConfig() {
        return this.hyperPreviewConfig;
    }

    public int hashCode() {
        return (((((this.camera.hashCode() * 31) + this.cameraPosition.hashCode()) * 31) + this.defaultZoom.hashCode()) * 31) + this.hyperPreviewConfig.hashCode();
    }

    public String toString() {
        return "HyperCameraManagerConfig(camera=" + this.camera + ", cameraPosition=" + this.cameraPosition + ", defaultZoom=" + this.defaultZoom + ", hyperPreviewConfig=" + this.hyperPreviewConfig + ')';
    }

    public HyperCameraManagerConfig(HyperCameraSelector camera, HyperCameraPosition cameraPosition, HyperDefaultZoomConfig defaultZoom, HyperPreviewConfig hyperPreviewConfig) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        Intrinsics.checkNotNullParameter(defaultZoom, "defaultZoom");
        Intrinsics.checkNotNullParameter(hyperPreviewConfig, "hyperPreviewConfig");
        this.camera = camera;
        this.cameraPosition = cameraPosition;
        this.defaultZoom = defaultZoom;
        this.hyperPreviewConfig = hyperPreviewConfig;
    }

    public /* synthetic */ HyperCameraManagerConfig(HyperCameraSelector hyperCameraSelector, HyperCameraPosition hyperCameraPosition, HyperDefaultZoomConfig hyperDefaultZoomConfig, HyperPreviewConfig hyperPreviewConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? HyperCameraSelector.LEGACY : hyperCameraSelector, (i10 & 2) != 0 ? HyperCameraPosition.BACK : hyperCameraPosition, (i10 & 4) != 0 ? new HyperDefaultZoomConfig(false, 0.0d, 3, null) : hyperDefaultZoomConfig, (i10 & 8) != 0 ? new HyperPreviewConfig(false, false, false, false, 15, null) : hyperPreviewConfig);
    }
}
