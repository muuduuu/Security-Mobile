package v6;

import android.content.Context;
import javax.inject.Provider;
import w6.InterfaceC5040b;

/* renamed from: v6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4960l implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f43993a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f43994b;

    public C4960l(Provider provider, Provider provider2) {
        this.f43993a = provider;
        this.f43994b = provider2;
    }

    public static C4960l a(Provider provider, Provider provider2) {
        return new C4960l(provider, provider2);
    }

    public static C4959k c(Context context, Object obj) {
        return new C4959k(context, (C4957i) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4959k get() {
        return c((Context) this.f43993a.get(), this.f43994b.get());
    }
}
