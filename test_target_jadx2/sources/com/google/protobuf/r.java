package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2885p f28809a = new C2886q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2885p f28810b = c();

    static AbstractC2885p a() {
        AbstractC2885p abstractC2885p = f28810b;
        if (abstractC2885p != null) {
            return abstractC2885p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2885p b() {
        return f28809a;
    }

    private static AbstractC2885p c() {
        try {
            return (AbstractC2885p) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
