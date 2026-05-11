package Sd;

import Jd.AbstractC0903q;
import Jd.C0899o;
import Jd.InterfaceC0895m;
import Jd.S;
import Jd.V0;
import Od.A;
import Od.D;
import Sd.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public class f extends i implements Sd.a {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9090i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5068n f9091h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements InterfaceC0895m, V0 {

        /* renamed from: a, reason: collision with root package name */
        public final C0899o f9092a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f9093b;

        public a(C0899o c0899o, Object obj) {
            this.f9092a = c0899o;
            this.f9093b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(f fVar, a aVar, Throwable th) {
            fVar.c(aVar.f9093b);
            return Unit.f36324a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(f fVar, a aVar, Throwable th, Unit unit, CoroutineContext coroutineContext) {
            f.w().set(fVar, aVar.f9093b);
            fVar.c(aVar.f9093b);
            return Unit.f36324a;
        }

        @Override // Jd.InterfaceC0895m
        public boolean A(Throwable th) {
            return this.f9092a.A(th);
        }

        @Override // Jd.InterfaceC0895m
        public void G(Object obj) {
            this.f9092a.G(obj);
        }

        @Override // Jd.InterfaceC0895m
        public boolean b() {
            return this.f9092a.b();
        }

        @Override // Jd.InterfaceC0895m
        public boolean c() {
            return this.f9092a.c();
        }

        @Override // Jd.V0
        public void d(A a10, int i10) {
            this.f9092a.d(a10, i10);
        }

        @Override // Jd.InterfaceC0895m
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void h(Unit unit, InterfaceC5068n interfaceC5068n) {
            f.w().set(f.this, this.f9093b);
            C0899o c0899o = this.f9092a;
            final f fVar = f.this;
            c0899o.Q(unit, new Function1() { // from class: Sd.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit g10;
                    g10 = f.a.g(f.this, this, (Throwable) obj);
                    return g10;
                }
            });
        }

        @Override // kotlin.coroutines.d
        public CoroutineContext getContext() {
            return this.f9092a.getContext();
        }

        @Override // Jd.InterfaceC0895m
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object o(Unit unit, Object obj, InterfaceC5068n interfaceC5068n) {
            final f fVar = f.this;
            Object o10 = this.f9092a.o(unit, obj, new InterfaceC5068n() { // from class: Sd.d
                @Override // wc.InterfaceC5068n
                public final Object n(Object obj2, Object obj3, Object obj4) {
                    Unit j10;
                    j10 = f.a.j(f.this, this, (Throwable) obj2, (Unit) obj3, (CoroutineContext) obj4);
                    return j10;
                }
            });
            if (o10 != null) {
                f.w().set(f.this, this.f9093b);
            }
            return o10;
        }

        @Override // Jd.InterfaceC0895m
        public boolean isCancelled() {
            return this.f9092a.isCancelled();
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
            this.f9092a.resumeWith(obj);
        }

        @Override // Jd.InterfaceC0895m
        public void s(Function1 function1) {
            this.f9092a.s(function1);
        }

        @Override // Jd.InterfaceC0895m
        public Object u(Throwable th) {
            return this.f9092a.u(th);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f9095a;
        this.f9091h = new InterfaceC5068n() { // from class: Sd.b
            @Override // wc.InterfaceC5068n
            public final Object n(Object obj, Object obj2, Object obj3) {
                InterfaceC5068n B10;
                f fVar = f.this;
                android.support.v4.media.session.b.a(obj);
                B10 = f.B(fVar, null, obj2, obj3);
                return B10;
            }
        };
    }

    private final Object A(Object obj, kotlin.coroutines.d dVar) {
        C0899o b10 = AbstractC0903q.b(AbstractC3868b.c(dVar));
        try {
            e(new a(b10, obj));
            Object y10 = b10.y();
            if (y10 == AbstractC3868b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y10 == AbstractC3868b.e() ? y10 : Unit.f36324a;
        } catch (Throwable th) {
            b10.O();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5068n B(final f fVar, Rd.a aVar, final Object obj, Object obj2) {
        return new InterfaceC5068n() { // from class: Sd.c
            @Override // wc.InterfaceC5068n
            public final Object n(Object obj3, Object obj4, Object obj5) {
                Unit C10;
                C10 = f.C(f.this, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
                return C10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(f fVar, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        fVar.c(obj);
        return Unit.f36324a;
    }

    private final int D(Object obj) {
        while (!q()) {
            if (obj == null) {
                return 1;
            }
            int x10 = x(obj);
            if (x10 == 1) {
                return 2;
            }
            if (x10 == 2) {
                return 1;
            }
        }
        f9090i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater w() {
        return f9090i;
    }

    private final int x(Object obj) {
        D d10;
        while (y()) {
            Object obj2 = f9090i.get(this);
            d10 = g.f9095a;
            if (obj2 != d10) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object z(f fVar, Object obj, kotlin.coroutines.d dVar) {
        if (fVar.a(obj)) {
            return Unit.f36324a;
        }
        Object A10 = fVar.A(obj, dVar);
        return A10 == AbstractC3868b.e() ? A10 : Unit.f36324a;
    }

    @Override // Sd.a
    public boolean a(Object obj) {
        int D10 = D(obj);
        if (D10 == 0) {
            return true;
        }
        if (D10 == 1) {
            return false;
        }
        if (D10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // Sd.a
    public Object b(Object obj, kotlin.coroutines.d dVar) {
        return z(this, obj, dVar);
    }

    @Override // Sd.a
    public void c(Object obj) {
        D d10;
        D d11;
        while (y()) {
            Object obj2 = f9090i.get(this);
            d10 = g.f9095a;
            if (obj2 != d10) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9090i;
                d11 = g.f9095a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, d11)) {
                    p();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + S.b(this) + "[isLocked=" + y() + ",owner=" + f9090i.get(this) + ']';
    }

    public boolean y() {
        return i() == 0;
    }
}
