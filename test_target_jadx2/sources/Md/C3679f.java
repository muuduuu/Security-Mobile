package md;

import id.C3367b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: md.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3679f {

    /* renamed from: a, reason: collision with root package name */
    private final C3367b f37477a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37478b;

    public C3679f(C3367b classId, int i10) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f37477a = classId;
        this.f37478b = i10;
    }

    public final C3367b a() {
        return this.f37477a;
    }

    public final int b() {
        return this.f37478b;
    }

    public final int c() {
        return this.f37478b;
    }

    public final C3367b d() {
        return this.f37477a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3679f)) {
            return false;
        }
        C3679f c3679f = (C3679f) obj;
        return Intrinsics.b(this.f37477a, c3679f.f37477a) && this.f37478b == c3679f.f37478b;
    }

    public int hashCode() {
        return (this.f37477a.hashCode() * 31) + Integer.hashCode(this.f37478b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f37478b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f37477a);
        int i12 = this.f37478b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
