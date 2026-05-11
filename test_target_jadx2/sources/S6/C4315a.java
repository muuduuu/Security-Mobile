package s6;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4315a extends AbstractC4318d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f40780a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f40781b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4319e f40782c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4320f f40783d;

    C4315a(Integer num, Object obj, EnumC4319e enumC4319e, AbstractC4320f abstractC4320f) {
        this.f40780a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f40781b = obj;
        if (enumC4319e == null) {
            throw new NullPointerException("Null priority");
        }
        this.f40782c = enumC4319e;
        this.f40783d = abstractC4320f;
    }

    @Override // s6.AbstractC4318d
    public Integer a() {
        return this.f40780a;
    }

    @Override // s6.AbstractC4318d
    public Object b() {
        return this.f40781b;
    }

    @Override // s6.AbstractC4318d
    public EnumC4319e c() {
        return this.f40782c;
    }

    @Override // s6.AbstractC4318d
    public AbstractC4320f d() {
        return this.f40783d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4318d)) {
            return false;
        }
        AbstractC4318d abstractC4318d = (AbstractC4318d) obj;
        Integer num = this.f40780a;
        if (num != null ? num.equals(abstractC4318d.a()) : abstractC4318d.a() == null) {
            if (this.f40781b.equals(abstractC4318d.b()) && this.f40782c.equals(abstractC4318d.c())) {
                AbstractC4320f abstractC4320f = this.f40783d;
                if (abstractC4320f == null) {
                    if (abstractC4318d.d() == null) {
                        return true;
                    }
                } else if (abstractC4320f.equals(abstractC4318d.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f40780a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f40781b.hashCode()) * 1000003) ^ this.f40782c.hashCode()) * 1000003;
        AbstractC4320f abstractC4320f = this.f40783d;
        return hashCode ^ (abstractC4320f != null ? abstractC4320f.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f40780a + ", payload=" + this.f40781b + ", priority=" + this.f40782c + ", productData=" + this.f40783d + "}";
    }
}
