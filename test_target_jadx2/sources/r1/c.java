package R1;

import R1.a;
import Z1.C1319j;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import c2.C1719b;
import c2.C1720c;

/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final X1.b f8386a;

    /* renamed from: b, reason: collision with root package name */
    private final a.b f8387b;

    /* renamed from: c, reason: collision with root package name */
    private final R1.a f8388c;

    /* renamed from: d, reason: collision with root package name */
    private final d f8389d;

    /* renamed from: e, reason: collision with root package name */
    private final d f8390e;

    /* renamed from: f, reason: collision with root package name */
    private final d f8391f;

    /* renamed from: g, reason: collision with root package name */
    private final d f8392g;

    /* renamed from: h, reason: collision with root package name */
    private float f8393h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    private float f8394i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    private float f8395j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    private int f8396k = 0;

    /* renamed from: l, reason: collision with root package name */
    private final float[] f8397l = new float[9];

    class a extends C1720c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1720c f8398d;

        a(C1720c c1720c) {
            this.f8398d = c1720c;
        }

        @Override // c2.C1720c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(C1719b c1719b) {
            Float f10 = (Float) this.f8398d.a(c1719b);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, X1.b bVar2, C1319j c1319j) {
        this.f8387b = bVar;
        this.f8386a = bVar2;
        R1.a p10 = c1319j.a().p();
        this.f8388c = p10;
        p10.a(this);
        bVar2.i(p10);
        d p11 = c1319j.d().p();
        this.f8389d = p11;
        p11.a(this);
        bVar2.i(p11);
        d p12 = c1319j.b().p();
        this.f8390e = p12;
        p12.a(this);
        bVar2.i(p12);
        d p13 = c1319j.c().p();
        this.f8391f = p13;
        p13.a(this);
        bVar2.i(p13);
        d p14 = c1319j.e().p();
        this.f8392g = p14;
        p14.a(this);
        bVar2.i(p14);
    }

    @Override // R1.a.b
    public void a() {
        this.f8387b.a();
    }

    public void b(Paint paint, Matrix matrix, int i10) {
        float q10 = this.f8390e.q() * 0.017453292f;
        float floatValue = ((Float) this.f8391f.h()).floatValue();
        double d10 = q10;
        float sin = ((float) Math.sin(d10)) * floatValue;
        float cos = ((float) Math.cos(d10 + 3.141592653589793d)) * floatValue;
        this.f8386a.f11652x.f().getValues(this.f8397l);
        float[] fArr = this.f8397l;
        float f10 = fArr[0];
        float f11 = fArr[4];
        matrix.getValues(fArr);
        float[] fArr2 = this.f8397l;
        float f12 = fArr2[0] / f10;
        float f13 = sin * f12;
        float f14 = cos * (fArr2[4] / f11);
        int intValue = ((Integer) this.f8388c.h()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f8389d.h()).floatValue() * i10) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        float max = Math.max(((Float) this.f8392g.h()).floatValue() * f12 * 0.33f, Float.MIN_VALUE);
        if (this.f8393h == max && this.f8394i == f13 && this.f8395j == f14 && this.f8396k == argb) {
            return;
        }
        this.f8393h = max;
        this.f8394i = f13;
        this.f8395j = f14;
        this.f8396k = argb;
        paint.setShadowLayer(max, f13, f14, argb);
    }

    public void c(C1720c c1720c) {
        this.f8388c.o(c1720c);
    }

    public void d(C1720c c1720c) {
        this.f8390e.o(c1720c);
    }

    public void e(C1720c c1720c) {
        this.f8391f.o(c1720c);
    }

    public void f(C1720c c1720c) {
        if (c1720c == null) {
            this.f8389d.o(null);
        } else {
            this.f8389d.o(new a(c1720c));
        }
    }

    public void g(C1720c c1720c) {
        this.f8392g.o(c1720c);
    }
}
