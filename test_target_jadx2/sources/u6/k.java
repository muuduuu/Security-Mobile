package u6;

import java.util.concurrent.Executor;
import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class k implements InterfaceC5040b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f43562a = new k();
    }

    public static k a() {
        return a.f43562a;
    }

    public static Executor b() {
        return (Executor) AbstractC5042d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
