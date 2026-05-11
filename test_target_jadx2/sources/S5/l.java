package S5;

/* loaded from: classes2.dex */
public class l extends m {
    protected l(Class cls) {
        this(cls, n.h(), null, null);
    }

    public static l W(Class cls) {
        return new l(cls, null, null, null, null, null, false);
    }

    @Override // D5.j
    public boolean A() {
        return false;
    }

    @Override // D5.j
    public D5.j L(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return null;
    }

    @Override // D5.j
    public D5.j N(D5.j jVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // D5.j
    public D5.j O(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // S5.m
    protected String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1258a.getName());
        int n10 = this.f8769h.n();
        if (n10 > 0 && U(n10)) {
            sb2.append('<');
            for (int i10 = 0; i10 < n10; i10++) {
                D5.j f10 = f(i10);
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(f10.d());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // D5.j
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public l Q() {
        return this.f1262e ? this : new l(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f1260c, this.f1261d, true);
    }

    @Override // D5.j
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public l R(Object obj) {
        return this.f1261d == obj ? this : new l(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f1260c, obj, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public l S(Object obj) {
        return obj == this.f1260c ? this : new l(this.f1258a, this.f8769h, this.f8767f, this.f8768g, obj, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f1258a != this.f1258a) {
            return false;
        }
        return this.f8769h.equals(lVar.f8769h);
    }

    @Override // D5.j
    public StringBuilder l(StringBuilder sb2) {
        return m.T(this.f1258a, sb2, true);
    }

    @Override // D5.j
    public StringBuilder n(StringBuilder sb2) {
        m.T(this.f1258a, sb2, false);
        int n10 = this.f8769h.n();
        if (n10 > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < n10; i10++) {
                sb2 = f(i10).n(sb2);
            }
            sb2.append('>');
        }
        sb2.append(';');
        return sb2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(V());
        sb2.append(']');
        return sb2.toString();
    }

    protected l(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        this(cls, nVar, jVar, jVarArr, null, null, false);
    }

    protected l(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, 0, obj, obj2, z10);
    }

    protected l(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, i10, obj, obj2, z10);
    }
}
