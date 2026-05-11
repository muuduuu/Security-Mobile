package y3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: y3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5172f extends AbstractC5167a {

    /* renamed from: i, reason: collision with root package name */
    private final Drawable[] f45184i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f45185j;

    /* renamed from: k, reason: collision with root package name */
    private final int f45186k;

    /* renamed from: l, reason: collision with root package name */
    private final int f45187l;

    /* renamed from: m, reason: collision with root package name */
    int f45188m;

    /* renamed from: n, reason: collision with root package name */
    int f45189n;

    /* renamed from: o, reason: collision with root package name */
    long f45190o;

    /* renamed from: p, reason: collision with root package name */
    int[] f45191p;

    /* renamed from: q, reason: collision with root package name */
    int[] f45192q;

    /* renamed from: r, reason: collision with root package name */
    int f45193r;

    /* renamed from: s, reason: collision with root package name */
    boolean[] f45194s;

    /* renamed from: t, reason: collision with root package name */
    int f45195t;

    /* renamed from: u, reason: collision with root package name */
    private O3.k f45196u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f45197v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f45198w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f45199x;

    public C5172f(Drawable[] drawableArr, boolean z10, int i10) {
        super(drawableArr);
        this.f45199x = true;
        b3.l.j(drawableArr.length >= 1, "At least one layer required!");
        this.f45184i = drawableArr;
        this.f45191p = new int[drawableArr.length];
        this.f45192q = new int[drawableArr.length];
        this.f45193r = 255;
        this.f45194s = new boolean[drawableArr.length];
        this.f45195t = 0;
        this.f45185j = z10;
        this.f45186k = z10 ? 255 : 0;
        this.f45187l = i10;
        t();
    }

    private void h(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null || i10 <= 0) {
            return;
        }
        this.f45195t++;
        if (this.f45199x) {
            drawable.mutate();
        }
        drawable.setAlpha(i10);
        this.f45195t--;
        drawable.draw(canvas);
    }

    private void p() {
        if (this.f45197v) {
            this.f45197v = false;
            O3.k kVar = this.f45196u;
            if (kVar != null) {
                kVar.c();
            }
        }
    }

    private void q() {
        int i10;
        if (!this.f45197v && (i10 = this.f45187l) >= 0) {
            boolean[] zArr = this.f45194s;
            if (i10 < zArr.length && zArr[i10]) {
                this.f45197v = true;
                O3.k kVar = this.f45196u;
                if (kVar != null) {
                    kVar.a();
                }
            }
        }
    }

    private void s() {
        if (this.f45198w && this.f45188m == 2 && this.f45194s[this.f45187l]) {
            O3.k kVar = this.f45196u;
            if (kVar != null) {
                kVar.b();
            }
            this.f45198w = false;
        }
    }

    private void t() {
        this.f45188m = 2;
        Arrays.fill(this.f45191p, this.f45186k);
        this.f45191p[0] = 255;
        Arrays.fill(this.f45192q, this.f45186k);
        this.f45192q[0] = 255;
        Arrays.fill(this.f45194s, this.f45185j);
        this.f45194s[0] = true;
    }

    private boolean v(float f10) {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f45184i.length; i10++) {
            boolean z11 = this.f45194s[i10];
            int i11 = z11 ? 1 : -1;
            int[] iArr = this.f45192q;
            int i12 = (int) (this.f45191p[i10] + (i11 * 255 * f10));
            iArr[i10] = i12;
            if (i12 < 0) {
                iArr[i10] = 0;
            }
            if (iArr[i10] > 255) {
                iArr[i10] = 255;
            }
            if (z11 && iArr[i10] < 255) {
                z10 = false;
            }
            if (!z11 && iArr[i10] > 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[LOOP:0: B:14:0x0052->B:16:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[EDGE_INSN: B:17:0x0072->B:18:0x0072 BREAK  A[LOOP:0: B:14:0x0052->B:16:0x0057], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean v10;
        Drawable[] drawableArr;
        int i10 = this.f45188m;
        int i11 = 0;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                b3.l.i(this.f45189n > 0);
                v10 = v((o() - this.f45190o) / this.f45189n);
                this.f45188m = v10 ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f45184i;
                if (i11 < drawableArr.length) {
                    break;
                }
                h(canvas, drawableArr[i11], (int) Math.ceil((this.f45192q[i11] * this.f45193r) / 255.0d));
                i11++;
            }
            if (z10) {
                invalidateSelf();
                return;
            } else {
                p();
                s();
                return;
            }
        }
        System.arraycopy(this.f45192q, 0, this.f45191p, 0, this.f45184i.length);
        this.f45190o = o();
        v10 = v(this.f45189n == 0 ? 1.0f : 0.0f);
        q();
        this.f45188m = v10 ? 2 : 1;
        z10 = v10;
        while (true) {
            drawableArr = this.f45184i;
            if (i11 < drawableArr.length) {
            }
            h(canvas, drawableArr[i11], (int) Math.ceil((this.f45192q[i11] * this.f45193r) / 255.0d));
            i11++;
        }
        if (z10) {
        }
    }

    public void f() {
        this.f45195t++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45193r;
    }

    public void i() {
        this.f45195t--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f45195t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f45188m = 0;
        Arrays.fill(this.f45194s, true);
        invalidateSelf();
    }

    public void k(int i10) {
        this.f45188m = 0;
        this.f45194s[i10] = true;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f45188m = 0;
        this.f45194s[i10] = false;
        invalidateSelf();
    }

    public void n() {
        this.f45188m = 2;
        for (int i10 = 0; i10 < this.f45184i.length; i10++) {
            this.f45192q[i10] = this.f45194s[i10] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long o() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f45193r != i10) {
            this.f45193r = i10;
            invalidateSelf();
        }
    }

    public void u(int i10) {
        this.f45189n = i10;
        if (this.f45188m == 1) {
            this.f45188m = 0;
        }
    }
}
