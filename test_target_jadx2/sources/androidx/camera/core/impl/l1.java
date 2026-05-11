package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.m1;

/* loaded from: classes.dex */
public interface l1 extends H.m, InterfaceC1455p0 {

    /* renamed from: B, reason: collision with root package name */
    public static final V.a f14632B;

    /* renamed from: C, reason: collision with root package name */
    public static final V.a f14633C;

    /* renamed from: D, reason: collision with root package name */
    public static final V.a f14634D;

    /* renamed from: E, reason: collision with root package name */
    public static final V.a f14635E;

    /* renamed from: F, reason: collision with root package name */
    public static final V.a f14636F;

    /* renamed from: G, reason: collision with root package name */
    public static final V.a f14637G;

    /* renamed from: H, reason: collision with root package name */
    public static final V.a f14638H;

    /* renamed from: x, reason: collision with root package name */
    public static final V.a f14639x = V.a.a("camerax.core.useCase.defaultSessionConfig", V0.class);

    /* renamed from: y, reason: collision with root package name */
    public static final V.a f14640y = V.a.a("camerax.core.useCase.defaultCaptureConfig", T.class);

    /* renamed from: z, reason: collision with root package name */
    public static final V.a f14641z = V.a.a("camerax.core.useCase.sessionConfigUnpacker", V0.e.class);

    /* renamed from: A, reason: collision with root package name */
    public static final V.a f14631A = V.a.a("camerax.core.useCase.captureConfigUnpacker", T.b.class);

    public interface a extends A.C {
        l1 c();
    }

    static {
        Class cls = Integer.TYPE;
        f14632B = V.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f14633C = V.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        Class cls2 = Boolean.TYPE;
        f14634D = V.a.a("camerax.core.useCase.zslDisabled", cls2);
        f14635E = V.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        f14636F = V.a.a("camerax.core.useCase.captureType", m1.b.class);
        f14637G = V.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        f14638H = V.a.a("camerax.core.useCase.videoStabilizationMode", cls);
    }

    default m1.b F() {
        return (m1.b) a(f14636F);
    }

    default int G() {
        return ((Integer) f(f14638H, 0)).intValue();
    }

    default Range I(Range range) {
        return (Range) f(f14633C, range);
    }

    default int M(int i10) {
        return ((Integer) f(f14632B, Integer.valueOf(i10))).intValue();
    }

    default int O() {
        return ((Integer) f(f14637G, 0)).intValue();
    }

    default boolean R(boolean z10) {
        return ((Boolean) f(f14635E, Boolean.valueOf(z10))).booleanValue();
    }

    default V0.e U(V0.e eVar) {
        return (V0.e) f(f14641z, eVar);
    }

    default V0 q(V0 v02) {
        return (V0) f(f14639x, v02);
    }

    default T.b s(T.b bVar) {
        return (T.b) f(f14631A, bVar);
    }

    default V0 v() {
        return (V0) a(f14639x);
    }

    default boolean w(boolean z10) {
        return ((Boolean) f(f14634D, Boolean.valueOf(z10))).booleanValue();
    }

    default T z(T t10) {
        return (T) f(f14640y, t10);
    }
}
