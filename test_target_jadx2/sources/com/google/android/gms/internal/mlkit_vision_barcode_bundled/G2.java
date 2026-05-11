package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class G2 extends I2 {
    G2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f24766a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f24766a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void c(Object obj, long j10, boolean z10) {
        if (J2.f24779h) {
            J2.d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            J2.e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void d(Object obj, long j10, byte b10) {
        if (J2.f24779h) {
            J2.d(obj, j10, b10);
        } else {
            J2.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void e(Object obj, long j10, double d10) {
        this.f24766a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void f(Object obj, long j10, float f10) {
        this.f24766a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final boolean g(Object obj, long j10) {
        return J2.f24779h ? J2.y(obj, j10) : J2.z(obj, j10);
    }
}
