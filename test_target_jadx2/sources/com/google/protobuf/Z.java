package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class Z {

    /* renamed from: c, reason: collision with root package name */
    private static final Z f28705c = new Z();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f28707b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final d0 f28706a = new F();

    private Z() {
    }

    public static Z a() {
        return f28705c;
    }

    public c0 b(Class cls, c0 c0Var) {
        AbstractC2893y.b(cls, "messageType");
        AbstractC2893y.b(c0Var, "schema");
        return (c0) this.f28707b.putIfAbsent(cls, c0Var);
    }

    public c0 c(Class cls) {
        AbstractC2893y.b(cls, "messageType");
        c0 c0Var = (c0) this.f28707b.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        c0 a10 = this.f28706a.a(cls);
        c0 b10 = b(cls, a10);
        return b10 != null ? b10 : a10;
    }

    public c0 d(Object obj) {
        return c(obj.getClass());
    }
}
