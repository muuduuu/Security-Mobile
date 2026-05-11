package yd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface X {

    public static final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45475a = new a();

        private a() {
        }

        @Override // yd.X
        public void a(n0 substitutor, AbstractC5197E unsubstitutedArgument, AbstractC5197E argument, Kc.f0 typeParameter) {
            Intrinsics.checkNotNullParameter(substitutor, "substitutor");
            Intrinsics.checkNotNullParameter(unsubstitutedArgument, "unsubstitutedArgument");
            Intrinsics.checkNotNullParameter(argument, "argument");
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        }

        @Override // yd.X
        public void b(Kc.e0 typeAlias) {
            Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        }

        @Override // yd.X
        public void c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
        }

        @Override // yd.X
        public void d(Kc.e0 typeAlias, Kc.f0 f0Var, AbstractC5197E substitutedArgument) {
            Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
            Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
        }
    }

    void a(n0 n0Var, AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, Kc.f0 f0Var);

    void b(Kc.e0 e0Var);

    void c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar);

    void d(Kc.e0 e0Var, Kc.f0 f0Var, AbstractC5197E abstractC5197E);
}
