package Q1;

import O1.B;
import R1.a;
import W1.t;
import android.graphics.Path;
import android.graphics.PointF;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f7928b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f7929c;

    /* renamed from: d, reason: collision with root package name */
    private final R1.a f7930d;

    /* renamed from: e, reason: collision with root package name */
    private final R1.a f7931e;

    /* renamed from: f, reason: collision with root package name */
    private final W1.b f7932f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7934h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f7927a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f7933g = new b();

    public f(com.airbnb.lottie.o oVar, X1.b bVar, W1.b bVar2) {
        this.f7928b = bVar2.b();
        this.f7929c = oVar;
        R1.a p10 = bVar2.d().p();
        this.f7930d = p10;
        R1.a p11 = bVar2.c().p();
        this.f7931e = p11;
        this.f7932f = bVar2;
        bVar.i(p10);
        bVar.i(p11);
        p10.a(this);
        p11.a(this);
    }

    private void e() {
        this.f7934h = false;
        this.f7929c.invalidateSelf();
    }

    @Override // Q1.m
    public Path J() {
        if (this.f7934h) {
            return this.f7927a;
        }
        this.f7927a.reset();
        if (this.f7932f.e()) {
            this.f7934h = true;
            return this.f7927a;
        }
        PointF pointF = (PointF) this.f7930d.h();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f7927a.reset();
        if (this.f7932f.f()) {
            float f14 = -f11;
            this.f7927a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f7927a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f7927a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f7927a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f7927a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f7927a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f7927a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f7927a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f7927a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f7927a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f7931e.h();
        this.f7927a.offset(pointF2.x, pointF2.y);
        this.f7927a.close();
        this.f7933g.b(this.f7927a);
        this.f7934h = true;
        return this.f7927a;
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
                    this.f7933g.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b2.k.k(eVar, i10, list, eVar2, this);
    }

    @Override // Q1.c
    public String getName() {
        return this.f7928b;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        if (obj == B.f6879k) {
            this.f7930d.o(c1720c);
        } else if (obj == B.f6882n) {
            this.f7931e.o(c1720c);
        }
    }
}
