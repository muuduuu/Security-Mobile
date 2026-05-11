package B6;

import C6.AbstractC0760k;
import C6.InterfaceC0752c;
import C6.InterfaceC0753d;
import D6.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import s6.C4317c;
import v6.AbstractC4954f;
import v6.AbstractC4955g;
import v6.InterfaceC4953e;
import v6.InterfaceC4961m;
import x6.C5111a;
import x6.C5113c;
import y6.AbstractC5177a;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f488a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4953e f489b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0753d f490c;

    /* renamed from: d, reason: collision with root package name */
    private final x f491d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f492e;

    /* renamed from: f, reason: collision with root package name */
    private final D6.b f493f;

    /* renamed from: g, reason: collision with root package name */
    private final E6.a f494g;

    /* renamed from: h, reason: collision with root package name */
    private final E6.a f495h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC0752c f496i;

    public r(Context context, InterfaceC4953e interfaceC4953e, InterfaceC0753d interfaceC0753d, x xVar, Executor executor, D6.b bVar, E6.a aVar, E6.a aVar2, InterfaceC0752c interfaceC0752c) {
        this.f488a = context;
        this.f489b = interfaceC4953e;
        this.f490c = interfaceC0753d;
        this.f491d = xVar;
        this.f492e = executor;
        this.f493f = bVar;
        this.f494g = aVar;
        this.f495h = aVar2;
        this.f496i = interfaceC0752c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(u6.o oVar) {
        return Boolean.valueOf(this.f490c.T1(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(u6.o oVar) {
        return this.f490c.a0(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, u6.o oVar, long j10) {
        this.f490c.R1(iterable);
        this.f490c.f1(oVar, this.f494g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f490c.V(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f496i.c();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f496i.b(((Integer) r0.getValue()).intValue(), C5113c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(u6.o oVar, long j10) {
        this.f490c.f1(oVar, this.f494g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(u6.o oVar, int i10) {
        this.f491d.b(oVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final u6.o oVar, final int i10, Runnable runnable) {
        try {
            try {
                D6.b bVar = this.f493f;
                final InterfaceC0753d interfaceC0753d = this.f490c;
                Objects.requireNonNull(interfaceC0753d);
                bVar.a(new b.a() { // from class: B6.i
                    @Override // D6.b.a
                    public final Object j() {
                        return Integer.valueOf(InterfaceC0753d.this.w());
                    }
                });
                if (k()) {
                    u(oVar, i10);
                } else {
                    this.f493f.a(new b.a() { // from class: B6.j
                        @Override // D6.b.a
                        public final Object j() {
                            Object s10;
                            s10 = r.this.s(oVar, i10);
                            return s10;
                        }
                    });
                }
            } catch (D6.a unused) {
                this.f491d.b(oVar, i10 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public u6.i j(InterfaceC4961m interfaceC4961m) {
        D6.b bVar = this.f493f;
        final InterfaceC0752c interfaceC0752c = this.f496i;
        Objects.requireNonNull(interfaceC0752c);
        return interfaceC4961m.b(u6.i.a().i(this.f494g.a()).k(this.f495h.a()).j("GDT_CLIENT_METRICS").h(new u6.h(C4317c.b("proto"), ((C5111a) bVar.a(new b.a() { // from class: B6.h
            @Override // D6.b.a
            public final Object j() {
                return InterfaceC0752c.this.d();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f488a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public AbstractC4955g u(final u6.o oVar, int i10) {
        AbstractC4955g a10;
        InterfaceC4961m a11 = this.f489b.a(oVar.b());
        long j10 = 0;
        AbstractC4955g e10 = AbstractC4955g.e(0L);
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f493f.a(new b.a() { // from class: B6.k
                @Override // D6.b.a
                public final Object j() {
                    Boolean l10;
                    l10 = r.this.l(oVar);
                    return l10;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f493f.a(new b.a() { // from class: B6.l
                    @Override // D6.b.a
                    public final Object j() {
                        Iterable m10;
                        m10 = r.this.m(oVar);
                        return m10;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (a11 == null) {
                    AbstractC5177a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    a10 = AbstractC4955g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC0760k) it.next()).b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(a11));
                    }
                    a10 = a11.a(AbstractC4954f.a().b(arrayList).c(oVar.c()).a());
                }
                e10 = a10;
                if (e10.c() == AbstractC4955g.a.TRANSIENT_ERROR) {
                    this.f493f.a(new b.a() { // from class: B6.m
                        @Override // D6.b.a
                        public final Object j() {
                            Object n10;
                            n10 = r.this.n(iterable, oVar, j11);
                            return n10;
                        }
                    });
                    this.f491d.a(oVar, i10 + 1, true);
                    return e10;
                }
                this.f493f.a(new b.a() { // from class: B6.n
                    @Override // D6.b.a
                    public final Object j() {
                        Object o10;
                        o10 = r.this.o(iterable);
                        return o10;
                    }
                });
                if (e10.c() == AbstractC4955g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (oVar.e()) {
                        this.f493f.a(new b.a() { // from class: B6.o
                            @Override // D6.b.a
                            public final Object j() {
                                Object p10;
                                p10 = r.this.p();
                                return p10;
                            }
                        });
                    }
                } else if (e10.c() == AbstractC4955g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String j12 = ((AbstractC0760k) it2.next()).b().j();
                        if (hashMap.containsKey(j12)) {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        } else {
                            hashMap.put(j12, 1);
                        }
                    }
                    this.f493f.a(new b.a() { // from class: B6.p
                        @Override // D6.b.a
                        public final Object j() {
                            Object q10;
                            q10 = r.this.q(hashMap);
                            return q10;
                        }
                    });
                }
            }
            this.f493f.a(new b.a() { // from class: B6.q
                @Override // D6.b.a
                public final Object j() {
                    Object r10;
                    r10 = r.this.r(oVar, j11);
                    return r10;
                }
            });
            return e10;
        }
    }

    public void v(final u6.o oVar, final int i10, final Runnable runnable) {
        this.f492e.execute(new Runnable() { // from class: B6.g
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(oVar, i10, runnable);
            }
        });
    }
}
