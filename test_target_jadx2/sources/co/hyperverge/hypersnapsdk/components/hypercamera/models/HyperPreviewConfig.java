package co.hyperverge.hypersnapsdk.components.hypercamera.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperPreviewConfig;", BuildConfig.FLAVOR, "needPreviewCallback", BuildConfig.FLAVOR, "highResolution", "enhancedFeatures", "randomiseResolution", "(ZZZZ)V", "getEnhancedFeatures", "()Z", "getHighResolution", "getNeedPreviewCallback", "getRandomiseResolution", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HyperPreviewConfig {
    private final boolean enhancedFeatures;
    private final boolean highResolution;
    private final boolean needPreviewCallback;
    private final boolean randomiseResolution;

    public HyperPreviewConfig() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ HyperPreviewConfig copy$default(HyperPreviewConfig hyperPreviewConfig, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hyperPreviewConfig.needPreviewCallback;
        }
        if ((i10 & 2) != 0) {
            z11 = hyperPreviewConfig.highResolution;
        }
        if ((i10 & 4) != 0) {
            z12 = hyperPreviewConfig.enhancedFeatures;
        }
        if ((i10 & 8) != 0) {
            z13 = hyperPreviewConfig.randomiseResolution;
        }
        return hyperPreviewConfig.copy(z10, z11, z12, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNeedPreviewCallback() {
        return this.needPreviewCallback;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHighResolution() {
        return this.highResolution;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnhancedFeatures() {
        return this.enhancedFeatures;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRandomiseResolution() {
        return this.randomiseResolution;
    }

    public final HyperPreviewConfig copy(boolean needPreviewCallback, boolean highResolution, boolean enhancedFeatures, boolean randomiseResolution) {
        return new HyperPreviewConfig(needPreviewCallback, highResolution, enhancedFeatures, randomiseResolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperPreviewConfig)) {
            return false;
        }
        HyperPreviewConfig hyperPreviewConfig = (HyperPreviewConfig) other;
        return this.needPreviewCallback == hyperPreviewConfig.needPreviewCallback && this.highResolution == hyperPreviewConfig.highResolution && this.enhancedFeatures == hyperPreviewConfig.enhancedFeatures && this.randomiseResolution == hyperPreviewConfig.randomiseResolution;
    }

    public final boolean getEnhancedFeatures() {
        return this.enhancedFeatures;
    }

    public final boolean getHighResolution() {
        return this.highResolution;
    }

    public final boolean getNeedPreviewCallback() {
        return this.needPreviewCallback;
    }

    public final boolean getRandomiseResolution() {
        return this.randomiseResolution;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.needPreviewCallback;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.highResolution;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.enhancedFeatures;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.randomiseResolution;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "HyperPreviewConfig(needPreviewCallback=" + this.needPreviewCallback + ", highResolution=" + this.highResolution + ", enhancedFeatures=" + this.enhancedFeatures + ", randomiseResolution=" + this.randomiseResolution + ')';
    }

    public HyperPreviewConfig(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.needPreviewCallback = z10;
        this.highResolution = z11;
        this.enhancedFeatures = z12;
        this.randomiseResolution = z13;
    }

    public /* synthetic */ HyperPreviewConfig(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13);
    }
}
