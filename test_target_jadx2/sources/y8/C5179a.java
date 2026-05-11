package y8;

import java.util.List;

/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5179a extends w {

    /* renamed from: a, reason: collision with root package name */
    private final String f45353a;

    /* renamed from: b, reason: collision with root package name */
    private final List f45354b;

    C5179a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f45353a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f45354b = list;
    }

    @Override // y8.w
    public List b() {
        return this.f45354b;
    }

    @Override // y8.w
    public String c() {
        return this.f45353a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f45353a.equals(wVar.c()) && this.f45354b.equals(wVar.b());
    }

    public int hashCode() {
        return ((this.f45353a.hashCode() ^ 1000003) * 1000003) ^ this.f45354b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f45353a + ", usedDates=" + this.f45354b + "}";
    }
}
