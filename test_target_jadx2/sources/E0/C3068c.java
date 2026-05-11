package e0;

import android.util.Size;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.P0;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3068c implements InterfaceC1439h0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1439h0 f32120c;

    /* renamed from: d, reason: collision with root package name */
    private final P0 f32121d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f32122e = new HashMap();

    public C3068c(InterfaceC1439h0 interfaceC1439h0, P0 p02) {
        this.f32120c = interfaceC1439h0;
        this.f32121d = p02;
    }

    private InterfaceC1441i0 c(InterfaceC1441i0 interfaceC1441i0, Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC1441i0.d().iterator();
        while (it.hasNext()) {
            arrayList.add(d((InterfaceC1441i0.c) it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC1441i0.b.h(interfaceC1441i0.a(), interfaceC1441i0.b(), interfaceC1441i0.c(), arrayList);
    }

    private static InterfaceC1441i0.c d(InterfaceC1441i0.c cVar, Size size) {
        return InterfaceC1441i0.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private Size e(int i10) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.f32121d.c(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.f(i10);
            }
        }
        return null;
    }

    private InterfaceC1441i0 f(int i10) {
        InterfaceC1441i0 interfaceC1441i0;
        if (this.f32122e.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC1441i0) this.f32122e.get(Integer.valueOf(i10));
        }
        if (this.f32120c.a(i10)) {
            InterfaceC1441i0 b10 = this.f32120c.b(i10);
            Objects.requireNonNull(b10);
            interfaceC1441i0 = b10;
            Size e10 = e(i10);
            if (e10 != null) {
                interfaceC1441i0 = c(interfaceC1441i0, e10);
            }
        } else {
            interfaceC1441i0 = null;
        }
        this.f32122e.put(Integer.valueOf(i10), interfaceC1441i0);
        return interfaceC1441i0;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public boolean a(int i10) {
        return this.f32120c.a(i10) && f(i10) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public InterfaceC1441i0 b(int i10) {
        return f(i10);
    }
}
