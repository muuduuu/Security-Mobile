package Q1;

import O1.B;
import R1.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c2.C1720c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f8017a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f8018b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f8019c;

    /* renamed from: d, reason: collision with root package name */
    private final X1.b f8020d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8021e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8022f;

    /* renamed from: g, reason: collision with root package name */
    private final R1.a f8023g;

    /* renamed from: h, reason: collision with root package name */
    private final R1.a f8024h;

    /* renamed from: i, reason: collision with root package name */
    private final R1.p f8025i;

    /* renamed from: j, reason: collision with root package name */
    private d f8026j;

    public p(com.airbnb.lottie.o oVar, X1.b bVar, W1.m mVar) {
        this.f8019c = oVar;
        this.f8020d = bVar;
        this.f8021e = mVar.c();
        this.f8022f = mVar.f();
        R1.d p10 = mVar.b().p();
        this.f8023g = p10;
        bVar.i(p10);
        p10.a(this);
        R1.d p11 = mVar.d().p();
        this.f8024h = p11;
        bVar.i(p11);
        p11.a(this);
        R1.p b10 = mVar.e().b();
        this.f8025i = b10;
        b10.a(bVar);
        b10.b(this);
    }

    @Override // Q1.m
    public Path J() {
        Path J10 = this.f8026j.J();
        this.f8018b.reset();
        float floatValue = ((Float) this.f8023g.h()).floatValue();
        float floatValue2 = ((Float) this.f8024h.h()).floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f8017a.set(this.f8025i.g(i10 + floatValue2));
            this.f8018b.addPath(J10, this.f8017a);
        }
        return this.f8018b;
    }

    @Override // R1.a.b
    public void a() {
        this.f8019c.invalidateSelf();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        this.f8026j.b(list, list2);
    }

    @Override // Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f8026j.c(rectF, matrix, z10);
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b2.k.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f8026j.j().size(); i11++) {
            c cVar = (c) this.f8026j.j().get(i11);
            if (cVar instanceof k) {
                b2.k.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // Q1.j
    public void e(ListIterator listIterator) {
        if (this.f8026j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f8026j = new d(this.f8019c, this.f8020d, "Repeater", this.f8022f, arrayList, null);
    }

    @Override // Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f8023g.h()).floatValue();
        float floatValue2 = ((Float) this.f8024h.h()).floatValue();
        float floatValue3 = ((Float) this.f8025i.i().h()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f8025i.e().h()).floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f8017a.set(matrix);
            float f10 = i11;
            this.f8017a.preConcat(this.f8025i.g(f10 + floatValue2));
            this.f8026j.f(canvas, this.f8017a, (int) (i10 * b2.k.i(floatValue3, floatValue4, f10 / floatValue)));
        }
    }

    @Override // Q1.c
    public String getName() {
        return this.f8021e;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        if (this.f8025i.c(obj, c1720c)) {
            return;
        }
        if (obj == B.f6889u) {
            this.f8023g.o(c1720c);
        } else if (obj == B.f6890v) {
            this.f8024h.o(c1720c);
        }
    }
}
