package expo.modules.image.records;

import Ab.c;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001b"}, d2 = {"Lexpo/modules/image/records/ImageProgressEvent;", "LAb/c;", BuildConfig.FLAVOR, "loaded", "total", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lexpo/modules/image/records/ImageProgressEvent;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "I", "getLoaded", "getLoaded$annotations", "()V", "getTotal", "getTotal$annotations", "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ImageProgressEvent implements c {
    private final int loaded;
    private final int total;

    public ImageProgressEvent(int i10, int i11) {
        this.loaded = i10;
        this.total = i11;
    }

    public static /* synthetic */ ImageProgressEvent copy$default(ImageProgressEvent imageProgressEvent, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = imageProgressEvent.loaded;
        }
        if ((i12 & 2) != 0) {
            i11 = imageProgressEvent.total;
        }
        return imageProgressEvent.copy(i10, i11);
    }

    @Ab.b
    public static /* synthetic */ void getLoaded$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getTotal$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getLoaded() {
        return this.loaded;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final ImageProgressEvent copy(int loaded, int total) {
        return new ImageProgressEvent(loaded, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageProgressEvent)) {
            return false;
        }
        ImageProgressEvent imageProgressEvent = (ImageProgressEvent) other;
        return this.loaded == imageProgressEvent.loaded && this.total == imageProgressEvent.total;
    }

    public final int getLoaded() {
        return this.loaded;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (Integer.hashCode(this.loaded) * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "ImageProgressEvent(loaded=" + this.loaded + ", total=" + this.total + ")";
    }
}
