package B6;

import java.util.Map;

/* loaded from: classes2.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final E6.a f448a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f449b;

    b(E6.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f448a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f449b = map;
    }

    @Override // B6.f
    E6.a e() {
        return this.f448a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f448a.equals(fVar.e()) && this.f449b.equals(fVar.h());
    }

    @Override // B6.f
    Map h() {
        return this.f449b;
    }

    public int hashCode() {
        return ((this.f448a.hashCode() ^ 1000003) * 1000003) ^ this.f449b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f448a + ", values=" + this.f449b + "}";
    }
}
