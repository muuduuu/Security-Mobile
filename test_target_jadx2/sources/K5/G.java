package K5;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public interface G {

    public static class a implements G {

        /* renamed from: a, reason: collision with root package name */
        private final S5.o f5341a;

        /* renamed from: b, reason: collision with root package name */
        private final S5.n f5342b;

        public a(S5.o oVar, S5.n nVar) {
            this.f5341a = oVar;
            this.f5342b = nVar;
        }

        @Override // K5.G
        public D5.j a(Type type) {
            return this.f5341a.F(type, this.f5342b);
        }
    }

    D5.j a(Type type);
}
