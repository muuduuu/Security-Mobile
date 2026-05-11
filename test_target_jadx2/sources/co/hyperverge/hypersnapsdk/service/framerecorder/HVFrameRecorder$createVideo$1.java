package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import Jd.V;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.view.Surface;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.service.zipper.FileZipper;
import co.hyperverge.hypersnapsdk.utils.CoroutineExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$createVideo$1", f = "HVFrameRecorder.kt", l = {198, 213, 254}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$createVideo$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC5068n $onFinish;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HVFrameRecorder this$0;

    @f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$createVideo$1$3", f = "HVFrameRecorder.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$createVideo$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends l implements Function2<N, d<? super Unit>, Object> {
        final /* synthetic */ InterfaceC5068n $onFinish;
        int label;
        final /* synthetic */ HVFrameRecorder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC5068n interfaceC5068n, HVFrameRecorder hVFrameRecorder, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$onFinish = interfaceC5068n;
            this.this$0 = hVFrameRecorder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass3(this.$onFinish, this.this$0, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            File file;
            FileZipper fileZipper;
            HVFrameRecorderData hVFrameRecorderData;
            AbstractC3868b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            InterfaceC5068n interfaceC5068n = this.$onFinish;
            file = this.this$0.videoFile;
            fileZipper = this.this$0.fileZipper;
            File framesZipFile = fileZipper != null ? fileZipper.getFramesZipFile() : null;
            hVFrameRecorderData = this.this$0.hvFrameRecorderData;
            interfaceC5068n.n(file, framesZipFile, hVFrameRecorderData);
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$createVideo$1(HVFrameRecorder hVFrameRecorder, InterfaceC5068n interfaceC5068n, d<? super HVFrameRecorder$createVideo$1> dVar) {
        super(2, dVar);
        this.this$0 = hVFrameRecorder;
        this.$onFinish = interfaceC5068n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HVFrameRecorder$createVideo$1 hVFrameRecorder$createVideo$1 = new HVFrameRecorder$createVideo$1(this.this$0, this.$onFinish, dVar);
        hVFrameRecorder$createVideo$1.L$0 = obj;
        return hVFrameRecorder$createVideo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$createVideo$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(17:12|13|14|15|16|(1:18)|19|20|21|(1:34)(1:25)|26|27|(1:29)|30|(1:32)|7|8))(3:41|42|43))(4:75|76|77|(2:79|(1:81)(1:82))(23:84|45|46|(2:65|66)|48|49|(1:62)(4:54|55|56|(1:58))|59|15|16|(0)|19|20|21|(1:23)|34|26|27|(0)|30|(0)|7|8))|44|45|46|(0)|48|49|(0)|62|59|15|16|(0)|19|20|21|(0)|34|26|27|(0)|30|(0)|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fe, code lost:
    
        r3 = lc.o.f37128b;
        r0 = lc.o.b(lc.p.a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d8, code lost:
    
        r4 = r8;
        r8 = r9;
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e2 A[Catch: all -> 0x01f1, TryCatch #0 {all -> 0x01f1, blocks: (B:21:0x01cd, B:23:0x01e2, B:25:0x01e8, B:26:0x01f4), top: B:20:0x01cd }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0257 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        HVFrameRecorder hVFrameRecorder;
        long j10;
        HVFrameRecorder hVFrameRecorder2;
        V v10;
        HVFrameRecorder hVFrameRecorder3;
        HVFrameRecorder hVFrameRecorder4;
        long j11;
        HVFrameRecorder hVFrameRecorder5;
        ?? r82;
        MediaCodec mediaCodec;
        ArrayDeque arrayDeque;
        Surface surface;
        MediaCodec.BufferInfo bufferInfo;
        MediaCodec mediaCodec2;
        MediaMuxer mediaMuxer;
        HVFrameRecorderData hVFrameRecorderData;
        Object b10;
        long j12;
        Throwable d10;
        HVFrameRecorderData hVFrameRecorderData2;
        HVFrameRecorderConfig hVFrameRecorderConfig;
        Throwable d11;
        HVFrameRecorderData hVFrameRecorderData3;
        AnonymousClass3 anonymousClass3;
        File file;
        FileZipper fileZipper;
        File framesZipFile;
        HVFrameRecorderData hVFrameRecorderData4;
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        ?? r32 = 3;
        if (i10 == 0) {
            p.b(obj);
            HVFrameRecorder hVFrameRecorder6 = this.this$0;
            currentTimeMillis = System.currentTimeMillis();
            try {
                o.a aVar = o.f37128b;
                v10 = hVFrameRecorder6.prepareEncoderDeferred;
            } catch (Throwable th) {
                th = th;
                hVFrameRecorder = hVFrameRecorder6;
                j10 = currentTimeMillis;
                hVFrameRecorder2 = hVFrameRecorder;
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th));
                j12 = j10;
                d10 = o.d(b10);
                if (d10 != null) {
                }
                hVFrameRecorder.setTimeTakenToRecord(b.c(System.currentTimeMillis() - j12));
                this.this$0.close();
                hVFrameRecorderData2 = this.this$0.hvFrameRecorderData;
                HVFrameRecorderData.RecorderData recorderData = hVFrameRecorderData2.getRecorderData();
                HVFrameRecorder hVFrameRecorder7 = this.this$0;
                recorderData.setTimeTakenToRecordMS(hVFrameRecorder7.getTimeTakenToRecord());
                recorderData.setImageProxyRotation(hVFrameRecorder7.getImageProxyRotation());
                recorderData.setOriginalBitmapWidth(hVFrameRecorder7.getOriginalBitmapWidth());
                recorderData.setOriginalBitmapHeight(hVFrameRecorder7.getOriginalBitmapHeight());
                recorderData.setNumberOfFramesRecorded(hVFrameRecorder7.getFramesToEncode());
                hVFrameRecorderConfig = hVFrameRecorder7.hvFrameRecorderConfig;
                recorderData.setNumberOfFramesToRecord(b.b(hVFrameRecorderConfig.getNumberOfFrames()));
                file = hVFrameRecorder7.videoFile;
                recorderData.setVideoSizeInBytes(b.c(file.length()));
                fileZipper = hVFrameRecorder7.fileZipper;
                recorderData.setFrameZipSizeInBytes((fileZipper != null || (framesZipFile = fileZipper.getFramesZipFile()) == null) ? null : b.c(framesZipFile.length()));
                Object b11 = o.b(Unit.f36324a);
                d11 = o.d(b11);
                if (d11 != null) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HVFrameRecorder finished recorderData: ");
                hVFrameRecorderData3 = this.this$0.hvFrameRecorderData;
                sb2.append(hVFrameRecorderData3);
                HVLogUtils.d(HVFrameRecorder.TAG, sb2.toString());
                anonymousClass3 = new AnonymousClass3(this.$onFinish, this.this$0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (CoroutineExtensionsKt.onUI$default(null, anonymousClass3, this, 1, null) == e10) {
                }
                return Unit.f36324a;
            }
            if (v10 == null) {
                hVFrameRecorder3 = hVFrameRecorder6;
                r82 = hVFrameRecorder6;
                mediaCodec = hVFrameRecorder3.encoder;
                if (mediaCodec == null) {
                    try {
                        hVFrameRecorder3.prepareEncoder();
                    } catch (Throwable th2) {
                        th = th2;
                        hVFrameRecorder = r82;
                        j10 = currentTimeMillis;
                        hVFrameRecorder2 = hVFrameRecorder3;
                        o.a aVar22 = o.f37128b;
                        b10 = o.b(p.a(th));
                        j12 = j10;
                        d10 = o.d(b10);
                        if (d10 != null) {
                        }
                        hVFrameRecorder.setTimeTakenToRecord(b.c(System.currentTimeMillis() - j12));
                        this.this$0.close();
                        hVFrameRecorderData2 = this.this$0.hvFrameRecorderData;
                        HVFrameRecorderData.RecorderData recorderData2 = hVFrameRecorderData2.getRecorderData();
                        HVFrameRecorder hVFrameRecorder72 = this.this$0;
                        recorderData2.setTimeTakenToRecordMS(hVFrameRecorder72.getTimeTakenToRecord());
                        recorderData2.setImageProxyRotation(hVFrameRecorder72.getImageProxyRotation());
                        recorderData2.setOriginalBitmapWidth(hVFrameRecorder72.getOriginalBitmapWidth());
                        recorderData2.setOriginalBitmapHeight(hVFrameRecorder72.getOriginalBitmapHeight());
                        recorderData2.setNumberOfFramesRecorded(hVFrameRecorder72.getFramesToEncode());
                        hVFrameRecorderConfig = hVFrameRecorder72.hvFrameRecorderConfig;
                        recorderData2.setNumberOfFramesToRecord(b.b(hVFrameRecorderConfig.getNumberOfFrames()));
                        file = hVFrameRecorder72.videoFile;
                        recorderData2.setVideoSizeInBytes(b.c(file.length()));
                        fileZipper = hVFrameRecorder72.fileZipper;
                        recorderData2.setFrameZipSizeInBytes((fileZipper != null || (framesZipFile = fileZipper.getFramesZipFile()) == null) ? null : b.c(framesZipFile.length()));
                        Object b112 = o.b(Unit.f36324a);
                        d11 = o.d(b112);
                        if (d11 != null) {
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append("HVFrameRecorder finished recorderData: ");
                        hVFrameRecorderData3 = this.this$0.hvFrameRecorderData;
                        sb22.append(hVFrameRecorderData3);
                        HVLogUtils.d(HVFrameRecorder.TAG, sb22.toString());
                        anonymousClass3 = new AnonymousClass3(this.$onFinish, this.this$0, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        if (CoroutineExtensionsKt.onUI$default(null, anonymousClass3, this, 1, null) == e10) {
                        }
                        return Unit.f36324a;
                    }
                }
                arrayDeque = hVFrameRecorder3.frameBuffer;
                hVFrameRecorder3.setFramesToEncode(b.b(arrayDeque.size()));
                surface = hVFrameRecorder3.surface;
                bufferInfo = hVFrameRecorder3.bufferInfo;
                mediaCodec2 = hVFrameRecorder3.encoder;
                mediaMuxer = hVFrameRecorder3.muxer;
                if (surface != null || bufferInfo == null || mediaMuxer == null || mediaCodec2 == null) {
                    HVFrameRecorder hVFrameRecorder8 = hVFrameRecorder3;
                    HVLogUtils.e(HVFrameRecorder.TAG, "createVideo failed: unable to initialize encoder or muxer");
                    hVFrameRecorderData = hVFrameRecorder8.hvFrameRecorderData;
                    hVFrameRecorderData.getErrorEvents().setCreateVideoFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, "Encoder or muxer initialization failed with surface: " + surface + ", bufferInfo: " + bufferInfo + ", encoder: " + mediaCodec2 + ", muxer: " + mediaMuxer, StringUtils.getCurrentTimestampAsString(), 1, null));
                    r32 = hVFrameRecorder8;
                } else {
                    HVFrameRecorder hVFrameRecorder9 = hVFrameRecorder3;
                    HVFrameRecorder$createVideo$1$1$1$1 hVFrameRecorder$createVideo$1$1$1$1 = new HVFrameRecorder$createVideo$1$1$1$1(hVFrameRecorder3, surface, bufferInfo, mediaCodec2, mediaMuxer, null);
                    this.L$0 = hVFrameRecorder9;
                    this.L$1 = r82;
                    this.J$0 = currentTimeMillis;
                    this.label = 2;
                    r32 = hVFrameRecorder9;
                    if (CoroutineExtensionsKt.onIO$default(null, hVFrameRecorder$createVideo$1$1$1$1, this, 1, null) == e10) {
                        return e10;
                    }
                }
                hVFrameRecorder = r82;
                r82 = currentTimeMillis;
                hVFrameRecorder2 = r32;
                j10 = r82;
                b10 = o.b(Unit.f36324a);
                j12 = j10;
                d10 = o.d(b10);
                if (d10 != null) {
                }
                hVFrameRecorder.setTimeTakenToRecord(b.c(System.currentTimeMillis() - j12));
                this.this$0.close();
                hVFrameRecorderData2 = this.this$0.hvFrameRecorderData;
                HVFrameRecorderData.RecorderData recorderData22 = hVFrameRecorderData2.getRecorderData();
                HVFrameRecorder hVFrameRecorder722 = this.this$0;
                recorderData22.setTimeTakenToRecordMS(hVFrameRecorder722.getTimeTakenToRecord());
                recorderData22.setImageProxyRotation(hVFrameRecorder722.getImageProxyRotation());
                recorderData22.setOriginalBitmapWidth(hVFrameRecorder722.getOriginalBitmapWidth());
                recorderData22.setOriginalBitmapHeight(hVFrameRecorder722.getOriginalBitmapHeight());
                recorderData22.setNumberOfFramesRecorded(hVFrameRecorder722.getFramesToEncode());
                hVFrameRecorderConfig = hVFrameRecorder722.hvFrameRecorderConfig;
                recorderData22.setNumberOfFramesToRecord(b.b(hVFrameRecorderConfig.getNumberOfFrames()));
                file = hVFrameRecorder722.videoFile;
                recorderData22.setVideoSizeInBytes(b.c(file.length()));
                fileZipper = hVFrameRecorder722.fileZipper;
                recorderData22.setFrameZipSizeInBytes((fileZipper != null || (framesZipFile = fileZipper.getFramesZipFile()) == null) ? null : b.c(framesZipFile.length()));
                Object b1122 = o.b(Unit.f36324a);
                d11 = o.d(b1122);
                if (d11 != null) {
                }
                StringBuilder sb222 = new StringBuilder();
                sb222.append("HVFrameRecorder finished recorderData: ");
                hVFrameRecorderData3 = this.this$0.hvFrameRecorderData;
                sb222.append(hVFrameRecorderData3);
                HVLogUtils.d(HVFrameRecorder.TAG, sb222.toString());
                anonymousClass3 = new AnonymousClass3(this.$onFinish, this.this$0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (CoroutineExtensionsKt.onUI$default(null, anonymousClass3, this, 1, null) == e10) {
                }
                return Unit.f36324a;
            }
            this.L$0 = hVFrameRecorder6;
            this.L$1 = hVFrameRecorder6;
            this.J$0 = currentTimeMillis;
            this.label = 1;
            if (v10.q(this) == e10) {
                return e10;
            }
            hVFrameRecorder4 = hVFrameRecorder6;
            j11 = currentTimeMillis;
            hVFrameRecorder5 = hVFrameRecorder4;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.f36324a;
                }
                j10 = this.J$0;
                hVFrameRecorder = (HVFrameRecorder) this.L$1;
                hVFrameRecorder2 = (HVFrameRecorder) this.L$0;
                try {
                    p.b(obj);
                    j10 = j10;
                    b10 = o.b(Unit.f36324a);
                    j12 = j10;
                } catch (Throwable th3) {
                    th = th3;
                    o.a aVar222 = o.f37128b;
                    b10 = o.b(p.a(th));
                    j12 = j10;
                    d10 = o.d(b10);
                    if (d10 != null) {
                    }
                    hVFrameRecorder.setTimeTakenToRecord(b.c(System.currentTimeMillis() - j12));
                    this.this$0.close();
                    hVFrameRecorderData2 = this.this$0.hvFrameRecorderData;
                    HVFrameRecorderData.RecorderData recorderData222 = hVFrameRecorderData2.getRecorderData();
                    HVFrameRecorder hVFrameRecorder7222 = this.this$0;
                    recorderData222.setTimeTakenToRecordMS(hVFrameRecorder7222.getTimeTakenToRecord());
                    recorderData222.setImageProxyRotation(hVFrameRecorder7222.getImageProxyRotation());
                    recorderData222.setOriginalBitmapWidth(hVFrameRecorder7222.getOriginalBitmapWidth());
                    recorderData222.setOriginalBitmapHeight(hVFrameRecorder7222.getOriginalBitmapHeight());
                    recorderData222.setNumberOfFramesRecorded(hVFrameRecorder7222.getFramesToEncode());
                    hVFrameRecorderConfig = hVFrameRecorder7222.hvFrameRecorderConfig;
                    recorderData222.setNumberOfFramesToRecord(b.b(hVFrameRecorderConfig.getNumberOfFrames()));
                    file = hVFrameRecorder7222.videoFile;
                    recorderData222.setVideoSizeInBytes(b.c(file.length()));
                    fileZipper = hVFrameRecorder7222.fileZipper;
                    recorderData222.setFrameZipSizeInBytes((fileZipper != null || (framesZipFile = fileZipper.getFramesZipFile()) == null) ? null : b.c(framesZipFile.length()));
                    Object b11222 = o.b(Unit.f36324a);
                    d11 = o.d(b11222);
                    if (d11 != null) {
                    }
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append("HVFrameRecorder finished recorderData: ");
                    hVFrameRecorderData3 = this.this$0.hvFrameRecorderData;
                    sb2222.append(hVFrameRecorderData3);
                    HVLogUtils.d(HVFrameRecorder.TAG, sb2222.toString());
                    anonymousClass3 = new AnonymousClass3(this.$onFinish, this.this$0, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (CoroutineExtensionsKt.onUI$default(null, anonymousClass3, this, 1, null) == e10) {
                    }
                    return Unit.f36324a;
                }
                d10 = o.d(b10);
                if (d10 != null) {
                    HVLogUtils.e(HVFrameRecorder.TAG, "createVideo failed: " + d10.getMessage());
                    hVFrameRecorderData4 = hVFrameRecorder2.hvFrameRecorderData;
                    hVFrameRecorderData4.getErrorEvents().setCreateVideoFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, d10.getMessage(), StringUtils.getCurrentTimestampAsString(), 1, null));
                }
                hVFrameRecorder.setTimeTakenToRecord(b.c(System.currentTimeMillis() - j12));
                this.this$0.close();
                hVFrameRecorderData2 = this.this$0.hvFrameRecorderData;
                HVFrameRecorderData.RecorderData recorderData2222 = hVFrameRecorderData2.getRecorderData();
                HVFrameRecorder hVFrameRecorder72222 = this.this$0;
                recorderData2222.setTimeTakenToRecordMS(hVFrameRecorder72222.getTimeTakenToRecord());
                recorderData2222.setImageProxyRotation(hVFrameRecorder72222.getImageProxyRotation());
                recorderData2222.setOriginalBitmapWidth(hVFrameRecorder72222.getOriginalBitmapWidth());
                recorderData2222.setOriginalBitmapHeight(hVFrameRecorder72222.getOriginalBitmapHeight());
                recorderData2222.setNumberOfFramesRecorded(hVFrameRecorder72222.getFramesToEncode());
                hVFrameRecorderConfig = hVFrameRecorder72222.hvFrameRecorderConfig;
                recorderData2222.setNumberOfFramesToRecord(b.b(hVFrameRecorderConfig.getNumberOfFrames()));
                file = hVFrameRecorder72222.videoFile;
                recorderData2222.setVideoSizeInBytes(b.c(file.length()));
                fileZipper = hVFrameRecorder72222.fileZipper;
                recorderData2222.setFrameZipSizeInBytes((fileZipper != null || (framesZipFile = fileZipper.getFramesZipFile()) == null) ? null : b.c(framesZipFile.length()));
                Object b112222 = o.b(Unit.f36324a);
                d11 = o.d(b112222);
                if (d11 != null) {
                    HVLogUtils.e(HVFrameRecorder.TAG, "Failed to calculate video or frame zip size: " + d11.getMessage());
                }
                StringBuilder sb22222 = new StringBuilder();
                sb22222.append("HVFrameRecorder finished recorderData: ");
                hVFrameRecorderData3 = this.this$0.hvFrameRecorderData;
                sb22222.append(hVFrameRecorderData3);
                HVLogUtils.d(HVFrameRecorder.TAG, sb22222.toString());
                anonymousClass3 = new AnonymousClass3(this.$onFinish, this.this$0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (CoroutineExtensionsKt.onUI$default(null, anonymousClass3, this, 1, null) == e10) {
                    return e10;
                }
                return Unit.f36324a;
            }
            j10 = this.J$0;
            hVFrameRecorder5 = (HVFrameRecorder) this.L$1;
            hVFrameRecorder4 = (HVFrameRecorder) this.L$0;
            try {
                p.b(obj);
                j11 = j10;
            } catch (Throwable th4) {
                th = th4;
                hVFrameRecorder = hVFrameRecorder5;
                hVFrameRecorder2 = hVFrameRecorder4;
                o.a aVar2222 = o.f37128b;
                b10 = o.b(p.a(th));
                j12 = j10;
                d10 = o.d(b10);
                if (d10 != null) {
                }
                hVFrameRecorder.setTimeTakenToRecord(b.c(System.currentTimeMillis() - j12));
                this.this$0.close();
                hVFrameRecorderData2 = this.this$0.hvFrameRecorderData;
                HVFrameRecorderData.RecorderData recorderData22222 = hVFrameRecorderData2.getRecorderData();
                HVFrameRecorder hVFrameRecorder722222 = this.this$0;
                recorderData22222.setTimeTakenToRecordMS(hVFrameRecorder722222.getTimeTakenToRecord());
                recorderData22222.setImageProxyRotation(hVFrameRecorder722222.getImageProxyRotation());
                recorderData22222.setOriginalBitmapWidth(hVFrameRecorder722222.getOriginalBitmapWidth());
                recorderData22222.setOriginalBitmapHeight(hVFrameRecorder722222.getOriginalBitmapHeight());
                recorderData22222.setNumberOfFramesRecorded(hVFrameRecorder722222.getFramesToEncode());
                hVFrameRecorderConfig = hVFrameRecorder722222.hvFrameRecorderConfig;
                recorderData22222.setNumberOfFramesToRecord(b.b(hVFrameRecorderConfig.getNumberOfFrames()));
                file = hVFrameRecorder722222.videoFile;
                recorderData22222.setVideoSizeInBytes(b.c(file.length()));
                fileZipper = hVFrameRecorder722222.fileZipper;
                recorderData22222.setFrameZipSizeInBytes((fileZipper != null || (framesZipFile = fileZipper.getFramesZipFile()) == null) ? null : b.c(framesZipFile.length()));
                Object b1122222 = o.b(Unit.f36324a);
                d11 = o.d(b1122222);
                if (d11 != null) {
                }
                StringBuilder sb222222 = new StringBuilder();
                sb222222.append("HVFrameRecorder finished recorderData: ");
                hVFrameRecorderData3 = this.this$0.hvFrameRecorderData;
                sb222222.append(hVFrameRecorderData3);
                HVLogUtils.d(HVFrameRecorder.TAG, sb222222.toString());
                anonymousClass3 = new AnonymousClass3(this.$onFinish, this.this$0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (CoroutineExtensionsKt.onUI$default(null, anonymousClass3, this, 1, null) == e10) {
                }
                return Unit.f36324a;
            }
        }
        hVFrameRecorder3 = hVFrameRecorder4;
        long j13 = j11;
        r82 = hVFrameRecorder5;
        currentTimeMillis = j13;
        mediaCodec = hVFrameRecorder3.encoder;
        if (mediaCodec == null) {
        }
        arrayDeque = hVFrameRecorder3.frameBuffer;
        hVFrameRecorder3.setFramesToEncode(b.b(arrayDeque.size()));
        surface = hVFrameRecorder3.surface;
        bufferInfo = hVFrameRecorder3.bufferInfo;
        mediaCodec2 = hVFrameRecorder3.encoder;
        mediaMuxer = hVFrameRecorder3.muxer;
        if (surface != null) {
        }
        HVFrameRecorder hVFrameRecorder82 = hVFrameRecorder3;
        HVLogUtils.e(HVFrameRecorder.TAG, "createVideo failed: unable to initialize encoder or muxer");
        hVFrameRecorderData = hVFrameRecorder82.hvFrameRecorderData;
        hVFrameRecorderData.getErrorEvents().setCreateVideoFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, "Encoder or muxer initialization failed with surface: " + surface + ", bufferInfo: " + bufferInfo + ", encoder: " + mediaCodec2 + ", muxer: " + mediaMuxer, StringUtils.getCurrentTimestampAsString(), 1, null));
        r32 = hVFrameRecorder82;
        hVFrameRecorder = r82;
        r82 = currentTimeMillis;
        hVFrameRecorder2 = r32;
        j10 = r82;
        b10 = o.b(Unit.f36324a);
        j12 = j10;
        d10 = o.d(b10);
        if (d10 != null) {
        }
        hVFrameRecorder.setTimeTakenToRecord(b.c(System.currentTimeMillis() - j12));
        this.this$0.close();
        hVFrameRecorderData2 = this.this$0.hvFrameRecorderData;
        HVFrameRecorderData.RecorderData recorderData222222 = hVFrameRecorderData2.getRecorderData();
        HVFrameRecorder hVFrameRecorder7222222 = this.this$0;
        recorderData222222.setTimeTakenToRecordMS(hVFrameRecorder7222222.getTimeTakenToRecord());
        recorderData222222.setImageProxyRotation(hVFrameRecorder7222222.getImageProxyRotation());
        recorderData222222.setOriginalBitmapWidth(hVFrameRecorder7222222.getOriginalBitmapWidth());
        recorderData222222.setOriginalBitmapHeight(hVFrameRecorder7222222.getOriginalBitmapHeight());
        recorderData222222.setNumberOfFramesRecorded(hVFrameRecorder7222222.getFramesToEncode());
        hVFrameRecorderConfig = hVFrameRecorder7222222.hvFrameRecorderConfig;
        recorderData222222.setNumberOfFramesToRecord(b.b(hVFrameRecorderConfig.getNumberOfFrames()));
        file = hVFrameRecorder7222222.videoFile;
        recorderData222222.setVideoSizeInBytes(b.c(file.length()));
        fileZipper = hVFrameRecorder7222222.fileZipper;
        recorderData222222.setFrameZipSizeInBytes((fileZipper != null || (framesZipFile = fileZipper.getFramesZipFile()) == null) ? null : b.c(framesZipFile.length()));
        Object b11222222 = o.b(Unit.f36324a);
        d11 = o.d(b11222222);
        if (d11 != null) {
        }
        StringBuilder sb2222222 = new StringBuilder();
        sb2222222.append("HVFrameRecorder finished recorderData: ");
        hVFrameRecorderData3 = this.this$0.hvFrameRecorderData;
        sb2222222.append(hVFrameRecorderData3);
        HVLogUtils.d(HVFrameRecorder.TAG, sb2222222.toString());
        anonymousClass3 = new AnonymousClass3(this.$onFinish, this.this$0, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (CoroutineExtensionsKt.onUI$default(null, anonymousClass3, this, 1, null) == e10) {
        }
        return Unit.f36324a;
    }
}
