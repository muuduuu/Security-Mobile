package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class Y0 implements N1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Y0 f24836a = new Y0();

    private Y0() {
    }

    public static Y0 a() {
        return f24836a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1
    public final M1 b(Class cls) {
        if (!AbstractC2444f1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (M1) AbstractC2444f1.g(cls.asSubclass(AbstractC2444f1.class)).F(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1
    public final boolean c(Class cls) {
        return AbstractC2444f1.class.isAssignableFrom(cls);
    }
}
