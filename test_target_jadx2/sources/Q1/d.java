package Q1;

import O1.C1038i;
import R1.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c2.C1720c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements e, m, a.b, U1.f {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f7916a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f7917b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f7918c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f7919d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f7920e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7921f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7922g;

    /* renamed from: h, reason: collision with root package name */
    private final List f7923h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.o f7924i;

    /* renamed from: j, reason: collision with root package name */
    private List f7925j;

    /* renamed from: k, reason: collision with root package name */
    private R1.p f7926k;

    public d(com.airbnb.lottie.o oVar, X1.b bVar, W1.q qVar, C1038i c1038i) {
        this(oVar, bVar, qVar.c(), qVar.d(), e(oVar, c1038i, bVar, qVar.b()), i(qVar.b()));
    }

    private static List e(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c a10 = ((W1.c) list.get(i10)).a(oVar, c1038i, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    static V1.n i(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            W1.c cVar = (W1.c) list.get(i10);
            if (cVar instanceof V1.n) {
                return (V1.n) cVar;
            }
        }
        return null;
    }

    private boolean m() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7923h.size(); i11++) {
            if ((this.f7923h.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // Q1.m
    public Path J() {
        this.f7918c.reset();
        R1.p pVar = this.f7926k;
        if (pVar != null) {
            this.f7918c.set(pVar.f());
        }
        this.f7919d.reset();
        if (this.f7922g) {
            return this.f7919d;
        }
        for (int size = this.f7923h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f7923h.get(size);
            if (cVar instanceof m) {
                this.f7919d.addPath(((m) cVar).J(), this.f7918c);
            }
        }
        return this.f7919d;
    }

    @Override // R1.a.b
    public void a() {
        this.f7924i.invalidateSelf();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f7923h.size());
        arrayList.addAll(list);
        for (int size = this.f7923h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f7923h.get(size);
            cVar.b(arrayList, this.f7923h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f7918c.set(matrix);
        R1.p pVar = this.f7926k;
        if (pVar != null) {
            this.f7918c.preConcat(pVar.f());
        }
        this.f7920e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f7923h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f7923h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(this.f7920e, this.f7918c, z10);
                rectF.union(this.f7920e);
            }
        }
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int e10 = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f7923h.size(); i11++) {
                    c cVar = (c) this.f7923h.get(i11);
                    if (cVar instanceof U1.f) {
                        ((U1.f) cVar).d(eVar, e10, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f7922g) {
            return;
        }
        this.f7918c.set(matrix);
        R1.p pVar = this.f7926k;
        if (pVar != null) {
            this.f7918c.preConcat(pVar.f());
            i10 = (int) (((((this.f7926k.h() == null ? 100 : ((Integer) this.f7926k.h().h()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f7924i.g0() && m() && i10 != 255;
        if (z10) {
            this.f7917b.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(this.f7917b, this.f7918c, true);
            this.f7916a.setAlpha(i10);
            b2.l.n(canvas, this.f7917b, this.f7916a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f7923h.size() - 1; size >= 0; size--) {
            Object obj = this.f7923h.get(size);
            if (obj instanceof e) {
                ((e) obj).f(canvas, this.f7918c, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // Q1.c
    public String getName() {
        return this.f7921f;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        R1.p pVar = this.f7926k;
        if (pVar != null) {
            pVar.c(obj, c1720c);
        }
    }

    public List j() {
        return this.f7923h;
    }

    List k() {
        if (this.f7925j == null) {
            this.f7925j = new ArrayList();
            for (int i10 = 0; i10 < this.f7923h.size(); i10++) {
                c cVar = (c) this.f7923h.get(i10);
                if (cVar instanceof m) {
                    this.f7925j.add((m) cVar);
                }
            }
        }
        return this.f7925j;
    }

    Matrix l() {
        R1.p pVar = this.f7926k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f7918c.reset();
        return this.f7918c;
    }

    d(com.airbnb.lottie.o oVar, X1.b bVar, String str, boolean z10, List list, V1.n nVar) {
        this.f7916a = new P1.a();
        this.f7917b = new RectF();
        this.f7918c = new Matrix();
        this.f7919d = new Path();
        this.f7920e = new RectF();
        this.f7921f = str;
        this.f7924i = oVar;
        this.f7922g = z10;
        this.f7923h = list;
        if (nVar != null) {
            R1.p b10 = nVar.b();
            this.f7926k = b10;
            b10.a(bVar);
            this.f7926k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }
}
