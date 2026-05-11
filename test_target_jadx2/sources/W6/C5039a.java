package w6;

import javax.inject.Provider;

/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5039a implements Provider {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f44331c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Provider f44332a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f44333b = f44331c;

    private C5039a(Provider provider) {
        this.f44332a = provider;
    }

    public static Provider a(Provider provider) {
        AbstractC5042d.b(provider);
        return provider instanceof C5039a ? provider : new C5039a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f44331c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f44333b;
        Object obj2 = f44331c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f44333b;
                    if (obj == obj2) {
                        obj = this.f44332a.get();
                        this.f44333b = b(this.f44333b, obj);
                        this.f44332a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
