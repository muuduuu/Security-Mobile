package Jd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* renamed from: Jd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0879e {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5028b = AtomicIntegerFieldUpdater.newUpdater(C0879e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    private final V[] f5029a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: Jd.e$a */
    private final class a extends B0 {

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f5030h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC0895m f5031e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC0876c0 f5032f;

        public a(InterfaceC0895m interfaceC0895m) {
            this.f5031e = interfaceC0895m;
        }

        public final InterfaceC0876c0 A() {
            InterfaceC0876c0 interfaceC0876c0 = this.f5032f;
            if (interfaceC0876c0 != null) {
                return interfaceC0876c0;
            }
            Intrinsics.v("handle");
            return null;
        }

        public final void C(b bVar) {
            f5030h.set(this, bVar);
        }

        public final void D(InterfaceC0876c0 interfaceC0876c0) {
            this.f5032f = interfaceC0876c0;
        }

        @Override // Jd.B0
        public boolean w() {
            return false;
        }

        @Override // Jd.B0
        public void x(Throwable th) {
            if (th != null) {
                Object u10 = this.f5031e.u(th);
                if (u10 != null) {
                    this.f5031e.G(u10);
                    b z10 = z();
                    if (z10 != null) {
                        z10.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C0879e.d().decrementAndGet(C0879e.this) == 0) {
                InterfaceC0895m interfaceC0895m = this.f5031e;
                V[] vArr = C0879e.this.f5029a;
                ArrayList arrayList = new ArrayList(vArr.length);
                for (V v10 : vArr) {
                    arrayList.add(v10.g());
                }
                interfaceC0895m.resumeWith(lc.o.b(arrayList));
            }
        }

        public final b z() {
            return (b) f5030h.get(this);
        }
    }

    /* renamed from: Jd.e$b */
    private final class b implements InterfaceC0893l {

        /* renamed from: a, reason: collision with root package name */
        private final a[] f5034a;

        public b(a[] aVarArr) {
            this.f5034a = aVarArr;
        }

        @Override // Jd.InterfaceC0893l
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f5034a) {
                aVar.A().a();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f5034a + ']';
        }
    }

    public C0879e(V[] vArr) {
        this.f5029a = vArr;
        this.notCompletedCount$volatile = vArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f5028b;
    }

    public final Object c(kotlin.coroutines.d dVar) {
        InterfaceC0876c0 i10;
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        int length = this.f5029a.length;
        a[] aVarArr = new a[length];
        for (int i11 = 0; i11 < length; i11++) {
            V v10 = this.f5029a[i11];
            v10.start();
            a aVar = new a(c0899o);
            i10 = A0.i(v10, false, aVar, 1, null);
            aVar.D(i10);
            Unit unit = Unit.f36324a;
            aVarArr[i11] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i12 = 0; i12 < length; i12++) {
            aVarArr[i12].C(bVar);
        }
        if (c0899o.c()) {
            bVar.b();
        } else {
            AbstractC0903q.c(c0899o, bVar);
        }
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }
}
