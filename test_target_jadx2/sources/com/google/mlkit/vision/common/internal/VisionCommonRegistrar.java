package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;
import s7.N5;

/* loaded from: classes2.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return N5.t(C3766c.c(a.class).b(q.m(a.C0422a.class)).f(new g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                return new a(interfaceC3767d.e(a.C0422a.class));
            }
        }).d());
    }
}
