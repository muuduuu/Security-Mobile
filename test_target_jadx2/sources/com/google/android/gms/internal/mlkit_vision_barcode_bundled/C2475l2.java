package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2475l2 extends AbstractC2524v2 {
    C2475l2(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2524v2
    public final void a() {
        if (!j()) {
            for (int i10 = 0; i10 < b(); i10++) {
                ((U0) g(i10).getKey()).i();
            }
            Iterator it = c().iterator();
            while (it.hasNext()) {
                ((U0) ((Map.Entry) it.next()).getKey()).i();
            }
        }
        super.a();
    }
}
