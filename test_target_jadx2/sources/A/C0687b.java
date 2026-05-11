package A;

import A.AbstractC0715s;

/* renamed from: A.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0687b extends AbstractC0715s {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0715s.b f151a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0715s.a f152b;

    C0687b(AbstractC0715s.b bVar, AbstractC0715s.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f151a = bVar;
        this.f152b = aVar;
    }

    @Override // A.AbstractC0715s
    public AbstractC0715s.a c() {
        return this.f152b;
    }

    @Override // A.AbstractC0715s
    public AbstractC0715s.b d() {
        return this.f151a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0715s)) {
            return false;
        }
        AbstractC0715s abstractC0715s = (AbstractC0715s) obj;
        if (this.f151a.equals(abstractC0715s.d())) {
            AbstractC0715s.a aVar = this.f152b;
            if (aVar == null) {
                if (abstractC0715s.c() == null) {
                    return true;
                }
            } else if (aVar.equals(abstractC0715s.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f151a.hashCode() ^ 1000003) * 1000003;
        AbstractC0715s.a aVar = this.f152b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f151a + ", error=" + this.f152b + "}";
    }
}
