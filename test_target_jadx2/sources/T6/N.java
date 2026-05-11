package T6;

import D7.C0787k;
import S6.a;
import S6.h;
import T6.C1181k;
import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.common.api.Status;
import j0.C3476a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes2.dex */
public final class N implements h.b, h.c, D0 {

    /* renamed from: g, reason: collision with root package name */
    private final a.f f9362g;

    /* renamed from: h, reason: collision with root package name */
    private final C1163b f9363h;

    /* renamed from: i, reason: collision with root package name */
    private final A f9364i;

    /* renamed from: l, reason: collision with root package name */
    private final int f9367l;

    /* renamed from: m, reason: collision with root package name */
    private final n0 f9368m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9369n;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ C1171f f9373r;

    /* renamed from: f, reason: collision with root package name */
    private final Queue f9361f = new LinkedList();

    /* renamed from: j, reason: collision with root package name */
    private final Set f9365j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Map f9366k = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final List f9370o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private C2010b f9371p = null;

    /* renamed from: q, reason: collision with root package name */
    private int f9372q = 0;

    public N(C1171f c1171f, S6.g gVar) {
        this.f9373r = c1171f;
        a.f I10 = gVar.I(c1171f.f9431n.getLooper(), this);
        this.f9362g = I10;
        this.f9363h = gVar.C();
        this.f9364i = new A();
        this.f9367l = gVar.H();
        if (I10.s()) {
            this.f9368m = gVar.J(c1171f.f9422e, c1171f.f9431n);
        } else {
            this.f9368m = null;
        }
    }

