package bb;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lc.v;
import rc.AbstractC4299c;

/* renamed from: bb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1666a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1666a f18911a = new C1666a();

    /* renamed from: bb.a$a, reason: collision with other inner class name */
    private static final class C0328a {

        /* renamed from: a, reason: collision with root package name */
        private int f18912a;

        /* renamed from: b, reason: collision with root package name */
        private int f18913b;

        /* renamed from: c, reason: collision with root package name */
        private float[] f18914c;

        public C0328a(int i10, int i11) {
            this.f18912a = i10;
            this.f18913b = i11;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i12 > 0 ? 0 : 1;
                while (true) {
                    int i15 = this.f18913b;
                    if (i14 * i15 < this.f18912a * (i15 - i12)) {
                        i13++;
                        i14++;
                    }
                }
                i12++;
            }
            this.f18914c = new float[i13];
        }

        public final int a(byte[] hash, int i10, int i11, float f10) {
            Intrinsics.checkNotNullParameter(hash, "hash");
            int length = this.f18914c.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f18914c[i12] = ((((hash[(i11 >> 1) + i10] >> ((i11 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f10;
                i11++;
            }
            return i11;
        }

        public final float[] b() {
            return this.f18914c;
        }
    }

    /* renamed from: bb.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f18915a;

        /* renamed from: b, reason: collision with root package name */
        private int f18916b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f18917c;

        public b(int i10, int i11, byte[] rgba) {
            Intrinsics.checkNotNullParameter(rgba, "rgba");
            this.f18915a = i10;
            this.f18916b = i11;
            this.f18917c = rgba;
        }

        public final int a() {
            return this.f18916b;
        }

        public final byte[] b() {
            return this.f18917c;
        }

        public final int c() {
            return this.f18915a;
        }
    }

    private C1666a() {
    }

    public final float a(byte[] hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        byte b10 = hash[3];
        boolean z10 = (hash[2] & 128) != 0;
        boolean z11 = (hash[4] & 128) != 0;
        int i10 = 5;
        int i11 = z11 ? z10 ? 5 : 7 : b10 & 7;
        if (z11) {
            i10 = b10 & 7;
        } else if (!z10) {
            i10 = 7;
        }
        return i11 / i10;
    }

    public final Bitmap b(byte[] hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        b c10 = c(hash);
        int[] iArr = new int[c10.c() * c10.a()];
        byte[] b10 = c10.b();
        ArrayList arrayList = new ArrayList(b10.length);
        int i10 = 0;
        for (byte b11 : b10) {
            arrayList.add(Integer.valueOf(v.c(b11) & 255));
        }
        int c11 = AbstractC4299c.c(0, arrayList.size() - 1, 4);
        if (c11 >= 0) {
            while (true) {
                iArr[i10 / 4] = Color.argb(((Number) arrayList.get(i10 + 3)).intValue(), ((Number) arrayList.get(i10)).intValue(), ((Number) arrayList.get(i10 + 1)).intValue(), ((Number) arrayList.get(i10 + 2)).intValue());
                if (i10 == c11) {
                    break;
                }
                i10 += 4;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, c10.c(), c10.a(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public final b c(byte[] hash) {
        C0328a c0328a;
        float f10;
        float[] fArr;
        float f11;
        float[] fArr2;
        int i10;
        Intrinsics.checkNotNullParameter(hash, "hash");
        int i11 = (hash[0] & 255) | ((hash[1] & 255) << 8) | ((hash[2] & 255) << 16);
        int i12 = (hash[3] & 255) | ((hash[4] & 255) << 8);
        float f12 = (i11 & 63) / 63.0f;
        float f13 = (((i11 >> 6) & 63) / 31.5f) - 1.0f;
        float f14 = (((i11 >> 12) & 63) / 31.5f) - 1.0f;
        float f15 = ((i11 >> 18) & 31) / 31.0f;
        boolean z10 = (i11 >> 23) != 0;
        float f16 = ((i12 >> 3) & 63) / 63.0f;
        float f17 = ((i12 >> 9) & 63) / 63.0f;
        boolean z11 = (i12 >> 15) != 0;
        int i13 = 7;
        int max = Math.max(3, z11 ? z10 ? 5 : 7 : i12 & 7);
        if (z11) {
            i13 = 7 & i12;
        } else if (z10) {
            i13 = 5;
        }
        int max2 = Math.max(3, i13);
        float f18 = z10 ? (hash[5] & 15) / 15.0f : 1.0f;
        float f19 = ((hash[5] >> 4) & 15) / 15.0f;
        int i14 = z10 ? 6 : 5;
        C0328a c0328a2 = new C0328a(max, max2);
        C0328a c0328a3 = new C0328a(3, 3);
        C0328a c0328a4 = new C0328a(3, 3);
        int a10 = c0328a4.a(hash, i14, c0328a3.a(hash, i14, c0328a2.a(hash, i14, 0, f15), f16 * 1.25f), f17 * 1.25f);
        float[] fArr3 = null;
        if (z10) {
            c0328a = new C0328a(5, 5);
            c0328a.a(hash, i14, a10, f19);
        } else {
            c0328a = null;
        }
        float[] b10 = c0328a2.b();
        float[] b11 = c0328a3.b();
        float[] b12 = c0328a4.b();
        if (z10) {
            Intrinsics.d(c0328a);
            fArr3 = c0328a.b();
        }
        float a11 = a(hash);
        int round = Math.round(a11 > 1.0f ? 32.0f : a11 * 32.0f);
        int round2 = Math.round(a11 > 1.0f ? 32.0f / a11 : 32.0f);
        byte[] bArr = new byte[round * round2 * 4];
        int max3 = Math.max(max, z10 ? 5 : 3);
        int max4 = Math.max(max2, z10 ? 5 : 3);
        float[] fArr4 = new float[max3];
        float[] fArr5 = new float[max4];
        int i15 = 0;
        int i16 = 0;
        while (i15 < round2) {
            float f20 = f18;
            int i17 = 0;
            while (i17 < round) {
                byte[] bArr2 = bArr;
                int i18 = 0;
                while (i18 < max3) {
                    fArr4[i18] = (float) Math.cos((3.141592653589793d / round) * (i17 + 0.5f) * i18);
                    i18++;
                    z10 = z10;
                    b11 = b11;
                }
                float[] fArr6 = b11;
                boolean z12 = z10;
                int i19 = 0;
                while (i19 < max4) {
                    fArr5[i19] = (float) Math.cos((3.141592653589793d / round2) * (i15 + 0.5f) * i19);
                    i19++;
                    max3 = max3;
                    max4 = max4;
                    i15 = i15;
                }
                int i20 = max3;
                int i21 = i15;
                int i22 = max4;
                float f21 = f12;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    f10 = 2.0f;
                    if (i23 >= max2) {
                        break;
                    }
                    float f22 = fArr5[i23] * 2.0f;
                    int i25 = i23 > 0 ? 0 : 1;
                    while (true) {
                        i10 = max2;
                        if (i25 * max2 < max * (max2 - i23)) {
                            f21 += b10[i24] * fArr4[i25] * f22;
                            i25++;
                            i24++;
                            max2 = i10;
                        }
                    }
                    i23++;
                    max2 = i10;
                }
                int i26 = max2;
                float f23 = f13;
                float f24 = f14;
                int i27 = 0;
                int i28 = 0;
                int i29 = 3;
                while (i27 < i29) {
                    float f25 = fArr5[i27] * f10;
                    int i30 = i27 > 0 ? 0 : 1;
                    while (i30 < 3 - i27) {
                        float f26 = fArr4[i30] * f25;
                        f23 += fArr6[i28] * f26;
                        f24 += b12[i28] * f26;
                        i30++;
                        i28++;
                    }
                    i27++;
                    i29 = 3;
                    f10 = 2.0f;
                }
                if (z12) {
                    f11 = f20;
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < 5) {
                        float f27 = fArr5[i31] * 2.0f;
                        int i33 = i31 > 0 ? 0 : 1;
                        while (true) {
                            fArr2 = b10;
                            if (i33 < 5 - i31) {
                                Intrinsics.d(fArr3);
                                f11 += fArr3[i32] * fArr4[i33] * f27;
                                i33++;
                                i32++;
                                b10 = fArr2;
                            }
                        }
                        i31++;
                        b10 = fArr2;
                    }
                    fArr = b10;
                } else {
                    fArr = b10;
                    f11 = f20;
                }
                float f28 = f21 - (f23 * 0.6666667f);
                float f29 = (((f21 * 3.0f) - f28) + f24) / 2.0f;
                bArr2[i16] = (byte) Math.max(0, Math.round(Math.min(1.0f, f29) * 255.0f));
                bArr2[i16 + 1] = (byte) Math.max(0, Math.round(Math.min(1.0f, f29 - f24) * 255.0f));
                bArr2[i16 + 2] = (byte) Math.max(0, Math.round(Math.min(1.0f, f28) * 255.0f));
                bArr2[i16 + 3] = (byte) Math.max(0, Math.round(Math.min(1.0f, f11) * 255.0f));
                i17++;
                i16 += 4;
                bArr = bArr2;
                max2 = i26;
                z10 = z12;
                b11 = fArr6;
                max3 = i20;
                max4 = i22;
                i15 = i21;
                b10 = fArr;
            }
            i15++;
            f18 = f20;
            b11 = b11;
            b10 = b10;
        }
        return new b(round, round2, bArr);
    }
}
