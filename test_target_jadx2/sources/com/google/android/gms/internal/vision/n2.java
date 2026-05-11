package com.google.android.gms.internal.vision;

/* loaded from: classes2.dex */
final class n2 extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    n2(int i10, int i11) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i10);
        sb2.append(" of ");
        sb2.append(i11);
    }
}
