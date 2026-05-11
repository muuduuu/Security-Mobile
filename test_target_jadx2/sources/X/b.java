package X;

import A.AbstractC0700h0;
import android.util.Rational;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import b0.k;
import c0.p0;
import c0.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public class b implements InterfaceC1439h0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1439h0 f11609c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3735a f11610d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f11611e = new HashMap();

    public b(InterfaceC1439h0 interfaceC1439h0, InterfaceC3735a interfaceC3735a) {
        this.f11609c = interfaceC1439h0;
        this.f11610d = interfaceC3735a;
    }

    private InterfaceC1441i0 c(InterfaceC1441i0 interfaceC1441i0, int i10, int i11) {
        InterfaceC1441i0.c cVar;
        if (interfaceC1441i0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(interfaceC1441i0.d());
        Iterator it = interfaceC1441i0.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = (InterfaceC1441i0.c) it.next();
            if (cVar.g() == 0) {
                break;
            }
        }
        InterfaceC1441i0.c k10 = k(g(cVar, i10, i11), this.f11610d);
        if (k10 != null) {
            arrayList.add(k10);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC1441i0.b.h(interfaceC1441i0.a(), interfaceC1441i0.b(), interfaceC1441i0.c(), arrayList);
    }

    private static int d(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    private static String e(int i10) {
        return InterfaceC1441i0.g(i10);
    }

    private static int f(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4096;
        }
        if (i10 == 3) {
            return 8192;
        }
        if (i10 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    private static InterfaceC1441i0.c g(InterfaceC1441i0.c cVar, int i10, int i11) {
        if (cVar == null) {
            return null;
        }
        int e10 = cVar.e();
        String i12 = cVar.i();
        int j10 = cVar.j();
        if (i10 != cVar.g()) {
            e10 = d(i10);
            i12 = e(e10);
            j10 = f(i10);
        }
        return InterfaceC1441i0.c.a(e10, i12, j(cVar.c(), i11, cVar.b()), cVar.f(), cVar.k(), cVar.h(), j10, i11, cVar.d(), i10);
    }

    private InterfaceC1441i0 h(int i10) {
        if (this.f11611e.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC1441i0) this.f11611e.get(Integer.valueOf(i10));
        }
        if (!this.f11609c.a(i10)) {
            return null;
        }
        InterfaceC1441i0 c10 = c(this.f11609c.b(i10), 1, 10);
        this.f11611e.put(Integer.valueOf(i10), c10);
        return c10;
    }

    private static InterfaceC1441i0.c i(InterfaceC1441i0.c cVar, int i10) {
        return InterfaceC1441i0.c.a(cVar.e(), cVar.i(), i10, cVar.f(), cVar.k(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private static int j(int i10, int i11, int i12) {
        if (i11 == i12) {
            return i10;
        }
        int doubleValue = (int) (i10 * new Rational(i11, i12).doubleValue());
        if (AbstractC0700h0.f("BackupHdrProfileEncoderProfilesProvider")) {
            AbstractC0700h0.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(doubleValue)));
        }
        return doubleValue;
    }

    static InterfaceC1441i0.c k(InterfaceC1441i0.c cVar, InterfaceC3735a interfaceC3735a) {
        if (cVar == null) {
            return null;
        }
        p0 f10 = k.f(cVar);
        r0 r0Var = (r0) interfaceC3735a.apply(f10);
        if (r0Var == null || !r0Var.a(cVar.k(), cVar.h())) {
            return null;
        }
        int e10 = f10.e();
        int intValue = ((Integer) r0Var.c().clamp(Integer.valueOf(e10))).intValue();
        return intValue == e10 ? cVar : i(cVar, intValue);
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public boolean a(int i10) {
        return this.f11609c.a(i10) && h(i10) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public InterfaceC1441i0 b(int i10) {
        return h(i10);
    }
}
