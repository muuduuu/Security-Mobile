package x;

import A.AbstractC0700h0;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.P0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44598a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44599b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44600c;

    public i(P0 p02, P0 p03) {
        this.f44598a = p03.a(TextureViewIsClosedQuirk.class);
        this.f44599b = p02.a(PreviewOrientationIncorrectQuirk.class);
        this.f44600c = p02.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List list) {
        if (!b() || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC1429c0) it.next()).d();
        }
        AbstractC0700h0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f44598a || this.f44599b || this.f44600c;
    }
}
