package expo.modules.filesystem;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001b"}, d2 = {"Lexpo/modules/filesystem/RelocatingOptions;", "LAb/c;", BuildConfig.FLAVOR, "from", "to", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/RelocatingOptions;", "toString", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFrom", "getFrom$annotations", "()V", "getTo", "getTo$annotations", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RelocatingOptions implements c {
    private final String from;
    private final String to;

    public RelocatingOptions(String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.from = from;
        this.to = to;
    }

    public static /* synthetic */ RelocatingOptions copy$default(RelocatingOptions relocatingOptions, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = relocatingOptions.from;
        }
        if ((i10 & 2) != 0) {
            str2 = relocatingOptions.to;
        }
        return relocatingOptions.copy(str, str2);
    }

    @b
    public static /* synthetic */ void getFrom$annotations() {
    }

    @b
    public static /* synthetic */ void getTo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    public final RelocatingOptions copy(String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return new RelocatingOptions(from, to);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelocatingOptions)) {
            return false;
        }
        RelocatingOptions relocatingOptions = (RelocatingOptions) other;
        return Intrinsics.b(this.from, relocatingOptions.from) && Intrinsics.b(this.to, relocatingOptions.to);
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return (this.from.hashCode() * 31) + this.to.hashCode();
    }

    public String toString() {
        return "RelocatingOptions(from=" + this.from + ", to=" + this.to + ")";
    }
}
