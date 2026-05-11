package z1;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5239c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f45660a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45661b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45662c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f45663d;

    public C5239c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f45660a = z10;
        this.f45661b = z11;
        this.f45662c = z12;
        this.f45663d = z13;
    }

    public final boolean a() {
        return this.f45660a;
    }

    public final boolean b() {
        return this.f45662c;
    }

    public final boolean c() {
        return this.f45663d;
    }

    public final boolean d() {
        return this.f45661b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5239c)) {
            return false;
        }
        C5239c c5239c = (C5239c) obj;
        return this.f45660a == c5239c.f45660a && this.f45661b == c5239c.f45661b && this.f45662c == c5239c.f45662c && this.f45663d == c5239c.f45663d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f45660a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f45661b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f45662c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.f45663d;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f45660a + ", isValidated=" + this.f45661b + ", isMetered=" + this.f45662c + ", isNotRoaming=" + this.f45663d + ')';
    }
}
