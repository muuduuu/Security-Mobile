package Q;

import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.l1;
import java.util.List;

/* loaded from: classes.dex */
public class j implements l1, InterfaceC1457q0, H.n {

    /* renamed from: J, reason: collision with root package name */
    static final V.a f7808J = V.a.a("camerax.core.streamSharing.captureTypes", List.class);

    /* renamed from: I, reason: collision with root package name */
    private final G0 f7809I;

    j(G0 g02) {
        this.f7809I = g02;
    }

    public List Z() {
        return (List) a(f7808J);
    }

    @Override // androidx.camera.core.impl.Q0
    public V n() {
        return this.f7809I;
    }
}
