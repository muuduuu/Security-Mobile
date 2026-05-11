package v6;

import android.content.Context;
import javax.inject.Provider;
import w6.InterfaceC5040b;

/* renamed from: v6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4958j implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f43985a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f43986b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f43987c;

    public C4958j(Provider provider, Provider provider2, Provider provider3) {
        this.f43985a = provider;
        this.f43986b = provider2;
        this.f43987c = provider3;
    }

    public static C4958j a(Provider provider, Provider provider2, Provider provider3) {
        return new C4958j(provider, provider2, provider3);
    }

    public static C4957i c(Context context, E6.a aVar, E6.a aVar2) {
        return new C4957i(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4957i get() {
        return c((Context) this.f43985a.get(), (E6.a) this.f43986b.get(), (E6.a) this.f43987c.get());
    }
}
