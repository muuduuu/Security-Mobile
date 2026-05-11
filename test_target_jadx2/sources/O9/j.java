package O9;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f7147a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7148b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7149c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7150d;

    public j(int i10, int i11, int i12, boolean z10) {
        this.f7147a = i10;
        this.f7148b = i11;
        this.f7149c = i12;
        this.f7150d = z10;
    }

    public final int a() {
        return this.f7148b;
    }

    public final int b() {
        return this.f7149c;
    }

    public final boolean c() {
        return this.f7150d;
    }

    public final int d() {
        return this.f7147a;
    }

    public final void e(boolean z10) {
        this.f7150d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f7147a == jVar.f7147a && this.f7148b == jVar.f7148b && this.f7149c == jVar.f7149c && this.f7150d == jVar.f7150d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f7147a) * 31) + Integer.hashCode(this.f7148b)) * 31) + Integer.hashCode(this.f7149c)) * 31) + Boolean.hashCode(this.f7150d);
    }

    public String toString() {
        return "KeyboardAnimationCallbackConfig(persistentInsetTypes=" + this.f7147a + ", deferredInsetTypes=" + this.f7148b + ", dispatchMode=" + this.f7149c + ", hasTranslucentNavigationBar=" + this.f7150d + ")";
    }
}
