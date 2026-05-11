package Od;

import Jd.S;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Od.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1087o {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7337a = AtomicReferenceFieldUpdater.newUpdater(C1087o.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7338b = AtomicReferenceFieldUpdater.newUpdater(C1087o.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7339c = AtomicReferenceFieldUpdater.newUpdater(C1087o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.b.a(Od.C1087o.f7337a, r3, r2, ((Od.x) r4).f7355a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C1087o i() {
        while (true) {
            C1087o c1087o = (C1087o) f7338b.get(this);
            C1087o c1087o2 = c1087o;
            while (true) {
                C1087o c1087o3 = null;
                while (true) {
                    Object obj = f7337a.get(c1087o2);
                    if (obj == this) {
                        if (c1087o == c1087o2) {
                            return c1087o2;
                        }
                        if (androidx.concurrent.futures.b.a(f7338b, this, c1087o, c1087o2)) {
                            return c1087o2;
                        }
                    } else {
                        if (r()) {
                            return null;
                        }
                        if (!(obj instanceof x)) {
                            Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                            c1087o3 = c1087o2;
                            c1087o2 = (C1087o) obj;
                        } else {
                            if (c1087o3 != null) {
                                break;
                            }
                            c1087o2 = (C1087o) f7338b.get(c1087o2);
                        }
                    }
                }
                c1087o2 = c1087o3;
            }
        }
    }

    private final C1087o j(C1087o c1087o) {
        while (c1087o.r()) {
            c1087o = (C1087o) f7338b.get(c1087o);
        }
        return c1087o;
    }

    private final void k(C1087o c1087o) {
        C1087o c1087o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7338b;
        do {
            c1087o2 = (C1087o) atomicReferenceFieldUpdater.get(c1087o);
            if (l() != c1087o) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f7338b, c1087o, c1087o2, this));
        if (r()) {
            c1087o.i();
        }
    }

    private final x u() {
        x xVar = (x) f7339c.get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        f7339c.set(this, xVar2);
        return xVar2;
    }

    public final boolean e(C1087o c1087o, int i10) {
        C1087o n10;
        do {
            n10 = n();
            if (n10 instanceof C1085m) {
                return (((C1085m) n10).f7336d & i10) == 0 && n10.e(c1087o, i10);
            }
        } while (!n10.f(c1087o, this));
        return true;
    }

    public final boolean f(C1087o c1087o, C1087o c1087o2) {
        f7338b.set(c1087o, this);
        f7337a.set(c1087o, c1087o2);
        if (!androidx.concurrent.futures.b.a(f7337a, this, c1087o2, c1087o)) {
            return false;
        }
        c1087o.k(c1087o2);
        return true;
    }

    public final boolean g(C1087o c1087o) {
        f7338b.set(c1087o, this);
        f7337a.set(c1087o, this);
        while (l() == this) {
            if (androidx.concurrent.futures.b.a(f7337a, this, this, c1087o)) {
                c1087o.k(this);
                return true;
            }
        }
        return false;
    }

    public final void h(int i10) {
        e(new C1085m(i10), i10);
    }

    public final Object l() {
        return f7337a.get(this);
    }

    public final C1087o m() {
        C1087o c1087o;
        Object l10 = l();
        x xVar = l10 instanceof x ? (x) l10 : null;
        if (xVar != null && (c1087o = xVar.f7355a) != null) {
            return c1087o;
        }
        Intrinsics.e(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C1087o) l10;
    }

    public final C1087o n() {
        C1087o i10 = i();
        return i10 == null ? j((C1087o) f7338b.get(this)) : i10;
    }

    public boolean r() {
        return l() instanceof x;
    }

    public boolean s() {
        return t() == null;
    }

    public final C1087o t() {
        Object l10;
        C1087o c1087o;
        do {
            l10 = l();
            if (l10 instanceof x) {
                return ((x) l10).f7355a;
            }
            if (l10 == this) {
                return (C1087o) l10;
            }
            Intrinsics.e(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c1087o = (C1087o) l10;
        } while (!androidx.concurrent.futures.b.a(f7337a, this, l10, c1087o.u()));
        c1087o.i();
        return null;
    }

    public String toString() {
        return new xc.s(this) { // from class: Od.o.a
            @Override // kotlin.reflect.l
            public Object get() {
                return S.a(this.f44980b);
            }
        } + '@' + S.b(this);
    }
}
