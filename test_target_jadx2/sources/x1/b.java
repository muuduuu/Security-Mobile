package X1;

import O1.AbstractC1034e;
import O1.C1038i;
import R1.a;
import R1.p;
import W1.i;
import X1.e;
import Z1.C1319j;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import b2.l;
import c2.C1720c;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements Q1.e, a.b, U1.f {

    /* renamed from: A, reason: collision with root package name */
    private Paint f11625A;

    /* renamed from: B, reason: collision with root package name */
    float f11626B;

    /* renamed from: C, reason: collision with root package name */
    BlurMaskFilter f11627C;

    /* renamed from: D, reason: collision with root package name */
    P1.a f11628D;

    /* renamed from: a, reason: collision with root package name */
    private final Path f11629a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f11630b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f11631c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    private final Paint f11632d = new P1.a(1);

    /* renamed from: e, reason: collision with root package name */
    private final Paint f11633e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f11634f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f11635g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f11636h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f11637i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f11638j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f11639k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f11640l;

    /* renamed from: m, reason: collision with root package name */
    private final RectF f11641m;

    /* renamed from: n, reason: collision with root package name */
    private final String f11642n;

    /* renamed from: o, reason: collision with root package name */
    final Matrix f11643o;

    /* renamed from: p, reason: collision with root package name */
    final o f11644p;

    /* renamed from: q, reason: collision with root package name */
    final e f11645q;

    /* renamed from: r, reason: collision with root package name */
    private R1.h f11646r;

    /* renamed from: s, reason: collision with root package name */
    private R1.d f11647s;

    /* renamed from: t, reason: collision with root package name */
    private b f11648t;

    /* renamed from: u, reason: collision with root package name */
    private b f11649u;

    /* renamed from: v, reason: collision with root package name */
    private List f11650v;

    /* renamed from: w, reason: collision with root package name */
    private final List f11651w;

    /* renamed from: x, reason: collision with root package name */
    public final p f11652x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f11653y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f11654z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11655a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11656b;

        static {
            int[] iArr = new int[i.a.values().length];
            f11656b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11656b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11656b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11656b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f11655a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11655a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11655a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11655a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11655a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11655a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11655a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(o oVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f11633e = new P1.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f11634f = new P1.a(1, mode2);
        P1.a aVar = new P1.a(1);
        this.f11635g = aVar;
        this.f11636h = new P1.a(PorterDuff.Mode.CLEAR);
        this.f11637i = new RectF();
        this.f11638j = new RectF();
        this.f11639k = new RectF();
        this.f11640l = new RectF();
        this.f11641m = new RectF();
        this.f11643o = new Matrix();
        this.f11651w = new ArrayList();
        this.f11653y = true;
        this.f11626B = 0.0f;
        this.f11644p = oVar;
        this.f11645q = eVar;
        this.f11642n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p b10 = eVar.x().b();
        this.f11652x = b10;
        b10.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            R1.h hVar = new R1.h(eVar.h());
            this.f11646r = hVar;
            Iterator it = hVar.a().iterator();
            while (it.hasNext()) {
                ((R1.a) it.next()).a(this);
            }
            for (R1.a aVar2 : this.f11646r.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        P();
    }

    private void C(RectF rectF, Matrix matrix) {
        this.f11639k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (A()) {
            int size = this.f11646r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                W1.i iVar = (W1.i) this.f11646r.b().get(i10);
                Path path = (Path) ((R1.a) this.f11646r.a().get(i10)).h();
                if (path != null) {
                    this.f11629a.set(path);
                    this.f11629a.transform(matrix);
                    int i11 = a.f11656b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f11629a.computeBounds(this.f11641m, false);
                    if (i10 == 0) {
                        this.f11639k.set(this.f11641m);
                    } else {
                        RectF rectF2 = this.f11639k;
                        rectF2.set(Math.min(rectF2.left, this.f11641m.left), Math.min(this.f11639k.top, this.f11641m.top), Math.max(this.f11639k.right, this.f11641m.right), Math.max(this.f11639k.bottom, this.f11641m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f11639k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D(RectF rectF, Matrix matrix) {
        if (B() && this.f11645q.i() != e.b.INVERT) {
            this.f11640l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f11648t.c(this.f11640l, matrix, true);
            if (rectF.intersect(this.f11640l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E() {
        this.f11644p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        O(this.f11647s.q() == 1.0f);
    }

    private void G(float f10) {
        this.f11644p.K().n().a(this.f11645q.j(), f10);
    }

    private void O(boolean z10) {
        if (z10 != this.f11653y) {
            this.f11653y = z10;
            E();
        }
    }

    private void P() {
        if (this.f11645q.f().isEmpty()) {
            O(true);
            return;
        }
        R1.d dVar = new R1.d(this.f11645q.f());
        this.f11647s = dVar;
        dVar.m();
        this.f11647s.a(new a.b() { // from class: X1.a
            @Override // R1.a.b
            public final void a() {
                b.this.F();
            }
        });
        O(((Float) this.f11647s.h()).floatValue() == 1.0f);
        i(this.f11647s);
    }

    private void j(Canvas canvas, Matrix matrix, R1.a aVar, R1.a aVar2) {
        this.f11629a.set((Path) aVar.h());
        this.f11629a.transform(matrix);
        this.f11632d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f11629a, this.f11632d);
    }

    private void k(Canvas canvas, Matrix matrix, R1.a aVar, R1.a aVar2) {
        l.n(canvas, this.f11637i, this.f11633e);
        this.f11629a.set((Path) aVar.h());
        this.f11629a.transform(matrix);
        this.f11632d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f11629a, this.f11632d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, R1.a aVar, R1.a aVar2) {
        l.n(canvas, this.f11637i, this.f11632d);
        canvas.drawRect(this.f11637i, this.f11632d);
        this.f11629a.set((Path) aVar.h());
        this.f11629a.transform(matrix);
        this.f11632d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f11629a, this.f11634f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, R1.a aVar, R1.a aVar2) {
        l.n(canvas, this.f11637i, this.f11633e);
        canvas.drawRect(this.f11637i, this.f11632d);
        this.f11634f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f11629a.set((Path) aVar.h());
        this.f11629a.transform(matrix);
        canvas.drawPath(this.f11629a, this.f11634f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, R1.a aVar, R1.a aVar2) {
        l.n(canvas, this.f11637i, this.f11634f);
        canvas.drawRect(this.f11637i, this.f11632d);
        this.f11634f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f11629a.set((Path) aVar.h());
        this.f11629a.transform(matrix);
        canvas.drawPath(this.f11629a, this.f11634f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("Layer#saveLayer");
        }
        l.o(canvas, this.f11637i, this.f11633e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f11646r.b().size(); i10++) {
            W1.i iVar = (W1.i) this.f11646r.b().get(i10);
            R1.a aVar = (R1.a) this.f11646r.a().get(i10);
            R1.a aVar2 = (R1.a) this.f11646r.c().get(i10);
            int i11 = a.f11656b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f11632d.setColor(-16777216);
                        this.f11632d.setAlpha(255);
                        canvas.drawRect(this.f11637i, this.f11632d);
                    }
                    if (iVar.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    m(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (q()) {
                this.f11632d.setAlpha(255);
                canvas.drawRect(this.f11637i, this.f11632d);
            }
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("Layer#restoreLayer");
        }
    }

    private void p(Canvas canvas, Matrix matrix, R1.a aVar) {
        this.f11629a.set((Path) aVar.h());
        this.f11629a.transform(matrix);
        canvas.drawPath(this.f11629a, this.f11634f);
    }

    private boolean q() {
        if (this.f11646r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f11646r.b().size(); i10++) {
            if (((W1.i) this.f11646r.b().get(i10)).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f11650v != null) {
            return;
        }
        if (this.f11649u == null) {
            this.f11650v = Collections.emptyList();
            return;
        }
        this.f11650v = new ArrayList();
        for (b bVar = this.f11649u; bVar != null; bVar = bVar.f11649u) {
            this.f11650v.add(bVar);
        }
    }

    private void s(Canvas canvas) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("Layer#clearLayer");
        }
        RectF rectF = this.f11637i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f11636h);
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("Layer#clearLayer");
        }
    }

    static b u(c cVar, e eVar, o oVar, C1038i c1038i) {
        switch (a.f11655a[eVar.g().ordinal()]) {
            case 1:
                return new g(oVar, eVar, cVar, c1038i);
            case 2:
                return new c(oVar, eVar, c1038i.o(eVar.n()), c1038i);
            case 3:
                return new h(oVar, eVar);
            case 4:
                return new d(oVar, eVar);
            case 5:
                return new f(oVar, eVar);
            case 6:
                return new i(oVar, eVar);
            default:
                b2.f.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    boolean A() {
        R1.h hVar = this.f11646r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean B() {
        return this.f11648t != null;
    }

    public void H(R1.a aVar) {
        this.f11651w.remove(aVar);
    }

    void K(b bVar) {
        this.f11648t = bVar;
    }

    void L(boolean z10) {
        if (z10 && this.f11625A == null) {
            this.f11625A = new P1.a();
        }
        this.f11654z = z10;
    }

    void M(b bVar) {
        this.f11649u = bVar;
    }

    void N(float f10) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("BaseLayer#setProgress");
            AbstractC1034e.b("BaseLayer#setProgress.transform");
        }
        this.f11652x.j(f10);
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("BaseLayer#setProgress.transform");
        }
        if (this.f11646r != null) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f11646r.a().size(); i10++) {
                ((R1.a) this.f11646r.a().get(i10)).n(f10);
            }
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f11647s != null) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.b("BaseLayer#setProgress.inout");
            }
            this.f11647s.n(f10);
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f11648t != null) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.b("BaseLayer#setProgress.matte");
            }
            this.f11648t.N(f10);
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("BaseLayer#setProgress.matte");
            }
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("BaseLayer#setProgress.animations." + this.f11651w.size());
        }
        for (int i11 = 0; i11 < this.f11651w.size(); i11++) {
            ((R1.a) this.f11651w.get(i11)).n(f10);
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("BaseLayer#setProgress.animations." + this.f11651w.size());
            AbstractC1034e.c("BaseLayer#setProgress");
        }
    }

    @Override // R1.a.b
    public void a() {
        E();
    }

    @Override // Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f11637i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f11643o.set(matrix);
        if (z10) {
            List list = this.f11650v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f11643o.preConcat(((b) this.f11650v.get(size)).f11652x.f());
                }
            } else {
                b bVar = this.f11649u;
                if (bVar != null) {
                    this.f11643o.preConcat(bVar.f11652x.f());
                }
            }
        }
        this.f11643o.preConcat(this.f11652x.f());
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b bVar = this.f11648t;
        if (bVar != null) {
            U1.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f11648t.getName(), i10)) {
                list.add(a10.i(this.f11648t));
            }
            if (eVar.h(getName(), i10)) {
                this.f11648t.I(eVar, eVar.e(this.f11648t.getName(), i10) + i10, list, a10);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                I(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer num;
        AbstractC1034e.b(this.f11642n);
        if (!this.f11653y || this.f11645q.y()) {
            AbstractC1034e.c(this.f11642n);
            return;
        }
        r();
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("Layer#parentMatrix");
        }
        this.f11630b.reset();
        this.f11630b.set(matrix);
        for (int size = this.f11650v.size() - 1; size >= 0; size--) {
            this.f11630b.preConcat(((b) this.f11650v.get(size)).f11652x.f());
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("Layer#parentMatrix");
        }
        R1.a h10 = this.f11652x.h();
        int intValue = (int) ((((i10 / 255.0f) * ((h10 == null || (num = (Integer) h10.h()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!B() && !A() && v() == W1.h.NORMAL) {
            this.f11630b.preConcat(this.f11652x.f());
            if (AbstractC1034e.h()) {
                AbstractC1034e.b("Layer#drawLayer");
            }
            t(canvas, this.f11630b, intValue);
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("Layer#drawLayer");
            }
            G(AbstractC1034e.c(this.f11642n));
            return;
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("Layer#computeBounds");
        }
        c(this.f11637i, this.f11630b, false);
        D(this.f11637i, matrix);
        this.f11630b.preConcat(this.f11652x.f());
        C(this.f11637i, this.f11630b);
        this.f11638j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f11631c);
        if (!this.f11631c.isIdentity()) {
            Matrix matrix2 = this.f11631c;
            matrix2.invert(matrix2);
            this.f11631c.mapRect(this.f11638j);
        }
        if (!this.f11637i.intersect(this.f11638j)) {
            this.f11637i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("Layer#computeBounds");
        }
        if (this.f11637i.width() >= 1.0f && this.f11637i.height() >= 1.0f) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.b("Layer#saveLayer");
            }
            this.f11632d.setAlpha(255);
            androidx.core.graphics.f.b(this.f11632d, v().toNativeBlendMode());
            l.n(canvas, this.f11637i, this.f11632d);
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("Layer#saveLayer");
            }
            if (v() != W1.h.MULTIPLY) {
                s(canvas);
            } else {
                if (this.f11628D == null) {
                    P1.a aVar = new P1.a();
                    this.f11628D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f11637i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f11628D);
            }
            if (AbstractC1034e.h()) {
                AbstractC1034e.b("Layer#drawLayer");
            }
            t(canvas, this.f11630b, intValue);
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("Layer#drawLayer");
            }
            if (A()) {
                o(canvas, this.f11630b);
            }
            if (B()) {
                if (AbstractC1034e.h()) {
                    AbstractC1034e.b("Layer#drawMatte");
                    AbstractC1034e.b("Layer#saveLayer");
                }
                l.o(canvas, this.f11637i, this.f11635g, 19);
                if (AbstractC1034e.h()) {
                    AbstractC1034e.c("Layer#saveLayer");
                }
                s(canvas);
                this.f11648t.f(canvas, matrix, intValue);
                if (AbstractC1034e.h()) {
                    AbstractC1034e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (AbstractC1034e.h()) {
                    AbstractC1034e.c("Layer#restoreLayer");
                    AbstractC1034e.c("Layer#drawMatte");
                }
            }
            if (AbstractC1034e.h()) {
                AbstractC1034e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("Layer#restoreLayer");
            }
        }
        if (this.f11654z && (paint = this.f11625A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f11625A.setColor(-251901);
            this.f11625A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f11637i, this.f11625A);
            this.f11625A.setStyle(Paint.Style.FILL);
            this.f11625A.setColor(1357638635);
            canvas.drawRect(this.f11637i, this.f11625A);
        }
        G(AbstractC1034e.c(this.f11642n));
    }

    @Override // Q1.c
    public String getName() {
        return this.f11645q.j();
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        this.f11652x.c(obj, c1720c);
    }

    public void i(R1.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f11651w.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i10);

    public W1.h v() {
        return this.f11645q.a();
    }

    public W1.a w() {
        return this.f11645q.b();
    }

    public BlurMaskFilter x(float f10) {
        if (this.f11626B == f10) {
            return this.f11627C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f11627C = blurMaskFilter;
        this.f11626B = f10;
        return blurMaskFilter;
    }

    public C1319j y() {
        return this.f11645q.d();
    }

    e z() {
        return this.f11645q;
    }

    @Override // Q1.c
    public void b(List list, List list2) {
    }

    void I(U1.e eVar, int i10, List list, U1.e eVar2) {
    }
}
