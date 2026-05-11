package expo.modules.camera.records;

import Ab.b;
import Ab.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lexpo/modules/camera/records/BarcodeSettings;", "LAb/c;", BuildConfig.FLAVOR, "Lexpo/modules/camera/records/BarcodeType;", "barcodeTypes", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lexpo/modules/camera/records/BarcodeSettings;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBarcodeTypes", "getBarcodeTypes$annotations", "()V", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BarcodeSettings implements c {
    private final List<BarcodeType> barcodeTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSettings(List<? extends BarcodeType> barcodeTypes) {
        Intrinsics.checkNotNullParameter(barcodeTypes, "barcodeTypes");
        this.barcodeTypes = barcodeTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarcodeSettings copy$default(BarcodeSettings barcodeSettings, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = barcodeSettings.barcodeTypes;
        }
        return barcodeSettings.copy(list);
    }

    @b
    public static /* synthetic */ void getBarcodeTypes$annotations() {
    }

    public final List<BarcodeType> component1() {
        return this.barcodeTypes;
    }

    public final BarcodeSettings copy(List<? extends BarcodeType> barcodeTypes) {
        Intrinsics.checkNotNullParameter(barcodeTypes, "barcodeTypes");
        return new BarcodeSettings(barcodeTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BarcodeSettings) && Intrinsics.b(this.barcodeTypes, ((BarcodeSettings) other).barcodeTypes);
    }

    public final List<BarcodeType> getBarcodeTypes() {
        return this.barcodeTypes;
    }

    public int hashCode() {
        return this.barcodeTypes.hashCode();
    }

    public String toString() {
        return "BarcodeSettings(barcodeTypes=" + this.barcodeTypes + ")";
    }
}
