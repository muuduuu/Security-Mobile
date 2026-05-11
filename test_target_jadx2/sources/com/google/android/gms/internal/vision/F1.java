package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class F1 {

    /* renamed from: c, reason: collision with root package name */
    private static final F1 f25024c = new F1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f25026b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final M1 f25025a = new C2583k1();

    private F1() {
    }

    public static F1 a() {
        return f25024c;
    }

    public final K1 b(Class cls) {
        R0.f(cls, "messageType");
        K1 k12 = (K1) this.f25026b.get(cls);
        if (k12 != null) {
            return k12;
        }
        K1 a10 = this.f25025a.a(cls);
        R0.f(cls, "messageType");
        R0.f(a10, "schema");
        K1 k13 = (K1) this.f25026b.putIfAbsent(cls, a10);
        return k13 != null ? k13 : a10;
    }

    public final K1 c(Object obj) {
        return b(obj.getClass());
    }
}
