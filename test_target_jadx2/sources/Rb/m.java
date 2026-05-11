package rb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements InterfaceC4294b {

    /* renamed from: a, reason: collision with root package name */
    private final C4293a f40595a;

    public m(C4293a activityResultsManager) {
        Intrinsics.checkNotNullParameter(activityResultsManager, "activityResultsManager");
        this.f40595a = activityResultsManager;
    }

    @Override // rb.InterfaceC4294b
    public Object a(InterfaceC4295c interfaceC4295c, InterfaceC4296d interfaceC4296d, kotlin.coroutines.d dVar) {
        return this.f40595a.a(interfaceC4295c, interfaceC4296d, dVar);
    }
}
