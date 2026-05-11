package co.hyperverge.encoder.utils.extensions;

import Jd.N;
import co.hyperverge.hypersnapsdk.objects.HVError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.encoder.utils.extensions.CoroutineExtsKt$onUI$2", f = "CoroutineExts.kt", l = {HVError.INTERNAL_SERVER_ERROR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LJd/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class CoroutineExtsKt$onUI$2 extends l implements Function2 {
    final /* synthetic */ Function2 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineExtsKt$onUI$2(Function2 function2, d dVar) {
        super(2, dVar);
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CoroutineExtsKt$onUI$2 coroutineExtsKt$onUI$2 = new CoroutineExtsKt$onUI$2(this.$block, dVar);
        coroutineExtsKt$onUI$2.L$0 = obj;
        return coroutineExtsKt$onUI$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d dVar) {
        return ((CoroutineExtsKt$onUI$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
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
            p.b(obj);
        }
        return obj;
    }
}
