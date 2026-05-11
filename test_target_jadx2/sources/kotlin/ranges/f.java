package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.ranges.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f extends e {
    public static double b(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double f(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float g(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int h(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long i(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static float j(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int k(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long l(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static a m(int i10, int i11) {
        return a.f36419d.a(i10, i11, -1);
    }

    public static a n(a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        e.a(i10 > 0, Integer.valueOf(i10));
        a.C0529a c0529a = a.f36419d;
        int c10 = aVar.c();
        int e10 = aVar.e();
        if (aVar.h() <= 0) {
            i10 = -i10;
        }
        return c0529a.a(c10, e10, i10);
    }

    public static b o(b bVar, long j10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        e.a(j10 > 0, Long.valueOf(j10));
        b.a aVar = b.f36423d;
        long c10 = bVar.c();
        long e10 = bVar.e();
        if (bVar.h() <= 0) {
            j10 = -j10;
        }
        return aVar.a(c10, e10, j10);
    }

    public static IntRange p(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.INSTANCE.a() : new IntRange(i10, i11 - 1);
    }

    public static c q(int i10, long j10) {
        return j10 <= Long.MIN_VALUE ? c.f36427e.a() : new c(i10, j10 - 1);
    }
}
