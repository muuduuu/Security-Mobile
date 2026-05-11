package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/KTypeProjection;", BuildConfig.FLAVOR, "Lkotlin/reflect/q;", "variance", "Lkotlin/reflect/o;", "type", "<init>", "(Lkotlin/reflect/q;Lkotlin/reflect/o;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", C4870a.f43493a, "()Lkotlin/reflect/q;", "b", "()Lkotlin/reflect/o;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Lkotlin/reflect/q;", "d", "Lkotlin/reflect/o;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final KTypeProjection f36430d = new KTypeProjection(null, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q variance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o type;

    /* renamed from: kotlin.reflect.KTypeProjection$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KTypeProjection a(o type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(q.IN, type);
        }

        public final KTypeProjection b(o type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(q.OUT, type);
        }

        public final KTypeProjection c() {
            return KTypeProjection.f36430d;
        }

        public final KTypeProjection d(o type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(q.INVARIANT, type);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36433a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36433a = iArr;
        }
    }

    public KTypeProjection(q qVar, o oVar) {
        String str;
        this.variance = qVar;
        this.type = oVar;
        if ((qVar == null) == (oVar == null)) {
            return;
        }
        if (qVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + qVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: a, reason: from getter */
    public final q getVariance() {
        return this.variance;
    }

    /* renamed from: b, reason: from getter */
    public final o getType() {
        return this.type;
    }

    public final o c() {
        return this.type;
    }

    public final q d() {
        return this.variance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) other;
        return this.variance == kTypeProjection.variance && Intrinsics.b(this.type, kTypeProjection.type);
    }

    public int hashCode() {
        q qVar = this.variance;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        o oVar = this.type;
        return hashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        q qVar = this.variance;
        int i10 = qVar == null ? -1 : b.f36433a[qVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.type);
        }
        if (i10 == 2) {
            return "in " + this.type;
        }
        if (i10 != 3) {
            throw new lc.m();
        }
        return "out " + this.type;
    }
}
