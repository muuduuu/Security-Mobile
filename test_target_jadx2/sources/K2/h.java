package k2;

import E2.a;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.i;
import i2.EnumC3313a;
import i2.EnumC3315c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k2.InterfaceC3536f;
import k2.i;
import m2.InterfaceC3639a;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class h implements InterfaceC3536f.a, Runnable, Comparable, a.f {

    /* renamed from: A, reason: collision with root package name */
    private EnumC3313a f36024A;

    /* renamed from: B, reason: collision with root package name */
    private com.bumptech.glide.load.data.d f36025B;

    /* renamed from: C, reason: collision with root package name */
    private volatile InterfaceC3536f f36026C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f36027D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f36028E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f36029F;

    /* renamed from: d, reason: collision with root package name */
    private final e f36033d;

    /* renamed from: e, reason: collision with root package name */
    private final y0.d f36034e;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.e f36037h;

    /* renamed from: i, reason: collision with root package name */
    private i2.f f36038i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.h f36039j;

    /* renamed from: k, reason: collision with root package name */
    private n f36040k;

    /* renamed from: l, reason: collision with root package name */
    private int f36041l;

    /* renamed from: m, reason: collision with root package name */
    private int f36042m;

    /* renamed from: n, reason: collision with root package name */
    private j f36043n;

    /* renamed from: o, reason: collision with root package name */
    private i2.h f36044o;

    /* renamed from: p, reason: collision with root package name */
    private b f36045p;

    /* renamed from: q, reason: collision with root package name */
    private int f36046q;

    /* renamed from: r, reason: collision with root package name */
    private EnumC0521h f36047r;

    /* renamed from: s, reason: collision with root package name */
    private g f36048s;

    /* renamed from: t, reason: collision with root package name */
    private long f36049t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f36050u;

    /* renamed from: v, reason: collision with root package name */
    private Object f36051v;

    /* renamed from: w, reason: collision with root package name */
    private Thread f36052w;

    /* renamed from: x, reason: collision with root package name */
    private i2.f f36053x;

    /* renamed from: y, reason: collision with root package name */
    private i2.f f36054y;

    /* renamed from: z, reason: collision with root package name */
    private Object f36055z;

    /* renamed from: a, reason: collision with root package name */
    private final C3537g f36030a = new C3537g();

    /* renamed from: b, reason: collision with root package name */
    private final List f36031b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final E2.c f36032c = E2.c.a();

    /* renamed from: f, reason: collision with root package name */
    private final d f36035f = new d();

    /* renamed from: g, reason: collision with root package name */
    private final f f36036g = new f();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36056a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36057b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f36058c;

        static {
            int[] iArr = new int[EnumC3315c.values().length];
            f36058c = iArr;
            try {
                iArr[EnumC3315c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36058c[EnumC3315c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0521h.values().length];
            f36057b = iArr2;
            try {
                iArr2[EnumC0521h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36057b[EnumC0521h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36057b[EnumC0521h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36057b[EnumC0521h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36057b[EnumC0521h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f36056a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36056a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36056a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b {
        void a(q qVar);

        void b(v vVar, EnumC3313a enumC3313a, boolean z10);

        void c(h hVar);
    }

    private final class c implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC3313a f36059a;

        c(EnumC3313a enumC3313a) {
            this.f36059a = enumC3313a;
        }

        @Override // k2.i.a
        public v a(v vVar) {
            return h.this.E(this.f36059a, vVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private i2.f f36061a;

        /* renamed from: b, reason: collision with root package name */
        private i2.k f36062b;

        /* renamed from: c, reason: collision with root package name */
        private u f36063c;

        d() {
        }

        void a() {
            this.f36061a = null;
            this.f36062b = null;
            this.f36063c = null;
        }

        void b(e eVar, i2.h hVar) {
            E2.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f36061a, new C3535e(this.f36062b, this.f36063c, hVar));
            } finally {
                this.f36063c.f();
                E2.b.e();
            }
        }

        boolean c() {
            return this.f36063c != null;
        }

        void d(i2.f fVar, i2.k kVar, u uVar) {
            this.f36061a = fVar;
            this.f36062b = kVar;
            this.f36063c = uVar;
        }
    }

    interface e {
        InterfaceC3639a a();
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f36064a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36065b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f36066c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f36066c || z10 || this.f36065b) && this.f36064a;
        }

        synchronized boolean b() {
            this.f36065b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f36066c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f36064a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f36065b = false;
            this.f36064a = false;
            this.f36066c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: k2.h$h, reason: collision with other inner class name */
    private enum EnumC0521h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, y0.d dVar) {
        this.f36033d = eVar;
        this.f36034e = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A(v vVar, EnumC3313a enumC3313a, boolean z10) {
        u uVar;
        E2.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).initialize();
            }
            if (this.f36035f.c()) {
                vVar = u.c(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            z(vVar, enumC3313a, z10);
            this.f36047r = EnumC0521h.ENCODE;
            try {
                if (this.f36035f.c()) {
                    this.f36035f.b(this.f36033d, this.f36044o);
                }
                C();
                E2.b.e();
            } finally {
                if (uVar != 0) {
                    uVar.f();
                }
            }
        } catch (Throwable th) {
            E2.b.e();
            throw th;
        }
    }

    private void B() {
        L();
        this.f36045p.a(new q("Failed to load resource", new ArrayList(this.f36031b)));
        D();
    }

    private void C() {
        if (this.f36036g.b()) {
            G();
        }
    }

    private void D() {
        if (this.f36036g.c()) {
            G();
        }
    }

    private void G() {
        this.f36036g.e();
        this.f36035f.a();
        this.f36030a.a();
        this.f36027D = false;
        this.f36037h = null;
        this.f36038i = null;
        this.f36044o = null;
        this.f36039j = null;
        this.f36040k = null;
        this.f36045p = null;
        this.f36047r = null;
        this.f36026C = null;
        this.f36052w = null;
        this.f36053x = null;
        this.f36055z = null;
        this.f36024A = null;
        this.f36025B = null;
        this.f36049t = 0L;
        this.f36028E = false;
        this.f36051v = null;
        this.f36031b.clear();
        this.f36034e.a(this);
    }

    private void H(g gVar) {
        this.f36048s = gVar;
        this.f36045p.c(this);
    }

    private void I() {
        this.f36052w = Thread.currentThread();
        this.f36049t = D2.g.b();
        boolean z10 = false;
        while (!this.f36028E && this.f36026C != null && !(z10 = this.f36026C.a())) {
            this.f36047r = t(this.f36047r);
            this.f36026C = s();
            if (this.f36047r == EnumC0521h.SOURCE) {
                H(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f36047r == EnumC0521h.FINISHED || this.f36028E) && !z10) {
            B();
        }
    }

    private v J(Object obj, EnumC3313a enumC3313a, t tVar) {
        i2.h u10 = u(enumC3313a);
        com.bumptech.glide.load.data.e l10 = this.f36037h.h().l(obj);
        try {
            return tVar.a(l10, u10, this.f36041l, this.f36042m, new c(enumC3313a));
        } finally {
            l10.b();
        }
    }

    private void K() {
        int i10 = a.f36056a[this.f36048s.ordinal()];
        if (i10 == 1) {
            this.f36047r = t(EnumC0521h.INITIALIZE);
            this.f36026C = s();
            I();
        } else if (i10 == 2) {
            I();
        } else {
            if (i10 == 3) {
                r();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f36048s);
        }
    }

    private void L() {
        Throwable th;
        this.f36032c.c();
        if (!this.f36027D) {
            this.f36027D = true;
            return;
        }
        if (this.f36031b.isEmpty()) {
            th = null;
        } else {
            List list = this.f36031b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private v p(com.bumptech.glide.load.data.d dVar, Object obj, EnumC3313a enumC3313a) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long b10 = D2.g.b();
            v q10 = q(obj, enumC3313a);
            if (Log.isLoggable("DecodeJob", 2)) {
                x("Decoded result " + q10, b10);
            }
            return q10;
        } finally {
            dVar.b();
        }
    }

    private v q(Object obj, EnumC3313a enumC3313a) {
        return J(obj, enumC3313a, this.f36030a.h(obj.getClass()));
    }

    private void r() {
        v vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            y("Retrieved data", this.f36049t, "data: " + this.f36055z + ", cache key: " + this.f36053x + ", fetcher: " + this.f36025B);
        }
        try {
            vVar = p(this.f36025B, this.f36055z, this.f36024A);
        } catch (q e10) {
            e10.i(this.f36054y, this.f36024A);
            this.f36031b.add(e10);
            vVar = null;
        }
        if (vVar != null) {
            A(vVar, this.f36024A, this.f36029F);
        } else {
            I();
        }
    }

    private InterfaceC3536f s() {
        int i10 = a.f36057b[this.f36047r.ordinal()];
        if (i10 == 1) {
            return new w(this.f36030a, this);
        }
        if (i10 == 2) {
            return new C3533c(this.f36030a, this);
        }
        if (i10 == 3) {
            return new z(this.f36030a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f36047r);
    }

    private EnumC0521h t(EnumC0521h enumC0521h) {
        int i10 = a.f36057b[enumC0521h.ordinal()];
        if (i10 == 1) {
            return this.f36043n.a() ? EnumC0521h.DATA_CACHE : t(EnumC0521h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f36050u ? EnumC0521h.FINISHED : EnumC0521h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0521h.FINISHED;
        }
        if (i10 == 5) {
            return this.f36043n.b() ? EnumC0521h.RESOURCE_CACHE : t(EnumC0521h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0521h);
    }

    private i2.h u(EnumC3313a enumC3313a) {
        i2.h hVar = this.f36044o;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = enumC3313a == EnumC3313a.RESOURCE_DISK_CACHE || this.f36030a.x();
        i2.g gVar = r2.t.f39176j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return hVar;
        }
        i2.h hVar2 = new i2.h();
        hVar2.d(this.f36044o);
        hVar2.e(gVar, Boolean.valueOf(z10));
        return hVar2;
    }

    private int v() {
        return this.f36039j.ordinal();
    }

    private void x(String str, long j10) {
        y(str, j10, null);
    }

    private void y(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(D2.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f36040k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void z(v vVar, EnumC3313a enumC3313a, boolean z10) {
        L();
        this.f36045p.b(vVar, enumC3313a, z10);
    }

    v E(EnumC3313a enumC3313a, v vVar) {
        v vVar2;
        i2.l lVar;
        EnumC3315c enumC3315c;
        i2.f c3534d;
        Class<?> cls = vVar.get().getClass();
        i2.k kVar = null;
        if (enumC3313a != EnumC3313a.RESOURCE_DISK_CACHE) {
            i2.l s10 = this.f36030a.s(cls);
            lVar = s10;
            vVar2 = s10.b(this.f36037h, vVar, this.f36041l, this.f36042m);
        } else {
            vVar2 = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.recycle();
        }
        if (this.f36030a.w(vVar2)) {
            kVar = this.f36030a.n(vVar2);
            enumC3315c = kVar.a(this.f36044o);
        } else {
            enumC3315c = EnumC3315c.NONE;
        }
        i2.k kVar2 = kVar;
        if (!this.f36043n.d(!this.f36030a.y(this.f36053x), enumC3313a, enumC3315c)) {
            return vVar2;
        }
        if (kVar2 == null) {
            throw new i.d(vVar2.get().getClass());
        }
        int i10 = a.f36058c[enumC3315c.ordinal()];
        if (i10 == 1) {
            c3534d = new C3534d(this.f36053x, this.f36038i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + enumC3315c);
            }
            c3534d = new x(this.f36030a.b(), this.f36053x, this.f36038i, this.f36041l, this.f36042m, lVar, cls, this.f36044o);
        }
        u c10 = u.c(vVar2);
        this.f36035f.d(c3534d, kVar2, c10);
        return c10;
    }

    void F(boolean z10) {
        if (this.f36036g.d(z10)) {
            G();
        }
    }

    boolean M() {
        EnumC0521h t10 = t(EnumC0521h.INITIALIZE);
        return t10 == EnumC0521h.RESOURCE_CACHE || t10 == EnumC0521h.DATA_CACHE;
    }

    @Override // k2.InterfaceC3536f.a
    public void b(i2.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, EnumC3313a enumC3313a, i2.f fVar2) {
        this.f36053x = fVar;
        this.f36055z = obj;
        this.f36025B = dVar;
        this.f36024A = enumC3313a;
        this.f36054y = fVar2;
        this.f36029F = fVar != this.f36030a.c().get(0);
        if (Thread.currentThread() != this.f36052w) {
            H(g.DECODE_DATA);
            return;
        }
        E2.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            r();
        } finally {
            E2.b.e();
        }
    }

    @Override // k2.InterfaceC3536f.a
    public void c(i2.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, EnumC3313a enumC3313a) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, enumC3313a, dVar.a());
        this.f36031b.add(qVar);
        if (Thread.currentThread() != this.f36052w) {
            H(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            I();
        }
    }

    @Override // k2.InterfaceC3536f.a
    public void d() {
        H(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // E2.a.f
    public E2.c e() {
        return this.f36032c;
    }

    public void n() {
        this.f36028E = true;
        InterfaceC3536f interfaceC3536f = this.f36026C;
        if (interfaceC3536f != null) {
            interfaceC3536f.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int v10 = v() - hVar.v();
        return v10 == 0 ? this.f36046q - hVar.f36046q : v10;
    }

    @Override // java.lang.Runnable
    public void run() {
        E2.b.c("DecodeJob#run(reason=%s, model=%s)", this.f36048s, this.f36051v);
        com.bumptech.glide.load.data.d dVar = this.f36025B;
        try {
            try {
                try {
                    if (this.f36028E) {
                        B();
                        if (dVar != null) {
                            dVar.b();
                        }
                        E2.b.e();
                        return;
                    }
                    K();
                    if (dVar != null) {
                        dVar.b();
                    }
                    E2.b.e();
                } catch (C3532b e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f36028E + ", stage: " + this.f36047r, th);
                }
                if (this.f36047r != EnumC0521h.ENCODE) {
                    this.f36031b.add(th);
                    B();
                }
                if (!this.f36028E) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            E2.b.e();
            throw th2;
        }
    }

    h w(com.bumptech.glide.e eVar, Object obj, n nVar, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, i2.h hVar2, b bVar, int i12) {
        this.f36030a.v(eVar, obj, fVar, i10, i11, jVar, cls, cls2, hVar, hVar2, map, z10, z11, this.f36033d);
        this.f36037h = eVar;
        this.f36038i = fVar;
        this.f36039j = hVar;
        this.f36040k = nVar;
        this.f36041l = i10;
        this.f36042m = i11;
        this.f36043n = jVar;
        this.f36050u = z12;
        this.f36044o = hVar2;
        this.f36045p = bVar;
        this.f36046q = i12;
        this.f36048s = g.INITIALIZE;
        this.f36051v = obj;
        return this;
    }
}
