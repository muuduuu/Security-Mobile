package androidx.camera.extensions.internal.compat.quirk;

import A.AbstractC0700h0;
import F.c;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.P0;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile P0 f14764a;

    static {
        M0.b().c(c.b(), new InterfaceC5159a() { // from class: S.a
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                androidx.camera.extensions.internal.compat.quirk.a.c((L0) obj);
            }
        });
    }

    public static K0 b(Class cls) {
        return f14764a.b(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(L0 l02) {
        f14764a = new P0(b.a(l02));
        AbstractC0700h0.a("DeviceQuirks", "extensions DeviceQuirks = " + P0.d(f14764a));
    }
}
