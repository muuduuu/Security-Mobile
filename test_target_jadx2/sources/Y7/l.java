package Y7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f12107a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f12108b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f12109c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f12110d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f12111e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f12112f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f12113g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f12114h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f12115i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f12116j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f12117k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f12118l = true;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final l f12119a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final k f12120a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f12121b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f12122c;

        /* renamed from: d, reason: collision with root package name */
        public final b f12123d;

        /* renamed from: e, reason: collision with root package name */
        public final float f12124e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f12123d = bVar;
            this.f12120a = kVar;
            this.f12124e = f10;
            this.f12122c = rectF;
            this.f12121b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f12107a[i10] = new m();
            this.f12108b[i10] = new Matrix();
            this.f12109c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (i10 + 1) * 90;
    }

    private void b(c cVar, int i10) {
        this.f12114h[0] = this.f12107a[i10].k();
        this.f12114h[1] = this.f12107a[i10].l();
        this.f12108b[i10].mapPoints(this.f12114h);
        if (i10 == 0) {
            Path path = cVar.f12121b;
            float[] fArr = this.f12114h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f12121b;
            float[] fArr2 = this.f12114h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f12107a[i10].d(this.f12108b[i10], cVar.f12121b);
        b bVar = cVar.f12123d;
        if (bVar != null) {
            bVar.b(this.f12107a[i10], this.f12108b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f12114h[0] = this.f12107a[i10].i();
        this.f12114h[1] = this.f12107a[i10].j();
        this.f12108b[i10].mapPoints(this.f12114h);
        this.f12115i[0] = this.f12107a[i11].k();
        this.f12115i[1] = this.f12107a[i11].l();
        this.f12108b[i11].mapPoints(this.f12115i);
        float f10 = this.f12114h[0];
        float[] fArr = this.f12115i;
        float max = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i12 = i(cVar.f12122c, i10);
        this.f12113g.n(0.0f, 0.0f);
        f j10 = j(i10, cVar.f12120a);
        j10.b(max, i12, cVar.f12124e, this.f12113g);
        this.f12116j.reset();
        this.f12113g.d(this.f12109c[i10], this.f12116j);
        if (this.f12118l && (j10.a() || l(this.f12116j, i10) || l(this.f12116j, i11))) {
            Path path = this.f12116j;
            path.op(path, this.f12112f, Path.Op.DIFFERENCE);
            this.f12114h[0] = this.f12113g.k();
            this.f12114h[1] = this.f12113g.l();
            this.f12109c[i10].mapPoints(this.f12114h);
            Path path2 = this.f12111e;
            float[] fArr2 = this.f12114h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f12113g.d(this.f12109c[i10], this.f12111e);
        } else {
            this.f12113g.d(this.f12109c[i10], cVar.f12121b);
        }
        b bVar = cVar.f12123d;
        if (bVar != null) {
            bVar.a(this.f12113g, this.f12109c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private Y7.c g(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f12114h;
        m mVar = this.f12107a[i10];
        fArr[0] = mVar.f12127c;
        fArr[1] = mVar.f12128d;
        this.f12108b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f12114h[0]) : Math.abs(rectF.centerY() - this.f12114h[1]);
    }

    private f j(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f12119a;
    }

    private boolean l(Path path, int i10) {
        this.f12117k.reset();
        this.f12107a[i10].d(this.f12108b[i10], this.f12117k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f12117k.computeBounds(rectF, true);
        path.op(this.f12117k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f12120a).b(this.f12107a[i10], 90.0f, cVar.f12124e, cVar.f12122c, g(i10, cVar.f12120a));
        float a10 = a(i10);
        this.f12108b[i10].reset();
        f(i10, cVar.f12122c, this.f12110d);
        Matrix matrix = this.f12108b[i10];
        PointF pointF = this.f12110d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f12108b[i10].preRotate(a10);
    }

    private void n(int i10) {
        this.f12114h[0] = this.f12107a[i10].i();
        this.f12114h[1] = this.f12107a[i10].j();
        this.f12108b[i10].mapPoints(this.f12114h);
        float a10 = a(i10);
        this.f12109c[i10].reset();
        Matrix matrix = this.f12109c[i10];
        float[] fArr = this.f12114h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f12109c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f12111e.rewind();
        this.f12112f.rewind();
        this.f12112f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f12111e.close();
        if (this.f12111e.isEmpty()) {
            return;
        }
        path.op(this.f12111e, Path.Op.UNION);
    }

    public void e(k kVar, float f10, RectF rectF, Path path) {
        d(kVar, f10, rectF, null, path);
    }
}
