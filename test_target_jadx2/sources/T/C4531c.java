package t;

import A.InterfaceC0705k;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.impl.V;
import androidx.concurrent.futures.c;
import s.C4301a;
import t.h2;
import u.C4832C;
import v.C4891b;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4531c implements h2.b {

    /* renamed from: a, reason: collision with root package name */
    private final C4832C f42028a;

    /* renamed from: b, reason: collision with root package name */
    private final Range f42029b;

    /* renamed from: d, reason: collision with root package name */
    private c.a f42031d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42033f;

    /* renamed from: c, reason: collision with root package name */
    private float f42030c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f42032e = 1.0f;

    C4531c(C4832C c4832c) {
        CameraCharacteristics.Key key;
        this.f42033f = false;
        this.f42028a = c4832c;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f42029b = (Range) c4832c.a(key);
        this.f42033f = c4832c.d();
    }

    @Override // t.h2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f10;
        if (this.f42031d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f10 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f10 = (Float) request.get(key);
            }
            if (f10 == null) {
                return;
            }
            if (this.f42032e == f10.floatValue()) {
                this.f42031d.c(null);
                this.f42031d = null;
            }
        }
    }

    @Override // t.h2.b
    public void b(float f10, c.a aVar) {
        this.f42030c = f10;
        c.a aVar2 = this.f42031d;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0705k.a("There is a new zoomRatio being set"));
        }
        this.f42032e = this.f42030c;
        this.f42031d = aVar;
    }

    @Override // t.h2.b
    public float c() {
        return ((Float) this.f42029b.getUpper()).floatValue();
    }

    @Override // t.h2.b
    public float d() {
        return ((Float) this.f42029b.getLower()).floatValue();
    }

    @Override // t.h2.b
    public void e(C4301a.C0609a c0609a) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.f42030c);
        V.c cVar = V.c.REQUIRED;
        c0609a.g(key, valueOf, cVar);
        if (this.f42033f) {
            C4891b.a(c0609a, cVar);
        }
    }

    @Override // t.h2.b
    public Rect f() {
        return (Rect) y0.f.g((Rect) this.f42028a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // t.h2.b
    public void g() {
        this.f42030c = 1.0f;
        c.a aVar = this.f42031d;
        if (aVar != null) {
            aVar.f(new InterfaceC0705k.a("Camera is not active."));
            this.f42031d = null;
        }
    }
}
