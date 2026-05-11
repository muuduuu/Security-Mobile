package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.X;
import g.AbstractC3170a;
import g.AbstractC3172c;
import g.AbstractC3173d;
import g.AbstractC3174e;
import h.AbstractC3220a;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409k {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f14178b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C1409k f14179c;

    /* renamed from: a, reason: collision with root package name */
    private X f14180a;

    /* renamed from: androidx.appcompat.widget.k$a */
    class a implements X.c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f14181a = {AbstractC3174e.f33131R, AbstractC3174e.f33129P, AbstractC3174e.f33133a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f14182b = {AbstractC3174e.f33147o, AbstractC3174e.f33115B, AbstractC3174e.f33152t, AbstractC3174e.f33148p, AbstractC3174e.f33149q, AbstractC3174e.f33151s, AbstractC3174e.f33150r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f14183c = {AbstractC3174e.f33128O, AbstractC3174e.f33130Q, AbstractC3174e.f33143k, AbstractC3174e.f33124K, AbstractC3174e.f33125L, AbstractC3174e.f33126M, AbstractC3174e.f33127N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f14184d = {AbstractC3174e.f33155w, AbstractC3174e.f33141i, AbstractC3174e.f33154v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f14185e = {AbstractC3174e.f33123J, AbstractC3174e.f33132S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f14186f = {AbstractC3174e.f33135c, AbstractC3174e.f33139g, AbstractC3174e.f33136d, AbstractC3174e.f33140h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = d0.c(context, AbstractC3170a.f33085t);
            return new ColorStateList(new int[][]{d0.f14126b, d0.f14129e, d0.f14127c, d0.f14133i}, new int[]{d0.b(context, AbstractC3170a.f33083r), androidx.core.graphics.d.k(c10, i10), androidx.core.graphics.d.k(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, d0.c(context, AbstractC3170a.f33082q));
        }

        private ColorStateList j(Context context) {
            return h(context, d0.c(context, AbstractC3170a.f33083r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e10 = d0.e(context, AbstractC3170a.f33088w);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = d0.f14126b;
                iArr2[0] = d0.b(context, AbstractC3170a.f33088w);
                iArr[1] = d0.f14130f;
                iArr2[1] = d0.c(context, AbstractC3170a.f33084s);
                iArr[2] = d0.f14133i;
                iArr2[2] = d0.c(context, AbstractC3170a.f33088w);
            } else {
                int[] iArr3 = d0.f14126b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = d0.f14130f;
                iArr2[1] = d0.c(context, AbstractC3170a.f33084s);
                iArr[2] = d0.f14133i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(X x10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable i11 = x10.i(context, AbstractC3174e.f33119F);
            Drawable i12 = x10.i(context, AbstractC3174e.f33120G);
            if ((i11 instanceof BitmapDrawable) && i11.getIntrinsicWidth() == dimensionPixelSize && i11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i11;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i11.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i12 instanceof BitmapDrawable) && i12.getIntrinsicWidth() == dimensionPixelSize && i12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C1409k.f14178b;
            }
            mutate.setColorFilter(C1409k.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // androidx.appcompat.widget.X.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(Context context, int i10, Drawable drawable) {
            PorterDuff.Mode mode;
            int i11;
            boolean z10;
            int round;
            PorterDuff.Mode mode2 = C1409k.f14178b;
            if (f(this.f14181a, i10)) {
                i11 = AbstractC3170a.f33086u;
            } else if (f(this.f14183c, i10)) {
                i11 = AbstractC3170a.f33084s;
            } else {
                if (f(this.f14184d, i10)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == AbstractC3174e.f33153u) {
                        z10 = true;
                        round = Math.round(40.8f);
                        i11 = 16842800;
                        mode = mode2;
                        if (z10) {
                            return false;
                        }
                        Drawable mutate = drawable.mutate();
                        mutate.setColorFilter(C1409k.e(d0.c(context, i11), mode));
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                        return true;
                    }
                    if (i10 != AbstractC3174e.f33144l) {
                        mode = mode2;
                        i11 = 0;
                        z10 = false;
                        round = -1;
                        if (z10) {
                        }
                    }
                }
                mode = mode2;
                round = -1;
                i11 = 16842801;
                z10 = true;
                if (z10) {
                }
            }
            mode = mode2;
            z10 = true;
            round = -1;
            if (z10) {
            }
        }

        @Override // androidx.appcompat.widget.X.c
        public PorterDuff.Mode b(int i10) {
            if (i10 == AbstractC3174e.f33121H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public Drawable c(X x10, Context context, int i10) {
            if (i10 == AbstractC3174e.f33142j) {
                return new LayerDrawable(new Drawable[]{x10.i(context, AbstractC3174e.f33141i), x10.i(context, AbstractC3174e.f33143k)});
            }
            if (i10 == AbstractC3174e.f33157y) {
                return l(x10, context, AbstractC3173d.f33107g);
            }
            if (i10 == AbstractC3174e.f33156x) {
                return l(x10, context, AbstractC3173d.f33108h);
            }
            if (i10 == AbstractC3174e.f33158z) {
                return l(x10, context, AbstractC3173d.f33109i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public ColorStateList d(Context context, int i10) {
            if (i10 == AbstractC3174e.f33145m) {
                return AbstractC3220a.a(context, AbstractC3172c.f33097e);
            }
            if (i10 == AbstractC3174e.f33122I) {
                return AbstractC3220a.a(context, AbstractC3172c.f33100h);
            }
            if (i10 == AbstractC3174e.f33121H) {
                return k(context);
            }
            if (i10 == AbstractC3174e.f33138f) {
                return j(context);
            }
            if (i10 == AbstractC3174e.f33134b) {
                return g(context);
            }
            if (i10 == AbstractC3174e.f33137e) {
                return i(context);
            }
            if (i10 == AbstractC3174e.f33117D || i10 == AbstractC3174e.f33118E) {
                return AbstractC3220a.a(context, AbstractC3172c.f33099g);
            }
            if (f(this.f14182b, i10)) {
                return d0.e(context, AbstractC3170a.f33086u);
            }
            if (f(this.f14185e, i10)) {
                return AbstractC3220a.a(context, AbstractC3172c.f33096d);
            }
            if (f(this.f14186f, i10)) {
                return AbstractC3220a.a(context, AbstractC3172c.f33095c);
            }
            if (i10 == AbstractC3174e.f33114A) {
                return AbstractC3220a.a(context, AbstractC3172c.f33098f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == AbstractC3174e.f33116C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), d0.c(context, AbstractC3170a.f33086u), C1409k.f14178b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, AbstractC3170a.f33086u), C1409k.f14178b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), d0.c(context, AbstractC3170a.f33084s), C1409k.f14178b);
                return true;
            }
            if (i10 != AbstractC3174e.f33157y && i10 != AbstractC3174e.f33156x && i10 != AbstractC3174e.f33158z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), d0.b(context, AbstractC3170a.f33086u), C1409k.f14178b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, AbstractC3170a.f33084s), C1409k.f14178b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), d0.c(context, AbstractC3170a.f33084s), C1409k.f14178b);
            return true;
        }
    }

    public static synchronized C1409k b() {
        C1409k c1409k;
        synchronized (C1409k.class) {
            try {
                if (f14179c == null) {
                    h();
                }
                c1409k = f14179c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1409k;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (C1409k.class) {
            k10 = X.k(i10, mode);
        }
        return k10;
    }

    public static synchronized void h() {
        synchronized (C1409k.class) {
            if (f14179c == null) {
                C1409k c1409k = new C1409k();
                f14179c = c1409k;
                c1409k.f14180a = X.g();
                f14179c.f14180a.t(new a());
            }
        }
    }

    static void i(Drawable drawable, f0 f0Var, int[] iArr) {
        X.v(drawable, f0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f14180a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f14180a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f14180a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f14180a.r(context);
    }
}
