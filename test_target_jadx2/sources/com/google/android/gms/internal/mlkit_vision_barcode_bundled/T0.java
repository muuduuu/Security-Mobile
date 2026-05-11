package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    private static final R0 f24811a = new S0();

    /* renamed from: b, reason: collision with root package name */
    private static final R0 f24812b;

    static {
        R0 r02 = null;
        try {
            r02 = (R0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f24812b = r02;
    }

    static R0 a() {
        R0 r02 = f24812b;
        if (r02 != null) {
            return r02;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static R0 b() {
        return f24811a;
    }
}
