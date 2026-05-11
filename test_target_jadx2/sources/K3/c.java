package K3;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f5269a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5270b;

    /* renamed from: c, reason: collision with root package name */
    private long f5271c;

    /* renamed from: d, reason: collision with root package name */
    private long f5272d;

    /* renamed from: e, reason: collision with root package name */
    private long f5273e;

    /* renamed from: f, reason: collision with root package name */
    private long f5274f;

    /* renamed from: g, reason: collision with root package name */
    private long f5275g;

    /* renamed from: h, reason: collision with root package name */
    private long f5276h;

    /* renamed from: i, reason: collision with root package name */
    private long f5277i;

    /* renamed from: j, reason: collision with root package name */
    private int f5278j;

    /* renamed from: k, reason: collision with root package name */
    private int f5279k;

    /* renamed from: l, reason: collision with root package name */
    private int f5280l;

    public c(M3.b frameScheduler) {
        Intrinsics.checkNotNullParameter(frameScheduler, "frameScheduler");
        this.f5269a = frameScheduler;
        this.f5271c = 8L;
        this.f5278j = -1;
        this.f5279k = -1;
    }

    private final long d() {
        return SystemClock.uptimeMillis();
    }

    public final int a() {
        long d10 = this.f5270b ? (d() - this.f5274f) + this.f5272d : Math.max(this.f5276h, 0L);
        int b10 = this.f5269a.b(d10, this.f5276h);
        this.f5276h = d10;
        return b10;
    }

    public final boolean b() {
        return this.f5270b;
    }

    public final long c() {
        if (!this.f5270b) {
            return -1L;
        }
        long a10 = this.f5269a.a(d() - this.f5274f);
        if (a10 == -1) {
            this.f5270b = false;
            return -1L;
        }
        long j10 = a10 + this.f5271c;
        this.f5275g = this.f5274f + j10;
        return j10;
    }

    public final void e() {
        this.f5280l++;
    }

    public final void f(int i10) {
        this.f5278j = i10;
    }

    public final void g(boolean z10) {
        this.f5270b = z10;
    }

    public final boolean h() {
        return this.f5278j != -1 && d() >= this.f5275g;
    }

    public final void i() {
        if (this.f5270b) {
            return;
        }
        long d10 = d();
        long j10 = d10 - this.f5273e;
        this.f5274f = j10;
        this.f5275g = j10;
        this.f5276h = d10 - this.f5277i;
        this.f5278j = this.f5279k;
        this.f5270b = true;
    }

    public final void j() {
        if (this.f5270b) {
            long d10 = d();
            this.f5273e = d10 - this.f5274f;
            this.f5277i = d10 - this.f5276h;
            this.f5274f = 0L;
            this.f5275g = 0L;
            this.f5276h = -1L;
            this.f5278j = -1;
            this.f5270b = false;
        }
    }
}
