package u6;

import javax.inject.Provider;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class v implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f43579a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f43580b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f43581c;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f43582d;

    /* renamed from: e, reason: collision with root package name */
    private final Provider f43583e;

    public v(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f43579a = provider;
        this.f43580b = provider2;
        this.f43581c = provider3;
        this.f43582d = provider4;
        this.f43583e = provider5;
    }

    public static v a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t c(E6.a aVar, E6.a aVar2, A6.e eVar, B6.r rVar, B6.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((E6.a) this.f43579a.get(), (E6.a) this.f43580b.get(), (A6.e) this.f43581c.get(), (B6.r) this.f43582d.get(), (B6.v) this.f43583e.get());
    }
}
