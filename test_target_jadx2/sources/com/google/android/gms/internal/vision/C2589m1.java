package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2589m1 implements InterfaceC2612u1 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2612u1[] f25174a;

    C2589m1(InterfaceC2612u1... interfaceC2612u1Arr) {
        this.f25174a = interfaceC2612u1Arr;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2612u1
    public final boolean a(Class cls) {
        for (InterfaceC2612u1 interfaceC2612u1 : this.f25174a) {
            if (interfaceC2612u1.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2612u1
    public final InterfaceC2603r1 b(Class cls) {
        for (InterfaceC2612u1 interfaceC2612u1 : this.f25174a) {
            if (interfaceC2612u1.a(cls)) {
                return interfaceC2612u1.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
