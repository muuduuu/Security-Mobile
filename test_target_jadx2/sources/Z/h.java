package z;

import A.InterfaceC0713p;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.impl.G;
import t.U;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private U f45592a;

    public h(U u10) {
        this.f45592a = u10;
    }

    public static h a(InterfaceC0713p interfaceC0713p) {
        G g10 = ((G) interfaceC0713p).g();
        y0.f.b(g10 instanceof U, "CameraInfo doesn't contain Camera2 implementation.");
        return ((U) g10).a();
    }

    public Object b(CameraCharacteristics.Key key) {
        return this.f45592a.t().a(key);
    }

    public String c() {
        return this.f45592a.f();
    }
}
