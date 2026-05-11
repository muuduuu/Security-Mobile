package Q1;

import O1.B;
import R1.a;
import W1.t;
import android.graphics.Path;
import c2.C1720c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f8032b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8033c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.o f8034d;

    /* renamed from: e, reason: collision with root package name */
    private final R1.m f8035e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8036f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f8031a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f8037g = new b();

    public r(com.airbnb.lottie.o oVar, X1.b bVar, W1.r rVar) {
        this.f8032b = rVar.b();
        this.f8033c = rVar.d();
        this.f8034d = oVar;
        R1.m p10 = rVar.c().p();
        this.f8035e = p10;
        bVar.i(p10);
        p10.a(this);
    }

    private void e() {
        this.f8036f = false;
        this.f8034d.invalidateSelf();
    }

    @Override // Q1.m
    public Path J() {
        if (this.f8036f && !this.f8035e.k()) {
            return this.f8031a;
        }
        this.f8031a.reset();
        if (this.f8033c) {
            this.f8036f = true;
            return this.f8031a;
        }
        Path path = (Path) this.f8035e.h();
        if (path == null) {
            return this.f8031a;
        }
        this.f8031a.set(path);
        this.f8031a.setFillType(Path.FillType.EVEN_ODD);
        this.f8037g.b(this.f8031a);
        this.f8036f = true;
        return this.f8031a;
    }

    @Override // R1.a.b
    public void a() {
        e();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f8037g.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
        }
        this.f8035e.r(arrayList);
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b2.k.k(eVar, i10, list, eVar2, this);
    }

    @Override // Q1.c
    public String getName() {
        return this.f8032b;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        if (obj == B.f6868P) {
            this.f8035e.o(c1720c);
        }
    }
}
