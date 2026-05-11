package W;

import H.n;
import V.z0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.l1;
import java.util.Objects;
import o.InterfaceC3735a;
import y0.f;

/* loaded from: classes.dex */
public final class a implements l1, InterfaceC1457q0, n {

    /* renamed from: J, reason: collision with root package name */
    public static final V.a f11158J = V.a.a("camerax.video.VideoCapture.videoOutput", z0.class);

    /* renamed from: K, reason: collision with root package name */
    public static final V.a f11159K = V.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", InterfaceC3735a.class);

    /* renamed from: L, reason: collision with root package name */
    public static final V.a f11160L = V.a.a("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class);

    /* renamed from: I, reason: collision with root package name */
    private final G0 f11161I;

    public a(G0 g02) {
        f.a(g02.b(f11158J));
        this.f11161I = g02;
    }

    public InterfaceC3735a Z() {
        InterfaceC3735a interfaceC3735a = (InterfaceC3735a) a(f11159K);
        Objects.requireNonNull(interfaceC3735a);
        return interfaceC3735a;
    }

    public z0 a0() {
        z0 z0Var = (z0) a(f11158J);
        Objects.requireNonNull(z0Var);
        return z0Var;
    }

    public boolean b0() {
        Boolean bool = (Boolean) f(f11160L, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override // androidx.camera.core.impl.Q0
    public V n() {
        return this.f11161I;
    }

    @Override // androidx.camera.core.impl.InterfaceC1455p0
    public int p() {
        return 34;
    }
}
