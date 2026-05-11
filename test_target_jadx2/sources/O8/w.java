package o8;

/* loaded from: classes2.dex */
public class w implements A8.b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38031c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f38032a = f38031c;

    /* renamed from: b, reason: collision with root package name */
    private volatile A8.b f38033b;

    public w(A8.b bVar) {
        this.f38033b = bVar;
    }

    @Override // A8.b
    public Object get() {
        Object obj = this.f38032a;
        Object obj2 = f38031c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f38032a;
                    if (obj == obj2) {
                        obj = this.f38033b.get();
                        this.f38032a = obj;
                        this.f38033b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
