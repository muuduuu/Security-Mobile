package Wc;

import Zc.w;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11436a = new a();

        private a() {
        }

        @Override // Wc.b
        public Set a() {
            return O.d();
        }

        @Override // Wc.b
        public Zc.n c(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // Wc.b
        public Set d() {
            return O.d();
        }

        @Override // Wc.b
        public w e(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // Wc.b
        public Set f() {
            return O.d();
        }

        @Override // Wc.b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public List b(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return CollectionsKt.j();
        }
    }

    Set a();

    Collection b(id.f fVar);

    Zc.n c(id.f fVar);

    Set d();

    w e(id.f fVar);

    Set f();
}
