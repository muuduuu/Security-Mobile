package t;

import A.InterfaceC0705k;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.V;
import androidx.concurrent.futures.c;
import s.C4301a;
import t.h2;
import u.C4832C;

/* renamed from: t.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4542f1 implements h2.b {

    /* renamed from: a, reason: collision with root package name */
    private final C4832C f42063a;

    /* renamed from: c, reason: collision with root package name */
    private c.a f42065c;

    /* renamed from: b, reason: collision with root package name */
    private Rect f42064b = null;

    /* renamed from: d, reason: collision with root package name */
    private Rect f42066d = null;

    C4542f1(C4832C c4832c) {
        this.f42063a = c4832c;
    }

    private static Rect h(Rect rect, float f10) {
        float width = rect.width() / f10;
        float height = rect.height() / f10;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    private Rect i() {
        return (Rect) y0.f.g((Rect) this.f42063a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // t.h2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f42065c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f42066d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f42065c.c(null);
            this.f42065c = null;
            this.f42066d = null;
        }
    }

    @Override // t.h2.b
    public void b(float f10, c.a aVar) {
        this.f42064b = h(i(), f10);
        c.a aVar2 = this.f42065c;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0705k.a("There is a new zoomRatio being set"));
        }
        this.f42066d = this.f42064b;
        this.f42065c = aVar;
    }

    @Override // t.h2.b
    public float c() {
        Float f10 = (Float) this.f42063a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < d() ? d() : f10.floatValue();
    }

    @Override // t.h2.b
    public float d() {
        return 1.0f;
    }

    @Override // t.h2.b
    public void e(C4301a.C0609a c0609a) {
        Rect rect = this.f42064b;
        if (rect != null) {
            c0609a.g(CaptureRequest.SCALER_CROP_REGION, rect, V.c.REQUIRED);
        }
    }

    @Override // t.h2.b
    public Rect f() {
        Rect rect = this.f42064b;
        return rect != null ? rect : i();
    }

    @Override // t.h2.b
    public void g() {
        this.f42066d = null;
        this.f42064b = null;
        c.a aVar = this.f42065c;
        if (aVar != null) {
            aVar.f(new InterfaceC0705k.a("Camera is not active."));
            this.f42065c = null;
        }
    }
}
