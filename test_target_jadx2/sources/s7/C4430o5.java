package s7;

/* renamed from: s7.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4430o5 extends AbstractC4457s5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f41380a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f41381b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41382c;

    /* synthetic */ C4430o5(String str, boolean z10, int i10, AbstractC4416m5 abstractC4416m5) {
        this.f41380a = str;
        this.f41381b = z10;
        this.f41382c = i10;
    }

    @Override // s7.AbstractC4457s5
    public final int a() {
        return this.f41382c;
    }

    @Override // s7.AbstractC4457s5
    public final String b() {
        return this.f41380a;
    }

    @Override // s7.AbstractC4457s5
    public final boolean c() {
        return this.f41381b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4457s5) {
            AbstractC4457s5 abstractC4457s5 = (AbstractC4457s5) obj;
            if (this.f41380a.equals(abstractC4457s5.b()) && this.f41381b == abstractC4457s5.c() && this.f41382c == abstractC4457s5.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f41380a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f41381b ? 1237 : 1231)) * 1000003) ^ this.f41382c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f41380a + ", enableFirelog=" + this.f41381b + ", firelogEventType=" + this.f41382c + "}";
    }
}
