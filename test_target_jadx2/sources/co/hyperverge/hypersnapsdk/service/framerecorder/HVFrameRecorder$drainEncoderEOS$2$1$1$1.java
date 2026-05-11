package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$drainEncoderEOS$2$1$1$1", f = "HVFrameRecorder.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$drainEncoderEOS$2$1$1$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ ByteBuffer $encodedDataBuffer;
    final /* synthetic */ MediaCodec.BufferInfo $mBufferInfo;
    final /* synthetic */ MediaMuxer $muxer;
    int label;
    final /* synthetic */ HVFrameRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$drainEncoderEOS$2$1$1$1(MediaMuxer mediaMuxer, HVFrameRecorder hVFrameRecorder, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, d<? super HVFrameRecorder$drainEncoderEOS$2$1$1$1> dVar) {
        super(2, dVar);
        this.$muxer = mediaMuxer;
        this.this$0 = hVFrameRecorder;
        this.$encodedDataBuffer = byteBuffer;
        this.$mBufferInfo = bufferInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HVFrameRecorder$drainEncoderEOS$2$1$1$1(this.$muxer, this.this$0, this.$encodedDataBuffer, this.$mBufferInfo, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$drainEncoderEOS$2$1$1$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        MediaMuxer mediaMuxer = this.$muxer;
        i10 = this.this$0.videoTrackIndex;
        mediaMuxer.writeSampleData(i10, this.$encodedDataBuffer, this.$mBufferInfo);
        return Unit.f36324a;
    }
}
