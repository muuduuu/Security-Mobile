package Nd;

import Od.K;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
final class x implements Md.f {

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineContext f6800a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6801b;

    /* renamed from: c, reason: collision with root package name */
    private final Function2 f6802c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f6803a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Md.f f6805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Md.f fVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f6805c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f6805c, dVar);
            aVar.f6804b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6803a;
            if (i10 == 0) {
                lc.p.b(obj);
                Object obj2 = this.f6804b;
                Md.f fVar = this.f6805c;
                this.f6803a = 1;
                if (fVar.f(obj2, this) == e10) {
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

    public x(Md.f fVar, CoroutineContext coroutineContext) {
        this.f6800a = coroutineContext;
        this.f6801b = K.g(coroutineContext);
        this.f6802c = new a(fVar, null);
    }

    @Override // Md.f
    public Object f(Object obj, kotlin.coroutines.d dVar) {
        Object b10 = f.b(this.f6800a, obj, this.f6801b, this.f6802c, dVar);
        return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
    }
}
