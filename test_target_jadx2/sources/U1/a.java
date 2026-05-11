package U1;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f10294a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f10295b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f10296c;

    public a() {
        this.f10294a = new PointF();
        this.f10295b = new PointF();
        this.f10296c = new PointF();
    }

    public PointF a() {
        return this.f10294a;
    }

    public PointF b() {
        return this.f10295b;
    }

    public PointF c() {
        return this.f10296c;
    }

    public void d(float f10, float f11) {
        this.f10294a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f10295b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f10296c.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f10296c.x), Float.valueOf(this.f10296c.y), Float.valueOf(this.f10294a.x), Float.valueOf(this.f10294a.y), Float.valueOf(this.f10295b.x), Float.valueOf(this.f10295b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f10294a = pointF;
        this.f10295b = pointF2;
        this.f10296c = pointF3;
    }
}
