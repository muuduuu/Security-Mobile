package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import org.conscrypt.BuildConfig;

/* renamed from: Z1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1320k {

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC1346c.a f12315f = AbstractC1346c.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC1346c.a f12316g = AbstractC1346c.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    private V1.a f12317a;

    /* renamed from: b, reason: collision with root package name */
    private V1.b f12318b;

    /* renamed from: c, reason: collision with root package name */
    private V1.b f12319c;

    /* renamed from: d, reason: collision with root package name */
    private V1.b f12320d;

    /* renamed from: e, reason: collision with root package name */
    private V1.b f12321e;

    private void a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        abstractC1346c.c();
        String str = BuildConfig.FLAVOR;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12316g);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                str.hashCode();
                switch (str) {
                    case "Distance":
                        this.f12320d = AbstractC1313d.e(abstractC1346c, c1038i);
                        break;
                    case "Opacity":
                        this.f12318b = AbstractC1313d.f(abstractC1346c, c1038i, false);
                        break;
                    case "Direction":
                        this.f12319c = AbstractC1313d.f(abstractC1346c, c1038i, false);
                        break;
                    case "Shadow Color":
                        this.f12317a = AbstractC1313d.c(abstractC1346c, c1038i);
                        break;
                    case "Softness":
                        this.f12321e = AbstractC1313d.e(abstractC1346c, c1038i);
                        break;
                    default:
                        abstractC1346c.t();
                        break;
                }
            } else {
                abstractC1346c.s();
                abstractC1346c.t();
            }
        }
        abstractC1346c.e();
    }

    C1319j b(AbstractC1346c abstractC1346c, C1038i c1038i) {
        V1.b bVar;
        V1.b bVar2;
        V1.b bVar3;
        V1.b bVar4;
        while (abstractC1346c.f()) {
            if (abstractC1346c.r(f12315f) != 0) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                abstractC1346c.b();
                while (abstractC1346c.f()) {
                    a(abstractC1346c, c1038i);
                }
                abstractC1346c.d();
            }
        }
        V1.a aVar = this.f12317a;
        if (aVar == null || (bVar = this.f12318b) == null || (bVar2 = this.f12319c) == null || (bVar3 = this.f12320d) == null || (bVar4 = this.f12321e) == null) {
            return null;
        }
        return new C1319j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
