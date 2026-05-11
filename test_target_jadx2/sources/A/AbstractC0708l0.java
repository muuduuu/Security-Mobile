package A;

import android.graphics.PointF;
import android.util.Rational;

/* renamed from: A.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0708l0 {

    /* renamed from: a, reason: collision with root package name */
    private Rational f199a;

    public AbstractC0708l0() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    protected abstract PointF a(float f10, float f11);

    public final C0706k0 b(float f10, float f11) {
        return c(f10, f11, d());
    }

    public final C0706k0 c(float f10, float f11, float f12) {
        PointF a10 = a(f10, f11);
        return new C0706k0(a10.x, a10.y, f12, this.f199a);
    }

    protected void e(Rational rational) {
        this.f199a = rational;
    }

    public AbstractC0708l0(Rational rational) {
        this.f199a = rational;
    }
}
