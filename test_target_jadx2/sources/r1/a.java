package R1;

import O1.AbstractC1034e;
import android.view.animation.Interpolator;
import c2.C1718a;
import c2.C1720c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    private final d f8374c;

    /* renamed from: e, reason: collision with root package name */
    protected C1720c f8376e;

    /* renamed from: a, reason: collision with root package name */
    final List f8372a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f8373b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f8375d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private Object f8377f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f8378g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f8379h = -1.0f;

    public interface b {
        void a();
    }

    private static final class c implements d {
        private c() {
        }

        @Override // R1.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // R1.a.d
        public C1718a b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // R1.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // R1.a.d
        public float d() {
            return 1.0f;
        }

        @Override // R1.a.d
        public float e() {
            return 0.0f;
        }

        @Override // R1.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d {
        boolean a(float f10);

        C1718a b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    private static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        private final List f8380a;

        /* renamed from: c, reason: collision with root package name */
        private C1718a f8382c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f8383d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        private C1718a f8381b = f(0.0f);

        e(List list) {
            this.f8380a = list;
        }

        private C1718a f(float f10) {
            List list = this.f8380a;
            C1718a c1718a = (C1718a) list.get(list.size() - 1);
            if (f10 >= c1718a.f()) {
                return c1718a;
            }
            for (int size = this.f8380a.size() - 2; size >= 1; size--) {
                C1718a c1718a2 = (C1718a) this.f8380a.get(size);
                if (this.f8381b != c1718a2 && c1718a2.a(f10)) {
                    return c1718a2;
                }
            }
            return (C1718a) this.f8380a.get(0);
        }

        @Override // R1.a.d
        public boolean a(float f10) {
            C1718a c1718a = this.f8382c;
            C1718a c1718a2 = this.f8381b;
            if (c1718a == c1718a2 && this.f8383d == f10) {
                return true;
            }
            this.f8382c = c1718a2;
            this.f8383d = f10;
            return false;
        }

        @Override // R1.a.d
        public C1718a b() {
            return this.f8381b;
        }

        @Override // R1.a.d
        public boolean c(float f10) {
            if (this.f8381b.a(f10)) {
                return !this.f8381b.i();
            }
            this.f8381b = f(f10);
            return true;
        }

        @Override // R1.a.d
        public float d() {
            return ((C1718a) this.f8380a.get(r0.size() - 1)).c();
        }

        @Override // R1.a.d
        public float e() {
            return ((C1718a) this.f8380a.get(0)).f();
        }

        @Override // R1.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private final C1718a f8384a;

        /* renamed from: b, reason: collision with root package name */
        private float f8385b = -1.0f;

        f(List list) {
            this.f8384a = (C1718a) list.get(0);
        }

        @Override // R1.a.d
        public boolean a(float f10) {
            if (this.f8385b == f10) {
                return true;
            }
            this.f8385b = f10;
            return false;
        }

        @Override // R1.a.d
        public C1718a b() {
            return this.f8384a;
        }

        @Override // R1.a.d
        public boolean c(float f10) {
            return !this.f8384a.i();
        }

        @Override // R1.a.d
        public float d() {
            return this.f8384a.c();
        }

        @Override // R1.a.d
        public float e() {
            return this.f8384a.f();
        }

        @Override // R1.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List list) {
        this.f8374c = p(list);
    }

    private float g() {
        if (this.f8378g == -1.0f) {
            this.f8378g = this.f8374c.e();
        }
        return this.f8378g;
    }

    private static d p(List list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f8372a.add(bVar);
    }

    protected C1718a b() {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        C1718a b10 = this.f8374c.b();
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return b10;
    }

    float c() {
        if (this.f8379h == -1.0f) {
            this.f8379h = this.f8374c.d();
        }
        return this.f8379h;
    }

    protected float d() {
        Interpolator interpolator;
        C1718a b10 = b();
        if (b10 == null || b10.i() || (interpolator = b10.f19338d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    float e() {
        if (this.f8373b) {
            return 0.0f;
        }
        C1718a b10 = b();
        if (b10.i()) {
            return 0.0f;
        }
        return (this.f8375d - b10.f()) / (b10.c() - b10.f());
    }

    public float f() {
        return this.f8375d;
    }

    public Object h() {
        float e10 = e();
        if (this.f8376e == null && this.f8374c.a(e10)) {
            return this.f8377f;
        }
        C1718a b10 = b();
        Interpolator interpolator = b10.f19339e;
        Object i10 = (interpolator == null || b10.f19340f == null) ? i(b10, d()) : j(b10, e10, interpolator.getInterpolation(e10), b10.f19340f.getInterpolation(e10));
        this.f8377f = i10;
        return i10;
    }

    abstract Object i(C1718a c1718a, float f10);

    protected Object j(C1718a c1718a, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f8376e != null;
    }

    public void l() {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f8372a.size(); i10++) {
            ((b) this.f8372a.get(i10)).a();
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f8373b = true;
    }

    public void n(float f10) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f8374c.isEmpty()) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f8375d) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f8375d = f10;
            if (this.f8374c.c(f10)) {
                l();
            }
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(C1720c c1720c) {
        C1720c c1720c2 = this.f8376e;
        if (c1720c2 != null) {
            c1720c2.c(null);
        }
        this.f8376e = c1720c;
        if (c1720c != null) {
            c1720c.c(this);
        }
    }
}
