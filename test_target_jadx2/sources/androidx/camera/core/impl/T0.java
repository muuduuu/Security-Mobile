package androidx.camera.core.impl;

import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;

/* loaded from: classes.dex */
public class T0 extends AbstractC1447l0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f14472b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14473c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14474d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1473z f14475e;

    public T0(G g10, InterfaceC1473z interfaceC1473z) {
        super(g10);
        this.f14473c = false;
        this.f14474d = false;
        this.f14472b = g10;
        this.f14475e = interfaceC1473z;
        interfaceC1473z.Y(null);
        u(interfaceC1473z.y());
        t(interfaceC1473z.Q());
    }

    public InterfaceC1473z a() {
        return this.f14475e;
    }

    @Override // androidx.camera.core.impl.AbstractC1447l0, androidx.camera.core.impl.G
    public G g() {
        return this.f14472b;
    }

    @Override // androidx.camera.core.impl.AbstractC1447l0, A.InterfaceC0713p
    public boolean n() {
        if (E.p.b(null, 5)) {
            return this.f14472b.n();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AbstractC1447l0, A.InterfaceC0713p
    public AbstractC1604v r() {
        return !E.p.b(null, 0) ? new C1607y(H.g.e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f14472b.r();
    }

    public void t(boolean z10) {
        this.f14474d = z10;
    }

    public void u(boolean z10) {
        this.f14473c = z10;
    }
}
