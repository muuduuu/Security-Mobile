package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2140k1 extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C2140k1(int i10, int i11) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i10);
        sb2.append(" of ");
        sb2.append(i11);
    }
}
