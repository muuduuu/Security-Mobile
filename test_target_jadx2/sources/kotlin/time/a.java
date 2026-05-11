package kotlin.time;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0542a f36861b = new C0542a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f36862c = n(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f36863d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f36864e;

    /* renamed from: a, reason: collision with root package name */
    private final long f36865a;

    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0542a {
        public /* synthetic */ C0542a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0542a() {
        }
    }

    static {
        long e10;
        long e11;
        e10 = b.e(4611686018427387903L);
        f36863d = e10;
        e11 = b.e(-4611686018427387903L);
        f36864e = e11;
    }

    private /* synthetic */ a(long j10) {
        this.f36865a = j10;
    }

    public static int A(long j10) {
        return Long.hashCode(j10);
    }

    private static final boolean B(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean C(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean D(long j10) {
        return j10 == f36863d || j10 == f36864e;
    }

    public static final boolean E(long j10) {
        return j10 < 0;
    }

    public static final double F(long j10, Id.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f36863d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f36864e) {
            return Double.NEGATIVE_INFINITY;
        }
        return c.a(z(j10), y(j10), unit);
    }

    public static final long G(long j10, Id.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f36863d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f36864e) {
            return Long.MIN_VALUE;
        }
        return c.b(z(j10), y(j10), unit);
    }

    public static String H(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f36863d) {
            return "Infinity";
        }
        if (j10 == f36864e) {
            return "-Infinity";
        }
        boolean E10 = E(j10);
        StringBuilder sb2 = new StringBuilder();
        if (E10) {
            sb2.append('-');
        }
        long p10 = p(j10);
        long r10 = r(p10);
        int q10 = q(p10);
        int v10 = v(p10);
        int x10 = x(p10);
        int w10 = w(p10);
        int i10 = 0;
        boolean z10 = r10 != 0;
        boolean z11 = q10 != 0;
        boolean z12 = v10 != 0;
        boolean z13 = (x10 == 0 && w10 == 0) ? false : true;
        if (z10) {
            sb2.append(r10);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(q10);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(v10);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (x10 != 0 || z10 || z11 || z12) {
                b(j10, sb2, x10, w10, 9, "s", false);
            } else if (w10 >= 1000000) {
                b(j10, sb2, w10 / HVFrameRecorder.BITRATE, w10 % HVFrameRecorder.BITRATE, 6, "ms", false);
            } else if (w10 >= 1000) {
                b(j10, sb2, w10 / 1000, w10 % 1000, 3, "us", false);
            } else {
                sb2.append(w10);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (E10 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final long I(long j10) {
        long d10;
        d10 = b.d(-z(j10), ((int) j10) & 1);
        return d10;
    }

    private static final void b(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String i02 = StringsKt.i0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = i02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (i02.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) i02, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) i02, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a c(long j10) {
        return new a(j10);
    }

    public static int e(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.h(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return E(j10) ? -i10 : i10;
    }

    public static long n(long j10) {
        if (Id.a.a()) {
            if (C(j10)) {
                long z10 = z(j10);
                if (-4611686018426999999L > z10 || z10 >= 4611686018427000000L) {
                    throw new AssertionError(z(j10) + " ns is out of nanoseconds range");
                }
            } else {
                long z11 = z(j10);
                if (-4611686018427387903L > z11 || z11 >= 4611686018427387904L) {
                    throw new AssertionError(z(j10) + " ms is out of milliseconds range");
                }
                long z12 = z(j10);
                if (-4611686018426L <= z12 && z12 < 4611686018427L) {
                    throw new AssertionError(z(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean o(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).J();
    }

    public static final long p(long j10) {
        return E(j10) ? I(j10) : j10;
    }

    public static final int q(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (s(j10) % 24);
    }

    public static final long r(long j10) {
        return G(j10, Id.b.DAYS);
    }

    public static final long s(long j10) {
        return G(j10, Id.b.HOURS);
    }

    public static final long t(long j10) {
        return G(j10, Id.b.MINUTES);
    }

    public static final long u(long j10) {
        return G(j10, Id.b.SECONDS);
    }

    public static final int v(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (t(j10) % 60);
    }

    public static final int w(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (B(j10) ? b.h(z(j10) % 1000) : z(j10) % 1000000000);
    }

    public static final int x(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (u(j10) % 60);
    }

    private static final Id.b y(long j10) {
        return C(j10) ? Id.b.NANOSECONDS : Id.b.MILLISECONDS;
    }

    private static final long z(long j10) {
        return j10 >> 1;
    }

    public final /* synthetic */ long J() {
        return this.f36865a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return d(((a) obj).J());
    }

    public int d(long j10) {
        return e(this.f36865a, j10);
    }

    public boolean equals(Object obj) {
        return o(this.f36865a, obj);
    }

    public int hashCode() {
        return A(this.f36865a);
    }

    public String toString() {
        return H(this.f36865a);
    }
}
