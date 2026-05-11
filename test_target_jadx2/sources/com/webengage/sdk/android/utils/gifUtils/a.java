package com.webengage.sdk.android.utils.gifUtils;

import android.graphics.Bitmap;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: A, reason: collision with root package name */
    protected Bitmap f30910A;

    /* renamed from: H, reason: collision with root package name */
    protected int f30917H;

    /* renamed from: I, reason: collision with root package name */
    protected short[] f30918I;

    /* renamed from: J, reason: collision with root package name */
    protected byte[] f30919J;

    /* renamed from: K, reason: collision with root package name */
    protected byte[] f30920K;

    /* renamed from: L, reason: collision with root package name */
    protected byte[] f30921L;

    /* renamed from: M, reason: collision with root package name */
    protected ArrayList<C0447a> f30922M;

    /* renamed from: N, reason: collision with root package name */
    protected int f30923N;

    /* renamed from: a, reason: collision with root package name */
    protected ByteBuffer f30924a;

    /* renamed from: b, reason: collision with root package name */
    protected int f30925b;

    /* renamed from: c, reason: collision with root package name */
    protected int f30926c;

    /* renamed from: d, reason: collision with root package name */
    protected int f30927d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f30928e;

    /* renamed from: f, reason: collision with root package name */
    protected int f30929f;

    /* renamed from: h, reason: collision with root package name */
    protected int[] f30931h;

    /* renamed from: i, reason: collision with root package name */
    protected int[] f30932i;

    /* renamed from: j, reason: collision with root package name */
    protected int[] f30933j;

    /* renamed from: k, reason: collision with root package name */
    protected int f30934k;

    /* renamed from: l, reason: collision with root package name */
    protected int f30935l;

    /* renamed from: m, reason: collision with root package name */
    protected int f30936m;

    /* renamed from: n, reason: collision with root package name */
    protected int f30937n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f30938o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f30939p;

    /* renamed from: q, reason: collision with root package name */
    protected int f30940q;

    /* renamed from: r, reason: collision with root package name */
    protected int f30941r;

    /* renamed from: s, reason: collision with root package name */
    protected int f30942s;

    /* renamed from: t, reason: collision with root package name */
    protected int f30943t;

    /* renamed from: u, reason: collision with root package name */
    protected int f30944u;

    /* renamed from: v, reason: collision with root package name */
    protected int f30945v;

    /* renamed from: w, reason: collision with root package name */
    protected int f30946w;

    /* renamed from: x, reason: collision with root package name */
    protected int f30947x;

    /* renamed from: y, reason: collision with root package name */
    protected int f30948y;

    /* renamed from: z, reason: collision with root package name */
    protected Bitmap f30949z;

    /* renamed from: g, reason: collision with root package name */
    protected int f30930g = 1;

    /* renamed from: B, reason: collision with root package name */
    protected final byte[] f30911B = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: C, reason: collision with root package name */
    protected int f30912C = 0;

    /* renamed from: D, reason: collision with root package name */
    protected int f30913D = 0;

    /* renamed from: E, reason: collision with root package name */
    protected int f30914E = 0;

    /* renamed from: F, reason: collision with root package name */
    protected boolean f30915F = false;

    /* renamed from: G, reason: collision with root package name */
    protected int f30916G = 0;

    /* renamed from: com.webengage.sdk.android.utils.gifUtils.a$a, reason: collision with other inner class name */
    private static class C0447a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f30950a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30951b;

        public C0447a(Bitmap bitmap, int i10) {
            this.f30950a = bitmap;
            this.f30951b = i10;
        }
    }

    public int a(int i10) {
        this.f30916G = -1;
        if (i10 >= 0 && i10 < this.f30923N) {
            this.f30916G = this.f30922M.get(i10).f30951b;
        }
        return this.f30916G;
    }

    public int b(byte[] bArr) {
        int i10;
        c();
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f30924a = wrap;
            wrap.rewind();
            this.f30924a.order(ByteOrder.LITTLE_ENDIAN);
            i();
            if (!b()) {
                g();
                i10 = this.f30923N < 0 ? 1 : 2;
            }
            return this.f30925b;
        }
        this.f30925b = i10;
        return this.f30925b;
    }

    protected void c() {
        this.f30925b = 0;
        this.f30923N = 0;
        this.f30922M = new ArrayList<>();
        this.f30931h = null;
        this.f30932i = null;
    }

    protected int d() {
        try {
            return this.f30924a.get() & 255;
        } catch (Exception unused) {
            this.f30925b = 1;
            return 0;
        }
    }

    protected void e() {
        this.f30941r = l();
        this.f30942s = l();
        this.f30943t = l();
        this.f30944u = l();
        int d10 = d();
        int i10 = 0;
        this.f30938o = (d10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d10 & 7) + 1);
        this.f30940q = pow;
        this.f30939p = (d10 & 64) != 0;
        if (this.f30938o) {
            int[] c10 = c(pow);
            this.f30932i = c10;
            this.f30933j = c10;
        } else {
            this.f30933j = this.f30931h;
            if (this.f30934k == this.f30917H) {
                this.f30935l = 0;
            }
        }
        if (this.f30915F) {
            int[] iArr = this.f30933j;
            int i11 = this.f30917H;
            int i12 = iArr[i11];
            iArr[i11] = 0;
            i10 = i12;
        }
        if (this.f30933j == null) {
            this.f30925b = 1;
        }
        if (b()) {
            return;
        }
        a();
        o();
        if (b()) {
            return;
        }
        this.f30923N++;
        this.f30949z = Bitmap.createBitmap(this.f30926c, this.f30927d, Bitmap.Config.ARGB_4444);
        n();
        this.f30922M.add(new C0447a(this.f30949z, this.f30916G));
        if (this.f30915F) {
            this.f30933j[this.f30917H] = i10;
        }
        m();
    }

    protected int f() {
        int d10 = d();
        this.f30912C = d10;
        int i10 = 0;
        if (d10 > 0) {
            while (true) {
                try {
                    int i11 = this.f30912C;
                    if (i10 >= i11) {
                        break;
                    }
                    int i12 = i11 - i10;
                    this.f30924a.get(this.f30911B, i10, i12);
                    i10 += i12;
                } catch (Exception unused) {
                    this.f30925b = 1;
                }
            }
        }
        return i10;
    }

    protected void g() {
        boolean z10 = false;
        while (!z10 && !b()) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 != 1) {
                    if (d11 == 249) {
                        h();
                    } else if (d11 != 254 && d11 == 255) {
                        f();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i10 = 0; i10 < 11; i10++) {
                            sb2.append((char) this.f30911B[i10]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            k();
                        }
                    }
                }
                o();
            } else if (d10 == 44) {
                e();
            } else if (d10 != 59) {
                this.f30925b = 1;
            } else {
                z10 = true;
            }
        }
    }

    protected void h() {
        d();
        int d10 = d();
        int i10 = (d10 & 28) >> 2;
        this.f30913D = i10;
        if (i10 == 0) {
            this.f30913D = 1;
        }
        this.f30915F = (d10 & 1) != 0;
        int l10 = l() * 10;
        this.f30916G = l10;
        if (l10 < 20) {
            this.f30916G = 100;
        }
        this.f30917H = d();
        d();
    }

    protected void i() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f30925b = 1;
            return;
        }
        j();
        if (!this.f30928e || b()) {
            return;
        }
        int[] c10 = c(this.f30929f);
        this.f30931h = c10;
        this.f30935l = c10[this.f30934k];
    }

    protected void j() {
        this.f30926c = l();
        this.f30927d = l();
        int d10 = d();
        this.f30928e = (d10 & 128) != 0;
        this.f30929f = 2 << (d10 & 7);
        this.f30934k = d();
        this.f30937n = d();
    }

    protected void k() {
        do {
            f();
            byte[] bArr = this.f30911B;
            if (bArr[0] == 1) {
                this.f30930g = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f30912C <= 0) {
                return;
            }
        } while (!b());
    }

    protected int l() {
        return d() | (d() << 8);
    }

    protected void m() {
        this.f30914E = this.f30913D;
        this.f30945v = this.f30941r;
        this.f30946w = this.f30942s;
        this.f30947x = this.f30943t;
        this.f30948y = this.f30944u;
        this.f30910A = this.f30949z;
        this.f30936m = this.f30935l;
        this.f30913D = 0;
        this.f30915F = false;
        this.f30916G = 0;
        this.f30932i = null;
    }

    protected void n() {
        int i10;
        int[] iArr = new int[this.f30926c * this.f30927d];
        int i11 = this.f30914E;
        int i12 = 0;
        if (i11 > 0) {
            if (i11 == 3) {
                int i13 = this.f30923N;
                this.f30910A = i13 + (-2) > 0 ? b(i13 - 3) : null;
            }
            Bitmap bitmap = this.f30910A;
            if (bitmap != null) {
                int i14 = this.f30926c;
                bitmap.getPixels(iArr, 0, i14, 0, 0, i14, this.f30927d);
                if (this.f30914E == 2) {
                    int i15 = !this.f30915F ? this.f30936m : 0;
                    for (int i16 = 0; i16 < this.f30948y; i16++) {
                        int i17 = ((this.f30946w + i16) * this.f30926c) + this.f30945v;
                        int i18 = this.f30947x + i17;
                        while (i17 < i18) {
                            iArr[i17] = i15;
                            i17++;
                        }
                    }
                }
            }
        }
        int i19 = 8;
        int i20 = 1;
        int i21 = 0;
        while (true) {
            int i22 = this.f30944u;
            if (i12 >= i22) {
                this.f30949z = Bitmap.createBitmap(iArr, this.f30926c, this.f30927d, Bitmap.Config.ARGB_4444);
                return;
            }
            if (this.f30939p) {
                if (i21 >= i22) {
                    i20++;
                    if (i20 == 2) {
                        i21 = 4;
                    } else if (i20 == 3) {
                        i19 = 4;
                        i21 = 2;
                    } else if (i20 == 4) {
                        i21 = 1;
                        i19 = 2;
                    }
                }
                i10 = i21 + i19;
            } else {
                i10 = i21;
                i21 = i12;
            }
            int i23 = i21 + this.f30942s;
            if (i23 < this.f30927d) {
                int i24 = this.f30926c;
                int i25 = i23 * i24;
                int i26 = this.f30941r + i25;
                int i27 = this.f30943t;
                int i28 = i26 + i27;
                int i29 = i25 + i24;
                if (i29 < i28) {
                    i28 = i29;
                }
                int i30 = i27 * i12;
                while (i26 < i28) {
                    int i31 = i30 + 1;
                    int i32 = this.f30933j[this.f30921L[i30] & 255];
                    if (i32 != 0) {
                        iArr[i26] = i32;
                    }
                    i26++;
                    i30 = i31;
                }
            }
            i12++;
            i21 = i10;
        }
    }

    protected void o() {
        do {
            f();
            if (this.f30912C <= 0) {
                return;
            }
        } while (!b());
    }

    public static a a(byte[] bArr) {
        a aVar = new a();
        aVar.b(bArr);
        return aVar;
    }

    public Bitmap b(int i10) {
        int i11 = this.f30923N;
        if (i11 <= 0) {
            return null;
        }
        return this.f30922M.get(i10 % i11).f30950a;
    }

    protected int[] c(int i10) {
        int[] iArr;
        byte[] bArr = new byte[i10 * 3];
        try {
            this.f30924a.get(bArr);
            iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                try {
                    int i14 = bArr[i12] & 255;
                    int i15 = i12 + 2;
                    i12 += 3;
                    int i16 = i11 + 1;
                    iArr[i11] = ((bArr[i13] & 255) << 8) | (i14 << 16) | (-16777216) | (bArr[i15] & 255);
                    i11 = i16;
                } catch (BufferUnderflowException unused) {
                    this.f30925b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException unused2) {
            iArr = null;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v22, types: [short] */
    /* JADX WARN: Type inference failed for: r4v24 */
    protected void a() {
        short s10;
        int i10 = this.f30943t * this.f30944u;
        byte[] bArr = this.f30921L;
        if (bArr == null || bArr.length < i10) {
            this.f30921L = new byte[i10];
        }
        if (this.f30918I == null) {
            this.f30918I = new short[4096];
        }
        if (this.f30919J == null) {
            this.f30919J = new byte[4096];
        }
        if (this.f30920K == null) {
            this.f30920K = new byte[4097];
        }
        int d10 = d();
        int i11 = 1;
        int i12 = 1 << d10;
        int i13 = i12 + 1;
        int i14 = i12 + 2;
        int i15 = d10 + 1;
        int i16 = (1 << i15) - 1;
        int i17 = 0;
        for (int i18 = 0; i18 < i12; i18++) {
            this.f30918I[i18] = 0;
            this.f30919J[i18] = (byte) i18;
        }
        byte[] bArr2 = this.f30911B;
        int i19 = -1;
        int i20 = i15;
        int i21 = i14;
        int i22 = i16;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        while (true) {
            if (i23 >= i10) {
                break;
            }
            if (i24 == 0) {
                i24 = f();
                if (i24 <= 0) {
                    this.f30925b = i11;
                    break;
                }
                i26 = i17;
            }
            i28 += (bArr2[i26] & 255) << i27;
            i26 += i11;
            i24 += i19;
            int i32 = i27 + 8;
            int i33 = i30;
            int i34 = i21;
            int i35 = i20;
            int i36 = i15;
            int i37 = i31;
            while (true) {
                if (i32 < i35) {
                    i31 = i37;
                    i21 = i34;
                    i30 = i33;
                    i27 = i32;
                    i15 = i36;
                    i11 = 1;
                    i17 = 0;
                    break;
                }
                int i38 = i14;
                int i39 = i28 & i22;
                i28 >>= i35;
                i32 -= i35;
                if (i39 == i12) {
                    i22 = i16;
                    i35 = i36;
                    i34 = i38;
                    i14 = i34;
                    i37 = -1;
                } else {
                    if (i39 == i13) {
                        i21 = i34;
                        i30 = i33;
                        i27 = i32;
                        i14 = i38;
                        i11 = 1;
                        i17 = 0;
                        i31 = i37;
                        i15 = i36;
                        break;
                    }
                    int i40 = i13;
                    if (i37 == -1) {
                        this.f30921L[i29] = this.f30919J[i39];
                        i29++;
                        i23++;
                        i37 = i39;
                        i33 = i37;
                        i14 = i38;
                        i13 = i40;
                    } else {
                        if (i39 >= i34) {
                            this.f30920K[i25] = (byte) i33;
                            i25++;
                            s10 = i37;
                        } else {
                            s10 = i39;
                        }
                        while (s10 >= i12) {
                            this.f30920K[i25] = this.f30919J[s10];
                            i25++;
                            s10 = this.f30918I[s10];
                            i12 = i12;
                        }
                        int i41 = i12;
                        int i42 = this.f30919J[s10] & 255;
                        byte b10 = (byte) i42;
                        this.f30921L[i29] = b10;
                        i29++;
                        i23++;
                        while (i25 > 0) {
                            i25--;
                            this.f30921L[i29] = this.f30920K[i25];
                            i29++;
                            i23++;
                            i42 = i42;
                        }
                        int i43 = i42;
                        if (i34 < 4096) {
                            this.f30918I[i34] = (short) i37;
                            this.f30919J[i34] = b10;
                            i34++;
                            if ((i34 & i22) == 0 && i34 < 4096) {
                                i35++;
                                i22 += i34;
                            }
                        }
                        i37 = i39;
                        i14 = i38;
                        i13 = i40;
                        i12 = i41;
                        i33 = i43;
                    }
                }
            }
            i20 = i35;
            i19 = -1;
        }
        Arrays.fill(this.f30921L, i29, i10, (byte) 0);
    }

    protected boolean b() {
        return this.f30925b != 0;
    }
}
