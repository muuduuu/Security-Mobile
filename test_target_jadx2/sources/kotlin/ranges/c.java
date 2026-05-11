package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f36427e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final c f36428f = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f36428f;
        }

        private a() {
        }
    }

    public c(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // kotlin.ranges.b
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (c() != cVar.c() || e() != cVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.b
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (c() ^ (c() >>> 32))) + (e() ^ (e() >>> 32)));
    }

    @Override // kotlin.ranges.b
    public boolean isEmpty() {
        return c() > e();
    }

    @Override // kotlin.ranges.b
    public String toString() {
        return c() + ".." + e();
    }
}
