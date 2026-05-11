package S5;

import java.util.Objects;

/* loaded from: classes2.dex */
public class j extends l {

    /* renamed from: l, reason: collision with root package name */
    protected final D5.j f8762l;

    /* renamed from: m, reason: collision with root package name */
    protected final D5.j f8763m;

    protected j(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2, D5.j jVar3, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, Objects.hashCode(jVar2), obj, obj2, z10);
        this.f8762l = jVar2;
        this.f8763m = jVar3 == null ? this : jVar3;
    }

    public static j a0(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, D5.j jVar2) {
        return new j(cls, nVar, jVar, jVarArr, jVar2, null, null, null, false);
    }

    @Override // S5.l, D5.j
    public D5.j L(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return new j(cls, this.f8769h, jVar, jVarArr, this.f8762l, this.f8763m, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // S5.l, D5.j
    public D5.j N(D5.j jVar) {
        return this.f8762l == jVar ? this : new j(this.f1258a, this.f8769h, this.f8767f, this.f8768g, jVar, this.f8763m, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // S5.l, S5.m
    protected String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1258a.getName());
        if (this.f8762l != null && U(1)) {
            sb2.append('<');
            sb2.append(this.f8762l.d());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // B5.a
    public boolean b() {
        return true;
    }

    @Override // S5.l, D5.j
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public j O(Object obj) {
        return obj == this.f8762l.t() ? this : new j(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8762l.R(obj), this.f8763m, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // S5.l
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public j Q() {
        return this.f1262e ? this : new j(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8762l.Q(), this.f8763m, this.f1260c, this.f1261d, true);
    }

    @Override // S5.l
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public j R(Object obj) {
        return obj == this.f1261d ? this : new j(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8762l, this.f8763m, this.f1260c, obj, this.f1262e);
    }

    @Override // S5.l
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public j S(Object obj) {
        return obj == this.f1260c ? this : new j(this.f1258a, this.f8769h, this.f8767f, this.f8768g, this.f8762l, this.f8763m, obj, this.f1261d, this.f1262e);
    }

    @Override // S5.l, D5.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f1258a != this.f1258a) {
            return false;
        }
        return this.f8762l.equals(jVar.f8762l);
    }

    @Override // D5.j
    public D5.j k() {
        return this.f8762l;
    }

    @Override // S5.l, D5.j
    public StringBuilder l(StringBuilder sb2) {
        return m.T(this.f1258a, sb2, true);
    }

    @Override // S5.l, D5.j
    public StringBuilder n(StringBuilder sb2) {
        m.T(this.f1258a, sb2, false);
        sb2.append('<');
        StringBuilder n10 = this.f8762l.n(sb2);
        n10.append(">;");
        return n10;
    }

    @Override // D5.j, B5.a
    /* renamed from: r */
    public D5.j a() {
        return this.f8762l;
    }

    @Override // S5.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[reference type, class ");
        sb2.append(V());
        sb2.append('<');
        sb2.append(this.f8762l);
        sb2.append('>');
        sb2.append(']');
        return sb2.toString();
    }
}
