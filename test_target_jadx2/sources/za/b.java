package Za;

import kotlin.jvm.internal.Intrinsics;
import o2.h;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final h f12481a;

    /* renamed from: b, reason: collision with root package name */
    private Ya.b f12482b;

    public b(h glideUrl) {
        Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
        this.f12481a = glideUrl;
    }

    public final h a() {
        return this.f12481a;
    }

    public final Ya.b b() {
        return this.f12482b;
    }

    public final void c(Ya.b bVar) {
        this.f12482b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.b(this.f12481a, ((b) obj).f12481a);
    }

    public int hashCode() {
        return this.f12481a.hashCode();
    }

    public String toString() {
        String hVar = this.f12481a.toString();
        Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
        return hVar;
    }
}