    static /* bridge */ /* synthetic */ void A(N n10, P p10) {
        C2012d c2012d;
        C2012d[] g10;
        if (n10.f9370o.remove(p10)) {
            n10.f9373r.f9431n.removeMessages(15, p10);
            n10.f9373r.f9431n.removeMessages(16, p10);
            c2012d = p10.f9375b;
            ArrayList arrayList = new ArrayList(n10.f9361f.size());
            for (v0 v0Var : n10.f9361f) {
                if ((v0Var instanceof X) && (g10 = ((X) v0Var).g(n10)) != null && com.google.android.gms.common.util.b.b(g10, c2012d)) {
                    arrayList.add(v0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                v0 v0Var2 = (v0) arrayList.get(i10);
                n10.f9361f.remove(v0Var2);
                v0Var2.b(new S6.r(c2012d));
            }
        }
    }

    private final C2012d c(C2012d[] c2012dArr) {
        if (c2012dArr != null && c2012dArr.length != 0) {
            C2012d[] n10 = this.f9362g.n();
            if (n10 == null) {
                n10 = new C2012d[0];
            }
            C3476a c3476a = new C3476a(n10.length);
            for (C2012d c2012d : n10) {
                c3476a.put(c2012d.u(), Long.valueOf(c2012d.F()));
            }
            for (C2012d c2012d2 : c2012dArr) {
                Long l10 = (Long) c3476a.get(c2012d2.u());
                if (l10 == null || l10.longValue() < c2012d2.F()) {
                    return c2012d2;
                }
            }
        }
        return null;
    }

    private final void d(C2010b c2010b) {
        Iterator it = this.f9365j.iterator();
        if (!it.hasNext()) {
            this.f9365j.clear();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        if (AbstractC1286q.a(c2010b, C2010b.f23474f)) {
            this.f9362g.f();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        AbstractC1287s.d(this.f9373r.f9431n);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        AbstractC1287s.d(this.f9373r.f9431n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f9361f.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            if (!z10 || v0Var.f9485a == 2) {
                if (status != null) {
                    v0Var.a(status);
                } else {
                    v0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f9361f);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0Var = (v0) arrayList.get(i10);
            if (!this.f9362g.a()) {
                return;
            }
            if (m(v0Var)) {
                this.f9361f.remove(v0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        B();
        d(C2010b.f23474f);
        l();
        Iterator it = this.f9366k.values().iterator();
        while (it.hasNext()) {
            C1170e0 c1170e0 = (C1170e0) it.next();
            if (c(c1170e0.f9411a.c()) != null) {
                it.remove();
            } else {
                try {
                    c1170e0.f9411a.d(this.f9362g, new C0787k());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f9362g.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i10) {
        B();
        this.f9369n = true;
        this.f9364i.e(i10, this.f9362g.p());
        C1163b c1163b = this.f9363h;
        C1171f c1171f = this.f9373r;
        c1171f.f9431n.sendMessageDelayed(Message.obtain(c1171f.f9431n, 9, c1163b), 5000L);
        C1163b c1163b2 = this.f9363h;
        C1171f c1171f2 = this.f9373r;
        c1171f2.f9431n.sendMessageDelayed(Message.obtain(c1171f2.f9431n, 11, c1163b2), 120000L);
        this.f9373r.f9424g.c();
        Iterator it = this.f9366k.values().iterator();
        while (it.hasNext()) {
            ((C1170e0) it.next()).f9413c.run();
        }
    }

    private final void j() {
        this.f9373r.f9431n.removeMessages(12, this.f9363h);
        C1163b c1163b = this.f9363h;
        C1171f c1171f = this.f9373r;
        c1171f.f9431n.sendMessageDelayed(c1171f.f9431n.obtainMessage(12, c1163b), this.f9373r.f9418a);
    }

    private final void k(v0 v0Var) {
        v0Var.d(this.f9364i, a());
        try {
            v0Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f9362g.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f9369n) {
            C1171f c1171f = this.f9373r;
            c1171f.f9431n.removeMessages(11, this.f9363h);
            C1171f c1171f2 = this.f9373r;
            c1171f2.f9431n.removeMessages(9, this.f9363h);
            this.f9369n = false;
        }
    }

    private final boolean m(v0 v0Var) {
        if (!(v0Var instanceof X)) {
            k(v0Var);
            return true;
        }
        X x10 = (X) v0Var;
        C2012d c10 = c(x10.g(this));
        if (c10 == null) {
            k(v0Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f9362g.getClass().getName() + " could not execute call because it requires feature (" + c10.u() + ", " + c10.F() + ").");
        if (!this.f9373r.f9432o || !x10.f(this)) {
            x10.b(new S6.r(c10));
            return true;
        }
        P p10 = new P(this.f9363h, c10, null);
        int indexOf = this.f9370o.indexOf(p10);
        if (indexOf >= 0) {
            P p11 = (P) this.f9370o.get(indexOf);
            this.f9373r.f9431n.removeMessages(15, p11);
            C1171f c1171f = this.f9373r;
            c1171f.f9431n.sendMessageDelayed(Message.obtain(c1171f.f9431n, 15, p11), 5000L);
            return false;
        }
        this.f9370o.add(p10);
        C1171f c1171f2 = this.f9373r;
        c1171f2.f9431n.sendMessageDelayed(Message.obtain(c1171f2.f9431n, 15, p10), 5000L);
        C1171f c1171f3 = this.f9373r;
        c1171f3.f9431n.sendMessageDelayed(Message.obtain(c1171f3.f9431n, 16, p10), 120000L);
        C2010b c2010b = new C2010b(2, null);
        if (n(c2010b)) {
            return false;
        }
        this.f9373r.f(c2010b, this.f9367l);
        return false;
    }

    private final boolean n(C2010b c2010b) {
        synchronized (C1171f.f9416r) {
            try {
                C1171f c1171f = this.f9373r;
                if (c1171f.f9428k == null || !c1171f.f9429l.contains(this.f9363h)) {
                    return false;
                }
                this.f9373r.f9428k.s(c2010b, this.f9367l);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean o(boolean z10) {
        AbstractC1287s.d(this.f9373r.f9431n);
        if (!this.f9362g.a() || !this.f9366k.isEmpty()) {
            return false;
        }
        if (!this.f9364i.g()) {
            this.f9362g.d("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        j();
        return false;
    }

    static /* bridge */ /* synthetic */ void z(N n10, P p10) {
        if (n10.f9370o.contains(p10) && !n10.f9369n) {
            if (n10.f9362g.a()) {
                n10.g();
            } else {
                n10.C();
            }
        }
    }

    public final void B() {
        AbstractC1287s.d(this.f9373r.f9431n);
        this.f9371p = null;
    }

    public final void C() {
        AbstractC1287s.d(this.f9373r.f9431n);
        if (this.f9362g.a() || this.f9362g.e()) {
            return;
        }
        try {
            C1171f c1171f = this.f9373r;
            int b10 = c1171f.f9424g.b(c1171f.f9422e, this.f9362g);
            if (b10 == 0) {
                C1171f c1171f2 = this.f9373r;
                a.f fVar = this.f9362g;
                S s10 = new S(c1171f2, fVar, this.f9363h);
                if (fVar.s()) {
                    ((n0) AbstractC1287s.m(this.f9368m)).n1(s10);
                }
                try {
                    this.f9362g.j(s10);
                    return;
                } catch (SecurityException e10) {
                    F(new C2010b(10), e10);
                    return;
                }
            }
            C2010b c2010b = new C2010b(b10, null);
            Log.w("GoogleApiManager", "The service for " + this.f9362g.getClass().getName() + " is not available: " + c2010b.toString());
            F(c2010b, null);
        } catch (IllegalStateException e11) {
            F(new C2010b(10), e11);
        }
    }

    public final void D(v0 v0Var) {
        AbstractC1287s.d(this.f9373r.f9431n);
        if (this.f9362g.a()) {
            if (m(v0Var)) {
                j();
                return;
            } else {
                this.f9361f.add(v0Var);
                return;
            }
        }
        this.f9361f.add(v0Var);
        C2010b c2010b = this.f9371p;
        if (c2010b == null || !c2010b.y0()) {
            C();
        } else {
            F(this.f9371p, null);
        }
    }

    final void E() {
        this.f9372q++;
    }

    public final void F(C2010b c2010b, Exception exc) {
        AbstractC1287s.d(this.f9373r.f9431n);
        n0 n0Var = this.f9368m;
        if (n0Var != null) {
            n0Var.o1();
        }
        B();
        this.f9373r.f9424g.c();
        d(c2010b);
        if ((this.f9362g instanceof X6.e) && c2010b.u() != 24) {
            this.f9373r.f9419b = true;
            C1171f c1171f = this.f9373r;
            c1171f.f9431n.sendMessageDelayed(c1171f.f9431n.obtainMessage(19), 300000L);
        }
        if (c2010b.u() == 4) {
            e(C1171f.f9415q);
            return;
        }
        if (this.f9361f.isEmpty()) {
            this.f9371p = c2010b;
            return;
        }
        if (exc != null) {
            AbstractC1287s.d(this.f9373r.f9431n);
            f(null, exc, false);
            return;
        }
        if (!this.f9373r.f9432o) {
            e(C1171f.g(this.f9363h, c2010b));
            return;
        }
        f(C1171f.g(this.f9363h, c2010b), null, true);
        if (this.f9361f.isEmpty() || n(c2010b) || this.f9373r.f(c2010b, this.f9367l)) {
            return;
        }
        if (c2010b.u() == 18) {
            this.f9369n = true;
        }
        if (!this.f9369n) {
            e(C1171f.g(this.f9363h, c2010b));
            return;
        }
        C1171f c1171f2 = this.f9373r;
        c1171f2.f9431n.sendMessageDelayed(Message.obtain(c1171f2.f9431n, 9, this.f9363h), 5000L);
    }

    public final void G(C2010b c2010b) {
        AbstractC1287s.d(this.f9373r.f9431n);
        a.f fVar = this.f9362g;
        fVar.d("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c2010b));
        F(c2010b, null);
    }

    public final void H() {
        AbstractC1287s.d(this.f9373r.f9431n);
        if (this.f9369n) {
            C();
        }
    }

    public final void I() {
        AbstractC1287s.d(this.f9373r.f9431n);
        e(C1171f.f9414p);
        this.f9364i.f();
        for (C1181k.a aVar : (C1181k.a[]) this.f9366k.keySet().toArray(new C1181k.a[0])) {
            D(new u0(aVar, new C0787k()));
        }
        d(new C2010b(4));
        if (this.f9362g.a()) {
            this.f9362g.g(new M(this));
        }
    }

    public final void J() {
        AbstractC1287s.d(this.f9373r.f9431n);
        if (this.f9369n) {
            l();
            C1171f c1171f = this.f9373r;
            e(c1171f.f9423f.i(c1171f.f9422e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f9362g.d("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f9362g.s();
    }

    public final boolean b() {
        return o(true);
    }

    @Override // T6.InterfaceC1169e
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f9373r.f9431n.getLooper()) {
            h();
        } else {
            this.f9373r.f9431n.post(new J(this));
        }
    }

    @Override // T6.InterfaceC1184n
    public final void onConnectionFailed(C2010b c2010b) {
        F(c2010b, null);
    }

    @Override // T6.InterfaceC1169e
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f9373r.f9431n.getLooper()) {
            i(i10);
        } else {
            this.f9373r.f9431n.post(new K(this, i10));
        }
    }

    @Override // T6.D0
    public final void p(C2010b c2010b, S6.a aVar, boolean z10) {
        throw null;
    }

    public final int q() {
        return this.f9367l;
    }

    final int r() {
        return this.f9372q;
    }

    public final a.f t() {
        return this.f9362g;
    }

    public final Map v() {
        return this.f9366k;
    }
}
