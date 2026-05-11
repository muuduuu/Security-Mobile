package com.google.android.gms.common.api.internal;

import S6.a;
import T6.C0;
import T6.InterfaceC1188s;
import T6.Y;
import V6.AbstractC1287s;
import V6.C1271e;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2018j;
import com.google.android.gms.common.api.Status;
import j0.C3476a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2007b implements Y {

    /* renamed from: f, reason: collision with root package name */
    private final Context f23370f;

    /* renamed from: g, reason: collision with root package name */
    private final u f23371g;

    /* renamed from: h, reason: collision with root package name */
    private final Looper f23372h;

    /* renamed from: i, reason: collision with root package name */
    private final x f23373i;

    /* renamed from: j, reason: collision with root package name */
    private final x f23374j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f23375k;

    /* renamed from: m, reason: collision with root package name */
    private final a.f f23377m;

    /* renamed from: n, reason: collision with root package name */
    private Bundle f23378n;

    /* renamed from: r, reason: collision with root package name */
    private final Lock f23382r;

    /* renamed from: l, reason: collision with root package name */
    private final Set f23376l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: o, reason: collision with root package name */
    private C2010b f23379o = null;

    /* renamed from: p, reason: collision with root package name */
    private C2010b f23380p = null;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23381q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f23383s = 0;

    private C2007b(Context context, u uVar, Lock lock, Looper looper, C2018j c2018j, Map map, Map map2, C1271e c1271e, a.AbstractC0172a abstractC0172a, a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f23370f = context;
        this.f23371g = uVar;
        this.f23382r = lock;
        this.f23372h = looper;
        this.f23377m = fVar;
        this.f23373i = new x(context, uVar, lock, looper, c2018j, map2, null, map4, null, arrayList2, new C(this, null));
        this.f23374j = new x(context, uVar, lock, looper, c2018j, map, c1271e, map3, abstractC0172a, arrayList, new D(this, null));
        C3476a c3476a = new C3476a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            c3476a.put((a.c) it.next(), this.f23373i);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c3476a.put((a.c) it2.next(), this.f23374j);
        }
        this.f23375k = Collections.unmodifiableMap(c3476a);
    }

    private final PendingIntent A() {
        a.f fVar = this.f23377m;
        if (fVar == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f23370f, System.identityHashCode(this.f23371g), fVar.r(), l7.g.f37103a | 134217728);
    }

    private final void i(C2010b c2010b) {
        int i10 = this.f23383s;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f23383s = 0;
            }
            this.f23371g.c(c2010b);
        }
        j();
        this.f23383s = 0;
    }

    private final void j() {
        Iterator it = this.f23376l.iterator();
        while (it.hasNext()) {
            ((InterfaceC1188s) it.next()).a();
        }
        this.f23376l.clear();
    }

    private final boolean k() {
        C2010b c2010b = this.f23380p;
        return c2010b != null && c2010b.u() == 4;
    }

    private final boolean l(AbstractC2006a abstractC2006a) {
        x xVar = (x) this.f23375k.get(abstractC2006a.t());
        AbstractC1287s.n(xVar, "GoogleApiClient is not configured to use the API required for this call.");
        return xVar.equals(this.f23374j);
    }

    private static boolean m(C2010b c2010b) {
        return c2010b != null && c2010b.Z0();
    }

    public static C2007b o(Context context, u uVar, Lock lock, Looper looper, C2018j c2018j, Map map, C1271e c1271e, Map map2, a.AbstractC0172a abstractC0172a, ArrayList arrayList) {
        C3476a c3476a = new C3476a();
        C3476a c3476a2 = new C3476a();
        a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            a.f fVar2 = (a.f) entry.getValue();
            if (true == fVar2.b()) {
                fVar = fVar2;
            }
            if (fVar2.s()) {
                c3476a.put((a.c) entry.getKey(), fVar2);
            } else {
                c3476a2.put((a.c) entry.getKey(), fVar2);
            }
        }
        AbstractC1287s.q(!c3476a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C3476a c3476a3 = new C3476a();
        C3476a c3476a4 = new C3476a();
        for (S6.a aVar : map2.keySet()) {
            a.c b10 = aVar.b();
            if (c3476a.containsKey(b10)) {
                c3476a3.put(aVar, (Boolean) map2.get(aVar));
            } else {
                if (!c3476a2.containsKey(b10)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c3476a4.put(aVar, (Boolean) map2.get(aVar));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0 c02 = (C0) arrayList.get(i10);
            if (c3476a3.containsKey(c02.f9340f)) {
                arrayList2.add(c02);
            } else {
                if (!c3476a4.containsKey(c02.f9340f)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(c02);
            }
        }
        return new C2007b(context, uVar, lock, looper, c2018j, c3476a, c3476a2, c1271e, abstractC0172a, fVar, arrayList2, arrayList3, c3476a3, c3476a4);
    }

    static /* bridge */ /* synthetic */ void v(C2007b c2007b, int i10, boolean z10) {
        c2007b.f23371g.b(i10, z10);
        c2007b.f23380p = null;
        c2007b.f23379o = null;
    }

    static /* bridge */ /* synthetic */ void w(C2007b c2007b, Bundle bundle) {
        Bundle bundle2 = c2007b.f23378n;
        if (bundle2 == null) {
            c2007b.f23378n = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void x(C2007b c2007b) {
        C2010b c2010b;
        if (!m(c2007b.f23379o)) {
            if (c2007b.f23379o != null && m(c2007b.f23380p)) {
                c2007b.f23374j.g();
                c2007b.i((C2010b) AbstractC1287s.m(c2007b.f23379o));
                return;
            }
            C2010b c2010b2 = c2007b.f23379o;
            if (c2010b2 == null || (c2010b = c2007b.f23380p) == null) {
                return;
            }
            if (c2007b.f23374j.f23467r < c2007b.f23373i.f23467r) {
                c2010b2 = c2010b;
            }
            c2007b.i(c2010b2);
            return;
        }
        if (!m(c2007b.f23380p) && !c2007b.k()) {
            C2010b c2010b3 = c2007b.f23380p;
            if (c2010b3 != null) {
                if (c2007b.f23383s == 1) {
                    c2007b.j();
                    return;
                } else {
                    c2007b.i(c2010b3);
                    c2007b.f23373i.g();
                    return;
                }
            }
            return;
        }
        int i10 = c2007b.f23383s;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                c2007b.f23383s = 0;
            }
            ((u) AbstractC1287s.m(c2007b.f23371g)).a(c2007b.f23378n);
        }
        c2007b.j();
        c2007b.f23383s = 0;
    }

    @Override // T6.Y
    public final void a() {
        this.f23383s = 2;
        this.f23381q = false;
        this.f23380p = null;
        this.f23379o = null;
        this.f23373i.a();
        this.f23374j.a();
    }

    @Override // T6.Y
    public final boolean b(InterfaceC1188s interfaceC1188s) {
        this.f23382r.lock();
        try {
            boolean z10 = false;
            if (!z()) {
                if (d()) {
                }
                this.f23382r.unlock();
                return z10;
            }
            if (!this.f23374j.d()) {
                this.f23376l.add(interfaceC1188s);
                z10 = true;
                if (this.f23383s == 0) {
                    this.f23383s = 1;
                }
                this.f23380p = null;
                this.f23374j.a();
            }
            this.f23382r.unlock();
            return z10;
        } catch (Throwable th) {
            this.f23382r.unlock();
            throw th;
        }
    }

    @Override // T6.Y
    public final AbstractC2006a c(AbstractC2006a abstractC2006a) {
        if (!l(abstractC2006a)) {
            this.f23373i.c(abstractC2006a);
            return abstractC2006a;
        }
        if (k()) {
            abstractC2006a.a(new Status(4, (String) null, A()));
            return abstractC2006a;
        }
        this.f23374j.c(abstractC2006a);
        return abstractC2006a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.f23383s == 1) goto L11;
     */
    @Override // T6.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        this.f23382r.lock();
        try {
            boolean z10 = false;
            if (this.f23373i.d()) {
                if (!this.f23374j.d() && !k()) {
                }
                z10 = true;
            }
            return z10;
        } finally {
            this.f23382r.unlock();
        }
    }

    @Override // T6.Y
    public final AbstractC2006a e(AbstractC2006a abstractC2006a) {
        if (!l(abstractC2006a)) {
            return this.f23373i.e(abstractC2006a);
        }
        if (!k()) {
            return this.f23374j.e(abstractC2006a);
        }
        abstractC2006a.a(new Status(4, (String) null, A()));
        return abstractC2006a;
    }

    @Override // T6.Y
    public final void f() {
        this.f23382r.lock();
        try {
            boolean z10 = z();
            this.f23374j.g();
            this.f23380p = new C2010b(4);
            if (z10) {
                new l7.l(this.f23372h).post(new B(this));
            } else {
                j();
            }
            this.f23382r.unlock();
        } catch (Throwable th) {
            this.f23382r.unlock();
            throw th;
        }
    }

    @Override // T6.Y
    public final void g() {
        this.f23380p = null;
        this.f23379o = null;
        this.f23383s = 0;
        this.f23373i.g();
        this.f23374j.g();
        j();
    }

    @Override // T6.Y
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f23374j.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f23373i.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean z() {
        this.f23382r.lock();
        try {
            return this.f23383s == 2;
        } finally {
            this.f23382r.unlock();
        }
    }
}
