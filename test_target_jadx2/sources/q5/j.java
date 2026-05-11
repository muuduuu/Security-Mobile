package Q5;

import K5.B;
import v5.I;
import v5.L;

/* loaded from: classes2.dex */
public class j extends L {

    /* renamed from: b, reason: collision with root package name */
    protected final P5.c f8198b;

    public j(B b10, P5.c cVar) {
        this(b10.e(), cVar);
    }

    @Override // v5.I
    public boolean a(I i10) {
        if (i10.getClass() != getClass()) {
            return false;
        }
        j jVar = (j) i10;
        return jVar.e() == this.f43939a && jVar.f8198b == this.f8198b;
    }

    @Override // v5.I
    public I b(Class cls) {
        return cls == this.f43939a ? this : new j(cls, this.f8198b);
    }

    @Override // v5.I
    public Object c(Object obj) {
        try {
            return this.f8198b.k(obj);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IllegalStateException("Problem accessing property '" + this.f8198b.l() + "': " + e11.getMessage(), e11);
        }
    }

    protected j(Class cls, P5.c cVar) {
        super(cls);
        this.f8198b = cVar;
    }

    @Override // v5.I
    public I d(Object obj) {
        return this;
    }
}
