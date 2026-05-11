package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2104y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2098w0 f23789a = new C2101x0();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2098w0 f23790b;

    static {
        AbstractC2098w0 abstractC2098w0 = null;
        try {
            abstractC2098w0 = (AbstractC2098w0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f23790b = abstractC2098w0;
    }

    static AbstractC2098w0 a() {
        AbstractC2098w0 abstractC2098w0 = f23790b;
        if (abstractC2098w0 != null) {
            return abstractC2098w0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2098w0 b() {
        return f23789a;
    }
}
