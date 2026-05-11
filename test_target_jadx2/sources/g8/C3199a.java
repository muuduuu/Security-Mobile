package g8;

/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3199a extends g {

    /* renamed from: a, reason: collision with root package name */
    static final C3199a f33573a = new C3199a();

    private C3199a() {
    }

    static g e() {
        return f33573a;
    }

    @Override // g8.g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // g8.g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
