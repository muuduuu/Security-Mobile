package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2598p1 implements InterfaceC2601q1 {
    C2598p1() {
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final Map a(Object obj) {
        return (C2592n1) obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final Map b(Object obj) {
        return (C2592n1) obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final Object c(Object obj) {
        ((C2592n1) obj).i();
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final boolean d(Object obj) {
        return !((C2592n1) obj).l();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final AbstractC2595o1 e(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final Object f(Object obj) {
        return C2592n1.b().h();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final Object g(Object obj, Object obj2) {
        C2592n1 c2592n1 = (C2592n1) obj;
        C2592n1 c2592n12 = (C2592n1) obj2;
        if (!c2592n12.isEmpty()) {
            if (!c2592n1.l()) {
                c2592n1 = c2592n1.h();
            }
            c2592n1.d(c2592n12);
        }
        return c2592n1;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2601q1
    public final int h(int i10, Object obj, Object obj2) {
        C2592n1 c2592n1 = (C2592n1) obj;
        android.support.v4.media.session.b.a(obj2);
        if (c2592n1.isEmpty()) {
            return 0;
        }
        Iterator it = c2592n1.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
