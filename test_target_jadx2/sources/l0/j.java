package l0;

import java.util.Arrays;
import l0.C3590b;

/* loaded from: classes.dex */
public class j implements C3590b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f36978n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f36979a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f36980b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f36981c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f36982d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f36983e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f36984f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f36985g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f36986h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f36987i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f36988j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f36989k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final C3590b f36990l;

    /* renamed from: m, reason: collision with root package name */
    protected final C3591c f36991m;

    j(C3590b c3590b, C3591c c3591c) {
        this.f36990l = c3590b;
        this.f36991m = c3591c;
        clear();
    }

    private void l(C3597i c3597i, int i10) {
        int[] iArr;
        int i11 = c3597i.f36963c % this.f36981c;
        int[] iArr2 = this.f36982d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f36983e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f36983e[i10] = -1;
    }

    private void m(int i10, C3597i c3597i, float f10) {
        this.f36984f[i10] = c3597i.f36963c;
        this.f36985g[i10] = f10;
        this.f36986h[i10] = -1;
        this.f36987i[i10] = -1;
        c3597i.b(this.f36990l);
        c3597i.f36973m++;
        this.f36988j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f36980b; i10++) {
            if (this.f36984f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f36980b * 2;
        this.f36984f = Arrays.copyOf(this.f36984f, i10);
        this.f36985g = Arrays.copyOf(this.f36985g, i10);
        this.f36986h = Arrays.copyOf(this.f36986h, i10);
        this.f36987i = Arrays.copyOf(this.f36987i, i10);
        this.f36983e = Arrays.copyOf(this.f36983e, i10);
        for (int i11 = this.f36980b; i11 < i10; i11++) {
            this.f36984f[i11] = -1;
            this.f36983e[i11] = -1;
        }
        this.f36980b = i10;
    }

    private void q(int i10, C3597i c3597i, float f10) {
        int n10 = n();
        m(n10, c3597i, f10);
        if (i10 != -1) {
            this.f36986h[n10] = i10;
            int[] iArr = this.f36987i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f36986h[n10] = -1;
            if (this.f36988j > 0) {
                this.f36987i[n10] = this.f36989k;
                this.f36989k = n10;
            } else {
                this.f36987i[n10] = -1;
            }
        }
        int i11 = this.f36987i[n10];
        if (i11 != -1) {
            this.f36986h[i11] = n10;
        }
        l(c3597i, n10);
    }

    private void r(C3597i c3597i) {
        int[] iArr;
        int i10;
        int i11 = c3597i.f36963c;
        int i12 = i11 % this.f36981c;
        int[] iArr2 = this.f36982d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f36984f[i13] == i11) {
            int[] iArr3 = this.f36983e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f36983e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f36984f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f36984f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // l0.C3590b.a
    public int a() {
        return this.f36988j;
    }

    @Override // l0.C3590b.a
    public C3597i b(int i10) {
        int i11 = this.f36988j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f36989k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f36991m.f36921d[this.f36984f[i12]];
            }
            i12 = this.f36987i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // l0.C3590b.a
    public float c(C3590b c3590b, boolean z10) {
        float g10 = g(c3590b.f36912a);
        f(c3590b.f36912a, z10);
        j jVar = (j) c3590b.f36916e;
        int a10 = jVar.a();
        int i10 = 0;
        int i11 = 0;
        while (i10 < a10) {
            int i12 = jVar.f36984f[i11];
            if (i12 != -1) {
                i(this.f36991m.f36921d[i12], jVar.f36985g[i11] * g10, z10);
                i10++;
            }
            i11++;
        }
        return g10;
    }

    @Override // l0.C3590b.a
    public void clear() {
        int i10 = this.f36988j;
        for (int i11 = 0; i11 < i10; i11++) {
            C3597i b10 = b(i11);
            if (b10 != null) {
                b10.e(this.f36990l);
            }
        }
        for (int i12 = 0; i12 < this.f36980b; i12++) {
            this.f36984f[i12] = -1;
            this.f36983e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f36981c; i13++) {
            this.f36982d[i13] = -1;
        }
        this.f36988j = 0;
        this.f36989k = -1;
    }

    @Override // l0.C3590b.a
    public void d() {
        int i10 = this.f36988j;
        int i11 = this.f36989k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f36985g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f36987i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // l0.C3590b.a
    public float e(int i10) {
        int i11 = this.f36988j;
        int i12 = this.f36989k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f36985g[i12];
            }
            i12 = this.f36987i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // l0.C3590b.a
    public float f(C3597i c3597i, boolean z10) {
        int p10 = p(c3597i);
        if (p10 == -1) {
            return 0.0f;
        }
        r(c3597i);
        float f10 = this.f36985g[p10];
        if (this.f36989k == p10) {
            this.f36989k = this.f36987i[p10];
        }
        this.f36984f[p10] = -1;
        int[] iArr = this.f36986h;
        int i10 = iArr[p10];
        if (i10 != -1) {
            int[] iArr2 = this.f36987i;
            iArr2[i10] = iArr2[p10];
        }
        int i11 = this.f36987i[p10];
        if (i11 != -1) {
            iArr[i11] = iArr[p10];
        }
        this.f36988j--;
        c3597i.f36973m--;
        if (z10) {
            c3597i.e(this.f36990l);
        }
        return f10;
    }

    @Override // l0.C3590b.a
    public float g(C3597i c3597i) {
        int p10 = p(c3597i);
        if (p10 != -1) {
            return this.f36985g[p10];
        }
        return 0.0f;
    }

    @Override // l0.C3590b.a
    public boolean h(C3597i c3597i) {
        return p(c3597i) != -1;
    }

    @Override // l0.C3590b.a
    public void i(C3597i c3597i, float f10, boolean z10) {
        float f11 = f36978n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(c3597i);
            if (p10 == -1) {
                j(c3597i, f10);
                return;
            }
            float[] fArr = this.f36985g;
            float f12 = fArr[p10] + f10;
            fArr[p10] = f12;
            float f13 = f36978n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[p10] = 0.0f;
            f(c3597i, z10);
        }
    }

    @Override // l0.C3590b.a
    public void j(C3597i c3597i, float f10) {
        float f11 = f36978n;
        if (f10 > (-f11) && f10 < f11) {
            f(c3597i, true);
            return;
        }
        if (this.f36988j == 0) {
            m(0, c3597i, f10);
            l(c3597i, 0);
            this.f36989k = 0;
            return;
        }
        int p10 = p(c3597i);
        if (p10 != -1) {
            this.f36985g[p10] = f10;
            return;
        }
        if (this.f36988j + 1 >= this.f36980b) {
            o();
        }
        int i10 = this.f36988j;
        int i11 = this.f36989k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f36984f[i11];
            int i15 = c3597i.f36963c;
            if (i14 == i15) {
                this.f36985g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f36987i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, c3597i, f10);
    }

    @Override // l0.C3590b.a
    public void k(float f10) {
        int i10 = this.f36988j;
        int i11 = this.f36989k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f36985g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f36987i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(C3597i c3597i) {
        if (this.f36988j != 0 && c3597i != null) {
            int i10 = c3597i.f36963c;
            int i11 = this.f36982d[i10 % this.f36981c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f36984f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f36983e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f36984f[i11] != i10);
            if (i11 != -1 && this.f36984f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f36988j;
        for (int i11 = 0; i11 < i10; i11++) {
            C3597i b10 = b(i11);
            if (b10 != null) {
                String str2 = str + b10 + " = " + e(i11) + " ";
                int p10 = p(b10);
                String str3 = str2 + "[p: ";
                String str4 = (this.f36986h[p10] != -1 ? str3 + this.f36991m.f36921d[this.f36984f[this.f36986h[p10]]] : str3 + "none") + ", n: ";
                str = (this.f36987i[p10] != -1 ? str4 + this.f36991m.f36921d[this.f36984f[this.f36987i[p10]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
