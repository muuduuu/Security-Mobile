package com.google.protobuf;

/* loaded from: classes2.dex */
final class F implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final M f28672b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final M f28673a;

    class a implements M {
        a() {
        }

        @Override // com.google.protobuf.M
        public L a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.M
        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements M {

        /* renamed from: a, reason: collision with root package name */
        private M[] f28674a;

        b(M... mArr) {
            this.f28674a = mArr;
        }

        @Override // com.google.protobuf.M
        public L a(Class cls) {
            for (M m10 : this.f28674a) {
                if (m10.b(cls)) {
                    return m10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.M
        public boolean b(Class cls) {
            for (M m10 : this.f28674a) {
                if (m10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public F() {
        this(b());
    }

    private static M b() {
        return new b(C2890v.c(), c());
    }

    private static M c() {
        try {
            return (M) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f28672b;
        }
    }

    private static boolean d(L l10) {
        return l10.c() == Y.PROTO2;
    }

    private static c0 e(Class cls, L l10) {
        return AbstractC2891w.class.isAssignableFrom(cls) ? d(l10) ? Q.P(cls, l10, V.b(), D.b(), e0.L(), r.b(), K.b()) : Q.P(cls, l10, V.b(), D.b(), e0.L(), null, K.b()) : d(l10) ? Q.P(cls, l10, V.a(), D.a(), e0.G(), r.a(), K.a()) : Q.P(cls, l10, V.a(), D.a(), e0.H(), null, K.a());
    }

    @Override // com.google.protobuf.d0
    public c0 a(Class cls) {
        e0.I(cls);
        L a10 = this.f28673a.a(cls);
        return a10.a() ? AbstractC2891w.class.isAssignableFrom(cls) ? S.k(e0.L(), r.b(), a10.b()) : S.k(e0.G(), r.a(), a10.b()) : e(cls, a10);
    }

    private F(M m10) {
        this.f28673a = (M) AbstractC2893y.b(m10, "messageInfoFactory");
    }
}
