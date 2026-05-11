package A;

/* renamed from: A.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0715s {

    /* renamed from: A.s$a */
    public static abstract class a {
        public static a a(int i10) {
            return b(i10, null);
        }

        public static a b(int i10, Throwable th) {
            return new C0689c(i10, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* renamed from: A.s$b */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC0715s a(b bVar) {
        return b(bVar, null);
    }

    public static AbstractC0715s b(b bVar, a aVar) {
        return new C0687b(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
