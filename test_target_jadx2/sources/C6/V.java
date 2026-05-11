package C6;

import android.content.Context;
import javax.inject.Provider;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
public final class V implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f969a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f970b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f971c;

    public V(Provider provider, Provider provider2, Provider provider3) {
        this.f969a = provider;
        this.f970b = provider2;
        this.f971c = provider3;
    }

    public static V a(Provider provider, Provider provider2, Provider provider3) {
        return new V(provider, provider2, provider3);
    }

    public static U c(Context context, String str, int i10) {
        return new U(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f969a.get(), (String) this.f970b.get(), ((Integer) this.f971c.get()).intValue());
    }
}
