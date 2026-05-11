package y3;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class p {

    public static abstract class a implements b {
        @Override // y3.p.b
        public Matrix a(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11) {
            b(matrix, rect, i10, i11, f10, f11, rect.width() / i10, rect.height() / i11);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13);
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f45285a = k.f45304l;

        /* renamed from: b, reason: collision with root package name */
        public static final b f45286b = j.f45303l;

        /* renamed from: c, reason: collision with root package name */
        public static final b f45287c = l.f45305l;

        /* renamed from: d, reason: collision with root package name */
        public static final b f45288d = i.f45302l;

        /* renamed from: e, reason: collision with root package name */
        public static final b f45289e = g.f45300l;

        /* renamed from: f, reason: collision with root package name */
        public static final b f45290f = h.f45301l;

        /* renamed from: g, reason: collision with root package name */
        public static final b f45291g = c.f45296l;

        /* renamed from: h, reason: collision with root package name */
        public static final b f45292h = e.f45298l;

        /* renamed from: i, reason: collision with root package name */
        public static final b f45293i = d.f45297l;

        /* renamed from: j, reason: collision with root package name */
        public static final b f45294j = m.f45306l;

        /* renamed from: k, reason: collision with root package name */
        public static final b f45295k = f.f45299l;

        Matrix a(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11);
    }

    private static class c extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45296l = new c();

        private c() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i10) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i11) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    private static class d extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45297l = new d();

        private d() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float height;
            float f14;
            if (f13 > f12) {
                f14 = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
                height = rect.top;
                f12 = f13;
            } else {
                float f15 = rect.left;
                height = ((rect.height() - (i11 * f12)) * 0.5f) + rect.top;
                f14 = f15;
            }
            matrix.setScale(f12, f12);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    private static class e extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45298l = new e();

        private e() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(Math.min(f12, f13), 1.0f);
            float width = rect.left + ((rect.width() - (i10 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i11 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    private static class f extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45299l = new f();

        private f() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            float f14 = rect.left;
            float height = rect.top + (rect.height() - (i11 * min));
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    private static class g extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45300l = new g();

        private g() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            float width = rect.left + ((rect.width() - (i10 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i11 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    private static class h extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45301l = new h();

        private h() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            float width = rect.left + (rect.width() - (i10 * min));
            float height = rect.top + (rect.height() - (i11 * min));
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    private static class i extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45302l = new i();

        private i() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            float f14 = rect.left;
            float f15 = rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (f15 + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    private static class j extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45303l = new j();

        private j() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float f14 = rect.left;
            float height = rect.top + ((rect.height() - (i11 * f12)) * 0.5f);
            matrix.setScale(f12, f12);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_x";
        }
    }

    private static class k extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45304l = new k();

        private k() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float f14 = rect.left;
            float f15 = rect.top;
            matrix.setScale(f12, f13);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (f15 + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    private static class l extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45305l = new l();

        private l() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float width = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
            float f14 = rect.top;
            matrix.setScale(f13, f13);
            matrix.postTranslate((int) (width + 0.5f), (int) (f14 + 0.5f));
        }

        public String toString() {
            return "fit_y";
        }
    }

    private static class m extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final b f45306l = new m();

        private m() {
        }

        @Override // y3.p.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float f14;
            float max;
            if (f13 > f12) {
                float f15 = i10 * f13;
                f14 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f10 * f15), 0.0f), rect.width() - f15);
                max = rect.top;
                f12 = f13;
            } else {
                f14 = rect.left;
                float f16 = i11 * f12;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f11 * f16), 0.0f), rect.height() - f16) + rect.top;
            }
            matrix.setScale(f12, f12);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (max + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof o) {
            return (o) drawable;
        }
        if (drawable instanceof InterfaceC5169c) {
            return a(((InterfaceC5169c) drawable).s());
        }
        if (drawable instanceof AbstractC5167a) {
            AbstractC5167a abstractC5167a = (AbstractC5167a) drawable;
            int d10 = abstractC5167a.d();
            for (int i10 = 0; i10 < d10; i10++) {
                o a10 = a(abstractC5167a.b(i10));
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }
}
