package pe;

import java.security.MessageDigest;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Y extends C3880h {

    /* renamed from: f, reason: collision with root package name */
    private final transient byte[][] f38641f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int[] f38642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(byte[][] segments, int[] directory) {
        super(C3880h.f38684e.q());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f38641f = segments;
        this.f38642g = directory;
    }

    private final C3880h V() {
        return new C3880h(Q());
    }

    @Override // pe.C3880h
    public int B(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return V().B(other, i10);
    }

    @Override // pe.C3880h
    public boolean F(int i10, C3880h other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > L() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = qe.e.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : T()[b10 - 1];
            int i15 = T()[b10] - i14;
            int i16 = T()[U().length + b10];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!other.G(i11, U()[b10], i16 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // pe.C3880h
    public boolean G(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > L() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = qe.e.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : T()[b10 - 1];
            int i15 = T()[b10] - i14;
            int i16 = T()[U().length + b10];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC3874b.a(U()[b10], i16 + (i10 - i14), other, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // pe.C3880h
    public C3880h N(int i10, int i11) {
        int e10 = AbstractC3874b.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (e10 > L()) {
            throw new IllegalArgumentException(("endIndex=" + e10 + " > length(" + L() + ')').toString());
        }
        int i12 = e10 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + e10 + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && e10 == L()) {
            return this;
        }
        if (i10 == e10) {
            return C3880h.f38684e;
        }
        int b10 = qe.e.b(this, i10);
        int b11 = qe.e.b(this, e10 - 1);
        byte[][] bArr = (byte[][]) AbstractC3574i.m(U(), b10, b11 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (b10 <= b11) {
            int i13 = b10;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(T()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = T()[U().length + i13];
                if (i13 == b11) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = b10 != 0 ? T()[b10 - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new Y(bArr, iArr);
    }

    @Override // pe.C3880h
    public C3880h P() {
        return V().P();
    }

    @Override // pe.C3880h
    public byte[] Q() {
        byte[] bArr = new byte[L()];
        int length = U().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = T()[length + i10];
            int i14 = T()[i10];
            int i15 = i14 - i11;
            AbstractC3574i.e(U()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // pe.C3880h
    public void S(C3877e buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int b10 = qe.e.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : T()[b10 - 1];
            int i14 = T()[b10] - i13;
            int i15 = T()[U().length + b10];
            int min = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            W w10 = new W(U()[b10], i16, i16 + min, true, false);
            W w11 = buffer.f38666a;
            if (w11 == null) {
                w10.f38635g = w10;
                w10.f38634f = w10;
                buffer.f38666a = w10;
            } else {
                Intrinsics.d(w11);
                W w12 = w11.f38635g;
                Intrinsics.d(w12);
                w12.c(w10);
            }
            i10 += min;
            b10++;
        }
        buffer.i0(buffer.size() + i11);
    }

    public final int[] T() {
        return this.f38642g;
    }

    public final byte[][] U() {
        return this.f38641f;
    }

    @Override // pe.C3880h
    public String b() {
        return V().b();
    }

    @Override // pe.C3880h
    public C3880h e(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = U().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = T()[length + i10];
            int i13 = T()[i10];
            messageDigest.update(U()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.d(digest);
        return new C3880h(digest);
    }

    @Override // pe.C3880h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3880h) {
            C3880h c3880h = (C3880h) obj;
            if (c3880h.L() == L() && F(0, c3880h, 0, L())) {
                return true;
            }
        }
        return false;
    }

    @Override // pe.C3880h
    public int hashCode() {
        int r10 = r();
        if (r10 != 0) {
            return r10;
        }
        int length = U().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = T()[length + i10];
            int i14 = T()[i10];
            byte[] bArr = U()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        H(i11);
        return i11;
    }

    @Override // pe.C3880h
    public int s() {
        return T()[U().length - 1];
    }

    @Override // pe.C3880h
    public String toString() {
        return V().toString();
    }

    @Override // pe.C3880h
    public String u() {
        return V().u();
    }

    @Override // pe.C3880h
    public int w(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return V().w(other, i10);
    }

    @Override // pe.C3880h
    public byte[] y() {
        return Q();
    }

    @Override // pe.C3880h
    public byte z(int i10) {
        AbstractC3874b.b(T()[U().length - 1], i10, 1L);
        int b10 = qe.e.b(this, i10);
        return U()[b10][(i10 - (b10 == 0 ? 0 : T()[b10 - 1])) + T()[U().length + b10]];
    }
}
