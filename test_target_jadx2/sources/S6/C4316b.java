package s6;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4316b extends AbstractC4320f {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f40784a;

    C4316b(Integer num) {
        this.f40784a = num;
    }

    @Override // s6.AbstractC4320f
    public Integer a() {
        return this.f40784a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4320f)) {
            return false;
        }
        Integer num = this.f40784a;
        Integer a10 = ((AbstractC4320f) obj).a();
        return num == null ? a10 == null : num.equals(a10);
    }

    public int hashCode() {
        Integer num = this.f40784a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f40784a + "}";
    }
}
