package A1;

import C1.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: b, reason: collision with root package name */
    private final int f309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(B1.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f309b = 9;
    }

    @Override // A1.c
    public int b() {
        return this.f309b;
    }

    @Override // A1.c
    public boolean c(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f799j.i();
    }

    @Override // A1.c
    public /* bridge */ /* synthetic */ boolean e(Object obj) {
        return g(((Boolean) obj).booleanValue());
    }

    public boolean g(boolean z10) {
        return !z10;
    }
}
