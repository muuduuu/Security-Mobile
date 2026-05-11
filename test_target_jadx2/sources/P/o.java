package p;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import androidx.lifecycle.S;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p.C3781a;
import p.n;

/* loaded from: classes.dex */
public class o extends S {

    /* renamed from: A, reason: collision with root package name */
    private C1607y f38150A;

    /* renamed from: b, reason: collision with root package name */
    private Executor f38151b;

    /* renamed from: c, reason: collision with root package name */
    private n.a f38152c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f38153d;

    /* renamed from: e, reason: collision with root package name */
    private n.d f38154e;

    /* renamed from: f, reason: collision with root package name */
    private n.c f38155f;

    /* renamed from: g, reason: collision with root package name */
    private C3781a f38156g;

    /* renamed from: h, reason: collision with root package name */
    private p f38157h;

    /* renamed from: i, reason: collision with root package name */
    private DialogInterface.OnClickListener f38158i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f38159j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f38161l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f38162m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f38163n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f38164o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f38165p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f38166q;

    /* renamed from: r, reason: collision with root package name */
    private C1607y f38167r;

    /* renamed from: s, reason: collision with root package name */
    private C1607y f38168s;

    /* renamed from: t, reason: collision with root package name */
    private C1607y f38169t;

    /* renamed from: u, reason: collision with root package name */
    private C1607y f38170u;

    /* renamed from: v, reason: collision with root package name */
    private C1607y f38171v;

    /* renamed from: x, reason: collision with root package name */
    private C1607y f38173x;

    /* renamed from: z, reason: collision with root package name */
    private C1607y f38175z;

    /* renamed from: k, reason: collision with root package name */
    private int f38160k = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f38172w = true;

    /* renamed from: y, reason: collision with root package name */
    private int f38174y = 0;

    class a extends n.a {
        a() {
        }
    }

    private static final class b extends C3781a.d {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f38177a;

        b(o oVar) {
            this.f38177a = new WeakReference(oVar);
        }

        @Override // p.C3781a.d
        void a(int i10, CharSequence charSequence) {
            if (this.f38177a.get() == null || ((o) this.f38177a.get()).A() || !((o) this.f38177a.get()).y()) {
                return;
            }
            ((o) this.f38177a.get()).I(new C3783c(i10, charSequence));
        }

        @Override // p.C3781a.d
        void b() {
            if (this.f38177a.get() == null || !((o) this.f38177a.get()).y()) {
                return;
            }
            ((o) this.f38177a.get()).J(true);
        }

        @Override // p.C3781a.d
        void c(CharSequence charSequence) {
            if (this.f38177a.get() != null) {
                ((o) this.f38177a.get()).K(charSequence);
            }
        }

        @Override // p.C3781a.d
        void d(n.b bVar) {
            if (this.f38177a.get() == null || !((o) this.f38177a.get()).y()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new n.b(bVar.b(), ((o) this.f38177a.get()).s());
            }
            ((o) this.f38177a.get()).L(bVar);
        }
    }

    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f38178a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f38178a.post(runnable);
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f38179a;

