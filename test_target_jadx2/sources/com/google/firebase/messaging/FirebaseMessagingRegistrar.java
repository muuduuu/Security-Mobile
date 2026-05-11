package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import j8.C3511e;
import java.util.Arrays;
import java.util.List;
import o8.C3762D;
import o8.C3766c;
import o8.InterfaceC3767d;
import s6.InterfaceC4323i;
import x8.InterfaceC5136d;
import z8.InterfaceC5263a;

/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C3762D c3762d, InterfaceC3767d interfaceC3767d) {
        C3511e c3511e = (C3511e) interfaceC3767d.a(C3511e.class);
        android.support.v4.media.session.b.a(interfaceC3767d.a(InterfaceC5263a.class));
        return new FirebaseMessaging(c3511e, null, interfaceC3767d.d(I8.i.class), interfaceC3767d.d(y8.j.class), (B8.f) interfaceC3767d.a(B8.f.class), interfaceC3767d.c(c3762d), (InterfaceC5136d) interfaceC3767d.a(InterfaceC5136d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        final C3762D a10 = C3762D.a(r8.b.class, InterfaceC4323i.class);
        return Arrays.asList(C3766c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(o8.q.j(C3511e.class)).b(o8.q.g(InterfaceC5263a.class)).b(o8.q.h(I8.i.class)).b(o8.q.h(y8.j.class)).b(o8.q.j(B8.f.class)).b(o8.q.i(a10)).b(o8.q.j(InterfaceC5136d.class)).f(new o8.g() { // from class: com.google.firebase.messaging.F
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(C3762D.this, interfaceC3767d);
                return lambda$getComponents$0;
            }
        }).c().d(), I8.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
