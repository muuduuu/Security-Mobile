package androidx.camera.core.impl;

import androidx.camera.core.impl.V;
import java.util.Set;

/* loaded from: classes.dex */
public interface Q0 extends V {
    @Override // androidx.camera.core.impl.V
    default Object a(V.a aVar) {
        return n().a(aVar);
    }

    @Override // androidx.camera.core.impl.V
    default boolean b(V.a aVar) {
        return n().b(aVar);
    }

    @Override // androidx.camera.core.impl.V
    default void c(String str, V.b bVar) {
        n().c(str, bVar);
    }

    @Override // androidx.camera.core.impl.V
    default Object d(V.a aVar, V.c cVar) {
        return n().d(aVar, cVar);
    }

    @Override // androidx.camera.core.impl.V
    default Set e() {
        return n().e();
    }

    @Override // androidx.camera.core.impl.V
    default Object f(V.a aVar, Object obj) {
        return n().f(aVar, obj);
    }

    @Override // androidx.camera.core.impl.V
    default V.c g(V.a aVar) {
        return n().g(aVar);
    }

    @Override // androidx.camera.core.impl.V
    default Set h(V.a aVar) {
        return n().h(aVar);
    }

    V n();
}
