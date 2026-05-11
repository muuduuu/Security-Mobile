package o4;

import b4.p;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3753f implements InterfaceC3751d {

    /* renamed from: a, reason: collision with root package name */
    private final int f37925a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37926b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3751d f37927c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f37928d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37929e;

    public C3753f(int i10, boolean z10, InterfaceC3751d interfaceC3751d, Integer num, boolean z11) {
        this.f37925a = i10;
        this.f37926b = z10;
        this.f37927c = interfaceC3751d;
        this.f37928d = num;
        this.f37929e = z11;
    }

    private final InterfaceC3750c a(S3.c cVar, boolean z10) {
        InterfaceC3751d interfaceC3751d = this.f37927c;
        if (interfaceC3751d != null) {
            return interfaceC3751d.createImageTranscoder(cVar, z10);
        }
        return null;
    }

    private final InterfaceC3750c b(S3.c cVar, boolean z10) {
        Integer num = this.f37928d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return c(cVar, z10);
        }
        if (intValue == 1) {
            return d(cVar, z10);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    private final InterfaceC3750c c(S3.c cVar, boolean z10) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f37925a, this.f37926b, this.f37929e).createImageTranscoder(cVar, z10);
    }

    private final InterfaceC3750c d(S3.c cVar, boolean z10) {
        InterfaceC3750c createImageTranscoder = new C3755h(this.f37925a).createImageTranscoder(cVar, z10);
        Intrinsics.checkNotNullExpressionValue(createImageTranscoder, "SimpleImageTranscoderFac…ormat, isResizingEnabled)");
        return createImageTranscoder;
    }

    @Override // o4.InterfaceC3751d
    public InterfaceC3750c createImageTranscoder(S3.c imageFormat, boolean z10) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        InterfaceC3750c a10 = a(imageFormat, z10);
        if (a10 == null) {
            a10 = b(imageFormat, z10);
        }
        if (a10 == null && p.a()) {
            a10 = c(imageFormat, z10);
        }
        return a10 == null ? d(imageFormat, z10) : a10;
    }
}
