package R1;

import c2.C1718a;
import c2.C1719b;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class o extends g {

    class a extends C1720c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1719b f8424d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1720c f8425e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U1.b f8426f;

        a(C1719b c1719b, C1720c c1720c, U1.b bVar) {
            this.f8424d = c1719b;
            this.f8425e = c1720c;
            this.f8426f = bVar;
        }

        @Override // c2.C1720c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public U1.b a(C1719b c1719b) {
            this.f8424d.h(c1719b.f(), c1719b.a(), ((U1.b) c1719b.g()).f10297a, ((U1.b) c1719b.b()).f10297a, c1719b.d(), c1719b.c(), c1719b.e());
            String str = (String) this.f8425e.a(this.f8424d);
            U1.b bVar = (U1.b) (c1719b.c() == 1.0f ? c1719b.b() : c1719b.g());
            this.f8426f.a(str, bVar.f10298b, bVar.f10299c, bVar.f10300d, bVar.f10301e, bVar.f10302f, bVar.f10303g, bVar.f10304h, bVar.f10305i, bVar.f10306j, bVar.f10307k, bVar.f10308l, bVar.f10309m);
            return this.f8426f;
        }
    }

    public o(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R1.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public U1.b i(C1718a c1718a, float f10) {
        Object obj;
        C1720c c1720c = this.f8376e;
        if (c1720c == null) {
            return (f10 != 1.0f || (obj = c1718a.f19337c) == null) ? (U1.b) c1718a.f19336b : (U1.b) obj;
        }
        float f11 = c1718a.f19341g;
        Float f12 = c1718a.f19342h;
        float floatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        Object obj2 = c1718a.f19336b;
        U1.b bVar = (U1.b) obj2;
        Object obj3 = c1718a.f19337c;
        return (U1.b) c1720c.b(f11, floatValue, bVar, obj3 == null ? (U1.b) obj2 : (U1.b) obj3, f10, d(), f());
    }

    public void r(C1720c c1720c) {
        super.o(new a(new C1719b(), c1720c, new U1.b()));
    }
}
