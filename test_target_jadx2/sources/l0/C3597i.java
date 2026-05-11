package l0;

import java.util.Arrays;
import java.util.HashSet;
import org.conscrypt.BuildConfig;

/* renamed from: l0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3597i implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    private static int f36960r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f36961a;

    /* renamed from: b, reason: collision with root package name */
    private String f36962b;

    /* renamed from: f, reason: collision with root package name */
    public float f36966f;

    /* renamed from: j, reason: collision with root package name */
    a f36970j;

    /* renamed from: c, reason: collision with root package name */
    public int f36963c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f36964d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f36965e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36967g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f36968h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f36969i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    C3590b[] f36971k = new C3590b[16];

    /* renamed from: l, reason: collision with root package name */
    int f36972l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f36973m = 0;

    /* renamed from: n, reason: collision with root package name */
    boolean f36974n = false;

    /* renamed from: o, reason: collision with root package name */
    int f36975o = -1;

    /* renamed from: p, reason: collision with root package name */
    float f36976p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    HashSet f36977q = null;

    /* renamed from: l0.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C3597i(a aVar, String str) {
        this.f36970j = aVar;
    }

    static void d() {
        f36960r++;
    }

    public final void b(C3590b c3590b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f36972l;
            if (i10 >= i11) {
                C3590b[] c3590bArr = this.f36971k;
                if (i11 >= c3590bArr.length) {
                    this.f36971k = (C3590b[]) Arrays.copyOf(c3590bArr, c3590bArr.length * 2);
                }
                C3590b[] c3590bArr2 = this.f36971k;
                int i12 = this.f36972l;
                c3590bArr2[i12] = c3590b;
                this.f36972l = i12 + 1;
                return;
            }
            if (this.f36971k[i10] == c3590b) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3597i c3597i) {
        return this.f36963c - c3597i.f36963c;
    }

    public final void e(C3590b c3590b) {
        int i10 = this.f36972l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f36971k[i11] == c3590b) {
                while (i11 < i10 - 1) {
                    C3590b[] c3590bArr = this.f36971k;
                    int i12 = i11 + 1;
                    c3590bArr[i11] = c3590bArr[i12];
                    i11 = i12;
                }
                this.f36972l--;
                return;
            }
            i11++;
        }
    }

    public void n() {
        this.f36962b = null;
        this.f36970j = a.UNKNOWN;
        this.f36965e = 0;
        this.f36963c = -1;
        this.f36964d = -1;
        this.f36966f = 0.0f;
        this.f36967g = false;
        this.f36974n = false;
        this.f36975o = -1;
        this.f36976p = 0.0f;
        int i10 = this.f36972l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f36971k[i11] = null;
        }
        this.f36972l = 0;
        this.f36973m = 0;
        this.f36961a = false;
        Arrays.fill(this.f36969i, 0.0f);
    }

    public void o(C3592d c3592d, float f10) {
        this.f36966f = f10;
        this.f36967g = true;
        this.f36974n = false;
        this.f36975o = -1;
        this.f36976p = 0.0f;
        int i10 = this.f36972l;
        this.f36964d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f36971k[i11].A(c3592d, this, false);
        }
        this.f36972l = 0;
    }

    public void p(a aVar, String str) {
        this.f36970j = aVar;
    }

    public final void q(C3592d c3592d, C3590b c3590b) {
        int i10 = this.f36972l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f36971k[i11].B(c3592d, c3590b, false);
        }
        this.f36972l = 0;
    }

    public String toString() {
        if (this.f36962b != null) {
            return BuildConfig.FLAVOR + this.f36962b;
        }
        return BuildConfig.FLAVOR + this.f36963c;
    }
}
