package Nd;

import Jd.H;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class g extends e {

    /* renamed from: d, reason: collision with root package name */
    protected final Md.e f6758d;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f6759a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6760b;

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = g.this.new a(dVar);
            aVar.f6760b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Md.f fVar, kotlin.coroutines.d dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6759a;
            if (i10 == 0) {
                lc.p.b(obj);
                Md.f fVar = (Md.f) this.f6760b;
                g gVar = g.this;
                this.f6759a = 1;
                if (gVar.o(fVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public g(Md.e eVar, CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f6758d = eVar;
    }

    static /* synthetic */ Object l(g gVar, Md.f fVar, kotlin.coroutines.d dVar) {
        if (gVar.f6749b == -3) {
            CoroutineContext context = dVar.getContext();
            CoroutineContext k10 = H.k(context, gVar.f6748a);
            if (Intrinsics.b(k10, context)) {
                Object o10 = gVar.o(fVar, dVar);
                return o10 == AbstractC3868b.e() ? o10 : Unit.f36324a;
            }
            e.b bVar = kotlin.coroutines.e.f36370f0;
            if (Intrinsics.b(k10.a(bVar), context.a(bVar))) {
                Object n10 = gVar.n(fVar, k10, dVar);
                return n10 == AbstractC3868b.e() ? n10 : Unit.f36324a;
            }
        }
        Object b10 = super.b(fVar, dVar);
        return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
    }

    static /* synthetic */ Object m(g gVar, Ld.u uVar, kotlin.coroutines.d dVar) {
        Object o10 = gVar.o(new v(uVar), dVar);
        return o10 == AbstractC3868b.e() ? o10 : Unit.f36324a;
    }

    private final Object n(Md.f fVar, CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        Md.f d10;
        d10 = f.d(fVar, dVar.getContext());
        return f.c(coroutineContext, d10, null, new a(null), dVar, 4, null);
    }

    @Override // Nd.e, Md.e
    public Object b(Md.f fVar, kotlin.coroutines.d dVar) {
        return l(this, fVar, dVar);
    }

    @Override // Nd.e
    protected Object g(Ld.u uVar, kotlin.coroutines.d dVar) {
        return m(this, uVar, dVar);
    }

    protected abstract Object o(Md.f fVar, kotlin.coroutines.d dVar);

    @Override // Nd.e
    public String toString() {
        return this.f6758d + " -> " + super.toString();
    }
}
