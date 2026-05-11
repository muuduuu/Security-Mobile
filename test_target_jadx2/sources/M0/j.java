package M0;

import I0.InterfaceC0843i;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public abstract class j {

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f5972a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f5973b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f5974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f5974c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f5974c, dVar);
            aVar.f5973b = obj;
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
            int i10 = this.f5972a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f5973b;
                p.b(obj);
                return cVar;
            }
            p.b(obj);
            c c10 = ((f) this.f5973b).c();
            Function2 function2 = this.f5974c;
            this.f5973b = c10;
            this.f5972a = 1;
            return function2.invoke(c10, this) == e10 ? e10 : c10;
        }
    }

    public static final Object a(InterfaceC0843i interfaceC0843i, Function2 function2, kotlin.coroutines.d dVar) {
        return interfaceC0843i.a(new a(function2, null), dVar);
    }
}
