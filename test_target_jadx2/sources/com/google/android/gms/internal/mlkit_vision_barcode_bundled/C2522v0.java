package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2522v0 implements Comparator {
    C2522v0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        E0 e02 = (E0) obj;
        E0 e03 = (E0) obj2;
        InterfaceC2537y0 it = e02.iterator();
        InterfaceC2537y0 it2 = e03.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(e02.j()).compareTo(Integer.valueOf(e03.j()));
    }
}
