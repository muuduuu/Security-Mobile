package t;

import A.InterfaceC0705k;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.V;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import s.C4301a;
import t.C4584u;
import u.C4832C;

/* renamed from: t.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4551i1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4584u f42106a;

    /* renamed from: b, reason: collision with root package name */
    private final C4554j1 f42107b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f42108c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42109d = false;

    /* renamed from: e, reason: collision with root package name */
    private c.a f42110e;

    /* renamed from: f, reason: collision with root package name */
    private C4584u.c f42111f;

    C4551i1(C4584u c4584u, C4832C c4832c, Executor executor) {
        this.f42106a = c4584u;
        this.f42107b = new C4554j1(c4832c, 0);
        this.f42108c = executor;
    }

    private void a() {
        c.a aVar = this.f42110e;
        if (aVar != null) {
            aVar.f(new InterfaceC0705k.a("Cancelled by another setExposureCompensationIndex()"));
            this.f42110e = null;
        }
        C4584u.c cVar = this.f42111f;
        if (cVar != null) {
            this.f42106a.k0(cVar);
            this.f42111f = null;
        }
    }

    void b(boolean z10) {
        if (z10 == this.f42109d) {
            return;
        }
        this.f42109d = z10;
        if (z10) {
            return;
        }
        this.f42107b.b(0);
        a();
    }

    void c(C4301a.C0609a c0609a) {
        c0609a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f42107b.a()), V.c.REQUIRED);
    }
}
