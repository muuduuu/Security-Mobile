package e8;

/* loaded from: classes2.dex */
public final class k implements o {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f32284c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile o f32285a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f32286b = f32284c;

    private k(o oVar) {
        this.f32285a = oVar;
    }

    public static o b(o oVar) {
        return oVar instanceof k ? oVar : new k(oVar);
    }

    @Override // e8.o
    public final Object a() {
        Object obj = this.f32286b;
        Object obj2 = f32284c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f32286b;
                    if (obj == obj2) {
                        obj = this.f32285a.a();
                        Object obj3 = this.f32286b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f32286b = obj;
                        this.f32285a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
