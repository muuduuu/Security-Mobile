package ud;

import id.C3367b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Object f43724a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f43725b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f43726c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f43727d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43728e;

    /* renamed from: f, reason: collision with root package name */
    private final C3367b f43729f;

    public t(Object obj, Object obj2, Object obj3, Object obj4, String filePath, C3367b classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f43724a = obj;
        this.f43725b = obj2;
        this.f43726c = obj3;
        this.f43727d = obj4;
        this.f43728e = filePath;
        this.f43729f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.b(this.f43724a, tVar.f43724a) && Intrinsics.b(this.f43725b, tVar.f43725b) && Intrinsics.b(this.f43726c, tVar.f43726c) && Intrinsics.b(this.f43727d, tVar.f43727d) && Intrinsics.b(this.f43728e, tVar.f43728e) && Intrinsics.b(this.f43729f, tVar.f43729f);
    }

    public int hashCode() {
        Object obj = this.f43724a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f43725b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f43726c;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f43727d;
        return ((((hashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f43728e.hashCode()) * 31) + this.f43729f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f43724a + ", compilerVersion=" + this.f43725b + ", languageVersion=" + this.f43726c + ", expectedVersion=" + this.f43727d + ", filePath=" + this.f43728e + ", classId=" + this.f43729f + ')';
    }
}
