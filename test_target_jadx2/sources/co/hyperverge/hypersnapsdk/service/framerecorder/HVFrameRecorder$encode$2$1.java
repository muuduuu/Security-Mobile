package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import android.graphics.Bitmap;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import xc.z;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$encode$2$1", f = "HVFrameRecorder.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$encode$2$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ z $frameIndex;
    final /* synthetic */ Surface $surface;
    final /* synthetic */ HVFrameRecorder $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$encode$2$1(HVFrameRecorder hVFrameRecorder, Bitmap bitmap, Surface surface, z zVar, d<? super HVFrameRecorder$encode$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = hVFrameRecorder;
        this.$bitmap = bitmap;
        this.$surface = surface;
        this.$frameIndex = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HVFrameRecorder$encode$2$1(this.$this_runCatching, this.$bitmap, this.$surface, this.$frameIndex, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$encode$2$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        HVFrameRecorder hVFrameRecorder = this.$this_runCatching;
        Bitmap bitmap = this.$bitmap;
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        hVFrameRecorder.renderBitmap(bitmap, this.$surface, this.$frameIndex.f45000a);
        return Unit.f36324a;
    }
}
