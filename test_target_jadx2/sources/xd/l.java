package xd;

/* loaded from: classes3.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f45029a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f45030b = Thread.currentThread();

    l(Object obj) {
        this.f45029a = obj;
    }

    public Object a() {
        if (b()) {
            return this.f45029a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f45030b == Thread.currentThread();
    }
}
