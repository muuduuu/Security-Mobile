package A6;

import B6.x;
import C6.InterfaceC0753d;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import v6.InterfaceC4953e;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class d implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f365a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f366b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f367c;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f368d;

    /* renamed from: e, reason: collision with root package name */
    private final Provider f369e;

    public d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f365a = provider;
        this.f366b = provider2;
        this.f367c = provider3;
        this.f368d = provider4;
        this.f369e = provider5;
    }

    public static d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, InterfaceC4953e interfaceC4953e, x xVar, InterfaceC0753d interfaceC0753d, D6.b bVar) {
        return new c(executor, interfaceC4953e, xVar, interfaceC0753d, bVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f365a.get(), (InterfaceC4953e) this.f366b.get(), (x) this.f367c.get(), (InterfaceC0753d) this.f368d.get(), (D6.b) this.f369e.get());
    }
}
