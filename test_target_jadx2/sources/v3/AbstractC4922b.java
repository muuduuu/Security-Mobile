package v3;

import android.content.Context;
import android.graphics.drawable.Animatable;
import b3.j;
import b3.l;
import b3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import l3.AbstractC3607d;
import l3.InterfaceC3606c;
import l3.g;
import l3.h;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4922b {

    /* renamed from: q, reason: collision with root package name */
    private static final InterfaceC4924d f43891q = new a();

    /* renamed from: r, reason: collision with root package name */
    private static final NullPointerException f43892r = new NullPointerException("No image request was specified!");

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicLong f43893s = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    private final Context f43894a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f43895b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f43896c;

    /* renamed from: d, reason: collision with root package name */
    private Object f43897d;

    /* renamed from: e, reason: collision with root package name */
    private Object f43898e;

    /* renamed from: f, reason: collision with root package name */
    private Object f43899f;

    /* renamed from: g, reason: collision with root package name */
    private Object[] f43900g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43901h;

    /* renamed from: i, reason: collision with root package name */
    private o f43902i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4924d f43903j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43904k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43905l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f43906m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f43907n = false;

    /* renamed from: o, reason: collision with root package name */
    private String f43908o;

    /* renamed from: p, reason: collision with root package name */
    private B3.a f43909p;

    /* renamed from: v3.b$a */
    class a extends C4923c {
        a() {
        }

        @Override // v3.C4923c, v3.InterfaceC4924d
        public void f(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: v3.b$b, reason: collision with other inner class name */
    class C0631b implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B3.a f43910a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43911b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f43912c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f43913d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f43914e;

        C0631b(B3.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f43910a = aVar;
            this.f43911b = str;
            this.f43912c = obj;
            this.f43913d = obj2;
            this.f43914e = cVar;
        }

        @Override // b3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC3606c get() {
            return AbstractC4922b.this.g(this.f43910a, this.f43911b, this.f43912c, this.f43913d, this.f43914e);
        }

        public String toString() {
            return j.c(this).b("request", this.f43912c.toString()).toString();
        }
    }

    /* renamed from: v3.b$c */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected AbstractC4922b(Context context, Set set, Set set2) {
        this.f43894a = context;
        this.f43895b = set;
        this.f43896c = set2;
        q();
    }

    protected static String c() {
        return String.valueOf(f43893s.getAndIncrement());
    }

    private void q() {
        this.f43897d = null;
        this.f43898e = null;
        this.f43899f = null;
        this.f43900g = null;
        this.f43901h = true;
        this.f43903j = null;
        this.f43904k = false;
        this.f43905l = false;
        this.f43907n = false;
        this.f43909p = null;
        this.f43908o = null;
    }

    public AbstractC4922b A(InterfaceC4924d interfaceC4924d) {
        this.f43903j = interfaceC4924d;
        return p();
    }

    public AbstractC4922b B(Object obj) {
        this.f43898e = obj;
        return p();
    }

    public AbstractC4922b C(Object obj) {
        this.f43899f = obj;
        return p();
    }

    public AbstractC4922b D(B3.a aVar) {
        this.f43909p = aVar;
        return p();
    }

    protected void E() {
        boolean z10 = true;
        l.j(this.f43900g == null || this.f43898e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f43902i != null && (this.f43900g != null || this.f43898e != null || this.f43899f != null)) {
            z10 = false;
        }
        l.j(z10, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public AbstractC4921a a() {
        Object obj;
        E();
        if (this.f43898e == null && this.f43900g == null && (obj = this.f43899f) != null) {
            this.f43898e = obj;
            this.f43899f = null;
        }
        return b();
    }

    protected AbstractC4921a b() {
        if (n4.b.d()) {
            n4.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC4921a v10 = v();
        v10.e0(r());
        v10.f0(o());
        v10.a0(e());
        f();
        v10.c0(null);
        u(v10);
        s(v10);
        if (n4.b.d()) {
            n4.b.b();
        }
        return v10;
    }

    public Object d() {
        return this.f43897d;
    }

    public String e() {
        return this.f43908o;
    }

    public e f() {
        return null;
    }

    protected abstract InterfaceC3606c g(B3.a aVar, String str, Object obj, Object obj2, c cVar);

    protected o h(B3.a aVar, String str, Object obj) {
        return i(aVar, str, obj, c.FULL_FETCH);
    }

    protected o i(B3.a aVar, String str, Object obj, c cVar) {
        return new C0631b(aVar, str, obj, d(), cVar);
    }

    protected o j(B3.a aVar, String str, Object[] objArr, boolean z10) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z10) {
            for (Object obj : objArr) {
                arrayList.add(i(aVar, str, obj, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(h(aVar, str, obj2));
        }
        return g.b(arrayList);
    }

    public Object[] k() {
        return this.f43900g;
    }

    public Object l() {
        return this.f43898e;
    }

    public Object m() {
        return this.f43899f;
    }

    public B3.a n() {
        return this.f43909p;
    }

    public boolean o() {
        return this.f43906m;
    }

    public boolean r() {
        return this.f43907n;
    }

    protected void s(AbstractC4921a abstractC4921a) {
        Set set = this.f43895b;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                abstractC4921a.k((InterfaceC4924d) it.next());
            }
        }
        Set set2 = this.f43896c;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                abstractC4921a.l((O3.b) it2.next());
            }
        }
        InterfaceC4924d interfaceC4924d = this.f43903j;
        if (interfaceC4924d != null) {
            abstractC4921a.k(interfaceC4924d);
        }
        if (this.f43905l) {
            abstractC4921a.k(f43891q);
        }
    }

    protected void t(AbstractC4921a abstractC4921a) {
        if (abstractC4921a.v() == null) {
            abstractC4921a.d0(A3.a.c(this.f43894a));
        }
    }

    protected void u(AbstractC4921a abstractC4921a) {
        if (this.f43904k) {
            abstractC4921a.B().d(this.f43904k);
            t(abstractC4921a);
        }
    }

    protected abstract AbstractC4921a v();

    protected o w(B3.a aVar, String str) {
        o j10;
        o oVar = this.f43902i;
        if (oVar != null) {
            return oVar;
        }
        Object obj = this.f43898e;
        if (obj != null) {
            j10 = h(aVar, str, obj);
        } else {
            Object[] objArr = this.f43900g;
            j10 = objArr != null ? j(aVar, str, objArr, this.f43901h) : null;
        }
        if (j10 != null && this.f43899f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(j10);
            arrayList.add(h(aVar, str, this.f43899f));
            j10 = h.c(arrayList, false);
        }
        return j10 == null ? AbstractC3607d.a(f43892r) : j10;
    }

    public AbstractC4922b x() {
        q();
        return p();
    }

    public AbstractC4922b y(boolean z10) {
        this.f43905l = z10;
        return p();
    }

    public AbstractC4922b z(Object obj) {
        this.f43897d = obj;
        return p();
    }

    protected final AbstractC4922b p() {
        return this;
    }
}
