package Md;

import kotlin.Unit;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
abstract /* synthetic */ class i {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6400a;

        /* renamed from: b, reason: collision with root package name */
        Object f6401b;

        /* renamed from: c, reason: collision with root package name */
        Object f6402c;

        /* renamed from: d, reason: collision with root package name */
        boolean f6403d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6404e;

        /* renamed from: f, reason: collision with root package name */
        int f6405f;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6404e = obj;
            this.f6405f |= Integer.MIN_VALUE;
            return i.c(null, null, false, this);
        }
    }

    public static final Object b(f fVar, Ld.w wVar, kotlin.coroutines.d dVar) {
        Object c10 = c(fVar, wVar, true, dVar);
        return c10 == AbstractC3868b.e() ? c10 : Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:19:0x0077, B:21:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f fVar, Ld.w wVar, boolean z10, kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        Ld.i it;
        Ld.i iVar;
        f fVar2;
        Object a10;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f6405f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f6405f = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f6404e;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f6405f;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        g.i(fVar);
                        it = wVar.iterator();
                        aVar.f6400a = fVar;
                        aVar.f6401b = wVar;
                        aVar.f6402c = it;
                        aVar.f6403d = z10;
                        aVar.f6405f = 1;
                        a10 = it.a(aVar);
                        if (a10 == e10) {
                        }
                    } else if (i10 == 1) {
                        z10 = aVar.f6403d;
                        iVar = (Ld.i) aVar.f6402c;
                        wVar = (Ld.w) aVar.f6401b;
                        fVar2 = (f) aVar.f6400a;
                        lc.p.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = aVar.f6403d;
                        iVar = (Ld.i) aVar.f6402c;
                        wVar = (Ld.w) aVar.f6401b;
                        fVar2 = (f) aVar.f6400a;
                        lc.p.b(obj);
                        it = iVar;
                        fVar = fVar2;
                        aVar.f6400a = fVar;
                        aVar.f6401b = wVar;
                        aVar.f6402c = it;
                        aVar.f6403d = z10;
                        aVar.f6405f = 1;
                        a10 = it.a(aVar);
                        if (a10 == e10) {
                            return e10;
                        }
                        fVar2 = fVar;
                        iVar = it;
                        obj = a10;
                        if (((Boolean) obj).booleanValue()) {
                            if (z10) {
                                Ld.n.a(wVar, null);
                            }
                            return Unit.f36324a;
                        }
                        Object next = iVar.next();
                        aVar.f6400a = fVar2;
                        aVar.f6401b = wVar;
                        aVar.f6402c = iVar;
                        aVar.f6403d = z10;
                        aVar.f6405f = 2;
                        if (fVar2.f(next, aVar) == e10) {
                            return e10;
                        }
                        it = iVar;
                        fVar = fVar2;
                        aVar.f6400a = fVar;
                        aVar.f6401b = wVar;
                        aVar.f6402c = it;
                        aVar.f6403d = z10;
                        aVar.f6405f = 1;
                        a10 = it.a(aVar);
                        if (a10 == e10) {
                        }
                    }
                }
            }
            if (i10 != 0) {
            }
        } finally {
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f6404e;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f6405f;
    }
}
