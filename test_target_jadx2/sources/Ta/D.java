package Ta;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class D implements m {

    /* renamed from: a, reason: collision with root package name */
    private final o2.h f9510a;

    public D(o2.h glideUrl) {
        Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
        this.f9510a = glideUrl;
    }

    @Override // Ta.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Za.b a() {
        return new Za.b(this.f9510a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && Intrinsics.b(this.f9510a, ((D) obj).f9510a);
    }

    public int hashCode() {
        return this.f9510a.hashCode();
    }

    public String toString() {
        return "UrlModelProvider(glideUrl=" + this.f9510a + ")";
    }
}
