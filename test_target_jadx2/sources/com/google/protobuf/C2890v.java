package com.google.protobuf;

/* renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2890v implements M {

    /* renamed from: a, reason: collision with root package name */
    private static final C2890v f28814a = new C2890v();

    private C2890v() {
    }

    public static C2890v c() {
        return f28814a;
    }

    @Override // com.google.protobuf.M
    public L a(Class cls) {
        if (!AbstractC2891w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (L) AbstractC2891w.getDefaultInstance(cls.asSubclass(AbstractC2891w.class)).buildMessageInfo();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.M
    public boolean b(Class cls) {
        return AbstractC2891w.class.isAssignableFrom(cls);
    }
}
