package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.vision.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2576i0 implements Comparator {
    C2576i0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int w10;
        int w11;
        AbstractC2570g0 abstractC2570g0 = (AbstractC2570g0) obj;
        AbstractC2570g0 abstractC2570g02 = (AbstractC2570g0) obj2;
        InterfaceC2585l0 interfaceC2585l0 = (InterfaceC2585l0) abstractC2570g0.iterator();
        InterfaceC2585l0 interfaceC2585l02 = (InterfaceC2585l0) abstractC2570g02.iterator();
        while (interfaceC2585l0.hasNext() && interfaceC2585l02.hasNext()) {
            w10 = AbstractC2570g0.w(interfaceC2585l0.zza());
            w11 = AbstractC2570g0.w(interfaceC2585l02.zza());
            int compare = Integer.compare(w10, w11);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(abstractC2570g0.e(), abstractC2570g02.e());
    }
}
