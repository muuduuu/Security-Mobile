package androidx.camera.core.impl;

import A.InterfaceC0692d0;
import androidx.camera.core.f;
import androidx.camera.core.impl.V;

/* renamed from: androidx.camera.core.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451n0 implements l1, InterfaceC1457q0, H.n {

    /* renamed from: J, reason: collision with root package name */
    public static final V.a f14650J = V.a.a("camerax.core.imageAnalysis.backpressureStrategy", f.b.class);

    /* renamed from: K, reason: collision with root package name */
    public static final V.a f14651K = V.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: L, reason: collision with root package name */
    public static final V.a f14652L = V.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC0692d0.class);

    /* renamed from: M, reason: collision with root package name */
    public static final V.a f14653M = V.a.a("camerax.core.imageAnalysis.outputImageFormat", f.e.class);

    /* renamed from: N, reason: collision with root package name */
    public static final V.a f14654N = V.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* renamed from: O, reason: collision with root package name */
    public static final V.a f14655O = V.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* renamed from: I, reason: collision with root package name */
    private final G0 f14656I;

    public C1451n0(G0 g02) {
        this.f14656I = g02;
    }

    public int Z(int i10) {
        return ((Integer) f(f14650J, Integer.valueOf(i10))).intValue();
    }

    public int a0(int i10) {
        return ((Integer) f(f14651K, Integer.valueOf(i10))).intValue();
    }

    public InterfaceC0692d0 b0() {
        android.support.v4.media.session.b.a(f(f14652L, null));
        return null;
    }

    public Boolean c0(Boolean bool) {
        return (Boolean) f(f14654N, bool);
    }

    public int d0(int i10) {
        return ((Integer) f(f14653M, Integer.valueOf(i10))).intValue();
    }

    public Boolean e0(Boolean bool) {
        return (Boolean) f(f14655O, bool);
    }

    @Override // androidx.camera.core.impl.Q0
    public V n() {
        return this.f14656I;
    }

    @Override // androidx.camera.core.impl.InterfaceC1455p0
    public int p() {
        return 35;
    }
}
