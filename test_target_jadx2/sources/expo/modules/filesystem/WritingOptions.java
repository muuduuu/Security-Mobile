package expo.modules.filesystem;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0019"}, d2 = {"Lexpo/modules/filesystem/WritingOptions;", "LAb/c;", "Lexpo/modules/filesystem/EncodingType;", "encoding", "<init>", "(Lexpo/modules/filesystem/EncodingType;)V", "component1", "()Lexpo/modules/filesystem/EncodingType;", "copy", "(Lexpo/modules/filesystem/EncodingType;)Lexpo/modules/filesystem/WritingOptions;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/filesystem/EncodingType;", "getEncoding", "getEncoding$annotations", "()V", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WritingOptions implements c {
    private final EncodingType encoding;

    /* JADX WARN: Multi-variable type inference failed */
    public WritingOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WritingOptions copy$default(WritingOptions writingOptions, EncodingType encodingType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            encodingType = writingOptions.encoding;
        }
        return writingOptions.copy(encodingType);
    }

    @b
    public static /* synthetic */ void getEncoding$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    public final WritingOptions copy(EncodingType encoding) {
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        return new WritingOptions(encoding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WritingOptions) && this.encoding == ((WritingOptions) other).encoding;
    }

    public final EncodingType getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return this.encoding.hashCode();
    }

    public String toString() {
        return "WritingOptions(encoding=" + this.encoding + ")";
    }

    public WritingOptions(EncodingType encoding) {
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        this.encoding = encoding;
    }

    public /* synthetic */ WritingOptions(EncodingType encodingType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EncodingType.UTF8 : encodingType);
    }
}
