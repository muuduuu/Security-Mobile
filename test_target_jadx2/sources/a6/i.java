package A6;

import B6.x;
import C6.InterfaceC0753d;
import android.content.Context;
import javax.inject.Provider;
import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class i implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f371a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f372b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f373c;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f374d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f371a = provider;
        this.f372b = provider2;
        this.f373c = provider3;
        this.f374d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, InterfaceC0753d interfaceC0753d, B6.f fVar, E6.a aVar) {
        return (x) AbstractC5042d.c(h.a(context, interfaceC0753d, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f371a.get(), (InterfaceC0753d) this.f372b.get(), (B6.f) this.f373c.get(), (E6.a) this.f374d.get());
    }
}
