package g8;

/* loaded from: classes2.dex */
final class i extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f33582a;

    i(Object obj) {
        this.f33582a = obj;
    }

    @Override // g8.g
    public Object b() {
        return this.f33582a;
    }

    @Override // g8.g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f33582a.equals(((i) obj).f33582a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33582a.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33582a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
