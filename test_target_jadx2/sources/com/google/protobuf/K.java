package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class K {

    /* renamed from: a, reason: collision with root package name */
    private static final I f28677a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final I f28678b = new J();

    static I a() {
        return f28677a;
    }

    static I b() {
        return f28678b;
    }

    private static I c() {
        try {
            return (I) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
