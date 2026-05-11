package r7;

/* renamed from: r7.g8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4098g8 extends AbstractC4138k8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40033a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40034b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40035c;

    /* synthetic */ C4098g8(String str, boolean z10, int i10, AbstractC4088f8 abstractC4088f8) {
        this.f40033a = str;
        this.f40034b = z10;
        this.f40035c = i10;
    }

    @Override // r7.AbstractC4138k8
    public final int a() {
        return this.f40035c;
    }

    @Override // r7.AbstractC4138k8
    public final String b() {
        return this.f40033a;
    }

    @Override // r7.AbstractC4138k8
    public final boolean c() {
        return this.f40034b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4138k8) {
            AbstractC4138k8 abstractC4138k8 = (AbstractC4138k8) obj;
            if (this.f40033a.equals(abstractC4138k8.b()) && this.f40034b == abstractC4138k8.c() && this.f40035c == abstractC4138k8.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f40033a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f40034b ? 1237 : 1231)) * 1000003) ^ this.f40035c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f40033a + ", enableFirelog=" + this.f40034b + ", firelogEventType=" + this.f40035c + "}";
    }
}
