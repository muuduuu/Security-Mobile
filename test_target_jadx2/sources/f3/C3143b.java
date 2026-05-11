package f3;

import b3.l;
import c3.AbstractC1721a;
import f3.AbstractC3142a;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3143b extends AbstractC3142a {
    private C3143b(i iVar, AbstractC3142a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    @Override // f3.AbstractC3142a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3142a clone() {
        l.i(s());
        return new C3143b(this.f32868b, this.f32869c, this.f32870d != null ? new Throwable() : null);
    }

    protected void finalize() {
        try {
            synchronized (this) {
                if (this.f32867a) {
                    super.finalize();
                    return;
                }
                Object f10 = this.f32868b.f();
                AbstractC1721a.L("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f32868b)), f10 == null ? null : f10.getClass().getName());
                AbstractC3142a.c cVar = this.f32869c;
                if (cVar != null) {
                    cVar.a(this.f32868b, this.f32870d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    C3143b(Object obj, h hVar, AbstractC3142a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }
}
