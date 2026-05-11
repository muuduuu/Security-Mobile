package com.facebook.imagepipeline.nativecode;

import o4.InterfaceC3750c;
import o4.InterfaceC3751d;

/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements InterfaceC3751d {

    /* renamed from: a, reason: collision with root package name */
    private final int f20725a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20726b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20727c;

    public NativeJpegTranscoderFactory(int i10, boolean z10, boolean z11) {
        this.f20725a = i10;
        this.f20726b = z10;
        this.f20727c = z11;
    }

    @Override // o4.InterfaceC3751d
    public InterfaceC3750c createImageTranscoder(S3.c cVar, boolean z10) {
        if (cVar != S3.b.f8722b) {
            return null;
        }
        return new NativeJpegTranscoder(z10, this.f20725a, this.f20726b, this.f20727c);
    }
}
