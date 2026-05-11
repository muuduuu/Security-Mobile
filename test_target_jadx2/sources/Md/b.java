package Md;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
final class b extends c {

    /* renamed from: e, reason: collision with root package name */
    private final Function2 f6385e;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6386a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6387b;

        /* renamed from: d, reason: collision with root package name */
        int f6389d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6387b = obj;
            this.f6389d |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    public /* synthetic */ b(Function2 function2, CoroutineContext coroutineContext, int i10, Ld.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.g.f36372a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Ld.a.SUSPEND : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Md.c, Nd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object g(Ld.u uVar, kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f6389d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f6389d = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f6387b;
                Object e10 = AbstractC3868b.e();
                i10 = aVar.f6389d;
                if (i10 != 0) {
                    lc.p.b(obj);
                    aVar.f6386a = uVar;
                    aVar.f6389d = 1;
                    if (super.g(uVar, aVar) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = (Ld.u) aVar.f6386a;
                    lc.p.b(obj);
                }
                if (uVar.E()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.f36324a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f6387b;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f6389d;
        if (i10 != 0) {
        }
        if (uVar.E()) {
        }
    }

    @Override // Nd.e
    protected Nd.e h(CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        return new b(this.f6385e, coroutineContext, i10, aVar);
    }

    public b(Function2 function2, CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        super(function2, coroutineContext, i10, aVar);
        this.f6385e = function2;
    }
}
