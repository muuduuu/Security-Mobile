package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC2109a0;

/* loaded from: classes2.dex */
final class Z implements A0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Z f23967a = new Z();

    private Z() {
    }

    public static Z c() {
        return f23967a;
    }

    @Override // com.google.android.gms.internal.clearcut.A0
    public final boolean a(Class cls) {
        return AbstractC2109a0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.clearcut.A0
    public final InterfaceC2183z0 b(Class cls) {
        if (!AbstractC2109a0.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC2183z0) AbstractC2109a0.k(cls.asSubclass(AbstractC2109a0.class)).e(AbstractC2109a0.c.f23995c, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }
}
