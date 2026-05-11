package S5;

/* loaded from: classes2.dex */
public abstract class d extends m {

    /* renamed from: l, reason: collision with root package name */
    protected final D5.j f8757l;

    protected d(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, jVar2.hashCode(), obj, obj2, z10);
        this.f8757l = jVar2;
    }

    @Override // D5.j
    public boolean A() {
        return true;
    }

    @Override // D5.j
    public D5.j P(D5.j jVar) {
        D5.j P10;
        D5.j P11 = super.P(jVar);
        D5.j k10 = jVar.k();
        return (k10 == null || (P10 = this.f8757l.P(k10)) == this.f8757l) ? P11 : P11.N(P10);
    }

    @Override // S5.m
    protected String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1258a.getName());
        if (this.f8757l != null && U(1)) {
            sb2.append('<');
            sb2.append(this.f8757l.d());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // D5.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1258a == dVar.f1258a && this.f8757l.equals(dVar.f8757l);
    }

    @Override // D5.j
    public D5.j k() {
        return this.f8757l;
    }

    @Override // D5.j
    public StringBuilder l(StringBuilder sb2) {
        return m.T(this.f1258a, sb2, true);
    }

    @Override // D5.j
    public StringBuilder n(StringBuilder sb2) {
        m.T(this.f1258a, sb2, false);
        sb2.append('<');
        this.f8757l.n(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // D5.j
    public boolean w() {
        return super.w() || this.f8757l.w();
    }

    @Override // D5.j
    public boolean z() {
        return true;
    }
}
