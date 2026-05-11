package A6;

import javax.inject.Provider;
import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class g implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f370a;

    public g(Provider provider) {
        this.f370a = provider;
    }

    public static B6.f a(E6.a aVar) {
        return (B6.f) AbstractC5042d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public B6.f get() {
        return a((E6.a) this.f370a.get());
    }
}
