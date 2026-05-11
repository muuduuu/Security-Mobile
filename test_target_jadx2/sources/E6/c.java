package E6;

import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class c implements InterfaceC5040b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f1901a = new c();
    }

    public static c a() {
        return a.f1901a;
    }

    public static E6.a b() {
        return (E6.a) AbstractC5042d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E6.a get() {
        return b();
    }
}
