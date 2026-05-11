package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.auth.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2054h0 implements Comparator {
    C2054h0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC2081q0 abstractC2081q0 = (AbstractC2081q0) obj;
        AbstractC2081q0 abstractC2081q02 = (AbstractC2081q0) obj2;
        C2051g0 c2051g0 = new C2051g0(abstractC2081q0);
        C2051g0 c2051g02 = new C2051g0(abstractC2081q02);
        while (c2051g0.hasNext() && c2051g02.hasNext()) {
            int compareTo = Integer.valueOf(c2051g0.zza() & 255).compareTo(Integer.valueOf(c2051g02.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC2081q0.h()).compareTo(Integer.valueOf(abstractC2081q02.h()));
    }
}
