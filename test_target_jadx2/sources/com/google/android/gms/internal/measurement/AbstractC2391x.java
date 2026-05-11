package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2391x {

    /* renamed from: a, reason: collision with root package name */
    final List f24681a = new ArrayList();

    protected AbstractC2391x() {
    }

    public abstract InterfaceC2329q a(String str, Y1 y12, List list);

    final InterfaceC2329q b(String str) {
        if (this.f24681a.contains(AbstractC2412z2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
