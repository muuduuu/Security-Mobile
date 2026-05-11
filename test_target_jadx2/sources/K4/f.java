package k4;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36221a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36222b;

    public f(boolean z10, boolean z11) {
        this.f36221a = z10;
        this.f36222b = z11;
    }

    public final boolean a() {
        return this.f36221a;
    }

    public final boolean b() {
        return this.f36222b;
    }

    public /* synthetic */ f(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
