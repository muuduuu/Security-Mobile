package f3;

import c3.AbstractC1721a;
import f3.AbstractC3142a;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3144c extends AbstractC3142a {
    C3144c(Object obj, h hVar, AbstractC3142a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }

    protected void finalize() {
        try {
            synchronized (this) {
                if (this.f32867a) {
                    return;
                }
                Object f10 = this.f32868b.f();
                AbstractC1721a.L("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f32868b)), f10 == null ? null : f10.getClass().getName());
                this.f32868b.d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // f3.AbstractC3142a
    /* renamed from: b */
    public AbstractC3142a clone() {
        return this;
    }

    @Override // f3.AbstractC3142a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
