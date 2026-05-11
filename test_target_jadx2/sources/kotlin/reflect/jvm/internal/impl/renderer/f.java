package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;

/* loaded from: classes3.dex */
public interface f {

    public static final class a {
        public static boolean a(f fVar) {
            return fVar.o().getIncludeAnnotationArguments();
        }

        public static boolean b(f fVar) {
            return fVar.o().getIncludeEmptyAnnotationArguments();
        }
    }

    void a(Set set);

    void b(boolean z10);

    void c(Set set);

    void d(k kVar);

    void e(boolean z10);

    boolean f();

    void g(b bVar);

    void h(boolean z10);

    void i(boolean z10);

    void j(boolean z10);

    void k(boolean z10);

    void l(m mVar);

    Set m();

    boolean n();

    kotlin.reflect.jvm.internal.impl.renderer.a o();

    void p(boolean z10);
}
