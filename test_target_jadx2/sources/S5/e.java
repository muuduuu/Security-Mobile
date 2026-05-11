package S5;

/* loaded from: classes2.dex */
public final class e extends d {
    private e(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, jVar2, obj, obj2, z10);
    }

    public static e W(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2) {
        return new e(cls, nVar, jVar, jVarArr, jVar2, null, null, false);
    }

    @Override // D5.j
    public D5.j L(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return new e(cls, nVar, jVar, jVarArr, this.f8757l, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    public D5.j N(D5.j jVar) {
        return this.f8757l == jVar ? this : new e(this.f1258a, this.f8769h, this.f8767f, this.f8768g, jVar, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public e O(Object obj) {
        return new e(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8757l.R(obj), this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public e Q() {
        return this.f1262e ? this : new e(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8757l.Q(), this.f1260c, this.f1261d, true);
    }

    @Override // D5.j
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public e R(Object obj) {
        return new e(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8757l, this.f1260c, obj, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public e S(Object obj) {
        return new e(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8757l, obj, this.f1261d, this.f1262e);
    }

    public String toString() {
        return "[collection type; class " + this.f1258a.getName() + ", contains " + this.f8757l + "]";
    }
}
