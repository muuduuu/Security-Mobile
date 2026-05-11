package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2606s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2601q1 f25182a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2601q1 f25183b = new C2598p1();

    static InterfaceC2601q1 a() {
        return f25182a;
    }

    static InterfaceC2601q1 b() {
        return f25183b;
    }

    private static InterfaceC2601q1 c() {
        try {
            return (InterfaceC2601q1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
