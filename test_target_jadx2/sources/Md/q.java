package Md;

import pc.AbstractC3868b;
import xc.C5141B;

/* loaded from: classes3.dex */
abstract /* synthetic */ class q {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5141B f6449a;

        public a(C5141B c5141b) {
            this.f6449a = c5141b;
        }

        @Override // Md.f
        public Object f(Object obj, kotlin.coroutines.d dVar) {
            this.f6449a.f44962a = obj;
            throw new Nd.a(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6450a;

        /* renamed from: b, reason: collision with root package name */
        Object f6451b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6452c;

        /* renamed from: d, reason: collision with root package name */
        int f6453d;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6452c = obj;
            this.f6453d |= Integer.MIN_VALUE;
            return g.j(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, kotlin.coroutines.d dVar) {
        b bVar;
        int i10;
        C5141B c5141b;
        Nd.a e10;
        f fVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f6453d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f6453d = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f6452c;
                Object e11 = AbstractC3868b.e();
                i10 = bVar.f6453d;
                if (i10 != 0) {
                    lc.p.b(obj);
                    C5141B c5141b2 = new C5141B();
                    f aVar = new a(c5141b2);
                    try {
                        bVar.f6450a = c5141b2;
                        bVar.f6451b = aVar;
                        bVar.f6453d = 1;
                        if (eVar.b(aVar, bVar) == e11) {
                            return e11;
                        }
                        c5141b = c5141b2;
                    } catch (Nd.a e12) {
                        c5141b = c5141b2;
                        e10 = e12;
                        fVar = aVar;
                        Nd.m.a(e10, fVar);
                        return c5141b.f44962a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (a) bVar.f6451b;
                    c5141b = (C5141B) bVar.f6450a;
                    try {
                        lc.p.b(obj);
                    } catch (Nd.a e13) {
                        e10 = e13;
                        Nd.m.a(e10, fVar);
                        return c5141b.f44962a;
                    }
                }
                return c5141b.f44962a;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f6452c;
        Object e112 = AbstractC3868b.e();
        i10 = bVar.f6453d;
        if (i10 != 0) {
        }
        return c5141b.f44962a;
    }
}
