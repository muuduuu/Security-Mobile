package com.google.firebase.abt.component;

import I8.h;
import android.content.Context;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m8.InterfaceC3657a;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;

/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(InterfaceC3767d interfaceC3767d) {
        return new a((Context) interfaceC3767d.a(Context.class), interfaceC3767d.d(InterfaceC3657a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        return Arrays.asList(C3766c.c(a.class).h(LIBRARY_NAME).b(q.j(Context.class)).b(q.h(InterfaceC3657a.class)).f(new g() { // from class: l8.a
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                com.google.firebase.abt.component.a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(interfaceC3767d);
                return lambda$getComponents$0;
            }
        }).d(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}
