package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.utils.CoroutineExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import java.nio.ByteBuffer;
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

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$drainEncoder$2", f = "HVFrameRecorder.kt", l = {500}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJd/N;", "Llc/o;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)Llc/o;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$drainEncoder$2 extends l implements Function2<N, d<? super o>, Object> {
    final /* synthetic */ MediaCodec $encoder;
    final /* synthetic */ int $frameIndex;
    final /* synthetic */ MediaCodec.BufferInfo $mBufferInfo;
    final /* synthetic */ MediaMuxer $muxer;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HVFrameRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$drainEncoder$2(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, HVFrameRecorder hVFrameRecorder, MediaMuxer mediaMuxer, int i10, d<? super HVFrameRecorder$drainEncoder$2> dVar) {
        super(2, dVar);
        this.$encoder = mediaCodec;
        this.$mBufferInfo = bufferInfo;
        this.this$0 = hVFrameRecorder;
        this.$muxer = mediaMuxer;
        this.$frameIndex = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HVFrameRecorder$drainEncoder$2 hVFrameRecorder$drainEncoder$2 = new HVFrameRecorder$drainEncoder$2(this.$encoder, this.$mBufferInfo, this.this$0, this.$muxer, this.$frameIndex, dVar);
        hVFrameRecorder$drainEncoder$2.L$0 = obj;
        return hVFrameRecorder$drainEncoder$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super o> dVar) {
        return ((HVFrameRecorder$drainEncoder$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Throwable d10;
        HVFrameRecorderData hVFrameRecorderData;
        MediaCodec mediaCodec;
        int dequeueOutputBuffer;
        Unit unit;
        long computePresentationTime;
        int i10;
        Object e10 = AbstractC3868b.e();
        int i11 = this.label;
        try {
        } catch (Throwable th) {
            o.a aVar = o.f37128b;
            b10 = o.b(p.a(th));
        }
        if (i11 == 0) {
            p.b(obj);
            mediaCodec = this.$encoder;
            MediaCodec.BufferInfo bufferInfo = this.$mBufferInfo;
            HVFrameRecorder hVFrameRecorder = this.this$0;
            MediaMuxer mediaMuxer = this.$muxer;
            int i12 = this.$frameIndex;
            o.a aVar2 = o.f37128b;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, HVFrameRecorder.TIMEOUT_USEC);
            if (dequeueOutputBuffer == -1) {
                HVLogUtils.d(HVFrameRecorder.TAG, "No output available, waiting...");
                unit = Unit.f36324a;
            } else if (dequeueOutputBuffer == -2) {
                HVLogUtils.d(HVFrameRecorder.TAG, "Output format changed, starting muxer");
                hVFrameRecorder.videoTrackIndex = mediaMuxer.addTrack(mediaCodec.getOutputFormat());
                mediaMuxer.start();
                unit = Unit.f36324a;
            } else if (dequeueOutputBuffer < 0 || dequeueOutputBuffer >= Integer.MAX_VALUE) {
                HVLogUtils.e(HVFrameRecorder.TAG, "Unexpected output buffer index: " + dequeueOutputBuffer);
                unit = Unit.f36324a;
            } else {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer != null) {
                    if ((bufferInfo.flags & 2) != 0) {
                        HVLogUtils.d(HVFrameRecorder.TAG, "Ignoring BUFFER_FLAG_CODEC_CONFIG");
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        computePresentationTime = hVFrameRecorder.computePresentationTime(i12);
                        bufferInfo.presentationTimeUs = computePresentationTime;
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        HVFrameRecorder$drainEncoder$2$1$1$1 hVFrameRecorder$drainEncoder$2$1$1$1 = new HVFrameRecorder$drainEncoder$2$1$1$1(mediaMuxer, hVFrameRecorder, outputBuffer, bufferInfo, null);
                        this.L$0 = mediaCodec;
                        this.I$0 = dequeueOutputBuffer;
                        this.label = 1;
                        if (CoroutineExtensionsKt.onIO$default(null, hVFrameRecorder$drainEncoder$2$1$1$1, this, 1, null) == e10) {
                            return e10;
                        }
                        i10 = dequeueOutputBuffer;
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    unit = Unit.f36324a;
                } else {
                    unit = null;
                }
            }
            b10 = o.b(unit);
            HVFrameRecorder hVFrameRecorder2 = this.this$0;
            int i13 = this.$frameIndex;
            d10 = o.d(b10);
            if (d10 != null) {
                HVLogUtils.e(HVFrameRecorder.TAG, "Error draining encoder: " + d10.getMessage());
                hVFrameRecorderData = hVFrameRecorder2.hvFrameRecorderData;
                hVFrameRecorderData.getErrorEvents().getDrainEncoderFailure().add(new HVFrameRecorderData.ErrorEvents.ErrorEvent(String.valueOf(i13), d10.getMessage(), StringUtils.getCurrentTimestampAsString()));
            }
            return o.a(b10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i10 = this.I$0;
        mediaCodec = (MediaCodec) this.L$0;
        p.b(obj);
        dequeueOutputBuffer = i10;
        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
        unit = Unit.f36324a;
        b10 = o.b(unit);
        HVFrameRecorder hVFrameRecorder22 = this.this$0;
        int i132 = this.$frameIndex;
        d10 = o.d(b10);
        if (d10 != null) {
        }
        return o.a(b10);
    }
}
