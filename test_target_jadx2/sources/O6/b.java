package O6;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f7084a = 1;

    public b a(Object obj) {
        this.f7084a = (this.f7084a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f7084a;
    }

    public final b c(boolean z10) {
        this.f7084a = (this.f7084a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
