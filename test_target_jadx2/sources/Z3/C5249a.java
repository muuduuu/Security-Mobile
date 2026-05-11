package z3;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import b3.l;
import java.util.Iterator;
import y3.C5172f;
import y3.InterfaceC5169c;
import y3.g;
import y3.o;
import y3.p;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5249a implements B3.c {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f45695a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f45696b;

    /* renamed from: c, reason: collision with root package name */
    private C5252d f45697c;

    /* renamed from: d, reason: collision with root package name */
    private final C5251c f45698d;

    /* renamed from: e, reason: collision with root package name */
    private final C5172f f45699e;

    /* renamed from: f, reason: collision with root package name */
    private final g f45700f;

    C5249a(C5250b c5250b) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f45695a = colorDrawable;
        if (n4.b.d()) {
            n4.b.a("GenericDraweeHierarchy()");
        }
        this.f45696b = c5250b.o();
        this.f45697c = c5250b.r();
        g gVar = new g(colorDrawable);
        this.f45700f = gVar;
        int i10 = 1;
        int size = c5250b.i() != null ? c5250b.i().size() : 1;
        int i11 = (size == 0 ? 1 : size) + (c5250b.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i11 + 6];
        drawableArr[0] = h(c5250b.e(), null);
        drawableArr[1] = h(c5250b.j(), c5250b.k());
        drawableArr[2] = g(gVar, c5250b.d(), c5250b.c(), c5250b.b());
        drawableArr[3] = h(c5250b.m(), c5250b.n());
        drawableArr[4] = h(c5250b.p(), c5250b.q());
        drawableArr[5] = h(c5250b.g(), c5250b.h());
        if (i11 > 0) {
            if (c5250b.i() != null) {
                Iterator it = c5250b.i().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    drawableArr[i10 + 6] = h((Drawable) it.next(), null);
                    i10++;
                }
            }
            if (c5250b.l() != null) {
                drawableArr[i10 + 6] = h(c5250b.l(), null);
            }
        }
        C5172f c5172f = new C5172f(drawableArr, false, 2);
        this.f45699e = c5172f;
        c5172f.u(c5250b.f());
        C5251c c5251c = new C5251c(AbstractC5253e.e(c5172f, this.f45697c));
        this.f45698d = c5251c;
        c5251c.mutate();
        s();
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    private Drawable g(Drawable drawable, p.b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return AbstractC5253e.g(drawable, bVar, pointF);
    }

    private Drawable h(Drawable drawable, p.b bVar) {
        return AbstractC5253e.f(AbstractC5253e.d(drawable, this.f45697c, this.f45696b), bVar);
    }

    private void i(int i10) {
        if (i10 >= 0) {
            this.f45699e.k(i10);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i10) {
        if (i10 >= 0) {
            this.f45699e.l(i10);
        }
    }

    private InterfaceC5169c n(int i10) {
        InterfaceC5169c c10 = this.f45699e.c(i10);
        c10.s();
        return c10.s() instanceof o ? (o) c10.s() : c10;
    }

    private o p(int i10) {
        InterfaceC5169c n10 = n(i10);
        return n10 instanceof o ? (o) n10 : AbstractC5253e.k(n10, p.b.f45285a);
    }

    private boolean q(int i10) {
        return n(i10) instanceof o;
    }

    private void r() {
        this.f45700f.l(this.f45695a);
    }

    private void s() {
        C5172f c5172f = this.f45699e;
        if (c5172f != null) {
            c5172f.f();
            this.f45699e.j();
            j();
            i(1);
            this.f45699e.n();
            this.f45699e.i();
        }
    }

    private void v(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f45699e.e(i10, null);
        } else {
            n(i10).l(AbstractC5253e.d(drawable, this.f45697c, this.f45696b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y(float f10) {
        Drawable b10 = this.f45699e.b(3);
        if (b10 == 0) {
            return;
        }
        if (f10 >= 0.999f) {
            if (b10 instanceof Animatable) {
                ((Animatable) b10).stop();
            }
            k(3);
        } else {
            if (b10 instanceof Animatable) {
                ((Animatable) b10).start();
            }
            i(3);
        }
        b10.setLevel(Math.round(f10 * 10000.0f));
    }

    public void A(C5252d c5252d) {
        this.f45697c = c5252d;
        AbstractC5253e.j(this.f45698d, c5252d);
        for (int i10 = 0; i10 < this.f45699e.d(); i10++) {
            AbstractC5253e.i(n(i10), this.f45697c, this.f45696b);
        }
    }

    @Override // B3.c
    public void a(Drawable drawable) {
        this.f45698d.x(drawable);
    }

    @Override // B3.c
    public void b(Throwable th) {
        this.f45699e.f();
        j();
        if (this.f45699e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f45699e.i();
    }

    @Override // B3.c
    public void c(Throwable th) {
        this.f45699e.f();
        j();
        if (this.f45699e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f45699e.i();
    }

    @Override // B3.c
    public void d(float f10, boolean z10) {
        if (this.f45699e.b(3) == null) {
            return;
        }
        this.f45699e.f();
        y(f10);
        if (z10) {
            this.f45699e.n();
        }
        this.f45699e.i();
    }

    @Override // B3.b
    public Drawable e() {
        return this.f45698d;
    }

    @Override // B3.c
    public void f(Drawable drawable, float f10, boolean z10) {
        Drawable d10 = AbstractC5253e.d(drawable, this.f45697c, this.f45696b);
        d10.mutate();
        this.f45700f.l(d10);
        this.f45699e.f();
        j();
        i(2);
        y(f10);
        if (z10) {
            this.f45699e.n();
        }
        this.f45699e.i();
    }

    @Override // B3.b
    public Rect getBounds() {
        return this.f45698d.getBounds();
    }

    public PointF l() {
        if (q(2)) {
            return p(2).z();
        }
        return null;
    }

    public p.b m() {
        if (q(2)) {
            return p(2).A();
        }
        return null;
    }

    public C5252d o() {
        return this.f45697c;
    }

    @Override // B3.c
    public void reset() {
        r();
        s();
    }

    public void t(p.b bVar) {
        l.g(bVar);
        p(2).C(bVar);
    }

    public void u(Drawable drawable) {
        v(0, drawable);
    }

    public void w(int i10) {
        this.f45699e.u(i10);
    }

    public void x(Drawable drawable, p.b bVar) {
        v(1, drawable);
        p(1).C(bVar);
    }

    public void z(Drawable drawable) {
        v(3, drawable);
    }
}
