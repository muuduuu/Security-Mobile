package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class X1 {

    /* renamed from: c, reason: collision with root package name */
    private static final X1 f24833c = new X1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f24835b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2465j2 f24834a = new I1();

    private X1() {
    }

    public static X1 a() {
        return f24833c;
    }

    public final InterfaceC2460i2 b(Class cls) {
        AbstractC2489o1.c(cls, "messageType");
        InterfaceC2460i2 interfaceC2460i2 = (InterfaceC2460i2) this.f24835b.get(cls);
        if (interfaceC2460i2 == null) {
            interfaceC2460i2 = this.f24834a.a(cls);
            AbstractC2489o1.c(cls, "messageType");
            AbstractC2489o1.c(interfaceC2460i2, "schema");
            InterfaceC2460i2 interfaceC2460i22 = (InterfaceC2460i2) this.f24835b.putIfAbsent(cls, interfaceC2460i2);
            if (interfaceC2460i22 != null) {
                return interfaceC2460i22;
            }
        }
        return interfaceC2460i2;
    }
}
