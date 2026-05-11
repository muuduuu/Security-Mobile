package co.hyperverge.encoder;

import Jd.N;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.encoder.HyperVideoRecorder$previewToBitmap$1$1$1$1", f = "HyperVideoRecorder.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HyperVideoRecorder$previewToBitmap$1$1$1$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ Bitmap $previewBitmap;
    int label;
    final /* synthetic */ HyperVideoRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperVideoRecorder$previewToBitmap$1$1$1$1(HyperVideoRecorder hyperVideoRecorder, Bitmap bitmap, d<? super HyperVideoRecorder$previewToBitmap$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = hyperVideoRecorder;
        this.$previewBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HyperVideoRecorder$previewToBitmap$1$1$1$1(this.this$0, this.$previewBitmap, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HyperVideoRecorder$previewToBitmap$1$1$1$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        this.this$0.queueBitmap(this.$previewBitmap);
        return Unit.f36324a;
    }
}
