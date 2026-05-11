package M0;

import I0.InterfaceC0843i;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public final class d implements InterfaceC0843i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0843i f5963a;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f5964a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f5965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f5966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f5966c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f5966c, dVar);
            aVar.f5965b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, kotlin.coroutines.d dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f5964a;
            if (i10 == 0) {
                p.b(obj);
                f fVar = (f) this.f5965b;
                Function2 function2 = this.f5966c;
                this.f5964a = 1;
                obj = function2.invoke(fVar, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            f fVar2 = (f) obj;
            Intrinsics.e(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }
    }

    public d(InterfaceC0843i delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5963a = delegate;
    }

    @Override // I0.InterfaceC0843i
    public Object a(Function2 function2, kotlin.coroutines.d dVar) {
        return this.f5963a.a(new a(function2, null), dVar);
    }

    @Override // I0.InterfaceC0843i
    public Md.e getData() {
        return this.f5963a.getData();
    }
}
