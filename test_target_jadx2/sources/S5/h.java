package S5;

/* loaded from: classes2.dex */
public final class h extends g {
    private h(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2, D5.j jVar3, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, jVar2, jVar3, obj, obj2, z10);
    }

    public static h X(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2, D5.j jVar3) {
        return new h(cls, nVar, jVar, jVarArr, jVar2, jVar3, null, null, false);
    }

    @Override // D5.j
    public D5.j L(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return new h(cls, nVar, jVar, jVarArr, this.f8758l, this.f8759m, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    public D5.j N(D5.j jVar) {
        return this.f8759m == jVar ? this : new h(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8758l, jVar, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public h O(Object obj) {
        return new h(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8758l, this.f8759m.R(obj), this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // S5.g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public h W(D5.j jVar) {
        return jVar == this.f8758l ? this : new h(this.f1258a, this.f8769h, this.f8767f, this.f8768g, jVar, this.f8759m, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public h Q() {
        return this.f1262e ? this : new h(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8758l.Q(), this.f8759m.Q(), this.f1260c, this.f1261d, true);
    }

    @Override // D5.j
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public h R(Object obj) {
        return new h(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8758l, this.f8759m, this.f1260c, obj, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public h S(Object obj) {
        return new h(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8758l, this.f8759m, obj, this.f1261d, this.f1262e);
    }

    public String toString() {
        return "[map type; class " + this.f1258a.getName() + ", " + this.f8758l + " -> " + this.f8759m + "]";
    }
}
