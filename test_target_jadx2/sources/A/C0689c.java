package A;

import A.AbstractC0715s;

/* renamed from: A.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0689c extends AbstractC0715s.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f153a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f154b;

    C0689c(int i10, Throwable th) {
        this.f153a = i10;
        this.f154b = th;
    }

    @Override // A.AbstractC0715s.a
    public Throwable c() {
        return this.f154b;
    }

    @Override // A.AbstractC0715s.a
    public int d() {
        return this.f153a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0715s.a)) {
            return false;
        }
        AbstractC0715s.a aVar = (AbstractC0715s.a) obj;
        if (this.f153a == aVar.d()) {
            Throwable th = this.f154b;
            if (th == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (th.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f153a ^ 1000003) * 1000003;
        Throwable th = this.f154b;
        return i10 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f153a + ", cause=" + this.f154b + "}";
    }
}
