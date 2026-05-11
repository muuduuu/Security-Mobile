package androidx.camera.core.internal.compat.quirk;

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
    private static volatile P0 f14719a;

    static {
        M0.b().c(c.b(), new InterfaceC5159a() { // from class: J.a
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                androidx.camera.core.internal.compat.quirk.a.d((L0) obj);
            }
        });
    }

    public static K0 b(Class cls) {
        return f14719a.b(cls);
    }

    public static P0 c() {
        return f14719a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(L0 l02) {
        f14719a = new P0(b.a(l02));
        AbstractC0700h0.a("DeviceQuirks", "core DeviceQuirks = " + P0.d(f14719a));
    }
}