        d(o oVar) {
            this.f38179a = new WeakReference(oVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f38179a.get() != null) {
                ((o) this.f38179a.get()).a0(true);
            }
        }
    }

    private static void f0(C1607y c1607y, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c1607y.o(obj);
        } else {
            c1607y.m(obj);
        }
    }

    boolean A() {
        return this.f38163n;
    }

    boolean B() {
        return this.f38164o;
    }

    AbstractC1604v C() {
        if (this.f38173x == null) {
            this.f38173x = new C1607y();
        }
        return this.f38173x;
    }

    boolean D() {
        return this.f38172w;
    }

    boolean E() {
        return this.f38165p;
    }

    AbstractC1604v F() {
        if (this.f38171v == null) {
            this.f38171v = new C1607y();
        }
        return this.f38171v;
    }

    boolean G() {
        return this.f38161l;
    }

    boolean H() {
        return this.f38166q;
    }

    void I(C3783c c3783c) {
        if (this.f38168s == null) {
            this.f38168s = new C1607y();
        }
        f0(this.f38168s, c3783c);
    }

    void J(boolean z10) {
        if (this.f38170u == null) {
            this.f38170u = new C1607y();
        }
        f0(this.f38170u, Boolean.valueOf(z10));
    }

    void K(CharSequence charSequence) {
        if (this.f38169t == null) {
            this.f38169t = new C1607y();
        }
        f0(this.f38169t, charSequence);
    }

    void L(n.b bVar) {
        if (this.f38167r == null) {
            this.f38167r = new C1607y();
        }
        f0(this.f38167r, bVar);
    }

    void M(boolean z10) {
        this.f38162m = z10;
    }

    void N(int i10) {
        this.f38160k = i10;
    }

    void O(AbstractActivityC1577t abstractActivityC1577t) {
        this.f38153d = new WeakReference(abstractActivityC1577t);
    }

    void P(n.a aVar) {
        this.f38152c = aVar;
    }

    void Q(Executor executor) {
        this.f38151b = executor;
    }

    void R(boolean z10) {
        this.f38163n = z10;
    }

    void S(n.c cVar) {
        this.f38155f = cVar;
    }

    void T(boolean z10) {
        this.f38164o = z10;
    }

    void U(boolean z10) {
        if (this.f38173x == null) {
            this.f38173x = new C1607y();
        }
        f0(this.f38173x, Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(boolean z10) {
        this.f38172w = z10;
    }

    void W(CharSequence charSequence) {
        if (this.f38150A == null) {
            this.f38150A = new C1607y();
        }
        f0(this.f38150A, charSequence);
    }

    void X(int i10) {
        this.f38174y = i10;
    }

    void Y(int i10) {
        if (this.f38175z == null) {
            this.f38175z = new C1607y();
        }
        f0(this.f38175z, Integer.valueOf(i10));
    }

    void Z(boolean z10) {
        this.f38165p = z10;
    }

    void a0(boolean z10) {
        if (this.f38171v == null) {
            this.f38171v = new C1607y();
        }
        f0(this.f38171v, Boolean.valueOf(z10));
    }

    void b0(CharSequence charSequence) {
        this.f38159j = charSequence;
    }

    void c0(n.d dVar) {
        this.f38154e = dVar;
    }

    void d0(boolean z10) {
        this.f38161l = z10;
    }

    int e() {
        n.d dVar = this.f38154e;
        if (dVar != null) {
            return AbstractC3782b.c(dVar, this.f38155f);
        }
        return 0;
    }

    void e0(boolean z10) {
        this.f38166q = z10;
    }

    C3781a f() {
        if (this.f38156g == null) {
            this.f38156g = new C3781a(new b(this));
        }
        return this.f38156g;
    }

    C1607y g() {
        if (this.f38168s == null) {
            this.f38168s = new C1607y();
        }
        return this.f38168s;
    }

    AbstractC1604v h() {
        if (this.f38169t == null) {
            this.f38169t = new C1607y();
        }
        return this.f38169t;
    }

    AbstractC1604v i() {
        if (this.f38167r == null) {
            this.f38167r = new C1607y();
        }
        return this.f38167r;
    }

    int j() {
        return this.f38160k;
    }

    p k() {
        if (this.f38157h == null) {
            this.f38157h = new p();
        }
        return this.f38157h;
    }

    n.a l() {
        if (this.f38152c == null) {
            this.f38152c = new a();
        }
        return this.f38152c;
    }

    Executor m() {
        Executor executor = this.f38151b;
        return executor != null ? executor : new c();
    }

    n.c n() {
        return this.f38155f;
    }

    CharSequence o() {
        n.d dVar = this.f38154e;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    AbstractC1604v p() {
        if (this.f38150A == null) {
            this.f38150A = new C1607y();
        }
        return this.f38150A;
    }

    int q() {
        return this.f38174y;
    }

    AbstractC1604v r() {
        if (this.f38175z == null) {
            this.f38175z = new C1607y();
        }
        return this.f38175z;
    }

    int s() {
        int e10 = e();
        return (!AbstractC3782b.e(e10) || AbstractC3782b.d(e10)) ? -1 : 2;
    }

    DialogInterface.OnClickListener t() {
        if (this.f38158i == null) {
            this.f38158i = new d(this);
        }
        return this.f38158i;
    }

    CharSequence u() {
        CharSequence charSequence = this.f38159j;
        if (charSequence != null) {
            return charSequence;
        }
        n.d dVar = this.f38154e;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence v() {
        n.d dVar = this.f38154e;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence w() {
        n.d dVar = this.f38154e;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    AbstractC1604v x() {
        if (this.f38170u == null) {
            this.f38170u = new C1607y();
        }
        return this.f38170u;
    }

    boolean y() {
        return this.f38162m;
    }

    boolean z() {
        n.d dVar = this.f38154e;
        return dVar == null || dVar.f();
    }
}
