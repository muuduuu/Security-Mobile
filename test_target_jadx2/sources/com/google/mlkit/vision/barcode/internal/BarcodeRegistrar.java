package com.google.mlkit.vision.barcode.internal;

import X8.C1298d;
import X8.C1303i;
import com.google.firebase.components.ComponentRegistrar;
import d9.h;
import java.util.List;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;
import r7.AbstractC4140l0;

/* loaded from: classes2.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC4140l0.r(C3766c.c(h.class).b(q.j(C1303i.class)).f(new g() { // from class: d9.d
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new h((C1303i) interfaceC3767d.a(C1303i.class));
            }
        }).d(), C3766c.c(d9.g.class).b(q.j(h.class)).b(q.j(C1298d.class)).b(q.j(C1303i.class)).f(new g() { // from class: d9.e
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new g((h) interfaceC3767d.a(h.class), (C1298d) interfaceC3767d.a(C1298d.class), (C1303i) interfaceC3767d.a(C1303i.class));
            }
        }).d());
    }
}
