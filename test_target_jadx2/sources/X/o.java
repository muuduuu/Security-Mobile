package x;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.P0;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44606a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44607b = false;

    public o(P0 p02) {
        this.f44606a = p02.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void a() {
        this.f44607b = false;
    }

    public void b() {
        this.f44607b = true;
    }

    public boolean c(int i10) {
        return this.f44607b && i10 == 0 && this.f44606a;
    }
}
