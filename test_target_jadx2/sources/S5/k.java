package S5;

/* loaded from: classes2.dex */
public class k extends m {

    /* renamed from: l, reason: collision with root package name */
    protected D5.j f8764l;

    public k(Class cls, n nVar) {
        super(cls, nVar, null, null, 0, null, null, false);
    }

    @Override // D5.j
    public boolean A() {
        return false;
    }

    @Override // D5.j
    public D5.j L(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return null;
    }

    public D5.j W() {
        return this.f8764l;
    }

    public void X(D5.j jVar) {
        if (this.f8764l == null) {
            this.f8764l = jVar;
            return;
        }
        throw new IllegalStateException("Trying to re-set self reference; old value = " + this.f8764l + ", new = " + jVar);
    }

    @Override // D5.j
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // S5.m, D5.j
    public n j() {
        D5.j jVar = this.f8764l;
        return jVar != null ? jVar.j() : super.j();
    }

    @Override // D5.j
    public StringBuilder l(StringBuilder sb2) {
        D5.j jVar = this.f8764l;
        return jVar != null ? jVar.l(sb2) : sb2;
    }

    @Override // D5.j
    public StringBuilder n(StringBuilder sb2) {
        D5.j jVar = this.f8764l;
        if (jVar != null) {
            return jVar.l(sb2);
        }
        sb2.append("?");
        return sb2;
    }

    @Override // S5.m, D5.j
    public D5.j s() {
        D5.j jVar = this.f8764l;
        return jVar != null ? jVar.s() : super.s();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[recursive type; ");
        D5.j jVar = this.f8764l;
        if (jVar == null) {
            sb2.append("UNRESOLVED");
        } else {
            sb2.append(jVar.q().getName());
        }
        return sb2.toString();
    }

    @Override // D5.j
    public D5.j Q() {
        return this;
    }

    @Override // D5.j
    public D5.j N(D5.j jVar) {
        return this;
    }

    @Override // D5.j
    public D5.j O(Object obj) {
        return this;
    }

    @Override // D5.j
    public D5.j R(Object obj) {
        return this;
    }

    @Override // D5.j
    public D5.j S(Object obj) {
        return this;
    }
}
