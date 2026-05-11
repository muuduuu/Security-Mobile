package x1;

/* loaded from: classes.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f44711a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0650b f44712b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f44713a;

            public a(Throwable th) {
                this.f44713a = th;
            }

            public Throwable a() {
                return this.f44713a;
            }

            public String toString() {
                return "FAILURE (" + this.f44713a.getMessage() + ")";
            }
        }

        /* renamed from: x1.r$b$b, reason: collision with other inner class name */
        public static final class C0650b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0650b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f44711a = new b.c();
        f44712b = new b.C0650b();
    }
}
