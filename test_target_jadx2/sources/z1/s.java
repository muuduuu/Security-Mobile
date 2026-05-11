package Z1;

import a2.AbstractC1346c;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12333a = AbstractC1346c.a.a("x", "y");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12334a;

        static {
            int[] iArr = new int[AbstractC1346c.b.values().length];
            f12334a = iArr;
            try {
                iArr[AbstractC1346c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12334a[AbstractC1346c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12334a[AbstractC1346c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(AbstractC1346c abstractC1346c, float f10) {
        abstractC1346c.b();
        float i10 = (float) abstractC1346c.i();
        float i11 = (float) abstractC1346c.i();
        while (abstractC1346c.p() != AbstractC1346c.b.END_ARRAY) {
            abstractC1346c.t();
        }
        abstractC1346c.d();
        return new PointF(i10 * f10, i11 * f10);
    }

    private static PointF b(AbstractC1346c abstractC1346c, float f10) {
        float i10 = (float) abstractC1346c.i();
        float i11 = (float) abstractC1346c.i();
        while (abstractC1346c.f()) {
            abstractC1346c.t();
        }
        return new PointF(i10 * f10, i11 * f10);
    }

    private static PointF c(AbstractC1346c abstractC1346c, float f10) {
        abstractC1346c.c();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12333a);
            if (r10 == 0) {
                f11 = g(abstractC1346c);
            } else if (r10 != 1) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                f12 = g(abstractC1346c);
            }
        }
        abstractC1346c.e();
        return new PointF(f11 * f10, f12 * f10);
    }

    static int d(AbstractC1346c abstractC1346c) {
        abstractC1346c.b();
        int i10 = (int) (abstractC1346c.i() * 255.0d);
        int i11 = (int) (abstractC1346c.i() * 255.0d);
        int i12 = (int) (abstractC1346c.i() * 255.0d);
        while (abstractC1346c.f()) {
            abstractC1346c.t();
        }
        abstractC1346c.d();
        return Color.argb(255, i10, i11, i12);
    }

    static PointF e(AbstractC1346c abstractC1346c, float f10) {
        int i10 = a.f12334a[abstractC1346c.p().ordinal()];
        if (i10 == 1) {
            return b(abstractC1346c, f10);
        }
        if (i10 == 2) {
            return a(abstractC1346c, f10);
        }
        if (i10 == 3) {
            return c(abstractC1346c, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + abstractC1346c.p());
    }

    static List f(AbstractC1346c abstractC1346c, float f10) {
        ArrayList arrayList = new ArrayList();
        abstractC1346c.b();
        while (abstractC1346c.p() == AbstractC1346c.b.BEGIN_ARRAY) {
            abstractC1346c.b();
            arrayList.add(e(abstractC1346c, f10));
            abstractC1346c.d();
        }
        abstractC1346c.d();
        return arrayList;
    }

    static float g(AbstractC1346c abstractC1346c) {
        AbstractC1346c.b p10 = abstractC1346c.p();
        int i10 = a.f12334a[p10.ordinal()];
        if (i10 == 1) {
            return (float) abstractC1346c.i();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + p10);
        }
        abstractC1346c.b();
        float i11 = (float) abstractC1346c.i();
        while (abstractC1346c.f()) {
            abstractC1346c.t();
        }
        abstractC1346c.d();
        return i11;
    }
}
