package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class P5 {

    /* renamed from: c, reason: collision with root package name */
    private static final P5 f24328c = new P5();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24329d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f24331b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final T5 f24330a = new C2406y5();

    private P5() {
    }

    public static P5 a() {
        return f24328c;
    }

    public final S5 b(Class cls) {
        AbstractC2308n5.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f24331b;
        S5 s52 = (S5) concurrentMap.get(cls);
        if (s52 == null) {
            s52 = this.f24330a.a(cls);
            AbstractC2308n5.a(cls, "messageType");
            S5 s53 = (S5) concurrentMap.putIfAbsent(cls, s52);
            if (s53 != null) {
                return s53;
            }
        }
        return s52;
    }
}
