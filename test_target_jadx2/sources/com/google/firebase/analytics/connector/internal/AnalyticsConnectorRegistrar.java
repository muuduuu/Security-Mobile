package com.google.firebase.analytics.connector.internal;

import I8.h;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import j8.C3511e;
import java.util.Arrays;
import java.util.List;
import m8.C3658b;
import m8.InterfaceC3657a;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.q;
import x8.InterfaceC5136d;

/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3657a lambda$getComponents$0(InterfaceC3767d interfaceC3767d) {
        return C3658b.g((C3511e) interfaceC3767d.a(C3511e.class), (Context) interfaceC3767d.a(Context.class), (InterfaceC5136d) interfaceC3767d.a(InterfaceC5136d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        return Arrays.asList(C3766c.c(InterfaceC3657a.class).b(q.j(C3511e.class)).b(q.j(Context.class)).b(q.j(InterfaceC5136d.class)).f(a.f27948a).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}
