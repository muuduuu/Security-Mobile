package R;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.V;

/* loaded from: classes.dex */
public class d implements Q0 {

    /* renamed from: I, reason: collision with root package name */
    private V f8358I;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private B0 f8359a = B0.d0();

        public d a() {
            return new d(G0.b0(this.f8359a));
        }

        public b b(CaptureRequest.Key key, Object obj) {
            this.f8359a.x(d.Z(key), obj);
            return this;
        }
    }

    static V.a Z(CaptureRequest.Key key) {
        return V.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    @Override // androidx.camera.core.impl.Q0
    public V n() {
        return this.f8358I;
    }

    private d(V v10) {
        this.f8358I = v10;
    }
}
