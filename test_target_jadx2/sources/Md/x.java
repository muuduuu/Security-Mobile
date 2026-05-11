package Md;

import Jd.InterfaceC0915w0;
import Jd.z0;
import Od.D;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
final class x extends Nd.b implements s, e, Nd.n {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6456e = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    private int f6457d;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6458a;

        /* renamed from: b, reason: collision with root package name */
        Object f6459b;

        /* renamed from: c, reason: collision with root package name */
        Object f6460c;

        /* renamed from: d, reason: collision with root package name */
        Object f6461d;

        /* renamed from: e, reason: collision with root package name */
        Object f6462e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6463f;

        /* renamed from: h, reason: collision with root package name */
        int f6465h;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6463f = obj;
            this.f6465h |= Integer.MIN_VALUE;
            return x.this.b(null, this);
        }
    }

    public x(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean n(Object obj, Object obj2) {
        int i10;
        Nd.d[] j10;
        synchronized (this) {
            Object obj3 = f6456e.get(this);
            if (obj != null && !Intrinsics.b(obj3, obj)) {
                return false;
            }
            if (Intrinsics.b(obj3, obj2)) {
                return true;
            }
            f6456e.set(this, obj2);
            int i11 = this.f6457d;
            if ((i11 & 1) != 0) {
                this.f6457d = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f6457d = i12;
            Nd.d[] j11 = j();
            Unit unit = Unit.f36324a;
            while (true) {
                z[] zVarArr = (z[]) j11;
                if (zVarArr != null) {
                    for (z zVar : zVarArr) {
                        if (zVar != null) {
                            zVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f6457d;
                    if (i10 == i12) {
                        this.f6457d = i12 + 1;
                        return true;
                    }
                    j10 = j();
                    Unit unit2 = Unit.f36324a;
                }
                j11 = j10;
                i12 = i10;
            }
        }
    }

    @Override // Md.s
    public boolean a(Object obj, Object obj2) {
        if (obj == null) {
            obj = Nd.p.f6786a;
        }
        if (obj2 == null) {
            obj2 = Nd.p.f6786a;
        }
        return n(obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d5 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // Md.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(f fVar, kotlin.coroutines.d dVar) {
        a aVar;
        Object e10;
        int i10;
        x xVar;
        z zVar;
        f fVar2;
        InterfaceC0915w0 interfaceC0915w0;
        Object obj;
        Object obj2;
        Object obj3;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f6465h;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f6465h = i11 - Integer.MIN_VALUE;
                    Object obj4 = aVar.f6463f;
                    e10 = AbstractC3868b.e();
                    i10 = aVar.f6465h;
                    if (i10 != 0) {
                        lc.p.b(obj4);
                        xVar = this;
                        zVar = (z) d();
                    } else if (i10 == 1) {
                        zVar = (z) aVar.f6460c;
                        fVar = (f) aVar.f6459b;
                        xVar = (x) aVar.f6458a;
                        lc.p.b(obj4);
                    } else if (i10 == 2) {
                        obj = aVar.f6462e;
                        interfaceC0915w0 = (InterfaceC0915w0) aVar.f6461d;
                        zVar = (z) aVar.f6460c;
                        fVar2 = (f) aVar.f6459b;
                        xVar = (x) aVar.f6458a;
                        lc.p.b(obj4);
                        if (!zVar.h()) {
                        }
                        obj2 = f6456e.get(xVar);
                        if (interfaceC0915w0 != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == Nd.p.f6786a) {
                        }
                        aVar.f6458a = xVar;
                        aVar.f6459b = fVar2;
                        aVar.f6460c = zVar;
                        aVar.f6461d = interfaceC0915w0;
                        aVar.f6462e = obj2;
                        aVar.f6465h = 2;
                        if (fVar2.f(obj3, aVar) == e10) {
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = aVar.f6462e;
                        interfaceC0915w0 = (InterfaceC0915w0) aVar.f6461d;
                        zVar = (z) aVar.f6460c;
                        fVar2 = (f) aVar.f6459b;
                        xVar = (x) aVar.f6458a;
                        lc.p.b(obj4);
                        obj2 = f6456e.get(xVar);
                        if (interfaceC0915w0 != null) {
                            z0.e(interfaceC0915w0);
                        }
                        if (obj != null || !Intrinsics.b(obj, obj2)) {
                            obj3 = obj2 == Nd.p.f6786a ? null : obj2;
                            aVar.f6458a = xVar;
                            aVar.f6459b = fVar2;
                            aVar.f6460c = zVar;
                            aVar.f6461d = interfaceC0915w0;
                            aVar.f6462e = obj2;
                            aVar.f6465h = 2;
                            if (fVar2.f(obj3, aVar) == e10) {
                                return e10;
                            }
                            obj = obj2;
                        }
                        if (!zVar.h()) {
                            aVar.f6458a = xVar;
                            aVar.f6459b = fVar2;
                            aVar.f6460c = zVar;
                            aVar.f6461d = interfaceC0915w0;
                            aVar.f6462e = obj;
                            aVar.f6465h = 3;
                            if (zVar.e(aVar) == e10) {
                                return e10;
                            }
                        }
                        obj2 = f6456e.get(xVar);
                        if (interfaceC0915w0 != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == Nd.p.f6786a) {
                        }
                        aVar.f6458a = xVar;
                        aVar.f6459b = fVar2;
                        aVar.f6460c = zVar;
                        aVar.f6461d = interfaceC0915w0;
                        aVar.f6462e = obj2;
                        aVar.f6465h = 2;
                        if (fVar2.f(obj3, aVar) == e10) {
                        }
                    }
                    fVar2 = fVar;
                    interfaceC0915w0 = (InterfaceC0915w0) aVar.getContext().a(InterfaceC0915w0.f5070O);
                    obj = null;
                    obj2 = f6456e.get(xVar);
                    if (interfaceC0915w0 != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj2 == Nd.p.f6786a) {
                    }
                    aVar.f6458a = xVar;
                    aVar.f6459b = fVar2;
                    aVar.f6460c = zVar;
                    aVar.f6461d = interfaceC0915w0;
                    aVar.f6462e = obj2;
                    aVar.f6465h = 2;
                    if (fVar2.f(obj3, aVar) == e10) {
                    }
                }
            }
            if (i10 != 0) {
            }
            fVar2 = fVar;
            interfaceC0915w0 = (InterfaceC0915w0) aVar.getContext().a(InterfaceC0915w0.f5070O);
            obj = null;
            obj2 = f6456e.get(xVar);
            if (interfaceC0915w0 != null) {
            }
            if (obj != null) {
            }
            if (obj2 == Nd.p.f6786a) {
            }
            aVar.f6458a = xVar;
            aVar.f6459b = fVar2;
            aVar.f6460c = zVar;
            aVar.f6461d = interfaceC0915w0;
            aVar.f6462e = obj2;
            aVar.f6465h = 2;
            if (fVar2.f(obj3, aVar) == e10) {
            }
        } catch (Throwable th) {
            xVar.i(zVar);
            throw th;
        }
        aVar = new a(dVar);
        Object obj42 = aVar.f6463f;
        e10 = AbstractC3868b.e();
        i10 = aVar.f6465h;
    }

    @Override // Nd.n
    public e c(CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        return y.d(this, coroutineContext, i10, aVar);
    }

    @Override // Md.r
    public boolean e(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // Md.f
    public Object f(Object obj, kotlin.coroutines.d dVar) {
        setValue(obj);
        return Unit.f36324a;
    }

    @Override // Md.s
    public Object getValue() {
        D d10 = Nd.p.f6786a;
        Object obj = f6456e.get(this);
        if (obj == d10) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nd.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public z g() {
        return new z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nd.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public z[] h(int i10) {
        return new z[i10];
    }

    @Override // Md.s
    public void setValue(Object obj) {
        if (obj == null) {
            obj = Nd.p.f6786a;
        }
        n(null, obj);
    }
}
