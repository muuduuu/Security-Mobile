package com.google.firebase.datatransport;

import I8.h;
import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import o8.C3762D;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;
import r8.InterfaceC4288a;
import r8.b;
import s6.InterfaceC4323i;
import u6.t;

/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4323i lambda$getComponents$0(InterfaceC3767d interfaceC3767d) {
        t.f((Context) interfaceC3767d.a(Context.class));
        return t.c().g(a.f23202h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4323i lambda$getComponents$1(InterfaceC3767d interfaceC3767d) {
        t.f((Context) interfaceC3767d.a(Context.class));
        return t.c().g(a.f23202h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4323i lambda$getComponents$2(InterfaceC3767d interfaceC3767d) {
        t.f((Context) interfaceC3767d.a(Context.class));
        return t.c().g(a.f23201g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        return Arrays.asList(C3766c.c(InterfaceC4323i.class).h(LIBRARY_NAME).b(q.j(Context.class)).f(new g() { // from class: r8.c
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                InterfaceC4323i lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC3767d);
                return lambda$getComponents$0;
            }
        }).d(), C3766c.e(C3762D.a(InterfaceC4288a.class, InterfaceC4323i.class)).b(q.j(Context.class)).f(new g() { // from class: r8.d
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                InterfaceC4323i lambda$getComponents$1;
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(interfaceC3767d);
                return lambda$getComponents$1;
            }
        }).d(), C3766c.e(C3762D.a(b.class, InterfaceC4323i.class)).b(q.j(Context.class)).f(new g() { // from class: r8.e
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                InterfaceC4323i lambda$getComponents$2;
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(interfaceC3767d);
                return lambda$getComponents$2;
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}
