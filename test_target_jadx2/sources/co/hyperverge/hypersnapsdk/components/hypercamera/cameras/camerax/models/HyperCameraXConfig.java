package co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.models;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraPosition;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperDefaultZoomConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperPreviewConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/models/HyperCameraXConfig;", BuildConfig.FLAVOR, Keys.CAMERA_POSITION, "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraPosition;", "defaultZoom", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperDefaultZoomConfig;", "hyperPreviewConfig", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperPreviewConfig;", "(Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraPosition;Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperDefaultZoomConfig;Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperPreviewConfig;)V", "getCameraPosition", "()Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraPosition;", "getDefaultZoom", "()Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperDefaultZoomConfig;", "getHyperPreviewConfig", "()Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperPreviewConfig;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HyperCameraXConfig {
    private final HyperCameraPosition cameraPosition;
    private final HyperDefaultZoomConfig defaultZoom;
    private final HyperPreviewConfig hyperPreviewConfig;

    public HyperCameraXConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ HyperCameraXConfig copy$default(HyperCameraXConfig hyperCameraXConfig, HyperCameraPosition hyperCameraPosition, HyperDefaultZoomConfig hyperDefaultZoomConfig, HyperPreviewConfig hyperPreviewConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hyperCameraPosition = hyperCameraXConfig.cameraPosition;
        }
        if ((i10 & 2) != 0) {
            hyperDefaultZoomConfig = hyperCameraXConfig.defaultZoom;
        }
        if ((i10 & 4) != 0) {
            hyperPreviewConfig = hyperCameraXConfig.hyperPreviewConfig;
        }
        return hyperCameraXConfig.copy(hyperCameraPosition, hyperDefaultZoomConfig, hyperPreviewConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final HyperCameraPosition getCameraPosition() {
        return this.cameraPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final HyperDefaultZoomConfig getDefaultZoom() {
        return this.defaultZoom;
    }

    /* renamed from: component3, reason: from getter */
    public final HyperPreviewConfig getHyperPreviewConfig() {
        return this.hyperPreviewConfig;
    }

    public final HyperCameraXConfig copy(HyperCameraPosition cameraPosition, HyperDefaultZoomConfig defaultZoom, HyperPreviewConfig hyperPreviewConfig) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        Intrinsics.checkNotNullParameter(defaultZoom, "defaultZoom");
        Intrinsics.checkNotNullParameter(hyperPreviewConfig, "hyperPreviewConfig");
        return new HyperCameraXConfig(cameraPosition, defaultZoom, hyperPreviewConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperCameraXConfig)) {
            return false;
        }
        HyperCameraXConfig hyperCameraXConfig = (HyperCameraXConfig) other;
        return this.cameraPosition == hyperCameraXConfig.cameraPosition && Intrinsics.b(this.defaultZoom, hyperCameraXConfig.defaultZoom) && Intrinsics.b(this.hyperPreviewConfig, hyperCameraXConfig.hyperPreviewConfig);
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
        return (((this.cameraPosition.hashCode() * 31) + this.defaultZoom.hashCode()) * 31) + this.hyperPreviewConfig.hashCode();
    }

    public String toString() {
        return "HyperCameraXConfig(cameraPosition=" + this.cameraPosition + ", defaultZoom=" + this.defaultZoom + ", hyperPreviewConfig=" + this.hyperPreviewConfig + ')';
    }

    public HyperCameraXConfig(HyperCameraPosition cameraPosition, HyperDefaultZoomConfig defaultZoom, HyperPreviewConfig hyperPreviewConfig) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        Intrinsics.checkNotNullParameter(defaultZoom, "defaultZoom");
        Intrinsics.checkNotNullParameter(hyperPreviewConfig, "hyperPreviewConfig");
        this.cameraPosition = cameraPosition;
        this.defaultZoom = defaultZoom;
        this.hyperPreviewConfig = hyperPreviewConfig;
    }

    public /* synthetic */ HyperCameraXConfig(HyperCameraPosition hyperCameraPosition, HyperDefaultZoomConfig hyperDefaultZoomConfig, HyperPreviewConfig hyperPreviewConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? HyperCameraPosition.BACK : hyperCameraPosition, (i10 & 2) != 0 ? new HyperDefaultZoomConfig(false, 0.0d, 3, null) : hyperDefaultZoomConfig, (i10 & 4) != 0 ? new HyperPreviewConfig(false, false, false, false, 15, null) : hyperPreviewConfig);
    }
}
