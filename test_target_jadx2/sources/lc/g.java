package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f37120e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final g f37121f = h.a();

    /* renamed from: a, reason: collision with root package name */
    private final int f37122a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37123b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37124c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37125d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(int i10, int i11, int i12) {
        this.f37122a = i10;
        this.f37123b = i11;
        this.f37124c = i12;
        this.f37125d = c(i10, i11, i12);
    }

    private final int c(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(g other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f37125d - other.f37125d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f37125d == gVar.f37125d;
    }

    public int hashCode() {
        return this.f37125d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37122a);
        sb2.append('.');
        sb2.append(this.f37123b);
        sb2.append('.');
        sb2.append(this.f37124c);
        return sb2.toString();
    }

    public g(int i10, int i11) {
        this(i10, i11, 0);
    }
}
