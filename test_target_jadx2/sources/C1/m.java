package C1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f773a;

    /* renamed from: b, reason: collision with root package name */
    private final int f774b;

    public m(String workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f773a = workSpecId;
        this.f774b = i10;
    }

    public final int a() {
        return this.f774b;
    }

    public final String b() {
        return this.f773a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.b(this.f773a, mVar.f773a) && this.f774b == mVar.f774b;
    }

    public int hashCode() {
        return (this.f773a.hashCode() * 31) + Integer.hashCode(this.f774b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f773a + ", generation=" + this.f774b + ')';
    }
}
