package com.google.firebase.remoteconfig;

import B8.f;
import I8.h;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import j8.C3511e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import m8.InterfaceC3657a;
import n8.InterfaceC3715b;
import o8.C3762D;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;

/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d lambda$getComponents$0(C3762D c3762d, InterfaceC3767d interfaceC3767d) {
        return new d((Context) interfaceC3767d.a(Context.class), (ScheduledExecutorService) interfaceC3767d.g(c3762d), (C3511e) interfaceC3767d.a(C3511e.class), (f) interfaceC3767d.a(f.class), ((com.google.firebase.abt.component.a) interfaceC3767d.a(com.google.firebase.abt.component.a.class)).b("frc"), interfaceC3767d.d(InterfaceC3657a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        final C3762D a10 = C3762D.a(InterfaceC3715b.class, ScheduledExecutorService.class);
        return Arrays.asList(C3766c.d(d.class, L8.a.class).h(LIBRARY_NAME).b(q.j(Context.class)).b(q.k(a10)).b(q.j(C3511e.class)).b(q.j(f.class)).b(q.j(com.google.firebase.abt.component.a.class)).b(q.h(InterfaceC3657a.class)).f(new g() { // from class: J8.y
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                com.google.firebase.remoteconfig.d lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(C3762D.this, interfaceC3767d);
                return lambda$getComponents$0;
            }
        }).e().d(), h.b(LIBRARY_NAME, "23.0.1"));
    }
}
