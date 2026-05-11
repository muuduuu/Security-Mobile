package C6;

import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* renamed from: C6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0759j implements InterfaceC5040b {

    /* renamed from: C6.j$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C0759j f989a = new C0759j();
    }

    public static C0759j a() {
        return a.f989a;
    }

    public static AbstractC0754e c() {
        return (AbstractC0754e) AbstractC5042d.c(AbstractC0755f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0754e get() {
        return c();
    }
}
