package t;

import A.AbstractC0700h0;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.C1460s0;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.m1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import u.C4832C;

/* loaded from: classes.dex */
class F1 {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC1429c0 f41723a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.camera.core.impl.V0 f41724b;

    /* renamed from: d, reason: collision with root package name */
    private final Size f41726d;

    /* renamed from: f, reason: collision with root package name */
    private final c f41728f;

    /* renamed from: e, reason: collision with root package name */
    private final x.x f41727e = new x.x();

    /* renamed from: g, reason: collision with root package name */
    private V0.c f41729g = null;

    /* renamed from: c, reason: collision with root package name */
    private final b f41725c = new b();

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f41730a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f41731b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f41730a = surface;
            this.f41731b = surfaceTexture;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f41730a.release();
            this.f41731b.release();
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    private static class b implements androidx.camera.core.impl.l1 {

        /* renamed from: I, reason: collision with root package name */
        private final androidx.camera.core.impl.V f41733I;

        b() {
            androidx.camera.core.impl.B0 d02 = androidx.camera.core.impl.B0.d0();
            d02.x(androidx.camera.core.impl.l1.f14641z, new H0());
            d02.x(InterfaceC1455p0.f14673l, 34);
            Z(d02);
            this.f41733I = d02;
        }

        private void Z(androidx.camera.core.impl.B0 b02) {
            b02.x(H.m.f3079c, F1.class);
            b02.x(H.m.f3078b, F1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.l1
        public m1.b F() {
            return m1.b.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.Q0
        public androidx.camera.core.impl.V n() {
            return this.f41733I;
        }
    }

    interface c {
        void a();
    }

    F1(C4832C c4832c, C4545g1 c4545g1, c cVar) {
        this.f41728f = cVar;
        Size g10 = g(c4832c, c4545g1);
        this.f41726d = g10;
        AbstractC0700h0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + g10);
        this.f41724b = d();
    }

    private Size g(C4832C c4832c, C4545g1 c4545g1) {
        Size[] c10 = c4832c.b().c(34);
        if (c10 == null) {
            AbstractC0700h0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] a10 = this.f41727e.a(c10);
        List asList = Arrays.asList(a10);
        Collections.sort(asList, new Comparator() { // from class: t.E1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int k10;
                k10 = F1.k((Size) obj, (Size) obj2);
                return k10;
            }
        });
        Size f10 = c4545g1.f();
        long min = Math.min(f10.getWidth() * f10.getHeight(), 307200L);
        int length = a10.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = a10[i10];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(androidx.camera.core.impl.V0 v02, V0.g gVar) {
        this.f41724b = d();
        c cVar = this.f41728f;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int k(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    void c() {
        AbstractC0700h0.a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC1429c0 abstractC1429c0 = this.f41723a;
        if (abstractC1429c0 != null) {
            abstractC1429c0.d();
        }
        this.f41723a = null;
    }

    androidx.camera.core.impl.V0 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f41726d.getWidth(), this.f41726d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        V0.b q10 = V0.b.q(this.f41725c, this.f41726d);
        q10.z(1);
        C1460s0 c1460s0 = new C1460s0(surface);
        this.f41723a = c1460s0;
        G.n.j(c1460s0.k(), new a(surface, surfaceTexture), F.c.b());
        q10.l(this.f41723a);
        V0.c cVar = this.f41729g;
        if (cVar != null) {
            cVar.b();
        }
        V0.c cVar2 = new V0.c(new V0.d() { // from class: t.D1
            @Override // androidx.camera.core.impl.V0.d
            public final void a(androidx.camera.core.impl.V0 v02, V0.g gVar) {
                F1.this.j(v02, gVar);
            }
        });
        this.f41729g = cVar2;
        q10.t(cVar2);
        return q10.o();
    }

    Size e() {
        return this.f41726d;
    }

    String f() {
        return "MeteringRepeating";
    }

    androidx.camera.core.impl.V0 h() {
        return this.f41724b;
    }

    androidx.camera.core.impl.l1 i() {
        return this.f41725c;
    }
}
