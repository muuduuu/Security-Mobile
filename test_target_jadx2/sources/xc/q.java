package xc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements InterfaceC5151d {

    /* renamed from: a, reason: collision with root package name */
    private final Class f44996a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44997b;

    public q(Class jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f44996a = jClass;
        this.f44997b = moduleName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && Intrinsics.b(m(), ((q) obj).m());
    }

    public int hashCode() {
        return m().hashCode();
    }

    @Override // xc.InterfaceC5151d
    public Class m() {
        return this.f44996a;
    }

    public String toString() {
        return m().toString() + " (Kotlin reflection is not available)";
    }
}
