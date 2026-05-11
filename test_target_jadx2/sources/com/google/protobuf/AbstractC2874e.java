package com.google.protobuf;

import com.google.protobuf.AbstractC2893y;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2874e {

    /* renamed from: com.google.protobuf.e$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f28720a;

        /* renamed from: b, reason: collision with root package name */
        public long f28721b;

        /* renamed from: c, reason: collision with root package name */
        public Object f28722c;

        /* renamed from: d, reason: collision with root package name */
        public final C2884o f28723d;

        a(C2884o c2884o) {
            c2884o.getClass();
            this.f28723d = c2884o;
        }
    }

    static int A(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        E e10 = (E) bVar;
        int K10 = K(bArr, i11, aVar);
        e10.e(AbstractC2878i.b(aVar.f28721b));
        while (K10 < i12) {
            int H10 = H(bArr, K10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            K10 = K(bArr, H10, aVar);
            e10.e(AbstractC2878i.b(aVar.f28721b));
        }
        return K10;
    }

    static int B(byte[] bArr, int i10, a aVar) {
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a;
        if (i11 < 0) {
            throw C2894z.e();
        }
        if (i11 == 0) {
            aVar.f28722c = BuildConfig.FLAVOR;
            return H10;
        }
        aVar.f28722c = new String(bArr, H10, i11, AbstractC2893y.f28819b);
        return H10 + i11;
    }

    static int C(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        int H10 = H(bArr, i11, aVar);
        int i13 = aVar.f28720a;
        if (i13 < 0) {
            throw C2894z.e();
        }
        if (i13 == 0) {
            bVar.add(BuildConfig.FLAVOR);
        } else {
            bVar.add(new String(bArr, H10, i13, AbstractC2893y.f28819b));
            H10 += i13;
        }
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i14 = aVar.f28720a;
            if (i14 < 0) {
                throw C2894z.e();
            }
            if (i14 == 0) {
                bVar.add(BuildConfig.FLAVOR);
            } else {
                bVar.add(new String(bArr, H10, i14, AbstractC2893y.f28819b));
                H10 += i14;
            }
        }
        return H10;
    }

    static int D(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        int H10 = H(bArr, i11, aVar);
        int i13 = aVar.f28720a;
        if (i13 < 0) {
            throw C2894z.e();
        }
        if (i13 == 0) {
            bVar.add(BuildConfig.FLAVOR);
        } else {
            int i14 = H10 + i13;
            if (!n0.n(bArr, H10, i14)) {
                throw C2894z.c();
            }
            bVar.add(new String(bArr, H10, i13, AbstractC2893y.f28819b));
            H10 = i14;
        }
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i15 = aVar.f28720a;
            if (i15 < 0) {
                throw C2894z.e();
            }
            if (i15 == 0) {
                bVar.add(BuildConfig.FLAVOR);
            } else {
                int i16 = H10 + i15;
                if (!n0.n(bArr, H10, i16)) {
                    throw C2894z.c();
                }
                bVar.add(new String(bArr, H10, i15, AbstractC2893y.f28819b));
                H10 = i16;
            }
        }
        return H10;
    }

    static int E(byte[] bArr, int i10, a aVar) {
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a;
        if (i11 < 0) {
            throw C2894z.e();
        }
        if (i11 == 0) {
            aVar.f28722c = BuildConfig.FLAVOR;
            return H10;
        }
        aVar.f28722c = n0.e(bArr, H10, i11);
        return H10 + i11;
    }

    static int F(int i10, byte[] bArr, int i11, int i12, j0 j0Var, a aVar) {
        if (o0.a(i10) == 0) {
            throw C2894z.b();
        }
        int b10 = o0.b(i10);
        if (b10 == 0) {
            int K10 = K(bArr, i11, aVar);
            j0Var.n(i10, Long.valueOf(aVar.f28721b));
            return K10;
        }
        if (b10 == 1) {
            j0Var.n(i10, Long.valueOf(i(bArr, i11)));
            return i11 + 8;
        }
        if (b10 == 2) {
            int H10 = H(bArr, i11, aVar);
            int i13 = aVar.f28720a;
            if (i13 < 0) {
                throw C2894z.e();
            }
            if (i13 > bArr.length - H10) {
                throw C2894z.h();
            }
            if (i13 == 0) {
                j0Var.n(i10, AbstractC2877h.f28729b);
            } else {
                j0Var.n(i10, AbstractC2877h.m(bArr, H10, i13));
            }
            return H10 + i13;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw C2894z.b();
            }
            j0Var.n(i10, Integer.valueOf(g(bArr, i11)));
            return i11 + 4;
        }
        j0 k10 = j0.k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int H11 = H(bArr, i11, aVar);
            int i16 = aVar.f28720a;
            if (i16 == i14) {
                i15 = i16;
                i11 = H11;
                break;
            }
            i15 = i16;
            i11 = F(i16, bArr, H11, i12, k10, aVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw C2894z.f();
        }
        j0Var.n(i10, k10);
        return i11;
    }

    static int G(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f28720a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f28720a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f28720a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f28720a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                aVar.f28720a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int H(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return G(b10, bArr, i11, aVar);
        }
        aVar.f28720a = b10;
        return i11;
    }

    static int I(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        AbstractC2892x abstractC2892x = (AbstractC2892x) bVar;
        int H10 = H(bArr, i11, aVar);
        abstractC2892x.e(aVar.f28720a);
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            abstractC2892x.e(aVar.f28720a);
        }
        return H10;
    }

    static int J(long j10, byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        aVar.f28721b = j11;
        return i11;
    }

    static int K(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return J(j10, bArr, i11, aVar);
        }
        aVar.f28721b = j10;
        return i11;
    }

    static int L(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        E e10 = (E) bVar;
        int K10 = K(bArr, i11, aVar);
        e10.e(aVar.f28721b);
        while (K10 < i12) {
            int H10 = H(bArr, K10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            K10 = K(bArr, H10, aVar);
            e10.e(aVar.f28721b);
        }
        return K10;
    }

    static int M(Object obj, c0 c0Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        int b02 = ((Q) c0Var).b0(obj, bArr, i10, i11, i12, aVar);
        aVar.f28722c = obj;
        return b02;
    }

    static int N(Object obj, c0 c0Var, byte[] bArr, int i10, int i11, a aVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = G(i13, bArr, i12, aVar);
            i13 = aVar.f28720a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw C2894z.h();
        }
        int i15 = i13 + i14;
        c0Var.i(obj, bArr, i14, i15, aVar);
        aVar.f28722c = obj;
        return i15;
    }

    static int a(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        AbstractC2875f abstractC2875f = (AbstractC2875f) bVar;
        int K10 = K(bArr, i11, aVar);
        abstractC2875f.e(aVar.f28721b != 0);
        while (K10 < i12) {
            int H10 = H(bArr, K10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            K10 = K(bArr, H10, aVar);
            abstractC2875f.e(aVar.f28721b != 0);
        }
        return K10;
    }

    static int b(byte[] bArr, int i10, a aVar) {
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a;
        if (i11 < 0) {
            throw C2894z.e();
        }
        if (i11 > bArr.length - H10) {
            throw C2894z.h();
        }
        if (i11 == 0) {
            aVar.f28722c = AbstractC2877h.f28729b;
            return H10;
        }
        aVar.f28722c = AbstractC2877h.m(bArr, H10, i11);
        return H10 + i11;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        int H10 = H(bArr, i11, aVar);
        int i13 = aVar.f28720a;
        if (i13 < 0) {
            throw C2894z.e();
        }
        if (i13 > bArr.length - H10) {
            throw C2894z.h();
        }
        if (i13 == 0) {
            bVar.add(AbstractC2877h.f28729b);
        } else {
            bVar.add(AbstractC2877h.m(bArr, H10, i13));
            H10 += i13;
        }
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i14 = aVar.f28720a;
            if (i14 < 0) {
                throw C2894z.e();
            }
            if (i14 > bArr.length - H10) {
                throw C2894z.h();
            }
            if (i14 == 0) {
                bVar.add(AbstractC2877h.f28729b);
            } else {
                bVar.add(AbstractC2877h.m(bArr, H10, i14));
                H10 += i14;
            }
        }
        return H10;
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(i(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        AbstractC2881l abstractC2881l = (AbstractC2881l) bVar;
        abstractC2881l.e(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            abstractC2881l.e(d(bArr, H10));
            i13 = H10 + 8;
        }
        return i13;
    }

    static int f(int i10, byte[] bArr, int i11, int i12, Object obj, N n10, i0 i0Var, a aVar) {
        aVar.f28723d.a(n10, i10 >>> 3);
        return F(i10, bArr, i11, i12, Q.u(obj), aVar);
    }

    static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int h(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        AbstractC2892x abstractC2892x = (AbstractC2892x) bVar;
        abstractC2892x.e(g(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            abstractC2892x.e(g(bArr, H10));
            i13 = H10 + 4;
        }
        return i13;
    }

    static long i(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static int j(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        E e10 = (E) bVar;
        e10.e(i(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            e10.e(i(bArr, H10));
            i13 = H10 + 8;
        }
        return i13;
    }

    static float k(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    static int l(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        AbstractC2889u abstractC2889u = (AbstractC2889u) bVar;
        abstractC2889u.e(k(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            abstractC2889u.e(k(bArr, H10));
            i13 = H10 + 4;
        }
        return i13;
    }

    static int m(c0 c0Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        Object b10 = c0Var.b();
        int M10 = M(b10, c0Var, bArr, i10, i11, i12, aVar);
        c0Var.e(b10);
        aVar.f28722c = b10;
        return M10;
    }

    static int n(c0 c0Var, int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        int i13 = (i10 & (-8)) | 4;
        int m10 = m(c0Var, bArr, i11, i12, i13, aVar);
        bVar.add(aVar.f28722c);
        while (m10 < i12) {
            int H10 = H(bArr, m10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            m10 = m(c0Var, bArr, H10, i12, i13, aVar);
            bVar.add(aVar.f28722c);
        }
        return m10;
    }

    static int o(c0 c0Var, byte[] bArr, int i10, int i11, a aVar) {
        Object b10 = c0Var.b();
        int N10 = N(b10, c0Var, bArr, i10, i11, aVar);
        c0Var.e(b10);
        aVar.f28722c = b10;
        return N10;
    }

    static int p(c0 c0Var, int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        int o10 = o(c0Var, bArr, i11, i12, aVar);
        bVar.add(aVar.f28722c);
        while (o10 < i12) {
            int H10 = H(bArr, o10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            o10 = o(c0Var, bArr, H10, i12, aVar);
            bVar.add(aVar.f28722c);
        }
        return o10;
    }

    static int q(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        AbstractC2875f abstractC2875f = (AbstractC2875f) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            H10 = K(bArr, H10, aVar);
            abstractC2875f.e(aVar.f28721b != 0);
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int r(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        AbstractC2881l abstractC2881l = (AbstractC2881l) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            abstractC2881l.e(d(bArr, H10));
            H10 += 8;
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int s(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        AbstractC2892x abstractC2892x = (AbstractC2892x) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            abstractC2892x.e(g(bArr, H10));
            H10 += 4;
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int t(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        E e10 = (E) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            e10.e(i(bArr, H10));
            H10 += 8;
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int u(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        AbstractC2889u abstractC2889u = (AbstractC2889u) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            abstractC2889u.e(k(bArr, H10));
            H10 += 4;
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int v(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        AbstractC2892x abstractC2892x = (AbstractC2892x) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            H10 = H(bArr, H10, aVar);
            abstractC2892x.e(AbstractC2878i.a(aVar.f28720a));
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int w(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        E e10 = (E) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            H10 = K(bArr, H10, aVar);
            e10.e(AbstractC2878i.b(aVar.f28721b));
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int x(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        AbstractC2892x abstractC2892x = (AbstractC2892x) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            H10 = H(bArr, H10, aVar);
            abstractC2892x.e(aVar.f28720a);
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int y(byte[] bArr, int i10, AbstractC2893y.b bVar, a aVar) {
        E e10 = (E) bVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f28720a + H10;
        while (H10 < i11) {
            H10 = K(bArr, H10, aVar);
            e10.e(aVar.f28721b);
        }
        if (H10 == i11) {
            return H10;
        }
        throw C2894z.h();
    }

    static int z(int i10, byte[] bArr, int i11, int i12, AbstractC2893y.b bVar, a aVar) {
        AbstractC2892x abstractC2892x = (AbstractC2892x) bVar;
        int H10 = H(bArr, i11, aVar);
        abstractC2892x.e(AbstractC2878i.a(aVar.f28720a));
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f28720a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            abstractC2892x.e(AbstractC2878i.a(aVar.f28720a));
        }
        return H10;
    }
}
