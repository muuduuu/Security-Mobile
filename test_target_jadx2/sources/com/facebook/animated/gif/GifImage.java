package com.facebook.animated.gif;

import T3.b;
import T3.c;
import android.graphics.Bitmap;
import b3.l;
import java.nio.ByteBuffer;
import p5.AbstractC3794a;

/* loaded from: classes.dex */
public class GifImage implements c, U3.c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f20579b;

    /* renamed from: a, reason: collision with root package name */
    private Bitmap.Config f20580a = null;
    private long mNativeContext;

    public GifImage() {
    }

    public static GifImage f(ByteBuffer byteBuffer, a4.c cVar) {
        h();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, cVar.f12575b, cVar.f12580g);
        nativeCreateFromDirectByteBuffer.f20580a = cVar.f12582i;
        return nativeCreateFromDirectByteBuffer;
    }

    public static GifImage g(long j10, int i10, a4.c cVar) {
        h();
        l.b(Boolean.valueOf(j10 != 0));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j10, i10, cVar.f12575b, cVar.f12580g);
        nativeCreateFromNativeMemory.f20580a = cVar.f12582i;
        return nativeCreateFromNativeMemory;
    }

    private static synchronized void h() {
        synchronized (GifImage.class) {
            if (!f20579b) {
                f20579b = true;
                AbstractC3794a.d("gifimage");
            }
        }
    }

    private static b.EnumC0181b i(int i10) {
        return i10 == 0 ? b.EnumC0181b.DISPOSE_DO_NOT : i10 == 1 ? b.EnumC0181b.DISPOSE_DO_NOT : i10 == 2 ? b.EnumC0181b.DISPOSE_TO_BACKGROUND : i10 == 3 ? b.EnumC0181b.DISPOSE_TO_PREVIOUS : b.EnumC0181b.DISPOSE_DO_NOT;
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i10, boolean z10);

    private static native GifImage nativeCreateFromFileDescriptor(int i10, int i11, boolean z10);

    private static native GifImage nativeCreateFromNativeMemory(long j10, int i10, int i11, boolean z10);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i10);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // T3.c
    public int M() {
        return nativeGetSizeInBytes();
    }

    @Override // T3.c
    public Bitmap.Config N() {
        return this.f20580a;
    }

    @Override // T3.c
    public boolean P() {
        return false;
    }

    @Override // T3.c
    public int[] Q() {
        return nativeGetFrameDurations();
    }

    @Override // T3.c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // T3.c
    public int b() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // T3.c
    public b c(int i10) {
        GifFrame O10 = O(i10);
        try {
            return new b(i10, O10.c(), O10.d(), O10.getWidth(), O10.getHeight(), b.a.BLEND_WITH_PREVIOUS, i(O10.e()));
        } finally {
            O10.a();
        }
    }

    @Override // U3.c
    public c d(ByteBuffer byteBuffer, a4.c cVar) {
        return f(byteBuffer, cVar);
    }

    @Override // U3.c
    public c e(long j10, int i10, a4.c cVar) {
        return g(j10, i10, cVar);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // T3.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // T3.c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // T3.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public GifFrame O(int i10) {
        return nativeGetFrame(i10);
    }

    GifImage(long j10) {
        this.mNativeContext = j10;
    }
}
