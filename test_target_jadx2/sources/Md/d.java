package Md;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;
import xc.C5141B;

/* loaded from: classes3.dex */
final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final e f6391a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f6392b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f6393c;

    static final class a implements f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5141B f6395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f6396c;

        /* renamed from: Md.d$a$a, reason: collision with other inner class name */
        static final class C0129a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f6397a;

            /* renamed from: c, reason: collision with root package name */
            int f6399c;

            C0129a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6397a = obj;
                this.f6399c |= Integer.MIN_VALUE;
                return a.this.f(null, this);
            }
        }

        a(C5141B c5141b, f fVar) {
            this.f6395b = c5141b;
            this.f6396c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // Md.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f(Object obj, kotlin.coroutines.d dVar) {
            C0129a c0129a;
            int i10;
            if (dVar instanceof C0129a) {
                c0129a = (C0129a) dVar;
                int i11 = c0129a.f6399c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0129a.f6399c = i11 - Integer.MIN_VALUE;
                    Object obj2 = c0129a.f6397a;
                    Object e10 = AbstractC3868b.e();
                    i10 = c0129a.f6399c;
                    if (i10 != 0) {
                        lc.p.b(obj2);
                        Object invoke = d.this.f6392b.invoke(obj);
                        Object obj3 = this.f6395b.f44962a;
                        if (obj3 != Nd.p.f6786a && ((Boolean) d.this.f6393c.invoke(obj3, invoke)).booleanValue()) {
                            return Unit.f36324a;
                        }
                        this.f6395b.f44962a = invoke;
                        f fVar = this.f6396c;
                        c0129a.f6399c = 1;
                        if (fVar.f(obj, c0129a) == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lc.p.b(obj2);
                    }
                    return Unit.f36324a;
                }
            }
            c0129a = new C0129a(dVar);
            Object obj22 = c0129a.f6397a;
            Object e102 = AbstractC3868b.e();
            i10 = c0129a.f6399c;
            if (i10 != 0) {
            }
            return Unit.f36324a;
        }
    }

    public d(e eVar, Function1 function1, Function2 function2) {
        this.f6391a = eVar;
        this.f6392b = function1;
        this.f6393c = function2;
    }

    @Override // Md.e
    public Object b(f fVar, kotlin.coroutines.d dVar) {
        C5141B c5141b = new C5141B();
        c5141b.f44962a = Nd.p.f6786a;
        Object b10 = this.f6391a.b(new a(c5141b, fVar), dVar);
        return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
    }
}
