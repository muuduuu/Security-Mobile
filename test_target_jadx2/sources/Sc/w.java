package Sc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9065d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final w f9066e = new w(G.STRICT, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    private final G f9067a;

    /* renamed from: b, reason: collision with root package name */
    private final lc.g f9068b;

    /* renamed from: c, reason: collision with root package name */
    private final G f9069c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a() {
            return w.f9066e;
        }

        private a() {
        }
    }

    public w(G reportLevelBefore, lc.g gVar, G reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f9067a = reportLevelBefore;
        this.f9068b = gVar;
        this.f9069c = reportLevelAfter;
    }

    public final G b() {
        return this.f9069c;
    }

    public final G c() {
        return this.f9067a;
    }

    public final lc.g d() {
        return this.f9068b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f9067a == wVar.f9067a && Intrinsics.b(this.f9068b, wVar.f9068b) && this.f9069c == wVar.f9069c;
    }

    public int hashCode() {
        int hashCode = this.f9067a.hashCode() * 31;
        lc.g gVar = this.f9068b;
        return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f9069c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f9067a + ", sinceVersion=" + this.f9068b + ", reportLevelAfter=" + this.f9069c + ')';
    }

    public /* synthetic */ w(G g10, lc.g gVar, G g11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g10, (i10 & 2) != 0 ? new lc.g(1, 0) : gVar, (i10 & 4) != 0 ? g10 : g11);
    }
}
