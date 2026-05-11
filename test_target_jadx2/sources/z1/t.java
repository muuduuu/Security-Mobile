package Z1;

import O1.AbstractC1034e;
import O1.C1038i;
import a2.AbstractC1346c;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import c2.C1718a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class t {

    /* renamed from: b, reason: collision with root package name */
    private static j0.j f12336b;

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f12335a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    static AbstractC1346c.a f12337c = AbstractC1346c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    static AbstractC1346c.a f12338d = AbstractC1346c.a.a("x", "y");

    private static WeakReference a(int i10) {
        WeakReference weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().i(i10);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator a10;
        pointF.x = b2.k.b(pointF.x, -1.0f, 1.0f);
        pointF.y = b2.k.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = b2.k.b(pointF2.x, -1.0f, 1.0f);
        float b10 = b2.k.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        int i10 = b2.l.i(pointF.x, pointF.y, pointF2.x, b10);
        WeakReference a11 = AbstractC1034e.e() ? null : a(i10);
        Interpolator interpolator = a11 != null ? (Interpolator) a11.get() : null;
        if (a11 == null || interpolator == null) {
            try {
                a10 = androidx.core.view.animation.a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                a10 = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? androidx.core.view.animation.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = a10;
            if (!AbstractC1034e.e()) {
                try {
                    h(i10, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    static C1718a c(AbstractC1346c abstractC1346c, C1038i c1038i, float f10, N n10, boolean z10, boolean z11) {
        return (z10 && z11) ? e(c1038i, abstractC1346c, f10, n10) : z10 ? d(c1038i, abstractC1346c, f10, n10) : f(abstractC1346c, f10, n10);
    }

    private static C1718a d(C1038i c1038i, AbstractC1346c abstractC1346c, float f10, N n10) {
        Interpolator b10;
        Object obj;
        abstractC1346c.c();
        PointF pointF = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        boolean z10 = false;
        PointF pointF4 = null;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12337c)) {
                case 0:
                    f11 = (float) abstractC1346c.i();
                    break;
                case 1:
                    obj3 = n10.a(abstractC1346c, f10);
                    break;
                case 2:
                    obj2 = n10.a(abstractC1346c, f10);
                    break;
                case 3:
                    pointF = s.e(abstractC1346c, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(abstractC1346c, 1.0f);
                    break;
                case 5:
                    if (abstractC1346c.j() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(abstractC1346c, f10);
                    break;
                case 7:
                    pointF3 = s.e(abstractC1346c, f10);
                    break;
                default:
                    abstractC1346c.t();
                    break;
            }
        }
        abstractC1346c.e();
        if (z10) {
            b10 = f12335a;
            obj = obj3;
        } else {
            b10 = (pointF == null || pointF4 == null) ? f12335a : b(pointF, pointF4);
            obj = obj2;
        }
        C1718a c1718a = new C1718a(c1038i, obj3, obj, b10, f11, null);
        c1718a.f19349o = pointF2;
        c1718a.f19350p = pointF3;
        return c1718a;
    }

    private static C1718a e(C1038i c1038i, AbstractC1346c abstractC1346c, float f10, N n10) {
        Interpolator interpolator;
        Interpolator b10;
        Interpolator b11;
        Object obj;
        PointF pointF;
        C1718a c1718a;
        PointF pointF2;
        float f11;
        PointF pointF3;
        abstractC1346c.c();
        PointF pointF4 = null;
        boolean z10 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        Object obj2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f12 = 0.0f;
        PointF pointF11 = null;
        Object obj3 = null;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12337c)) {
                case 0:
                    pointF2 = pointF4;
                    f12 = (float) abstractC1346c.i();
                    pointF4 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    obj2 = n10.a(abstractC1346c, f10);
                    pointF4 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    obj3 = n10.a(abstractC1346c, f10);
                    pointF4 = pointF2;
                    break;
                case 3:
                    pointF2 = pointF4;
                    f11 = f12;
                    PointF pointF12 = pointF11;
                    if (abstractC1346c.p() == AbstractC1346c.b.BEGIN_OBJECT) {
                        abstractC1346c.c();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (abstractC1346c.f()) {
                            int r10 = abstractC1346c.r(f12338d);
                            if (r10 == 0) {
                                AbstractC1346c.b p10 = abstractC1346c.p();
                                AbstractC1346c.b bVar = AbstractC1346c.b.NUMBER;
                                if (p10 == bVar) {
                                    f15 = (float) abstractC1346c.i();
                                    f13 = f15;
                                } else {
                                    abstractC1346c.b();
                                    f13 = (float) abstractC1346c.i();
                                    f15 = abstractC1346c.p() == bVar ? (float) abstractC1346c.i() : f13;
                                    abstractC1346c.d();
                                }
                            } else if (r10 != 1) {
                                abstractC1346c.t();
                            } else {
                                AbstractC1346c.b p11 = abstractC1346c.p();
                                AbstractC1346c.b bVar2 = AbstractC1346c.b.NUMBER;
                                if (p11 == bVar2) {
                                    f16 = (float) abstractC1346c.i();
                                    f14 = f16;
                                } else {
                                    abstractC1346c.b();
                                    f14 = (float) abstractC1346c.i();
                                    f16 = abstractC1346c.p() == bVar2 ? (float) abstractC1346c.i() : f14;
                                    abstractC1346c.d();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f13, f14);
                        PointF pointF14 = new PointF(f15, f16);
                        abstractC1346c.e();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f12 = f11;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF5 = s.e(abstractC1346c, f10);
                        f12 = f11;
                        pointF11 = pointF12;
                        pointF4 = pointF2;
                    }
                case 4:
                    if (abstractC1346c.p() == AbstractC1346c.b.BEGIN_OBJECT) {
                        abstractC1346c.c();
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (abstractC1346c.f()) {
                            PointF pointF15 = pointF11;
                            int r11 = abstractC1346c.r(f12338d);
                            if (r11 != 0) {
                                pointF3 = pointF4;
                                if (r11 != 1) {
                                    abstractC1346c.t();
                                } else {
                                    AbstractC1346c.b p12 = abstractC1346c.p();
                                    AbstractC1346c.b bVar3 = AbstractC1346c.b.NUMBER;
                                    if (p12 == bVar3) {
                                        f20 = (float) abstractC1346c.i();
                                        f12 = f12;
                                        f18 = f20;
                                    } else {
                                        float f21 = f12;
                                        abstractC1346c.b();
                                        float i10 = (float) abstractC1346c.i();
                                        float i11 = abstractC1346c.p() == bVar3 ? (float) abstractC1346c.i() : i10;
                                        abstractC1346c.d();
                                        f12 = f21;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f20 = i11;
                                        f18 = i10;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f22 = f12;
                                AbstractC1346c.b p13 = abstractC1346c.p();
                                AbstractC1346c.b bVar4 = AbstractC1346c.b.NUMBER;
                                if (p13 == bVar4) {
                                    f19 = (float) abstractC1346c.i();
                                    f12 = f22;
                                    f17 = f19;
                                } else {
                                    abstractC1346c.b();
                                    f17 = (float) abstractC1346c.i();
                                    f19 = abstractC1346c.p() == bVar4 ? (float) abstractC1346c.i() : f17;
                                    abstractC1346c.d();
                                    f12 = f22;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f11 = f12;
                        PointF pointF16 = new PointF(f17, f18);
                        PointF pointF17 = new PointF(f19, f20);
                        abstractC1346c.e();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f12 = f11;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(abstractC1346c, f10);
                        pointF4 = pointF2;
                    }
                case 5:
                    if (abstractC1346c.j() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF11 = s.e(abstractC1346c, f10);
                    break;
                case 7:
                    pointF4 = s.e(abstractC1346c, f10);
                    break;
                default:
                    abstractC1346c.t();
                    break;
            }
        }
        PointF pointF18 = pointF4;
        float f23 = f12;
        PointF pointF19 = pointF11;
        abstractC1346c.e();
        if (z10) {
            interpolator = f12335a;
            obj = obj2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else {
                if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                    b10 = b(pointF7, pointF9);
                    b11 = b(pointF8, pointF10);
                    obj = obj3;
                    interpolator = null;
                    if (b10 != null || b11 == null) {
                        pointF = pointF19;
                        c1718a = new C1718a(c1038i, obj2, obj, interpolator, f23, null);
                    } else {
                        pointF = pointF19;
                        c1718a = new C1718a(c1038i, obj2, obj, b10, b11, f23, null);
                    }
                    c1718a.f19349o = pointF;
                    c1718a.f19350p = pointF18;
                    return c1718a;
                }
                interpolator = f12335a;
            }
            obj = obj3;
        }
        b10 = null;
        b11 = null;
        if (b10 != null) {
        }
        pointF = pointF19;
        c1718a = new C1718a(c1038i, obj2, obj, interpolator, f23, null);
        c1718a.f19349o = pointF;
        c1718a.f19350p = pointF18;
        return c1718a;
    }

    private static C1718a f(AbstractC1346c abstractC1346c, float f10, N n10) {
        return new C1718a(n10.a(abstractC1346c, f10));
    }

    private static j0.j g() {
        if (f12336b == null) {
            f12336b = new j0.j();
        }
        return f12336b;
    }

    private static void h(int i10, WeakReference weakReference) {
        synchronized (t.class) {
            f12336b.n(i10, weakReference);
        }
    }
}
