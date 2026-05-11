package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class L extends AbstractC2391x {
    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        if (str == null || str.isEmpty() || !y12.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC2329q h10 = y12.h(str);
        if (h10 instanceof AbstractC2275k) {
            return ((AbstractC2275k) h10).b(y12, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
