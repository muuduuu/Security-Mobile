package Od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Od.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1088p {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7340a = AtomicReferenceFieldUpdater.newUpdater(C1088p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C1088p(boolean z10) {
        this._cur$volatile = new q(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7340a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            int a10 = qVar.a(obj);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                androidx.concurrent.futures.b.a(f7340a, this, qVar, qVar.l());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7340a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f7340a, this, qVar, qVar.l());
            }
        }
    }

    public final int c() {
        return ((q) f7340a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7340a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            Object m10 = qVar.m();
            if (m10 != q.f7344h) {
                return m10;
            }
            androidx.concurrent.futures.b.a(f7340a, this, qVar, qVar.l());
        }
    }
}
