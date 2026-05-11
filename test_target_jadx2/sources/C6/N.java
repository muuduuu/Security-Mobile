package C6;

import javax.inject.Provider;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class N implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f954a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f955b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f956c;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f957d;

    /* renamed from: e, reason: collision with root package name */
    private final Provider f958e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f954a = provider;
        this.f955b = provider2;
        this.f956c = provider3;
        this.f957d = provider4;
        this.f958e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(E6.a aVar, E6.a aVar2, Object obj, Object obj2, Provider provider) {
        return new M(aVar, aVar2, (AbstractC0754e) obj, (U) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((E6.a) this.f954a.get(), (E6.a) this.f955b.get(), this.f956c.get(), this.f957d.get(), this.f958e);
    }
}
