package ee;

/* renamed from: ee.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3122a {

    /* renamed from: a, reason: collision with root package name */
    private final int f32566a;

    /* renamed from: b, reason: collision with root package name */
    private long f32567b;

    /* renamed from: c, reason: collision with root package name */
    private long f32568c;

    public C3122a(int i10) {
        this.f32566a = i10;
    }

    public static /* synthetic */ void c(C3122a c3122a, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        c3122a.b(j10, j11);
    }

    public final synchronized long a() {
        return this.f32567b - this.f32568c;
    }

    public final synchronized void b(long j10, long j11) {
        try {
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j12 = this.f32567b + j10;
            this.f32567b = j12;
            long j13 = this.f32568c + j11;
            this.f32568c = j13;
            if (j13 > j12) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f32566a + ", total=" + this.f32567b + ", acknowledged=" + this.f32568c + ", unacknowledged=" + a() + ')';
    }
}
