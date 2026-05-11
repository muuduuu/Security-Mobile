package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2177x0 implements InterfaceC2174w0 {
    C2177x0() {
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final Object d(Object obj) {
        return C2171v0.d().h();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final boolean e(Object obj) {
        return !((C2171v0) obj).a();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final Object f(Object obj, Object obj2) {
        C2171v0 c2171v0 = (C2171v0) obj;
        C2171v0 c2171v02 = (C2171v0) obj2;
        if (!c2171v02.isEmpty()) {
            if (!c2171v0.a()) {
                c2171v0 = c2171v0.h();
            }
            c2171v0.b(c2171v02);
        }
        return c2171v0;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final Object g(Object obj) {
        ((C2171v0) obj).m();
        return obj;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final AbstractC2168u0 h(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final int i(int i10, Object obj, Object obj2) {
        C2171v0 c2171v0 = (C2171v0) obj;
        if (c2171v0.isEmpty()) {
            return 0;
        }
        Iterator it = c2171v0.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final Map j(Object obj) {
        return (C2171v0) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2174w0
    public final Map k(Object obj) {
        return (C2171v0) obj;
    }
}
