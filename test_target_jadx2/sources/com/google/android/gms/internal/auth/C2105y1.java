package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.auth.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2105y1 extends A1 {
    C2105y1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f23581a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f23581a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final void c(Object obj, long j10, boolean z10) {
        if (B1.f23591g) {
            B1.i(obj, j10, z10);
        } else {
            B1.j(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final void d(Object obj, long j10, double d10) {
        this.f23581a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final void e(Object obj, long j10, float f10) {
        this.f23581a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final boolean f(Object obj, long j10) {
        return B1.f23591g ? B1.q(obj, j10) : B1.r(obj, j10);
    }
}
