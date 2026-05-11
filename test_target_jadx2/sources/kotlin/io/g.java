package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final File f36384a;

    /* renamed from: b, reason: collision with root package name */
    private final List f36385b;

    public g(File root, List segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f36384a = root;
        this.f36385b = segments;
    }

    public final File a() {
        return this.f36384a;
    }

    public final List b() {
        return this.f36385b;
    }

    public final int c() {
        return this.f36385b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.b(this.f36384a, gVar.f36384a) && Intrinsics.b(this.f36385b, gVar.f36385b);
    }

    public int hashCode() {
        return (this.f36384a.hashCode() * 31) + this.f36385b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f36384a + ", segments=" + this.f36385b + ')';
    }
}
