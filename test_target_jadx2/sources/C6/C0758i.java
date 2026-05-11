package C6;

import w6.InterfaceC5040b;

/* renamed from: C6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0758i implements InterfaceC5040b {

    /* renamed from: C6.i$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C0758i f988a = new C0758i();
    }

    public static C0758i a() {
        return a.f988a;
    }

    public static int c() {
        return AbstractC0755f.c();
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
