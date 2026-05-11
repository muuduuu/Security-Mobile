package t6;

import t6.AbstractC4632k;

/* renamed from: t6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4626e extends AbstractC4632k {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4632k.b f42367a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4622a f42368b;

    /* renamed from: t6.e$b */
    static final class b extends AbstractC4632k.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC4632k.b f42369a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC4622a f42370b;

        b() {
        }

        @Override // t6.AbstractC4632k.a
        public AbstractC4632k a() {
            return new C4626e(this.f42369a, this.f42370b);
        }

        @Override // t6.AbstractC4632k.a
        public AbstractC4632k.a b(AbstractC4622a abstractC4622a) {
            this.f42370b = abstractC4622a;
            return this;
        }

        @Override // t6.AbstractC4632k.a
        public AbstractC4632k.a c(AbstractC4632k.b bVar) {
            this.f42369a = bVar;
            return this;
        }
    }

    @Override // t6.AbstractC4632k
    public AbstractC4622a b() {
        return this.f42368b;
    }

    @Override // t6.AbstractC4632k
    public AbstractC4632k.b c() {
        return this.f42367a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4632k)) {
            return false;
        }
        AbstractC4632k abstractC4632k = (AbstractC4632k) obj;
        AbstractC4632k.b bVar = this.f42367a;
        if (bVar != null ? bVar.equals(abstractC4632k.c()) : abstractC4632k.c() == null) {
            AbstractC4622a abstractC4622a = this.f42368b;
            if (abstractC4622a == null) {
                if (abstractC4632k.b() == null) {
                    return true;
                }
            } else if (abstractC4622a.equals(abstractC4632k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC4632k.b bVar = this.f42367a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC4622a abstractC4622a = this.f42368b;
        return hashCode ^ (abstractC4622a != null ? abstractC4622a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f42367a + ", androidClientInfo=" + this.f42368b + "}";
    }

    private C4626e(AbstractC4632k.b bVar, AbstractC4622a abstractC4622a) {
        this.f42367a = bVar;
        this.f42368b = abstractC4622a;
    }
}
