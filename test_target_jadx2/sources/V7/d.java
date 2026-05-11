package V7;

import H7.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.f;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f11050a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f11051b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f11052c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11053d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11054e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11055f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11056g;

    /* renamed from: h, reason: collision with root package name */
    public final float f11057h;

    /* renamed from: i, reason: collision with root package name */
    public final float f11058i;

    /* renamed from: j, reason: collision with root package name */
    public final float f11059j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11060k;

    /* renamed from: l, reason: collision with root package name */
    public final float f11061l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f11062m;

    /* renamed from: n, reason: collision with root package name */
    private float f11063n;

    /* renamed from: o, reason: collision with root package name */
    private final int f11064o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11065p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f11066q;

    class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f11067a;

        a(f fVar) {
            this.f11067a = fVar;
        }

        @Override // androidx.core.content.res.f.e
        /* renamed from: h */
        public void f(int i10) {
            d.this.f11065p = true;
            this.f11067a.a(i10);
        }

        @Override // androidx.core.content.res.f.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f11066q = Typeface.create(typeface, dVar.f11054e);
            d.this.f11065p = true;
            this.f11067a.b(d.this.f11066q, false);
        }
    }

    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11069a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f11070b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f11071c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f11069a = context;
            this.f11070b = textPaint;
            this.f11071c = fVar;
        }

        @Override // V7.f
        public void a(int i10) {
            this.f11071c.a(i10);
        }

        @Override // V7.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f11069a, this.f11070b, typeface);
            this.f11071c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, l.f3663i6);
        l(obtainStyledAttributes.getDimension(l.f3672j6, 0.0f));
        k(c.a(context, obtainStyledAttributes, l.f3699m6));
        this.f11050a = c.a(context, obtainStyledAttributes, l.f3708n6);
        this.f11051b = c.a(context, obtainStyledAttributes, l.f3717o6);
        this.f11054e = obtainStyledAttributes.getInt(l.f3690l6, 0);
        this.f11055f = obtainStyledAttributes.getInt(l.f3681k6, 1);
        int e10 = c.e(obtainStyledAttributes, l.f3771u6, l.f3762t6);
        this.f11064o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f11053d = obtainStyledAttributes.getString(e10);
        this.f11056g = obtainStyledAttributes.getBoolean(l.f3780v6, false);
        this.f11052c = c.a(context, obtainStyledAttributes, l.f3726p6);
        this.f11057h = obtainStyledAttributes.getFloat(l.f3735q6, 0.0f);
        this.f11058i = obtainStyledAttributes.getFloat(l.f3744r6, 0.0f);
        this.f11059j = obtainStyledAttributes.getFloat(l.f3753s6, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.f3616d4);
        this.f11060k = obtainStyledAttributes2.hasValue(l.f3625e4);
        this.f11061l = obtainStyledAttributes2.getFloat(l.f3625e4, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f11066q == null && (str = this.f11053d) != null) {
            this.f11066q = Typeface.create(str, this.f11054e);
        }
        if (this.f11066q == null) {
            int i10 = this.f11055f;
            if (i10 == 1) {
                this.f11066q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f11066q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f11066q = Typeface.DEFAULT;
            } else {
                this.f11066q = Typeface.MONOSPACE;
            }
            this.f11066q = Typeface.create(this.f11066q, this.f11054e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f11064o;
        return (i10 != 0 ? androidx.core.content.res.f.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f11066q;
    }

    public Typeface f(Context context) {
        if (this.f11065p) {
            return this.f11066q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h10 = androidx.core.content.res.f.h(context, this.f11064o);
                this.f11066q = h10;
                if (h10 != null) {
                    this.f11066q = Typeface.create(h10, this.f11054e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f11053d, e10);
            }
        }
        d();
        this.f11065p = true;
        return this.f11066q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f11064o;
        if (i10 == 0) {
            this.f11065p = true;
        }
        if (this.f11065p) {
            fVar.b(this.f11066q, true);
            return;
        }
        try {
            androidx.core.content.res.f.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f11065p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f11053d, e10);
            this.f11065p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f11062m;
    }

    public float j() {
        return this.f11063n;
    }

    public void k(ColorStateList colorStateList) {
        this.f11062m = colorStateList;
    }

    public void l(float f10) {
        this.f11063n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f11062m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f11059j;
        float f11 = this.f11057h;
        float f12 = this.f11058i;
        ColorStateList colorStateList2 = this.f11052c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = i.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f11054e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f11063n);
        if (this.f11060k) {
            textPaint.setLetterSpacing(this.f11061l);
        }
    }
}
