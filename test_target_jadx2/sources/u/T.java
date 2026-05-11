package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* loaded from: classes.dex */
class T extends S {
    T(Context context) {
        super(context);
    }

    @Override // u.U, u.P.b
    public Set e() {
        try {
            return this.f43412a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }
}
