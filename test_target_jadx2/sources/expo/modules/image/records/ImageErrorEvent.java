package expo.modules.image.records;

import Ab.c;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lexpo/modules/image/records/ImageErrorEvent;", "LAb/c;", BuildConfig.FLAVOR, AppConstants.VIDEO_RECORDING_ERROR, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lexpo/modules/image/records/ImageErrorEvent;", "toString", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getError$annotations", "()V", "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ImageErrorEvent implements c {
    private final String error;

    public ImageErrorEvent(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    public static /* synthetic */ ImageErrorEvent copy$default(ImageErrorEvent imageErrorEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = imageErrorEvent.error;
        }
        return imageErrorEvent.copy(str);
    }

    @Ab.b
    public static /* synthetic */ void getError$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ImageErrorEvent copy(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ImageErrorEvent(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageErrorEvent) && Intrinsics.b(this.error, ((ImageErrorEvent) other).error);
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return "ImageErrorEvent(error=" + this.error + ")";
    }
}
