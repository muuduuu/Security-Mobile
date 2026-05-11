package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2264i6 extends AbstractC2273j6 {
    C2264i6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2273j6
    public final void a(Object obj, long j10, byte b10) {
        if (AbstractC2282k6.f24556h) {
            AbstractC2282k6.d(obj, j10, b10);
        } else {
            AbstractC2282k6.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2273j6
    public final boolean b(Object obj, long j10) {
        return AbstractC2282k6.f24556h ? AbstractC2282k6.z(obj, j10) : AbstractC2282k6.A(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2273j6
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC2282k6.f24556h) {
            AbstractC2282k6.d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC2282k6.e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2273j6
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f24540a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2273j6
    public final void e(Object obj, long j10, float f10) {
        this.f24540a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2273j6
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f24540a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2273j6
    public final void g(Object obj, long j10, double d10) {
        this.f24540a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
