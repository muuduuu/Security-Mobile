package k2;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import w2.InterfaceC5032e;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Class f36067a;

    /* renamed from: b, reason: collision with root package name */
    private final List f36068b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5032e f36069c;

    /* renamed from: d, reason: collision with root package name */
    private final y0.d f36070d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36071e;

    interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, InterfaceC5032e interfaceC5032e, y0.d dVar) {
        this.f36067a = cls;
        this.f36068b = list;
        this.f36069c = interfaceC5032e;
        this.f36070d = dVar;
        this.f36071e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, i2.h hVar) {
        List list = (List) D2.k.d(this.f36070d.b());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f36070d.a(list);
        }
    }

    private v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, i2.h hVar, List list) {
        int size = this.f36068b.size();
        v vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            i2.j jVar = (i2.j) this.f36068b.get(i12);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    vVar = jVar.b(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f36071e, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, i2.h hVar, a aVar) {
        return this.f36069c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f36067a + ", decoders=" + this.f36068b + ", transcoder=" + this.f36069c + '}';
    }
}
