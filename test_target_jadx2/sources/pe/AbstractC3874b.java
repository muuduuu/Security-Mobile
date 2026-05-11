package pe;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;

/* renamed from: pe.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3874b {

    /* renamed from: a, reason: collision with root package name */
    private static final C3877e.a f38646a = new C3877e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f38647b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f38647b;
    }

    public static final C3877e.a d() {
        return f38646a;
    }

    public static final int e(C3880h c3880h, int i10) {
        Intrinsics.checkNotNullParameter(c3880h, "<this>");
        return i10 == f38647b ? c3880h.L() : i10;
    }

    public static final int f(byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i10 == f38647b ? bArr.length : i10;
    }

    public static final C3877e.a g(C3877e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f38646a ? new C3877e.a() : unsafeCursor;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long i(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short j(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String k(byte b10) {
        return StringsKt.n(new char[]{qe.b.f()[(b10 >> 4) & 15], qe.b.f()[b10 & 15]});
    }

    public static final String l(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = {qe.b.f()[(i10 >> 28) & 15], qe.b.f()[(i10 >> 24) & 15], qe.b.f()[(i10 >> 20) & 15], qe.b.f()[(i10 >> 16) & 15], qe.b.f()[(i10 >> 12) & 15], qe.b.f()[(i10 >> 8) & 15], qe.b.f()[(i10 >> 4) & 15], qe.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return StringsKt.o(cArr, i11, 8);
    }
}
