package l0;

import java.util.Arrays;
import l0.C3590b;
import org.conscrypt.BuildConfig;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3589a implements C3590b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f36900l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final C3590b f36902b;

    /* renamed from: c, reason: collision with root package name */
    protected final C3591c f36903c;

    /* renamed from: a, reason: collision with root package name */
    int f36901a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f36904d = 8;

    /* renamed from: e, reason: collision with root package name */
    private C3597i f36905e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f36906f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f36907g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f36908h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f36909i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f36910j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36911k = false;

    C3589a(C3590b c3590b, C3591c c3591c) {
        this.f36902b = c3590b;
        this.f36903c = c3591c;
    }

    @Override // l0.C3590b.a
    public int a() {
        return this.f36901a;
    }

    @Override // l0.C3590b.a
    public C3597i b(int i10) {
        int i11 = this.f36909i;
        for (int i12 = 0; i11 != -1 && i12 < this.f36901a; i12++) {
            if (i12 == i10) {
                return this.f36903c.f36921d[this.f36906f[i11]];
            }
            i11 = this.f36907g[i11];
        }
        return null;
    }

    @Override // l0.C3590b.a
    public float c(C3590b c3590b, boolean z10) {
        float g10 = g(c3590b.f36912a);
        f(c3590b.f36912a, z10);
        C3590b.a aVar = c3590b.f36916e;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            C3597i b10 = aVar.b(i10);
            i(b10, aVar.g(b10) * g10, z10);
        }
        return g10;
    }

    @Override // l0.C3590b.a
    public final void clear() {
        int i10 = this.f36909i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36901a; i11++) {
            C3597i c3597i = this.f36903c.f36921d[this.f36906f[i10]];
            if (c3597i != null) {
                c3597i.e(this.f36902b);
            }
            i10 = this.f36907g[i10];
        }
        this.f36909i = -1;
        this.f36910j = -1;
        this.f36911k = false;
        this.f36901a = 0;
    }

    @Override // l0.C3590b.a
    public void d() {
        int i10 = this.f36909i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36901a; i11++) {
            float[] fArr = this.f36908h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f36907g[i10];
        }
    }

    @Override // l0.C3590b.a
    public float e(int i10) {
        int i11 = this.f36909i;
        for (int i12 = 0; i11 != -1 && i12 < this.f36901a; i12++) {
            if (i12 == i10) {
                return this.f36908h[i11];
            }
            i11 = this.f36907g[i11];
        }
        return 0.0f;
    }

    @Override // l0.C3590b.a
    public final float f(C3597i c3597i, boolean z10) {
        if (this.f36905e == c3597i) {
            this.f36905e = null;
        }
        int i10 = this.f36909i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f36901a) {
            if (this.f36906f[i10] == c3597i.f36963c) {
                if (i10 == this.f36909i) {
                    this.f36909i = this.f36907g[i10];
                } else {
                    int[] iArr = this.f36907g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c3597i.e(this.f36902b);
                }
                c3597i.f36973m--;
                this.f36901a--;
                this.f36906f[i10] = -1;
                if (this.f36911k) {
                    this.f36910j = i10;
                }
                return this.f36908h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f36907g[i10];
        }
        return 0.0f;
    }

    @Override // l0.C3590b.a
    public final float g(C3597i c3597i) {
        int i10 = this.f36909i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36901a; i11++) {
            if (this.f36906f[i10] == c3597i.f36963c) {
                return this.f36908h[i10];
            }
            i10 = this.f36907g[i10];
        }
        return 0.0f;
    }

    @Override // l0.C3590b.a
    public boolean h(C3597i c3597i) {
        int i10 = this.f36909i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f36901a; i11++) {
            if (this.f36906f[i10] == c3597i.f36963c) {
                return true;
            }
            i10 = this.f36907g[i10];
        }
        return false;
    }

    @Override // l0.C3590b.a
    public void i(C3597i c3597i, float f10, boolean z10) {
        float f11 = f36900l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f36909i;
            if (i10 == -1) {
                this.f36909i = 0;
                this.f36908h[0] = f10;
                this.f36906f[0] = c3597i.f36963c;
                this.f36907g[0] = -1;
                c3597i.f36973m++;
                c3597i.b(this.f36902b);
                this.f36901a++;
                if (this.f36911k) {
                    return;
                }
                int i11 = this.f36910j + 1;
                this.f36910j = i11;
                int[] iArr = this.f36906f;
                if (i11 >= iArr.length) {
                    this.f36911k = true;
                    this.f36910j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f36901a; i13++) {
                int i14 = this.f36906f[i10];
                int i15 = c3597i.f36963c;
                if (i14 == i15) {
                    float[] fArr = this.f36908h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f36900l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f36909i) {
                            this.f36909i = this.f36907g[i10];
                        } else {
                            int[] iArr2 = this.f36907g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            c3597i.e(this.f36902b);
                        }
                        if (this.f36911k) {
                            this.f36910j = i10;
                        }
                        c3597i.f36973m--;
                        this.f36901a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f36907g[i10];
            }
            int i16 = this.f36910j;
            int i17 = i16 + 1;
            if (this.f36911k) {
                int[] iArr3 = this.f36906f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f36906f;
            if (i16 >= iArr4.length && this.f36901a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f36906f;
                    if (i18 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    }
                    i18++;
                }
            }
            int[] iArr6 = this.f36906f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f36904d * 2;
                this.f36904d = i19;
                this.f36911k = false;
                this.f36910j = i16 - 1;
                this.f36908h = Arrays.copyOf(this.f36908h, i19);
                this.f36906f = Arrays.copyOf(this.f36906f, this.f36904d);
                this.f36907g = Arrays.copyOf(this.f36907g, this.f36904d);
            }
            this.f36906f[i16] = c3597i.f36963c;
            this.f36908h[i16] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f36907g;
                iArr7[i16] = iArr7[i12];
                iArr7[i12] = i16;
            } else {
                this.f36907g[i16] = this.f36909i;
                this.f36909i = i16;
            }
            c3597i.f36973m++;
            c3597i.b(this.f36902b);
            this.f36901a++;
            if (!this.f36911k) {
                this.f36910j++;
            }
            int i20 = this.f36910j;
            int[] iArr8 = this.f36906f;
            if (i20 >= iArr8.length) {
                this.f36911k = true;
                this.f36910j = iArr8.length - 1;
            }
        }
    }

    @Override // l0.C3590b.a
    public final void j(C3597i c3597i, float f10) {
        if (f10 == 0.0f) {
            f(c3597i, true);
            return;
        }
        int i10 = this.f36909i;
        if (i10 == -1) {
            this.f36909i = 0;
            this.f36908h[0] = f10;
            this.f36906f[0] = c3597i.f36963c;
            this.f36907g[0] = -1;
            c3597i.f36973m++;
            c3597i.b(this.f36902b);
            this.f36901a++;
            if (this.f36911k) {
                return;
            }
            int i11 = this.f36910j + 1;
            this.f36910j = i11;
            int[] iArr = this.f36906f;
            if (i11 >= iArr.length) {
                this.f36911k = true;
                this.f36910j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f36901a; i13++) {
            int i14 = this.f36906f[i10];
            int i15 = c3597i.f36963c;
            if (i14 == i15) {
                this.f36908h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f36907g[i10];
        }
        int i16 = this.f36910j;
        int i17 = i16 + 1;
        if (this.f36911k) {
            int[] iArr2 = this.f36906f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f36906f;
        if (i16 >= iArr3.length && this.f36901a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f36906f;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f36906f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f36904d * 2;
            this.f36904d = i19;
            this.f36911k = false;
            this.f36910j = i16 - 1;
            this.f36908h = Arrays.copyOf(this.f36908h, i19);
            this.f36906f = Arrays.copyOf(this.f36906f, this.f36904d);
            this.f36907g = Arrays.copyOf(this.f36907g, this.f36904d);
        }
        this.f36906f[i16] = c3597i.f36963c;
        this.f36908h[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f36907g;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f36907g[i16] = this.f36909i;
            this.f36909i = i16;
        }
        c3597i.f36973m++;
        c3597i.b(this.f36902b);
        int i20 = this.f36901a + 1;
        this.f36901a = i20;
        if (!this.f36911k) {
            this.f36910j++;
        }
        int[] iArr7 = this.f36906f;
        if (i20 >= iArr7.length) {
            this.f36911k = true;
        }
        if (this.f36910j >= iArr7.length) {
            this.f36911k = true;
            this.f36910j = iArr7.length - 1;
        }
    }

    @Override // l0.C3590b.a
    public void k(float f10) {
        int i10 = this.f36909i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36901a; i11++) {
            float[] fArr = this.f36908h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f36907g[i10];
        }
    }

    public String toString() {
        int i10 = this.f36909i;
        String str = BuildConfig.FLAVOR;
        for (int i11 = 0; i10 != -1 && i11 < this.f36901a; i11++) {
            str = ((str + " -> ") + this.f36908h[i10] + " : ") + this.f36903c.f36921d[this.f36906f[i10]];
            i10 = this.f36907g[i10];
        }
        return str;
    }
}
