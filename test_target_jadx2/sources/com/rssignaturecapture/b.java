package com.rssignaturecapture;

import Y9.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends View {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29426a;

    /* renamed from: b, reason: collision with root package name */
    private int f29427b;

    /* renamed from: c, reason: collision with root package name */
    private int f29428c;

    /* renamed from: d, reason: collision with root package name */
    private float f29429d;

    /* renamed from: e, reason: collision with root package name */
    private float f29430e;

    /* renamed from: f, reason: collision with root package name */
    private float f29431f;

    /* renamed from: g, reason: collision with root package name */
    private float f29432g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f29433h;

    /* renamed from: i, reason: collision with root package name */
    private List f29434i;

    /* renamed from: j, reason: collision with root package name */
    private Paint f29435j;

    /* renamed from: k, reason: collision with root package name */
    private Path f29436k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap f29437l;

    /* renamed from: m, reason: collision with root package name */
    private float f29438m;

    /* renamed from: n, reason: collision with root package name */
    private Canvas f29439n;

    /* renamed from: o, reason: collision with root package name */
    private a f29440o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f29441p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29442q;

    /* renamed from: r, reason: collision with root package name */
    private int f29443r;

    public interface a {
        void a();
    }

    public b(Context context, a aVar) {
        super(context);
        this.f29435j = new Paint();
        this.f29436k = new Path();
        this.f29437l = null;
        this.f29439n = null;
        this.f29441p = false;
        this.f29442q = false;
        this.f29443r = 5;
        this.f29440o = aVar;
        this.f29435j.setAntiAlias(true);
        this.f29435j.setStyle(Paint.Style.STROKE);
        this.f29435j.setStrokeCap(Paint.Cap.ROUND);
        this.f29435j.setStrokeJoin(Paint.Join.ROUND);
        this.f29427b = f(4.0f);
        this.f29428c = f(8.0f);
        this.f29438m = 0.4f;
        this.f29435j.setColor(Color.parseColor("#1d26b7"));
        this.f29433h = new RectF();
        d();
        setBackgroundColor(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    private void a(Y9.a aVar, float f10, float f11) {
        g();
        float strokeWidth = this.f29435j.getStrokeWidth();
        float f12 = f11 - f10;
        float floor = (float) Math.floor(aVar.a());
        int i10 = 0;
        while (true) {
            float f13 = i10;
            if (f13 >= floor) {
                this.f29435j.setStrokeWidth(strokeWidth);
                return;
            }
            float f14 = f13 / floor;
            float f15 = f14 * f14;
            float f16 = f15 * f14;
            float f17 = 1.0f - f14;
            float f18 = f17 * f17;
            float f19 = f18 * f17;
            c cVar = aVar.f12157a;
            float f20 = cVar.f12163a * f19;
            float f21 = f18 * 3.0f * f14;
            c cVar2 = aVar.f12158b;
            float f22 = f20 + (cVar2.f12163a * f21);
            float f23 = f17 * 3.0f * f15;
            c cVar3 = aVar.f12159c;
            float f24 = f22 + (cVar3.f12163a * f23);
            c cVar4 = aVar.f12160d;
            float f25 = f24 + (cVar4.f12163a * f16);
            float f26 = (f19 * cVar.f12164b) + (f21 * cVar2.f12164b) + (f23 * cVar3.f12164b) + (cVar4.f12164b * f16);
            this.f29435j.setStrokeWidth(f10 + (f16 * f12));
            this.f29439n.drawPoint(f25, f26, this.f29435j);
            h(f25, f26);
            i10++;
        }
    }

    private void b(c cVar) {
        this.f29434i.add(cVar);
        if (this.f29434i.size() > 2) {
            if (this.f29434i.size() == 3) {
                List list = this.f29434i;
                list.add(0, (c) list.get(0));
            }
            Y9.a aVar = new Y9.a((c) this.f29434i.get(1), c((c) this.f29434i.get(0), (c) this.f29434i.get(1), (c) this.f29434i.get(2)).f12162b, c((c) this.f29434i.get(1), (c) this.f29434i.get(2), (c) this.f29434i.get(3)).f12161a, (c) this.f29434i.get(2));
            float b10 = aVar.f12160d.b(aVar.f12157a);
            if (Float.isNaN(b10)) {
                b10 = 0.0f;
            }
            float f10 = this.f29438m;
            float f11 = (b10 * f10) + ((1.0f - f10) * this.f29431f);
            float k10 = k(f11);
            a(aVar, this.f29432g, k10);
            this.f29431f = f11;
            this.f29432g = k10;
            this.f29434i.remove(0);
        }
    }

    private Y9.b c(c cVar, c cVar2, c cVar3) {
        float f10 = cVar.f12163a;
        float f11 = cVar2.f12163a;
        float f12 = f10 - f11;
        float f13 = cVar.f12164b;
        float f14 = cVar2.f12164b;
        float f15 = f13 - f14;
        float f16 = f11 - cVar3.f12163a;
        float f17 = f14 - cVar3.f12164b;
        c cVar4 = new c((f10 + f11) / 2.0f, (f13 + f14) / 2.0f);
        c cVar5 = new c((cVar2.f12163a + cVar3.f12163a) / 2.0f, (cVar2.f12164b + cVar3.f12164b) / 2.0f);
        float sqrt = (float) Math.sqrt((f12 * f12) + (f15 * f15));
        float sqrt2 = (float) Math.sqrt((f16 * f16) + (f17 * f17));
        float f18 = cVar4.f12163a;
        float f19 = cVar5.f12163a;
        float f20 = cVar4.f12164b;
        float f21 = cVar5.f12164b;
        float f22 = sqrt2 / (sqrt + sqrt2);
        c cVar6 = new c(f19 + ((f18 - f19) * f22), f21 + ((f20 - f21) * f22));
        float f23 = cVar2.f12163a - cVar6.f12163a;
        float f24 = cVar2.f12164b - cVar6.f12164b;
        return new Y9.b(new c(cVar4.f12163a + f23, cVar4.f12164b + f24), new c(cVar5.f12163a + f23, cVar5.f12164b + f24));
    }

    private int f(float f10) {
        return Math.round(f10 * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    private void g() {
        if (this.f29437l == null) {
            this.f29437l = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f29439n = new Canvas(this.f29437l);
        }
    }

    private void h(float f10, float f11) {
        RectF rectF = this.f29433h;
        if (f10 < rectF.left) {
            rectF.left = f10;
        } else if (f10 > rectF.right) {
            rectF.right = f10;
        }
        if (f11 < rectF.top) {
            rectF.top = f11;
        } else if (f11 > rectF.bottom) {
            rectF.bottom = f11;
        }
    }

    private void i(float f10, float f11) {
        this.f29433h.left = Math.min(this.f29429d, f10);
        this.f29433h.right = Math.max(this.f29429d, f10);
        this.f29433h.top = Math.min(this.f29430e, f11);
        this.f29433h.bottom = Math.max(this.f29430e, f11);
    }

    private float k(float f10) {
        return Math.max(this.f29428c / (f10 + 1.0f), this.f29427b);
    }

    private void setIsEmpty(boolean z10) {
        this.f29426a = z10;
    }

    public void d() {
        this.f29441p = false;
        this.f29434i = new ArrayList();
        this.f29431f = 0.0f;
        this.f29432g = (this.f29427b + this.f29428c) / 2;
        this.f29436k.reset();
        if (this.f29437l != null) {
            this.f29437l = null;
            g();
        }
        setIsEmpty(true);
        invalidate();
    }

    public void e() {
        d();
    }

    public Bitmap getSignature() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void j() {
        a aVar = this.f29440o;
        if (aVar == null || !this.f29441p) {
            return;
        }
        aVar.a();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f29437l;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f29435j);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getPointerCount() > 1 || (this.f29442q && motionEvent.getAction() != 1)) {
            this.f29442q = true;
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f29429d = x10;
            this.f29430e = y10;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f29434i.clear();
            this.f29436k.moveTo(x10, y10);
            b(new c(x10, y10));
        } else {
            if (action == 1) {
                if (this.f29434i.size() >= 3) {
                    i(x10, y10);
                    b(new c(x10, y10));
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setIsEmpty(false);
                    j();
                }
                this.f29441p = false;
                this.f29442q = false;
                RectF rectF = this.f29433h;
                float f10 = rectF.left;
                int i10 = this.f29428c;
                invalidate((int) (f10 - i10), (int) (rectF.top - i10), (int) (rectF.right + i10), (int) (rectF.bottom + i10));
                return true;
            }
            if (action != 2) {
                return false;
            }
        }
        if ((Math.abs(this.f29429d - x10) < this.f29443r || Math.abs(this.f29430e - y10) < this.f29443r) && this.f29441p) {
            return false;
        }
        i(x10, y10);
        b(new c(x10, y10));
        this.f29441p = true;
        RectF rectF2 = this.f29433h;
        float f102 = rectF2.left;
        int i102 = this.f29428c;
        invalidate((int) (f102 - i102), (int) (rectF2.top - i102), (int) (rectF2.right + i102), (int) (rectF2.bottom + i102));
        return true;
    }

    public void setMaxStrokeWidth(int i10) {
        this.f29428c = i10;
    }

    public void setMinStrokeWidth(int i10) {
        this.f29427b = i10;
    }

    public void setStrokeColor(int i10) {
        this.f29435j.setColor(i10);
    }
}
