package com.google.mlkit.vision.face.internal;

import X8.C1298d;
import X8.C1303i;
import com.google.firebase.components.ComponentRegistrar;
import h9.d;
import h9.f;
import java.util.List;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;
import t7.P;

/* loaded from: classes2.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return P.t(C3766c.c(f.class).b(q.j(C1303i.class)).f(new g() { // from class: h9.l
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new f((C1303i) interfaceC3767d.a(C1303i.class));
            }
        }).d(), C3766c.c(d.class).b(q.j(f.class)).b(q.j(C1298d.class)).f(new g() { // from class: h9.m
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new d((f) interfaceC3767d.a(f.class), (C1298d) interfaceC3767d.a(C1298d.class));
            }
        }).d());
    }
}
