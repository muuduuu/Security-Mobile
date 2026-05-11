package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2499q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q0;
import f8.C3153a;
import i9.C3344a;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26525b = "BarhopperV3";

    /* renamed from: a, reason: collision with root package name */
    private long f26526a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j10);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private static C3344a e(byte[] bArr) {
        bArr.getClass();
        try {
            return C3344a.H(bArr, Q0.a());
        } catch (C2499q1 e10) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e10);
        }
    }

    private native byte[] recognizeBitmapNative(long j10, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j10, int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j10, int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j10, int i10, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j10, int i10, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions);

    public void a(C3153a c3153a) {
        if (this.f26526a != 0) {
            Log.w(f26525b, "Native context already exists.");
            return;
        }
        try {
            int x10 = c3153a.x();
            byte[] bArr = new byte[x10];
            M0 a10 = M0.a(bArr, 0, x10);
            c3153a.a(a10);
            a10.b();
            long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
            this.f26526a = createNativeWithClientOptions;
            if (createNativeWithClientOptions == 0) {
                throw new IllegalArgumentException("Failed to create native context with client options.");
            }
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + c3153a.getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public C3344a b(int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j10 = this.f26526a;
        if (j10 != 0) {
            return e(recognizeBufferNative(j10, i10, i11, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public C3344a c(int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j10 = this.f26526a;
        if (j10 != 0) {
            return e(recognizeNative(j10, i10, i11, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f26526a;
        if (j10 != 0) {
            closeNative(j10);
            this.f26526a = 0L;
        }
    }

    public C3344a d(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f26526a == 0) {
            throw new IllegalStateException("Native context does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d(f26525b, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return e(recognizeBitmapNative(this.f26526a, bitmap, recognitionOptions));
    }
}
