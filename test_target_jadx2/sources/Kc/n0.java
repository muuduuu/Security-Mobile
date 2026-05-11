package Kc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5582a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5583b;

    protected n0(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f5582a = name;
        this.f5583b = z10;
    }

    public Integer a(n0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return m0.f5570a.a(this, visibility);
    }

    public String b() {
        return this.f5582a;
    }

    public final boolean c() {
        return this.f5583b;
    }

    public final String toString() {
        return b();
    }

    public n0 d() {
        return this;
    }
}
