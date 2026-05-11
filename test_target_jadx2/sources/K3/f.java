package K3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import q3.InterfaceC3918a;
import y3.C5170d;

/* loaded from: classes.dex */
public final class f extends Drawable implements Animatable, InterfaceC3918a {

    /* renamed from: a, reason: collision with root package name */
    private D3.a f5281a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5282b;

    /* renamed from: c, reason: collision with root package name */
    private d f5283c;

    /* renamed from: d, reason: collision with root package name */
    private final C5170d f5284d;

    /* renamed from: e, reason: collision with root package name */
    private final a f5285e;

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.unscheduleSelf(this);
            f.this.invalidateSelf();
        }
    }

    public f(D3.a animationBackend) {
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        this.f5281a = animationBackend;
        this.f5282b = new c(new M3.a(this.f5281a));
        this.f5283c = new e();
        C5170d c5170d = new C5170d();
        c5170d.a(this);
        this.f5284d = c5170d;
        this.f5285e = new a();
    }

    @Override // q3.InterfaceC3918a
    public void a() {
        this.f5281a.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int a10 = this.f5282b.a();
        if (a10 == -1) {
            a10 = this.f5281a.a() - 1;
            this.f5282b.g(false);
            this.f5283c.c(this);
        } else if (a10 == 0 && this.f5282b.h()) {
            this.f5283c.a(this);
        }
        if (this.f5281a.n(this, canvas, a10)) {
            this.f5283c.d(this, a10);
            this.f5282b.f(a10);
        } else {
            this.f5282b.e();
        }
        long c10 = this.f5282b.c();
        if (c10 != -1) {
            scheduleSelf(this.f5285e, c10);
        } else {
            this.f5283c.c(this);
            this.f5282b.g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5281a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5281a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5282b.b();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f5281a.d(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5284d.b(i10);
        this.f5281a.l(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5284d.c(colorFilter);
        this.f5281a.g(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f5281a.a() <= 0) {
            return;
        }
        this.f5282b.i();
        this.f5283c.b(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5282b.j();
        this.f5283c.c(this);
        unscheduleSelf(this.f5285e);
    }
}
