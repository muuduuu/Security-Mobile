package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
abstract class V0 {

    /* renamed from: a, reason: collision with root package name */
    private static final U0 f23664a;

    /* renamed from: b, reason: collision with root package name */
    private static final U0 f23665b;

    static {
        U0 u02 = null;
        try {
            u02 = (U0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f23664a = u02;
        f23665b = new U0();
    }

    static U0 a() {
        return f23664a;
    }

    static U0 b() {
        return f23665b;
    }
}
