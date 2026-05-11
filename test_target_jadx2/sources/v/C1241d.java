package V;

/* renamed from: V.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1241d extends AbstractC1238b {

    /* renamed from: b, reason: collision with root package name */
    private final int f10608b;

    /* renamed from: c, reason: collision with root package name */
    private final double f10609c;

    /* renamed from: d, reason: collision with root package name */
    private final Throwable f10610d;

    C1241d(int i10, double d10, Throwable th) {
        this.f10608b = i10;
        this.f10609c = d10;
        this.f10610d = th;
    }

    @Override // V.AbstractC1238b
    double a() {
        return this.f10609c;
    }

    @Override // V.AbstractC1238b
    public int b() {
        return this.f10608b;
    }

    @Override // V.AbstractC1238b
    public Throwable c() {
        return this.f10610d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1238b)) {
            return false;
        }
        AbstractC1238b abstractC1238b = (AbstractC1238b) obj;
        if (this.f10608b == abstractC1238b.b() && Double.doubleToLongBits(this.f10609c) == Double.doubleToLongBits(abstractC1238b.a())) {
            Throwable th = this.f10610d;
            if (th == null) {
                if (abstractC1238b.c() == null) {
                    return true;
                }
            } else if (th.equals(abstractC1238b.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int doubleToLongBits = (((this.f10608b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f10609c) >>> 32) ^ Double.doubleToLongBits(this.f10609c)))) * 1000003;
        Throwable th = this.f10610d;
        return doubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f10608b + ", audioAmplitudeInternal=" + this.f10609c + ", errorCause=" + this.f10610d + "}";
    }
}
