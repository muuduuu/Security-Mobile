package x;

import A.AbstractC0700h0;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.impl.P0;

/* renamed from: x.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5084B {

    /* renamed from: a, reason: collision with root package name */
    private final TorchFlashRequiredFor3aUpdateQuirk f44589a;

    public C5084B(P0 p02) {
        this.f44589a = (TorchFlashRequiredFor3aUpdateQuirk) p02.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f44589a;
        boolean z10 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.i();
        AbstractC0700h0.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z10);
        return z10;
    }
}
