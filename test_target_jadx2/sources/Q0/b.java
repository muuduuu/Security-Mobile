package Q0;

import Q0.a;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC1484a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final r f7849m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final r f7850n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final r f7851o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final r f7852p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final r f7853q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final r f7854r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final r f7855s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final r f7856t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final r f7857u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final r f7858v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final r f7859w = new C0154b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final r f7860x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final r f7861y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final r f7862z = new e("scrollY");

    /* renamed from: a, reason: collision with root package name */
    float f7863a;

    /* renamed from: b, reason: collision with root package name */
    float f7864b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7865c;

    /* renamed from: d, reason: collision with root package name */
    final Object f7866d;

    /* renamed from: e, reason: collision with root package name */
    final Q0.d f7867e;

    /* renamed from: f, reason: collision with root package name */
    boolean f7868f;

    /* renamed from: g, reason: collision with root package name */
    float f7869g;

    /* renamed from: h, reason: collision with root package name */
    float f7870h;

    /* renamed from: i, reason: collision with root package name */
    private long f7871i;

    /* renamed from: j, reason: collision with root package name */
    private float f7872j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f7873k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f7874l;

    static class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* renamed from: Q0.b$b, reason: collision with other inner class name */
    static class C0154b extends r {
        C0154b(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC1484a0.N(view);
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC1484a0.O0(view, f10);
        }
    }

    static class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    static class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    static class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    class f extends Q0.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q0.e f7875b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Q0.e eVar) {
            super(str);
            this.f7875b = eVar;
        }

        @Override // Q0.d
        public float a(Object obj) {
            return this.f7875b.a();
        }

        @Override // Q0.d
        public void b(Object obj, float f10) {
            this.f7875b.b(f10);
        }
    }

    static class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    static class h extends r {
        h(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    static class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC1484a0.K(view);
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC1484a0.M0(view, f10);
        }
    }

    static class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    static class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    static class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    static class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    static class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    static class o extends r {
        o(String str) {
            super(str, null);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    static class p {

        /* renamed from: a, reason: collision with root package name */
        float f7877a;

        /* renamed from: b, reason: collision with root package name */
        float f7878b;

        p() {
        }
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public static abstract class r extends Q0.d {
        /* synthetic */ r(String str, g gVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    b(Q0.e eVar) {
        this.f7863a = 0.0f;
        this.f7864b = Float.MAX_VALUE;
        this.f7865c = false;
        this.f7868f = false;
        this.f7869g = Float.MAX_VALUE;
        this.f7870h = -Float.MAX_VALUE;
        this.f7871i = 0L;
        this.f7873k = new ArrayList();
        this.f7874l = new ArrayList();
        this.f7866d = null;
        this.f7867e = new f("FloatValueHolder", eVar);
        this.f7872j = 1.0f;
    }

    private void d(boolean z10) {
        this.f7868f = false;
        Q0.a.d().g(this);
        this.f7871i = 0L;
        this.f7865c = false;
        for (int i10 = 0; i10 < this.f7873k.size(); i10++) {
            if (this.f7873k.get(i10) != null) {
                ((q) this.f7873k.get(i10)).a(this, z10, this.f7864b, this.f7863a);
            }
        }
        h(this.f7873k);
    }

    private float e() {
        return this.f7867e.a(this.f7866d);
    }

    private static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void m() {
        if (this.f7868f) {
            return;
        }
        this.f7868f = true;
        if (!this.f7865c) {
            this.f7864b = e();
        }
        float f10 = this.f7864b;
        if (f10 > this.f7869g || f10 < this.f7870h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        Q0.a.d().a(this, 0L);
    }

    @Override // Q0.a.b
    public boolean a(long j10) {
        long j11 = this.f7871i;
        if (j11 == 0) {
            this.f7871i = j10;
            i(this.f7864b);
            return false;
        }
        this.f7871i = j10;
        boolean n10 = n(j10 - j11);
        float min = Math.min(this.f7864b, this.f7869g);
        this.f7864b = min;
        float max = Math.max(min, this.f7870h);
        this.f7864b = max;
        i(max);
        if (n10) {
            d(false);
        }
        return n10;
    }

    public b b(q qVar) {
        if (!this.f7873k.contains(qVar)) {
            this.f7873k.add(qVar);
        }
        return this;
    }

    public void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f7868f) {
            d(true);
        }
    }

    float f() {
        return this.f7872j * 0.75f;
    }

    public boolean g() {
        return this.f7868f;
    }

    void i(float f10) {
        this.f7867e.b(this.f7866d, f10);
        for (int i10 = 0; i10 < this.f7874l.size(); i10++) {
            if (this.f7874l.get(i10) != null) {
                android.support.v4.media.session.b.a(this.f7874l.get(i10));
                throw null;
            }
        }
        h(this.f7874l);
    }

    public b j(float f10) {
        this.f7864b = f10;
        this.f7865c = true;
        return this;
    }

    public b k(float f10) {
        this.f7863a = f10;
        return this;
    }

    public void l() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f7868f) {
            return;
        }
        m();
    }

    abstract boolean n(long j10);

    b(Object obj, Q0.d dVar) {
        this.f7863a = 0.0f;
        this.f7864b = Float.MAX_VALUE;
        this.f7865c = false;
        this.f7868f = false;
        this.f7869g = Float.MAX_VALUE;
        this.f7870h = -Float.MAX_VALUE;
        this.f7871i = 0L;
        this.f7873k = new ArrayList();
        this.f7874l = new ArrayList();
        this.f7866d = obj;
        this.f7867e = dVar;
        if (dVar != f7854r && dVar != f7855s && dVar != f7856t) {
            if (dVar == f7860x) {
                this.f7872j = 0.00390625f;
                return;
            } else if (dVar != f7852p && dVar != f7853q) {
                this.f7872j = 1.0f;
                return;
            } else {
                this.f7872j = 0.00390625f;
                return;
            }
        }
        this.f7872j = 0.1f;
    }
}
