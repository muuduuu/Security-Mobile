package C6;

import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* renamed from: C6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0756g implements InterfaceC5040b {

    /* renamed from: C6.g$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C0756g f986a = new C0756g();
    }

    public static C0756g a() {
        return a.f986a;
    }

    public static String b() {
        return (String) AbstractC5042d.c(AbstractC0755f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
