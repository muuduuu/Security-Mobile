package M;

import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC5159a;

/* renamed from: M.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0973u implements InterfaceC5159a {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5159a f5943a;

    public void a(InterfaceC5159a interfaceC5159a) {
        this.f5943a = interfaceC5159a;
    }

    @Override // y0.InterfaceC5159a
    public void accept(Object obj) {
        Intrinsics.e(this.f5943a, "Listener is not set.");
        this.f5943a.accept(obj);
    }
}
