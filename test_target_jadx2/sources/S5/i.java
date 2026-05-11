package S5;

/* loaded from: classes2.dex */
public class i extends m {

    /* renamed from: l, reason: collision with root package name */
    protected final int f8760l;

    /* renamed from: m, reason: collision with root package name */
    protected D5.j f8761m;

    public i(int i10) {
        super(Object.class, n.h(), o.H(), null, 1, null, null, false);
        this.f8760l = i10;
    }

    private Object W() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }

    @Override // D5.j
    public boolean A() {
        return false;
    }

    @Override // D5.j
    public D5.j L(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return (D5.j) W();
    }

    @Override // D5.j
    public D5.j N(D5.j jVar) {
        return (D5.j) W();
    }

    @Override // D5.j
    public D5.j O(Object obj) {
        return (D5.j) W();
    }

    @Override // D5.j
    public D5.j Q() {
        return (D5.j) W();
    }

    @Override // D5.j
    public D5.j R(Object obj) {
        return (D5.j) W();
    }

    @Override // D5.j
    public D5.j S(Object obj) {
        return (D5.j) W();
    }

    @Override // S5.m
    protected String V() {
        return toString();
    }

    public D5.j X() {
        return this.f8761m;
    }

    public void Y(D5.j jVar) {
        this.f8761m = jVar;
    }

    @Override // D5.j
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // D5.j
    public StringBuilder l(StringBuilder sb2) {
        sb2.append('$');
        sb2.append(this.f8760l + 1);
        return sb2;
    }

    @Override // D5.j
    public StringBuilder n(StringBuilder sb2) {
        return l(sb2);
    }

    public String toString() {
        return l(new StringBuilder()).toString();
    }
}
