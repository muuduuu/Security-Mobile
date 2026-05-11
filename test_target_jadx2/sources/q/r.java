package Q;

import androidx.camera.core.impl.AbstractC1447l0;
import androidx.camera.core.impl.G;
import java.util.UUID;

/* loaded from: classes.dex */
public class r extends AbstractC1447l0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f7835b;

    /* renamed from: c, reason: collision with root package name */
    private int f7836c;

    r(G g10) {
        super(g10);
        this.f7835b = "virtual-" + g10.f() + "-" + UUID.randomUUID().toString();
    }

    void a(int i10) {
        this.f7836c = i10;
    }

    @Override // androidx.camera.core.impl.AbstractC1447l0, A.InterfaceC0713p
    public int d() {
        return m(0);
    }

    @Override // androidx.camera.core.impl.AbstractC1447l0, androidx.camera.core.impl.G
    public String f() {
        return this.f7835b;
    }

    @Override // androidx.camera.core.impl.AbstractC1447l0, A.InterfaceC0713p
    public int m(int i10) {
        return E.r.v(super.m(i10) - this.f7836c);
    }
}
