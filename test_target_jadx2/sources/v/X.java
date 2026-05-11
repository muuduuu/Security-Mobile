package V;

import android.util.Size;
import androidx.camera.core.impl.C1437g0;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.P0;
import e0.C3067b;
import e0.C3068c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public final class X implements InterfaceC1239b0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1439h0 f10580b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10581c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10582d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f10583e = new HashMap();

    X(int i10, androidx.camera.core.impl.G g10, InterfaceC3735a interfaceC3735a) {
        y0.f.b(i10 == 0 || i10 == 1, "Not a supported video capabilities source: " + i10);
        InterfaceC1439h0 o10 = g10.o();
        P0 c10 = androidx.camera.video.internal.compat.quirk.a.c();
        InterfaceC1439h0 c3067b = new C3067b(o10, c10, g10, interfaceC3735a);
        InterfaceC1439h0 c3068c = new C3068c(i10 == 1 ? new X.f(c3067b, AbstractC1258v.b(), Collections.singleton(A.B.f7d), g10.q(34), interfaceC3735a) : c3067b, c10);
        this.f10580b = new e0.d(h(g10) ? new X.b(c3068c, interfaceC3735a) : c3068c, g10, c10);
        for (A.B b10 : g10.c()) {
            C1252o c1252o = new C1252o(new X.e(this.f10580b, b10));
            if (!c1252o.f().isEmpty()) {
                this.f10582d.put(b10, c1252o);
            }
        }
        this.f10581c = g10.e();
    }

    private C1252o e(A.B b10) {
        if (C1437g0.c(b10, g())) {
            return new C1252o(new X.e(this.f10580b, b10));
        }
        return null;
    }

    private C1252o f(A.B b10) {
        if (b10.e()) {
            return (C1252o) this.f10582d.get(b10);
        }
        if (this.f10583e.containsKey(b10)) {
            return (C1252o) this.f10583e.get(b10);
        }
        C1252o e10 = e(b10);
        this.f10583e.put(b10, e10);
        return e10;
    }

    private static boolean h(androidx.camera.core.impl.G g10) {
        for (A.B b10 : g10.c()) {
            Integer valueOf = Integer.valueOf(b10.b());
            int a10 = b10.a();
            if (valueOf.equals(3) && a10 == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // V.InterfaceC1239b0
    public AbstractC1258v a(Size size, A.B b10) {
        C1252o f10 = f(b10);
        return f10 == null ? AbstractC1258v.f10732g : f10.c(size);
    }

    @Override // V.InterfaceC1239b0
    public List b(A.B b10) {
        C1252o f10 = f(b10);
        return f10 == null ? new ArrayList() : f10.f();
    }

    @Override // V.InterfaceC1239b0
    public X.g c(AbstractC1258v abstractC1258v, A.B b10) {
        C1252o f10 = f(b10);
        if (f10 == null) {
            return null;
        }
        return f10.e(abstractC1258v);
    }

    @Override // V.InterfaceC1239b0
    public X.g d(Size size, A.B b10) {
        C1252o f10 = f(b10);
        if (f10 == null) {
            return null;
        }
        return f10.b(size);
    }

    public Set g() {
        return this.f10582d.keySet();
    }
}
