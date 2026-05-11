package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.InterfaceC0915w0;
import Jd.N;
import Jd.O;
import Jd.V;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.service.zipper.FileZipper;
import co.hyperverge.hypersnapsdk.utils.CoroutineExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.FileExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;
import xc.z;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 a2\u00020\u0001:\u0001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\u000eJ\u001d\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b&\u0010\fJ/\u0010,\u001a\u00020\n2 \u0010+\u001a\u001c\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n0(¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u001c\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010@R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010L\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010R\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR$\u0010U\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010M\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR$\u0010X\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010M\u001a\u0004\bY\u0010O\"\u0004\bZ\u0010QR$\u0010[\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/framerecorder/HVFrameRecorder;", BuildConfig.FLAVOR, "Lco/hyperverge/hypersnapsdk/service/framerecorder/HVFrameRecorderConfig;", "hvFrameRecorderConfig", "<init>", "(Lco/hyperverge/hypersnapsdk/service/framerecorder/HVFrameRecorderConfig;)V", "Landroid/graphics/Bitmap;", "frame", BuildConfig.FLAVOR, "rotation", BuildConfig.FLAVOR, "addFrameToBuffer", "(Landroid/graphics/Bitmap;I)V", "prepareEncoder", "()V", "Landroid/view/Surface;", "surface", "Landroid/media/MediaCodec$BufferInfo;", "mBufferInfo", "Landroid/media/MediaCodec;", "encoder", "Landroid/media/MediaMuxer;", "muxer", "encode", "(Landroid/view/Surface;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;Landroid/media/MediaMuxer;Lkotlin/coroutines/d;)Ljava/lang/Object;", "frameIndex", "drainEncoder", "(Landroid/media/MediaCodec;Landroid/media/MediaMuxer;Landroid/media/MediaCodec$BufferInfo;ILkotlin/coroutines/d;)Ljava/lang/Object;", "drainEncoderEOS", BuildConfig.FLAVOR, "computePresentationTime", "(I)J", "bitmap", "renderBitmap", "(Landroid/graphics/Bitmap;Landroid/view/Surface;I)V", "cleanUpEncoder", BuildConfig.FLAVOR, "byteArray", "pushFrame", "([BI)V", "Lkotlin/Function3;", "Ljava/io/File;", "Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData;", "onFinish", "createVideo", "(Lwc/n;)V", "close", "Lco/hyperverge/hypersnapsdk/service/framerecorder/HVFrameRecorderConfig;", "Ljava/util/ArrayDeque;", BuildConfig.FLAVOR, "frameBuffer", "Ljava/util/ArrayDeque;", "videoTrackIndex", "I", "lastFramePushTime", "J", "destinationFolder", "Ljava/io/File;", "videoFile", "framesTempDir", "Lco/hyperverge/hypersnapsdk/service/zipper/FileZipper;", "fileZipper", "Lco/hyperverge/hypersnapsdk/service/zipper/FileZipper;", "Landroid/view/Surface;", "Landroid/media/MediaCodec;", "Landroid/media/MediaMuxer;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "LJd/N;", "frameRecorderScope", "LJd/N;", "LJd/V;", "prepareEncoderDeferred", "LJd/V;", "hvFrameRecorderData", "Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData;", "originalBitmapWidth", "Ljava/lang/Integer;", "getOriginalBitmapWidth", "()Ljava/lang/Integer;", "setOriginalBitmapWidth", "(Ljava/lang/Integer;)V", "originalBitmapHeight", "getOriginalBitmapHeight", "setOriginalBitmapHeight", "imageProxyRotation", "getImageProxyRotation", "setImageProxyRotation", "framesToEncode", "getFramesToEncode", "setFramesToEncode", "timeTakenToRecord", "Ljava/lang/Long;", "getTimeTakenToRecord", "()Ljava/lang/Long;", "setTimeTakenToRecord", "(Ljava/lang/Long;)V", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HVFrameRecorder {

    @Deprecated
    public static final int BITRATE = 1000000;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EOS = "End Of Stream";

    @Deprecated
    public static final int FRAME_DURATION = 125;

    @Deprecated
    public static final int FRAME_INTERVAL = 1;

    @Deprecated
    public static final int FRAME_RATE = 8;

    @Deprecated
    public static final String MIME = "video/avc";

    @Deprecated
    public static final String TAG = "HVFrameRecorder";

    @Deprecated
    public static final long TIMEOUT_USEC = 500000;

    @Deprecated
    public static final int VIDEO_HEIGHT = 640;

    @Deprecated
    public static final int VIDEO_WIDTH = 480;
    private MediaCodec.BufferInfo bufferInfo;
    private File destinationFolder;
    private MediaCodec encoder;
    private FileZipper fileZipper;
    private ArrayDeque<String> frameBuffer;
    private final N frameRecorderScope;
    private File framesTempDir;
    private Integer framesToEncode;
    private final HVFrameRecorderConfig hvFrameRecorderConfig;
    private final HVFrameRecorderData hvFrameRecorderData;
    private Integer imageProxyRotation;
    private long lastFramePushTime;
    private MediaMuxer muxer;
    private Integer originalBitmapHeight;
    private Integer originalBitmapWidth;
    private V prepareEncoderDeferred;
    private Surface surface;
    private Long timeTakenToRecord;
    private File videoFile;
    private int videoTrackIndex;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/framerecorder/HVFrameRecorder$Companion;", BuildConfig.FLAVOR, "()V", "BITRATE", BuildConfig.FLAVOR, "EOS", BuildConfig.FLAVOR, "FRAME_DURATION", "FRAME_INTERVAL", "FRAME_RATE", "MIME", "TAG", "TIMEOUT_USEC", BuildConfig.FLAVOR, "VIDEO_HEIGHT", "VIDEO_WIDTH", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HVFrameRecorder(HVFrameRecorderConfig hvFrameRecorderConfig) {
        Object b10;
        InterfaceC0915w0 d10;
        Intrinsics.checkNotNullParameter(hvFrameRecorderConfig, "hvFrameRecorderConfig");
        this.hvFrameRecorderConfig = hvFrameRecorderConfig;
        this.frameBuffer = new ArrayDeque<>(hvFrameRecorderConfig.getNumberOfFrames());
        this.videoTrackIndex = -1;
        this.destinationFolder = new File(hvFrameRecorderConfig.getFilesDir(), "hv");
        this.videoFile = new File(this.destinationFolder, "FD_" + System.currentTimeMillis() + ".mp4");
        this.framesTempDir = new File(this.destinationFolder, "frames");
        N a10 = O.a(C0874b0.a());
        this.frameRecorderScope = a10;
        HVFrameRecorderData hVFrameRecorderData = new HVFrameRecorderData(null, null, 3, null);
        this.hvFrameRecorderData = hVFrameRecorderData;
        HVLogUtils.d(TAG, "Initializing HVFrameRecorder");
        try {
            o.a aVar = o.f37128b;
            String createDirectory = FileExtensionsKt.createDirectory(this.framesTempDir);
            if (createDirectory != null) {
                hVFrameRecorderData.getErrorEvents().setCreateDirectoriesFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, createDirectory, StringUtils.getCurrentTimestampAsString(), 1, null));
            }
            FileExtensionsKt.clearDirectory(this.framesTempDir);
            if (hvFrameRecorderConfig.getShouldSaveFrames()) {
                this.fileZipper = new FileZipper(new File(this.destinationFolder, System.currentTimeMillis() + "_frames.zip"));
            }
            d10 = AbstractC0891k.d(a10, C0874b0.a(), null, new HVFrameRecorder$1$2(this, null), 2, null);
            b10 = o.b(d10);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d11 = o.d(b10);
        if (d11 != null) {
            HVLogUtils.e(TAG, "Error initializing HVFrameRecorder: " + d11.getMessage());
            this.hvFrameRecorderData.getErrorEvents().setInitFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, d11.getMessage(), StringUtils.getCurrentTimestampAsString(), 1, null));
        }
    }

    private final void addFrameToBuffer(Bitmap frame, int rotation) {
        AbstractC0891k.d(this.frameRecorderScope, C0874b0.a(), null, new HVFrameRecorder$addFrameToBuffer$1(frame, this, rotation, null), 2, null);
    }

    private final void cleanUpEncoder() {
        HVLogUtils.d(TAG, "cleanUpEncoder() called");
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        MediaCodec mediaCodec = this.encoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        MediaCodec mediaCodec2 = this.encoder;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        MediaMuxer mediaMuxer = this.muxer;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
        }
        MediaMuxer mediaMuxer2 = this.muxer;
        if (mediaMuxer2 != null) {
            mediaMuxer2.release();
        }
        this.encoder = null;
        this.muxer = null;
        this.surface = null;
        this.bufferInfo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long computePresentationTime(int frameIndex) {
        return (frameIndex * 1000000) / 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object drainEncoder(MediaCodec mediaCodec, MediaMuxer mediaMuxer, MediaCodec.BufferInfo bufferInfo, int i10, d<? super Unit> dVar) {
        Object onDefault$default = CoroutineExtensionsKt.onDefault$default(null, new HVFrameRecorder$drainEncoder$2(mediaCodec, bufferInfo, this, mediaMuxer, i10, null), dVar, 1, null);
        return onDefault$default == AbstractC3868b.e() ? onDefault$default : Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object drainEncoderEOS(MediaCodec mediaCodec, MediaMuxer mediaMuxer, MediaCodec.BufferInfo bufferInfo, int i10, d<? super Unit> dVar) {
        Object onDefault$default = CoroutineExtensionsKt.onDefault$default(null, new HVFrameRecorder$drainEncoderEOS$2(mediaCodec, bufferInfo, this, i10, mediaMuxer, null), dVar, 1, null);
        return onDefault$default == AbstractC3868b.e() ? onDefault$default : Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(1:48)|49|(2:82|83)|51|52|53|54|55|56|57|58|(1:60)(14:61|62|63|64|65|(1:67)|30|31|32|33|(0)|36|37|(4:39|40|41|(1:43)(6:44|14|15|(0)|18|19))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:48|49|(2:82|83)|51|52|53|54|55|56|57|58|(1:60)(14:61|62|63|64|65|(1:67)|30|31|32|33|(0)|36|37|(4:39|40|41|(1:43)(6:44|14|15|(0)|18|19))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0175, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        r13 = r1;
        r14 = r2;
        r12 = r4;
        r4 = r5;
        r1 = r6;
        r11 = r8;
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0182, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0183, code lost:
    
        r6 = r11;
        r9 = r12;
        r8 = r13;
        r5 = r14;
        r2 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x015b -> B:30:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0191 -> B:32:0x0164). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object encode(Surface surface, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, MediaMuxer mediaMuxer, d<? super Unit> dVar) {
        HVFrameRecorder$encode$1 hVFrameRecorder$encode$1;
        HVFrameRecorder hVFrameRecorder;
        int i10;
        MediaCodec.BufferInfo bufferInfo2;
        MediaCodec mediaCodec2;
        MediaMuxer mediaMuxer2;
        z zVar;
        HVFrameRecorder$encode$1 hVFrameRecorder$encode$12;
        HVFrameRecorder hVFrameRecorder2;
        Surface surface2;
        char c10;
        HVFrameRecorder hVFrameRecorder3;
        Surface surface3;
        MediaCodec.BufferInfo bufferInfo3;
        MediaCodec mediaCodec3;
        MediaMuxer mediaMuxer3;
        z zVar2;
        Throwable th;
        Object b10;
        HVFrameRecorder hVFrameRecorder4;
        int i11;
        MediaMuxer mediaMuxer4;
        MediaCodec mediaCodec4;
        z zVar3;
        HVFrameRecorder hVFrameRecorder5;
        HVFrameRecorder$encode$1 hVFrameRecorder$encode$13;
        HVFrameRecorder hVFrameRecorder6;
        int i12;
        Throwable d10;
        Object b11;
        Throwable d11;
        if (dVar instanceof HVFrameRecorder$encode$1) {
            hVFrameRecorder$encode$1 = (HVFrameRecorder$encode$1) dVar;
            int i13 = hVFrameRecorder$encode$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVFrameRecorder$encode$1.label = i13 - Integer.MIN_VALUE;
                hVFrameRecorder = this;
                Object obj = hVFrameRecorder$encode$1.result;
                Object e10 = AbstractC3868b.e();
                i10 = hVFrameRecorder$encode$1.label;
                char c11 = 2;
                boolean z10 = true;
                if (i10 == 0) {
                    if (i10 == 1) {
                        HVFrameRecorder hVFrameRecorder7 = (HVFrameRecorder) hVFrameRecorder$encode$1.L$6;
                        z zVar4 = (z) hVFrameRecorder$encode$1.L$5;
                        MediaMuxer mediaMuxer5 = (MediaMuxer) hVFrameRecorder$encode$1.L$4;
                        MediaCodec mediaCodec5 = (MediaCodec) hVFrameRecorder$encode$1.L$3;
                        MediaCodec.BufferInfo bufferInfo4 = (MediaCodec.BufferInfo) hVFrameRecorder$encode$1.L$2;
                        Surface surface4 = (Surface) hVFrameRecorder$encode$1.L$1;
                        HVFrameRecorder hVFrameRecorder8 = (HVFrameRecorder) hVFrameRecorder$encode$1.L$0;
                        try {
                            p.b(obj);
                            hVFrameRecorder4 = hVFrameRecorder7;
                            zVar2 = zVar4;
                            mediaMuxer3 = mediaMuxer5;
                            mediaCodec3 = mediaCodec5;
                            bufferInfo3 = bufferInfo4;
                            surface3 = surface4;
                            hVFrameRecorder3 = hVFrameRecorder8;
                        } catch (Throwable th2) {
                            th = th2;
                            zVar2 = zVar4;
                            mediaMuxer3 = mediaMuxer5;
                            mediaCodec3 = mediaCodec5;
                            bufferInfo3 = bufferInfo4;
                            surface3 = surface4;
                            hVFrameRecorder3 = hVFrameRecorder8;
                        }
                        i11 = zVar2.f45000a;
                        hVFrameRecorder$encode$1.L$0 = hVFrameRecorder3;
                        hVFrameRecorder$encode$1.L$1 = surface3;
                        hVFrameRecorder$encode$1.L$2 = bufferInfo3;
                        hVFrameRecorder$encode$1.L$3 = mediaCodec3;
                        hVFrameRecorder$encode$1.L$4 = mediaMuxer3;
                        hVFrameRecorder$encode$1.L$5 = zVar2;
                        hVFrameRecorder$encode$1.L$6 = null;
                        c10 = 2;
                        hVFrameRecorder$encode$1.label = 2;
                        if (hVFrameRecorder4.drainEncoder(mediaCodec3, mediaMuxer3, bufferInfo3, i11, hVFrameRecorder$encode$1) == e10) {
                        }
                        b10 = o.b(Unit.f36324a);
                        HVFrameRecorder hVFrameRecorder9 = hVFrameRecorder3;
                        zVar = zVar2;
                        bufferInfo2 = bufferInfo3;
                        mediaMuxer2 = mediaMuxer3;
                        MediaCodec mediaCodec6 = mediaCodec3;
                        hVFrameRecorder$encode$12 = hVFrameRecorder$encode$1;
                        surface2 = surface3;
                        mediaCodec2 = mediaCodec6;
                        d10 = o.d(b10);
                        if (d10 != null) {
                        }
                        zVar.f45000a++;
                        z10 = true;
                        c11 = c10;
                        hVFrameRecorder2 = hVFrameRecorder9;
                        if (hVFrameRecorder2.frameBuffer.isEmpty()) {
                        }
                    } else {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            hVFrameRecorder6 = (HVFrameRecorder) hVFrameRecorder$encode$1.L$0;
                            try {
                                p.b(obj);
                                b11 = o.b(Unit.f36324a);
                            } catch (Throwable th3) {
                                th = th3;
                                o.a aVar = o.f37128b;
                                b11 = o.b(p.a(th));
                                d11 = o.d(b11);
                                if (d11 != null) {
                                }
                                return Unit.f36324a;
                            }
                            d11 = o.d(b11);
                            if (d11 != null) {
                                HVLogUtils.e(TAG, "Error draining encoder EOS: " + d11.getMessage());
                                hVFrameRecorder6.hvFrameRecorderData.getErrorEvents().getEncoderFailure().add(new HVFrameRecorderData.ErrorEvents.ErrorEvent(EOS, d11.getMessage(), StringUtils.getCurrentTimestampAsString()));
                            }
                            return Unit.f36324a;
                        }
                        zVar2 = (z) hVFrameRecorder$encode$1.L$5;
                        mediaMuxer3 = (MediaMuxer) hVFrameRecorder$encode$1.L$4;
                        mediaCodec3 = (MediaCodec) hVFrameRecorder$encode$1.L$3;
                        bufferInfo3 = (MediaCodec.BufferInfo) hVFrameRecorder$encode$1.L$2;
                        surface3 = (Surface) hVFrameRecorder$encode$1.L$1;
                        hVFrameRecorder3 = (HVFrameRecorder) hVFrameRecorder$encode$1.L$0;
                        try {
                            p.b(obj);
                            c10 = 2;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        b10 = o.b(Unit.f36324a);
                        HVFrameRecorder hVFrameRecorder92 = hVFrameRecorder3;
                        zVar = zVar2;
                        bufferInfo2 = bufferInfo3;
                        mediaMuxer2 = mediaMuxer3;
                        MediaCodec mediaCodec62 = mediaCodec3;
                        hVFrameRecorder$encode$12 = hVFrameRecorder$encode$1;
                        surface2 = surface3;
                        mediaCodec2 = mediaCodec62;
                        d10 = o.d(b10);
                        if (d10 != null) {
                            HVLogUtils.e(TAG, "Error encoding: " + d10.getMessage());
                            hVFrameRecorder92.hvFrameRecorderData.getErrorEvents().getEncoderFailure().add(new HVFrameRecorderData.ErrorEvents.ErrorEvent(String.valueOf(zVar.f45000a), d10.getMessage(), StringUtils.getCurrentTimestampAsString()));
                        }
                        zVar.f45000a++;
                        z10 = true;
                        c11 = c10;
                        hVFrameRecorder2 = hVFrameRecorder92;
                        if (hVFrameRecorder2.frameBuffer.isEmpty()) {
                            try {
                            } catch (Throwable th6) {
                                th = th6;
                                mediaMuxer4 = mediaMuxer2;
                                mediaCodec4 = mediaCodec2;
                                zVar3 = zVar;
                                hVFrameRecorder5 = hVFrameRecorder2;
                                c10 = c11;
                                hVFrameRecorder$encode$13 = hVFrameRecorder$encode$12;
                            }
                            o.a aVar2 = o.f37128b;
                            String framePath = hVFrameRecorder2.frameBuffer.removeFirst();
                            Bitmap decodeFile = BitmapFactory.decodeFile(framePath);
                            FileZipper fileZipper = hVFrameRecorder2.fileZipper;
                            if (fileZipper != null) {
                                try {
                                } catch (Throwable th7) {
                                    th = th7;
                                    mediaMuxer3 = mediaMuxer2;
                                    bufferInfo3 = bufferInfo2;
                                    zVar2 = zVar;
                                    hVFrameRecorder3 = hVFrameRecorder2;
                                    c10 = 2;
                                    MediaCodec mediaCodec7 = mediaCodec2;
                                    surface3 = surface2;
                                    hVFrameRecorder$encode$1 = hVFrameRecorder$encode$12;
                                    mediaCodec3 = mediaCodec7;
                                }
                                Intrinsics.checkNotNullExpressionValue(framePath, "framePath");
                                fileZipper.addFileToZip(framePath, "frame_" + zVar.f45000a + ".jpg", z10);
                            }
                            new File(framePath).delete();
                            hVFrameRecorder$encode$13 = hVFrameRecorder$encode$12;
                            mediaMuxer4 = mediaMuxer2;
                            mediaCodec4 = mediaCodec2;
                            z zVar5 = zVar;
                            hVFrameRecorder5 = hVFrameRecorder2;
                            HVFrameRecorder$encode$2$1 hVFrameRecorder$encode$2$1 = new HVFrameRecorder$encode$2$1(hVFrameRecorder2, decodeFile, surface2, zVar, null);
                            hVFrameRecorder$encode$13.L$0 = hVFrameRecorder5;
                            hVFrameRecorder$encode$13.L$1 = surface2;
                            hVFrameRecorder$encode$13.L$2 = bufferInfo2;
                            hVFrameRecorder$encode$13.L$3 = mediaCodec4;
                            hVFrameRecorder$encode$13.L$4 = mediaMuxer4;
                            zVar3 = zVar5;
                            hVFrameRecorder$encode$13.L$5 = zVar3;
                            hVFrameRecorder$encode$13.L$6 = hVFrameRecorder5;
                            hVFrameRecorder$encode$13.label = 1;
                            if (CoroutineExtensionsKt.onDefault$default(null, hVFrameRecorder$encode$2$1, hVFrameRecorder$encode$13, 1, null) == e10) {
                                return e10;
                            }
                            surface3 = surface2;
                            hVFrameRecorder3 = hVFrameRecorder5;
                            hVFrameRecorder4 = hVFrameRecorder3;
                            bufferInfo3 = bufferInfo2;
                            zVar2 = zVar3;
                            hVFrameRecorder$encode$1 = hVFrameRecorder$encode$13;
                            mediaCodec3 = mediaCodec4;
                            mediaMuxer3 = mediaMuxer4;
                            try {
                            } catch (Throwable th8) {
                                th = th8;
                                c10 = 2;
                            }
                            i11 = zVar2.f45000a;
                            hVFrameRecorder$encode$1.L$0 = hVFrameRecorder3;
                            hVFrameRecorder$encode$1.L$1 = surface3;
                            hVFrameRecorder$encode$1.L$2 = bufferInfo3;
                            hVFrameRecorder$encode$1.L$3 = mediaCodec3;
                            hVFrameRecorder$encode$1.L$4 = mediaMuxer3;
                            hVFrameRecorder$encode$1.L$5 = zVar2;
                            hVFrameRecorder$encode$1.L$6 = null;
                            c10 = 2;
                            hVFrameRecorder$encode$1.label = 2;
                            if (hVFrameRecorder4.drainEncoder(mediaCodec3, mediaMuxer3, bufferInfo3, i11, hVFrameRecorder$encode$1) == e10) {
                                return e10;
                            }
                            b10 = o.b(Unit.f36324a);
                            HVFrameRecorder hVFrameRecorder922 = hVFrameRecorder3;
                            zVar = zVar2;
                            bufferInfo2 = bufferInfo3;
                            mediaMuxer2 = mediaMuxer3;
                            MediaCodec mediaCodec622 = mediaCodec3;
                            hVFrameRecorder$encode$12 = hVFrameRecorder$encode$1;
                            surface2 = surface3;
                            mediaCodec2 = mediaCodec622;
                            d10 = o.d(b10);
                            if (d10 != null) {
                            }
                            zVar.f45000a++;
                            z10 = true;
                            c11 = c10;
                            hVFrameRecorder2 = hVFrameRecorder922;
                            if (hVFrameRecorder2.frameBuffer.isEmpty()) {
                                HVFrameRecorder$encode$1 hVFrameRecorder$encode$14 = hVFrameRecorder$encode$12;
                                MediaMuxer mediaMuxer6 = mediaMuxer2;
                                MediaCodec mediaCodec8 = mediaCodec2;
                                z zVar6 = zVar;
                                HVFrameRecorder hVFrameRecorder10 = hVFrameRecorder2;
                                try {
                                    o.a aVar3 = o.f37128b;
                                    mediaCodec8.signalEndOfInputStream();
                                    i12 = zVar6.f45000a;
                                    hVFrameRecorder$encode$14.L$0 = hVFrameRecorder10;
                                    hVFrameRecorder$encode$14.L$1 = null;
                                    hVFrameRecorder$encode$14.L$2 = null;
                                    hVFrameRecorder$encode$14.L$3 = null;
                                    hVFrameRecorder$encode$14.L$4 = null;
                                    hVFrameRecorder$encode$14.L$5 = null;
                                    hVFrameRecorder$encode$14.L$6 = null;
                                    hVFrameRecorder$encode$14.label = 3;
                                } catch (Throwable th9) {
                                    th = th9;
                                    hVFrameRecorder6 = hVFrameRecorder10;
                                    o.a aVar4 = o.f37128b;
                                    b11 = o.b(p.a(th));
                                    d11 = o.d(b11);
                                    if (d11 != null) {
                                    }
                                    return Unit.f36324a;
                                }
                                if (hVFrameRecorder10.drainEncoderEOS(mediaCodec8, mediaMuxer6, bufferInfo2, i12, hVFrameRecorder$encode$14) == e10) {
                                    return e10;
                                }
                                hVFrameRecorder6 = hVFrameRecorder10;
                                b11 = o.b(Unit.f36324a);
                                d11 = o.d(b11);
                                if (d11 != null) {
                                }
                                return Unit.f36324a;
                            }
                        }
                    }
                    c10 = 2;
                    o.a aVar5 = o.f37128b;
                    b10 = o.b(p.a(th));
                    HVFrameRecorder hVFrameRecorder9222 = hVFrameRecorder3;
                    zVar = zVar2;
                    bufferInfo2 = bufferInfo3;
                    mediaMuxer2 = mediaMuxer3;
                    MediaCodec mediaCodec6222 = mediaCodec3;
                    hVFrameRecorder$encode$12 = hVFrameRecorder$encode$1;
                    surface2 = surface3;
                    mediaCodec2 = mediaCodec6222;
                    d10 = o.d(b10);
                    if (d10 != null) {
                    }
                    zVar.f45000a++;
                    z10 = true;
                    c11 = c10;
                    hVFrameRecorder2 = hVFrameRecorder9222;
                    if (hVFrameRecorder2.frameBuffer.isEmpty()) {
                    }
                } else {
                    p.b(obj);
                    HVLogUtils.d(TAG, "encode() called");
                    bufferInfo2 = bufferInfo;
                    mediaCodec2 = mediaCodec;
                    mediaMuxer2 = mediaMuxer;
                    zVar = new z();
                    hVFrameRecorder$encode$12 = hVFrameRecorder$encode$1;
                    hVFrameRecorder2 = hVFrameRecorder;
                    surface2 = surface;
                    if (hVFrameRecorder2.frameBuffer.isEmpty()) {
                    }
                }
            }
        }
        hVFrameRecorder = this;
        hVFrameRecorder$encode$1 = new HVFrameRecorder$encode$1(hVFrameRecorder, dVar);
        Object obj2 = hVFrameRecorder$encode$1.result;
        Object e102 = AbstractC3868b.e();
        i10 = hVFrameRecorder$encode$1.label;
        char c112 = 2;
        boolean z102 = true;
        if (i10 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareEncoder() {
        Object b10;
        HVLogUtils.d(TAG, "Preparing encoder");
        try {
            o.a aVar = o.f37128b;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MIME, VIDEO_WIDTH, VIDEO_HEIGHT);
            createVideoFormat.setInteger("bitrate", BITRATE);
            createVideoFormat.setInteger("frame-rate", 8);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("i-frame-interval", 1);
            Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(MIME, …E_INTERVAL)\n            }");
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MIME);
            createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.surface = createEncoderByType.createInputSurface();
            createEncoderByType.start();
            this.encoder = createEncoderByType;
            this.muxer = new MediaMuxer(this.videoFile.getPath(), 0);
            this.bufferInfo = new MediaCodec.BufferInfo();
            b10 = o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            HVLogUtils.e(TAG, "Error preparing encoder: " + d10.getMessage());
            this.hvFrameRecorderData.getErrorEvents().setPrepareEncoderFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, d10.getMessage(), StringUtils.getCurrentTimestampAsString(), 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderBitmap(Bitmap bitmap, Surface surface, int frameIndex) {
        Object b10;
        try {
            o.a aVar = o.f37128b;
            Canvas lockCanvas = surface.lockCanvas(null);
            Intrinsics.checkNotNullExpressionValue(lockCanvas, "surface.lockCanvas(null)");
            lockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            surface.unlockCanvasAndPost(lockCanvas);
            bitmap.recycle();
            b10 = o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            HVLogUtils.e(TAG, "Error rendering bitmap: " + d10.getMessage());
            this.hvFrameRecorderData.getErrorEvents().getRenderBitmapFailure().add(new HVFrameRecorderData.ErrorEvents.ErrorEvent(String.valueOf(frameIndex), d10.getMessage(), StringUtils.getCurrentTimestampAsString()));
        }
    }

    public final void close() {
        Object b10;
        HVLogUtils.d(TAG, "close() called");
        try {
            o.a aVar = o.f37128b;
            cleanUpEncoder();
            FileZipper fileZipper = this.fileZipper;
            if (fileZipper != null) {
                fileZipper.closeZipStream();
            }
            this.frameBuffer.clear();
            b10 = o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            HVLogUtils.e(TAG, "close() failed: " + d10.getMessage());
            this.hvFrameRecorderData.getErrorEvents().setCloseRecorderFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, d10.getMessage(), StringUtils.getCurrentTimestampAsString(), 1, null));
        }
    }

    public final void createVideo(InterfaceC5068n onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        HVLogUtils.d(TAG, "createVideo() called");
        AbstractC0891k.d(this.frameRecorderScope, null, null, new HVFrameRecorder$createVideo$1(this, onFinish, null), 3, null);
    }

    public final Integer getFramesToEncode() {
        return this.framesToEncode;
    }

    public final Integer getImageProxyRotation() {
        return this.imageProxyRotation;
    }

    public final Integer getOriginalBitmapHeight() {
        return this.originalBitmapHeight;
    }

    public final Integer getOriginalBitmapWidth() {
        return this.originalBitmapWidth;
    }

    public final Long getTimeTakenToRecord() {
        return this.timeTakenToRecord;
    }

    public final void pushFrame(byte[] byteArray, int rotation) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastFramePushTime >= 125) {
            Bitmap frame = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            Intrinsics.checkNotNullExpressionValue(frame, "frame");
            addFrameToBuffer(frame, rotation);
            this.lastFramePushTime = currentTimeMillis;
        }
    }

    public final void setFramesToEncode(Integer num) {
        this.framesToEncode = num;
    }

    public final void setImageProxyRotation(Integer num) {
        this.imageProxyRotation = num;
    }

    public final void setOriginalBitmapHeight(Integer num) {
        this.originalBitmapHeight = num;
    }

    public final void setOriginalBitmapWidth(Integer num) {
        this.originalBitmapWidth = num;
    }

    public final void setTimeTakenToRecord(Long l10) {
        this.timeTakenToRecord = l10;
    }

    public final void pushFrame(Bitmap frame, int rotation) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastFramePushTime >= 125) {
            Bitmap.Config config = frame.getConfig();
            Bitmap copy = config != null ? frame.copy(config, true) : null;
            if (copy != null) {
                addFrameToBuffer(copy, rotation);
            }
            this.lastFramePushTime = currentTimeMillis;
        }
    }
}
