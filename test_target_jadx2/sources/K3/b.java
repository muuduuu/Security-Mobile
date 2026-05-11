package K3;

import D3.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import c3.AbstractC1721a;
import q3.InterfaceC3918a;
import y3.C5170d;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable, InterfaceC3918a {

    /* renamed from: r, reason: collision with root package name */
    private static final Class f5249r = b.class;

    /* renamed from: s, reason: collision with root package name */
    private static final d f5250s = new e();

    /* renamed from: a, reason: collision with root package name */
    private D3.a f5251a;

    /* renamed from: b, reason: collision with root package name */
    private M3.b f5252b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f5253c;

    /* renamed from: d, reason: collision with root package name */
    private long f5254d;

    /* renamed from: e, reason: collision with root package name */
    private long f5255e;

    /* renamed from: f, reason: collision with root package name */
    private long f5256f;

    /* renamed from: g, reason: collision with root package name */
    private int f5257g;

    /* renamed from: h, reason: collision with root package name */
    private long f5258h;

    /* renamed from: i, reason: collision with root package name */
    private long f5259i;

    /* renamed from: j, reason: collision with root package name */
    private int f5260j;

    /* renamed from: m, reason: collision with root package name */
    private int f5263m;

    /* renamed from: o, reason: collision with root package name */
    private final a.InterfaceC0022a f5265o;

    /* renamed from: p, reason: collision with root package name */
    private C5170d f5266p;

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f5267q;

    /* renamed from: k, reason: collision with root package name */
    private long f5261k = 8;

    /* renamed from: l, reason: collision with root package name */
    private long f5262l = 0;

    /* renamed from: n, reason: collision with root package name */
    private volatile d f5264n = f5250s;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            bVar.unscheduleSelf(bVar.f5267q);
            b.this.invalidateSelf();
        }
    }

    public b(D3.a aVar) {
        a.InterfaceC0022a interfaceC0022a = new a.InterfaceC0022a() { // from class: K3.a
        };
        this.f5265o = interfaceC0022a;
        this.f5267q = new a();
        this.f5251a = aVar;
        this.f5252b = c(aVar);
        if (aVar != null) {
            aVar.j(interfaceC0022a);
        }
    }

    private static M3.b c(D3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new M3.a(aVar);
    }

    private long d() {
        return SystemClock.uptimeMillis();
    }

    private void e() {
        this.f5263m++;
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.z(f5249r, "Dropped a frame. Count: %s", Integer.valueOf(this.f5263m));
        }
    }

    private void f(long j10) {
        long j11 = this.f5254d + j10;
        this.f5256f = j11;
        scheduleSelf(this.f5267q, j11);
    }

    @Override // q3.InterfaceC3918a
    public void a() {
        D3.a aVar = this.f5251a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5251a == null || this.f5252b == null) {
            return;
        }
        long d10 = d();
        long max = this.f5253c ? (d10 - this.f5254d) + this.f5262l : Math.max(this.f5255e, 0L);
        int b10 = this.f5252b.b(max, this.f5255e);
        if (b10 == -1) {
            b10 = this.f5251a.a() - 1;
            this.f5264n.c(this);
            this.f5253c = false;
        } else if (b10 == 0 && this.f5257g != -1 && d10 >= this.f5256f) {
            this.f5264n.a(this);
        }
        boolean n10 = this.f5251a.n(this, canvas, b10);
        if (n10) {
            this.f5264n.d(this, b10);
            this.f5257g = b10;
        }
        if (!n10) {
            e();
        }
        long d11 = d();
        if (this.f5253c) {
            long a10 = this.f5252b.a(d11 - this.f5254d);
            if (a10 != -1) {
                f(a10 + this.f5261k);
            } else {
                this.f5264n.c(this);
                this.f5253c = false;
            }
        }
        this.f5255e = max;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        D3.a aVar = this.f5251a;
        return aVar == null ? super.getIntrinsicHeight() : aVar.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        D3.a aVar = this.f5251a;
        return aVar == null ? super.getIntrinsicWidth() : aVar.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5253c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        D3.a aVar = this.f5251a;
        if (aVar != null) {
            aVar.d(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f5253c) {
            return false;
        }
        long j10 = i10;
        if (this.f5255e == j10) {
            return false;
        }
        this.f5255e = j10;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f5266p == null) {
            this.f5266p = new C5170d();
        }
        this.f5266p.b(i10);
        D3.a aVar = this.f5251a;
        if (aVar != null) {
            aVar.l(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5266p == null) {
            this.f5266p = new C5170d();
        }
        this.f5266p.c(colorFilter);
        D3.a aVar = this.f5251a;
        if (aVar != null) {
            aVar.g(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        D3.a aVar;
        if (this.f5253c || (aVar = this.f5251a) == null || aVar.a() <= 1) {
            return;
        }
        this.f5253c = true;
        long d10 = d();
        long j10 = d10 - this.f5258h;
        this.f5254d = j10;
        this.f5256f = j10;
        this.f5255e = d10 - this.f5259i;
        this.f5257g = this.f5260j;
        invalidateSelf();
        this.f5264n.b(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f5253c) {
            long d10 = d();
            this.f5258h = d10 - this.f5254d;
            this.f5259i = d10 - this.f5255e;
            this.f5260j = this.f5257g;
            this.f5253c = false;
            this.f5254d = 0L;
            this.f5256f = 0L;
            this.f5255e = -1L;
            this.f5257g = -1;
            unscheduleSelf(this.f5267q);
            this.f5264n.c(this);
        }
    }
}
