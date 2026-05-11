package co.hyperverge.hypersnapsdk.components.camera.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/camera/model/HyperCameraXConfig;", BuildConfig.FLAVOR, "useFFC", BuildConfig.FLAVOR, "useDefaultZoom", "useBarcodeCapture", "(ZZZ)V", "getUseBarcodeCapture", "()Z", "getUseDefaultZoom", "getUseFFC", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HyperCameraXConfig {
    private final boolean useBarcodeCapture;
    private final boolean useDefaultZoom;
    private final boolean useFFC;

    public HyperCameraXConfig(boolean z10, boolean z11, boolean z12) {
        this.useFFC = z10;
        this.useDefaultZoom = z11;
        this.useBarcodeCapture = z12;
    }

    public static /* synthetic */ HyperCameraXConfig copy$default(HyperCameraXConfig hyperCameraXConfig, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hyperCameraXConfig.useFFC;
        }
        if ((i10 & 2) != 0) {
            z11 = hyperCameraXConfig.useDefaultZoom;
        }
        if ((i10 & 4) != 0) {
            z12 = hyperCameraXConfig.useBarcodeCapture;
        }
        return hyperCameraXConfig.copy(z10, z11, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseFFC() {
        return this.useFFC;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUseDefaultZoom() {
        return this.useDefaultZoom;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseBarcodeCapture() {
        return this.useBarcodeCapture;
    }

    public final HyperCameraXConfig copy(boolean useFFC, boolean useDefaultZoom, boolean useBarcodeCapture) {
        return new HyperCameraXConfig(useFFC, useDefaultZoom, useBarcodeCapture);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperCameraXConfig)) {
            return false;
        }
        HyperCameraXConfig hyperCameraXConfig = (HyperCameraXConfig) other;
        return this.useFFC == hyperCameraXConfig.useFFC && this.useDefaultZoom == hyperCameraXConfig.useDefaultZoom && this.useBarcodeCapture == hyperCameraXConfig.useBarcodeCapture;
    }

    public final boolean getUseBarcodeCapture() {
        return this.useBarcodeCapture;
    }

    public final boolean getUseDefaultZoom() {
        return this.useDefaultZoom;
    }

    public final boolean getUseFFC() {
        return this.useFFC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.useFFC;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.useDefaultZoom;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z11 = this.useBarcodeCapture;
        return i12 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "HyperCameraXConfig(useFFC=" + this.useFFC + ", useDefaultZoom=" + this.useDefaultZoom + ", useBarcodeCapture=" + this.useBarcodeCapture + ')';
    }

    public /* synthetic */ HyperCameraXConfig(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }
}
