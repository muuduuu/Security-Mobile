package b3;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f18550a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final o f18551b = new c();

    class a implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f18552a;

        a(Object obj) {
            this.f18552a = obj;
        }

        @Override // b3.o
        public Object get() {
            return this.f18552a;
        }
    }

    class b implements o {
        b() {
        }

        @Override // b3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    class c implements o {
        c() {
        }

        @Override // b3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    public static o a(Object obj) {
        return new a(obj);
    }
}
