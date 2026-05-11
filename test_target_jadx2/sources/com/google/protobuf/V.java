package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class V {

    /* renamed from: a, reason: collision with root package name */
    private static final T f28703a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final T f28704b = new U();

    static T a() {
        return f28703a;
    }

    static T b() {
        return f28704b;
    }

    private static T c() {
        try {
            return (T) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
