package A;

import A.x0;

/* renamed from: A.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0697g extends x0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f170a;

    /* renamed from: b, reason: collision with root package name */
    private final x0 f171b;

    C0697g(int i10, x0 x0Var) {
        this.f170a = i10;
        if (x0Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f171b = x0Var;
    }

    @Override // A.x0.b
    public int a() {
        return this.f170a;
    }

    @Override // A.x0.b
    public x0 b() {
        return this.f171b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0.b)) {
            return false;
        }
        x0.b bVar = (x0.b) obj;
        return this.f170a == bVar.a() && this.f171b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f170a ^ 1000003) * 1000003) ^ this.f171b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f170a + ", surfaceOutput=" + this.f171b + "}";
    }
}
