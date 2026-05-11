package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import android.media.MediaCodec;
import android.media.MediaMuxer;
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

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$drainEncoderEOS$2", f = "HVFrameRecorder.kt", l = {558}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$drainEncoderEOS$2 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ MediaCodec $encoder;
    final /* synthetic */ int $frameIndex;
    final /* synthetic */ MediaCodec.BufferInfo $mBufferInfo;
    final /* synthetic */ MediaMuxer $muxer;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HVFrameRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$drainEncoderEOS$2(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, HVFrameRecorder hVFrameRecorder, int i10, MediaMuxer mediaMuxer, d<? super HVFrameRecorder$drainEncoderEOS$2> dVar) {
        super(2, dVar);
        this.$encoder = mediaCodec;
        this.$mBufferInfo = bufferInfo;
        this.this$0 = hVFrameRecorder;
        this.$frameIndex = i10;
        this.$muxer = mediaMuxer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HVFrameRecorder$drainEncoderEOS$2 hVFrameRecorder$drainEncoderEOS$2 = new HVFrameRecorder$drainEncoderEOS$2(this.$encoder, this.$mBufferInfo, this.this$0, this.$frameIndex, this.$muxer, dVar);
        hVFrameRecorder$drainEncoderEOS$2.L$0 = obj;
        return hVFrameRecorder$drainEncoderEOS$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$drainEncoderEOS$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r13.size <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        r6 = r12.computePresentationTime(r5);
        r13.presentationTimeUs = r6;
        r9.position(r13.offset);
        r9.limit(r13.offset + r13.size);
        r11 = new co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$drainEncoderEOS$2$1$1$1(r2, r12, r9, r13, null);
        r18.L$0 = r14;
        r18.L$1 = r13;
        r18.L$2 = r12;
        r18.L$3 = r2;
        r18.I$0 = r5;
        r18.I$1 = r15;
        r18.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (co.hyperverge.hypersnapsdk.utils.CoroutineExtensionsKt.onIO$default(null, r11, r18, 1, null) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        r6 = r2;
        r7 = r12;
        r8 = r13;
        r9 = r14;
        r2 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:8:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:7:0x00ad). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        HVFrameRecorderData hVFrameRecorderData;
        MediaCodec mediaCodec;
        MediaCodec.BufferInfo bufferInfo;
        HVFrameRecorder hVFrameRecorder;
        int i10;
        MediaMuxer mediaMuxer;
        int dequeueOutputBuffer;
        Object e10 = AbstractC3868b.e();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                p.b(obj);
                MediaCodec mediaCodec2 = this.$encoder;
                MediaCodec.BufferInfo bufferInfo2 = this.$mBufferInfo;
                HVFrameRecorder hVFrameRecorder2 = this.this$0;
                int i12 = this.$frameIndex;
                MediaMuxer mediaMuxer2 = this.$muxer;
                o.a aVar = o.f37128b;
                mediaCodec = mediaCodec2;
                bufferInfo = bufferInfo2;
                hVFrameRecorder = hVFrameRecorder2;
                i10 = i12;
                mediaMuxer = mediaMuxer2;
                while (true) {
                    dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, HVFrameRecorder.TIMEOUT_USEC);
                    if (dequeueOutputBuffer == -1) {
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.I$1;
                i10 = this.I$0;
                MediaMuxer mediaMuxer3 = (MediaMuxer) this.L$3;
                HVFrameRecorder hVFrameRecorder3 = (HVFrameRecorder) this.L$2;
                MediaCodec.BufferInfo bufferInfo3 = (MediaCodec.BufferInfo) this.L$1;
                MediaCodec mediaCodec3 = (MediaCodec) this.L$0;
                p.b(obj);
                dequeueOutputBuffer = i13;
                mediaMuxer = mediaMuxer3;
                hVFrameRecorder = hVFrameRecorder3;
                bufferInfo = bufferInfo3;
                mediaCodec = mediaCodec3;
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    HVLogUtils.d(HVFrameRecorder.TAG, "End of stream reached");
                    return Unit.f36324a;
                }
                while (true) {
                    dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, HVFrameRecorder.TIMEOUT_USEC);
                    if (dequeueOutputBuffer == -1) {
                        HVLogUtils.d(HVFrameRecorder.TAG, "Draining encoder, waiting for EOS");
                        b10 = o.b(Unit.f36324a);
                        break;
                    }
                    if (dequeueOutputBuffer >= 0 && (r9 = mediaCodec.getOutputBuffer(dequeueOutputBuffer)) != null) {
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        HVFrameRecorder hVFrameRecorder4 = this.this$0;
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            HVLogUtils.e(HVFrameRecorder.TAG, "Error draining encoder EOS: " + d10.getMessage());
            hVFrameRecorderData = hVFrameRecorder4.hvFrameRecorderData;
            hVFrameRecorderData.getErrorEvents().getDrainEncoderFailure().add(new HVFrameRecorderData.ErrorEvents.ErrorEvent(HVFrameRecorder.EOS, d10.getMessage(), StringUtils.getCurrentTimestampAsString()));
        }
        return Unit.f36324a;
    }
}
