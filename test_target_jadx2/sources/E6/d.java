package E6;

import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class d implements InterfaceC5040b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f1902a = new d();
    }

    public static d a() {
        return a.f1902a;
    }

    public static E6.a c() {
        return (E6.a) AbstractC5042d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E6.a get() {
        return c();
    }
}
