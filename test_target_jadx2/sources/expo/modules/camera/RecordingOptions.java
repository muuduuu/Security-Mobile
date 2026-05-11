package expo.modules.camera;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001b"}, d2 = {"Lexpo/modules/camera/RecordingOptions;", "LAb/c;", BuildConfig.FLAVOR, "maxDuration", "maxFileSize", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lexpo/modules/camera/RecordingOptions;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "I", "getMaxDuration", "getMaxDuration$annotations", "()V", "getMaxFileSize", "getMaxFileSize$annotations", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecordingOptions implements c {
    private final int maxDuration;
    private final int maxFileSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecordingOptions() {
        this(r2, r2, 3, null);
        int i10 = 0;
    }

    public static /* synthetic */ RecordingOptions copy$default(RecordingOptions recordingOptions, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = recordingOptions.maxDuration;
        }
        if ((i12 & 2) != 0) {
            i11 = recordingOptions.maxFileSize;
        }
        return recordingOptions.copy(i10, i11);
    }

    @b
    public static /* synthetic */ void getMaxDuration$annotations() {
    }

    @b
    public static /* synthetic */ void getMaxFileSize$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final RecordingOptions copy(int maxDuration, int maxFileSize) {
        return new RecordingOptions(maxDuration, maxFileSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordingOptions)) {
            return false;
        }
        RecordingOptions recordingOptions = (RecordingOptions) other;
        return this.maxDuration == recordingOptions.maxDuration && this.maxFileSize == recordingOptions.maxFileSize;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxDuration) * 31) + Integer.hashCode(this.maxFileSize);
    }

    public String toString() {
        return "RecordingOptions(maxDuration=" + this.maxDuration + ", maxFileSize=" + this.maxFileSize + ")";
    }

    public RecordingOptions(int i10, int i11) {
        this.maxDuration = i10;
        this.maxFileSize = i11;
    }

    public /* synthetic */ RecordingOptions(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
