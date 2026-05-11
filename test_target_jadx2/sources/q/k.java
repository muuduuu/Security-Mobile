package Q;

import A.J0;
import Q.h;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import java.util.Collection;

/* loaded from: classes.dex */
class k implements H {

    /* renamed from: a, reason: collision with root package name */
    private final H f7810a;

    /* renamed from: b, reason: collision with root package name */
    private final q f7811b;

    /* renamed from: c, reason: collision with root package name */
    private final r f7812c;

    /* renamed from: d, reason: collision with root package name */
    private final J0.b f7813d;

    k(H h10, J0.b bVar, h.a aVar) {
        this.f7810a = h10;
        this.f7813d = bVar;
        this.f7811b = new q(h10.h(), aVar);
        this.f7812c = new r(h10.q());
    }

    @Override // androidx.camera.core.impl.H
    public E0 b() {
        return this.f7810a.b();
    }

    @Override // A.J0.b
    public void d(J0 j02) {
        E.q.a();
        this.f7813d.d(j02);
    }

    @Override // A.J0.b
    public void f(J0 j02) {
        E.q.a();
        this.f7813d.f(j02);
    }

    @Override // androidx.camera.core.impl.H
    public D h() {
        return this.f7811b;
    }

    @Override // A.J0.b
    public void j(J0 j02) {
        E.q.a();
        this.f7813d.j(j02);
    }

    @Override // A.J0.b
    public void k(J0 j02) {
        E.q.a();
        this.f7813d.k(j02);
    }

    @Override // androidx.camera.core.impl.H
    public void m(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.H
    public void n(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.H
    public boolean o() {
        return false;
    }

    @Override // androidx.camera.core.impl.H
    public G q() {
        return this.f7812c;
    }

    void r(int i10) {
        this.f7812c.a(i10);
    }
}
