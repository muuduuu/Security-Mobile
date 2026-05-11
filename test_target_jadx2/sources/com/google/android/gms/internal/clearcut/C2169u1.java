package com.google.android.gms.internal.clearcut;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.clearcut.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2169u1 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f24097a;

    /* renamed from: b, reason: collision with root package name */
    private K f24098b;

    /* renamed from: c, reason: collision with root package name */
    private int f24099c;

    private C2169u1(ByteBuffer byteBuffer) {
        this.f24097a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    private final void d(int i10) {
        byte b10 = (byte) i10;
        if (!this.f24097a.hasRemaining()) {
            throw new C2172v1(this.f24097a.position(), this.f24097a.limit());
        }
        this.f24097a.put(b10);
    }

    private final void e(int i10) {
        while ((i10 & (-128)) != 0) {
            d((i10 & 127) | 128);
            i10 >>>= 7;
        }
        d(i10);
    }

    public static int f(int i10, String str) {
        return v(i10) + o(str);
    }

    public static int g(int i10, byte[] bArr) {
        return v(i10) + p(bArr);
    }

    public static int k(int i10, long j10) {
        return v(i10) + u(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    private static void l(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i11 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                char c11 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c11 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i12 = i11 + 1;
                            if (i12 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i11 - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c11);
                i11++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i13 = remaining + arrayOffset;
            while (i11 < length2) {
                int i14 = i11 + arrayOffset;
                if (i14 >= i13 || (charAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                array[i14] = (byte) charAt;
                i11++;
            }
            if (i11 == length2) {
                i10 = arrayOffset + length2;
            } else {
                i10 = arrayOffset + i11;
                while (i11 < length2) {
                    char charAt4 = charSequence.charAt(i11);
                    if (charAt4 < 128 && i10 < i13) {
                        array[i10] = (byte) charAt4;
                        i10++;
                    } else if (charAt4 < 2048 && i10 <= i13 - 2) {
                        int i15 = i10 + 1;
                        array[i10] = (byte) ((charAt4 >>> 6) | 960);
                        i10 += 2;
                        array[i15] = (byte) ((charAt4 & '?') | 128);
                    } else {
                        if ((charAt4 >= 55296 && c10 >= charAt4) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i16 = i11 + 1;
                            if (i16 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    array[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    array[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i17 = i10 + 3;
                                    array[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    array[i17] = (byte) ((codePoint2 & 63) | 128);
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        array[i10] = (byte) ((charAt4 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH);
                        int i18 = i10 + 2;
                        array[i10 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        array[i18] = (byte) ((charAt4 & '?') | 128);
                    }
                    i11++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    public static int o(String str) {
        int a10 = a(str);
        return x(a10) + a10;
    }

    public static int p(byte[] bArr) {
        return x(bArr.length) + bArr.length;
    }

    public static C2169u1 q(byte[] bArr, int i10, int i11) {
        return new C2169u1(bArr, 0, i11);
    }

    public static long s(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int u(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int v(int i10) {
        return x(i10 << 3);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return x(i10);
        }
        return 10;
    }

    private static int x(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void b(int i10, String str) {
        h(i10, 2);
        try {
            int x10 = x(str.length());
            if (x10 != x(str.length() * 3)) {
                e(a(str));
                l(str, this.f24097a);
                return;
            }
            int position = this.f24097a.position();
            if (this.f24097a.remaining() < x10) {
                throw new C2172v1(position + x10, this.f24097a.limit());
            }
            this.f24097a.position(position + x10);
            l(str, this.f24097a);
            int position2 = this.f24097a.position();
            this.f24097a.position(position);
            e((position2 - position) - x10);
            this.f24097a.position(position2);
        } catch (BufferOverflowException e10) {
            C2172v1 c2172v1 = new C2172v1(this.f24097a.position(), this.f24097a.limit());
            c2172v1.initCause(e10);
            throw c2172v1;
        }
    }

    public final void c(int i10, byte[] bArr) {
        h(i10, 2);
        e(bArr.length);
        int length = bArr.length;
        if (this.f24097a.remaining() < length) {
            throw new C2172v1(this.f24097a.position(), this.f24097a.limit());
        }
        this.f24097a.put(bArr, 0, length);
    }

    public final void h(int i10, int i11) {
        e((i10 << 3) | i11);
    }

    public final void i(int i10, boolean z10) {
        h(25, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        if (!this.f24097a.hasRemaining()) {
            throw new C2172v1(this.f24097a.position(), this.f24097a.limit());
        }
        this.f24097a.put(b10);
    }

    public final void j(int i10, int i11) {
        h(i10, 0);
        if (i11 >= 0) {
            e(i11);
        } else {
            t(i11);
        }
    }

    public final void m(int i10, B0 b02) {
        if (this.f24098b != null) {
            if (this.f24099c != this.f24097a.position()) {
                this.f24098b.c(this.f24097a.array(), this.f24099c, this.f24097a.position() - this.f24099c);
            }
            K k10 = this.f24098b;
            k10.l(i10, b02);
            k10.b();
            this.f24099c = this.f24097a.position();
        }
        this.f24098b = K.d(this.f24097a);
        this.f24099c = this.f24097a.position();
        K k102 = this.f24098b;
        k102.l(i10, b02);
        k102.b();
        this.f24099c = this.f24097a.position();
    }

    public final void n() {
        if (this.f24097a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f24097a.remaining())));
        }
    }

    public final void r(int i10, long j10) {
        h(i10, 0);
        t(j10);
    }

    public final void t(long j10) {
        while (((-128) & j10) != 0) {
            d((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        d((int) j10);
    }

    private C2169u1(byte[] bArr, int i10, int i11) {
        this(ByteBuffer.wrap(bArr, i10, i11));
    }
}
