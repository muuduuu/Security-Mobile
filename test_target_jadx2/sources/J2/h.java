package J2;

import J2.b;
import J2.e;
import J2.g;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class h {

    /* renamed from: i, reason: collision with root package name */
    private static HashSet f4665i;

    /* renamed from: a, reason: collision with root package name */
    private Canvas f4666a;

    /* renamed from: b, reason: collision with root package name */
    private float f4667b;

    /* renamed from: c, reason: collision with root package name */
    private J2.g f4668c;

    /* renamed from: d, reason: collision with root package name */
    private C0094h f4669d;

    /* renamed from: e, reason: collision with root package name */
    private Stack f4670e;

    /* renamed from: f, reason: collision with root package name */
    private Stack f4671f;

    /* renamed from: g, reason: collision with root package name */
    private Stack f4672g;

    /* renamed from: h, reason: collision with root package name */
    private b.q f4673h = null;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4674a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4675b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f4676c;

        static {
            int[] iArr = new int[g.E.d.values().length];
            f4676c = iArr;
            try {
                iArr[g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4676c[g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4676c[g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[g.E.c.values().length];
            f4675b = iArr2;
            try {
                iArr2[g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4675b[g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4675b[g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[e.a.values().length];
            f4674a = iArr3;
            try {
                iArr3[e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4674a[e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4674a[e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4674a[e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4674a[e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4674a[e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4674a[e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4674a[e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class b implements g.InterfaceC0868x {

        /* renamed from: b, reason: collision with root package name */
        private float f4678b;

        /* renamed from: c, reason: collision with root package name */
        private float f4679c;

        /* renamed from: h, reason: collision with root package name */
        private boolean f4684h;

        /* renamed from: a, reason: collision with root package name */
        private List f4677a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private c f4680d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4681e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4682f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f4683g = -1;

        b(g.C0867w c0867w) {
            if (c0867w == null) {
                return;
            }
            c0867w.h(this);
            if (this.f4684h) {
                this.f4680d.b((c) this.f4677a.get(this.f4683g));
                this.f4677a.set(this.f4683g, this.f4680d);
                this.f4684h = false;
            }
            c cVar = this.f4680d;
            if (cVar != null) {
                this.f4677a.add(cVar);
            }
        }

        @Override // J2.g.InterfaceC0868x
        public void a(float f10, float f11, float f12, float f13) {
            this.f4680d.a(f10, f11);
            this.f4677a.add(this.f4680d);
            this.f4680d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f4684h = false;
        }

        @Override // J2.g.InterfaceC0868x
        public void b(float f10, float f11) {
            if (this.f4684h) {
                this.f4680d.b((c) this.f4677a.get(this.f4683g));
                this.f4677a.set(this.f4683g, this.f4680d);
                this.f4684h = false;
            }
            c cVar = this.f4680d;
            if (cVar != null) {
                this.f4677a.add(cVar);
            }
            this.f4678b = f10;
            this.f4679c = f11;
            this.f4680d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f4683g = this.f4677a.size();
        }

        @Override // J2.g.InterfaceC0868x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f4682f || this.f4681e) {
                this.f4680d.a(f10, f11);
                this.f4677a.add(this.f4680d);
                this.f4681e = false;
            }
            this.f4680d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f4684h = false;
        }

        @Override // J2.g.InterfaceC0868x
        public void close() {
            this.f4677a.add(this.f4680d);
            e(this.f4678b, this.f4679c);
            this.f4684h = true;
        }

        @Override // J2.g.InterfaceC0868x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f4681e = true;
            this.f4682f = false;
            c cVar = this.f4680d;
            h.h(cVar.f4686a, cVar.f4687b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f4682f = true;
            this.f4684h = false;
        }

        @Override // J2.g.InterfaceC0868x
        public void e(float f10, float f11) {
            this.f4680d.a(f10, f11);
            this.f4677a.add(this.f4680d);
            h hVar = h.this;
            c cVar = this.f4680d;
            this.f4680d = hVar.new c(f10, f11, f10 - cVar.f4686a, f11 - cVar.f4687b);
            this.f4684h = false;
        }

        List f() {
            return this.f4677a;
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        float f4686a;

        /* renamed from: b, reason: collision with root package name */
        float f4687b;

        /* renamed from: c, reason: collision with root package name */
        float f4688c;

        /* renamed from: d, reason: collision with root package name */
        float f4689d;

        /* renamed from: e, reason: collision with root package name */
        boolean f4690e = false;

        c(float f10, float f11, float f12, float f13) {
            this.f4688c = 0.0f;
            this.f4689d = 0.0f;
            this.f4686a = f10;
            this.f4687b = f11;
            double sqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (sqrt != 0.0d) {
                this.f4688c = (float) (f12 / sqrt);
                this.f4689d = (float) (f13 / sqrt);
            }
        }

        void a(float f10, float f11) {
            float f12 = f10 - this.f4686a;
            float f13 = f11 - this.f4687b;
            double sqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (sqrt != 0.0d) {
                f12 = (float) (f12 / sqrt);
                f13 = (float) (f13 / sqrt);
            }
            float f14 = this.f4688c;
            if (f12 != (-f14) || f13 != (-this.f4689d)) {
                this.f4688c = f14 + f12;
                this.f4689d += f13;
            } else {
                this.f4690e = true;
                this.f4688c = -f13;
                this.f4689d = f12;
            }
        }

        void b(c cVar) {
            float f10 = cVar.f4688c;
            float f11 = this.f4688c;
            if (f10 == (-f11)) {
                float f12 = cVar.f4689d;
                if (f12 == (-this.f4689d)) {
                    this.f4690e = true;
                    this.f4688c = -f12;
                    this.f4689d = cVar.f4688c;
                    return;
                }
            }
            this.f4688c = f11 + f10;
            this.f4689d += cVar.f4689d;
        }

        public String toString() {
            return "(" + this.f4686a + "," + this.f4687b + " " + this.f4688c + "," + this.f4689d + ")";
        }
    }

    private class d implements g.InterfaceC0868x {

        /* renamed from: a, reason: collision with root package name */
        Path f4692a = new Path();

        /* renamed from: b, reason: collision with root package name */
        float f4693b;

        /* renamed from: c, reason: collision with root package name */
        float f4694c;

        d(g.C0867w c0867w) {
            if (c0867w == null) {
                return;
            }
            c0867w.h(this);
        }

        @Override // J2.g.InterfaceC0868x
        public void a(float f10, float f11, float f12, float f13) {
            this.f4692a.quadTo(f10, f11, f12, f13);
            this.f4693b = f12;
            this.f4694c = f13;
        }

        @Override // J2.g.InterfaceC0868x
        public void b(float f10, float f11) {
            this.f4692a.moveTo(f10, f11);
            this.f4693b = f10;
            this.f4694c = f11;
        }

        @Override // J2.g.InterfaceC0868x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f4692a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f4693b = f14;
            this.f4694c = f15;
        }

        @Override // J2.g.InterfaceC0868x
        public void close() {
            this.f4692a.close();
        }

        @Override // J2.g.InterfaceC0868x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.f4693b, this.f4694c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f4693b = f13;
            this.f4694c = f14;
        }

        @Override // J2.g.InterfaceC0868x
        public void e(float f10, float f11) {
            this.f4692a.lineTo(f10, f11);
            this.f4693b = f10;
            this.f4694c = f11;
        }

        Path f() {
            return this.f4692a;
        }
    }

    private class e extends f {

        /* renamed from: e, reason: collision with root package name */
        private Path f4696e;

        e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f4696e = path;
        }

        @Override // J2.h.f, J2.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                if (h.this.f4669d.f4706b) {
                    h.this.f4666a.drawTextOnPath(str, this.f4696e, this.f4698b, this.f4699c, h.this.f4669d.f4708d);
                }
                if (h.this.f4669d.f4707c) {
                    h.this.f4666a.drawTextOnPath(str, this.f4696e, this.f4698b, this.f4699c, h.this.f4669d.f4709e);
                }
            }
            this.f4698b += h.this.f4669d.f4708d.measureText(str);
        }
    }

    private class f extends j {

        /* renamed from: b, reason: collision with root package name */
        float f4698b;

        /* renamed from: c, reason: collision with root package name */
        float f4699c;

        f(float f10, float f11) {
            super(h.this, null);
            this.f4698b = f10;
            this.f4699c = f11;
        }

        @Override // J2.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f4669d.f4706b) {
                    h.this.f4666a.drawText(str, this.f4698b, this.f4699c, h.this.f4669d.f4708d);
                }
                if (h.this.f4669d.f4707c) {
                    h.this.f4666a.drawText(str, this.f4698b, this.f4699c, h.this.f4669d.f4709e);
                }
            }
            this.f4698b += h.this.f4669d.f4708d.measureText(str);
        }
    }

    private class g extends j {

        /* renamed from: b, reason: collision with root package name */
        float f4701b;

        /* renamed from: c, reason: collision with root package name */
        float f4702c;

        /* renamed from: d, reason: collision with root package name */
        Path f4703d;

        g(float f10, float f11, Path path) {
            super(h.this, null);
            this.f4701b = f10;
            this.f4702c = f11;
            this.f4703d = path;
        }

        @Override // J2.h.j
        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // J2.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Path path = new Path();
                h.this.f4669d.f4708d.getTextPath(str, 0, str.length(), this.f4701b, this.f4702c, path);
                this.f4703d.addPath(path);
            }
            this.f4701b += h.this.f4669d.f4708d.measureText(str);
        }
    }

    private class i extends j {

        /* renamed from: b, reason: collision with root package name */
        float f4714b;

        /* renamed from: c, reason: collision with root package name */
        float f4715c;

        /* renamed from: d, reason: collision with root package name */
        RectF f4716d;

        i(float f10, float f11) {
            super(h.this, null);
            this.f4716d = new RectF();
            this.f4714b = f10;
            this.f4715c = f11;
        }

        @Override // J2.h.j
        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            g.Z z10 = (g.Z) y10;
            g.N r10 = y10.f4568a.r(z10.f4581o);
            if (r10 == null) {
                h.F("TextPath path reference '%s' not found", z10.f4581o);
                return false;
            }
            g.C0866v c0866v = (g.C0866v) r10;
            Path f10 = h.this.new d(c0866v.f4650o).f();
            Matrix matrix = c0866v.f4622n;
            if (matrix != null) {
                f10.transform(matrix);
            }
            RectF rectF = new RectF();
            f10.computeBounds(rectF, true);
            this.f4716d.union(rectF);
            return false;
        }

        @Override // J2.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f4669d.f4708d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f4714b, this.f4715c);
                this.f4716d.union(rectF);
            }
            this.f4714b += h.this.f4669d.f4708d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        public boolean a(g.Y y10) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f10) {
        this.f4666a = canvas;
        this.f4667b = f10;
    }

    private boolean A() {
        Boolean bool = this.f4669d.f4705a.f4503A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(g.N n10) {
        if (n10 instanceof g.InterfaceC0864t) {
            return;
        }
        S0();
        u(n10);
        if (n10 instanceof g.F) {
            x0((g.F) n10);
        } else if (n10 instanceof g.e0) {
            E0((g.e0) n10);
        } else if (n10 instanceof g.S) {
            B0((g.S) n10);
        } else if (n10 instanceof g.C0857m) {
            q0((g.C0857m) n10);
        } else if (n10 instanceof g.C0859o) {
            r0((g.C0859o) n10);
        } else if (n10 instanceof g.C0866v) {
            t0((g.C0866v) n10);
        } else if (n10 instanceof g.B) {
            w0((g.B) n10);
        } else if (n10 instanceof g.C0849d) {
            o0((g.C0849d) n10);
        } else if (n10 instanceof g.C0853i) {
            p0((g.C0853i) n10);
        } else if (n10 instanceof g.C0861q) {
            s0((g.C0861q) n10);
        } else if (n10 instanceof g.A) {
            v0((g.A) n10);
        } else if (n10 instanceof g.C0870z) {
            u0((g.C0870z) n10);
        } else if (n10 instanceof g.W) {
            D0((g.W) n10);
        }
        R0();
    }

    private void B(g.K k10, Path path) {
        g.O o10 = this.f4669d.f4705a.f4517b;
        if (o10 instanceof g.C0865u) {
            g.N r10 = this.f4668c.r(((g.C0865u) o10).f4648a);
            if (r10 instanceof g.C0869y) {
                L(k10, path, (g.C0869y) r10);
                return;
            }
        }
        this.f4666a.drawPath(path, this.f4669d.f4708d);
    }

    private void B0(g.S s10) {
        y("Switch render", new Object[0]);
        W0(this.f4669d, s10);
        if (A()) {
            Matrix matrix = s10.f4623o;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            p(s10);
            boolean m02 = m0();
            K0(s10);
            if (m02) {
                j0(s10);
            }
            U0(s10);
        }
    }

    private void C(Path path) {
        C0094h c0094h = this.f4669d;
        if (c0094h.f4705a.f4514X != g.E.i.NonScalingStroke) {
            this.f4666a.drawPath(path, c0094h.f4709e);
            return;
        }
        Matrix matrix = this.f4666a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f4666a.setMatrix(new Matrix());
        Shader shader = this.f4669d.f4709e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f4666a.drawPath(path2, this.f4669d.f4709e);
        this.f4666a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(g.T t10, g.C0847b c0847b) {
        y("Symbol render", new Object[0]);
        if (c0847b.f4591c == 0.0f || c0847b.f4592d == 0.0f) {
            return;
        }
        J2.e eVar = t10.f4570o;
        if (eVar == null) {
            eVar = J2.e.f4474e;
        }
        W0(this.f4669d, t10);
        C0094h c0094h = this.f4669d;
        c0094h.f4710f = c0847b;
        if (!c0094h.f4705a.f4537v.booleanValue()) {
            g.C0847b c0847b2 = this.f4669d.f4710f;
            O0(c0847b2.f4589a, c0847b2.f4590b, c0847b2.f4591c, c0847b2.f4592d);
        }
        g.C0847b c0847b3 = t10.f4576p;
        if (c0847b3 != null) {
            this.f4666a.concat(o(this.f4669d.f4710f, c0847b3, eVar));
            this.f4669d.f4711g = t10.f4576p;
        } else {
            Canvas canvas = this.f4666a;
            g.C0847b c0847b4 = this.f4669d.f4710f;
            canvas.translate(c0847b4.f4589a, c0847b4.f4590b);
        }
        boolean m02 = m0();
        F0(t10, true);
        if (m02) {
            j0(t10);
        }
        U0(t10);
    }

    private float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void D0(g.W w10) {
        y("Text render", new Object[0]);
        W0(this.f4669d, w10);
        if (A()) {
            Matrix matrix = w10.f4580s;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            List list = w10.f4585o;
            float f10 = 0.0f;
            float i10 = (list == null || list.size() == 0) ? 0.0f : ((g.C0860p) w10.f4585o.get(0)).i(this);
            List list2 = w10.f4586p;
            float k10 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.C0860p) w10.f4586p.get(0)).k(this);
            List list3 = w10.f4587q;
            float i11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C0860p) w10.f4587q.get(0)).i(this);
            List list4 = w10.f4588r;
            if (list4 != null && list4.size() != 0) {
                f10 = ((g.C0860p) w10.f4588r.get(0)).k(this);
            }
            g.E.f O10 = O();
            if (O10 != g.E.f.Start) {
                float n10 = n(w10);
                if (O10 == g.E.f.Middle) {
                    n10 /= 2.0f;
                }
                i10 -= n10;
            }
            if (w10.f4558h == null) {
                i iVar = new i(i10, k10);
                E(w10, iVar);
                RectF rectF = iVar.f4716d;
                w10.f4558h = new g.C0847b(rectF.left, rectF.top, rectF.width(), iVar.f4716d.height());
            }
            U0(w10);
            r(w10);
            p(w10);
            boolean m02 = m0();
            E(w10, new f(i10 + i11, k10 + f10));
            if (m02) {
                j0(w10);
            }
        }
    }

    private void E(g.Y y10, j jVar) {
        if (A()) {
            Iterator it = y10.f4547i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                g.N n10 = (g.N) it.next();
                if (n10 instanceof g.c0) {
                    jVar.b(T0(((g.c0) n10).f4597c, z10, !it.hasNext()));
                } else {
                    l0(n10, jVar);
                }
                z10 = false;
            }
        }
    }

    private void E0(g.e0 e0Var) {
        y("Use render", new Object[0]);
        g.C0860p c0860p = e0Var.f4607s;
        if (c0860p == null || !c0860p.m()) {
            g.C0860p c0860p2 = e0Var.f4608t;
            if (c0860p2 == null || !c0860p2.m()) {
                W0(this.f4669d, e0Var);
                if (A()) {
                    g.N r10 = e0Var.f4568a.r(e0Var.f4604p);
                    if (r10 == null) {
                        F("Use reference '%s' not found", e0Var.f4604p);
                        return;
                    }
                    Matrix matrix = e0Var.f4623o;
                    if (matrix != null) {
                        this.f4666a.concat(matrix);
                    }
                    g.C0860p c0860p3 = e0Var.f4605q;
                    float i10 = c0860p3 != null ? c0860p3.i(this) : 0.0f;
                    g.C0860p c0860p4 = e0Var.f4606r;
                    this.f4666a.translate(i10, c0860p4 != null ? c0860p4.k(this) : 0.0f);
                    p(e0Var);
                    boolean m02 = m0();
                    i0(e0Var);
                    if (r10 instanceof g.F) {
                        g.C0847b f02 = f0(null, null, e0Var.f4607s, e0Var.f4608t);
                        S0();
                        y0((g.F) r10, f02);
                        R0();
                    } else if (r10 instanceof g.T) {
                        g.C0860p c0860p5 = e0Var.f4607s;
                        if (c0860p5 == null) {
                            c0860p5 = new g.C0860p(100.0f, g.d0.percent);
                        }
                        g.C0860p c0860p6 = e0Var.f4608t;
                        if (c0860p6 == null) {
                            c0860p6 = new g.C0860p(100.0f, g.d0.percent);
                        }
                        g.C0847b f03 = f0(null, null, c0860p5, c0860p6);
                        S0();
                        C0((g.T) r10, f03);
                        R0();
                    } else {
                        A0(r10);
                    }
                    h0();
                    if (m02) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(g.J j10, boolean z10) {
        if (z10) {
            i0(j10);
        }
        Iterator it = j10.a().iterator();
        while (it.hasNext()) {
            A0((g.N) it.next());
        }
        if (z10) {
            h0();
        }
    }

    private void G(g.Y y10, StringBuilder sb2) {
        Iterator it = y10.f4547i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            g.N n10 = (g.N) it.next();
            if (n10 instanceof g.Y) {
                G((g.Y) n10, sb2);
            } else if (n10 instanceof g.c0) {
                sb2.append(T0(((g.c0) n10).f4597c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    private void H(g.AbstractC0854j abstractC0854j, String str) {
        g.N r10 = abstractC0854j.f4568a.r(str);
        if (r10 == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(r10 instanceof g.AbstractC0854j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (r10 == abstractC0854j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g.AbstractC0854j abstractC0854j2 = (g.AbstractC0854j) r10;
        if (abstractC0854j.f4618i == null) {
            abstractC0854j.f4618i = abstractC0854j2.f4618i;
        }
        if (abstractC0854j.f4619j == null) {
            abstractC0854j.f4619j = abstractC0854j2.f4619j;
        }
        if (abstractC0854j.f4620k == null) {
            abstractC0854j.f4620k = abstractC0854j2.f4620k;
        }
        if (abstractC0854j.f4617h.isEmpty()) {
            abstractC0854j.f4617h = abstractC0854j2.f4617h;
        }
        try {
            if (abstractC0854j instanceof g.M) {
                I((g.M) abstractC0854j, (g.M) r10);
            } else {
                J((g.Q) abstractC0854j, (g.Q) r10);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC0854j2.f4621l;
        if (str2 != null) {
            H(abstractC0854j, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void H0(g.C0862r c0862r, c cVar) {
        float f10;
        g.C0847b c0847b;
        boolean m02;
        float f11;
        float f12;
        float f13;
        S0();
        Float f14 = c0862r.f4641v;
        float f15 = 0.0f;
        if (f14 != null) {
            if (Float.isNaN(f14.floatValue())) {
                float f16 = cVar.f4688c;
                if (f16 != 0.0f || cVar.f4689d != 0.0f) {
                    f10 = (float) Math.toDegrees(Math.atan2(cVar.f4689d, f16));
                }
            } else {
                f10 = c0862r.f4641v.floatValue();
            }
            float b10 = !c0862r.f4636q ? 1.0f : this.f4669d.f4705a.f4522g.b(this.f4667b);
            this.f4669d = M(c0862r);
            Matrix matrix = new Matrix();
            matrix.preTranslate(cVar.f4686a, cVar.f4687b);
            matrix.preRotate(f10);
            matrix.preScale(b10, b10);
            g.C0860p c0860p = c0862r.f4637r;
            float i10 = c0860p == null ? c0860p.i(this) : 0.0f;
            g.C0860p c0860p2 = c0862r.f4638s;
            float k10 = c0860p2 == null ? c0860p2.k(this) : 0.0f;
            g.C0860p c0860p3 = c0862r.f4639t;
            float i11 = c0860p3 == null ? c0860p3.i(this) : 3.0f;
            g.C0860p c0860p4 = c0862r.f4640u;
            float k11 = c0860p4 != null ? c0860p4.k(this) : 3.0f;
            c0847b = c0862r.f4576p;
            if (c0847b == null) {
                float f17 = i11 / c0847b.f4591c;
                float f18 = k11 / c0847b.f4592d;
                J2.e eVar = c0862r.f4570o;
                if (eVar == null) {
                    eVar = J2.e.f4474e;
                }
                if (!eVar.equals(J2.e.f4473d)) {
                    f17 = eVar.b() == e.b.slice ? Math.max(f17, f18) : Math.min(f17, f18);
                    f18 = f17;
                }
                matrix.preTranslate((-i10) * f17, (-k10) * f18);
                this.f4666a.concat(matrix);
                g.C0847b c0847b2 = c0862r.f4576p;
                float f19 = c0847b2.f4591c * f17;
                float f20 = c0847b2.f4592d * f18;
                int[] iArr = a.f4674a;
                switch (iArr[eVar.a().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f11 = (i11 - f19) / 2.0f;
                        f12 = 0.0f - f11;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f11 = i11 - f19;
                        f12 = 0.0f - f11;
                        break;
                    default:
                        f12 = 0.0f;
                        break;
                }
                int i12 = iArr[eVar.a().ordinal()];
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 5) {
                            if (i12 != 6) {
                                if (i12 != 7) {
                                }
                            }
                        }
                    }
                    f13 = k11 - f20;
                    f15 = 0.0f - f13;
                    if (!this.f4669d.f4705a.f4537v.booleanValue()) {
                        O0(f12, f15, i11, k11);
                    }
                    matrix.reset();
                    matrix.preScale(f17, f18);
                    this.f4666a.concat(matrix);
                }
                f13 = (k11 - f20) / 2.0f;
                f15 = 0.0f - f13;
                if (!this.f4669d.f4705a.f4537v.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f17, f18);
                this.f4666a.concat(matrix);
            } else {
                matrix.preTranslate(-i10, -k10);
                this.f4666a.concat(matrix);
                if (!this.f4669d.f4705a.f4537v.booleanValue()) {
                    O0(0.0f, 0.0f, i11, k11);
                }
            }
            m02 = m0();
            F0(c0862r, false);
            if (m02) {
                j0(c0862r);
            }
            R0();
        }
        f10 = 0.0f;
        if (!c0862r.f4636q) {
        }
        this.f4669d = M(c0862r);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(cVar.f4686a, cVar.f4687b);
        matrix2.preRotate(f10);
        matrix2.preScale(b10, b10);
        g.C0860p c0860p5 = c0862r.f4637r;
        if (c0860p5 == null) {
        }
        g.C0860p c0860p22 = c0862r.f4638s;
        if (c0860p22 == null) {
        }
        g.C0860p c0860p32 = c0862r.f4639t;
        if (c0860p32 == null) {
        }
        g.C0860p c0860p42 = c0862r.f4640u;
        if (c0860p42 != null) {
        }
        c0847b = c0862r.f4576p;
        if (c0847b == null) {
        }
        m02 = m0();
        F0(c0862r, false);
        if (m02) {
        }
        R0();
    }

    private void I(g.M m10, g.M m11) {
        if (m10.f4564m == null) {
            m10.f4564m = m11.f4564m;
        }
        if (m10.f4565n == null) {
            m10.f4565n = m11.f4565n;
        }
        if (m10.f4566o == null) {
            m10.f4566o = m11.f4566o;
        }
        if (m10.f4567p == null) {
            m10.f4567p = m11.f4567p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void I0(g.AbstractC0856l abstractC0856l) {
        g.C0862r c0862r;
        String str;
        g.C0862r c0862r2;
        String str2;
        g.C0862r c0862r3;
        List f10;
        int size;
        int i10;
        g.E e10 = this.f4669d.f4705a;
        String str3 = e10.f4539x;
        if (str3 == null && e10.f4540y == null && e10.f4541z == null) {
            return;
        }
        if (str3 != null) {
            g.N r10 = abstractC0856l.f4568a.r(str3);
            if (r10 != null) {
                c0862r = (g.C0862r) r10;
                str = this.f4669d.f4705a.f4540y;
                if (str != null) {
                    g.N r11 = abstractC0856l.f4568a.r(str);
                    if (r11 != null) {
                        c0862r2 = (g.C0862r) r11;
                        str2 = this.f4669d.f4705a.f4541z;
                        if (str2 != null) {
                            g.N r12 = abstractC0856l.f4568a.r(str2);
                            if (r12 != null) {
                                c0862r3 = (g.C0862r) r12;
                                f10 = !(abstractC0856l instanceof g.C0866v) ? new b(((g.C0866v) abstractC0856l).f4650o).f() : abstractC0856l instanceof g.C0861q ? k((g.C0861q) abstractC0856l) : l((g.C0870z) abstractC0856l);
                                if (f10 == null && (size = f10.size()) != 0) {
                                    g.E e11 = this.f4669d.f4705a;
                                    e11.f4541z = null;
                                    e11.f4540y = null;
                                    e11.f4539x = null;
                                    if (c0862r != null) {
                                        H0(c0862r, (c) f10.get(0));
                                    }
                                    if (c0862r2 != null && f10.size() > 2) {
                                        c cVar = (c) f10.get(0);
                                        c cVar2 = (c) f10.get(1);
                                        i10 = 1;
                                        while (i10 < size - 1) {
                                            i10++;
                                            c cVar3 = (c) f10.get(i10);
                                            cVar = cVar2.f4690e ? n0(cVar, cVar2, cVar3) : cVar2;
                                            H0(c0862r2, cVar);
                                            cVar2 = cVar3;
                                        }
                                    }
                                    if (c0862r3 == null) {
                                        H0(c0862r3, (c) f10.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            F("Marker reference '%s' not found", this.f4669d.f4705a.f4541z);
                        }
                        c0862r3 = null;
                        if (!(abstractC0856l instanceof g.C0866v)) {
                        }
                        if (f10 == null) {
                            return;
                        }
                        g.E e112 = this.f4669d.f4705a;
                        e112.f4541z = null;
                        e112.f4540y = null;
                        e112.f4539x = null;
                        if (c0862r != null) {
                        }
                        if (c0862r2 != null) {
                            c cVar4 = (c) f10.get(0);
                            c cVar22 = (c) f10.get(1);
                            i10 = 1;
                            while (i10 < size - 1) {
                            }
                        }
                        if (c0862r3 == null) {
                        }
                    } else {
                        F("Marker reference '%s' not found", this.f4669d.f4705a.f4540y);
                    }
                }
                c0862r2 = null;
                str2 = this.f4669d.f4705a.f4541z;
                if (str2 != null) {
                }
                c0862r3 = null;
                if (!(abstractC0856l instanceof g.C0866v)) {
                }
                if (f10 == null) {
                }
            } else {
                F("Marker reference '%s' not found", this.f4669d.f4705a.f4539x);
            }
        }
        c0862r = null;
        str = this.f4669d.f4705a.f4540y;
        if (str != null) {
        }
        c0862r2 = null;
        str2 = this.f4669d.f4705a.f4541z;
        if (str2 != null) {
        }
        c0862r3 = null;
        if (!(abstractC0856l instanceof g.C0866v)) {
        }
        if (f10 == null) {
        }
    }

    private void J(g.Q q10, g.Q q11) {
        if (q10.f4571m == null) {
            q10.f4571m = q11.f4571m;
        }
        if (q10.f4572n == null) {
            q10.f4572n = q11.f4572n;
        }
        if (q10.f4573o == null) {
            q10.f4573o = q11.f4573o;
        }
        if (q10.f4574p == null) {
            q10.f4574p = q11.f4574p;
        }
        if (q10.f4575q == null) {
            q10.f4575q = q11.f4575q;
        }
    }

    private void J0(g.C0863s c0863s, g.K k10, g.C0847b c0847b) {
        float f10;
        float f11;
        y("Mask render", new Object[0]);
        Boolean bool = c0863s.f4642o;
        if (bool == null || !bool.booleanValue()) {
            g.C0860p c0860p = c0863s.f4646s;
            float h10 = c0860p != null ? c0860p.h(this, 1.0f) : 1.2f;
            g.C0860p c0860p2 = c0863s.f4647t;
            float h11 = c0860p2 != null ? c0860p2.h(this, 1.0f) : 1.2f;
            f10 = h10 * c0847b.f4591c;
            f11 = h11 * c0847b.f4592d;
        } else {
            g.C0860p c0860p3 = c0863s.f4646s;
            f10 = c0860p3 != null ? c0860p3.i(this) : c0847b.f4591c;
            g.C0860p c0860p4 = c0863s.f4647t;
            f11 = c0860p4 != null ? c0860p4.k(this) : c0847b.f4592d;
        }
        if (f10 == 0.0f || f11 == 0.0f) {
            return;
        }
        S0();
        C0094h M10 = M(c0863s);
        this.f4669d = M10;
        M10.f4705a.f4528m = Float.valueOf(1.0f);
        boolean m02 = m0();
        this.f4666a.save();
        Boolean bool2 = c0863s.f4643p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f4666a.translate(c0847b.f4589a, c0847b.f4590b);
            this.f4666a.scale(c0847b.f4591c, c0847b.f4592d);
        }
        F0(c0863s, false);
        this.f4666a.restore();
        if (m02) {
            k0(k10, c0847b);
        }
        R0();
    }

    private void K(g.C0869y c0869y, String str) {
        g.N r10 = c0869y.f4568a.r(str);
        if (r10 == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(r10 instanceof g.C0869y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (r10 == c0869y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        g.C0869y c0869y2 = (g.C0869y) r10;
        if (c0869y.f4656q == null) {
            c0869y.f4656q = c0869y2.f4656q;
        }
        if (c0869y.f4657r == null) {
            c0869y.f4657r = c0869y2.f4657r;
        }
        if (c0869y.f4658s == null) {
            c0869y.f4658s = c0869y2.f4658s;
        }
        if (c0869y.f4659t == null) {
            c0869y.f4659t = c0869y2.f4659t;
        }
        if (c0869y.f4660u == null) {
            c0869y.f4660u = c0869y2.f4660u;
        }
        if (c0869y.f4661v == null) {
            c0869y.f4661v = c0869y2.f4661v;
        }
        if (c0869y.f4662w == null) {
            c0869y.f4662w = c0869y2.f4662w;
        }
        if (c0869y.f4547i.isEmpty()) {
            c0869y.f4547i = c0869y2.f4547i;
        }
        if (c0869y.f4576p == null) {
            c0869y.f4576p = c0869y2.f4576p;
        }
        if (c0869y.f4570o == null) {
            c0869y.f4570o = c0869y2.f4570o;
        }
        String str2 = c0869y2.f4663x;
        if (str2 != null) {
            K(c0869y, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(g.S s10) {
        Set b10;
        String language = Locale.getDefault().getLanguage();
        J2.g.k();
        for (g.N n10 : s10.a()) {
            if (n10 instanceof g.G) {
                g.G g10 = (g.G) n10;
                if (g10.d() == null && ((b10 = g10.b()) == null || (!b10.isEmpty() && b10.contains(language)))) {
                    Set i10 = g10.i();
                    if (i10 != null) {
                        if (f4665i == null) {
                            V();
                        }
                        if (!i10.isEmpty() && f4665i.containsAll(i10)) {
                        }
                    }
                    Set m10 = g10.m();
                    if (m10 != null) {
                        m10.isEmpty();
                    } else {
                        Set n11 = g10.n();
                        if (n11 == null) {
                            A0(n10);
                            return;
                        }
                        n11.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f6 A[LOOP:3: B:67:0x01f0->B:69:0x01f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void L(g.K k10, Path path, g.C0869y c0869y) {
        float f10;
        float f11;
        float f12;
        float f13;
        J2.e eVar;
        boolean z10;
        boolean z11;
        float floor;
        float c10;
        boolean m02;
        J2.e eVar2;
        Iterator it;
        Boolean bool = c0869y.f4656q;
        boolean z12 = bool != null && bool.booleanValue();
        String str = c0869y.f4663x;
        if (str != null) {
            K(c0869y, str);
        }
        if (z12) {
            g.C0860p c0860p = c0869y.f4659t;
            f10 = c0860p != null ? c0860p.i(this) : 0.0f;
            g.C0860p c0860p2 = c0869y.f4660u;
            f12 = c0860p2 != null ? c0860p2.k(this) : 0.0f;
            g.C0860p c0860p3 = c0869y.f4661v;
            f13 = c0860p3 != null ? c0860p3.i(this) : 0.0f;
            g.C0860p c0860p4 = c0869y.f4662w;
            f11 = c0860p4 != null ? c0860p4.k(this) : 0.0f;
        } else {
            g.C0860p c0860p5 = c0869y.f4659t;
            float h10 = c0860p5 != null ? c0860p5.h(this, 1.0f) : 0.0f;
            g.C0860p c0860p6 = c0869y.f4660u;
            float h11 = c0860p6 != null ? c0860p6.h(this, 1.0f) : 0.0f;
            g.C0860p c0860p7 = c0869y.f4661v;
            float h12 = c0860p7 != null ? c0860p7.h(this, 1.0f) : 0.0f;
            g.C0860p c0860p8 = c0869y.f4662w;
            float h13 = c0860p8 != null ? c0860p8.h(this, 1.0f) : 0.0f;
            g.C0847b c0847b = k10.f4558h;
            float f14 = c0847b.f4589a;
            float f15 = c0847b.f4591c;
            f10 = (h10 * f15) + f14;
            float f16 = c0847b.f4590b;
            float f17 = c0847b.f4592d;
            float f18 = h12 * f15;
            f11 = h13 * f17;
            f12 = (h11 * f17) + f16;
            f13 = f18;
        }
        if (f13 == 0.0f || f11 == 0.0f) {
            return;
        }
        J2.e eVar3 = c0869y.f4570o;
        if (eVar3 == null) {
            eVar3 = J2.e.f4474e;
        }
        S0();
        this.f4666a.clipPath(path);
        C0094h c0094h = new C0094h();
        V0(c0094h, g.E.a());
        c0094h.f4705a.f4537v = Boolean.FALSE;
        this.f4669d = N(c0869y, c0094h);
        g.C0847b c0847b2 = k10.f4558h;
        Matrix matrix = c0869y.f4658s;
        if (matrix != null) {
            this.f4666a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (c0869y.f4658s.invert(matrix2)) {
                g.C0847b c0847b3 = k10.f4558h;
                float f19 = c0847b3.f4589a;
                float f20 = c0847b3.f4590b;
                float b10 = c0847b3.b();
                g.C0847b c0847b4 = k10.f4558h;
                float f21 = c0847b4.f4590b;
                float b11 = c0847b4.b();
                float c11 = k10.f4558h.c();
                g.C0847b c0847b5 = k10.f4558h;
                eVar = eVar3;
                float[] fArr = {f19, f20, b10, f21, b11, c11, c0847b5.f4589a, c0847b5.c()};
                matrix2.mapPoints(fArr);
                z11 = false;
                float f22 = fArr[0];
                float f23 = fArr[1];
                RectF rectF = new RectF(f22, f23, f22, f23);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f24 = fArr[i10];
                    if (f24 < rectF.left) {
                        rectF.left = f24;
                    }
                    if (f24 > rectF.right) {
                        rectF.right = f24;
                    }
                    float f25 = fArr[i10 + 1];
                    if (f25 < rectF.top) {
                        rectF.top = f25;
                    }
                    if (f25 > rectF.bottom) {
                        rectF.bottom = f25;
                    }
                }
                z10 = true;
                float f26 = rectF.left;
                float f27 = rectF.top;
                c0847b2 = new g.C0847b(f26, f27, rectF.right - f26, rectF.bottom - f27);
                float floor2 = f10 + (((float) Math.floor((c0847b2.f4589a - f10) / f13)) * f13);
                floor = f12 + (((float) Math.floor((c0847b2.f4590b - f12) / f11)) * f11);
                float b12 = c0847b2.b();
                c10 = c0847b2.c();
                g.C0847b c0847b6 = new g.C0847b(0.0f, 0.0f, f13, f11);
                m02 = m0();
                while (floor < c10) {
                    float f28 = floor2;
                    while (f28 < b12) {
                        c0847b6.f4589a = f28;
                        c0847b6.f4590b = floor;
                        S0();
                        if (!this.f4669d.f4705a.f4537v.booleanValue()) {
                            O0(c0847b6.f4589a, c0847b6.f4590b, c0847b6.f4591c, c0847b6.f4592d);
                        }
                        g.C0847b c0847b7 = c0869y.f4576p;
                        if (c0847b7 != null) {
                            eVar2 = eVar;
                            this.f4666a.concat(o(c0847b6, c0847b7, eVar2));
                        } else {
                            eVar2 = eVar;
                            Boolean bool2 = c0869y.f4657r;
                            boolean z13 = (bool2 == null || bool2.booleanValue()) ? z10 : z11;
                            this.f4666a.translate(f28, floor);
                            if (!z13) {
                                Canvas canvas = this.f4666a;
                                g.C0847b c0847b8 = k10.f4558h;
                                canvas.scale(c0847b8.f4591c, c0847b8.f4592d);
                                it = c0869y.f4547i.iterator();
                                while (it.hasNext()) {
                                    A0((g.N) it.next());
                                }
                                R0();
                                f28 += f13;
                                eVar = eVar2;
                                z10 = true;
                            }
                        }
                        it = c0869y.f4547i.iterator();
                        while (it.hasNext()) {
                        }
                        R0();
                        f28 += f13;
                        eVar = eVar2;
                        z10 = true;
                    }
                    floor += f11;
                    z10 = true;
                }
                if (m02) {
                    j0(c0869y);
                }
                R0();
            }
        }
        eVar = eVar3;
        z10 = true;
        z11 = false;
        float floor22 = f10 + (((float) Math.floor((c0847b2.f4589a - f10) / f13)) * f13);
        floor = f12 + (((float) Math.floor((c0847b2.f4590b - f12) / f11)) * f11);
        float b122 = c0847b2.b();
        c10 = c0847b2.c();
        g.C0847b c0847b62 = new g.C0847b(0.0f, 0.0f, f13, f11);
        m02 = m0();
        while (floor < c10) {
        }
        if (m02) {
        }
        R0();
    }

    private void L0(g.Z z10) {
        y("TextPath render", new Object[0]);
        W0(this.f4669d, z10);
        if (A() && Y0()) {
            g.N r10 = z10.f4568a.r(z10.f4581o);
            if (r10 == null) {
                F("TextPath reference '%s' not found", z10.f4581o);
                return;
            }
            g.C0866v c0866v = (g.C0866v) r10;
            Path f10 = new d(c0866v.f4650o).f();
            Matrix matrix = c0866v.f4622n;
            if (matrix != null) {
                f10.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(f10, false);
            g.C0860p c0860p = z10.f4582p;
            float h10 = c0860p != null ? c0860p.h(this, pathMeasure.getLength()) : 0.0f;
            g.E.f O10 = O();
            if (O10 != g.E.f.Start) {
                float n10 = n(z10);
                if (O10 == g.E.f.Middle) {
                    n10 /= 2.0f;
                }
                h10 -= n10;
            }
            r((g.K) z10.f());
            boolean m02 = m0();
            E(z10, new e(f10, h10, 0.0f));
            if (m02) {
                j0(z10);
            }
        }
    }

    private C0094h M(g.N n10) {
        C0094h c0094h = new C0094h();
        V0(c0094h, g.E.a());
        return N(n10, c0094h);
    }

    private boolean M0() {
        return this.f4669d.f4705a.f4528m.floatValue() < 1.0f || this.f4669d.f4705a.f4509G != null;
    }

    private C0094h N(g.N n10, C0094h c0094h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n10 instanceof g.L) {
                arrayList.add(0, (g.L) n10);
            }
            Object obj = n10.f4569b;
            if (obj == null) {
                break;
            }
            n10 = (g.N) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(c0094h, (g.L) it.next());
        }
        C0094h c0094h2 = this.f4669d;
        c0094h.f4711g = c0094h2.f4711g;
        c0094h.f4710f = c0094h2.f4710f;
        return c0094h;
    }

    private void N0() {
        this.f4669d = new C0094h();
        this.f4670e = new Stack();
        V0(this.f4669d, g.E.a());
        C0094h c0094h = this.f4669d;
        c0094h.f4710f = null;
        c0094h.f4712h = false;
        this.f4670e.push(new C0094h(c0094h));
        this.f4672g = new Stack();
        this.f4671f = new Stack();
    }

    private g.E.f O() {
        g.E.f fVar;
        g.E e10 = this.f4669d.f4705a;
        if (e10.f4535t == g.E.h.LTR || (fVar = e10.f4536u) == g.E.f.Middle) {
            return e10.f4536u;
        }
        g.E.f fVar2 = g.E.f.Start;
        return fVar == fVar2 ? g.E.f.End : fVar2;
    }

    private void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float f15 = f13 + f11;
        g.C0848c c0848c = this.f4669d.f4705a.f4538w;
        if (c0848c != null) {
            f10 += c0848c.f4596d.i(this);
            f11 += this.f4669d.f4705a.f4538w.f4593a.k(this);
            f14 -= this.f4669d.f4705a.f4538w.f4594b.i(this);
            f15 -= this.f4669d.f4705a.f4538w.f4595c.k(this);
        }
        this.f4666a.clipRect(f10, f11, f14, f15);
    }

    private Path.FillType P() {
        g.E.a aVar = this.f4669d.f4705a.f4508F;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0094h c0094h, boolean z10, g.O o10) {
        int i10;
        g.E e10 = c0094h.f4705a;
        float floatValue = (z10 ? e10.f4519d : e10.f4521f).floatValue();
        if (o10 instanceof g.C0851f) {
            i10 = ((g.C0851f) o10).f4611a;
        } else if (!(o10 instanceof g.C0093g)) {
            return;
        } else {
            i10 = c0094h.f4705a.f4529n.f4611a;
        }
        int x10 = x(i10, floatValue);
        if (z10) {
            c0094h.f4708d.setColor(x10);
        } else {
            c0094h.f4709e.setColor(x10);
        }
    }

    private void Q0(boolean z10, g.C c10) {
        if (z10) {
            if (W(c10.f4561e, 2147483648L)) {
                C0094h c0094h = this.f4669d;
                g.E e10 = c0094h.f4705a;
                g.O o10 = c10.f4561e.f4510H;
                e10.f4517b = o10;
                c0094h.f4706b = o10 != null;
            }
            if (W(c10.f4561e, 4294967296L)) {
                this.f4669d.f4705a.f4519d = c10.f4561e.f4511I;
            }
            if (W(c10.f4561e, 6442450944L)) {
                C0094h c0094h2 = this.f4669d;
                P0(c0094h2, z10, c0094h2.f4705a.f4517b);
                return;
            }
            return;
        }
        if (W(c10.f4561e, 2147483648L)) {
            C0094h c0094h3 = this.f4669d;
            g.E e11 = c0094h3.f4705a;
            g.O o11 = c10.f4561e.f4510H;
            e11.f4520e = o11;
            c0094h3.f4707c = o11 != null;
        }
        if (W(c10.f4561e, 4294967296L)) {
            this.f4669d.f4705a.f4521f = c10.f4561e.f4511I;
        }
        if (W(c10.f4561e, 6442450944L)) {
            C0094h c0094h4 = this.f4669d;
            P0(c0094h4, z10, c0094h4.f4705a.f4520e);
        }
    }

    private void R0() {
        this.f4666a.restore();
        this.f4669d = (C0094h) this.f4670e.pop();
    }

    private void S0() {
        this.f4666a.save();
        this.f4670e.push(this.f4669d);
        this.f4669d = new C0094h(this.f4669d);
    }

    private String T0(String str, boolean z10, boolean z11) {
        if (this.f4669d.f4712h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", BuildConfig.FLAVOR).replaceAll("\\t", " ");
        if (z10) {
            replaceAll = replaceAll.replaceAll("^\\s+", BuildConfig.FLAVOR);
        }
        if (z11) {
            replaceAll = replaceAll.replaceAll("\\s+$", BuildConfig.FLAVOR);
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        g.E.a aVar = this.f4669d.f4705a.f4518c;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(g.K k10) {
        if (k10.f4569b == null || k10.f4558h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f4672g.peek()).invert(matrix)) {
            g.C0847b c0847b = k10.f4558h;
            float f10 = c0847b.f4589a;
            float f11 = c0847b.f4590b;
            float b10 = c0847b.b();
            g.C0847b c0847b2 = k10.f4558h;
            float f12 = c0847b2.f4590b;
            float b11 = c0847b2.b();
            float c10 = k10.f4558h.c();
            g.C0847b c0847b3 = k10.f4558h;
            float[] fArr = {f10, f11, b10, f12, b11, c10, c0847b3.f4589a, c0847b3.c()};
            matrix.preConcat(this.f4666a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            g.K k11 = (g.K) this.f4671f.peek();
            g.C0847b c0847b4 = k11.f4558h;
            if (c0847b4 == null) {
                k11.f4558h = g.C0847b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c0847b4.e(g.C0847b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        synchronized (h.class) {
            HashSet hashSet = new HashSet();
            f4665i = hashSet;
            hashSet.add("Structure");
            f4665i.add("BasicStructure");
            f4665i.add("ConditionalProcessing");
            f4665i.add("Image");
            f4665i.add("Style");
            f4665i.add("ViewportAttribute");
            f4665i.add("Shape");
            f4665i.add("BasicText");
            f4665i.add("PaintAttribute");
            f4665i.add("BasicPaintAttribute");
            f4665i.add("OpacityAttribute");
            f4665i.add("BasicGraphicsAttribute");
            f4665i.add("Marker");
            f4665i.add("Gradient");
            f4665i.add("Pattern");
            f4665i.add("Clip");
            f4665i.add("BasicClip");
            f4665i.add("Mask");
            f4665i.add("View");
        }
    }

    private void V0(C0094h c0094h, g.E e10) {
        if (W(e10, 4096L)) {
            c0094h.f4705a.f4529n = e10.f4529n;
        }
        if (W(e10, 2048L)) {
            c0094h.f4705a.f4528m = e10.f4528m;
        }
        if (W(e10, 1L)) {
            c0094h.f4705a.f4517b = e10.f4517b;
            g.O o10 = e10.f4517b;
            c0094h.f4706b = (o10 == null || o10 == g.C0851f.f4610c) ? false : true;
        }
        if (W(e10, 4L)) {
            c0094h.f4705a.f4519d = e10.f4519d;
        }
        if (W(e10, 6149L)) {
            P0(c0094h, true, c0094h.f4705a.f4517b);
        }
        if (W(e10, 2L)) {
            c0094h.f4705a.f4518c = e10.f4518c;
        }
        if (W(e10, 8L)) {
            c0094h.f4705a.f4520e = e10.f4520e;
            g.O o11 = e10.f4520e;
            c0094h.f4707c = (o11 == null || o11 == g.C0851f.f4610c) ? false : true;
        }
        if (W(e10, 16L)) {
            c0094h.f4705a.f4521f = e10.f4521f;
        }
        if (W(e10, 6168L)) {
            P0(c0094h, false, c0094h.f4705a.f4520e);
        }
        if (W(e10, 34359738368L)) {
            c0094h.f4705a.f4514X = e10.f4514X;
        }
        if (W(e10, 32L)) {
            g.E e11 = c0094h.f4705a;
            g.C0860p c0860p = e10.f4522g;
            e11.f4522g = c0860p;
            c0094h.f4709e.setStrokeWidth(c0860p.d(this));
        }
        if (W(e10, 64L)) {
            c0094h.f4705a.f4523h = e10.f4523h;
            int i10 = a.f4675b[e10.f4523h.ordinal()];
            if (i10 == 1) {
                c0094h.f4709e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0094h.f4709e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0094h.f4709e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e10, 128L)) {
            c0094h.f4705a.f4524i = e10.f4524i;
            int i11 = a.f4676c[e10.f4524i.ordinal()];
            if (i11 == 1) {
                c0094h.f4709e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0094h.f4709e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0094h.f4709e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e10, 256L)) {
            c0094h.f4705a.f4525j = e10.f4525j;
            c0094h.f4709e.setStrokeMiter(e10.f4525j.floatValue());
        }
        if (W(e10, 512L)) {
            c0094h.f4705a.f4526k = e10.f4526k;
        }
        if (W(e10, 1024L)) {
            c0094h.f4705a.f4527l = e10.f4527l;
        }
        Typeface typeface = null;
        if (W(e10, 1536L)) {
            g.C0860p[] c0860pArr = c0094h.f4705a.f4526k;
            if (c0860pArr == null) {
                c0094h.f4709e.setPathEffect(null);
            } else {
                int length = c0860pArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float d10 = c0094h.f4705a.f4526k[i13 % length].d(this);
                    fArr[i13] = d10;
                    f10 += d10;
                }
                if (f10 == 0.0f) {
                    c0094h.f4709e.setPathEffect(null);
                } else {
                    float d11 = c0094h.f4705a.f4527l.d(this);
                    if (d11 < 0.0f) {
                        d11 = (d11 % f10) + f10;
                    }
                    c0094h.f4709e.setPathEffect(new DashPathEffect(fArr, d11));
                }
            }
        }
        if (W(e10, 16384L)) {
            float Q10 = Q();
            c0094h.f4705a.f4531p = e10.f4531p;
            c0094h.f4708d.setTextSize(e10.f4531p.h(this, Q10));
            c0094h.f4709e.setTextSize(e10.f4531p.h(this, Q10));
        }
        if (W(e10, 8192L)) {
            c0094h.f4705a.f4530o = e10.f4530o;
        }
        if (W(e10, 32768L)) {
            if (e10.f4532q.intValue() == -1 && c0094h.f4705a.f4532q.intValue() > 100) {
                g.E e12 = c0094h.f4705a;
                e12.f4532q = Integer.valueOf(e12.f4532q.intValue() - 100);
            } else if (e10.f4532q.intValue() != 1 || c0094h.f4705a.f4532q.intValue() >= 900) {
                c0094h.f4705a.f4532q = e10.f4532q;
            } else {
                g.E e13 = c0094h.f4705a;
                e13.f4532q = Integer.valueOf(e13.f4532q.intValue() + 100);
            }
        }
        if (W(e10, 65536L)) {
            c0094h.f4705a.f4533r = e10.f4533r;
        }
        if (W(e10, 106496L)) {
            if (c0094h.f4705a.f4530o != null && this.f4668c != null) {
                J2.g.k();
                for (String str : c0094h.f4705a.f4530o) {
                    g.E e14 = c0094h.f4705a;
                    typeface = t(str, e14.f4532q, e14.f4533r);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                g.E e15 = c0094h.f4705a;
                typeface = t("serif", e15.f4532q, e15.f4533r);
            }
            c0094h.f4708d.setTypeface(typeface);
            c0094h.f4709e.setTypeface(typeface);
        }
        if (W(e10, 131072L)) {
            c0094h.f4705a.f4534s = e10.f4534s;
            Paint paint = c0094h.f4708d;
            g.E.EnumC0092g enumC0092g = e10.f4534s;
            g.E.EnumC0092g enumC0092g2 = g.E.EnumC0092g.LineThrough;
            paint.setStrikeThruText(enumC0092g == enumC0092g2);
            Paint paint2 = c0094h.f4708d;
            g.E.EnumC0092g enumC0092g3 = e10.f4534s;
            g.E.EnumC0092g enumC0092g4 = g.E.EnumC0092g.Underline;
            paint2.setUnderlineText(enumC0092g3 == enumC0092g4);
            c0094h.f4709e.setStrikeThruText(e10.f4534s == enumC0092g2);
            c0094h.f4709e.setUnderlineText(e10.f4534s == enumC0092g4);
        }
        if (W(e10, 68719476736L)) {
            c0094h.f4705a.f4535t = e10.f4535t;
        }
        if (W(e10, 262144L)) {
            c0094h.f4705a.f4536u = e10.f4536u;
        }
        if (W(e10, 524288L)) {
            c0094h.f4705a.f4537v = e10.f4537v;
        }
        if (W(e10, 2097152L)) {
            c0094h.f4705a.f4539x = e10.f4539x;
        }
        if (W(e10, 4194304L)) {
            c0094h.f4705a.f4540y = e10.f4540y;
        }
        if (W(e10, 8388608L)) {
            c0094h.f4705a.f4541z = e10.f4541z;
        }
        if (W(e10, 16777216L)) {
            c0094h.f4705a.f4503A = e10.f4503A;
        }
        if (W(e10, 33554432L)) {
            c0094h.f4705a.f4504B = e10.f4504B;
        }
        if (W(e10, 1048576L)) {
            c0094h.f4705a.f4538w = e10.f4538w;
        }
        if (W(e10, 268435456L)) {
            c0094h.f4705a.f4507E = e10.f4507E;
        }
        if (W(e10, 536870912L)) {
            c0094h.f4705a.f4508F = e10.f4508F;
        }
        if (W(e10, 1073741824L)) {
            c0094h.f4705a.f4509G = e10.f4509G;
        }
        if (W(e10, 67108864L)) {
            c0094h.f4705a.f4505C = e10.f4505C;
        }
        if (W(e10, 134217728L)) {
            c0094h.f4705a.f4506D = e10.f4506D;
        }
        if (W(e10, 8589934592L)) {
            c0094h.f4705a.f4512J = e10.f4512J;
        }
        if (W(e10, 17179869184L)) {
            c0094h.f4705a.f4513K = e10.f4513K;
        }
        if (W(e10, 137438953472L)) {
            c0094h.f4705a.f4515Y = e10.f4515Y;
        }
    }

    private boolean W(g.E e10, long j10) {
        return (e10.f4516a & j10) != 0;
    }

    private void W0(C0094h c0094h, g.L l10) {
        c0094h.f4705a.b(l10.f4569b == null);
        g.E e10 = l10.f4561e;
        if (e10 != null) {
            V0(c0094h, e10);
        }
        if (this.f4668c.n()) {
            for (b.p pVar : this.f4668c.d()) {
                if (J2.b.l(this.f4673h, pVar.f4456a, l10)) {
                    V0(c0094h, pVar.f4457b);
                }
            }
        }
        g.E e11 = l10.f4562f;
        if (e11 != null) {
            V0(c0094h, e11);
        }
    }

    private void X(boolean z10, g.C0847b c0847b, g.M m10) {
        float f10;
        float h10;
        float f11;
        float f12;
        String str = m10.f4621l;
        if (str != null) {
            H(m10, str);
        }
        Boolean bool = m10.f4618i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0094h c0094h = this.f4669d;
        Paint paint = z10 ? c0094h.f4708d : c0094h.f4709e;
        if (z11) {
            g.C0847b S10 = S();
            g.C0860p c0860p = m10.f4564m;
            float i11 = c0860p != null ? c0860p.i(this) : 0.0f;
            g.C0860p c0860p2 = m10.f4565n;
            float k10 = c0860p2 != null ? c0860p2.k(this) : 0.0f;
            g.C0860p c0860p3 = m10.f4566o;
            float i12 = c0860p3 != null ? c0860p3.i(this) : S10.f4591c;
            g.C0860p c0860p4 = m10.f4567p;
            f12 = i12;
            f10 = i11;
            f11 = k10;
            h10 = c0860p4 != null ? c0860p4.k(this) : 0.0f;
        } else {
            g.C0860p c0860p5 = m10.f4564m;
            float h11 = c0860p5 != null ? c0860p5.h(this, 1.0f) : 0.0f;
            g.C0860p c0860p6 = m10.f4565n;
            float h12 = c0860p6 != null ? c0860p6.h(this, 1.0f) : 0.0f;
            g.C0860p c0860p7 = m10.f4566o;
            float h13 = c0860p7 != null ? c0860p7.h(this, 1.0f) : 1.0f;
            g.C0860p c0860p8 = m10.f4567p;
            f10 = h11;
            h10 = c0860p8 != null ? c0860p8.h(this, 1.0f) : 0.0f;
            f11 = h12;
            f12 = h13;
        }
        S0();
        this.f4669d = M(m10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c0847b.f4589a, c0847b.f4590b);
            matrix.preScale(c0847b.f4591c, c0847b.f4592d);
        }
        Matrix matrix2 = m10.f4619j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m10.f4617h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f4669d.f4706b = false;
                return;
            } else {
                this.f4669d.f4707c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m10.f4617h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            g.D d10 = (g.D) ((g.N) it.next());
            Float f14 = d10.f4502h;
            float floatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || floatValue >= f13) {
                fArr[i10] = floatValue;
                f13 = floatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f4669d, d10);
            g.E e10 = this.f4669d.f4705a;
            g.C0851f c0851f = (g.C0851f) e10.f4505C;
            if (c0851f == null) {
                c0851f = g.C0851f.f4609b;
            }
            iArr[i10] = x(c0851f.f4611a, e10.f4506D.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f12 && f11 == h10) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC0855k enumC0855k = m10.f4620k;
        if (enumC0855k != null) {
            if (enumC0855k == g.EnumC0855k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC0855k == g.EnumC0855k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f11, f12, h10, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f4669d.f4705a.f4519d.floatValue()));
    }

    private void X0() {
        int i10;
        g.E e10 = this.f4669d.f4705a;
        g.O o10 = e10.f4512J;
        if (o10 instanceof g.C0851f) {
            i10 = ((g.C0851f) o10).f4611a;
        } else if (!(o10 instanceof g.C0093g)) {
            return;
        } else {
            i10 = e10.f4529n.f4611a;
        }
        Float f10 = e10.f4513K;
        if (f10 != null) {
            i10 = x(i10, f10.floatValue());
        }
        this.f4666a.drawColor(i10);
    }

    private Path Y(g.C0849d c0849d) {
        g.C0860p c0860p = c0849d.f4599o;
        float i10 = c0860p != null ? c0860p.i(this) : 0.0f;
        g.C0860p c0860p2 = c0849d.f4600p;
        float k10 = c0860p2 != null ? c0860p2.k(this) : 0.0f;
        float d10 = c0849d.f4601q.d(this);
        float f10 = i10 - d10;
        float f11 = k10 - d10;
        float f12 = i10 + d10;
        float f13 = k10 + d10;
        if (c0849d.f4558h == null) {
            float f14 = 2.0f * d10;
            c0849d.f4558h = new g.C0847b(f10, f11, f14, f14);
        }
        float f15 = 0.5522848f * d10;
        Path path = new Path();
        path.moveTo(i10, f11);
        float f16 = i10 + f15;
        float f17 = k10 - f15;
        path.cubicTo(f16, f11, f12, f17, f12, k10);
        float f18 = k10 + f15;
        path.cubicTo(f12, f18, f16, f13, i10, f13);
        float f19 = i10 - f15;
        path.cubicTo(f19, f13, f10, f18, f10, k10);
        path.cubicTo(f10, f17, f19, f11, i10, f11);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f4669d.f4705a.f4504B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(g.C0853i c0853i) {
        g.C0860p c0860p = c0853i.f4613o;
        float i10 = c0860p != null ? c0860p.i(this) : 0.0f;
        g.C0860p c0860p2 = c0853i.f4614p;
        float k10 = c0860p2 != null ? c0860p2.k(this) : 0.0f;
        float i11 = c0853i.f4615q.i(this);
        float k11 = c0853i.f4616r.k(this);
        float f10 = i10 - i11;
        float f11 = k10 - k11;
        float f12 = i10 + i11;
        float f13 = k10 + k11;
        if (c0853i.f4558h == null) {
            c0853i.f4558h = new g.C0847b(f10, f11, i11 * 2.0f, 2.0f * k11);
        }
        float f14 = i11 * 0.5522848f;
        float f15 = 0.5522848f * k11;
        Path path = new Path();
        path.moveTo(i10, f11);
        float f16 = i10 + f14;
        float f17 = k10 - f15;
        path.cubicTo(f16, f11, f12, f17, f12, k10);
        float f18 = f15 + k10;
        path.cubicTo(f12, f18, f16, f13, i10, f13);
        float f19 = i10 - f14;
        path.cubicTo(f19, f13, f10, f18, f10, k10);
        path.cubicTo(f10, f17, f19, f11, i10, f11);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(g.C0861q c0861q) {
        g.C0860p c0860p = c0861q.f4632o;
        float i10 = c0860p == null ? 0.0f : c0860p.i(this);
        g.C0860p c0860p2 = c0861q.f4633p;
        float k10 = c0860p2 == null ? 0.0f : c0860p2.k(this);
        g.C0860p c0860p3 = c0861q.f4634q;
        float i11 = c0860p3 == null ? 0.0f : c0860p3.i(this);
        g.C0860p c0860p4 = c0861q.f4635r;
        float k11 = c0860p4 != null ? c0860p4.k(this) : 0.0f;
        if (c0861q.f4558h == null) {
            c0861q.f4558h = new g.C0847b(Math.min(i10, i11), Math.min(k10, k11), Math.abs(i11 - i10), Math.abs(k11 - k10));
        }
        Path path = new Path();
        path.moveTo(i10, k10);
        path.lineTo(i11, k11);
        return path;
    }

    private Path b0(g.C0870z c0870z) {
        Path path = new Path();
        float[] fArr = c0870z.f4664o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = c0870z.f4664o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (c0870z instanceof g.A) {
            path.close();
        }
        if (c0870z.f4558h == null) {
            c0870z.f4558h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path c0(g.B b10) {
        float i10;
        float k10;
        float min;
        float i11;
        float k11;
        float f10;
        float f11;
        Path path;
        Path path2;
        g.C0860p c0860p = b10.f4500s;
        if (c0860p == null && b10.f4501t == null) {
            i10 = 0.0f;
        } else if (c0860p == null) {
            i10 = b10.f4501t.k(this);
        } else {
            if (b10.f4501t != null) {
                i10 = c0860p.i(this);
                k10 = b10.f4501t.k(this);
                min = Math.min(i10, b10.f4498q.i(this) / 2.0f);
                float min2 = Math.min(k10, b10.f4499r.k(this) / 2.0f);
                g.C0860p c0860p2 = b10.f4496o;
                i11 = c0860p2 == null ? c0860p2.i(this) : 0.0f;
                g.C0860p c0860p3 = b10.f4497p;
                k11 = c0860p3 == null ? c0860p3.k(this) : 0.0f;
                float i12 = b10.f4498q.i(this);
                float k12 = b10.f4499r.k(this);
                if (b10.f4558h == null) {
                    b10.f4558h = new g.C0847b(i11, k11, i12, k12);
                }
                f10 = i11 + i12;
                f11 = k11 + k12;
                path = new Path();
                if (min != 0.0f || min2 == 0.0f) {
                    path2 = path;
                    path2.moveTo(i11, k11);
                    path2.lineTo(f10, k11);
                    path2.lineTo(f10, f11);
                    path2.lineTo(i11, f11);
                    path2.lineTo(i11, k11);
                } else {
                    float f12 = min * 0.5522848f;
                    float f13 = 0.5522848f * min2;
                    float f14 = k11 + min2;
                    path.moveTo(i11, f14);
                    float f15 = f14 - f13;
                    float f16 = i11 + min;
                    float f17 = f16 - f12;
                    path.cubicTo(i11, f15, f17, k11, f16, k11);
                    float f18 = f10 - min;
                    path.lineTo(f18, k11);
                    float f19 = f18 + f12;
                    path.cubicTo(f19, k11, f10, f15, f10, f14);
                    float f20 = f11 - min2;
                    path.lineTo(f10, f20);
                    float f21 = f20 + f13;
                    path2 = path;
                    path.cubicTo(f10, f21, f19, f11, f18, f11);
                    path2.lineTo(f16, f11);
                    path2.cubicTo(f17, f11, i11, f21, i11, f20);
                    path2.lineTo(i11, f14);
                }
                path2.close();
                return path2;
            }
            i10 = c0860p.i(this);
        }
        k10 = i10;
        min = Math.min(i10, b10.f4498q.i(this) / 2.0f);
        float min22 = Math.min(k10, b10.f4499r.k(this) / 2.0f);
        g.C0860p c0860p22 = b10.f4496o;
        if (c0860p22 == null) {
        }
        g.C0860p c0860p32 = b10.f4497p;
        if (c0860p32 == null) {
        }
        float i122 = b10.f4498q.i(this);
        float k122 = b10.f4499r.k(this);
        if (b10.f4558h == null) {
        }
        f10 = i11 + i122;
        f11 = k11 + k122;
        path = new Path();
        if (min != 0.0f) {
        }
        path2 = path;
        path2.moveTo(i11, k11);
        path2.lineTo(f10, k11);
        path2.lineTo(f10, f11);
        path2.lineTo(i11, f11);
        path2.lineTo(i11, k11);
        path2.close();
        return path2;
    }

    private Path d0(g.W w10) {
        List list = w10.f4585o;
        float f10 = 0.0f;
        float i10 = (list == null || list.size() == 0) ? 0.0f : ((g.C0860p) w10.f4585o.get(0)).i(this);
        List list2 = w10.f4586p;
        float k10 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.C0860p) w10.f4586p.get(0)).k(this);
        List list3 = w10.f4587q;
        float i11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C0860p) w10.f4587q.get(0)).i(this);
        List list4 = w10.f4588r;
        if (list4 != null && list4.size() != 0) {
            f10 = ((g.C0860p) w10.f4588r.get(0)).k(this);
        }
        if (this.f4669d.f4705a.f4536u != g.E.f.Start) {
            float n10 = n(w10);
            if (this.f4669d.f4705a.f4536u == g.E.f.Middle) {
                n10 /= 2.0f;
            }
            i10 -= n10;
        }
        if (w10.f4558h == null) {
            i iVar = new i(i10, k10);
            E(w10, iVar);
            RectF rectF = iVar.f4716d;
            w10.f4558h = new g.C0847b(rectF.left, rectF.top, rectF.width(), iVar.f4716d.height());
        }
        Path path = new Path();
        E(w10, new g(i10 + i11, k10 + f10, path));
        return path;
    }

    private void e0(boolean z10, g.C0847b c0847b, g.Q q10) {
        float f10;
        float h10;
        float f11;
        String str = q10.f4621l;
        if (str != null) {
            H(q10, str);
        }
        Boolean bool = q10.f4618i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0094h c0094h = this.f4669d;
        Paint paint = z10 ? c0094h.f4708d : c0094h.f4709e;
        if (z11) {
            g.C0860p c0860p = new g.C0860p(50.0f, g.d0.percent);
            g.C0860p c0860p2 = q10.f4571m;
            float i11 = c0860p2 != null ? c0860p2.i(this) : c0860p.i(this);
            g.C0860p c0860p3 = q10.f4572n;
            float k10 = c0860p3 != null ? c0860p3.k(this) : c0860p.k(this);
            g.C0860p c0860p4 = q10.f4573o;
            h10 = c0860p4 != null ? c0860p4.d(this) : c0860p.d(this);
            f10 = i11;
            f11 = k10;
        } else {
            g.C0860p c0860p5 = q10.f4571m;
            float h11 = c0860p5 != null ? c0860p5.h(this, 1.0f) : 0.5f;
            g.C0860p c0860p6 = q10.f4572n;
            float h12 = c0860p6 != null ? c0860p6.h(this, 1.0f) : 0.5f;
            g.C0860p c0860p7 = q10.f4573o;
            f10 = h11;
            h10 = c0860p7 != null ? c0860p7.h(this, 1.0f) : 0.5f;
            f11 = h12;
        }
        S0();
        this.f4669d = M(q10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c0847b.f4589a, c0847b.f4590b);
            matrix.preScale(c0847b.f4591c, c0847b.f4592d);
        }
        Matrix matrix2 = q10.f4619j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q10.f4617h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f4669d.f4706b = false;
                return;
            } else {
                this.f4669d.f4707c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q10.f4617h.iterator();
        float f12 = -1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g.D d10 = (g.D) ((g.N) it.next());
            Float f13 = d10.f4502h;
            float floatValue = f13 != null ? f13.floatValue() : 0.0f;
            if (i10 == 0 || floatValue >= f12) {
                fArr[i10] = floatValue;
                f12 = floatValue;
            } else {
                fArr[i10] = f12;
            }
            S0();
            W0(this.f4669d, d10);
            g.E e10 = this.f4669d.f4705a;
            g.C0851f c0851f = (g.C0851f) e10.f4505C;
            if (c0851f == null) {
                c0851f = g.C0851f.f4609b;
            }
            iArr[i10] = x(c0851f.f4611a, e10.f4506D.floatValue());
            i10++;
            R0();
        }
        if (h10 == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC0855k enumC0855k = q10.f4620k;
        if (enumC0855k != null) {
            if (enumC0855k == g.EnumC0855k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC0855k == g.EnumC0855k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, h10, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f4669d.f4705a.f4519d.floatValue()));
    }

    private g.C0847b f0(g.C0860p c0860p, g.C0860p c0860p2, g.C0860p c0860p3, g.C0860p c0860p4) {
        float i10 = c0860p != null ? c0860p.i(this) : 0.0f;
        float k10 = c0860p2 != null ? c0860p2.k(this) : 0.0f;
        g.C0847b S10 = S();
        return new g.C0847b(i10, k10, c0860p3 != null ? c0860p3.i(this) : S10.f4591c, c0860p4 != null ? c0860p4.k(this) : S10.f4592d);
    }

    private Path g0(g.K k10, boolean z10) {
        Path d02;
        Path j10;
        this.f4670e.push(this.f4669d);
        C0094h c0094h = new C0094h(this.f4669d);
        this.f4669d = c0094h;
        W0(c0094h, k10);
        if (!A() || !Y0()) {
            this.f4669d = (C0094h) this.f4670e.pop();
            return null;
        }
        if (k10 instanceof g.e0) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g.e0 e0Var = (g.e0) k10;
            g.N r10 = k10.f4568a.r(e0Var.f4604p);
            if (r10 == null) {
                F("Use reference '%s' not found", e0Var.f4604p);
                this.f4669d = (C0094h) this.f4670e.pop();
                return null;
            }
            if (!(r10 instanceof g.K)) {
                this.f4669d = (C0094h) this.f4670e.pop();
                return null;
            }
            d02 = g0((g.K) r10, false);
            if (d02 == null) {
                return null;
            }
            if (e0Var.f4558h == null) {
                e0Var.f4558h = m(d02);
            }
            Matrix matrix = e0Var.f4623o;
            if (matrix != null) {
                d02.transform(matrix);
            }
        } else if (k10 instanceof g.AbstractC0856l) {
            g.AbstractC0856l abstractC0856l = (g.AbstractC0856l) k10;
            if (k10 instanceof g.C0866v) {
                d02 = new d(((g.C0866v) k10).f4650o).f();
                if (k10.f4558h == null) {
                    k10.f4558h = m(d02);
                }
            } else {
                d02 = k10 instanceof g.B ? c0((g.B) k10) : k10 instanceof g.C0849d ? Y((g.C0849d) k10) : k10 instanceof g.C0853i ? Z((g.C0853i) k10) : k10 instanceof g.C0870z ? b0((g.C0870z) k10) : null;
            }
            if (d02 == null) {
                return null;
            }
            if (abstractC0856l.f4558h == null) {
                abstractC0856l.f4558h = m(d02);
            }
            Matrix matrix2 = abstractC0856l.f4622n;
            if (matrix2 != null) {
                d02.transform(matrix2);
            }
            d02.setFillType(P());
        } else {
            if (!(k10 instanceof g.W)) {
                F("Invalid %s element found in clipPath definition", k10.o());
                return null;
            }
            g.W w10 = (g.W) k10;
            d02 = d0(w10);
            if (d02 == null) {
                return null;
            }
            Matrix matrix3 = w10.f4580s;
            if (matrix3 != null) {
                d02.transform(matrix3);
            }
            d02.setFillType(P());
        }
        if (this.f4669d.f4705a.f4507E != null && (j10 = j(k10, k10.f4558h)) != null) {
            d02.op(j10, Path.Op.INTERSECT);
        }
        this.f4669d = (C0094h) this.f4670e.pop();
        return d02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, g.InterfaceC0868x interfaceC0868x) {
        float f17;
        g.InterfaceC0868x interfaceC0868x2;
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f) {
            f17 = f15;
            interfaceC0868x2 = interfaceC0868x;
        } else {
            if (f13 != 0.0f) {
                float abs = Math.abs(f12);
                float abs2 = Math.abs(f13);
                double radians = Math.toRadians(f14 % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d10 = (f10 - f15) / 2.0d;
                double d11 = (f11 - f16) / 2.0d;
                double d12 = (cos * d10) + (sin * d11);
                double d13 = ((-sin) * d10) + (d11 * cos);
                double d14 = abs * abs;
                double d15 = abs2 * abs2;
                double d16 = d12 * d12;
                double d17 = d13 * d13;
                double d18 = (d16 / d14) + (d17 / d15);
                if (d18 > 0.99999d) {
                    double sqrt = Math.sqrt(d18) * 1.00001d;
                    abs = (float) (abs * sqrt);
                    abs2 = (float) (sqrt * abs2);
                    d14 = abs * abs;
                    d15 = abs2 * abs2;
                }
                double d19 = z10 == z11 ? -1.0d : 1.0d;
                double d20 = d14 * d15;
                double d21 = d14 * d17;
                double d22 = d15 * d16;
                double d23 = ((d20 - d21) - d22) / (d21 + d22);
                if (d23 < 0.0d) {
                    d23 = 0.0d;
                }
                double sqrt2 = d19 * Math.sqrt(d23);
                double d24 = abs;
                double d25 = abs2;
                double d26 = ((d24 * d13) / d25) * sqrt2;
                float f18 = abs;
                float f19 = abs2;
                double d27 = sqrt2 * (-((d25 * d12) / d24));
                double d28 = ((f10 + f15) / 2.0d) + ((cos * d26) - (sin * d27));
                double d29 = ((f11 + f16) / 2.0d) + (sin * d26) + (cos * d27);
                double d30 = (d12 - d26) / d24;
                double d31 = (d13 - d27) / d25;
                double d32 = ((-d12) - d26) / d24;
                double d33 = ((-d13) - d27) / d25;
                double d34 = (d30 * d30) + (d31 * d31);
                double acos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
                double v10 = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
                if (!z11 && v10 > 0.0d) {
                    v10 -= 6.283185307179586d;
                } else if (z11 && v10 < 0.0d) {
                    v10 += 6.283185307179586d;
                }
                float[] i10 = i(acos % 6.283185307179586d, v10 % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f18, f19);
                matrix.postRotate(f14);
                matrix.postTranslate((float) d28, (float) d29);
                matrix.mapPoints(i10);
                i10[i10.length - 2] = f15;
                i10[i10.length - 1] = f16;
                for (int i11 = 0; i11 < i10.length; i11 += 6) {
                    interfaceC0868x.c(i10[i11], i10[i11 + 1], i10[i11 + 2], i10[i11 + 3], i10[i11 + 4], i10[i11 + 5]);
                }
                return;
            }
            interfaceC0868x2 = interfaceC0868x;
            f17 = f15;
        }
        interfaceC0868x2.e(f17, f16);
    }

    private void h0() {
        this.f4671f.pop();
        this.f4672g.pop();
    }

    private static float[] i(double d10, double d11) {
        int ceil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ceil;
        double d13 = d12 / 2.0d;
        double sin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < ceil) {
            double d14 = d10 + (i10 * d12);
            double cos = Math.cos(d14);
            double sin2 = Math.sin(d14);
            double d15 = d12;
            fArr[i11] = (float) (cos - (sin * sin2));
            fArr[i11 + 1] = (float) (sin2 + (cos * sin));
            double d16 = d14 + d15;
            double cos2 = Math.cos(d16);
            double sin3 = Math.sin(d16);
            fArr[i11 + 2] = (float) ((sin * sin3) + cos2);
            fArr[i11 + 3] = (float) (sin3 - (sin * cos2));
            int i12 = i11 + 5;
            fArr[i11 + 4] = (float) cos2;
            i11 += 6;
            fArr[i12] = (float) sin3;
            i10++;
            d12 = d15;
        }
        return fArr;
    }

    private void i0(g.J j10) {
        this.f4671f.push(j10);
        this.f4672g.push(this.f4666a.getMatrix());
    }

    private Path j(g.K k10, g.C0847b c0847b) {
        Path g02;
        g.N r10 = k10.f4568a.r(this.f4669d.f4705a.f4507E);
        if (r10 == null) {
            F("ClipPath reference '%s' not found", this.f4669d.f4705a.f4507E);
            return null;
        }
        g.C0850e c0850e = (g.C0850e) r10;
        this.f4670e.push(this.f4669d);
        this.f4669d = M(c0850e);
        Boolean bool = c0850e.f4603p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c0847b.f4589a, c0847b.f4590b);
            matrix.preScale(c0847b.f4591c, c0847b.f4592d);
        }
        Matrix matrix2 = c0850e.f4623o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (g.N n10 : c0850e.f4547i) {
            if ((n10 instanceof g.K) && (g02 = g0((g.K) n10, true)) != null) {
                path.op(g02, Path.Op.UNION);
            }
        }
        if (this.f4669d.f4705a.f4507E != null) {
            if (c0850e.f4558h == null) {
                c0850e.f4558h = m(path);
            }
            Path j10 = j(c0850e, c0850e.f4558h);
            if (j10 != null) {
                path.op(j10, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f4669d = (C0094h) this.f4670e.pop();
        return path;
    }

    private void j0(g.K k10) {
        k0(k10, k10.f4558h);
    }

    private List k(g.C0861q c0861q) {
        g.C0860p c0860p = c0861q.f4632o;
        float i10 = c0860p != null ? c0860p.i(this) : 0.0f;
        g.C0860p c0860p2 = c0861q.f4633p;
        float k10 = c0860p2 != null ? c0860p2.k(this) : 0.0f;
        g.C0860p c0860p3 = c0861q.f4634q;
        float i11 = c0860p3 != null ? c0860p3.i(this) : 0.0f;
        g.C0860p c0860p4 = c0861q.f4635r;
        float k11 = c0860p4 != null ? c0860p4.k(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f10 = i11 - i10;
        float f11 = k11 - k10;
        arrayList.add(new c(i10, k10, f10, f11));
        arrayList.add(new c(i11, k11, f10, f11));
        return arrayList;
    }

    private void k0(g.K k10, g.C0847b c0847b) {
        if (this.f4669d.f4705a.f4509G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f4666a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f4666a.saveLayer(null, paint2, 31);
            g.C0863s c0863s = (g.C0863s) this.f4668c.r(this.f4669d.f4705a.f4509G);
            J0(c0863s, k10, c0847b);
            this.f4666a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f4666a.saveLayer(null, paint3, 31);
            J0(c0863s, k10, c0847b);
            this.f4666a.restore();
            this.f4666a.restore();
        }
        R0();
    }

    private List l(g.C0870z c0870z) {
        int length = c0870z.f4664o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c0870z.f4664o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = c0870z.f4664o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f4686a, f13 - cVar.f4687b);
            f11 = f13;
            f10 = f12;
        }
        if (c0870z instanceof g.A) {
            float[] fArr3 = c0870z.f4664o;
            float f14 = fArr3[0];
            if (f10 != f14) {
                float f15 = fArr3[1];
                if (f11 != f15) {
                    cVar.a(f14, f15);
                    arrayList.add(cVar);
                    c cVar2 = new c(f14, f15, f14 - cVar.f4686a, f15 - cVar.f4687b);
                    cVar2.b((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void l0(g.N n10, j jVar) {
        float f10;
        float f11;
        float f12;
        g.E.f O10;
        if (jVar.a((g.Y) n10)) {
            if (n10 instanceof g.Z) {
                S0();
                L0((g.Z) n10);
                R0();
                return;
            }
            if (!(n10 instanceof g.V)) {
                if (n10 instanceof g.U) {
                    S0();
                    g.U u10 = (g.U) n10;
                    W0(this.f4669d, u10);
                    if (A()) {
                        r((g.K) u10.f());
                        g.N r10 = n10.f4568a.r(u10.f4577o);
                        if (r10 == null || !(r10 instanceof g.Y)) {
                            F("Tref reference '%s' not found", u10.f4577o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((g.Y) r10, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            g.V v10 = (g.V) n10;
            W0(this.f4669d, v10);
            if (A()) {
                List list = v10.f4585o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float f13 = 0.0f;
                if (z11) {
                    float i10 = !z10 ? ((f) jVar).f4698b : ((g.C0860p) v10.f4585o.get(0)).i(this);
                    List list2 = v10.f4586p;
                    f11 = (list2 == null || list2.size() == 0) ? ((f) jVar).f4699c : ((g.C0860p) v10.f4586p.get(0)).k(this);
                    List list3 = v10.f4587q;
                    f12 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C0860p) v10.f4587q.get(0)).i(this);
                    List list4 = v10.f4588r;
                    if (list4 != null && list4.size() != 0) {
                        f13 = ((g.C0860p) v10.f4588r.get(0)).k(this);
                    }
                    f10 = f13;
                    f13 = i10;
                } else {
                    f10 = 0.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
                if (z10 && (O10 = O()) != g.E.f.Start) {
                    float n11 = n(v10);
                    if (O10 == g.E.f.Middle) {
                        n11 /= 2.0f;
                    }
                    f13 -= n11;
                }
                r((g.K) v10.f());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f4698b = f13 + f12;
                    fVar.f4699c = f11 + f10;
                }
                boolean m02 = m0();
                E(v10, jVar);
                if (m02) {
                    j0(v10);
                }
            }
            R0();
        }
    }

    private g.C0847b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.C0847b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        g.N r10;
        if (!M0()) {
            return false;
        }
        this.f4666a.saveLayerAlpha(null, w(this.f4669d.f4705a.f4528m.floatValue()), 31);
        this.f4670e.push(this.f4669d);
        C0094h c0094h = new C0094h(this.f4669d);
        this.f4669d = c0094h;
        String str = c0094h.f4705a.f4509G;
        if (str != null && ((r10 = this.f4668c.r(str)) == null || !(r10 instanceof g.C0863s))) {
            F("Mask reference '%s' not found", this.f4669d.f4705a.f4509G);
            this.f4669d.f4705a.f4509G = null;
        }
        return true;
    }

    private float n(g.Y y10) {
        k kVar = new k(this, null);
        E(y10, kVar);
        return kVar.f4719b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float D10 = D(cVar2.f4688c, cVar2.f4689d, cVar2.f4686a - cVar.f4686a, cVar2.f4687b - cVar.f4687b);
        if (D10 == 0.0f) {
            D10 = D(cVar2.f4688c, cVar2.f4689d, cVar3.f4686a - cVar2.f4686a, cVar3.f4687b - cVar2.f4687b);
        }
        if (D10 > 0.0f) {
            return cVar2;
        }
        if (D10 == 0.0f && (cVar2.f4688c > 0.0f || cVar2.f4689d >= 0.0f)) {
            return cVar2;
        }
        cVar2.f4688c = -cVar2.f4688c;
        cVar2.f4689d = -cVar2.f4689d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Matrix o(g.C0847b c0847b, g.C0847b c0847b2, J2.e eVar) {
        float f10;
        float f11;
        Matrix matrix = new Matrix();
        if (eVar != null && eVar.a() != null) {
            float f12 = c0847b.f4591c / c0847b2.f4591c;
            float f13 = c0847b.f4592d / c0847b2.f4592d;
            float f14 = -c0847b2.f4589a;
            float f15 = -c0847b2.f4590b;
            if (eVar.equals(J2.e.f4473d)) {
                matrix.preTranslate(c0847b.f4589a, c0847b.f4590b);
                matrix.preScale(f12, f13);
                matrix.preTranslate(f14, f15);
                return matrix;
            }
            float max = eVar.b() == e.b.slice ? Math.max(f12, f13) : Math.min(f12, f13);
            float f16 = c0847b.f4591c / max;
            float f17 = c0847b.f4592d / max;
            int[] iArr = a.f4674a;
            switch (iArr[eVar.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f11 = (c0847b2.f4591c - f16) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f11 = c0847b2.f4591c - f16;
                    break;
            }
            f14 -= f11;
            int i10 = iArr[eVar.a().ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                            }
                        }
                    }
                }
                f10 = c0847b2.f4592d - f17;
                f15 -= f10;
                matrix.preTranslate(c0847b.f4589a, c0847b.f4590b);
                matrix.preScale(max, max);
                matrix.preTranslate(f14, f15);
            }
            f10 = (c0847b2.f4592d - f17) / 2.0f;
            f15 -= f10;
            matrix.preTranslate(c0847b.f4589a, c0847b.f4590b);
            matrix.preScale(max, max);
            matrix.preTranslate(f14, f15);
        }
        return matrix;
    }

    private void o0(g.C0849d c0849d) {
        y("Circle render", new Object[0]);
        g.C0860p c0860p = c0849d.f4601q;
        if (c0860p == null || c0860p.m()) {
            return;
        }
        W0(this.f4669d, c0849d);
        if (A() && Y0()) {
            Matrix matrix = c0849d.f4622n;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            Path Y10 = Y(c0849d);
            U0(c0849d);
            r(c0849d);
            p(c0849d);
            boolean m02 = m0();
            if (this.f4669d.f4706b) {
                B(c0849d, Y10);
            }
            if (this.f4669d.f4707c) {
                C(Y10);
            }
            if (m02) {
                j0(c0849d);
            }
        }
    }

    private void p(g.K k10) {
        q(k10, k10.f4558h);
    }

    private void p0(g.C0853i c0853i) {
        y("Ellipse render", new Object[0]);
        g.C0860p c0860p = c0853i.f4615q;
        if (c0860p == null || c0853i.f4616r == null || c0860p.m() || c0853i.f4616r.m()) {
            return;
        }
        W0(this.f4669d, c0853i);
        if (A() && Y0()) {
            Matrix matrix = c0853i.f4622n;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            Path Z10 = Z(c0853i);
            U0(c0853i);
            r(c0853i);
            p(c0853i);
            boolean m02 = m0();
            if (this.f4669d.f4706b) {
                B(c0853i, Z10);
            }
            if (this.f4669d.f4707c) {
                C(Z10);
            }
            if (m02) {
                j0(c0853i);
            }
        }
    }

    private void q(g.K k10, g.C0847b c0847b) {
        Path j10;
        if (this.f4669d.f4705a.f4507E == null || (j10 = j(k10, c0847b)) == null) {
            return;
        }
        this.f4666a.clipPath(j10);
    }

    private void q0(g.C0857m c0857m) {
        y("Group render", new Object[0]);
        W0(this.f4669d, c0857m);
        if (A()) {
            Matrix matrix = c0857m.f4623o;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            p(c0857m);
            boolean m02 = m0();
            F0(c0857m, true);
            if (m02) {
                j0(c0857m);
            }
            U0(c0857m);
        }
    }

    private void r(g.K k10) {
        g.O o10 = this.f4669d.f4705a.f4517b;
        if (o10 instanceof g.C0865u) {
            z(true, k10.f4558h, (g.C0865u) o10);
        }
        g.O o11 = this.f4669d.f4705a.f4520e;
        if (o11 instanceof g.C0865u) {
            z(false, k10.f4558h, (g.C0865u) o11);
        }
    }

    private void r0(g.C0859o c0859o) {
        g.C0860p c0860p;
        String str;
        y("Image render", new Object[0]);
        g.C0860p c0860p2 = c0859o.f4627s;
        if (c0860p2 == null || c0860p2.m() || (c0860p = c0859o.f4628t) == null || c0860p.m() || (str = c0859o.f4624p) == null) {
            return;
        }
        J2.e eVar = c0859o.f4570o;
        if (eVar == null) {
            eVar = J2.e.f4474e;
        }
        Bitmap s10 = s(str);
        if (s10 == null) {
            J2.g.k();
            return;
        }
        g.C0847b c0847b = new g.C0847b(0.0f, 0.0f, s10.getWidth(), s10.getHeight());
        W0(this.f4669d, c0859o);
        if (A() && Y0()) {
            Matrix matrix = c0859o.f4629u;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            g.C0860p c0860p3 = c0859o.f4625q;
            float i10 = c0860p3 != null ? c0860p3.i(this) : 0.0f;
            g.C0860p c0860p4 = c0859o.f4626r;
            this.f4669d.f4710f = new g.C0847b(i10, c0860p4 != null ? c0860p4.k(this) : 0.0f, c0859o.f4627s.i(this), c0859o.f4628t.i(this));
            if (!this.f4669d.f4705a.f4537v.booleanValue()) {
                g.C0847b c0847b2 = this.f4669d.f4710f;
                O0(c0847b2.f4589a, c0847b2.f4590b, c0847b2.f4591c, c0847b2.f4592d);
            }
            c0859o.f4558h = this.f4669d.f4710f;
            U0(c0859o);
            p(c0859o);
            boolean m02 = m0();
            X0();
            this.f4666a.save();
            this.f4666a.concat(o(this.f4669d.f4710f, c0847b, eVar));
            this.f4666a.drawBitmap(s10, 0.0f, 0.0f, new Paint(this.f4669d.f4705a.f4515Y != g.E.e.optimizeSpeed ? 2 : 0));
            this.f4666a.restore();
            if (m02) {
                j0(c0859o);
            }
        }
    }

    private Bitmap s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    private void s0(g.C0861q c0861q) {
        y("Line render", new Object[0]);
        W0(this.f4669d, c0861q);
        if (A() && Y0() && this.f4669d.f4707c) {
            Matrix matrix = c0861q.f4622n;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            Path a02 = a0(c0861q);
            U0(c0861q);
            r(c0861q);
            p(c0861q);
            boolean m02 = m0();
            C(a02);
            I0(c0861q);
            if (m02) {
                j0(c0861q);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r6.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Typeface t(String str, Integer num, g.E.b bVar) {
        char c10 = 2;
        boolean z10 = bVar == g.E.b.Italic;
        int i10 = num.intValue() > 500 ? z10 ? 3 : 1 : z10 ? 2 : 0;
        str.hashCode();
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1081737434:
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
        }
        return Typeface.create(Typeface.SANS_SERIF, i10);
    }

    private void t0(g.C0866v c0866v) {
        y("Path render", new Object[0]);
        if (c0866v.f4650o == null) {
            return;
        }
        W0(this.f4669d, c0866v);
        if (A() && Y0()) {
            C0094h c0094h = this.f4669d;
            if (c0094h.f4707c || c0094h.f4706b) {
                Matrix matrix = c0866v.f4622n;
                if (matrix != null) {
                    this.f4666a.concat(matrix);
                }
                Path f10 = new d(c0866v.f4650o).f();
                if (c0866v.f4558h == null) {
                    c0866v.f4558h = m(f10);
                }
                U0(c0866v);
                r(c0866v);
                p(c0866v);
                boolean m02 = m0();
                if (this.f4669d.f4706b) {
                    f10.setFillType(U());
                    B(c0866v, f10);
                }
                if (this.f4669d.f4707c) {
                    C(f10);
                }
                I0(c0866v);
                if (m02) {
                    j0(c0866v);
                }
            }
        }
    }

    private void u(g.N n10) {
        Boolean bool;
        if ((n10 instanceof g.L) && (bool = ((g.L) n10).f4560d) != null) {
            this.f4669d.f4712h = bool.booleanValue();
        }
    }

    private void u0(g.C0870z c0870z) {
        y("PolyLine render", new Object[0]);
        W0(this.f4669d, c0870z);
        if (A() && Y0()) {
            C0094h c0094h = this.f4669d;
            if (c0094h.f4707c || c0094h.f4706b) {
                Matrix matrix = c0870z.f4622n;
                if (matrix != null) {
                    this.f4666a.concat(matrix);
                }
                if (c0870z.f4664o.length < 2) {
                    return;
                }
                Path b02 = b0(c0870z);
                U0(c0870z);
                b02.setFillType(U());
                r(c0870z);
                p(c0870z);
                boolean m02 = m0();
                if (this.f4669d.f4706b) {
                    B(c0870z, b02);
                }
                if (this.f4669d.f4707c) {
                    C(b02);
                }
                I0(c0870z);
                if (m02) {
                    j0(c0870z);
                }
            }
        }
    }

    private static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private void v0(g.A a10) {
        y("Polygon render", new Object[0]);
        W0(this.f4669d, a10);
        if (A() && Y0()) {
            C0094h c0094h = this.f4669d;
            if (c0094h.f4707c || c0094h.f4706b) {
                Matrix matrix = a10.f4622n;
                if (matrix != null) {
                    this.f4666a.concat(matrix);
                }
                if (a10.f4664o.length < 2) {
                    return;
                }
                Path b02 = b0(a10);
                U0(a10);
                r(a10);
                p(a10);
                boolean m02 = m0();
                if (this.f4669d.f4706b) {
                    B(a10, b02);
                }
                if (this.f4669d.f4707c) {
                    C(b02);
                }
                I0(a10);
                if (m02) {
                    j0(a10);
                }
            }
        }
    }

    private static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    private void w0(g.B b10) {
        y("Rect render", new Object[0]);
        g.C0860p c0860p = b10.f4498q;
        if (c0860p == null || b10.f4499r == null || c0860p.m() || b10.f4499r.m()) {
            return;
        }
        W0(this.f4669d, b10);
        if (A() && Y0()) {
            Matrix matrix = b10.f4622n;
            if (matrix != null) {
                this.f4666a.concat(matrix);
            }
            Path c02 = c0(b10);
            U0(b10);
            r(b10);
            p(b10);
            boolean m02 = m0();
            if (this.f4669d.f4706b) {
                B(b10, c02);
            }
            if (this.f4669d.f4707c) {
                C(c02);
            }
            if (m02) {
                j0(b10);
            }
        }
    }

    private static int x(int i10, float f10) {
        int i11 = 255;
        int round = Math.round(((i10 >> 24) & 255) * f10);
        if (round < 0) {
            i11 = 0;
        } else if (round <= 255) {
            i11 = round;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    private void x0(g.F f10) {
        z0(f10, f0(f10.f4542q, f10.f4543r, f10.f4544s, f10.f4545t), f10.f4576p, f10.f4570o);
    }

    private void y0(g.F f10, g.C0847b c0847b) {
        z0(f10, c0847b, f10.f4576p, f10.f4570o);
    }

    private void z(boolean z10, g.C0847b c0847b, g.C0865u c0865u) {
        g.N r10 = this.f4668c.r(c0865u.f4648a);
        if (r10 == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", c0865u.f4648a);
            g.O o10 = c0865u.f4649b;
            if (o10 != null) {
                P0(this.f4669d, z10, o10);
                return;
            } else if (z10) {
                this.f4669d.f4706b = false;
                return;
            } else {
                this.f4669d.f4707c = false;
                return;
            }
        }
        if (r10 instanceof g.M) {
            X(z10, c0847b, (g.M) r10);
        } else if (r10 instanceof g.Q) {
            e0(z10, c0847b, (g.Q) r10);
        } else if (r10 instanceof g.C) {
            Q0(z10, (g.C) r10);
        }
    }

    private void z0(g.F f10, g.C0847b c0847b, g.C0847b c0847b2, J2.e eVar) {
        y("Svg render", new Object[0]);
        if (c0847b.f4591c == 0.0f || c0847b.f4592d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f10.f4570o) == null) {
            eVar = J2.e.f4474e;
        }
        W0(this.f4669d, f10);
        if (A()) {
            C0094h c0094h = this.f4669d;
            c0094h.f4710f = c0847b;
            if (!c0094h.f4705a.f4537v.booleanValue()) {
                g.C0847b c0847b3 = this.f4669d.f4710f;
                O0(c0847b3.f4589a, c0847b3.f4590b, c0847b3.f4591c, c0847b3.f4592d);
            }
            q(f10, this.f4669d.f4710f);
            if (c0847b2 != null) {
                this.f4666a.concat(o(this.f4669d.f4710f, c0847b2, eVar));
                this.f4669d.f4711g = f10.f4576p;
            } else {
                Canvas canvas = this.f4666a;
                g.C0847b c0847b4 = this.f4669d.f4710f;
                canvas.translate(c0847b4.f4589a, c0847b4.f4590b);
            }
            boolean m02 = m0();
            X0();
            F0(f10, true);
            if (m02) {
                j0(f10);
            }
            U0(f10);
        }
    }

    void G0(J2.g gVar, J2.f fVar) {
        g.C0847b c0847b;
        J2.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f4668c = gVar;
        g.F m10 = gVar.m();
        if (m10 == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.d()) {
            g.L j10 = this.f4668c.j(fVar.f4487e);
            if (j10 == null || !(j10 instanceof g.f0)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f4487e));
                return;
            }
            g.f0 f0Var = (g.f0) j10;
            c0847b = f0Var.f4576p;
            if (c0847b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f4487e));
                return;
            }
            eVar = f0Var.f4570o;
        } else {
            c0847b = fVar.e() ? fVar.f4486d : m10.f4576p;
            eVar = fVar.b() ? fVar.f4484b : m10.f4570o;
        }
        if (fVar.a()) {
            gVar.a(fVar.f4483a);
        }
        if (fVar.c()) {
            b.q qVar = new b.q();
            this.f4673h = qVar;
            qVar.f4459a = gVar.j(fVar.f4485c);
        }
        N0();
        u(m10);
        S0();
        g.C0847b c0847b2 = new g.C0847b(fVar.f4488f);
        g.C0860p c0860p = m10.f4544s;
        if (c0860p != null) {
            c0847b2.f4591c = c0860p.h(this, c0847b2.f4591c);
        }
        g.C0860p c0860p2 = m10.f4545t;
        if (c0860p2 != null) {
            c0847b2.f4592d = c0860p2.h(this, c0847b2.f4592d);
        }
        z0(m10, c0847b2, c0847b, eVar);
        R0();
        if (fVar.a()) {
            gVar.b();
        }
    }

    float Q() {
        return this.f4669d.f4708d.getTextSize();
    }

    float R() {
        return this.f4669d.f4708d.getTextSize() / 2.0f;
    }

    g.C0847b S() {
        C0094h c0094h = this.f4669d;
        g.C0847b c0847b = c0094h.f4711g;
        return c0847b != null ? c0847b : c0094h.f4710f;
    }

    float T() {
        return this.f4667b;
    }

    private class k extends j {

        /* renamed from: b, reason: collision with root package name */
        float f4719b;

        private k() {
            super(h.this, null);
            this.f4719b = 0.0f;
        }

        @Override // J2.h.j
        public void b(String str) {
            this.f4719b += h.this.f4669d.f4708d.measureText(str);
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* renamed from: J2.h$h, reason: collision with other inner class name */
    private class C0094h {

        /* renamed from: a, reason: collision with root package name */
        g.E f4705a;

        /* renamed from: b, reason: collision with root package name */
        boolean f4706b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4707c;

        /* renamed from: d, reason: collision with root package name */
        Paint f4708d;

        /* renamed from: e, reason: collision with root package name */
        Paint f4709e;

        /* renamed from: f, reason: collision with root package name */
        g.C0847b f4710f;

        /* renamed from: g, reason: collision with root package name */
        g.C0847b f4711g;

        /* renamed from: h, reason: collision with root package name */
        boolean f4712h;

        C0094h() {
            Paint paint = new Paint();
            this.f4708d = paint;
            paint.setFlags(193);
            this.f4708d.setHinting(0);
            this.f4708d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f4708d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f4709e = paint3;
            paint3.setFlags(193);
            this.f4709e.setHinting(0);
            this.f4709e.setStyle(Paint.Style.STROKE);
            this.f4709e.setTypeface(typeface);
            this.f4705a = g.E.a();
        }

        C0094h(C0094h c0094h) {
            this.f4706b = c0094h.f4706b;
            this.f4707c = c0094h.f4707c;
            this.f4708d = new Paint(c0094h.f4708d);
            this.f4709e = new Paint(c0094h.f4709e);
            g.C0847b c0847b = c0094h.f4710f;
            if (c0847b != null) {
                this.f4710f = new g.C0847b(c0847b);
            }
            g.C0847b c0847b2 = c0094h.f4711g;
            if (c0847b2 != null) {
                this.f4711g = new g.C0847b(c0847b2);
            }
            this.f4712h = c0094h.f4712h;
            try {
                this.f4705a = (g.E) c0094h.f4705a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f4705a = g.E.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }
}
