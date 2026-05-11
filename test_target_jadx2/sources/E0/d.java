package e0;

import V.AbstractC1258v;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d implements InterfaceC1439h0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Map f32123f;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1439h0 f32124c;

    /* renamed from: d, reason: collision with root package name */
    private final G f32125d;

    /* renamed from: e, reason: collision with root package name */
    private final P0 f32126e;

    static {
        HashMap hashMap = new HashMap();
        f32123f = hashMap;
        hashMap.put(1, AbstractC1258v.f10731f);
        hashMap.put(8, AbstractC1258v.f10729d);
        hashMap.put(6, AbstractC1258v.f10728c);
        hashMap.put(5, AbstractC1258v.f10727b);
        hashMap.put(4, AbstractC1258v.f10726a);
        hashMap.put(0, AbstractC1258v.f10730e);
    }

    public d(InterfaceC1439h0 interfaceC1439h0, G g10, P0 p02) {
        this.f32124c = interfaceC1439h0;
        this.f32125d = g10;
        this.f32126e = p02;
    }

    private boolean c(int i10) {
        AbstractC1258v abstractC1258v = (AbstractC1258v) f32123f.get(Integer.valueOf(i10));
        if (abstractC1258v == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f32126e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.e(this.f32125d, abstractC1258v) && !d(videoQualityQuirk)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(K0 k02) {
        return (k02 instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) k02).a();
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public boolean a(int i10) {
        return this.f32124c.a(i10) && c(i10);
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public InterfaceC1441i0 b(int i10) {
        if (a(i10)) {
            return this.f32124c.b(i10);
        }
        return null;
    }
}
