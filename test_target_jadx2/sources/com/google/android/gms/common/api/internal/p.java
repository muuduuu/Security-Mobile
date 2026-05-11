package com.google.android.gms.common.api.internal;

import S6.a;
import T6.F;
import T6.G;
import V6.AbstractC1287s;
import V6.C1271e;
import V6.InterfaceC1280k;
import V6.X;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2018j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class p implements F {

    /* renamed from: a, reason: collision with root package name */
    private final x f23404a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f23405b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23406c;

    /* renamed from: d, reason: collision with root package name */
    private final C2018j f23407d;

    /* renamed from: e, reason: collision with root package name */
    private C2010b f23408e;

    /* renamed from: f, reason: collision with root package name */
    private int f23409f;

    /* renamed from: h, reason: collision with root package name */
    private int f23411h;

    /* renamed from: k, reason: collision with root package name */
    private A7.e f23414k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23415l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23416m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f23417n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1280k f23418o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23419p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23420q;

    /* renamed from: r, reason: collision with root package name */
    private final C1271e f23421r;

    /* renamed from: s, reason: collision with root package name */
    private final Map f23422s;

    /* renamed from: t, reason: collision with root package name */
    private final a.AbstractC0172a f23423t;

    /* renamed from: g, reason: collision with root package name */
    private int f23410g = 0;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f23412i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    private final Set f23413j = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList f23424u = new ArrayList();

    public p(x xVar, C1271e c1271e, Map map, C2018j c2018j, a.AbstractC0172a abstractC0172a, Lock lock, Context context) {
        this.f23404a = xVar;
        this.f23421r = c1271e;
        this.f23422s = map;
        this.f23407d = c2018j;
        this.f23423t = abstractC0172a;
        this.f23405b = lock;
        this.f23406c = context;
    }

    static /* bridge */ /* synthetic */ void B(p pVar, B7.l lVar) {
        if (pVar.o(0)) {
            C2010b j10 = lVar.j();
            if (!j10.Z0()) {
                if (!pVar.q(j10)) {
                    pVar.l(j10);
                    return;
                } else {
                    pVar.i();
                    pVar.n();
                    return;
                }
            }
            X x10 = (X) AbstractC1287s.m(lVar.u());
            C2010b j11 = x10.j();
            if (!j11.Z0()) {
                String valueOf = String.valueOf(j11);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                pVar.l(j11);
                return;
            }
            pVar.f23417n = true;
            pVar.f23418o = (InterfaceC1280k) AbstractC1287s.m(x10.u());
            pVar.f23419p = x10.F();
            pVar.f23420q = x10.I();
            pVar.n();
        }
    }

    private final void J() {
        ArrayList arrayList = this.f23424u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        this.f23424u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.f23416m = false;
        this.f23404a.f23468s.f23443p = Collections.emptySet();
        for (a.c cVar : this.f23413j) {
            if (!this.f23404a.f23461l.containsKey(cVar)) {
                x xVar = this.f23404a;
                xVar.f23461l.put(cVar, new C2010b(17, null));
            }
        }
    }

    private final void j(boolean z10) {
        A7.e eVar = this.f23414k;
        if (eVar != null) {
            if (eVar.a() && z10) {
                eVar.o();
            }
            eVar.h();
            this.f23418o = null;
        }
    }

    private final void k() {
        this.f23404a.k();
        G.a().execute(new f(this));
        A7.e eVar = this.f23414k;
        if (eVar != null) {
            if (this.f23419p) {
                eVar.i((InterfaceC1280k) AbstractC1287s.m(this.f23418o), this.f23420q);
            }
            j(false);
        }
        Iterator it = this.f23404a.f23461l.keySet().iterator();
        while (it.hasNext()) {
            ((a.f) AbstractC1287s.m((a.f) this.f23404a.f23460k.get((a.c) it.next()))).h();
        }
        this.f23404a.f23469t.a(this.f23412i.isEmpty() ? null : this.f23412i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C2010b c2010b) {
        J();
        j(!c2010b.y0());
        this.f23404a.m(c2010b);
        this.f23404a.f23469t.c(c2010b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C2010b c2010b, S6.a aVar, boolean z10) {
        int b10 = aVar.c().b();
        if ((!z10 || c2010b.y0() || this.f23407d.c(c2010b.u()) != null) && (this.f23408e == null || b10 < this.f23409f)) {
            this.f23408e = c2010b;
            this.f23409f = b10;
        }
        x xVar = this.f23404a;
        xVar.f23461l.put(aVar.b(), c2010b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f23411h != 0) {
            return;
        }
        if (!this.f23416m || this.f23417n) {
            ArrayList arrayList = new ArrayList();
            this.f23410g = 1;
            this.f23411h = this.f23404a.f23460k.size();
            for (a.c cVar : this.f23404a.f23460k.keySet()) {
                if (!this.f23404a.f23461l.containsKey(cVar)) {
                    arrayList.add((a.f) this.f23404a.f23460k.get(cVar));
                } else if (p()) {
                    k();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f23424u.add(G.a().submit(new k(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(int i10) {
        if (this.f23410g == i10) {
            return true;
        }
        Log.w("GACConnecting", this.f23404a.f23468s.s());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f23411h);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + r(this.f23410g) + " but received callback for step " + r(i10), new Exception());
        l(new C2010b(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        int i10 = this.f23411h - 1;
        this.f23411h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f23404a.f23468s.s());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            l(new C2010b(8, null));
            return false;
        }
        C2010b c2010b = this.f23408e;
        if (c2010b == null) {
            return true;
        }
        this.f23404a.f23467r = this.f23409f;
        l(c2010b);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(C2010b c2010b) {
        return this.f23415l && !c2010b.y0();
    }

    private static final String r(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set y(p pVar) {
        C1271e c1271e = pVar.f23421r;
        if (c1271e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(c1271e.g());
        Map k10 = pVar.f23421r.k();
        for (S6.a aVar : k10.keySet()) {
            x xVar = pVar.f23404a;
            if (!xVar.f23461l.containsKey(aVar.b())) {
                android.support.v4.media.session.b.a(k10.get(aVar));
                throw null;
            }
        }
        return hashSet;
    }

    @Override // T6.F
    public final void a(Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f23412i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    @Override // T6.F
    public final void b() {
    }

    @Override // T6.F
    public final void c(int i10) {
        l(new C2010b(8, null));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [A7.e, S6.a$f] */
    @Override // T6.F
    public final void d() {
        this.f23404a.f23461l.clear();
        this.f23416m = false;
        T6.D d10 = null;
        this.f23408e = null;
        this.f23410g = 0;
        this.f23415l = true;
        this.f23417n = false;
        this.f23419p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (S6.a aVar : this.f23422s.keySet()) {
            a.f fVar = (a.f) AbstractC1287s.m((a.f) this.f23404a.f23460k.get(aVar.b()));
            z10 |= aVar.c().b() == 1;
            boolean booleanValue = ((Boolean) this.f23422s.get(aVar)).booleanValue();
            if (fVar.s()) {
                this.f23416m = true;
                if (booleanValue) {
                    this.f23413j.add(aVar.b());
                } else {
                    this.f23415l = false;
                }
            }
            hashMap.put(fVar, new g(this, aVar, booleanValue));
        }
        if (z10) {
            this.f23416m = false;
        }
        if (this.f23416m) {
            AbstractC1287s.m(this.f23421r);
            AbstractC1287s.m(this.f23423t);
            this.f23421r.l(Integer.valueOf(System.identityHashCode(this.f23404a.f23468s)));
            n nVar = new n(this, d10);
            a.AbstractC0172a abstractC0172a = this.f23423t;
            Context context = this.f23406c;
            x xVar = this.f23404a;
            C1271e c1271e = this.f23421r;
            this.f23414k = abstractC0172a.c(context, xVar.f23468s.k(), c1271e, c1271e.h(), nVar, nVar);
        }
        this.f23411h = this.f23404a.f23460k.size();
        this.f23424u.add(G.a().submit(new j(this, hashMap)));
    }

    @Override // T6.F
    public final void e(C2010b c2010b, S6.a aVar, boolean z10) {
        if (o(1)) {
            m(c2010b, aVar, z10);
            if (p()) {
                k();
            }
        }
    }

    @Override // T6.F
    public final AbstractC2006a f(AbstractC2006a abstractC2006a) {
        this.f23404a.f23468s.f23435h.add(abstractC2006a);
        return abstractC2006a;
    }

    @Override // T6.F
    public final boolean g() {
        J();
        j(true);
        this.f23404a.m(null);
        return true;
    }

    @Override // T6.F
    public final AbstractC2006a h(AbstractC2006a abstractC2006a) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
