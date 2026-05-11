package H;

import A.AbstractC0700h0;
import A.B;
import A.C0698g0;
import A.I0;
import A.InterfaceC0703j;
import A.InterfaceC0705k;
import A.InterfaceC0713p;
import A.J0;
import A.L0;
import A.W;
import A.r0;
import E.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC1424a;
import androidx.camera.core.impl.AbstractC1449m0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C1453o0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1473z;
import androidx.camera.core.impl.S0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.conscrypt.BuildConfig;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0703j {

    /* renamed from: a, reason: collision with root package name */
    private final H f3039a;

    /* renamed from: b, reason: collision with root package name */
    private final H f3040b;

    /* renamed from: c, reason: collision with root package name */
    private final E f3041c;

    /* renamed from: d, reason: collision with root package name */
    private final m1 f3042d;

    /* renamed from: e, reason: collision with root package name */
    private final b f3043e;

    /* renamed from: h, reason: collision with root package name */
    private final B.a f3046h;

    /* renamed from: i, reason: collision with root package name */
    private L0 f3047i;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1473z f3049k;

    /* renamed from: o, reason: collision with root package name */
    private J0 f3053o;

    /* renamed from: p, reason: collision with root package name */
    private Q.h f3054p;

    /* renamed from: q, reason: collision with root package name */
    private final S0 f3055q;

    /* renamed from: r, reason: collision with root package name */
    private final T0 f3056r;

    /* renamed from: s, reason: collision with root package name */
    private final T0 f3057s;

    /* renamed from: t, reason: collision with root package name */
    private final C0698g0 f3058t;

    /* renamed from: u, reason: collision with root package name */
    private final C0698g0 f3059u;

    /* renamed from: f, reason: collision with root package name */
    private final List f3044f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f3045g = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List f3048j = Collections.emptyList();

    /* renamed from: l, reason: collision with root package name */
    private final Object f3050l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private boolean f3051m = true;

    /* renamed from: n, reason: collision with root package name */
    private V f3052n = null;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public static abstract class b {
        public static b a(String str, AbstractC1449m0 abstractC1449m0) {
            return new H.a(str, abstractC1449m0);
        }

        public abstract AbstractC1449m0 b();

        public abstract String c();
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        l1 f3060a;

        /* renamed from: b, reason: collision with root package name */
        l1 f3061b;

        c(l1 l1Var, l1 l1Var2) {
            this.f3060a = l1Var;
            this.f3061b = l1Var2;
        }
    }

    public f(H h10, H h11, T0 t02, T0 t03, C0698g0 c0698g0, C0698g0 c0698g02, B.a aVar, E e10, m1 m1Var) {
        this.f3039a = h10;
        this.f3040b = h11;
        this.f3058t = c0698g0;
        this.f3059u = c0698g02;
        this.f3046h = aVar;
        this.f3041c = e10;
        this.f3042d = m1Var;
        InterfaceC1473z a10 = t02.a();
        this.f3049k = a10;
        a10.Y(null);
        this.f3055q = new S0(h10.h(), null);
        this.f3056r = t02;
        this.f3057s = t03;
        this.f3043e = B(t02, t03);
    }

    public static b B(T0 t02, T0 t03) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t02.f());
        sb2.append(t03 == null ? BuildConfig.FLAVOR : t03.f());
        return b.a(sb2.toString(), t02.a().P());
    }

    private static l1 C(m1 m1Var, Q.h hVar) {
        l1 k10 = new r0.a().e().k(false, m1Var);
        if (k10 == null) {
            return null;
        }
        B0 e02 = B0.e0(k10);
        e02.f0(m.f3079c);
        return hVar.z(e02).c();
    }

    private int E() {
        synchronized (this.f3050l) {
            try {
                return this.f3046h.a() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Map F(Collection collection, m1 m1Var, m1 m1Var2) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            hashMap.put(j02, new c(Q.h.q0(j02) ? C(m1Var, (Q.h) j02) : j02.k(false, m1Var), j02.k(true, m1Var2)));
        }
        return hashMap;
    }

    private int H(boolean z10) {
        int i10;
        synchronized (this.f3050l) {
            try {
                Iterator it = this.f3048j.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
                i10 = z10 ? 3 : 0;
            } finally {
            }
        }
        return i10;
    }

    private Set I(Collection collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int H10 = H(z10);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            y0.f.b(!Q.h.q0(j02), "Only support one level of sharing for now.");
            if (j02.B(H10)) {
                hashSet.add(j02);
            }
        }
        return hashSet;
    }

    private boolean K() {
        synchronized (this.f3050l) {
            this.f3049k.Y(null);
        }
        return false;
    }

    private static boolean L(Z0 z02, V0 v02) {
        V d10 = z02.d();
        V f10 = v02.f();
        if (d10.e().size() != v02.f().e().size()) {
            return true;
        }
        for (V.a aVar : d10.e()) {
            if (!f10.b(aVar) || !Objects.equals(f10.a(aVar), d10.a(aVar))) {
                return true;
            }
        }
        return false;
    }

    private static boolean M(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (T(((J0) it.next()).j().k())) {
                return true;
            }
        }
        return false;
    }

    private static boolean N(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (S(j02)) {
                l1 j10 = j02.j();
                V.a aVar = C1453o0.f14662N;
                if (j10.b(aVar) && ((Integer) y0.f.g((Integer) j10.a(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean O(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (W((J0) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean P() {
        boolean z10;
        synchronized (this.f3050l) {
            z10 = true;
            if (this.f3049k.D() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    private static boolean Q(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (U(j02) || Q.h.q0(j02)) {
                z10 = true;
            } else if (S(j02)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    private static boolean R(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (U(j02) || Q.h.q0(j02)) {
                z11 = true;
            } else if (S(j02)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    private static boolean S(J0 j02) {
        return j02 instanceof W;
    }

    private static boolean T(B b10) {
        return (b10.a() == 10) || (b10.b() != 1 && b10.b() != 0);
    }

    private static boolean U(J0 j02) {
        return j02 instanceof r0;
    }

    static boolean V(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (j02.B(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    private static boolean W(J0 j02) {
        if (j02 != null) {
            if (j02.j().b(l1.f14636F)) {
                return j02.j().F() == m1.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", j02 + " UseCase does not have capture type.");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(Surface surface, SurfaceTexture surfaceTexture, I0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(I0 i02) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(i02.p().getWidth(), i02.p().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        i02.D(surface, F.c.b(), new InterfaceC5159a() { // from class: H.e
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                f.X(surface, surfaceTexture, (I0.g) obj);
            }
        });
    }

    private void a0() {
        synchronized (this.f3050l) {
            try {
                if (this.f3052n != null) {
                    this.f3039a.h().e(this.f3052n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List c0(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).S(null);
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return arrayList;
    }

    static void e0(List list, Collection collection, Collection collection2) {
        List c02 = c0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List c03 = c0(c02, arrayList);
        if (c03.size() > 0) {
            AbstractC0700h0.l("CameraUseCaseAdapter", "Unused effects: " + c03);
        }
    }

    private void g0(Map map, Collection collection) {
        synchronized (this.f3050l) {
            try {
                if (this.f3047i != null && !collection.isEmpty()) {
                    Map a10 = o.a(this.f3039a.h().g(), this.f3039a.q().i() == 0, this.f3047i.a(), this.f3039a.q().m(this.f3047i.c()), this.f3047i.d(), this.f3047i.b(), map);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        J0 j02 = (J0) it.next();
                        j02.V((Rect) y0.f.g((Rect) a10.get(j02)));
                    }
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    J0 j03 = (J0) it2.next();
                    j03.T(u(this.f3039a.h().g(), ((Z0) y0.f.g((Z0) map.get(j03))).e()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void r() {
        synchronized (this.f3050l) {
            D h10 = this.f3039a.h();
            this.f3052n = h10.k();
            h10.n();
        }
    }

    static Collection s(Collection collection, J0 j02, Q.h hVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (j02 != null) {
            arrayList.add(j02);
        }
        if (hVar != null) {
            arrayList.add(hVar);
            arrayList.removeAll(hVar.k0());
        }
        return arrayList;
    }

    private J0 t(Collection collection, Q.h hVar) {
        J0 j02;
        synchronized (this.f3050l) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (hVar != null) {
                    arrayList.add(hVar);
                    arrayList.removeAll(hVar.k0());
                }
                if (P()) {
                    if (R(arrayList)) {
                        j02 = U(this.f3053o) ? this.f3053o : y();
                    } else if (Q(arrayList)) {
                        j02 = S(this.f3053o) ? this.f3053o : x();
                    }
                }
                j02 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j02;
    }

    private static Matrix u(Rect rect, Size size) {
        y0.f.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map v(int i10, G g10, Collection collection, Collection collection2, Map map) {
        Rect rect;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        String f10 = g10.f();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            J0 j02 = (J0) it.next();
            AbstractC1424a a10 = AbstractC1424a.a(this.f3041c.a(i10, f10, j02.m(), j02.f()), j02.m(), j02.f(), ((Z0) y0.f.g(j02.e())).b(), Q.h.i0(j02), j02.e().d(), j02.j().I(null));
            arrayList.add(a10);
            hashMap2.put(a10, j02);
            hashMap.put(j02, j02.e());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.f3039a.h().g();
            } catch (NullPointerException unused) {
                rect = null;
            }
            k kVar = new k(g10, rect != null ? r.m(rect) : null);
            Iterator it2 = collection.iterator();
            loop1: while (true) {
                z10 = false;
                while (it2.hasNext()) {
                    J0 j03 = (J0) it2.next();
                    c cVar = (c) map.get(j03);
                    l1 D10 = j03.D(g10, cVar.f3060a, cVar.f3061b);
                    hashMap3.put(D10, j03);
                    hashMap4.put(D10, kVar.m(D10));
                    if (j03.j() instanceof androidx.camera.core.impl.J0) {
                        if (((androidx.camera.core.impl.J0) j03.j()).O() == 2) {
                            z10 = true;
                        }
                    }
                }
            }
            Pair b10 = this.f3041c.b(i10, f10, arrayList, hashMap4, z10, O(collection));
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((J0) entry.getValue(), (Z0) ((Map) b10.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) b10.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((J0) hashMap2.get(entry2.getKey()), (Z0) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    private void w(Collection collection) {
        if (K()) {
            if (M(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (N(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f3050l) {
            try {
                if (!this.f3048j.isEmpty() && N(collection)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    private W x() {
        return new W.b().q("ImageCapture-Extra").e();
    }

    private r0 y() {
        r0 e10 = new r0.a().n("Preview-Extra").e();
        e10.k0(new r0.c() { // from class: H.d
            @Override // A.r0.c
            public final void a(I0 i02) {
                f.Y(i02);
            }
        });
        return e10;
    }

    private Q.h z(Collection collection, boolean z10) {
        synchronized (this.f3050l) {
            try {
                Set I10 = I(collection, z10);
                if (I10.size() >= 2 || (K() && O(I10))) {
                    Q.h hVar = this.f3054p;
                    if (hVar != null && hVar.k0().equals(I10)) {
                        Q.h hVar2 = this.f3054p;
                        Objects.requireNonNull(hVar2);
                        return hVar2;
                    }
                    if (!V(I10)) {
                        return null;
                    }
                    return new Q.h(this.f3039a, this.f3040b, this.f3058t, this.f3059u, I10, this.f3042d);
                }
                return null;
            } finally {
            }
        }
    }

    public void A() {
        synchronized (this.f3050l) {
            try {
                if (this.f3051m) {
                    this.f3039a.n(new ArrayList(this.f3045g));
                    H h10 = this.f3040b;
                    if (h10 != null) {
                        h10.n(new ArrayList(this.f3045g));
                    }
                    r();
                    this.f3051m = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b D() {
        return this.f3043e;
    }

    public InterfaceC0713p G() {
        return this.f3057s;
    }

    public List J() {
        ArrayList arrayList;
        synchronized (this.f3050l) {
            arrayList = new ArrayList(this.f3044f);
        }
        return arrayList;
    }

    public void Z(Collection collection) {
        synchronized (this.f3050l) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3044f);
            linkedHashSet.removeAll(collection);
            H h10 = this.f3040b;
            f0(linkedHashSet, h10 != null, h10 != null);
        }
    }

    @Override // A.InterfaceC0703j
    public InterfaceC0705k a() {
        return this.f3055q;
    }

    public void b0(List list) {
        synchronized (this.f3050l) {
            this.f3048j = list;
        }
    }

    @Override // A.InterfaceC0703j
    public InterfaceC0713p c() {
        return this.f3056r;
    }

    public void d0(L0 l02) {
        synchronized (this.f3050l) {
            this.f3047i = l02;
        }
    }

    void f0(Collection collection, boolean z10, boolean z11) {
        Map map;
        Z0 z02;
        V d10;
        synchronized (this.f3050l) {
            try {
                w(collection);
                if (!z10 && K() && O(collection)) {
                    f0(collection, true, z11);
                    return;
                }
                Q.h z12 = z(collection, z10);
                J0 t10 = t(collection, z12);
                Collection s10 = s(collection, t10, z12);
                ArrayList<J0> arrayList = new ArrayList(s10);
                arrayList.removeAll(this.f3045g);
                ArrayList<J0> arrayList2 = new ArrayList(s10);
                arrayList2.retainAll(this.f3045g);
                ArrayList<J0> arrayList3 = new ArrayList(this.f3045g);
                arrayList3.removeAll(s10);
                Map F10 = F(arrayList, this.f3049k.j(), this.f3042d);
                Map emptyMap = Collections.emptyMap();
                try {
                    Map map2 = F10;
                    Map v10 = v(E(), this.f3039a.q(), arrayList, arrayList2, map2);
                    if (this.f3040b != null) {
                        int E10 = E();
                        H h10 = this.f3040b;
                        Objects.requireNonNull(h10);
                        map = v10;
                        emptyMap = v(E10, h10.q(), arrayList, arrayList2, map2);
                    } else {
                        map = v10;
                    }
                    Map map3 = emptyMap;
                    g0(map, s10);
                    e0(this.f3048j, s10, collection);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((J0) it.next()).W(this.f3039a);
                    }
                    this.f3039a.n(arrayList3);
                    if (this.f3040b != null) {
                        for (J0 j02 : arrayList3) {
                            H h11 = this.f3040b;
                            Objects.requireNonNull(h11);
                            j02.W(h11);
                        }
                        H h12 = this.f3040b;
                        Objects.requireNonNull(h12);
                        h12.n(arrayList3);
                    }
                    if (arrayList3.isEmpty()) {
                        for (J0 j03 : arrayList2) {
                            if (map.containsKey(j03) && (d10 = (z02 = (Z0) map.get(j03)).d()) != null && L(z02, j03.w())) {
                                j03.Z(d10);
                                if (this.f3051m) {
                                    this.f3039a.j(j03);
                                    H h13 = this.f3040b;
                                    if (h13 != null) {
                                        Objects.requireNonNull(h13);
                                        h13.j(j03);
                                    }
                                }
                            }
                        }
                    }
                    for (J0 j04 : arrayList) {
                        Map map4 = map2;
                        c cVar = (c) map4.get(j04);
                        Objects.requireNonNull(cVar);
                        H h14 = this.f3040b;
                        if (h14 != null) {
                            H h15 = this.f3039a;
                            Objects.requireNonNull(h14);
                            j04.b(h15, h14, cVar.f3060a, cVar.f3061b);
                            j04.Y((Z0) y0.f.g((Z0) map.get(j04)), (Z0) map3.get(j04));
                        } else {
                            j04.b(this.f3039a, null, cVar.f3060a, cVar.f3061b);
                            j04.Y((Z0) y0.f.g((Z0) map.get(j04)), null);
                        }
                        map2 = map4;
                    }
                    if (this.f3051m) {
                        this.f3039a.m(arrayList);
                        H h16 = this.f3040b;
                        if (h16 != null) {
                            Objects.requireNonNull(h16);
                            h16.m(arrayList);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((J0) it2.next()).H();
                    }
                    this.f3044f.clear();
                    this.f3044f.addAll(collection);
                    this.f3045g.clear();
                    this.f3045g.addAll(s10);
                    this.f3053o = t10;
                    this.f3054p = z12;
                } catch (IllegalArgumentException e10) {
                    if (z10 || K() || this.f3046h.a() == 2) {
                        throw e10;
                    }
                    f0(collection, true, z11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(Collection collection) {
        synchronized (this.f3050l) {
            try {
                this.f3039a.g(this.f3049k);
                H h10 = this.f3040b;
                if (h10 != null) {
                    h10.g(this.f3049k);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3044f);
                linkedHashSet.addAll(collection);
                try {
                    H h11 = this.f3040b;
                    f0(linkedHashSet, h11 != null, h11 != null);
                } catch (IllegalArgumentException e10) {
                    throw new a(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        synchronized (this.f3050l) {
            try {
                if (!this.f3051m) {
                    if (!this.f3045g.isEmpty()) {
                        this.f3039a.g(this.f3049k);
                        H h10 = this.f3040b;
                        if (h10 != null) {
                            h10.g(this.f3049k);
                        }
                    }
                    this.f3039a.m(this.f3045g);
                    H h11 = this.f3040b;
                    if (h11 != null) {
                        h11.m(this.f3045g);
                    }
                    a0();
                    Iterator it = this.f3045g.iterator();
                    while (it.hasNext()) {
                        ((J0) it.next()).H();
                    }
                    this.f3051m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(boolean z10) {
        this.f3039a.l(z10);
    }
}
