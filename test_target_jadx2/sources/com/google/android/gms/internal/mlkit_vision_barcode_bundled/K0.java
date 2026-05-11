package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class K0 extends IOException {
    K0(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    K0(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
