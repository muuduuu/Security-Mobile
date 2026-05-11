package O3;

import O3.b;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private String f7047a;

    /* renamed from: b, reason: collision with root package name */
    private String f7048b;

    /* renamed from: c, reason: collision with root package name */
    private Object f7049c;

    /* renamed from: d, reason: collision with root package name */
    private Object f7050d;

    /* renamed from: e, reason: collision with root package name */
    private Object f7051e;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7059m;

    /* renamed from: p, reason: collision with root package name */
    private Throwable f7062p;

    /* renamed from: v, reason: collision with root package name */
    private b.a f7068v;

    /* renamed from: f, reason: collision with root package name */
    private long f7052f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f7053g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f7054h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f7055i = -1;

    /* renamed from: j, reason: collision with root package name */
    private long f7056j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f7057k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f7058l = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f7060n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f7061o = -1;

    /* renamed from: q, reason: collision with root package name */
    private e f7063q = e.UNKNOWN;

    /* renamed from: r, reason: collision with root package name */
    private l f7064r = l.UNKNOWN;

    /* renamed from: s, reason: collision with root package name */
    private long f7065s = -1;

    /* renamed from: t, reason: collision with root package name */
    private long f7066t = -1;

    /* renamed from: u, reason: collision with root package name */
    private long f7067u = -1;

    public e a() {
        return this.f7063q;
    }

    public void b() {
        this.f7048b = null;
        this.f7049c = null;
        this.f7050d = null;
        this.f7051e = null;
        this.f7059m = false;
        this.f7060n = -1;
        this.f7061o = -1;
        this.f7062p = null;
        this.f7063q = e.UNKNOWN;
        this.f7064r = l.UNKNOWN;
        this.f7068v = null;
        c();
    }

    public void c() {
        this.f7057k = -1L;
        this.f7058l = -1L;
        this.f7052f = -1L;
        this.f7054h = -1L;
        this.f7055i = -1L;
        this.f7056j = -1L;
        this.f7065s = -1L;
        this.f7066t = -1L;
        this.f7067u = -1L;
    }

    public void d(Object obj) {
        this.f7050d = obj;
    }

    public void e(long j10) {
        this.f7056j = j10;
    }

    public void f(long j10) {
        this.f7055i = j10;
    }

    public void g(long j10) {
        this.f7054h = j10;
    }

    public void h(String str) {
        this.f7047a = str;
    }

    public void i(long j10) {
        this.f7053g = j10;
    }

    public void j(long j10) {
        this.f7052f = j10;
    }

    public void k(Throwable th) {
        this.f7062p = th;
    }

    public void l(b.a aVar) {
        this.f7068v = aVar;
    }

    public void m(Object obj) {
        this.f7051e = obj;
    }

    public void n(e eVar) {
        this.f7063q = eVar;
    }

    public void o(Object obj) {
        this.f7049c = obj;
    }

    public void p(long j10) {
        this.f7058l = j10;
    }

    public void q(long j10) {
        this.f7057k = j10;
    }

    public void r(long j10) {
        this.f7066t = j10;
    }

    public void s(int i10) {
        this.f7061o = i10;
    }

    public void t(int i10) {
        this.f7060n = i10;
    }

    public void u(boolean z10) {
        this.f7059m = z10;
    }

    public void v(String str) {
        this.f7048b = str;
    }

    public void w(long j10) {
        this.f7065s = j10;
    }

    public void x(boolean z10) {
        this.f7064r = z10 ? l.VISIBLE : l.INVISIBLE;
    }

    public f y() {
        return new f(this.f7047a, this.f7048b, this.f7049c, this.f7050d, this.f7051e, this.f7052f, this.f7053g, this.f7054h, this.f7055i, this.f7056j, this.f7057k, this.f7058l, this.f7059m, this.f7060n, this.f7061o, this.f7062p, this.f7064r, this.f7065s, this.f7066t, this.f7067u, null, this.f7068v);
    }
}
