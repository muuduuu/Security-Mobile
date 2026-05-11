package Z1;

import O1.C1038i;
import X1.e;
import a2.AbstractC1346c;
import android.graphics.Rect;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12344a = AbstractC1346c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    static AbstractC1346c.a f12345b = AbstractC1346c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1346c.a f12346c = AbstractC1346c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC1346c.a f12347d = AbstractC1346c.a.a("cm", "tm", "dr");

    public static C1038i a(AbstractC1346c abstractC1346c) {
        HashMap hashMap;
        ArrayList arrayList;
        AbstractC1346c abstractC1346c2 = abstractC1346c;
        float e10 = b2.l.e();
        j0.f fVar = new j0.f();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        j0.j jVar = new j0.j();
        C1038i c1038i = new C1038i();
        abstractC1346c.c();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (abstractC1346c.f()) {
            switch (abstractC1346c2.r(f12344a)) {
                case 0:
                    i11 = abstractC1346c.j();
                    continue;
                case 1:
                    i10 = abstractC1346c.j();
                    continue;
                case 2:
                    f10 = (float) abstractC1346c.i();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f11 = ((float) abstractC1346c.i()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f12 = (float) abstractC1346c.i();
                    break;
                case 5:
                    String[] split = abstractC1346c.n().split("\\.");
                    if (b2.l.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        c1038i.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                case 6:
                    e(abstractC1346c2, c1038i, arrayList2, fVar);
                    continue;
                case 7:
                    b(abstractC1346c2, c1038i, hashMap2, hashMap3);
                    continue;
                case 8:
                    d(abstractC1346c2, hashMap4);
                    continue;
                case 9:
                    c(abstractC1346c2, c1038i, jVar);
                    continue;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    f(abstractC1346c2, arrayList3);
                    continue;
                default:
                    abstractC1346c.s();
                    abstractC1346c.t();
                    continue;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            abstractC1346c2 = abstractC1346c;
        }
        c1038i.s(new Rect(0, 0, (int) (i11 * e10), (int) (i10 * e10)), f10, f11, f12, arrayList2, fVar, hashMap2, hashMap3, b2.l.e(), jVar, hashMap4, arrayList3, i11, i10);
        return c1038i;
    }

    private static void b(AbstractC1346c abstractC1346c, C1038i c1038i, Map map, Map map2) {
        abstractC1346c.b();
        while (abstractC1346c.f()) {
            ArrayList arrayList = new ArrayList();
            j0.f fVar = new j0.f();
            abstractC1346c.c();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (abstractC1346c.f()) {
                int r10 = abstractC1346c.r(f12345b);
                if (r10 == 0) {
                    str = abstractC1346c.n();
                } else if (r10 == 1) {
                    abstractC1346c.b();
                    while (abstractC1346c.f()) {
                        X1.e b10 = v.b(abstractC1346c, c1038i);
                        fVar.l(b10.e(), b10);
                        arrayList.add(b10);
                    }
                    abstractC1346c.d();
                } else if (r10 == 2) {
                    i10 = abstractC1346c.j();
                } else if (r10 == 3) {
                    i11 = abstractC1346c.j();
                } else if (r10 == 4) {
                    str2 = abstractC1346c.n();
                } else if (r10 != 5) {
                    abstractC1346c.s();
                    abstractC1346c.t();
                } else {
                    str3 = abstractC1346c.n();
                }
            }
            abstractC1346c.e();
            if (str2 != null) {
                O1.x xVar = new O1.x(i10, i11, str, str2, str3);
                map2.put(xVar.e(), xVar);
            } else {
                map.put(str, arrayList);
            }
        }
        abstractC1346c.d();
    }

    private static void c(AbstractC1346c abstractC1346c, C1038i c1038i, j0.j jVar) {
        abstractC1346c.b();
        while (abstractC1346c.f()) {
            U1.d a10 = AbstractC1322m.a(abstractC1346c, c1038i);
            jVar.n(a10.hashCode(), a10);
        }
        abstractC1346c.d();
    }

    private static void d(AbstractC1346c abstractC1346c, Map map) {
        abstractC1346c.c();
        while (abstractC1346c.f()) {
            if (abstractC1346c.r(f12346c) != 0) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                abstractC1346c.b();
                while (abstractC1346c.f()) {
                    U1.c a10 = AbstractC1323n.a(abstractC1346c);
                    map.put(a10.b(), a10);
                }
                abstractC1346c.d();
            }
        }
        abstractC1346c.e();
    }

    private static void e(AbstractC1346c abstractC1346c, C1038i c1038i, List list, j0.f fVar) {
        abstractC1346c.b();
        int i10 = 0;
        while (abstractC1346c.f()) {
            X1.e b10 = v.b(abstractC1346c, c1038i);
            if (b10.g() == e.a.IMAGE) {
                i10++;
            }
            list.add(b10);
            fVar.l(b10.e(), b10);
            if (i10 > 4) {
                b2.f.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC1346c.d();
    }

    private static void f(AbstractC1346c abstractC1346c, List list) {
        abstractC1346c.b();
        while (abstractC1346c.f()) {
            abstractC1346c.c();
            float f10 = 0.0f;
            String str = null;
            float f11 = 0.0f;
            while (abstractC1346c.f()) {
                int r10 = abstractC1346c.r(f12347d);
                if (r10 == 0) {
                    str = abstractC1346c.n();
                } else if (r10 == 1) {
                    f10 = (float) abstractC1346c.i();
                } else if (r10 != 2) {
                    abstractC1346c.s();
                    abstractC1346c.t();
                } else {
                    f11 = (float) abstractC1346c.i();
                }
            }
            abstractC1346c.e();
            list.add(new U1.h(str, f10, f11));
        }
        abstractC1346c.d();
    }
}
