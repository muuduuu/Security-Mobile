package Q1;

import O1.B;
import R1.a;
import W1.k;
import W1.t;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: e, reason: collision with root package name */
    private final String f7991e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.o f7992f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f7993g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7994h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7995i;

    /* renamed from: j, reason: collision with root package name */
    private final R1.a f7996j;

    /* renamed from: k, reason: collision with root package name */
    private final R1.a f7997k;

    /* renamed from: l, reason: collision with root package name */
    private final R1.a f7998l;

    /* renamed from: m, reason: collision with root package name */
    private final R1.a f7999m;

    /* renamed from: n, reason: collision with root package name */
    private final R1.a f8000n;

    /* renamed from: o, reason: collision with root package name */
    private final R1.a f8001o;

    /* renamed from: p, reason: collision with root package name */
    private final R1.a f8002p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8004r;

    /* renamed from: a, reason: collision with root package name */
    private final Path f7987a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f7988b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final PathMeasure f7989c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    private final float[] f7990d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    private final b f8003q = new b();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8005a;

        static {
            int[] iArr = new int[k.a.values().length];
            f8005a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8005a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.o oVar, X1.b bVar, W1.k kVar) {
        this.f7992f = oVar;
        this.f7991e = kVar.d();
        k.a j10 = kVar.j();
        this.f7993g = j10;
        this.f7994h = kVar.k();
        this.f7995i = kVar.l();
        R1.d p10 = kVar.g().p();
        this.f7996j = p10;
        R1.a p11 = kVar.h().p();
        this.f7997k = p11;
        R1.d p12 = kVar.i().p();
        this.f7998l = p12;
        R1.d p13 = kVar.e().p();
        this.f8000n = p13;
        R1.d p14 = kVar.f().p();
        this.f8002p = p14;
        k.a aVar = k.a.STAR;
        if (j10 == aVar) {
            this.f7999m = kVar.b().p();
            this.f8001o = kVar.c().p();
        } else {
            this.f7999m = null;
            this.f8001o = null;
        }
        bVar.i(p10);
        bVar.i(p11);
        bVar.i(p12);
        bVar.i(p13);
        bVar.i(p14);
        if (j10 == aVar) {
            bVar.i(this.f7999m);
            bVar.i(this.f8001o);
        }
        p10.a(this);
        p11.a(this);
        p12.a(this);
        p13.a(this);
        p14.a(this);
        if (j10 == aVar) {
            this.f7999m.a(this);
            this.f8001o.a(this);
        }
    }

    private void e() {
        double d10;
        float f10;
        n nVar;
        n nVar2 = this;
        int floor = (int) Math.floor(((Float) nVar2.f7996j.h()).floatValue());
        double radians = Math.toRadians((nVar2.f7998l == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d11 = floor;
        float floatValue = ((Float) nVar2.f8002p.h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) nVar2.f8000n.h()).floatValue();
        double d12 = floatValue2;
        float cos = (float) (Math.cos(radians) * d12);
        float sin = (float) (Math.sin(radians) * d12);
        nVar2.f7987a.moveTo(cos, sin);
        double d13 = (float) (6.283185307179586d / d11);
        double ceil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= ceil) {
                n nVar3 = nVar2;
                PointF pointF = (PointF) nVar3.f7997k.h();
                nVar3.f7987a.offset(pointF.x, pointF.y);
                nVar3.f7987a.close();
                return;
            }
            int i11 = i10;
            float cos2 = (float) (d12 * Math.cos(d14));
            double d16 = d13;
            float sin2 = (float) (d12 * Math.sin(d14));
            if (floatValue != 0.0f) {
                d10 = d12;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f10 = sin2;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f11 = floatValue2 * floatValue * 0.25f;
                float f12 = cos3 * f11;
                float f13 = sin3 * f11;
                float cos4 = ((float) Math.cos(atan22)) * f11;
                float sin4 = f11 * ((float) Math.sin(atan22));
                if (d15 == ceil - 1.0d) {
                    nVar = this;
                    nVar.f7988b.reset();
                    nVar.f7988b.moveTo(cos, sin);
                    float f14 = cos - f12;
                    float f15 = sin - f13;
                    float f16 = cos2 + cos4;
                    float f17 = sin4 + f10;
                    nVar.f7988b.cubicTo(f14, f15, f16, f17, cos2, f10);
                    nVar.f7989c.setPath(nVar.f7988b, false);
                    PathMeasure pathMeasure = nVar.f7989c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, nVar.f7990d, null);
                    Path path = nVar.f7987a;
                    float[] fArr = nVar.f7990d;
                    path.cubicTo(f14, f15, f16, f17, fArr[0], fArr[1]);
                } else {
                    nVar = this;
                    nVar.f7987a.cubicTo(cos - f12, sin - f13, cos2 + cos4, f10 + sin4, cos2, f10);
                }
            } else {
                d10 = d12;
                f10 = sin2;
                nVar = nVar2;
                if (d15 == ceil - 1.0d) {
                    sin = f10;
                    cos = cos2;
                    d13 = d16;
                    i10 = i11 + 1;
                    nVar2 = nVar;
                    d12 = d10;
                } else {
                    nVar.f7987a.lineTo(cos2, f10);
                }
            }
            d14 += d16;
            sin = f10;
            cos = cos2;
            d13 = d16;
            i10 = i11 + 1;
            nVar2 = nVar;
            d12 = d10;
        }
    }

    private void i() {
        int i10;
        float f10;
        float f11;
        double d10;
        float f12;
        float f13;
        float f14;
        float f15;
        double d11;
        float f16;
        float f17;
        float f18;
        double d12;
        float floatValue = ((Float) this.f7996j.h()).floatValue();
        double radians = Math.toRadians((this.f7998l == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d13 = floatValue;
        float f19 = (float) (6.283185307179586d / d13);
        if (this.f7995i) {
            f19 *= -1.0f;
        }
        float f20 = f19 / 2.0f;
        float f21 = floatValue - ((int) floatValue);
        int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f21) * f20;
        }
        float floatValue2 = ((Float) this.f8000n.h()).floatValue();
        float floatValue3 = ((Float) this.f7999m.h()).floatValue();
        R1.a aVar = this.f8001o;
        float floatValue4 = aVar != null ? ((Float) aVar.h()).floatValue() / 100.0f : 0.0f;
        R1.a aVar2 = this.f8002p;
        float floatValue5 = aVar2 != null ? ((Float) aVar2.h()).floatValue() / 100.0f : 0.0f;
        if (i11 != 0) {
            f13 = ((floatValue2 - floatValue3) * f21) + floatValue3;
            i10 = i11;
            double d14 = f13;
            float cos = (float) (d14 * Math.cos(radians));
            f12 = (float) (d14 * Math.sin(radians));
            this.f7987a.moveTo(cos, f12);
            d10 = radians + ((f19 * f21) / 2.0f);
            f10 = cos;
            f11 = f20;
        } else {
            i10 = i11;
            double d15 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d15);
            float sin = (float) (d15 * Math.sin(radians));
            this.f7987a.moveTo(cos2, sin);
            f10 = cos2;
            f11 = f20;
            d10 = radians + f11;
            f12 = sin;
            f13 = 0.0f;
        }
        double ceil = Math.ceil(d13) * 2.0d;
        int i12 = 0;
        float f22 = f11;
        float f23 = f10;
        boolean z10 = false;
        while (true) {
            double d16 = i12;
            if (d16 >= ceil) {
                PointF pointF = (PointF) this.f7997k.h();
                this.f7987a.offset(pointF.x, pointF.y);
                this.f7987a.close();
                return;
            }
            float f24 = z10 ? floatValue2 : floatValue3;
            if (f13 == 0.0f || d16 != ceil - 2.0d) {
                f14 = f19;
                f15 = f22;
            } else {
                f14 = f19;
                f15 = (f19 * f21) / 2.0f;
            }
            if (f13 == 0.0f || d16 != ceil - 1.0d) {
                d11 = d16;
                f16 = f13;
                f13 = f24;
            } else {
                d11 = d16;
                f16 = f13;
            }
            double d17 = f13;
            double d18 = ceil;
            float cos3 = (float) (d17 * Math.cos(d10));
            float sin2 = (float) (d17 * Math.sin(d10));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.f7987a.lineTo(cos3, sin2);
                d12 = d10;
                f17 = floatValue4;
                f18 = floatValue5;
            } else {
                f17 = floatValue4;
                double atan2 = (float) (Math.atan2(f12, f23) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f18 = floatValue5;
                d12 = d10;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f25 = z10 ? f17 : f18;
                float f26 = z10 ? f18 : f17;
                float f27 = (z10 ? floatValue3 : floatValue2) * f25 * 0.47829f;
                float f28 = cos4 * f27;
                float f29 = f27 * sin3;
                float f30 = (z10 ? floatValue2 : floatValue3) * f26 * 0.47829f;
                float f31 = cos5 * f30;
                float f32 = f30 * sin4;
                if (i10 != 0) {
                    if (i12 == 0) {
                        f28 *= f21;
                        f29 *= f21;
                    } else if (d11 == d18 - 1.0d) {
                        f31 *= f21;
                        f32 *= f21;
                    }
                }
                this.f7987a.cubicTo(f23 - f28, f12 - f29, cos3 + f31, sin2 + f32, cos3, sin2);
            }
            d10 = d12 + f15;
            z10 = !z10;
            i12++;
            f23 = cos3;
            f12 = sin2;
            floatValue5 = f18;
            floatValue4 = f17;
            f13 = f16;
            f19 = f14;
            ceil = d18;
        }
    }

    private void j() {
        this.f8004r = false;
        this.f7992f.invalidateSelf();
    }

    @Override // Q1.m
    public Path J() {
        if (this.f8004r) {
            return this.f7987a;
        }
        this.f7987a.reset();
        if (this.f7994h) {
            this.f8004r = true;
            return this.f7987a;
        }
        int i10 = a.f8005a[this.f7993g.ordinal()];
        if (i10 == 1) {
            i();
        } else if (i10 == 2) {
            e();
        }
        this.f7987a.close();
        this.f8003q.b(this.f7987a);
        this.f8004r = true;
        return this.f7987a;
    }

    @Override // R1.a.b
    public void a() {
        j();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f8003q.a(uVar);
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
        return this.f7991e;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        R1.a aVar;
        R1.a aVar2;
        if (obj == B.f6891w) {
            this.f7996j.o(c1720c);
            return;
        }
        if (obj == B.f6892x) {
            this.f7998l.o(c1720c);
            return;
        }
        if (obj == B.f6882n) {
            this.f7997k.o(c1720c);
            return;
        }
        if (obj == B.f6893y && (aVar2 = this.f7999m) != null) {
            aVar2.o(c1720c);
            return;
        }
        if (obj == B.f6894z) {
            this.f8000n.o(c1720c);
            return;
        }
        if (obj == B.f6853A && (aVar = this.f8001o) != null) {
            aVar.o(c1720c);
        } else if (obj == B.f6854B) {
            this.f8002p.o(c1720c);
        }
    }
}
