package A;

import android.graphics.PointF;
import android.view.Display;

/* loaded from: classes.dex */
public final class A extends AbstractC0708l0 {

    /* renamed from: b, reason: collision with root package name */
    private final float f0b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1c;

    /* renamed from: d, reason: collision with root package name */
    private final Display f2d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0713p f3e;

    public A(Display display, InterfaceC0713p interfaceC0713p, float f10, float f11) {
        this.f0b = f10;
        this.f1c = f11;
        this.f2d = display;
        this.f3e = interfaceC0713p;
    }

    private int f(boolean z10) {
        try {
            int m10 = this.f3e.m(this.f2d.getRotation());
            return z10 ? (360 - m10) % 360 : m10;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // A.AbstractC0708l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected PointF a(float f10, float f11) {
        float f12 = this.f0b;
        float f13 = this.f1c;
        boolean z10 = this.f3e.i() == 0;
        int f14 = f(z10);
        if (f14 != 90 && f14 != 270) {
            f11 = f10;
            f10 = f11;
            f13 = f12;
            f12 = f13;
        }
        if (f14 != 90) {
            if (f14 != 180) {
                if (f14 == 270) {
                    f11 = f13 - f11;
                }
                if (z10) {
                    f11 = f13 - f11;
                }
                return new PointF(f11 / f13, f10 / f12);
            }
            f11 = f13 - f11;
        }
        f10 = f12 - f10;
        if (z10) {
        }
        return new PointF(f11 / f13, f10 / f12);
    }
}
