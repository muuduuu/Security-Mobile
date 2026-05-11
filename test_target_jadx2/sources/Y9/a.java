package Y9;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public c f12157a;

    /* renamed from: b, reason: collision with root package name */
    public c f12158b;

    /* renamed from: c, reason: collision with root package name */
    public c f12159c;

    /* renamed from: d, reason: collision with root package name */
    public c f12160d;

    public a(c cVar, c cVar2, c cVar3, c cVar4) {
        this.f12157a = cVar;
        this.f12158b = cVar2;
        this.f12159c = cVar3;
        this.f12160d = cVar4;
    }

    public float a() {
        int i10 = 0;
        double d10 = 0.0d;
        int i11 = 0;
        double d11 = 0.0d;
        while (i10 <= 10) {
            float f10 = i10 / 10;
            double b10 = b(f10, this.f12157a.f12163a, this.f12158b.f12163a, this.f12159c.f12163a, this.f12160d.f12163a);
            double b11 = b(f10, this.f12157a.f12164b, this.f12158b.f12164b, this.f12159c.f12164b, this.f12160d.f12164b);
            if (i10 > 0) {
                double d12 = b10 - d11;
                double d13 = b11 - d10;
                i11 = (int) (i11 + Math.sqrt((d12 * d12) + (d13 * d13)));
            }
            i10++;
            d10 = b11;
            d11 = b10;
        }
        return i11;
    }

    public double b(float f10, float f11, float f12, float f13, float f14) {
        double d10 = f10;
        double d11 = 1.0d - d10;
        return (f11 * d11 * d11 * d11) + (f12 * 3.0d * d11 * d11 * d10) + (f13 * 3.0d * d11 * d10 * d10) + (f14 * f10 * f10 * f10);
    }
}
