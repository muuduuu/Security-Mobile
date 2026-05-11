package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f16577d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final int f16578a;

    /* renamed from: b, reason: collision with root package name */
    private final n f16579b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f16580c = 0;

    p(n nVar, int i10) {
        this.f16579b = nVar;
        this.f16578a = i10;
    }

    private R0.a g() {
        ThreadLocal threadLocal = f16577d;
        R0.a aVar = (R0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new R0.a();
            threadLocal.set(aVar);
        }
        this.f16579b.d().j(aVar, this.f16578a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f16579b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        canvas.drawText(this.f16579b.c(), this.f16578a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f16580c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f16580c & 4) > 0;
    }

    public void l(boolean z10) {
        int d10 = d();
        if (z10) {
            this.f16580c = d10 | 4;
        } else {
            this.f16580c = d10;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f16580c & 4;
        this.f16580c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
