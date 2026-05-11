package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* loaded from: classes2.dex */
final class O0 implements InterfaceC2612u1 {

    /* renamed from: a, reason: collision with root package name */
    private static final O0 f25061a = new O0();

    private O0() {
    }

    public static O0 c() {
        return f25061a;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2612u1
    public final boolean a(Class cls) {
        return N0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2612u1
    public final InterfaceC2603r1 b(Class cls) {
        if (!N0.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC2603r1) N0.h(cls.asSubclass(N0.class)).j(N0.d.f25055c, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }
}
