package l0;

import java.util.Arrays;
import java.util.Comparator;
import l0.C3590b;
import org.conscrypt.BuildConfig;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3596h extends C3590b {

    /* renamed from: g, reason: collision with root package name */
    private int f36950g;

    /* renamed from: h, reason: collision with root package name */
    private C3597i[] f36951h;

    /* renamed from: i, reason: collision with root package name */
    private C3597i[] f36952i;

    /* renamed from: j, reason: collision with root package name */
    private int f36953j;

    /* renamed from: k, reason: collision with root package name */
    b f36954k;

    /* renamed from: l, reason: collision with root package name */
    C3591c f36955l;

    /* renamed from: l0.h$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C3597i c3597i, C3597i c3597i2) {
            return c3597i.f36963c - c3597i2.f36963c;
        }
    }

    /* renamed from: l0.h$b */
    class b {

        /* renamed from: a, reason: collision with root package name */
        C3597i f36957a;

        /* renamed from: b, reason: collision with root package name */
        C3596h f36958b;

        public b(C3596h c3596h) {
            this.f36958b = c3596h;
        }

        public boolean a(C3597i c3597i, float f10) {
            boolean z10 = true;
            if (!this.f36957a.f36961a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = c3597i.f36969i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f36957a.f36969i[i10] = f12;
                    } else {
                        this.f36957a.f36969i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f36957a.f36969i;
                float f13 = fArr[i11] + (c3597i.f36969i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f36957a.f36969i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                C3596h.this.G(this.f36957a);
            }
            return false;
        }

        public void b(C3597i c3597i) {
            this.f36957a = c3597i;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f36957a.f36969i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(C3597i c3597i) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = c3597i.f36969i[i10];
                float f11 = this.f36957a.f36969i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f36957a.f36969i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f36957a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f36957a.f36969i[i10] + " ";
                }
            }
            return str + "] " + this.f36957a;
        }
    }

    public C3596h(C3591c c3591c) {
        super(c3591c);
        this.f36950g = 128;
        this.f36951h = new C3597i[128];
        this.f36952i = new C3597i[128];
        this.f36953j = 0;
        this.f36954k = new b(this);
        this.f36955l = c3591c;
    }

    private final void F(C3597i c3597i) {
        int i10;
        int i11 = this.f36953j + 1;
        C3597i[] c3597iArr = this.f36951h;
        if (i11 > c3597iArr.length) {
            C3597i[] c3597iArr2 = (C3597i[]) Arrays.copyOf(c3597iArr, c3597iArr.length * 2);
            this.f36951h = c3597iArr2;
            this.f36952i = (C3597i[]) Arrays.copyOf(c3597iArr2, c3597iArr2.length * 2);
        }
        C3597i[] c3597iArr3 = this.f36951h;
        int i12 = this.f36953j;
        c3597iArr3[i12] = c3597i;
        int i13 = i12 + 1;
        this.f36953j = i13;
        if (i13 > 1 && c3597iArr3[i12].f36963c > c3597i.f36963c) {
            int i14 = 0;
            while (true) {
                i10 = this.f36953j;
                if (i14 >= i10) {
                    break;
                }
                this.f36952i[i14] = this.f36951h[i14];
                i14++;
            }
            Arrays.sort(this.f36952i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f36953j; i15++) {
                this.f36951h[i15] = this.f36952i[i15];
            }
        }
        c3597i.f36961a = true;
        c3597i.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(C3597i c3597i) {
        int i10 = 0;
        while (i10 < this.f36953j) {
            if (this.f36951h[i10] == c3597i) {
                while (true) {
                    int i11 = this.f36953j;
                    if (i10 >= i11 - 1) {
                        this.f36953j = i11 - 1;
                        c3597i.f36961a = false;
                        return;
                    } else {
                        C3597i[] c3597iArr = this.f36951h;
                        int i12 = i10 + 1;
                        c3597iArr[i10] = c3597iArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // l0.C3590b
    public void B(C3592d c3592d, C3590b c3590b, boolean z10) {
        C3597i c3597i = c3590b.f36912a;
        if (c3597i == null) {
            return;
        }
        C3590b.a aVar = c3590b.f36916e;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            C3597i b10 = aVar.b(i10);
            float e10 = aVar.e(i10);
            this.f36954k.b(b10);
            if (this.f36954k.a(c3597i, e10)) {
                F(b10);
            }
            this.f36913b += c3590b.f36913b * e10;
        }
        G(c3597i);
    }

    @Override // l0.C3590b, l0.C3592d.a
    public void a(C3597i c3597i) {
        this.f36954k.b(c3597i);
        this.f36954k.e();
        c3597i.f36969i[c3597i.f36965e] = 1.0f;
        F(c3597i);
    }

    @Override // l0.C3590b, l0.C3592d.a
    public C3597i c(C3592d c3592d, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f36953j; i11++) {
            C3597i c3597i = this.f36951h[i11];
            if (!zArr[c3597i.f36963c]) {
                this.f36954k.b(c3597i);
                if (i10 == -1) {
                    if (!this.f36954k.c()) {
                    }
                    i10 = i11;
                } else {
                    if (!this.f36954k.d(this.f36951h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f36951h[i10];
    }

    @Override // l0.C3590b, l0.C3592d.a
    public void clear() {
        this.f36953j = 0;
        this.f36913b = 0.0f;
    }

    @Override // l0.C3590b, l0.C3592d.a
    public boolean isEmpty() {
        return this.f36953j == 0;
    }

    @Override // l0.C3590b
    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f36913b + ") : ";
        for (int i10 = 0; i10 < this.f36953j; i10++) {
            this.f36954k.b(this.f36951h[i10]);
            str = str + this.f36954k + " ";
        }
        return str;
    }
}
