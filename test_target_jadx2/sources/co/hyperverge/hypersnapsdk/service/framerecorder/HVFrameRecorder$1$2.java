package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.AbstractC0891k;
import Jd.N;
import Jd.V;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$1$2", f = "HVFrameRecorder.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$1$2 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ HVFrameRecorder $this_runCatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$1$2(HVFrameRecorder hVFrameRecorder, d<? super HVFrameRecorder$1$2> dVar) {
        super(2, dVar);
        this.$this_runCatching = hVFrameRecorder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HVFrameRecorder$1$2 hVFrameRecorder$1$2 = new HVFrameRecorder$1$2(this.$this_runCatching, dVar);
        hVFrameRecorder$1$2.L$0 = obj;
        return hVFrameRecorder$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$1$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        HVFrameRecorderData hVFrameRecorderData;
        V b11;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        N n10 = (N) this.L$0;
        HVFrameRecorder hVFrameRecorder = this.$this_runCatching;
        try {
            o.a aVar = o.f37128b;
            b11 = AbstractC0891k.b(n10, null, null, new HVFrameRecorder$1$2$1$1(hVFrameRecorder, null), 3, null);
            hVFrameRecorder.prepareEncoderDeferred = b11;
            b10 = o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        HVFrameRecorder hVFrameRecorder2 = this.$this_runCatching;
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            HVLogUtils.e(HVFrameRecorder.TAG, "Error initializing HVFrameRecorder: " + d10.getMessage());
            hVFrameRecorderData = hVFrameRecorder2.hvFrameRecorderData;
            hVFrameRecorderData.getErrorEvents().setInitFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, d10.getMessage(), StringUtils.getCurrentTimestampAsString(), 1, null));
        }
        return Unit.f36324a;
    }
}
