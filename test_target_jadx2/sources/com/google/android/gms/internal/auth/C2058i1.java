package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.auth.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2058i1 {

    /* renamed from: c, reason: collision with root package name */
    private static final C2058i1 f23715c = new C2058i1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f23717b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2070m1 f23716a = new S0();

    private C2058i1() {
    }

    public static C2058i1 a() {
        return f23715c;
    }

    public final InterfaceC2067l1 b(Class cls) {
        G0.c(cls, "messageType");
        InterfaceC2067l1 interfaceC2067l1 = (InterfaceC2067l1) this.f23717b.get(cls);
        if (interfaceC2067l1 == null) {
            interfaceC2067l1 = this.f23716a.a(cls);
            G0.c(cls, "messageType");
            InterfaceC2067l1 interfaceC2067l12 = (InterfaceC2067l1) this.f23717b.putIfAbsent(cls, interfaceC2067l1);
            if (interfaceC2067l12 != null) {
                return interfaceC2067l12;
            }
        }
        return interfaceC2067l1;
    }
}
