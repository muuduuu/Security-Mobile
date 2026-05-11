package C3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import b3.j;
import b3.l;
import c3.AbstractC1721a;
import u3.C4866c;
import y3.s;
import y3.t;

/* loaded from: classes.dex */
public class b implements t {

    /* renamed from: d, reason: collision with root package name */
    private B3.b f877d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f874a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f875b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f876c = true;

    /* renamed from: e, reason: collision with root package name */
    private B3.a f878e = null;

    /* renamed from: f, reason: collision with root package name */
    private final C4866c f879f = C4866c.a();

    public b(B3.b bVar) {
        if (bVar != null) {
            p(bVar);
        }
    }

    private void a() {
        if (this.f874a) {
            return;
        }
        this.f879f.b(C4866c.a.ON_ATTACH_CONTROLLER);
        this.f874a = true;
        B3.a aVar = this.f878e;
        if (aVar == null || aVar.c() == null) {
            return;
        }
        this.f878e.g();
    }

    private void c() {
        if (this.f875b && this.f876c) {
            a();
        } else {
            e();
        }
    }

    public static b d(B3.b bVar, Context context) {
        b bVar2 = new b(bVar);
        bVar2.m(context);
        return bVar2;
    }

    private void e() {
        if (this.f874a) {
            this.f879f.b(C4866c.a.ON_DETACH_CONTROLLER);
            this.f874a = false;
            if (i()) {
                this.f878e.b();
            }
        }
    }

    private void q(t tVar) {
        Object h10 = h();
        if (h10 instanceof s) {
            ((s) h10).d(tVar);
        }
    }

    @Override // y3.t
    public void b(boolean z10) {
        if (this.f876c == z10) {
            return;
        }
        this.f879f.b(z10 ? C4866c.a.ON_DRAWABLE_SHOW : C4866c.a.ON_DRAWABLE_HIDE);
        this.f876c = z10;
        c();
    }

    public B3.a f() {
        return this.f878e;
    }

    public B3.b g() {
        return (B3.b) l.g(this.f877d);
    }

    public Drawable h() {
        B3.b bVar = this.f877d;
        if (bVar == null) {
            return null;
        }
        return bVar.e();
    }

    public boolean i() {
        B3.a aVar = this.f878e;
        return aVar != null && aVar.c() == this.f877d;
    }

    public void j() {
        this.f879f.b(C4866c.a.ON_HOLDER_ATTACH);
        this.f875b = true;
        c();
    }

    public void k() {
        this.f879f.b(C4866c.a.ON_HOLDER_DETACH);
        this.f875b = false;
        c();
    }

    public boolean l(MotionEvent motionEvent) {
        if (i()) {
            return this.f878e.d(motionEvent);
        }
        return false;
    }

    public void n() {
        o(null);
    }

    public void o(B3.a aVar) {
        boolean z10 = this.f874a;
        if (z10) {
            e();
        }
        if (i()) {
            this.f879f.b(C4866c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f878e.f(null);
        }
        this.f878e = aVar;
        if (aVar != null) {
            this.f879f.b(C4866c.a.ON_SET_CONTROLLER);
            this.f878e.f(this.f877d);
        } else {
            this.f879f.b(C4866c.a.ON_CLEAR_CONTROLLER);
        }
        if (z10) {
            a();
        }
    }

    @Override // y3.t
    public void onDraw() {
        if (this.f874a) {
            return;
        }
        AbstractC1721a.H(C4866c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f878e)), toString());
        this.f875b = true;
        this.f876c = true;
        c();
    }

    public void p(B3.b bVar) {
        this.f879f.b(C4866c.a.ON_SET_HIERARCHY);
        boolean i10 = i();
        q(null);
        B3.b bVar2 = (B3.b) l.g(bVar);
        this.f877d = bVar2;
        Drawable e10 = bVar2.e();
        b(e10 == null || e10.isVisible());
        q(this);
        if (i10) {
            this.f878e.f(bVar);
        }
    }

    public String toString() {
        return j.c(this).c("controllerAttached", this.f874a).c("holderAttached", this.f875b).c("drawableVisible", this.f876c).b("events", this.f879f.toString()).toString();
    }

    public void m(Context context) {
    }
}
