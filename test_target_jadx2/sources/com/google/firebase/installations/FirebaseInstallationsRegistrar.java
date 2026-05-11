package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import j8.C3511e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n8.InterfaceC3714a;
import n8.InterfaceC3715b;
import o8.C3762D;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.q;
import p8.AbstractC3851j;

/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ B8.f lambda$getComponents$0(InterfaceC3767d interfaceC3767d) {
        return new c((C3511e) interfaceC3767d.a(C3511e.class), interfaceC3767d.d(y8.i.class), (ExecutorService) interfaceC3767d.g(C3762D.a(InterfaceC3714a.class, ExecutorService.class)), AbstractC3851j.b((Executor) interfaceC3767d.g(C3762D.a(InterfaceC3715b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        return Arrays.asList(C3766c.c(B8.f.class).h(LIBRARY_NAME).b(q.j(C3511e.class)).b(q.h(y8.i.class)).b(q.k(C3762D.a(InterfaceC3714a.class, ExecutorService.class))).b(q.k(C3762D.a(InterfaceC3715b.class, Executor.class))).f(new o8.g() { // from class: B8.g
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                f lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC3767d);
                return lambda$getComponents$0;
            }
        }).d(), y8.h.a(), I8.h.b(LIBRARY_NAME, "19.0.1"));
    }
}
