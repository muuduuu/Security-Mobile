package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$createVideo$1$1$1$1", f = "HVFrameRecorder.kt", l = {214}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$createVideo$1$1$1$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ MediaCodec.BufferInfo $localBufferInfo;
    final /* synthetic */ MediaCodec $localEncoder;
    final /* synthetic */ MediaMuxer $localMuxer;
    final /* synthetic */ Surface $localSurface;
    int label;
    final /* synthetic */ HVFrameRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$createVideo$1$1$1$1(HVFrameRecorder hVFrameRecorder, Surface surface, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, MediaMuxer mediaMuxer, d<? super HVFrameRecorder$createVideo$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = hVFrameRecorder;
        this.$localSurface = surface;
        this.$localBufferInfo = bufferInfo;
        this.$localEncoder = mediaCodec;
        this.$localMuxer = mediaMuxer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HVFrameRecorder$createVideo$1$1$1$1(this.this$0, this.$localSurface, this.$localBufferInfo, this.$localEncoder, this.$localMuxer, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$createVideo$1$1$1$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object encode;
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            HVFrameRecorder hVFrameRecorder = this.this$0;
            Surface surface = this.$localSurface;
            MediaCodec.BufferInfo bufferInfo = this.$localBufferInfo;
            MediaCodec mediaCodec = this.$localEncoder;
            MediaMuxer mediaMuxer = this.$localMuxer;
            this.label = 1;
            encode = hVFrameRecorder.encode(surface, bufferInfo, mediaCodec, mediaMuxer, this);
            if (encode == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
        }
        return Unit.f36324a;
    }
}
