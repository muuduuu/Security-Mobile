package t;

import A.AbstractC0700h0;
import L.c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.C1460s0;
import androidx.camera.core.impl.InterfaceC1458r0;
import androidx.camera.core.impl.V0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import u.C4832C;

/* loaded from: classes.dex */
final class n2 implements j2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4832C f42146a;

    /* renamed from: b, reason: collision with root package name */
    final L.f f42147b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42148c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42149d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42150e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42151f;

    /* renamed from: g, reason: collision with root package name */
    androidx.camera.core.q f42152g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC1450n f42153h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC1429c0 f42154i;

    /* renamed from: j, reason: collision with root package name */
    ImageWriter f42155j;

    n2(C4832C c4832c) {
        this.f42150e = false;
        this.f42151f = false;
        this.f42146a = c4832c;
        this.f42150e = o2.a(c4832c, 4);
        this.f42151f = androidx.camera.camera2.internal.compat.quirk.b.b(ZslDisablerQuirk.class) != null;
        this.f42147b = new L.f(3, new c.a() { // from class: t.k2
            @Override // L.c.a
            public final void a(Object obj) {
                ((androidx.camera.core.n) obj).close();
            }
        });
    }

    private void j() {
        L.f fVar = this.f42147b;
        while (!fVar.isEmpty()) {
            ((androidx.camera.core.n) fVar.a()).close();
        }
        AbstractC1429c0 abstractC1429c0 = this.f42154i;
        if (abstractC1429c0 != null) {
            androidx.camera.core.q qVar = this.f42152g;
            if (qVar != null) {
                abstractC1429c0.k().e(new m2(qVar), F.c.e());
                this.f42152g = null;
            }
            abstractC1429c0.d();
            this.f42154i = null;
        }
        ImageWriter imageWriter = this.f42155j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f42155j = null;
        }
    }

    private Map k(C4832C c4832c) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c4832c.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            AbstractC0700h0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new E.e(true));
                hashMap.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return hashMap;
    }

    private boolean l(C4832C c4832c, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c4832c.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(InterfaceC1458r0 interfaceC1458r0) {
        try {
            androidx.camera.core.n c10 = interfaceC1458r0.c();
            if (c10 != null) {
                this.f42147b.b(c10);
            }
        } catch (IllegalStateException e10) {
            AbstractC0700h0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    @Override // t.j2
    public void a(V0.b bVar) {
        j();
        if (this.f42148c) {
            bVar.z(1);
            return;
        }
        if (this.f42151f) {
            bVar.z(1);
            return;
        }
        Map k10 = k(this.f42146a);
        if (!this.f42150e || k10.isEmpty() || !k10.containsKey(34) || !l(this.f42146a, 34)) {
            bVar.z(1);
            return;
        }
        Size size = (Size) k10.get(34);
        androidx.camera.core.p pVar = new androidx.camera.core.p(size.getWidth(), size.getHeight(), 34, 9);
        this.f42153h = pVar.n();
        this.f42152g = new androidx.camera.core.q(pVar);
        pVar.h(new InterfaceC1458r0.a() { // from class: t.l2
            @Override // androidx.camera.core.impl.InterfaceC1458r0.a
            public final void a(InterfaceC1458r0 interfaceC1458r0) {
                n2.this.m(interfaceC1458r0);
            }
        }, F.c.d());
        C1460s0 c1460s0 = new C1460s0(this.f42152g.a(), new Size(this.f42152g.getWidth(), this.f42152g.getHeight()), 34);
        this.f42154i = c1460s0;
        androidx.camera.core.q qVar = this.f42152g;
        h8.d k11 = c1460s0.k();
        Objects.requireNonNull(qVar);
        k11.e(new m2(qVar), F.c.e());
        bVar.l(this.f42154i);
        bVar.e(this.f42153h);
        bVar.k(new a());
        bVar.w(new InputConfiguration(this.f42152g.getWidth(), this.f42152g.getHeight(), this.f42152g.d()));
    }

    @Override // t.j2
    public boolean b() {
        return this.f42148c;
    }

    @Override // t.j2
    public boolean c() {
        return this.f42149d;
    }

    @Override // t.j2
    public void d(boolean z10) {
        this.f42149d = z10;
    }

    @Override // t.j2
    public void e(boolean z10) {
        this.f42148c = z10;
    }

    @Override // t.j2
    public androidx.camera.core.n f() {
        try {
            return (androidx.camera.core.n) this.f42147b.a();
        } catch (NoSuchElementException unused) {
            AbstractC0700h0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // t.j2
    public boolean g(androidx.camera.core.n nVar) {
        Image E12 = nVar.E1();
        ImageWriter imageWriter = this.f42155j;
        if (imageWriter != null && E12 != null) {
            try {
                I.a.d(imageWriter, E12);
                return true;
            } catch (IllegalStateException e10) {
                AbstractC0700h0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
            }
        }
        return false;
    }

    class a extends CameraCaptureSession.StateCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                n2.this.f42155j = I.a.c(inputSurface, 1);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }
    }
}
