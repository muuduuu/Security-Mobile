package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: i, reason: collision with root package name */
    public static final V.a f14453i = V.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j, reason: collision with root package name */
    public static final V.a f14454j = V.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: k, reason: collision with root package name */
    private static final V.a f14455k = V.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* renamed from: a, reason: collision with root package name */
    final List f14456a;

    /* renamed from: b, reason: collision with root package name */
    final V f14457b;

    /* renamed from: c, reason: collision with root package name */
    final int f14458c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f14459d;

    /* renamed from: e, reason: collision with root package name */
    final List f14460e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14461f;

    /* renamed from: g, reason: collision with root package name */
    private final d1 f14462g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1469x f14463h;

    public interface b {
        void a(l1 l1Var, a aVar);
    }

    T(List list, V v10, int i10, boolean z10, List list2, boolean z11, d1 d1Var, InterfaceC1469x interfaceC1469x) {
        this.f14456a = list;
        this.f14457b = v10;
        this.f14458c = i10;
        this.f14460e = Collections.unmodifiableList(list2);
        this.f14461f = z11;
        this.f14462g = d1Var;
        this.f14463h = interfaceC1469x;
        this.f14459d = z10;
    }

    public static T b() {
        return new a().h();
    }

    public List c() {
        return this.f14460e;
    }

    public InterfaceC1469x d() {
        return this.f14463h;
    }

    public Range e() {
        Range range = (Range) this.f14457b.f(f14455k, Z0.f14526a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object d10 = this.f14462g.d("CAPTURE_CONFIG_ID_KEY");
        if (d10 == null) {
            return -1;
        }
        return ((Integer) d10).intValue();
    }

    public V g() {
        return this.f14457b;
    }

    public int h() {
        Integer num = (Integer) this.f14457b.f(l1.f14637G, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List i() {
        return Collections.unmodifiableList(this.f14456a);
    }

    public d1 j() {
        return this.f14462g;
    }

    public int k() {
        return this.f14458c;
    }

    public int l() {
        Integer num = (Integer) this.f14457b.f(l1.f14638H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f14461f;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f14464a;

        /* renamed from: b, reason: collision with root package name */
        private A0 f14465b;

        /* renamed from: c, reason: collision with root package name */
        private int f14466c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f14467d;

        /* renamed from: e, reason: collision with root package name */
        private List f14468e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f14469f;

        /* renamed from: g, reason: collision with root package name */
        private D0 f14470g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC1469x f14471h;

        public a() {
            this.f14464a = new HashSet();
            this.f14465b = B0.d0();
            this.f14466c = -1;
            this.f14467d = false;
            this.f14468e = new ArrayList();
            this.f14469f = false;
            this.f14470g = D0.g();
        }

        public static a j(l1 l1Var) {
            b s10 = l1Var.s(null);
            if (s10 != null) {
                a aVar = new a();
                s10.a(l1Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + l1Var.C(l1Var.toString()));
        }

        public static a k(T t10) {
            return new a(t10);
        }

        public void a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c((AbstractC1450n) it.next());
            }
        }

        public void b(d1 d1Var) {
            this.f14470g.f(d1Var);
        }

        public void c(AbstractC1450n abstractC1450n) {
            if (this.f14468e.contains(abstractC1450n)) {
                return;
            }
            this.f14468e.add(abstractC1450n);
        }

        public void d(V.a aVar, Object obj) {
            this.f14465b.x(aVar, obj);
        }

        public void e(V v10) {
            for (V.a aVar : v10.e()) {
                this.f14465b.f(aVar, null);
                this.f14465b.r(aVar, v10.g(aVar), v10.a(aVar));
            }
        }

        public void f(AbstractC1429c0 abstractC1429c0) {
            this.f14464a.add(abstractC1429c0);
        }

        public void g(String str, Object obj) {
            this.f14470g.i(str, obj);
        }

        public T h() {
            return new T(new ArrayList(this.f14464a), G0.b0(this.f14465b), this.f14466c, this.f14467d, new ArrayList(this.f14468e), this.f14469f, d1.c(this.f14470g), this.f14471h);
        }

        public void i() {
            this.f14464a.clear();
        }

        public Range l() {
            return (Range) this.f14465b.f(T.f14455k, Z0.f14526a);
        }

        public Set m() {
            return this.f14464a;
        }

        public int n() {
            return this.f14466c;
        }

        public boolean o(AbstractC1450n abstractC1450n) {
            return this.f14468e.remove(abstractC1450n);
        }

        public void p(InterfaceC1469x interfaceC1469x) {
            this.f14471h = interfaceC1469x;
        }

        public void q(Range range) {
            d(T.f14455k, range);
        }

        public void r(int i10) {
            this.f14470g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void s(V v10) {
            this.f14465b = B0.e0(v10);
        }

        public void t(boolean z10) {
            this.f14467d = z10;
        }

        public void u(int i10) {
            if (i10 != 0) {
                d(l1.f14637G, Integer.valueOf(i10));
            }
        }

        public void v(int i10) {
            this.f14466c = i10;
        }

        public void w(boolean z10) {
            this.f14469f = z10;
        }

        public void x(int i10) {
            if (i10 != 0) {
                d(l1.f14638H, Integer.valueOf(i10));
            }
        }

        private a(T t10) {
            HashSet hashSet = new HashSet();
            this.f14464a = hashSet;
            this.f14465b = B0.d0();
            this.f14466c = -1;
            this.f14467d = false;
            this.f14468e = new ArrayList();
            this.f14469f = false;
            this.f14470g = D0.g();
            hashSet.addAll(t10.f14456a);
            this.f14465b = B0.e0(t10.f14457b);
            this.f14466c = t10.f14458c;
            this.f14468e.addAll(t10.c());
            this.f14469f = t10.m();
            this.f14470g = D0.h(t10.j());
            this.f14467d = t10.f14459d;
        }
    }
}
