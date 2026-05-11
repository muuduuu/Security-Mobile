package q7;

/* loaded from: classes2.dex */
final class G extends J {

    /* renamed from: a, reason: collision with root package name */
    private final String f38772a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38773b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38774c;

    /* synthetic */ G(String str, boolean z10, int i10, F f10) {
        this.f38772a = str;
        this.f38773b = z10;
        this.f38774c = i10;
    }

    @Override // q7.J
    public final int a() {
        return this.f38774c;
    }

    @Override // q7.J
    public final String b() {
        return this.f38772a;
    }

    @Override // q7.J
    public final boolean c() {
        return this.f38773b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j10 = (J) obj;
            if (this.f38772a.equals(j10.b()) && this.f38773b == j10.c() && this.f38774c == j10.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f38772a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f38773b ? 1237 : 1231)) * 1000003) ^ this.f38774c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f38772a + ", enableFirelog=" + this.f38773b + ", firelogEventType=" + this.f38774c + "}";
    }
}
