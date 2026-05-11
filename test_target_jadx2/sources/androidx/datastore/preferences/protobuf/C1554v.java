package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1554v implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C1554v f16472a = new C1554v();

    private C1554v() {
    }

    public static C1554v c() {
        return f16472a;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public N a(Class cls) {
        if (!AbstractC1555w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC1555w.q(cls.asSubclass(AbstractC1555w.class)).f();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public boolean b(Class cls) {
        return AbstractC1555w.class.isAssignableFrom(cls);
    }
}
