package org.aomedia.avif.android;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class AvifDecoder {
    private boolean alphaPresent;
    private long decoder;
    private int depth;
    private int frameCount;
    private double[] frameDurations;
    private int height;
    private int repetitionCount;
    private int width;

    public static class Info {
        public boolean alphaPresent;
        public int depth;
        public int height;
        public int width;
    }

    static {
        try {
            System.loadLibrary("avif_android");
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
        }
    }

    private AvifDecoder(ByteBuffer byteBuffer, int i10) {
        this.decoder = createDecoder(byteBuffer, byteBuffer.remaining(), i10);
    }

    public static AvifDecoder create(ByteBuffer byteBuffer) {
        return create(byteBuffer, 1);
    }

    private native long createDecoder(ByteBuffer byteBuffer, int i10, int i11);

    public static boolean decode(ByteBuffer byteBuffer, int i10, Bitmap bitmap) {
        return decode(byteBuffer, i10, bitmap, 0);
    }

    public static native boolean decode(ByteBuffer byteBuffer, int i10, Bitmap bitmap, int i11);

    private native void destroyDecoder(long j10);

    public static native boolean getInfo(ByteBuffer byteBuffer, int i10, Info info);

    public static boolean isAvifImage(ByteBuffer byteBuffer) {
        return isAvifImage(byteBuffer, byteBuffer.remaining());
    }

    private static native boolean isAvifImage(ByteBuffer byteBuffer, int i10);

    private native int nextFrame(long j10, Bitmap bitmap);

    private native int nextFrameIndex(long j10);

    private native int nthFrame(long j10, int i10, Bitmap bitmap);

    public static native String resultToString(int i10);

    public static native String versionString();

    public boolean getAlphaPresent() {
        return this.alphaPresent;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public double[] getFrameDurations() {
        return this.frameDurations;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRepetitionCount() {
        return this.repetitionCount;
    }

    public int getWidth() {
        return this.width;
    }

    public int nextFrame(Bitmap bitmap) {
        return nextFrame(this.decoder, bitmap);
    }

    public int nextFrameIndex() {
        return nextFrameIndex(this.decoder);
    }

    public int nthFrame(int i10, Bitmap bitmap) {
        return nthFrame(this.decoder, i10, bitmap);
    }

    public void release() {
        long j10 = this.decoder;
        if (j10 != 0) {
            destroyDecoder(j10);
        }
        this.decoder = 0L;
    }

    public static AvifDecoder create(ByteBuffer byteBuffer, int i10) {
        AvifDecoder avifDecoder = new AvifDecoder(byteBuffer, i10);
        if (avifDecoder.decoder == 0) {
            return null;
        }
        return avifDecoder;
    }
}
