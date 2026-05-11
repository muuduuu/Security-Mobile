package com.google.android.gms.common.api.internal;

import S6.a;
import S6.h;
import T6.C1182l;
import T6.InterfaceC1188s;
import T6.V;
import T6.W;
import T6.Y;
import V6.AbstractC1287s;
import V6.C1271e;
import V6.L;
import V6.M;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class u extends S6.h implements W {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f23429b;

    /* renamed from: c, reason: collision with root package name */
    private final M f23430c;

    /* renamed from: e, reason: collision with root package name */
    private final int f23432e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f23433f;

    /* renamed from: g, reason: collision with root package name */
    private final Looper f23434g;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f23436i;

    /* renamed from: j, reason: collision with root package name */
    private long f23437j;

    /* renamed from: k, reason: collision with root package name */
    private long f23438k;

    /* renamed from: l, reason: collision with root package name */
    private final s f23439l;

    /* renamed from: m, reason: collision with root package name */
    private final C2017i f23440m;

    /* renamed from: n, reason: collision with root package name */
    V f23441n;

    /* renamed from: o, reason: collision with root package name */
    final Map f23442o;

    /* renamed from: p, reason: collision with root package name */
    Set f23443p;

    /* renamed from: q, reason: collision with root package name */
    final C1271e f23444q;

    /* renamed from: r, reason: collision with root package name */
    final Map f23445r;

    /* renamed from: s, reason: collision with root package name */
    final a.AbstractC0172a f23446s;

    /* renamed from: t, reason: collision with root package name */
    private final C1182l f23447t;

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList f23448u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f23449v;

    /* renamed from: w, reason: collision with root package name */
    Set f23450w;

    /* renamed from: x, reason: collision with root package name */
    final z f23451x;

    /* renamed from: y, reason: collision with root package name */
    private final L f23452y;

    /* renamed from: d, reason: collision with root package name */
    private Y f23431d = null;

    /* renamed from: h, reason: collision with root package name */
    final Queue f23435h = new LinkedList();

    public u(Context context, Lock lock, Looper looper, C1271e c1271e, C2017i c2017i, a.AbstractC0172a abstractC0172a, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        this.f23437j = true != com.google.android.gms.common.util.e.a() ? 120000L : 10000L;
        this.f23438k = 5000L;
        this.f23443p = new HashSet();
        this.f23447t = new C1182l();
        this.f23449v = null;
        this.f23450w = null;
        r rVar = new r(this);
        this.f23452y = rVar;
        this.f23433f = context;
        this.f23429b = lock;
        this.f23430c = new M(looper, rVar);
        this.f23434g = looper;
        this.f23439l = new s(this, looper);
        this.f23440m = c2017i;
        this.f23432e = i10;
        if (i10 >= 0) {
            this.f23449v = Integer.valueOf(i11);
        }
        this.f23445r = map;
        this.f23442o = map2;
        this.f23448u = arrayList;
        this.f23451x = new z();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f23430c.f((h.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f23430c.g((h.c) it2.next());
        }
        this.f23444q = c1271e;
        this.f23446s = abstractC0172a;
    }

    public static int r(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            z11 |= fVar.s();
            z12 |= fVar.b();
        }
        if (z11) {
            return (z12 && z10) ? 2 : 1;
        }
        return 3;
    }

    static String t(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    static /* bridge */ /* synthetic */ void u(u uVar) {
        uVar.f23429b.lock();
        try {
            if (uVar.f23436i) {
                uVar.y();
            }
        } finally {
            uVar.f23429b.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void v(u uVar) {
        uVar.f23429b.lock();
        try {
            if (uVar.w()) {
                uVar.y();
            }
        } finally {
            uVar.f23429b.unlock();
        }
    }

    private final void x(int i10) {
        Integer num = this.f23449v;
        if (num == null) {
            this.f23449v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            throw new IllegalStateException("Cannot use sign-in mode: " + t(i10) + ". Mode was already set to " + t(this.f23449v.intValue()));
        }
        if (this.f23431d != null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (a.f fVar : this.f23442o.values()) {
            z10 |= fVar.s();
            z11 |= fVar.b();
        }
        int intValue = this.f23449v.intValue();
        if (intValue == 1) {
            if (!z10) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z11) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (intValue == 2 && z10) {
            this.f23431d = C2007b.o(this.f23433f, this, this.f23429b, this.f23434g, this.f23440m, this.f23442o, this.f23444q, this.f23445r, this.f23446s, this.f23448u);
            return;
        }
        this.f23431d = new x(this.f23433f, this, this.f23429b, this.f23434g, this.f23440m, this.f23442o, this.f23444q, this.f23445r, this.f23446s, this.f23448u, this);
    }

    private final void y() {
        this.f23430c.b();
        ((Y) AbstractC1287s.m(this.f23431d)).a();
    }

    @Override // T6.W
    public final void a(Bundle bundle) {
        while (!this.f23435h.isEmpty()) {
            h((AbstractC2006a) this.f23435h.remove());
        }
        this.f23430c.d(bundle);
    }

    @Override // T6.W
    public final void b(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f23436i) {
                this.f23436i = true;
                if (this.f23441n == null && !com.google.android.gms.common.util.e.a()) {
                    try {
                        this.f23441n = this.f23440m.w(this.f23433f.getApplicationContext(), new t(this));
                    } catch (SecurityException unused) {
                    }
                }
                s sVar = this.f23439l;
                sVar.sendMessageDelayed(sVar.obtainMessage(1), this.f23437j);
                s sVar2 = this.f23439l;
                sVar2.sendMessageDelayed(sVar2.obtainMessage(2), this.f23438k);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f23451x.f23472a.toArray(new BasePendingResult[0])) {
            basePendingResult.h(z.f23471c);
        }
        this.f23430c.e(i10);
        this.f23430c.a();
        if (i10 == 2) {
            y();
        }
    }

    @Override // T6.W
    public final void c(C2010b c2010b) {
        if (!this.f23440m.k(this.f23433f, c2010b.u())) {
            w();
        }
        if (this.f23436i) {
            return;
        }
        this.f23430c.c(c2010b);
        this.f23430c.a();
    }

    @Override // S6.h
    public final void d() {
        this.f23429b.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f23432e >= 0) {
                AbstractC1287s.q(this.f23449v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f23449v;
                if (num == null) {
                    this.f23449v = Integer.valueOf(r(this.f23442o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) AbstractC1287s.m(this.f23449v)).intValue();
            this.f23429b.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i10 = intValue;
                } else if (intValue != 2) {
                    i10 = intValue;
                    AbstractC1287s.b(z10, "Illegal sign-in mode: " + i10);
                    x(i10);
                    y();
                    this.f23429b.unlock();
                    return;
                }
                AbstractC1287s.b(z10, "Illegal sign-in mode: " + i10);
                x(i10);
                y();
                this.f23429b.unlock();
                return;
            } finally {
                this.f23429b.unlock();
            }
            z10 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // S6.h
    public final void e() {
        this.f23429b.lock();
        try {
            this.f23451x.b();
            Y y10 = this.f23431d;
            if (y10 != null) {
                y10.g();
            }
            this.f23447t.d();
            for (AbstractC2006a abstractC2006a : this.f23435h) {
                abstractC2006a.q(null);
                abstractC2006a.f();
            }
            this.f23435h.clear();
            if (this.f23431d != null) {
                w();
                this.f23430c.a();
            }
            this.f23429b.unlock();
        } catch (Throwable th) {
            this.f23429b.unlock();
            throw th;
        }
    }

    @Override // S6.h
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f23433f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f23436i);
        printWriter.append(" mWorkQueue.size()=").print(this.f23435h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f23451x.f23472a.size());
        Y y10 = this.f23431d;
        if (y10 != null) {
            y10.h(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // S6.h
    public final AbstractC2006a g(AbstractC2006a abstractC2006a) {
        S6.a s10 = abstractC2006a.s();
        AbstractC1287s.b(this.f23442o.containsKey(abstractC2006a.t()), "GoogleApiClient is not configured to use " + (s10 != null ? s10.d() : "the API") + " required for this call.");
        this.f23429b.lock();
        try {
            Y y10 = this.f23431d;
            if (y10 == null) {
                this.f23435h.add(abstractC2006a);
            } else {
                abstractC2006a = y10.c(abstractC2006a);
            }
            this.f23429b.unlock();
            return abstractC2006a;
        } catch (Throwable th) {
            this.f23429b.unlock();
            throw th;
        }
    }

    @Override // S6.h
    public final AbstractC2006a h(AbstractC2006a abstractC2006a) {
        Map map = this.f23442o;
        S6.a s10 = abstractC2006a.s();
        AbstractC1287s.b(map.containsKey(abstractC2006a.t()), "GoogleApiClient is not configured to use " + (s10 != null ? s10.d() : "the API") + " required for this call.");
        this.f23429b.lock();
        try {
            Y y10 = this.f23431d;
            if (y10 == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f23436i) {
                this.f23435h.add(abstractC2006a);
                while (!this.f23435h.isEmpty()) {
                    AbstractC2006a abstractC2006a2 = (AbstractC2006a) this.f23435h.remove();
                    this.f23451x.a(abstractC2006a2);
                    abstractC2006a2.a(Status.f23341h);
                }
            } else {
                abstractC2006a = y10.e(abstractC2006a);
            }
            this.f23429b.unlock();
            return abstractC2006a;
        } catch (Throwable th) {
            this.f23429b.unlock();
            throw th;
        }
    }

    @Override // S6.h
    public final a.f j(a.c cVar) {
        a.f fVar = (a.f) this.f23442o.get(cVar);
        AbstractC1287s.n(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // S6.h
    public final Looper k() {
        return this.f23434g;
    }

    @Override // S6.h
    public final boolean l() {
        Y y10 = this.f23431d;
        return y10 != null && y10.d();
    }

    @Override // S6.h
    public final boolean m(InterfaceC1188s interfaceC1188s) {
        Y y10 = this.f23431d;
        return y10 != null && y10.b(interfaceC1188s);
    }

    @Override // S6.h
    public final void n() {
        Y y10 = this.f23431d;
        if (y10 != null) {
            y10.f();
        }
    }

    @Override // S6.h
    public final void o(h.c cVar) {
        this.f23430c.g(cVar);
    }

    @Override // S6.h
    public final void p(h.c cVar) {
        this.f23430c.h(cVar);
    }

    final String s() {
        StringWriter stringWriter = new StringWriter();
        f(BuildConfig.FLAVOR, null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    final boolean w() {
        if (!this.f23436i) {
            return false;
        }
        this.f23436i = false;
        this.f23439l.removeMessages(2);
        this.f23439l.removeMessages(1);
        V v10 = this.f23441n;
        if (v10 != null) {
            v10.b();
            this.f23441n = null;
        }
        return true;
    }
}
