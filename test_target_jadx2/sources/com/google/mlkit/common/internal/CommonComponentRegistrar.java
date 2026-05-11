package com.google.mlkit.common.internal;

import W8.c;
import X8.C1295a;
import X8.C1296b;
import X8.C1298d;
import X8.C1303i;
import X8.C1304j;
import X8.m;
import Y8.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;
import q7.AbstractC3939m;

/* loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC3939m.t(m.f11822b, C3766c.c(a.class).b(q.j(C1303i.class)).f(new g() { // from class: U8.a
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new Y8.a((C1303i) interfaceC3767d.a(C1303i.class));
            }
        }).d(), C3766c.c(C1304j.class).f(new g() { // from class: U8.b
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new C1304j();
            }
        }).d(), C3766c.c(c.class).b(q.m(c.a.class)).f(new g() { // from class: U8.c
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new W8.c(interfaceC3767d.e(c.a.class));
            }
        }).d(), C3766c.c(C1298d.class).b(q.l(C1304j.class)).f(new g() { // from class: U8.d
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new C1298d(interfaceC3767d.d(C1304j.class));
            }
        }).d(), C3766c.c(C1295a.class).f(new g() { // from class: U8.e
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return C1295a.a();
            }
        }).d(), C3766c.c(C1296b.class).b(q.j(C1295a.class)).f(new g() { // from class: U8.f
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new C1296b((C1295a) interfaceC3767d.a(C1295a.class));
            }
        }).d(), C3766c.c(V8.a.class).b(q.j(C1303i.class)).f(new g() { // from class: U8.g
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new V8.a((C1303i) interfaceC3767d.a(C1303i.class));
            }
        }).d(), C3766c.m(c.a.class).b(q.l(V8.a.class)).f(new g() { // from class: U8.h
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new c.a(W8.a.class, interfaceC3767d.d(V8.a.class));
            }
        }).d());
    }
}
