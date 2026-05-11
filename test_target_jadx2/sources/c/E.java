package C;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC1458r0;
import androidx.camera.core.impl.d1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class E implements InterfaceC1458r0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1458r0 f583a;

    /* renamed from: b, reason: collision with root package name */
    private P f584b;

    E(InterfaceC1458r0 interfaceC1458r0) {
        this.f583a = interfaceC1458r0;
    }

    private androidx.camera.core.n k(androidx.camera.core.n nVar) {
        if (nVar == null) {
            return null;
        }
        d1 b10 = this.f584b == null ? d1.b() : d1.a(new Pair(this.f584b.i(), this.f584b.h().get(0)));
        this.f584b = null;
        return new androidx.camera.core.r(nVar, new Size(nVar.getWidth(), nVar.getHeight()), new H.c(new Q.m(b10, nVar.G().a())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(InterfaceC1458r0.a aVar, InterfaceC1458r0 interfaceC1458r0) {
        aVar.a(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public Surface a() {
        return this.f583a.a();
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public androidx.camera.core.n c() {
        return k(this.f583a.c());
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void close() {
        this.f583a.close();
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int d() {
        return this.f583a.d();
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void e() {
        this.f583a.e();
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int f() {
        return this.f583a.f();
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public androidx.camera.core.n g() {
        return k(this.f583a.g());
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getHeight() {
        return this.f583a.getHeight();
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getWidth() {
        return this.f583a.getWidth();
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void h(final InterfaceC1458r0.a aVar, Executor executor) {
        this.f583a.h(new InterfaceC1458r0.a() { // from class: C.D
            @Override // androidx.camera.core.impl.InterfaceC1458r0.a
            public final void a(InterfaceC1458r0 interfaceC1458r0) {
                E.this.l(aVar, interfaceC1458r0);
            }
        }, executor);
    }

    void i(P p10) {
        y0.f.j(this.f584b == null, "Pending request should be null");
        this.f584b = p10;
    }

    void j() {
        this.f584b = null;
    }
}
