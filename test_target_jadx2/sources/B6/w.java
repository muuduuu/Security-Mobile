package B6;

import C6.InterfaceC0753d;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class w implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f512a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f513b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f514c;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f515d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f512a = provider;
        this.f513b = provider2;
        this.f514c = provider3;
        this.f515d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, InterfaceC0753d interfaceC0753d, x xVar, D6.b bVar) {
        return new v(executor, interfaceC0753d, xVar, bVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f512a.get(), (InterfaceC0753d) this.f513b.get(), (x) this.f514c.get(), (D6.b) this.f515d.get());
    }
}
