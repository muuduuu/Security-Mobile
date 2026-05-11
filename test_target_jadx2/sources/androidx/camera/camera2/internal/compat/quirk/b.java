package androidx.camera.camera2.internal.compat.quirk;

import A.AbstractC0700h0;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.P0;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile P0 f14342a;

    static {
        M0.b().c(F.c.b(), new InterfaceC5159a() { // from class: w.a
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                androidx.camera.camera2.internal.compat.quirk.b.d((L0) obj);
            }
        });
    }

    public static K0 b(Class cls) {
        return f14342a.b(cls);
    }

    public static P0 c() {
        return f14342a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(L0 l02) {
        f14342a = new P0(c.a(l02));
        AbstractC0700h0.a("DeviceQuirks", "camera2 DeviceQuirks = " + P0.d(f14342a));
    }
}
