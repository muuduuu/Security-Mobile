package u;

import A.AbstractC0700h0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private final a f43416a;

    /* renamed from: b, reason: collision with root package name */
    private final x.n f43417b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f43418c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f43419d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f43420e = new HashMap();

    interface a {
        StreamConfigurationMap a();

        Size[] b(int i10);

        Size[] c(int i10);

        int[] d();
    }

    private V(StreamConfigurationMap streamConfigurationMap, x.n nVar) {
        this.f43416a = new W(streamConfigurationMap);
        this.f43417b = nVar;
    }

    static V e(StreamConfigurationMap streamConfigurationMap, x.n nVar) {
        return new V(streamConfigurationMap, nVar);
    }

    public Size[] a(int i10) {
        if (this.f43419d.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) this.f43419d.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f43419d.get(Integer.valueOf(i10))).clone();
        }
        Size[] b10 = this.f43416a.b(i10);
        if (b10 != null && b10.length > 0) {
            b10 = this.f43417b.b(b10, i10);
        }
        this.f43419d.put(Integer.valueOf(i10), b10);
        if (b10 != null) {
            return (Size[]) b10.clone();
        }
        return null;
    }

    public int[] b() {
        int[] d10 = this.f43416a.d();
        if (d10 == null) {
            return null;
        }
        return (int[]) d10.clone();
    }

    public Size[] c(int i10) {
        if (this.f43418c.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) this.f43418c.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f43418c.get(Integer.valueOf(i10))).clone();
        }
        Size[] c10 = this.f43416a.c(i10);
        if (c10 != null && c10.length != 0) {
            Size[] b10 = this.f43417b.b(c10, i10);
            this.f43418c.put(Integer.valueOf(i10), b10);
            return (Size[]) b10.clone();
        }
        AbstractC0700h0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return c10;
    }

    public StreamConfigurationMap d() {
        return this.f43416a.a();
    }
}
