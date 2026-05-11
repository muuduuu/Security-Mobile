package androidx.camera.core.impl;

import androidx.camera.core.impl.V;

/* renamed from: androidx.camera.core.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1455p0 extends Q0 {

    /* renamed from: l, reason: collision with root package name */
    public static final V.a f14673l = V.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: m, reason: collision with root package name */
    public static final V.a f14674m = V.a.a("camerax.core.imageInput.inputDynamicRange", A.B.class);

    default A.B k() {
        return (A.B) y0.f.g((A.B) f(f14674m, A.B.f6c));
    }

    default int p() {
        return ((Integer) a(f14673l)).intValue();
    }

    default boolean t() {
        return b(f14674m);
    }
}
