package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2218d5 implements F5 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2218d5 f24479a = new C2218d5();

    private C2218d5() {
    }

    public static C2218d5 a() {
        return f24479a;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final boolean b(Class cls) {
        return AbstractC2245g5.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final E5 c(Class cls) {
        if (!AbstractC2245g5.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (E5) AbstractC2245g5.r(cls.asSubclass(AbstractC2245g5.class)).B(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
