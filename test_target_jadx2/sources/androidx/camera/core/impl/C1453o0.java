package androidx.camera.core.impl;

import A.InterfaceC0692d0;
import A.W;
import androidx.camera.core.impl.V;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1453o0 implements l1, InterfaceC1457q0, H.h {

    /* renamed from: J, reason: collision with root package name */
    public static final V.a f14658J;

    /* renamed from: K, reason: collision with root package name */
    public static final V.a f14659K;

    /* renamed from: L, reason: collision with root package name */
    public static final V.a f14660L;

    /* renamed from: M, reason: collision with root package name */
    public static final V.a f14661M;

    /* renamed from: N, reason: collision with root package name */
    public static final V.a f14662N;

    /* renamed from: O, reason: collision with root package name */
    public static final V.a f14663O;

    /* renamed from: P, reason: collision with root package name */
    public static final V.a f14664P;

    /* renamed from: Q, reason: collision with root package name */
    public static final V.a f14665Q;

    /* renamed from: R, reason: collision with root package name */
    public static final V.a f14666R;

    /* renamed from: S, reason: collision with root package name */
    public static final V.a f14667S;

    /* renamed from: T, reason: collision with root package name */
    public static final V.a f14668T;

    /* renamed from: U, reason: collision with root package name */
    public static final V.a f14669U;

    /* renamed from: V, reason: collision with root package name */
    public static final V.a f14670V;

    /* renamed from: I, reason: collision with root package name */
    private final G0 f14671I;

    static {
        Class cls = Integer.TYPE;
        f14658J = V.a.a("camerax.core.imageCapture.captureMode", cls);
        f14659K = V.a.a("camerax.core.imageCapture.flashMode", cls);
        f14660L = V.a.a("camerax.core.imageCapture.captureBundle", S.class);
        f14661M = V.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f14662N = V.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        f14663O = V.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f14664P = V.a.a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC0692d0.class);
        f14665Q = V.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f14666R = V.a.a("camerax.core.imageCapture.flashType", cls);
        f14667S = V.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f14668T = V.a.a("camerax.core.imageCapture.screenFlash", W.i.class);
        f14669U = V.a.a("camerax.core.useCase.postviewResolutionSelector", P.c.class);
        f14670V = V.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public C1453o0(G0 g02) {
        this.f14671I = g02;
    }

    public S Z(S s10) {
        return (S) f(f14660L, s10);
    }

    public int a0() {
        return ((Integer) a(f14658J)).intValue();
    }

    public int b0(int i10) {
        return ((Integer) f(f14659K, Integer.valueOf(i10))).intValue();
    }

    public int c0(int i10) {
        return ((Integer) f(f14666R, Integer.valueOf(i10))).intValue();
    }

    public InterfaceC0692d0 d0() {
        android.support.v4.media.session.b.a(f(f14664P, null));
        return null;
    }

    public Executor e0(Executor executor) {
        return (Executor) f(H.h.f3062a, executor);
    }

    public int f0() {
        return ((Integer) a(f14667S)).intValue();
    }

    public W.i g0() {
        return (W.i) f(f14668T, null);
    }

    public boolean h0() {
        return b(f14658J);
    }

    @Override // androidx.camera.core.impl.Q0
    public V n() {
        return this.f14671I;
    }

    @Override // androidx.camera.core.impl.InterfaceC1455p0
    public int p() {
        return ((Integer) a(InterfaceC1455p0.f14673l)).intValue();
    }
}
