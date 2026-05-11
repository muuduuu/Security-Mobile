package S5;

/* loaded from: classes2.dex */
public abstract class g extends m {

    /* renamed from: l, reason: collision with root package name */
    protected final D5.j f8758l;

    /* renamed from: m, reason: collision with root package name */
    protected final D5.j f8759m;

    protected g(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2, D5.j jVar3, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, jVar2.hashCode() ^ jVar3.hashCode(), obj, obj2, z10);
        this.f8758l = jVar2;
        this.f8759m = jVar3;
    }

    @Override // D5.j
    public boolean A() {
        return true;
    }

    @Override // D5.j
    public boolean G() {
        return true;
    }

    @Override // D5.j
    public D5.j P(D5.j jVar) {
        D5.j P10;
        D5.j P11;
        D5.j P12 = super.P(jVar);
        D5.j p10 = jVar.p();
        if ((P12 instanceof g) && p10 != null && (P11 = this.f8758l.P(p10)) != this.f8758l) {
            P12 = ((g) P12).W(P11);
        }
        D5.j k10 = jVar.k();
        return (k10 == null || (P10 = this.f8759m.P(k10)) == this.f8759m) ? P12 : P12.N(P10);
    }

    @Override // S5.m
    protected String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1258a.getName());
        if (this.f8758l != null && U(2)) {
            sb2.append('<');
            sb2.append(this.f8758l.d());
            sb2.append(',');
            sb2.append(this.f8759m.d());
            sb2.append('>');
        }
        return sb2.toString();
    }

    public abstract g W(D5.j jVar);

    @Override // D5.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1258a == gVar.f1258a && this.f8758l.equals(gVar.f8758l) && this.f8759m.equals(gVar.f8759m);
    }

    @Override // D5.j
    public D5.j k() {
        return this.f8759m;
    }

    @Override // D5.j
    public StringBuilder l(StringBuilder sb2) {
        return m.T(this.f1258a, sb2, true);
    }

    @Override // D5.j
    public StringBuilder n(StringBuilder sb2) {
        m.T(this.f1258a, sb2, false);
        sb2.append('<');
        this.f8758l.n(sb2);
        this.f8759m.n(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // D5.j
    public D5.j p() {
        return this.f8758l;
    }

    @Override // D5.j
    public boolean w() {
        return super.w() || this.f8759m.w() || this.f8758l.w();
    }
}
