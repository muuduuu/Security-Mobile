package P5;

import D5.z;
import K5.AbstractC0928i;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    private static final c[] f7495i = new c[0];

    /* renamed from: a, reason: collision with root package name */
    protected final D5.c f7496a;

    /* renamed from: b, reason: collision with root package name */
    protected z f7497b;

    /* renamed from: c, reason: collision with root package name */
    protected List f7498c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    protected c[] f7499d;

    /* renamed from: e, reason: collision with root package name */
    protected a f7500e;

    /* renamed from: f, reason: collision with root package name */
    protected Object f7501f;

    /* renamed from: g, reason: collision with root package name */
    protected AbstractC0928i f7502g;

    /* renamed from: h, reason: collision with root package name */
    protected Q5.i f7503h;

    public e(D5.c cVar) {
        this.f7496a = cVar;
    }

    public D5.o a() {
        c[] cVarArr;
        if (this.f7502g != null && this.f7497b.D(D5.q.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f7502g.h(this.f7497b.D(D5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        a aVar = this.f7500e;
        if (aVar != null) {
            aVar.a(this.f7497b);
        }
        List list = this.f7498c;
        if (list == null || list.isEmpty()) {
            if (this.f7500e == null && this.f7503h == null) {
                return null;
            }
            cVarArr = f7495i;
        } else {
            List list2 = this.f7498c;
            cVarArr = (c[]) list2.toArray(new c[list2.size()]);
            if (this.f7497b.D(D5.q.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (c cVar : cVarArr) {
                    cVar.j(this.f7497b);
                }
            }
        }
        c[] cVarArr2 = this.f7499d;
        if (cVarArr2 == null || cVarArr2.length == this.f7498c.size()) {
            return new d(this.f7496a.m(), this, cVarArr, this.f7499d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.f7498c.size()), Integer.valueOf(this.f7499d.length)));
    }

    public d b() {
        return d.I(this.f7496a.m(), this);
    }

    public a c() {
        return this.f7500e;
    }

    public D5.c d() {
        return this.f7496a;
    }

    public Object e() {
        return this.f7501f;
    }

    public Q5.i f() {
        return this.f7503h;
    }

    public List g() {
        return this.f7498c;
    }

    public AbstractC0928i h() {
        return this.f7502g;
    }

    public void i(a aVar) {
        this.f7500e = aVar;
    }

    protected void j(z zVar) {
        this.f7497b = zVar;
    }

    public void k(Object obj) {
        this.f7501f = obj;
    }

    public void l(c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != this.f7498c.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(cVarArr.length), Integer.valueOf(this.f7498c.size())));
        }
        this.f7499d = cVarArr;
    }

    public void m(Q5.i iVar) {
        this.f7503h = iVar;
    }

    public void n(List list) {
        this.f7498c = list;
    }

    public void o(AbstractC0928i abstractC0928i) {
        if (this.f7502g == null) {
            this.f7502g = abstractC0928i;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.f7502g + " and " + abstractC0928i);
    }
}
