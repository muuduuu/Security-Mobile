package D2;

/* loaded from: classes.dex */
public abstract class f {

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private volatile Object f1189a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f1190b;

        a(b bVar) {
            this.f1190b = bVar;
        }

        @Override // D2.f.b
        public Object get() {
            if (this.f1189a == null) {
                synchronized (this) {
                    try {
                        if (this.f1189a == null) {
                            this.f1189a = k.d(this.f1190b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f1189a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
