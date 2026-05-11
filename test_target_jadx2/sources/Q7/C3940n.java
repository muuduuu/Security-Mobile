package q7;

/* renamed from: q7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3940n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38809a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38810b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f38811c;

    C3940n(Object obj, Object obj2, Object obj3) {
        this.f38809a = obj;
        this.f38810b = obj2;
        this.f38811c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f38809a) + "=" + String.valueOf(this.f38810b) + " and " + String.valueOf(this.f38809a) + "=" + String.valueOf(this.f38811c));
    }
}
