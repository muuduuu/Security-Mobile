package C6;

import android.content.Context;
import javax.inject.Provider;
import w6.AbstractC5042d;
import w6.InterfaceC5040b;

/* renamed from: C6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0757h implements InterfaceC5040b {

    /* renamed from: a, reason: collision with root package name */
    private final Provider f987a;

    public C0757h(Provider provider) {
        this.f987a = provider;
    }

    public static C0757h a(Provider provider) {
        return new C0757h(provider);
    }

    public static String c(Context context) {
        return (String) AbstractC5042d.c(AbstractC0755f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f987a.get());
    }
}
