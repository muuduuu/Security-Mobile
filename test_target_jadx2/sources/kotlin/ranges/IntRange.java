package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "start", "endInclusive", "<init>", "(II)V", "value", BuildConfig.FLAVOR, "C", "(I)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "t", "()Ljava/lang/Integer;", "r", "e", C4870a.f43493a, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntRange extends a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final IntRange f36418f = new IntRange(1, 0);

    /* renamed from: kotlin.ranges.IntRange$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange a() {
            return IntRange.f36418f;
        }

        private Companion() {
        }
    }

    public IntRange(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean C(int value) {
        return c() <= value && value <= e();
    }

    @Override // kotlin.ranges.a
    public boolean equals(Object other) {
        if (other instanceof IntRange) {
            if (!isEmpty() || !((IntRange) other).isEmpty()) {
                IntRange intRange = (IntRange) other;
                if (c() != intRange.c() || e() != intRange.e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + e();
    }

    @Override // kotlin.ranges.a
    public boolean isEmpty() {
        return c() > e();
    }

    public Integer r() {
        return Integer.valueOf(e());
    }

    public Integer t() {
        return Integer.valueOf(c());
    }

    @Override // kotlin.ranges.a
    public String toString() {
        return c() + ".." + e();
    }
}
