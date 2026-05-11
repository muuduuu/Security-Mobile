package u;

import android.hardware.camera2.CameraCharacteristics;
import u.C4832C;

/* renamed from: u.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4830A implements C4832C.a {

    /* renamed from: a, reason: collision with root package name */
    protected final CameraCharacteristics f43381a;

    C4830A(CameraCharacteristics cameraCharacteristics) {
        this.f43381a = cameraCharacteristics;
    }

    @Override // u.C4832C.a
    public Object a(CameraCharacteristics.Key key) {
        return this.f43381a.get(key);
    }
}
