package E2;

/* loaded from: classes.dex */
public abstract class c {

    private static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f1881a;

        b() {
            super();
        }

        @Override // E2.c
        public void b(boolean z10) {
            this.f1881a = z10;
        }

        @Override // E2.c
        public void c() {
            if (this.f1881a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
