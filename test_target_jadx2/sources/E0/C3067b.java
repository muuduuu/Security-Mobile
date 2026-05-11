package e0;

import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.P0;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC3735a;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3067b implements InterfaceC1439h0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1439h0 f32118c;

    /* renamed from: d, reason: collision with root package name */
    private Map f32119d;

    public C3067b(InterfaceC1439h0 interfaceC1439h0, P0 p02, G g10, InterfaceC3735a interfaceC3735a) {
        this.f32118c = interfaceC1439h0;
        List c10 = p02.c(ExtraSupportedQualityQuirk.class);
        if (c10.isEmpty()) {
            return;
        }
        y0.f.i(c10.size() == 1);
        Map f10 = ((ExtraSupportedQualityQuirk) c10.get(0)).f(g10, interfaceC1439h0, interfaceC3735a);
        if (f10 != null) {
            this.f32119d = new HashMap(f10);
        }
    }

    private InterfaceC1441i0 c(int i10) {
        Map map = this.f32119d;
        return (map == null || !map.containsKey(Integer.valueOf(i10))) ? this.f32118c.b(i10) : (InterfaceC1441i0) this.f32119d.get(Integer.valueOf(i10));
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public boolean a(int i10) {
        return c(i10) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public InterfaceC1441i0 b(int i10) {
        return c(i10);
    }
}
