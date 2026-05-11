package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* renamed from: androidx.camera.core.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460s0 extends AbstractC1429c0 {

    /* renamed from: o, reason: collision with root package name */
    private final Surface f14685o;

    public C1460s0(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f14685o = surface;
    }

    @Override // androidx.camera.core.impl.AbstractC1429c0
    public h8.d r() {
        return G.n.p(this.f14685o);
    }

    public C1460s0(Surface surface) {
        this.f14685o = surface;
    }
}
