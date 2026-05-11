package Y7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final Y7.c f12082m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    d f12083a;

    /* renamed from: b, reason: collision with root package name */
    d f12084b;

    /* renamed from: c, reason: collision with root package name */
    d f12085c;

    /* renamed from: d, reason: collision with root package name */
    d f12086d;

    /* renamed from: e, reason: collision with root package name */
    Y7.c f12087e;

    /* renamed from: f, reason: collision with root package name */
    Y7.c f12088f;

    /* renamed from: g, reason: collision with root package name */
    Y7.c f12089g;

    /* renamed from: h, reason: collision with root package name */
    Y7.c f12090h;

    /* renamed from: i, reason: collision with root package name */
    f f12091i;

    /* renamed from: j, reason: collision with root package name */
    f f12092j;

    /* renamed from: k, reason: collision with root package name */
    f f12093k;

    /* renamed from: l, reason: collision with root package name */
    f f12094l;

    public interface c {
        Y7.c a(Y7.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new Y7.a(i12));
    }

    private static b d(Context context, int i10, int i11, Y7.c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, H7.l.f3527T4);
        try {
            int i12 = obtainStyledAttributes.getInt(H7.l.f3536U4, 0);
            int i13 = obtainStyledAttributes.getInt(H7.l.f3563X4, i12);
            int i14 = obtainStyledAttributes.getInt(H7.l.f3572Y4, i12);
            int i15 = obtainStyledAttributes.getInt(H7.l.f3554W4, i12);
            int i16 = obtainStyledAttributes.getInt(H7.l.f3545V4, i12);
            Y7.c m10 = m(obtainStyledAttributes, H7.l.f3581Z4, cVar);
            Y7.c m11 = m(obtainStyledAttributes, H7.l.f3608c5, m10);
            Y7.c m12 = m(obtainStyledAttributes, H7.l.f3617d5, m10);
            Y7.c m13 = m(obtainStyledAttributes, H7.l.f3599b5, m10);
            return new b().z(i13, m11).E(i14, m12).u(i15, m13).q(i16, m(obtainStyledAttributes, H7.l.f3590a5, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new Y7.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, Y7.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H7.l.f3589a4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(H7.l.f3598b4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(H7.l.f3607c4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static Y7.c m(TypedArray typedArray, int i10, Y7.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new Y7.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f12093k;
    }

    public d i() {
        return this.f12086d;
    }

    public Y7.c j() {
        return this.f12090h;
    }

    public d k() {
        return this.f12085c;
    }

    public Y7.c l() {
        return this.f12089g;
    }

    public f n() {
        return this.f12094l;
    }

    public f o() {
        return this.f12092j;
    }

    public f p() {
        return this.f12091i;
    }

    public d q() {
        return this.f12083a;
    }

    public Y7.c r() {
        return this.f12087e;
    }

    public d s() {
        return this.f12084b;
    }

    public Y7.c t() {
        return this.f12088f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f12094l.getClass().equals(f.class) && this.f12092j.getClass().equals(f.class) && this.f12091i.getClass().equals(f.class) && this.f12093k.getClass().equals(f.class);
        float a10 = this.f12087e.a(rectF);
        return z10 && ((this.f12088f.a(rectF) > a10 ? 1 : (this.f12088f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f12090h.a(rectF) > a10 ? 1 : (this.f12090h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f12089g.a(rectF) > a10 ? 1 : (this.f12089g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f12084b instanceof j) && (this.f12083a instanceof j) && (this.f12085c instanceof j) && (this.f12086d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(Y7.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().C(cVar.a(r())).H(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f12083a = bVar.f12095a;
        this.f12084b = bVar.f12096b;
        this.f12085c = bVar.f12097c;
        this.f12086d = bVar.f12098d;
        this.f12087e = bVar.f12099e;
        this.f12088f = bVar.f12100f;
        this.f12089g = bVar.f12101g;
        this.f12090h = bVar.f12102h;
        this.f12091i = bVar.f12103i;
        this.f12092j = bVar.f12104j;
        this.f12093k = bVar.f12105k;
        this.f12094l = bVar.f12106l;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f12095a;

        /* renamed from: b, reason: collision with root package name */
        private d f12096b;

        /* renamed from: c, reason: collision with root package name */
        private d f12097c;

        /* renamed from: d, reason: collision with root package name */
        private d f12098d;

        /* renamed from: e, reason: collision with root package name */
        private Y7.c f12099e;

        /* renamed from: f, reason: collision with root package name */
        private Y7.c f12100f;

        /* renamed from: g, reason: collision with root package name */
        private Y7.c f12101g;

        /* renamed from: h, reason: collision with root package name */
        private Y7.c f12102h;

        /* renamed from: i, reason: collision with root package name */
        private f f12103i;

        /* renamed from: j, reason: collision with root package name */
        private f f12104j;

        /* renamed from: k, reason: collision with root package name */
        private f f12105k;

        /* renamed from: l, reason: collision with root package name */
        private f f12106l;

        public b() {
            this.f12095a = h.b();
            this.f12096b = h.b();
            this.f12097c = h.b();
            this.f12098d = h.b();
            this.f12099e = new Y7.a(0.0f);
            this.f12100f = new Y7.a(0.0f);
            this.f12101g = new Y7.a(0.0f);
            this.f12102h = new Y7.a(0.0f);
            this.f12103i = h.c();
            this.f12104j = h.c();
            this.f12105k = h.c();
            this.f12106l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f12081a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f12029a;
            }
            return -1.0f;
        }

        public b A(d dVar) {
            this.f12095a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                B(n10);
            }
            return this;
        }

        public b B(float f10) {
            this.f12099e = new Y7.a(f10);
            return this;
        }

        public b C(Y7.c cVar) {
            this.f12099e = cVar;
            return this;
        }

        public b D(int i10, float f10) {
            return F(h.a(i10)).G(f10);
        }

        public b E(int i10, Y7.c cVar) {
            return F(h.a(i10)).H(cVar);
        }

        public b F(d dVar) {
            this.f12096b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                G(n10);
            }
            return this;
        }

        public b G(float f10) {
            this.f12100f = new Y7.a(f10);
            return this;
        }

        public b H(Y7.c cVar) {
            this.f12100f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return B(f10).G(f10).w(f10).s(f10);
        }

        public b p(Y7.c cVar) {
            return C(cVar).H(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, Y7.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f12098d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        public b s(float f10) {
            this.f12102h = new Y7.a(f10);
            return this;
        }

        public b t(Y7.c cVar) {
            this.f12102h = cVar;
            return this;
        }

        public b u(int i10, Y7.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f12097c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        public b w(float f10) {
            this.f12101g = new Y7.a(f10);
            return this;
        }

        public b x(Y7.c cVar) {
            this.f12101g = cVar;
            return this;
        }

        public b y(int i10, float f10) {
            return A(h.a(i10)).B(f10);
        }

        public b z(int i10, Y7.c cVar) {
            return A(h.a(i10)).C(cVar);
        }

        public b(k kVar) {
            this.f12095a = h.b();
            this.f12096b = h.b();
            this.f12097c = h.b();
            this.f12098d = h.b();
            this.f12099e = new Y7.a(0.0f);
            this.f12100f = new Y7.a(0.0f);
            this.f12101g = new Y7.a(0.0f);
            this.f12102h = new Y7.a(0.0f);
            this.f12103i = h.c();
            this.f12104j = h.c();
            this.f12105k = h.c();
            this.f12106l = h.c();
            this.f12095a = kVar.f12083a;
            this.f12096b = kVar.f12084b;
            this.f12097c = kVar.f12085c;
            this.f12098d = kVar.f12086d;
            this.f12099e = kVar.f12087e;
            this.f12100f = kVar.f12088f;
            this.f12101g = kVar.f12089g;
            this.f12102h = kVar.f12090h;
            this.f12103i = kVar.f12091i;
            this.f12104j = kVar.f12092j;
            this.f12105k = kVar.f12093k;
            this.f12106l = kVar.f12094l;
        }
    }

    public k() {
        this.f12083a = h.b();
        this.f12084b = h.b();
        this.f12085c = h.b();
        this.f12086d = h.b();
        this.f12087e = new Y7.a(0.0f);
        this.f12088f = new Y7.a(0.0f);
        this.f12089g = new Y7.a(0.0f);
        this.f12090h = new Y7.a(0.0f);
        this.f12091i = h.c();
        this.f12092j = h.c();
        this.f12093k = h.c();
        this.f12094l = h.c();
    }
}
