package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class H implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final O f16290b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final O f16291a;

    class a implements O {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16292a;

        static {
            int[] iArr = new int[a0.values().length];
            f16292a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements O {

        /* renamed from: a, reason: collision with root package name */
        private O[] f16293a;

        c(O... oArr) {
            this.f16293a = oArr;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class cls) {
            for (O o10 : this.f16293a) {
                if (o10.b(cls)) {
                    return o10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class cls) {
            for (O o10 : this.f16293a) {
                if (o10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public H() {
        this(c());
    }

    private static boolean b(N n10) {
        return b.f16292a[n10.c().ordinal()] != 1;
    }

    private static O c() {
        return new c(C1554v.c(), d());
    }

    private static O d() {
        if (b0.f16333d) {
            return f16290b;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f16290b;
        }
    }

    private static f0 e(Class cls, N n10) {
        if (f(cls)) {
            return T.N(cls, n10, X.b(), F.b(), h0.K(), b(n10) ? r.b() : null, M.b());
        }
        return T.N(cls, n10, X.a(), F.a(), h0.J(), b(n10) ? r.a() : null, M.a());
    }

    private static boolean f(Class cls) {
        return b0.f16333d || AbstractC1555w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public f0 a(Class cls) {
        h0.G(cls);
        N a10 = this.f16291a.a(cls);
        return a10.a() ? f(cls) ? U.l(h0.K(), r.b(), a10.b()) : U.l(h0.J(), r.a(), a10.b()) : e(cls, a10);
    }

    private H(O o10) {
        this.f16291a = (O) AbstractC1557y.b(o10, "messageInfoFactory");
    }
}
