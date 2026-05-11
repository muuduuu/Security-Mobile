package Kc;

/* loaded from: classes3.dex */
public interface a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f5560a = new a();

    static class a implements a0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // Kc.a0
        public b0 a() {
            b0 b0Var = b0.f5561a;
            if (b0Var == null) {
                d(0);
            }
            return b0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    b0 a();
}
