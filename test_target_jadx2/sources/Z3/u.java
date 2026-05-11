package Z3;

import f3.AbstractC3142a;

/* loaded from: classes.dex */
public class u implements x {

    /* renamed from: a, reason: collision with root package name */
    private final x f12419a;

    /* renamed from: b, reason: collision with root package name */
    private final z f12420b;

    public u(x xVar, z zVar) {
        this.f12419a = xVar;
        this.f12420b = zVar;
    }

    @Override // Z3.x
    public void c(Object obj) {
        this.f12419a.c(obj);
    }

    @Override // Z3.x
    public AbstractC3142a e(Object obj, AbstractC3142a abstractC3142a) {
        this.f12420b.c(obj);
        return this.f12419a.e(obj, abstractC3142a);
    }

    @Override // Z3.x
    public int f(b3.m mVar) {
        return this.f12419a.f(mVar);
    }

    @Override // Z3.x
    public boolean g(b3.m mVar) {
        return this.f12419a.g(mVar);
    }

    @Override // Z3.x
    public AbstractC3142a get(Object obj) {
        AbstractC3142a abstractC3142a = this.f12419a.get(obj);
        if (abstractC3142a == null) {
            this.f12420b.b(obj);
        } else {
            this.f12420b.a(obj);
        }
        return abstractC3142a;
    }
}
