package androidx.camera.core.impl;

import androidx.camera.core.impl.V;

/* renamed from: androidx.camera.core.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1473z extends Q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final V.a f14700e = V.a.a("camerax.core.camera.useCaseConfigFactory", m1.class);

    /* renamed from: f, reason: collision with root package name */
    public static final V.a f14701f = V.a.a("camerax.core.camera.compatibilityId", AbstractC1449m0.class);

    /* renamed from: g, reason: collision with root package name */
    public static final V.a f14702g = V.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: h, reason: collision with root package name */
    public static final V.a f14703h = V.a.a("camerax.core.camera.SessionProcessor", X0.class);

    /* renamed from: i, reason: collision with root package name */
    public static final V.a f14704i = V.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* renamed from: j, reason: collision with root package name */
    public static final V.a f14705j = V.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* renamed from: k, reason: collision with root package name */
    public static final V.a f14706k = V.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    default int D() {
        return ((Integer) f(f14702g, 0)).intValue();
    }

    AbstractC1449m0 P();

    default boolean Q() {
        return ((Boolean) f(f14706k, Boolean.FALSE)).booleanValue();
    }

    default X0 Y(X0 x02) {
        android.support.v4.media.session.b.a(f(f14703h, x02));
        return null;
    }

    default m1 j() {
        return (m1) f(f14700e, m1.f14649a);
    }

    default boolean y() {
        return ((Boolean) f(f14705j, Boolean.FALSE)).booleanValue();
    }
}
