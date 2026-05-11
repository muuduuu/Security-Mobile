package co.hyperverge.hypersnapsdk.utils;

import Jd.N;
import co.hyperverge.hypersnapsdk.objects.HVError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

@kotlin.coroutines.jvm.internal.f(c = "co.hyperverge.hypersnapsdk.utils.CoroutineExtensionsKt$onIO$2", f = "CoroutineExtensions.kt", l = {HVError.ENCRYPTION_ERROR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LJd/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class CoroutineExtensionsKt$onIO$2 extends kotlin.coroutines.jvm.internal.l implements Function2 {
    final /* synthetic */ Function2 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineExtensionsKt$onIO$2(Function2 function2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        CoroutineExtensionsKt$onIO$2 coroutineExtensionsKt$onIO$2 = new CoroutineExtensionsKt$onIO$2(this.$block, dVar);
        coroutineExtensionsKt$onIO$2.L$0 = obj;
        return coroutineExtensionsKt$onIO$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, kotlin.coroutines.d dVar) {
        return ((CoroutineExtensionsKt$onIO$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            lc.p.b(obj);
            N n10 = (N) this.L$0;
            Function2 function2 = this.$block;
            this.label = 1;
            obj = function2.invoke(n10, this);
            if (obj == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
        }
        return obj;
    }
}
