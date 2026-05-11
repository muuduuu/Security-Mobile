package androidx.camera.core.impl;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C1440i;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: j, reason: collision with root package name */
    private static final List f14477j = Arrays.asList(1, 5, 3);

    /* renamed from: a, reason: collision with root package name */
    private final List f14478a;

    /* renamed from: b, reason: collision with root package name */
    private final f f14479b;

    /* renamed from: c, reason: collision with root package name */
    private final List f14480c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14481d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14482e;

    /* renamed from: f, reason: collision with root package name */
    private final d f14483f;

    /* renamed from: g, reason: collision with root package name */
    private final T f14484g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14485h;

    /* renamed from: i, reason: collision with root package name */
    private InputConfiguration f14486i;

    static class a {

        /* renamed from: f, reason: collision with root package name */
        d f14492f;

        /* renamed from: g, reason: collision with root package name */
        InputConfiguration f14493g;

        /* renamed from: i, reason: collision with root package name */
        f f14495i;

        /* renamed from: a, reason: collision with root package name */
        final Set f14487a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        final T.a f14488b = new T.a();

        /* renamed from: c, reason: collision with root package name */
        final List f14489c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final List f14490d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        final List f14491e = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        int f14494h = 0;

        a() {
        }
    }

    public static class b extends a {
        public static b q(l1 l1Var, Size size) {
            e U10 = l1Var.U(null);
            if (U10 != null) {
                b bVar = new b();
                U10.a(size, l1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + l1Var.C(l1Var.toString()));
        }

        public b A(int i10) {
            if (i10 != 0) {
                this.f14488b.x(i10);
            }
            return this;
        }

        public b a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC1450n abstractC1450n = (AbstractC1450n) it.next();
                this.f14488b.c(abstractC1450n);
                if (!this.f14491e.contains(abstractC1450n)) {
                    this.f14491e.add(abstractC1450n);
                }
            }
            return this;
        }

        public b b(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                f((CameraDevice.StateCallback) it.next());
            }
            return this;
        }

        public b c(Collection collection) {
            this.f14488b.a(collection);
            return this;
        }

        public b d(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((CameraCaptureSession.StateCallback) it.next());
            }
            return this;
        }

        public b e(AbstractC1450n abstractC1450n) {
            this.f14488b.c(abstractC1450n);
            if (!this.f14491e.contains(abstractC1450n)) {
                this.f14491e.add(abstractC1450n);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f14489c.contains(stateCallback)) {
                return this;
            }
            this.f14489c.add(stateCallback);
            return this;
        }

        public b g(V v10) {
            this.f14488b.e(v10);
            return this;
        }

        public b h(AbstractC1429c0 abstractC1429c0) {
            return i(abstractC1429c0, A.B.f7d);
        }

        public b i(AbstractC1429c0 abstractC1429c0, A.B b10) {
            this.f14487a.add(f.a(abstractC1429c0).b(b10).a());
            return this;
        }

        public b j(AbstractC1450n abstractC1450n) {
            this.f14488b.c(abstractC1450n);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f14490d.contains(stateCallback)) {
                return this;
            }
            this.f14490d.add(stateCallback);
            return this;
        }

        public b l(AbstractC1429c0 abstractC1429c0) {
            return m(abstractC1429c0, A.B.f7d, null, -1);
        }

        public b m(AbstractC1429c0 abstractC1429c0, A.B b10, String str, int i10) {
            this.f14487a.add(f.a(abstractC1429c0).d(str).b(b10).c(i10).a());
            this.f14488b.f(abstractC1429c0);
            return this;
        }

        public b n(String str, Object obj) {
            this.f14488b.g(str, obj);
            return this;
        }

        public V0 o() {
            return new V0(new ArrayList(this.f14487a), new ArrayList(this.f14489c), new ArrayList(this.f14490d), new ArrayList(this.f14491e), this.f14488b.h(), this.f14492f, this.f14493g, this.f14494h, this.f14495i);
        }

        public b p() {
            this.f14487a.clear();
            this.f14488b.i();
            return this;
        }

        public List r() {
            return Collections.unmodifiableList(this.f14491e);
        }

        public boolean s(AbstractC1450n abstractC1450n) {
            return this.f14488b.o(abstractC1450n) || this.f14491e.remove(abstractC1450n);
        }

        public b t(d dVar) {
            this.f14492f = dVar;
            return this;
        }

        public b u(Range range) {
            this.f14488b.q(range);
            return this;
        }

        public b v(V v10) {
            this.f14488b.s(v10);
            return this;
        }

        public b w(InputConfiguration inputConfiguration) {
            this.f14493g = inputConfiguration;
            return this;
        }

        public b x(AbstractC1429c0 abstractC1429c0) {
            this.f14495i = f.a(abstractC1429c0).a();
            return this;
        }

        public b y(int i10) {
            if (i10 != 0) {
                this.f14488b.u(i10);
            }
            return this;
        }

        public b z(int i10) {
            this.f14488b.v(i10);
            return this;
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f14496a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        private final d f14497b;

        public c(d dVar) {
            this.f14497b = dVar;
        }

        @Override // androidx.camera.core.impl.V0.d
        public void a(V0 v02, g gVar) {
            if (this.f14496a.get()) {
                return;
            }
            this.f14497b.a(v02, gVar);
        }

        public void b() {
            this.f14496a.set(true);
        }
    }

    public interface d {
        void a(V0 v02, g gVar);
    }

    public interface e {
        void a(Size size, l1 l1Var, b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            public abstract f a();

            public abstract a b(A.B b10);

            public abstract a c(int i10);

            public abstract a d(String str);

            public abstract a e(List list);

            public abstract a f(int i10);
        }

        public static a a(AbstractC1429c0 abstractC1429c0) {
            return new C1440i.b().g(abstractC1429c0).e(Collections.emptyList()).d(null).c(-1).f(-1).b(A.B.f7d);
        }

        public abstract A.B b();

        public abstract int c();

        public abstract String d();

        public abstract List e();

        public abstract AbstractC1429c0 f();

        public abstract int g();
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* renamed from: j, reason: collision with root package name */
        private final K.f f14498j = new K.f();

        /* renamed from: k, reason: collision with root package name */
        private boolean f14499k = true;

        /* renamed from: l, reason: collision with root package name */
        private boolean f14500l = false;

        /* renamed from: m, reason: collision with root package name */
        private List f14501m = new ArrayList();

        private List d() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f14487a) {
                arrayList.add(fVar.f());
                Iterator it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC1429c0) it.next());
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(V0 v02, g gVar) {
            Iterator it = this.f14501m.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(v02, gVar);
            }
        }

        private void g(Range range) {
            Range range2 = Z0.f14526a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f14488b.l().equals(range2)) {
                this.f14488b.q(range);
            } else {
                if (this.f14488b.l().equals(range)) {
                    return;
                }
                this.f14499k = false;
                AbstractC0700h0.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        private void h(int i10) {
            if (i10 != 0) {
                this.f14488b.u(i10);
            }
        }

        private void i(int i10) {
            if (i10 != 0) {
                this.f14488b.x(i10);
            }
        }

        public void b(V0 v02) {
            T j10 = v02.j();
            if (j10.k() != -1) {
                this.f14500l = true;
                this.f14488b.v(V0.e(j10.k(), this.f14488b.n()));
            }
            g(j10.e());
            h(j10.h());
            i(j10.l());
            this.f14488b.b(v02.j().j());
            this.f14489c.addAll(v02.c());
            this.f14490d.addAll(v02.k());
            this.f14488b.a(v02.i());
            this.f14491e.addAll(v02.m());
            if (v02.d() != null) {
                this.f14501m.add(v02.d());
            }
            if (v02.g() != null) {
                this.f14493g = v02.g();
            }
            this.f14487a.addAll(v02.h());
            this.f14488b.m().addAll(j10.i());
            if (!d().containsAll(this.f14488b.m())) {
                AbstractC0700h0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f14499k = false;
            }
            if (v02.l() != this.f14494h && v02.l() != 0 && this.f14494h != 0) {
                AbstractC0700h0.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f14499k = false;
            } else if (v02.l() != 0) {
                this.f14494h = v02.l();
            }
            if (v02.f14479b != null) {
                if (this.f14495i == v02.f14479b || this.f14495i == null) {
                    this.f14495i = v02.f14479b;
                } else {
                    AbstractC0700h0.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f14499k = false;
                }
            }
            this.f14488b.e(j10.g());
        }

        public V0 c() {
            if (!this.f14499k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f14487a);
            this.f14498j.d(arrayList);
            return new V0(arrayList, new ArrayList(this.f14489c), new ArrayList(this.f14490d), new ArrayList(this.f14491e), this.f14488b.h(), !this.f14501m.isEmpty() ? new d() { // from class: androidx.camera.core.impl.W0
                @Override // androidx.camera.core.impl.V0.d
                public final void a(V0 v02, V0.g gVar) {
                    V0.h.this.f(v02, gVar);
                }
            } : null, this.f14493g, this.f14494h, this.f14495i);
        }

        public boolean e() {
            return this.f14500l && this.f14499k;
        }
    }

    V0(List list, List list2, List list3, List list4, T t10, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f14478a = list;
        this.f14480c = Collections.unmodifiableList(list2);
        this.f14481d = Collections.unmodifiableList(list3);
        this.f14482e = Collections.unmodifiableList(list4);
        this.f14483f = dVar;
        this.f14484g = t10;
        this.f14486i = inputConfiguration;
        this.f14485h = i10;
        this.f14479b = fVar;
    }

    public static V0 b() {
        return new V0(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new T.a().h(), null, null, 0, null);
    }

    public static int e(int i10, int i11) {
        List list = f14477j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    public List c() {
        return this.f14480c;
    }

    public d d() {
        return this.f14483f;
    }

    public V f() {
        return this.f14484g.g();
    }

    public InputConfiguration g() {
        return this.f14486i;
    }

    public List h() {
        return this.f14478a;
    }

    public List i() {
        return this.f14484g.c();
    }

    public T j() {
        return this.f14484g;
    }

    public List k() {
        return this.f14481d;
    }

    public int l() {
        return this.f14485h;
    }

    public List m() {
        return this.f14482e;
    }

    public List n() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f14478a) {
            arrayList.add(fVar.f());
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC1429c0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int o() {
        return this.f14484g.k();
    }
}
