package x;

import A.C0706k0;
import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.impl.P0;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final P0 f44602a;

    public m(P0 p02) {
        this.f44602a = p02;
    }

    public PointF a(C0706k0 c0706k0, int i10) {
        return (i10 == 1 && this.f44602a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - c0706k0.c(), c0706k0.d()) : new PointF(c0706k0.c(), c0706k0.d());
    }
}
