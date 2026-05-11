package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2162s0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    private A0[] f24094a;

    C2162s0(A0... a0Arr) {
        this.f24094a = a0Arr;
    }

    @Override // com.google.android.gms.internal.clearcut.A0
    public final boolean a(Class cls) {
        for (A0 a02 : this.f24094a) {
            if (a02.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.A0
    public final InterfaceC2183z0 b(Class cls) {
        for (A0 a02 : this.f24094a) {
            if (a02.a(cls)) {
                return a02.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
