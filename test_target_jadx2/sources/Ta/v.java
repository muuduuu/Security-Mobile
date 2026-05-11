package Ta;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements m {

    /* renamed from: a, reason: collision with root package name */
    private final String f9654a;

    public v(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f9654a = data;
    }

    @Override // Ta.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        return this.f9654a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.b(this.f9654a, ((v) obj).f9654a);
    }

    public int hashCode() {
        return this.f9654a.hashCode();
    }

    public String toString() {
        return "RawModelProvider(data=" + this.f9654a + ")";
    }
}
