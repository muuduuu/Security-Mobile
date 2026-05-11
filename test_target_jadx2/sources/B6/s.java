package B6;

import C6.InterfaceC0752c;
import C6.InterfaceC0753d;
import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import v6.InterfaceC4953e;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class s implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f497a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f498b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f499c;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f500d;

    /* renamed from: e, reason: collision with root package name */
    private final Provider f501e;

    /* renamed from: f, reason: collision with root package name */
    private final Provider f502f;

    /* renamed from: g, reason: collision with root package name */
    private final Provider f503g;

    /* renamed from: h, reason: collision with root package name */
    private final Provider f504h;

    /* renamed from: i, reason: collision with root package name */
    private final Provider f505i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f497a = provider;
        this.f498b = provider2;
        this.f499c = provider3;
        this.f500d = provider4;
        this.f501e = provider5;
        this.f502f = provider6;
        this.f503g = provider7;
        this.f504h = provider8;
        this.f505i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, InterfaceC4953e interfaceC4953e, InterfaceC0753d interfaceC0753d, x xVar, Executor executor, D6.b bVar, E6.a aVar, E6.a aVar2, InterfaceC0752c interfaceC0752c) {
        return new r(context, interfaceC4953e, interfaceC0753d, xVar, executor, bVar, aVar, aVar2, interfaceC0752c);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f497a.get(), (InterfaceC4953e) this.f498b.get(), (InterfaceC0753d) this.f499c.get(), (x) this.f500d.get(), (Executor) this.f501e.get(), (D6.b) this.f502f.get(), (E6.a) this.f503g.get(), (E6.a) this.f504h.get(), (InterfaceC0752c) this.f505i.get());
    }
}
