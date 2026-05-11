package Rb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {
    public static final byte[] a(byte[] inputArray) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        byte[] bArr = {0, 0, 0, 0};
        System.arraycopy(inputArray, 0, bArr, 4 - inputArray.length, inputArray.length);
        return bArr;
    }
}
