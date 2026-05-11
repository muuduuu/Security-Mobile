package x;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.P0;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5087b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44592a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44593b;

    public C5087b(P0 p02) {
        this.f44592a = p02.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f44593b = androidx.camera.camera2.internal.compat.quirk.b.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i10) {
        if ((this.f44592a || this.f44593b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
