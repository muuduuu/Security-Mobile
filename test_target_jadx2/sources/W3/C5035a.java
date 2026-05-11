package w3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import x3.InterfaceC5108b;
import y3.p;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5035a extends Drawable implements InterfaceC5108b {

    /* renamed from: a, reason: collision with root package name */
    private String f44291a;

    /* renamed from: b, reason: collision with root package name */
    private String f44292b;

    /* renamed from: c, reason: collision with root package name */
    private int f44293c;

    /* renamed from: d, reason: collision with root package name */
    private int f44294d;

    /* renamed from: e, reason: collision with root package name */
    private int f44295e;

    /* renamed from: f, reason: collision with root package name */
    private String f44296f;

    /* renamed from: g, reason: collision with root package name */
    private p.b f44297g;

    /* renamed from: i, reason: collision with root package name */
    private int f44299i;

    /* renamed from: j, reason: collision with root package name */
    private int f44300j;

    /* renamed from: p, reason: collision with root package name */
    private int f44306p;

    /* renamed from: q, reason: collision with root package name */
    private int f44307q;

    /* renamed from: r, reason: collision with root package name */
    private int f44308r;

    /* renamed from: s, reason: collision with root package name */
    private int f44309s;

    /* renamed from: t, reason: collision with root package name */
    private int f44310t;

    /* renamed from: u, reason: collision with root package name */
    private long f44311u;

    /* renamed from: v, reason: collision with root package name */
    private String f44312v;

    /* renamed from: h, reason: collision with root package name */
    private HashMap f44298h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private int f44301k = 80;

    /* renamed from: l, reason: collision with root package name */
    private final Paint f44302l = new Paint(1);

    /* renamed from: m, reason: collision with root package name */
    private final Matrix f44303m = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    private final Rect f44304n = new Rect();

    /* renamed from: o, reason: collision with root package name */
    private final RectF f44305o = new RectF();

    /* renamed from: w, reason: collision with root package name */
    private int f44313w = -1;

    /* renamed from: x, reason: collision with root package name */
    private int f44314x = 0;

    public C5035a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float measureText = this.f44302l.measureText(str3);
        float measureText2 = this.f44302l.measureText(str2);
        this.f44302l.setColor(1711276032);
        int i11 = this.f44309s;
        int i12 = this.f44310t;
        canvas.drawRect(i11 - 4, i12 + 8, i11 + measureText + measureText2 + 4.0f, i12 + this.f44308r + 8, this.f44302l);
        this.f44302l.setColor(-1);
        canvas.drawText(str3, this.f44309s, this.f44310t, this.f44302l);
        this.f44302l.setColor(i10);
        canvas.drawText(str2, this.f44309s + measureText, this.f44310t, this.f44302l);
        this.f44310t += this.f44308r;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i10, int i11) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f44302l.setTextSize(min);
        int i12 = min + 8;
        this.f44308r = i12;
        int i13 = this.f44301k;
        if (i13 == 80) {
            this.f44308r = i12 * (-1);
        }
        this.f44306p = rect.left + 10;
        this.f44307q = i13 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // x3.InterfaceC5108b
    public void a(long j10) {
        this.f44311u = j10;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f44298h.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f44302l.setStyle(Paint.Style.STROKE);
        this.f44302l.setStrokeWidth(2.0f);
        this.f44302l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f44302l);
        Paint paint = this.f44302l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f44302l.setColor(this.f44314x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f44302l);
        this.f44302l.setStyle(style);
        this.f44302l.setStrokeWidth(0.0f);
        this.f44302l.setColor(-1);
        this.f44309s = this.f44306p;
        this.f44310t = this.f44307q;
        String str = this.f44292b;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f44291a, str));
        } else {
            d(canvas, "ID", this.f44291a);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f44293c), Integer.valueOf(this.f44294d)), f(this.f44293c, this.f44294d, this.f44297g));
        int i10 = this.f44294d;
        if (i10 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f44293c / i10));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f44295e / 1024)));
        String str2 = this.f44296f;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i11 = this.f44299i;
        if (i11 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f44300j)));
        }
        p.b bVar = this.f44297g;
        if (bVar != null) {
            c(canvas, "scale", bVar);
        }
        long j10 = this.f44311u;
        if (j10 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f44312v;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f44313w);
        }
        for (Map.Entry entry : this.f44298h.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    int f(int i10, int i11, p.b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i10 > 0 && i11 > 0) {
            if (bVar != null) {
                Rect rect = this.f44304n;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f44303m.reset();
                bVar.a(this.f44303m, this.f44304n, i10, i11, 0.0f, 0.0f);
                RectF rectF = this.f44305o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i10;
                rectF.bottom = i11;
                this.f44303m.mapRect(rectF);
                int width2 = (int) this.f44305o.width();
                int height2 = (int) this.f44305o.height();
                width = Math.min(width, width2);
                height = Math.min(height, height2);
            }
            float f10 = width;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = height;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int abs = Math.abs(i10 - width);
            int abs2 = Math.abs(i11 - height);
            float f16 = abs;
            if (f16 < f11 && abs2 < f14) {
                return -16711936;
            }
            if (f16 < f12 && abs2 < f15) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f44293c = -1;
        this.f44294d = -1;
        this.f44295e = -1;
        this.f44298h = new HashMap();
        this.f44299i = -1;
        this.f44300j = -1;
        this.f44296f = null;
        j(null);
        this.f44311u = -1L;
        this.f44312v = null;
        this.f44313w = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f44291a = str;
        invalidateSelf();
    }

    public void k(int i10, int i11) {
        this.f44293c = i10;
        this.f44294d = i11;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f44295e = i10;
    }

    public void m(p.b bVar) {
        this.f44297g = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
