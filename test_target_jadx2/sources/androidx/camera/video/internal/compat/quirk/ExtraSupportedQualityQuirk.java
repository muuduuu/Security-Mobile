package androidx.camera.video.internal.compat.quirk;

import L.d;
import V.B0;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.K0;
import b0.k;
import c0.r0;
import d0.AbstractC2972c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements K0 {
    private Map g(G g10, InterfaceC1439h0 interfaceC1439h0, InterfaceC3735a interfaceC3735a) {
        InterfaceC1441i0 b10;
        InterfaceC1441i0.c b11;
        if (!"1".equals(g10.f()) || interfaceC1439h0.a(4) || (b11 = AbstractC2972c.b((b10 = interfaceC1439h0.b(1)))) == null) {
            return null;
        }
        Range h10 = h(b11, interfaceC3735a);
        Size size = d.f5620d;
        InterfaceC1441i0.b h11 = InterfaceC1441i0.b.h(b10.a(), b10.b(), b10.c(), Collections.singletonList(AbstractC2972c.a(b11, size, h10)));
        HashMap hashMap = new HashMap();
        hashMap.put(4, h11);
        if (d.c(size) > d.c(new Size(b11.k(), b11.h()))) {
            hashMap.put(1, h11);
        }
        return hashMap;
    }

    private static Range h(InterfaceC1441i0.c cVar, InterfaceC3735a interfaceC3735a) {
        r0 r0Var = (r0) interfaceC3735a.apply(k.f(cVar));
        return r0Var != null ? r0Var.c() : B0.f10438b;
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return i();
    }

    public Map f(G g10, InterfaceC1439h0 interfaceC1439h0, InterfaceC3735a interfaceC3735a) {
        return i() ? g(g10, interfaceC1439h0, interfaceC3735a) : Collections.emptyMap();
    }
}
