package g4;

/* loaded from: classes.dex */
public class m implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final n f33552d = d(Integer.MAX_VALUE, true, true);

    /* renamed from: a, reason: collision with root package name */
    int f33553a;

    /* renamed from: b, reason: collision with root package name */
    boolean f33554b;

    /* renamed from: c, reason: collision with root package name */
    boolean f33555c;

    private m(int i10, boolean z10, boolean z11) {
        this.f33553a = i10;
        this.f33554b = z10;
        this.f33555c = z11;
    }

    public static n d(int i10, boolean z10, boolean z11) {
        return new m(i10, z10, z11);
    }

    @Override // g4.n
    public boolean a() {
        return this.f33555c;
    }

    @Override // g4.n
    public boolean b() {
        return this.f33554b;
    }

    @Override // g4.n
    public int c() {
        return this.f33553a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f33553a == mVar.f33553a && this.f33554b == mVar.f33554b && this.f33555c == mVar.f33555c;
    }

    public int hashCode() {
        return (this.f33553a ^ (this.f33554b ? 4194304 : 0)) ^ (this.f33555c ? 8388608 : 0);
    }
}
