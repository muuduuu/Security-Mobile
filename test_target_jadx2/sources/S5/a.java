package S5;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class a extends m {

    /* renamed from: l, reason: collision with root package name */
    protected final D5.j f8749l;

    /* renamed from: m, reason: collision with root package name */
    protected final Object f8750m;

    protected a(D5.j jVar, n nVar, Object obj, Object obj2, Object obj3, boolean z10) {
        super(obj.getClass(), nVar, null, null, jVar.hashCode(), obj2, obj3, z10);
        this.f8749l = jVar;
        this.f8750m = obj;
    }

    public static a W(D5.j jVar, n nVar) {
        return X(jVar, nVar, null, null);
    }

    public static a X(D5.j jVar, n nVar, Object obj, Object obj2) {
        return new a(jVar, nVar, Array.newInstance((Class<?>) jVar.q(), 0), obj, obj2, false);
    }

    @Override // D5.j
    public boolean A() {
        return true;
    }

    @Override // D5.j
    public D5.j L(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return null;
    }

    @Override // D5.j
    public D5.j N(D5.j jVar) {
        return new a(jVar, this.f8769h, Array.newInstance((Class<?>) jVar.q(), 0), this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public a O(Object obj) {
        return obj == this.f8749l.t() ? this : new a(this.f8749l.R(obj), this.f8769h, this.f8750m, this.f1260c, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public a Q() {
        return this.f1262e ? this : new a(this.f8749l.Q(), this.f8769h, this.f8750m, this.f1260c, this.f1261d, true);
    }

    @Override // D5.j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public a R(Object obj) {
        return obj == this.f1261d ? this : new a(this.f8749l, this.f8769h, this.f8750m, this.f1260c, obj, this.f1262e);
    }

    @Override // D5.j
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public a S(Object obj) {
        return obj == this.f1260c ? this : new a(this.f8749l, this.f8769h, this.f8750m, obj, this.f1261d, this.f1262e);
    }

    @Override // D5.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            return this.f8749l.equals(((a) obj).f8749l);
        }
        return false;
    }

    @Override // D5.j
    public D5.j k() {
        return this.f8749l;
    }

    @Override // D5.j
    public StringBuilder l(StringBuilder sb2) {
        sb2.append('[');
        return this.f8749l.l(sb2);
    }

    @Override // D5.j
    public StringBuilder n(StringBuilder sb2) {
        sb2.append('[');
        return this.f8749l.n(sb2);
    }

    public String toString() {
        return "[array type, component type: " + this.f8749l + "]";
    }

    @Override // D5.j
    public boolean v() {
        return this.f8749l.v();
    }

    @Override // D5.j
    public boolean w() {
        return super.w() || this.f8749l.w();
    }

    @Override // D5.j
    public boolean y() {
        return true;
    }
}
