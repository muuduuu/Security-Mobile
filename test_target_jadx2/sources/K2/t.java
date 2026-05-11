package k2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.i;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final Class f36163a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.d f36164b;

    /* renamed from: c, reason: collision with root package name */
    private final List f36165c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36166d;

    public t(Class cls, Class cls2, Class cls3, List list, y0.d dVar) {
        this.f36163a = cls;
        this.f36164b = dVar;
        this.f36165c = (List) D2.k.c(list);
        this.f36166d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, i2.h hVar, int i10, int i11, i.a aVar, List list) {
        int size = this.f36165c.size();
        v vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVar = ((i) this.f36165c.get(i12)).a(eVar, i10, i11, hVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f36166d, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, i2.h hVar, int i10, int i11, i.a aVar) {
        List list = (List) D2.k.d(this.f36164b.b());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f36164b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f36165c.toArray()) + '}';
    }
}
