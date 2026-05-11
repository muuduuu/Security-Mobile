package b2;

import W1.o;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f18535a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean d(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int e(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    static int f(float f10, float f11) {
        return g((int) f10, (int) f11);
    }

    private static int g(int i10, int i11) {
        return i10 - (i11 * e(i10, i11));
    }

    public static void h(o oVar, Path path) {
        path.reset();
        PointF b10 = oVar.b();
        path.moveTo(b10.x, b10.y);
        f18535a.set(b10.x, b10.y);
        for (int i10 = 0; i10 < oVar.a().size(); i10++) {
            U1.a aVar = (U1.a) oVar.a().get(i10);
            PointF a10 = aVar.a();
            PointF b11 = aVar.b();
            PointF c10 = aVar.c();
            PointF pointF = f18535a;
            if (a10.equals(pointF) && b11.equals(c10)) {
                path.lineTo(c10.x, c10.y);
            } else {
                path.cubicTo(a10.x, a10.y, b11.x, b11.y, c10.x, c10.y);
            }
            pointF.set(c10.x, c10.y);
        }
        if (oVar.d()) {
            path.close();
        }
    }

    public static float i(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int j(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static void k(U1.e eVar, int i10, List list, U1.e eVar2, Q1.k kVar) {
        if (eVar.c(kVar.getName(), i10)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
