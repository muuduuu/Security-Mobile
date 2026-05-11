package androidx.camera.core.impl;

import A.InterfaceC0705k;
import A.W;
import C.InterfaceC0733k;
import android.graphics.Rect;
import androidx.camera.core.impl.V0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface D extends InterfaceC0705k {

    /* renamed from: a, reason: collision with root package name */
    public static final D f14409a = new b();

    class a implements InterfaceC0733k {
        a() {
        }

        @Override // C.InterfaceC0733k
        public h8.d a() {
            return G.n.p(null);
        }

        @Override // C.InterfaceC0733k
        public h8.d b() {
            return G.n.p(null);
        }
    }

    class b implements D {
        b() {
        }

        @Override // androidx.camera.core.impl.D
        public void a(V0.b bVar) {
        }

        @Override // androidx.camera.core.impl.D
        public h8.d c(List list, int i10, int i11) {
            return G.n.p(Collections.emptyList());
        }

        @Override // A.InterfaceC0705k
        public h8.d d() {
            return G.n.p(null);
        }

        @Override // androidx.camera.core.impl.D
        public void e(V v10) {
        }

        @Override // A.InterfaceC0705k
        public h8.d f(float f10) {
            return G.n.p(null);
        }

        @Override // androidx.camera.core.impl.D
        public Rect g() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.D
        public void h(int i10) {
        }

        @Override // A.InterfaceC0705k
        public h8.d i(boolean z10) {
            return G.n.p(null);
        }

        @Override // androidx.camera.core.impl.D
        public V k() {
            return null;
        }

        @Override // A.InterfaceC0705k
        public h8.d l(A.D d10) {
            return G.n.p(A.E.b());
        }

        @Override // androidx.camera.core.impl.D
        public void n() {
        }
    }

    public static final class c extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private C1454p f14411a;

        public c(C1454p c1454p) {
            this.f14411a = c1454p;
        }
    }

    public interface d {
        void a();

        void b(List list);
    }

    void a(V0.b bVar);

    default void b() {
    }

    h8.d c(List list, int i10, int i11);

    void e(V v10);

    Rect g();

    void h(int i10);

    default h8.d j(int i10, int i11) {
        return G.n.p(new a());
    }

    V k();

    void n();

    default void o() {
    }

    default void m(W.i iVar) {
    }
}
