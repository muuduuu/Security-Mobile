package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class x implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37146b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f37147a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ x(long j10) {
        this.f37147a = j10;
    }

    public static final /* synthetic */ x b(long j10) {
        return new x(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).o();
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String n(long j10) {
        return AbstractC3621C.c(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC3621C.b(o(), ((x) obj).o());
    }

    public boolean equals(Object obj) {
        return d(this.f37147a, obj);
    }

    public int hashCode() {
        return e(this.f37147a);
    }

    public final /* synthetic */ long o() {
        return this.f37147a;
    }

    public String toString() {
        return n(this.f37147a);
    }

    public static long c(long j10) {
        return j10;
    }
}
