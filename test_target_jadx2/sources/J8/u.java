package J8;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final long f4863a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4864b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f4865a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f4866b = com.google.firebase.remoteconfig.internal.m.f28360j;

        public u c() {
            return new u(this);
        }

        public b d(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f4865a = j10;
            return this;
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f4866b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f4863a;
    }

    public long b() {
        return this.f4864b;
    }

    private u(b bVar) {
        this.f4863a = bVar.f4865a;
        this.f4864b = bVar.f4866b;
    }
}
