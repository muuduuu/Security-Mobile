package U1;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f10297a;

    /* renamed from: b, reason: collision with root package name */
    public String f10298b;

    /* renamed from: c, reason: collision with root package name */
    public float f10299c;

    /* renamed from: d, reason: collision with root package name */
    public a f10300d;

    /* renamed from: e, reason: collision with root package name */
    public int f10301e;

    /* renamed from: f, reason: collision with root package name */
    public float f10302f;

    /* renamed from: g, reason: collision with root package name */
    public float f10303g;

    /* renamed from: h, reason: collision with root package name */
    public int f10304h;

    /* renamed from: i, reason: collision with root package name */
    public int f10305i;

    /* renamed from: j, reason: collision with root package name */
    public float f10306j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10307k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f10308l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f10309m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f10297a = str;
        this.f10298b = str2;
        this.f10299c = f10;
        this.f10300d = aVar;
        this.f10301e = i10;
        this.f10302f = f11;
        this.f10303g = f12;
        this.f10304h = i11;
        this.f10305i = i12;
        this.f10306j = f13;
        this.f10307k = z10;
        this.f10308l = pointF;
        this.f10309m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f10297a.hashCode() * 31) + this.f10298b.hashCode()) * 31) + this.f10299c)) * 31) + this.f10300d.ordinal()) * 31) + this.f10301e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f10302f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f10304h;
    }

    public b() {
    }
}
