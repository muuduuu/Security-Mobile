package z3;

import b3.l;
import java.util.Arrays;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5252d {

    /* renamed from: a, reason: collision with root package name */
    private a f45724a = a.BITMAP_ONLY;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45725b = false;

    /* renamed from: c, reason: collision with root package name */
    private float[] f45726c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f45727d = 0;

    /* renamed from: e, reason: collision with root package name */
    private float f45728e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private int f45729f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f45730g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45731h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f45732i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f45733j = false;

    /* renamed from: z3.d$a */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static C5252d a(float f10) {
        return new C5252d().o(f10);
    }

    private float[] e() {
        if (this.f45726c == null) {
            this.f45726c = new float[8];
        }
        return this.f45726c;
    }

    public int b() {
        return this.f45729f;
    }

    public float c() {
        return this.f45728e;
    }

    public float[] d() {
        return this.f45726c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5252d c5252d = (C5252d) obj;
        if (this.f45725b == c5252d.f45725b && this.f45727d == c5252d.f45727d && Float.compare(c5252d.f45728e, this.f45728e) == 0 && this.f45729f == c5252d.f45729f && Float.compare(c5252d.f45730g, this.f45730g) == 0 && this.f45724a == c5252d.f45724a && this.f45731h == c5252d.f45731h && this.f45732i == c5252d.f45732i) {
            return Arrays.equals(this.f45726c, c5252d.f45726c);
        }
        return false;
    }

    public int f() {
        return this.f45727d;
    }

    public float g() {
        return this.f45730g;
    }

    public boolean h() {
        return this.f45732i;
    }

    public int hashCode() {
        a aVar = this.f45724a;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f45725b ? 1 : 0)) * 31;
        float[] fArr = this.f45726c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f45727d) * 31;
        float f10 = this.f45728e;
        int floatToIntBits = (((hashCode2 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f45729f) * 31;
        float f11 = this.f45730g;
        return ((((floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f45731h ? 1 : 0)) * 31) + (this.f45732i ? 1 : 0);
    }

    public boolean i() {
        return this.f45733j;
    }

    public boolean j() {
        return this.f45725b;
    }

    public a k() {
        return this.f45724a;
    }

    public boolean l() {
        return this.f45731h;
    }

    public C5252d m(int i10, float f10) {
        l.c(f10 >= 0.0f, "the border width cannot be < 0");
        this.f45728e = f10;
        this.f45729f = i10;
        return this;
    }

    public C5252d n(float f10, float f11, float f12, float f13) {
        float[] e10 = e();
        e10[1] = f10;
        e10[0] = f10;
        e10[3] = f11;
        e10[2] = f11;
        e10[5] = f12;
        e10[4] = f12;
        e10[7] = f13;
        e10[6] = f13;
        return this;
    }

    public C5252d o(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public C5252d p(int i10) {
        this.f45727d = i10;
        this.f45724a = a.OVERLAY_COLOR;
        return this;
    }

    public C5252d q(boolean z10) {
        this.f45732i = z10;
        return this;
    }

    public C5252d r(a aVar) {
        this.f45724a = aVar;
        return this;
    }
}
