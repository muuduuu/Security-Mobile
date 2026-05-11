package Od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Od.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1074b {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7315a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1074b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7316b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1074b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC1074b(AbstractC1074b abstractC1074b) {
        this._prev$volatile = abstractC1074b;
    }

    private final AbstractC1074b d() {
        AbstractC1074b h10 = h();
        while (h10 != null && h10.k()) {
            h10 = (AbstractC1074b) f7316b.get(h10);
        }
        return h10;
    }

    private final AbstractC1074b e() {
        AbstractC1074b f10 = f();
        Intrinsics.d(f10);
        while (f10.k()) {
            AbstractC1074b f11 = f10.f();
            if (f11 == null) {
                return f10;
            }
            f10 = f11;
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f7315a.get(this);
    }

    public final void c() {
        f7316b.set(this, null);
    }

    public final AbstractC1074b f() {
        Object g10 = g();
        if (g10 == AbstractC1073a.f7314a) {
            return null;
        }
        return (AbstractC1074b) g10;
    }

    public final AbstractC1074b h() {
        return (AbstractC1074b) f7316b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f7315a, this, null, AbstractC1073a.f7314a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC1074b d10 = d();
            AbstractC1074b e10 = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7316b;
            do {
                obj = atomicReferenceFieldUpdater.get(e10);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, e10, obj, ((AbstractC1074b) obj) == null ? null : d10));
            if (d10 != null) {
                f7315a.set(d10, e10);
            }
            if (!e10.k() || e10.l()) {
                if (d10 == null || !d10.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC1074b abstractC1074b) {
        return androidx.concurrent.futures.b.a(f7315a, this, null, abstractC1074b);
    }
}
