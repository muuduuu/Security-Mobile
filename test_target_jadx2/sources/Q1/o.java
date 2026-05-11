package Q1;

import O1.B;
import R1.a;
import W1.t;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    private final String f8008c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8009d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f8010e;

    /* renamed from: f, reason: collision with root package name */
    private final R1.a f8011f;

    /* renamed from: g, reason: collision with root package name */
    private final R1.a f8012g;

    /* renamed from: h, reason: collision with root package name */
    private final R1.a f8013h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8016k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f8006a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f8007b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final b f8014i = new b();

    /* renamed from: j, reason: collision with root package name */
    private R1.a f8015j = null;

    public o(com.airbnb.lottie.o oVar, X1.b bVar, W1.l lVar) {
        this.f8008c = lVar.c();
        this.f8009d = lVar.f();
        this.f8010e = oVar;
        R1.a p10 = lVar.d().p();
        this.f8011f = p10;
        R1.a p11 = lVar.e().p();
        this.f8012g = p11;
        R1.d p12 = lVar.b().p();
        this.f8013h = p12;
        bVar.i(p10);
        bVar.i(p11);
        bVar.i(p12);
        p10.a(this);
        p11.a(this);
        p12.a(this);
    }

    private void e() {
        this.f8016k = false;
        this.f8010e.invalidateSelf();
    }

    @Override // Q1.m
    public Path J() {
        R1.a aVar;
        if (this.f8016k) {
            return this.f8006a;
        }
        this.f8006a.reset();
        if (this.f8009d) {
            this.f8016k = true;
            return this.f8006a;
        }
        PointF pointF = (PointF) this.f8012g.h();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        R1.a aVar2 = this.f8013h;
        float q10 = aVar2 == null ? 0.0f : ((R1.d) aVar2).q();
        if (q10 == 0.0f && (aVar = this.f8015j) != null) {
            q10 = Math.min(((Float) aVar.h()).floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (q10 > min) {
            q10 = min;
        }
        PointF pointF2 = (PointF) this.f8011f.h();
        this.f8006a.moveTo(pointF2.x + f10, (pointF2.y - f11) + q10);
        this.f8006a.lineTo(pointF2.x + f10, (pointF2.y + f11) - q10);
        if (q10 > 0.0f) {
            RectF rectF = this.f8007b;
            float f12 = pointF2.x;
            float f13 = q10 * 2.0f;
            float f14 = pointF2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f8006a.arcTo(this.f8007b, 0.0f, 90.0f, false);
        }
        this.f8006a.lineTo((pointF2.x - f10) + q10, pointF2.y + f11);
        if (q10 > 0.0f) {
            RectF rectF2 = this.f8007b;
            float f15 = pointF2.x;
            float f16 = pointF2.y;
            float f17 = q10 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f8006a.arcTo(this.f8007b, 90.0f, 90.0f, false);
        }
        this.f8006a.lineTo(pointF2.x - f10, (pointF2.y - f11) + q10);
        if (q10 > 0.0f) {
            RectF rectF3 = this.f8007b;
            float f18 = pointF2.x;
            float f19 = pointF2.y;
            float f20 = q10 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f8006a.arcTo(this.f8007b, 180.0f, 90.0f, false);
        }
        this.f8006a.lineTo((pointF2.x + f10) - q10, pointF2.y - f11);
        if (q10 > 0.0f) {
            RectF rectF4 = this.f8007b;
            float f21 = pointF2.x;
            float f22 = q10 * 2.0f;
            float f23 = pointF2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f8006a.arcTo(this.f8007b, 270.0f, 90.0f, false);
        }
        this.f8006a.close();
        this.f8014i.b(this.f8006a);
        this.f8016k = true;
        return this.f8006a;
    }

    @Override // R1.a.b
    public void a() {
        e();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f8014i.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof q) {
                this.f8015j = ((q) cVar).h();
            }
        }
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b2.k.k(eVar, i10, list, eVar2, this);
    }

    @Override // Q1.c
    public String getName() {
        return this.f8008c;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        if (obj == B.f6880l) {
            this.f8012g.o(c1720c);
        } else if (obj == B.f6882n) {
            this.f8011f.o(c1720c);
        } else if (obj == B.f6881m) {
            this.f8013h.o(c1720c);
        }
    }
}
