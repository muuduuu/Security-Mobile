package qe;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC3874b;
import pe.C3877e;
import pe.P;
import pe.W;
import pe.f0;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f38887a = f0.a("0123456789abcdef");

    public static final C3877e.a a(C3877e c3877e, C3877e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        C3877e.a g10 = AbstractC3874b.g(unsafeCursor);
        if (g10.f38668a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        g10.f38668a = c3877e;
        g10.f38669b = true;
        return g10;
    }

    public static final byte[] b() {
        return f38887a;
    }

    public static final boolean c(W segment, int i10, byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f38631c;
        byte[] bArr = segment.f38629a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f38634f;
                Intrinsics.d(segment);
                byte[] bArr2 = segment.f38629a;
                bArr = bArr2;
                i10 = segment.f38630b;
                i13 = segment.f38631c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C3877e c3877e, long j10) {
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c3877e.p(j11) == 13) {
                String R10 = c3877e.R(j11);
                c3877e.skip(2L);
                return R10;
            }
        }
        String R11 = c3877e.R(j10);
        c3877e.skip(1L);
        return R11;
    }

    public static final int e(C3877e c3877e, P options, boolean z10) {
        int i10;
        int i11;
        W w10;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        W w11 = c3877e.f38666a;
        if (w11 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = w11.f38629a;
        int i14 = w11.f38630b;
        int i15 = w11.f38631c;
        int[] m10 = options.m();
        W w12 = w11;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = m10[i17];
            int i20 = i17 + 2;
            int i21 = m10[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (w12 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == m10[i20]) {
                        i11 = m10[i20 + i19];
                        if (i10 == i15) {
                            w12 = w12.f38634f;
                            Intrinsics.d(w12);
                            i10 = w12.f38630b;
                            bArr = w12.f38629a;
                            i15 = w12.f38631c;
                            if (w12 == w11) {
                                w12 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != m10[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    Intrinsics.d(w12);
                    W w13 = w12.f38634f;
                    Intrinsics.d(w13);
                    i13 = w13.f38630b;
                    byte[] bArr2 = w13.f38629a;
                    i12 = w13.f38631c;
                    if (w13 != w11) {
                        w10 = w13;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        w10 = null;
                    }
                } else {
                    w10 = w12;
                    i12 = i15;
                    i13 = i25;
                }
                if (z11) {
                    i11 = m10[i26];
                    i10 = i13;
                    i15 = i12;
                    w12 = w10;
                    break;
                }
                i14 = i13;
                i15 = i12;
                w12 = w10;
                i20 = i26;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int f(C3877e c3877e, P p10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(c3877e, p10, z10);
    }
}
