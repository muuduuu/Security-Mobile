package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2180y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2174w0 f24111a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2174w0 f24112b = new C2177x0();

    static InterfaceC2174w0 a() {
        return f24111a;
    }

    static InterfaceC2174w0 b() {
        return f24112b;
    }

    private static InterfaceC2174w0 c() {
        try {
            return (InterfaceC2174w0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
