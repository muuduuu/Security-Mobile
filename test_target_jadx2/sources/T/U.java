package t;

import A.AbstractC0700h0;
import A.AbstractC0715s;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1605w;
import androidx.lifecycle.InterfaceC1608z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import t.U;
import u.C4832C;
import v.C4896g;
import x.AbstractC5092g;

/* loaded from: classes.dex */
public final class U implements androidx.camera.core.impl.G {

    /* renamed from: a, reason: collision with root package name */
    private final String f41909a;

    /* renamed from: b, reason: collision with root package name */
    private final C4832C f41910b;

    /* renamed from: c, reason: collision with root package name */
    private final z.h f41911c;

    /* renamed from: e, reason: collision with root package name */
    private C4584u f41913e;

    /* renamed from: h, reason: collision with root package name */
    private final a f41916h;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.camera.core.impl.P0 f41918j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1439h0 f41919k;

    /* renamed from: l, reason: collision with root package name */
    private final u.P f41920l;

    /* renamed from: d, reason: collision with root package name */
    private final Object f41912d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f41914f = null;

    /* renamed from: g, reason: collision with root package name */
    private a f41915g = null;

    /* renamed from: i, reason: collision with root package name */
    private List f41917i = null;

    static class a extends C1605w {

        /* renamed from: m, reason: collision with root package name */
        private AbstractC1604v f41921m;

        /* renamed from: n, reason: collision with root package name */
        private final Object f41922n;

        a(Object obj) {
            this.f41922n = obj;
        }

        @Override // androidx.lifecycle.AbstractC1604v
        public Object f() {
            AbstractC1604v abstractC1604v = this.f41921m;
            return abstractC1604v == null ? this.f41922n : abstractC1604v.f();
        }

        @Override // androidx.lifecycle.C1605w
        public void p(AbstractC1604v abstractC1604v, InterfaceC1608z interfaceC1608z) {
            throw new UnsupportedOperationException();
        }

        void r(AbstractC1604v abstractC1604v) {
            AbstractC1604v abstractC1604v2 = this.f41921m;
            if (abstractC1604v2 != null) {
                super.q(abstractC1604v2);
            }
            this.f41921m = abstractC1604v;
            super.p(abstractC1604v, new InterfaceC1608z() { // from class: t.T
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    U.a.this.o(obj);
                }
            });
        }
    }

    public U(String str, u.P p10) {
        String str2 = (String) y0.f.g(str);
        this.f41909a = str2;
        this.f41920l = p10;
        C4832C c10 = p10.c(str2);
        this.f41910b = c10;
        this.f41911c = new z.h(this);
        androidx.camera.core.impl.P0 a10 = androidx.camera.camera2.internal.compat.quirk.a.a(str, c10);
        this.f41918j = a10;
        this.f41919k = new G0(str, a10);
        this.f41916h = new a(AbstractC0715s.a(AbstractC0715s.b.CLOSED));
    }

    private void x() {
        y();
    }

    private void y() {
        String str;
        int v10 = v();
        if (v10 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (v10 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (v10 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (v10 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (v10 != 4) {
            str = "Unknown value: " + v10;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        AbstractC0700h0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public z.h a() {
        return this.f41911c;
    }

    @Override // A.InterfaceC0713p
    public AbstractC1604v b() {
        return this.f41916h;
    }

    @Override // androidx.camera.core.impl.G
    public Set c() {
        return C4896g.a(this.f41910b).c();
    }

    @Override // A.InterfaceC0713p
    public int d() {
        return m(0);
    }

    @Override // androidx.camera.core.impl.G
    public boolean e() {
        int[] iArr = (int[]) this.f41910b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.G
    public String f() {
        return this.f41909a;
    }

    @Override // androidx.camera.core.impl.G
    public void h(Executor executor, AbstractC1450n abstractC1450n) {
        synchronized (this.f41912d) {
            try {
                C4584u c4584u = this.f41913e;
                if (c4584u != null) {
                    c4584u.A(executor, abstractC1450n);
                    return;
                }
                if (this.f41917i == null) {
                    this.f41917i = new ArrayList();
                }
                this.f41917i.add(new Pair(abstractC1450n, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.InterfaceC0713p
    public int i() {
        Integer num = (Integer) this.f41910b.a(CameraCharacteristics.LENS_FACING);
        y0.f.b(num != null, "Unable to get the lens facing of the camera.");
        return C1.a(num.intValue());
    }

    @Override // androidx.camera.core.impl.G
    public androidx.camera.core.impl.e1 j() {
        Integer num = (Integer) this.f41910b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        y0.f.g(num);
        return num.intValue() != 1 ? androidx.camera.core.impl.e1.UPTIME : androidx.camera.core.impl.e1.REALTIME;
    }

    @Override // A.InterfaceC0713p
    public String k() {
        return v() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.impl.G
    public List l(int i10) {
        Size[] a10 = this.f41910b.b().a(i10);
        return a10 != null ? Arrays.asList(a10) : Collections.emptyList();
    }

    @Override // A.InterfaceC0713p
    public int m(int i10) {
        return E.c.a(E.c.b(i10), u(), 1 == i());
    }

    @Override // A.InterfaceC0713p
    public boolean n() {
        C4832C c4832c = this.f41910b;
        Objects.requireNonNull(c4832c);
        return AbstractC5092g.a(new S(c4832c));
    }

    @Override // androidx.camera.core.impl.G
    public InterfaceC1439h0 o() {
        return this.f41919k;
    }

    @Override // androidx.camera.core.impl.G
    public androidx.camera.core.impl.P0 p() {
        return this.f41918j;
    }

    @Override // androidx.camera.core.impl.G
    public List q(int i10) {
        Size[] c10 = this.f41910b.b().c(i10);
        return c10 != null ? Arrays.asList(c10) : Collections.emptyList();
    }

    @Override // A.InterfaceC0713p
    public AbstractC1604v r() {
        synchronized (this.f41912d) {
            try {
                C4584u c4584u = this.f41913e;
                if (c4584u == null) {
                    if (this.f41915g == null) {
                        this.f41915g = new a(h2.f(this.f41910b));
                    }
                    return this.f41915g;
                }
                a aVar = this.f41915g;
                if (aVar != null) {
                    return aVar;
                }
                return c4584u.S().h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.G
    public void s(AbstractC1450n abstractC1450n) {
        synchronized (this.f41912d) {
            try {
                C4584u c4584u = this.f41913e;
                if (c4584u != null) {
                    c4584u.l0(abstractC1450n);
                    return;
                }
                List list = this.f41917i;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC1450n) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C4832C t() {
        return this.f41910b;
    }

    int u() {
        Integer num = (Integer) this.f41910b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        y0.f.g(num);
        return num.intValue();
    }

    int v() {
        Integer num = (Integer) this.f41910b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        y0.f.g(num);
        return num.intValue();
    }

    void w(C4584u c4584u) {
        synchronized (this.f41912d) {
            try {
                this.f41913e = c4584u;
                a aVar = this.f41915g;
                if (aVar != null) {
                    aVar.r(c4584u.S().h());
                }
                a aVar2 = this.f41914f;
                if (aVar2 != null) {
                    aVar2.r(this.f41913e.Q().f());
                }
                List<Pair> list = this.f41917i;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f41913e.A((Executor) pair.second, (AbstractC1450n) pair.first);
                    }
                    this.f41917i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x();
    }

    void z(AbstractC1604v abstractC1604v) {
        this.f41916h.r(abstractC1604v);
    }
}
