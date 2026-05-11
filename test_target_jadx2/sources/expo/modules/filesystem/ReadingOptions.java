package expo.modules.filesystem;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\nR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b!\u0010\f¨\u0006#"}, d2 = {"Lexpo/modules/filesystem/ReadingOptions;", "LAb/c;", "Lexpo/modules/filesystem/EncodingType;", "encoding", BuildConfig.FLAVOR, "position", "length", "<init>", "(Lexpo/modules/filesystem/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Lexpo/modules/filesystem/EncodingType;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Lexpo/modules/filesystem/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)Lexpo/modules/filesystem/ReadingOptions;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/filesystem/EncodingType;", "getEncoding", "getEncoding$annotations", "()V", "Ljava/lang/Integer;", "getPosition", "getPosition$annotations", "getLength", "getLength$annotations", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReadingOptions implements c {
    private final EncodingType encoding;
    private final Integer length;
    private final Integer position;

    public ReadingOptions(EncodingType encoding, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        this.encoding = encoding;
        this.position = num;
        this.length = num2;
    }

    public static /* synthetic */ ReadingOptions copy$default(ReadingOptions readingOptions, EncodingType encodingType, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            encodingType = readingOptions.encoding;
        }
        if ((i10 & 2) != 0) {
            num = readingOptions.position;
        }
        if ((i10 & 4) != 0) {
            num2 = readingOptions.length;
        }
        return readingOptions.copy(encodingType, num, num2);
    }

    @b
    public static /* synthetic */ void getEncoding$annotations() {
    }

    @b
    public static /* synthetic */ void getLength$annotations() {
    }

    @b
    public static /* synthetic */ void getPosition$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    public final ReadingOptions copy(EncodingType encoding, Integer position, Integer length) {
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        return new ReadingOptions(encoding, position, length);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadingOptions)) {
            return false;
        }
        ReadingOptions readingOptions = (ReadingOptions) other;
        return this.encoding == readingOptions.encoding && Intrinsics.b(this.position, readingOptions.position) && Intrinsics.b(this.length, readingOptions.length);
    }

    public final EncodingType getEncoding() {
        return this.encoding;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = this.encoding.hashCode() * 31;
        Integer num = this.position;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.length;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ReadingOptions(encoding=" + this.encoding + ", position=" + this.position + ", length=" + this.length + ")";
    }

    public /* synthetic */ ReadingOptions(EncodingType encodingType, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EncodingType.UTF8 : encodingType, num, num2);
    }
}
