package V;

import A.AbstractC0700h0;
import V.AbstractC1258v;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: V.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1252o {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10668a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final TreeMap f10669b = new TreeMap(new E.e());

    /* renamed from: c, reason: collision with root package name */
    private final X.g f10670c;

    /* renamed from: d, reason: collision with root package name */
    private final X.g f10671d;

    public C1252o(InterfaceC1439h0 interfaceC1439h0) {
        for (AbstractC1258v abstractC1258v : AbstractC1258v.b()) {
            InterfaceC1441i0 d10 = d(abstractC1258v, interfaceC1439h0);
            if (d10 != null) {
                AbstractC0700h0.a("CapabilitiesByQuality", "profiles = " + d10);
                X.g g10 = g(d10);
                if (g10 == null) {
                    AbstractC0700h0.l("CapabilitiesByQuality", "EncoderProfiles of quality " + abstractC1258v + " has no video validated profiles.");
                } else {
                    InterfaceC1441i0.c k10 = g10.k();
                    this.f10669b.put(new Size(k10.k(), k10.h()), abstractC1258v);
                    this.f10668a.put(abstractC1258v, g10);
                }
            }
        }
        if (this.f10668a.isEmpty()) {
            AbstractC0700h0.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f10671d = null;
            this.f10670c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f10668a.values());
            this.f10670c = (X.g) arrayDeque.peekFirst();
            this.f10671d = (X.g) arrayDeque.peekLast();
        }
    }

    private static void a(AbstractC1258v abstractC1258v) {
        y0.f.b(AbstractC1258v.a(abstractC1258v), "Unknown quality: " + abstractC1258v);
    }

    private InterfaceC1441i0 d(AbstractC1258v abstractC1258v, InterfaceC1439h0 interfaceC1439h0) {
        y0.f.j(abstractC1258v instanceof AbstractC1258v.b, "Currently only support ConstantQuality");
        return interfaceC1439h0.b(((AbstractC1258v.b) abstractC1258v).e());
    }

    private X.g g(InterfaceC1441i0 interfaceC1441i0) {
        if (interfaceC1441i0.d().isEmpty()) {
            return null;
        }
        return X.g.i(interfaceC1441i0);
    }

    public X.g b(Size size) {
        AbstractC1258v c10 = c(size);
        AbstractC0700h0.a("CapabilitiesByQuality", "Using supported quality of " + c10 + " for size " + size);
        if (c10 == AbstractC1258v.f10732g) {
            return null;
        }
        X.g e10 = e(c10);
        if (e10 != null) {
            return e10;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public AbstractC1258v c(Size size) {
        AbstractC1258v abstractC1258v = (AbstractC1258v) L.d.a(size, this.f10669b);
        return abstractC1258v != null ? abstractC1258v : AbstractC1258v.f10732g;
    }

    public X.g e(AbstractC1258v abstractC1258v) {
        a(abstractC1258v);
        return abstractC1258v == AbstractC1258v.f10731f ? this.f10670c : abstractC1258v == AbstractC1258v.f10730e ? this.f10671d : (X.g) this.f10668a.get(abstractC1258v);
    }

    public List f() {
        return new ArrayList(this.f10668a.keySet());
    }
}
