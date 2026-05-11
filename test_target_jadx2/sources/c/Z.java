package C;

import A.AbstractC0700h0;
import C.f0;
import android.util.Log;
import androidx.camera.core.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Z implements e.a, f0.a {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC0745x f652b;

    /* renamed from: c, reason: collision with root package name */
    C0746y f653c;

    /* renamed from: d, reason: collision with root package name */
    private T f654d;

    /* renamed from: e, reason: collision with root package name */
    private final List f655e;

    /* renamed from: a, reason: collision with root package name */
    final Deque f651a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    boolean f656f = false;

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0734l f657a;

        a(C0734l c0734l) {
            this.f657a = c0734l;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            Z.this.f652b.c();
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (this.f657a.b()) {
                return;
            }
            int f10 = ((androidx.camera.core.impl.T) this.f657a.a().get(0)).f();
            if (th instanceof A.X) {
                Z.this.f653c.j(b.c(f10, (A.X) th));
            } else {
                Z.this.f653c.j(b.c(f10, new A.X(2, "Failed to submit capture request", th)));
            }
            Z.this.f652b.c();
        }
    }

    static abstract class b {
        b() {
        }

        static b c(int i10, A.X x10) {
            return new C0729g(i10, x10);
        }

        abstract A.X a();

        abstract int b();
    }

    public Z(InterfaceC0745x interfaceC0745x) {
        E.q.a();
        this.f652b = interfaceC0745x;
        this.f655e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f654d = null;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(T t10) {
        this.f655e.remove(t10);
    }

    private h8.d n(C0734l c0734l) {
        E.q.a();
        this.f652b.b();
        h8.d a10 = this.f652b.a(c0734l.a());
        G.n.j(a10, new a(c0734l), F.c.e());
        return a10;
    }

    private void o(final T t10) {
        y0.f.i(!f());
        this.f654d = t10;
        t10.m().e(new Runnable() { // from class: C.W
            @Override // java.lang.Runnable
            public final void run() {
                Z.this.h();
            }
        }, F.c.b());
        this.f655e.add(t10);
        t10.n().e(new Runnable() { // from class: C.X
            @Override // java.lang.Runnable
            public final void run() {
                Z.this.i(t10);
            }
        }, F.c.b());
    }

    @Override // C.f0.a
    public void a(f0 f0Var) {
        E.q.a();
        AbstractC0700h0.a("TakePictureManager", "Add a new request for retrying.");
        this.f651a.addFirst(f0Var);
        g();
    }

    @Override // androidx.camera.core.e.a
    public void b(androidx.camera.core.n nVar) {
        F.c.e().execute(new Runnable() { // from class: C.Y
            @Override // java.lang.Runnable
            public final void run() {
                Z.this.g();
            }
        });
    }

    public void e() {
        E.q.a();
        A.X x10 = new A.X(3, "Camera is closed.", null);
        Iterator it = this.f651a.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).x(x10);
        }
        this.f651a.clear();
        Iterator it2 = new ArrayList(this.f655e).iterator();
        while (it2.hasNext()) {
            ((T) it2.next()).j(x10);
        }
    }

    boolean f() {
        return this.f654d != null;
    }

    void g() {
        E.q.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (f()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f656f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f653c.h() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        f0 f0Var = (f0) this.f651a.poll();
        if (f0Var == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        T t10 = new T(f0Var, this);
        o(t10);
        y0.c e10 = this.f653c.e(f0Var, t10, t10.m());
        C0734l c0734l = (C0734l) e10.f45130a;
        Objects.requireNonNull(c0734l);
        P p10 = (P) e10.f45131b;
        Objects.requireNonNull(p10);
        this.f653c.m(p10);
        t10.s(n(c0734l));
    }

    public void j(f0 f0Var) {
        E.q.a();
        this.f651a.offer(f0Var);
        g();
    }

    public void k() {
        E.q.a();
        this.f656f = true;
        T t10 = this.f654d;
        if (t10 != null) {
            t10.k();
        }
    }

    public void l() {
        E.q.a();
        this.f656f = false;
        g();
    }

    public void m(C0746y c0746y) {
        E.q.a();
        this.f653c = c0746y;
        c0746y.k(this);
    }
}
