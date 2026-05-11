package Ld;

import Jd.C0899o;
import Jd.H;
import Jd.InterfaceC0895m;
import Jd.InterfaceC0915w0;
import Jd.N;
import Jd.P;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lc.o;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class s {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5813a;

        /* renamed from: b, reason: collision with root package name */
        Object f5814b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f5815c;

        /* renamed from: d, reason: collision with root package name */
        int f5816d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5815c = obj;
            this.f5816d |= Integer.MIN_VALUE;
            return s.a(null, null, this);
        }
    }

    static final class b implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f5817a;

        b(InterfaceC0895m interfaceC0895m) {
            this.f5817a = interfaceC0895m;
        }

        public final void a(Throwable th) {
            InterfaceC0895m interfaceC0895m = this.f5817a;
            o.a aVar = lc.o.f37128b;
            interfaceC0895m.resumeWith(lc.o.b(Unit.f36324a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(u uVar, Function0 function0, kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f5816d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f5816d = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f5815c;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f5816d;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        if (aVar.getContext().a(InterfaceC0915w0.f5070O) != uVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        aVar.f5813a = uVar;
                        aVar.f5814b = function0;
                        aVar.f5816d = 1;
                        C0899o c0899o = new C0899o(AbstractC3868b.c(aVar), 1);
                        c0899o.F();
                        uVar.w(new b(c0899o));
                        Object y10 = c0899o.y();
                        if (y10 == AbstractC3868b.e()) {
                            kotlin.coroutines.jvm.internal.h.c(aVar);
                        }
                        if (y10 == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (Function0) aVar.f5814b;
                        lc.p.b(obj);
                    }
                    function0.invoke();
                    return Unit.f36324a;
                }
            }
            if (i10 != 0) {
            }
            function0.invoke();
            return Unit.f36324a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f5815c;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f5816d;
    }

    public static final w b(N n10, CoroutineContext coroutineContext, int i10, Ld.a aVar, P p10, Function1 function1, Function2 function2) {
        t tVar = new t(H.j(n10, coroutineContext), j.b(i10, aVar, null, 4, null));
        if (function1 != null) {
            tVar.z(function1);
        }
        tVar.U0(p10, tVar, function2);
        return tVar;
    }

    public static /* synthetic */ w c(N n10, CoroutineContext coroutineContext, int i10, Ld.a aVar, P p10, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f36372a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = Ld.a.SUSPEND;
        }
        Ld.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            p10 = P.DEFAULT;
        }
        P p11 = p10;
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        return b(n10, coroutineContext2, i12, aVar2, p11, function1, function2);
    }
}
