package wb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f44421a;

    /* renamed from: b, reason: collision with root package name */
    private g f44422b;

    public d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f44421a = name;
    }

    public final g a() {
        g gVar = this.f44422b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String b() {
        return this.f44421a;
    }

    public final void c(g gVar) {
        this.f44422b = gVar;
    }
}
