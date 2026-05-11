package C1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f763a;

    /* renamed from: b, reason: collision with root package name */
    private final int f764b;

    /* renamed from: c, reason: collision with root package name */
    public final int f765c;

    public i(String workSpecId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f763a = workSpecId;
        this.f764b = i10;
        this.f765c = i11;
    }

    public final int a() {
        return this.f764b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.b(this.f763a, iVar.f763a) && this.f764b == iVar.f764b && this.f765c == iVar.f765c;
    }

    public int hashCode() {
        return (((this.f763a.hashCode() * 31) + Integer.hashCode(this.f764b)) * 31) + Integer.hashCode(this.f765c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f763a + ", generation=" + this.f764b + ", systemId=" + this.f765c + ')';
    }
}
