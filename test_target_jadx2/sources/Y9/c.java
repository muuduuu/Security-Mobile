package Y9;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f12163a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12164b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12165c = System.currentTimeMillis();

    public c(float f10, float f11) {
        this.f12163a = f10;
        this.f12164b = f11;
    }

    public float a(c cVar) {
        return (float) Math.sqrt(Math.pow(cVar.f12163a - this.f12163a, 2.0d) + Math.pow(cVar.f12164b - this.f12164b, 2.0d));
    }

    public float b(c cVar) {
        float a10 = a(cVar) / (this.f12165c - cVar.f12165c);
        if (a10 != a10) {
            return 0.0f;
        }
        return a10;
    }
}
