package v3;

import A3.a;
import O3.b;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import b3.g;
import b3.j;
import b3.l;
import c3.AbstractC1721a;
import java.util.Map;
import java.util.concurrent.Executor;
import l3.AbstractC3605b;
import l3.InterfaceC3606c;
import u3.AbstractC4864a;
import u3.C4866c;
import u3.C4867d;
import z3.C5249a;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4921a implements B3.a, AbstractC4864a.InterfaceC0620a, a.InterfaceC0002a {

    /* renamed from: w, reason: collision with root package name */
    private static final Map f43863w = g.of("component_tag", "drawee");

    /* renamed from: x, reason: collision with root package name */
    private static final Map f43864x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: y, reason: collision with root package name */
    private static final Class f43865y = AbstractC4921a.class;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4864a f43867b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f43868c;

    /* renamed from: d, reason: collision with root package name */
    private C4867d f43869d;

    /* renamed from: e, reason: collision with root package name */
    private A3.a f43870e;

    /* renamed from: f, reason: collision with root package name */
    protected InterfaceC4924d f43871f;

    /* renamed from: h, reason: collision with root package name */
    private B3.c f43873h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f43874i;

    /* renamed from: j, reason: collision with root package name */
    private String f43875j;

    /* renamed from: k, reason: collision with root package name */
    private Object f43876k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43877l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f43878m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f43879n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f43880o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f43881p;

    /* renamed from: q, reason: collision with root package name */
    private String f43882q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC3606c f43883r;

    /* renamed from: s, reason: collision with root package name */
    private Object f43884s;

    /* renamed from: v, reason: collision with root package name */
    protected Drawable f43887v;

    /* renamed from: a, reason: collision with root package name */
    private final C4866c f43866a = C4866c.a();

    /* renamed from: g, reason: collision with root package name */
    protected O3.d f43872g = new O3.d();

    /* renamed from: t, reason: collision with root package name */
    private boolean f43885t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f43886u = false;

    /* renamed from: v3.a$a, reason: collision with other inner class name */
    class C0630a extends AbstractC3605b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43889b;

        C0630a(String str, boolean z10) {
            this.f43888a = str;
            this.f43889b = z10;
        }

        @Override // l3.AbstractC3605b, l3.e
        public void d(InterfaceC3606c interfaceC3606c) {
            boolean a10 = interfaceC3606c.a();
            AbstractC4921a.this.P(this.f43888a, interfaceC3606c, interfaceC3606c.f(), a10);
        }

        @Override // l3.AbstractC3605b
        public void e(InterfaceC3606c interfaceC3606c) {
            AbstractC4921a.this.M(this.f43888a, interfaceC3606c, interfaceC3606c.e(), true);
        }

        @Override // l3.AbstractC3605b
        public void f(InterfaceC3606c interfaceC3606c) {
            boolean a10 = interfaceC3606c.a();
            boolean g10 = interfaceC3606c.g();
            float f10 = interfaceC3606c.f();
            Object b10 = interfaceC3606c.b();
            if (b10 != null) {
                AbstractC4921a.this.O(this.f43888a, interfaceC3606c, b10, f10, a10, this.f43889b, g10);
            } else if (a10) {
                AbstractC4921a.this.M(this.f43888a, interfaceC3606c, new NullPointerException(), true);
            }
        }
    }

    /* renamed from: v3.a$b */
    private static class b extends f {
        private b() {
        }

        public static b e(InterfaceC4924d interfaceC4924d, InterfaceC4924d interfaceC4924d2) {
            if (n4.b.d()) {
                n4.b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.b(interfaceC4924d);
            bVar.b(interfaceC4924d2);
            if (n4.b.d()) {
                n4.b.b();
            }
            return bVar;
        }
    }

    public AbstractC4921a(AbstractC4864a abstractC4864a, Executor executor, String str, Object obj) {
        this.f43867b = abstractC4864a;
        this.f43868c = executor;
        D(str, obj);
    }

    private B3.c C() {
        B3.c cVar = this.f43873h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f43876k);
    }

    private synchronized void D(String str, Object obj) {
        AbstractC4864a abstractC4864a;
        try {
            if (n4.b.d()) {
                n4.b.a("AbstractDraweeController#init");
            }
            this.f43866a.b(C4866c.a.ON_INIT_CONTROLLER);
            if (!this.f43885t && (abstractC4864a = this.f43867b) != null) {
                abstractC4864a.a(this);
            }
            this.f43877l = false;
            this.f43879n = false;
            R();
            this.f43881p = false;
            C4867d c4867d = this.f43869d;
            if (c4867d != null) {
                c4867d.a();
            }
            A3.a aVar = this.f43870e;
            if (aVar != null) {
                aVar.a();
                this.f43870e.f(this);
            }
            InterfaceC4924d interfaceC4924d = this.f43871f;
            if (interfaceC4924d instanceof b) {
                ((b) interfaceC4924d).c();
            } else {
                this.f43871f = null;
            }
            B3.c cVar = this.f43873h;
            if (cVar != null) {
                cVar.reset();
                this.f43873h.a(null);
                this.f43873h = null;
            }
            this.f43874i = null;
            if (AbstractC1721a.x(2)) {
                AbstractC1721a.B(f43865y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f43875j, str);
            }
            this.f43875j = str;
            this.f43876k = obj;
            if (n4.b.d()) {
                n4.b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean F(String str, InterfaceC3606c interfaceC3606c) {
        if (interfaceC3606c == null && this.f43883r == null) {
            return true;
        }
        return str.equals(this.f43875j) && interfaceC3606c == this.f43883r && this.f43878m;
    }

    private void H(String str, Throwable th) {
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.C(f43865y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f43875j, str, th);
        }
    }

    private void I(String str, Object obj) {
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.D(f43865y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f43875j, str, x(obj), Integer.valueOf(y(obj)));
        }
    }

    private b.a J(Map map, Map map2, Uri uri) {
        String str;
        PointF pointF;
        B3.c cVar = this.f43873h;
        if (cVar instanceof C5249a) {
            C5249a c5249a = (C5249a) cVar;
            String valueOf = String.valueOf(c5249a.m());
            pointF = c5249a.l();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return N3.b.a(f43863w, f43864x, map, null, u(), str, pointF, map2, p(), G(), uri);
    }

    private b.a K(InterfaceC3606c interfaceC3606c, Object obj, Uri uri) {
        return J(interfaceC3606c == null ? null : interfaceC3606c.getExtras(), L(obj), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, InterfaceC3606c interfaceC3606c, Throwable th, boolean z10) {
        Drawable drawable;
        if (n4.b.d()) {
            n4.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!F(str, interfaceC3606c)) {
            H("ignore_old_datasource @ onFailure", th);
            interfaceC3606c.close();
            if (n4.b.d()) {
                n4.b.b();
                return;
            }
            return;
        }
        this.f43866a.b(z10 ? C4866c.a.ON_DATASOURCE_FAILURE : C4866c.a.ON_DATASOURCE_FAILURE_INT);
        if (z10) {
            H("final_failed @ onFailure", th);
            this.f43883r = null;
            this.f43880o = true;
            B3.c cVar = this.f43873h;
            if (cVar != null) {
                if (this.f43881p && (drawable = this.f43887v) != null) {
                    cVar.f(drawable, 1.0f, true);
                } else if (h0()) {
                    cVar.b(th);
                } else {
                    cVar.c(th);
                }
            }
            U(th, interfaceC3606c);
        } else {
            H("intermediate_failed @ onFailure", th);
            V(th);
        }
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, InterfaceC3606c interfaceC3606c, Object obj, float f10, boolean z10, boolean z11, boolean z12) {
        try {
            if (n4.b.d()) {
                n4.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!F(str, interfaceC3606c)) {
                I("ignore_old_datasource @ onNewResult", obj);
                S(obj);
                interfaceC3606c.close();
                if (n4.b.d()) {
                    n4.b.b();
                    return;
                }
                return;
            }
            this.f43866a.b(z10 ? C4866c.a.ON_DATASOURCE_RESULT : C4866c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable m10 = m(obj);
                Object obj2 = this.f43884s;
                Drawable drawable = this.f43887v;
                this.f43884s = obj;
                this.f43887v = m10;
                try {
                    if (z10) {
                        I("set_final_result @ onNewResult", obj);
                        this.f43883r = null;
                        C().f(m10, 1.0f, z11);
                        Z(str, obj, interfaceC3606c);
                    } else if (z12) {
                        I("set_temporary_result @ onNewResult", obj);
                        C().f(m10, 1.0f, z11);
                        Z(str, obj, interfaceC3606c);
                    } else {
                        I("set_intermediate_result @ onNewResult", obj);
                        C().f(m10, f10, z11);
                        W(str, obj);
                    }
                    if (drawable != null && drawable != m10) {
                        Q(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        I("release_previous_result @ onNewResult", obj2);
                        S(obj2);
                    }
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != m10) {
                        Q(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        I("release_previous_result @ onNewResult", obj2);
                        S(obj2);
                    }
                    throw th;
                }
            } catch (Exception e10) {
                I("drawable_failed @ onNewResult", obj);
                S(obj);
                M(str, interfaceC3606c, e10, z10);
                if (n4.b.d()) {
                    n4.b.b();
                }
            }
        } catch (Throwable th2) {
            if (n4.b.d()) {
                n4.b.b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(String str, InterfaceC3606c interfaceC3606c, float f10, boolean z10) {
        if (!F(str, interfaceC3606c)) {
            H("ignore_old_datasource @ onProgress", null);
            interfaceC3606c.close();
        } else {
            if (z10) {
                return;
            }
            this.f43873h.d(f10, false);
        }
    }

    private void R() {
        Map map;
        boolean z10 = this.f43878m;
        this.f43878m = false;
        this.f43880o = false;
        InterfaceC3606c interfaceC3606c = this.f43883r;
        Map map2 = null;
        if (interfaceC3606c != null) {
            map = interfaceC3606c.getExtras();
            this.f43883r.close();
            this.f43883r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f43887v;
        if (drawable != null) {
            Q(drawable);
        }
        if (this.f43882q != null) {
            this.f43882q = null;
        }
        this.f43887v = null;
        Object obj = this.f43884s;
        if (obj != null) {
            Map L10 = L(z(obj));
            I("release", this.f43884s);
            S(this.f43884s);
            this.f43884s = null;
            map2 = L10;
        }
        if (z10) {
            X(map, map2);
        }
    }

    private void U(Throwable th, InterfaceC3606c interfaceC3606c) {
        b.a K10 = K(interfaceC3606c, null, null);
        q().i(this.f43875j, th);
        r().f(this.f43875j, th, K10);
    }

    private void V(Throwable th) {
        q().p(this.f43875j, th);
        r().d(this.f43875j);
    }

    private void W(String str, Object obj) {
        Object z10 = z(obj);
        q().a(str, z10);
        r().a(str, z10);
    }

    private void X(Map map, Map map2) {
        q().k(this.f43875j);
        r().c(this.f43875j, J(map, map2, null));
    }

    private void Z(String str, Object obj, InterfaceC3606c interfaceC3606c) {
        Object z10 = z(obj);
        q().f(str, z10, n());
        r().g(str, z10, K(interfaceC3606c, z10, null));
    }

    private boolean h0() {
        C4867d c4867d;
        return this.f43880o && (c4867d = this.f43869d) != null && c4867d.e();
    }

    private Rect u() {
        B3.c cVar = this.f43873h;
        if (cVar == null) {
            return null;
        }
        return cVar.getBounds();
    }

    protected abstract Uri A();

    protected C4867d B() {
        if (this.f43869d == null) {
            this.f43869d = new C4867d();
        }
        return this.f43869d;
    }

    protected void E(String str, Object obj) {
        D(str, obj);
        this.f43885t = false;
        this.f43886u = false;
    }

    protected boolean G() {
        return this.f43886u;
    }

    public abstract Map L(Object obj);

    protected abstract void Q(Drawable drawable);

    protected abstract void S(Object obj);

    public void T(O3.b bVar) {
        this.f43872g.j(bVar);
    }

    protected void Y(InterfaceC3606c interfaceC3606c, Object obj) {
        q().o(this.f43875j, this.f43876k);
        r().e(this.f43875j, this.f43876k, K(interfaceC3606c, obj, A()));
    }

    @Override // u3.AbstractC4864a.InterfaceC0620a
    public void a() {
        this.f43866a.b(C4866c.a.ON_RELEASE_CONTROLLER);
        C4867d c4867d = this.f43869d;
        if (c4867d != null) {
            c4867d.c();
        }
        A3.a aVar = this.f43870e;
        if (aVar != null) {
            aVar.e();
        }
        B3.c cVar = this.f43873h;
        if (cVar != null) {
            cVar.reset();
        }
        R();
    }

    public void a0(String str) {
        this.f43882q = str;
    }

    @Override // B3.a
    public void b() {
        if (n4.b.d()) {
            n4.b.a("AbstractDraweeController#onDetach");
        }
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.A(f43865y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f43875j);
        }
        this.f43866a.b(C4866c.a.ON_DETACH_CONTROLLER);
        this.f43877l = false;
        this.f43867b.d(this);
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    protected void b0(Drawable drawable) {
        this.f43874i = drawable;
        B3.c cVar = this.f43873h;
        if (cVar != null) {
            cVar.a(drawable);
        }
    }

    @Override // B3.a
    public B3.b c() {
        return this.f43873h;
    }

    @Override // B3.a
    public boolean d(MotionEvent motionEvent) {
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.B(f43865y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f43875j, motionEvent);
        }
        A3.a aVar = this.f43870e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !g0()) {
            return false;
        }
        this.f43870e.d(motionEvent);
        return true;
    }

    protected void d0(A3.a aVar) {
        this.f43870e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // A3.a.InterfaceC0002a
    public boolean e() {
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.A(f43865y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f43875j);
        }
        if (!h0()) {
            return false;
        }
        this.f43869d.b();
        this.f43873h.reset();
        i0();
        return true;
    }

    protected void e0(boolean z10) {
        this.f43886u = z10;
    }

    @Override // B3.a
    public void f(B3.b bVar) {
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.B(f43865y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f43875j, bVar);
        }
        this.f43866a.b(bVar != null ? C4866c.a.ON_SET_HIERARCHY : C4866c.a.ON_CLEAR_HIERARCHY);
        if (this.f43878m) {
            this.f43867b.a(this);
            a();
        }
        B3.c cVar = this.f43873h;
        if (cVar != null) {
            cVar.a(null);
            this.f43873h = null;
        }
        if (bVar != null) {
            l.b(Boolean.valueOf(bVar instanceof B3.c));
            B3.c cVar2 = (B3.c) bVar;
            this.f43873h = cVar2;
            cVar2.a(this.f43874i);
        }
    }

    protected void f0(boolean z10) {
        this.f43881p = z10;
    }

    @Override // B3.a
    public void g() {
        if (n4.b.d()) {
            n4.b.a("AbstractDraweeController#onAttach");
        }
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.B(f43865y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f43875j, this.f43878m ? "request already submitted" : "request needs submit");
        }
        this.f43866a.b(C4866c.a.ON_ATTACH_CONTROLLER);
        l.g(this.f43873h);
        this.f43867b.a(this);
        this.f43877l = true;
        if (!this.f43878m) {
            i0();
        }
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    protected boolean g0() {
        return h0();
    }

    protected void i0() {
        if (n4.b.d()) {
            n4.b.a("AbstractDraweeController#submitRequest");
        }
        Object o10 = o();
        if (o10 != null) {
            if (n4.b.d()) {
                n4.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f43883r = null;
            this.f43878m = true;
            this.f43880o = false;
            this.f43866a.b(C4866c.a.ON_SUBMIT_CACHE_HIT);
            Y(this.f43883r, z(o10));
            N(this.f43875j, o10);
            O(this.f43875j, this.f43883r, o10, 1.0f, true, true, true);
            if (n4.b.d()) {
                n4.b.b();
            }
            if (n4.b.d()) {
                n4.b.b();
                return;
            }
            return;
        }
        this.f43866a.b(C4866c.a.ON_DATASOURCE_SUBMIT);
        this.f43873h.d(0.0f, true);
        this.f43878m = true;
        this.f43880o = false;
        InterfaceC3606c t10 = t();
        this.f43883r = t10;
        Y(t10, null);
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.B(f43865y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f43875j, Integer.valueOf(System.identityHashCode(this.f43883r)));
        }
        this.f43883r.c(new C0630a(this.f43875j, this.f43883r.d()), this.f43868c);
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    public void k(InterfaceC4924d interfaceC4924d) {
        l.g(interfaceC4924d);
        InterfaceC4924d interfaceC4924d2 = this.f43871f;
        if (interfaceC4924d2 instanceof b) {
            ((b) interfaceC4924d2).b(interfaceC4924d);
        } else if (interfaceC4924d2 != null) {
            this.f43871f = b.e(interfaceC4924d2, interfaceC4924d);
        } else {
            this.f43871f = interfaceC4924d;
        }
    }

    public void l(O3.b bVar) {
        this.f43872g.i(bVar);
    }

    protected abstract Drawable m(Object obj);

    public Animatable n() {
        Object obj = this.f43887v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected abstract Object o();

    public Object p() {
        return this.f43876k;
    }

    protected InterfaceC4924d q() {
        InterfaceC4924d interfaceC4924d = this.f43871f;
        return interfaceC4924d == null ? C4923c.b() : interfaceC4924d;
    }

    protected O3.b r() {
        return this.f43872g;
    }

    protected Drawable s() {
        return this.f43874i;
    }

    protected abstract InterfaceC3606c t();

    public String toString() {
        return j.c(this).c("isAttached", this.f43877l).c("isRequestSubmitted", this.f43878m).c("hasFetchFailed", this.f43880o).a("fetchedImage", y(this.f43884s)).b("events", this.f43866a.toString()).toString();
    }

    protected A3.a v() {
        return this.f43870e;
    }

    public String w() {
        return this.f43875j;
    }

    protected String x(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "<null>";
    }

    protected abstract int y(Object obj);

    protected abstract Object z(Object obj);

    public void c0(e eVar) {
    }

    protected void N(String str, Object obj) {
    }
}
