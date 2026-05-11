package com.facebook.animated.gif;

import T3.d;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class GifFrame implements d {
    private long mNativeContext;

    GifFrame(long j10) {
        this.mNativeContext = j10;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

    @Override // T3.d
    public void a() {
        nativeDispose();
    }

    @Override // T3.d
    public void b(int i10, int i11, Bitmap bitmap) {
        nativeRenderFrame(i10, i11, bitmap);
    }

    @Override // T3.d
    public int c() {
        return nativeGetXOffset();
    }

    @Override // T3.d
    public int d() {
        return nativeGetYOffset();
    }

    public int e() {
        return nativeGetDisposalMode();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // T3.d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // T3.d
    public int getWidth() {
        return nativeGetWidth();
    }
}
