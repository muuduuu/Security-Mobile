package io.sentry;

/* loaded from: classes2.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f34430a;

    private B0(Class cls) {
        this.f34430a = cls;
    }

    public static B0 a(Class cls) {
        return new B0(cls);
    }

    public Object b() {
        return this.f34430a.getDeclaredConstructor(null).newInstance(null);
    }
}
