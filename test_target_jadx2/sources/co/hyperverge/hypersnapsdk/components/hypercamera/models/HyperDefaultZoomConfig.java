package co.hyperverge.hypersnapsdk.components.hypercamera.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperDefaultZoomConfig;", BuildConfig.FLAVOR, "useZoom", BuildConfig.FLAVOR, "zoomLevel", BuildConfig.FLAVOR, "(ZD)V", "getUseZoom", "()Z", "getZoomLevel", "()D", "component1", "component2", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HyperDefaultZoomConfig {
    private final boolean useZoom;
    private final double zoomLevel;

    public HyperDefaultZoomConfig() {
        this(false, 0.0d, 3, null);
    }

    public static /* synthetic */ HyperDefaultZoomConfig copy$default(HyperDefaultZoomConfig hyperDefaultZoomConfig, boolean z10, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hyperDefaultZoomConfig.useZoom;
        }
        if ((i10 & 2) != 0) {
            d10 = hyperDefaultZoomConfig.zoomLevel;
        }
        return hyperDefaultZoomConfig.copy(z10, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseZoom() {
        return this.useZoom;
    }

    /* renamed from: component2, reason: from getter */
    public final double getZoomLevel() {
        return this.zoomLevel;
    }

    public final HyperDefaultZoomConfig copy(boolean useZoom, double zoomLevel) {
        return new HyperDefaultZoomConfig(useZoom, zoomLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperDefaultZoomConfig)) {
            return false;
        }
        HyperDefaultZoomConfig hyperDefaultZoomConfig = (HyperDefaultZoomConfig) other;
        return this.useZoom == hyperDefaultZoomConfig.useZoom && Double.compare(this.zoomLevel, hyperDefaultZoomConfig.zoomLevel) == 0;
    }

    public final boolean getUseZoom() {
        return this.useZoom;
    }

    public final double getZoomLevel() {
        return this.zoomLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.useZoom;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + Double.hashCode(this.zoomLevel);
    }

    public String toString() {
        return "HyperDefaultZoomConfig(useZoom=" + this.useZoom + ", zoomLevel=" + this.zoomLevel + ')';
    }

    public HyperDefaultZoomConfig(boolean z10, double d10) {
        this.useZoom = z10;
        this.zoomLevel = d10;
        if (d10 < 0.0d) {
            throw new IllegalArgumentException("Zoom level must be non-negative.");
        }
    }

    public /* synthetic */ HyperDefaultZoomConfig(boolean z10, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? 0.0d : d10);
    }
}
