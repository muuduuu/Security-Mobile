package Y7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public float f12125a;

    /* renamed from: b, reason: collision with root package name */
    public float f12126b;

    /* renamed from: c, reason: collision with root package name */
    public float f12127c;

    /* renamed from: d, reason: collision with root package name */
    public float f12128d;

    /* renamed from: e, reason: collision with root package name */
    public float f12129e;

    /* renamed from: f, reason: collision with root package name */
    public float f12130f;

    /* renamed from: g, reason: collision with root package name */
    private final List f12131g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f12132h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f12133i;

    class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f12134b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f12135c;

        a(List list, Matrix matrix) {
            this.f12134b = list;
            this.f12135c = matrix;
        }

        @Override // Y7.m.g
        public void b(Matrix matrix, X7.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f12134b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f12135c, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final d f12137b;

        public b(d dVar) {
            this.f12137b = dVar;
        }

        @Override // Y7.m.g
        public void b(Matrix matrix, X7.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f12137b.k(), this.f12137b.o(), this.f12137b.l(), this.f12137b.j()), i10, this.f12137b.m(), this.f12137b.n());
        }
    }

    static class c extends g {

        /* renamed from: b, reason: collision with root package name */
        private final e f12138b;

        /* renamed from: c, reason: collision with root package name */
        private final float f12139c;

        /* renamed from: d, reason: collision with root package name */
        private final float f12140d;

        public c(e eVar, float f10, float f11) {
            this.f12138b = eVar;
            this.f12139c = f10;
            this.f12140d = f11;
        }

        @Override // Y7.m.g
        public void b(Matrix matrix, X7.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f12138b.f12149c - this.f12140d, this.f12138b.f12148b - this.f12139c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f12139c, this.f12140d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f12138b.f12149c - this.f12140d) / (this.f12138b.f12148b - this.f12139c)));
        }
    }

    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f12141h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f12142b;

        /* renamed from: c, reason: collision with root package name */
        public float f12143c;

        /* renamed from: d, reason: collision with root package name */
        public float f12144d;

        /* renamed from: e, reason: collision with root package name */
        public float f12145e;

        /* renamed from: f, reason: collision with root package name */
        public float f12146f;

        /* renamed from: g, reason: collision with root package name */
        public float f12147g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f12145e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f12142b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f12144d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f12146f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f12147g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f12143c;
        }

        private void p(float f10) {
            this.f12145e = f10;
        }

        private void q(float f10) {
            this.f12142b = f10;
        }

        private void r(float f10) {
            this.f12144d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f12146f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f12147g = f10;
        }

        private void u(float f10) {
            this.f12143c = f10;
        }

        @Override // Y7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f12150a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f12141h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f12148b;

        /* renamed from: c, reason: collision with root package name */
        private float f12149c;

        @Override // Y7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f12150a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f12148b, this.f12149c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f12150a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f12151a = new Matrix();

        g() {
        }

        public final void a(X7.a aVar, int i10, Canvas canvas) {
            b(f12151a, aVar, i10, canvas);
        }

        public abstract void b(Matrix matrix, X7.a aVar, int i10, Canvas canvas);
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float g10 = ((f10 - g()) + 360.0f) % 360.0f;
        if (g10 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g10);
        this.f12132h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f12132h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f12129e;
    }

    private float h() {
        return this.f12130f;
    }

    private void p(float f10) {
        this.f12129e = f10;
    }

    private void q(float f10) {
        this.f12130f = f10;
    }

    private void r(float f10) {
        this.f12127c = f10;
    }

    private void s(float f10) {
        this.f12128d = f10;
    }

    private void t(float f10) {
        this.f12125a = f10;
    }

    private void u(float f10) {
        this.f12126b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f12131g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f12131g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f12131g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f12133i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f12132h), new Matrix(matrix));
    }

    float i() {
        return this.f12127c;
    }

    float j() {
        return this.f12128d;
    }

    float k() {
        return this.f12125a;
    }

    float l() {
        return this.f12126b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f12148b = f10;
        eVar.f12149c = f11;
        this.f12131g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f12131g.clear();
        this.f12132h.clear();
        this.f12133i = false;
    }
}
