package t6;

import t6.AbstractC4636o;

/* renamed from: t6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4630i extends AbstractC4636o {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4636o.c f42400a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4636o.b f42401b;

    /* renamed from: t6.i$b */
    static final class b extends AbstractC4636o.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC4636o.c f42402a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC4636o.b f42403b;

        b() {
        }

        @Override // t6.AbstractC4636o.a
        public AbstractC4636o a() {
            return new C4630i(this.f42402a, this.f42403b);
        }

        @Override // t6.AbstractC4636o.a
        public AbstractC4636o.a b(AbstractC4636o.b bVar) {
            this.f42403b = bVar;
            return this;
        }

        @Override // t6.AbstractC4636o.a
        public AbstractC4636o.a c(AbstractC4636o.c cVar) {
            this.f42402a = cVar;
            return this;
        }
    }

    @Override // t6.AbstractC4636o
    public AbstractC4636o.b b() {
        return this.f42401b;
    }

    @Override // t6.AbstractC4636o
    public AbstractC4636o.c c() {
        return this.f42400a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4636o)) {
            return false;
        }
        AbstractC4636o abstractC4636o = (AbstractC4636o) obj;
        AbstractC4636o.c cVar = this.f42400a;
        if (cVar != null ? cVar.equals(abstractC4636o.c()) : abstractC4636o.c() == null) {
            AbstractC4636o.b bVar = this.f42401b;
            if (bVar == null) {
                if (abstractC4636o.b() == null) {
                    return true;
                }
            } else if (bVar.equals(abstractC4636o.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC4636o.c cVar = this.f42400a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC4636o.b bVar = this.f42401b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f42400a + ", mobileSubtype=" + this.f42401b + "}";
    }

    private C4630i(AbstractC4636o.c cVar, AbstractC4636o.b bVar) {
        this.f42400a = cVar;
        this.f42401b = bVar;
    }
}
