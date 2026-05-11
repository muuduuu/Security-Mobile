package co.hyperverge.encoder;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.O;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import co.hyperverge.encoder.utils.extensions.DeviceExtsKt;
import co.hyperverge.encoder.utils.extensions.LogExtsKt;
import co.hyperverge.hyperlogger.HyperLogger;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.o;
import lc.p;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0013\b\u0000\u0018\u0000 22\u00020\u0001:\u000223B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u0017\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b(J\b\u0010)\u001a\u00020\u001fH\u0002J-\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0002\b/J\r\u00100\u001a\u00020\u001fH\u0000¢\u0006\u0002\b1R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lco/hyperverge/encoder/HyperVideoEncoder;", org.conscrypt.BuildConfig.FLAVOR, "mCallback", "Lco/hyperverge/encoder/HyperVideoEncoder$HyperVideoEncoderCallback;", "(Lco/hyperverge/encoder/HyperVideoEncoder$HyperVideoEncoderCallback;)V", "isEncodingStarted", org.conscrypt.BuildConfig.FLAVOR, "isEncodingStarted$hv_bitmaps_to_video_release", "()Z", "isStarted", "mEncodeQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Landroid/graphics/Bitmap;", "mFrameSync", "mGenerateIndex", org.conscrypt.BuildConfig.FLAVOR, "mNewFrameLatch", "Ljava/util/concurrent/CountDownLatch;", "mNoMoreFrames", "mOutputFile", "Ljava/io/File;", "mTrackIndex", "mediaCodec", "Landroid/media/MediaCodec;", "mediaMuxer", "Landroid/media/MediaMuxer;", "selectedColorFormat", "computePresentationTime", org.conscrypt.BuildConfig.FLAVOR, "frameIndex", "encode", org.conscrypt.BuildConfig.FLAVOR, "getByteArray", org.conscrypt.BuildConfig.FLAVOR, "scaled", "inputWidth", "inputHeight", AppConstants.VIDEO_RECORDING_COLOR_FORMAT, "queueFrame", "bitmap", "queueFrame$hv_bitmaps_to_video_release", "release", "startEncoding", "width", "height", "outputFile", "autoColorFormatSelection", "startEncoding$hv_bitmaps_to_video_release", "stopEncoding", "stopEncoding$hv_bitmaps_to_video_release", "Companion", "HyperVideoEncoderCallback", "hv-bitmaps-to-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HyperVideoEncoder {
    private static final int BIT_RATE = 1000000;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int FRAME_RATE = 8;
    private static final int I_FRAME_INTERVAL = 1;
    private static final String MIME_TYPE = "video/avc";
    private static int mHeight;
    private static int mWidth;
    private boolean isStarted;
    private final HyperVideoEncoderCallback mCallback;
    private ConcurrentLinkedQueue<Bitmap> mEncodeQueue;
    private final Object mFrameSync;
    private int mGenerateIndex;
    private CountDownLatch mNewFrameLatch;
    private boolean mNoMoreFrames;
    private File mOutputFile;
    private int mTrackIndex;
    private MediaCodec mediaCodec;
    private MediaMuxer mediaMuxer;
    private int selectedColorFormat;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lco/hyperverge/encoder/HyperVideoEncoder$Companion;", org.conscrypt.BuildConfig.FLAVOR, "()V", "BIT_RATE", org.conscrypt.BuildConfig.FLAVOR, "FRAME_RATE", "I_FRAME_INTERVAL", "MIME_TYPE", org.conscrypt.BuildConfig.FLAVOR, "mHeight", "mWidth", "getBestColorFormat", "codecInfo", "Landroid/media/MediaCodecInfo;", "selectCodec", "hv-bitmaps-to-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getBestColorFormat(MediaCodecInfo codecInfo) {
            int[] iArr = codecInfo.getCapabilitiesForType("video/avc").colorFormats;
            Intrinsics.checkNotNullExpressionValue(iArr, "capabilities.colorFormats");
            return AbstractC3574i.u(iArr, 19) ? 19 : 21;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MediaCodecInfo selectCodec() {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt.isEncoder()) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if (StringsKt.r(str, "video/avc", true)) {
                            return codecInfoAt;
                        }
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lco/hyperverge/encoder/HyperVideoEncoder$HyperVideoEncoderCallback;", org.conscrypt.BuildConfig.FLAVOR, "getContext", "Landroid/content/Context;", "onColorFormatSelected", org.conscrypt.BuildConfig.FLAVOR, AppConstants.VIDEO_RECORDING_COLOR_FORMAT, org.conscrypt.BuildConfig.FLAVOR, "onEncodingComplete", "outputFile", "Ljava/io/File;", "onLowStorage", "hv-bitmaps-to-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HyperVideoEncoderCallback {
        /* renamed from: getContext */
        Context get$context();

        void onColorFormatSelected(int colorFormat);

        void onEncodingComplete(File outputFile);

        void onLowStorage();
    }

    public HyperVideoEncoder(HyperVideoEncoderCallback mCallback) {
        Intrinsics.checkNotNullParameter(mCallback, "mCallback");
        this.mCallback = mCallback;
        this.mEncodeQueue = new ConcurrentLinkedQueue<>();
        this.mFrameSync = new Object();
        this.mNewFrameLatch = new CountDownLatch(0);
    }

    private final long computePresentationTime(long frameIndex) {
        return (frameIndex * 1000000) / 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0599 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void encode() {
        Object b10;
        Throwable d10;
        String canonicalName;
        Object b11;
        String className;
        MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBuffer;
        String canonicalName2;
        Object b12;
        String className2;
        String canonicalName3;
        Object b13;
        String className3;
        String canonicalName4;
        Object b14;
        String className4;
        String canonicalName5;
        Object b15;
        String className5;
        MediaCodec mediaCodec;
        CountDownLatch countDownLatch;
        Object b16;
        String canonicalName6;
        Object b17;
        String className6;
        while (true) {
            if (this.mNoMoreFrames && this.mEncodeQueue.size() == 0) {
                release();
                this.mCallback.onEncodingComplete(this.mOutputFile);
                return;
            }
            Bitmap poll = this.mEncodeQueue.poll();
            if (poll == null) {
                synchronized (this.mFrameSync) {
                    countDownLatch = new CountDownLatch(1);
                    this.mNewFrameLatch = countDownLatch;
                    Unit unit = Unit.f36324a;
                }
                try {
                    o.a aVar = o.f37128b;
                    countDownLatch.await();
                    b16 = o.b(Unit.f36324a);
                } catch (Throwable th) {
                    o.a aVar2 = o.f37128b;
                    b16 = o.b(p.a(th));
                }
                Throwable d11 = o.d(b16);
                if (d11 != null) {
                    HyperLogger.Level level = HyperLogger.Level.ERROR;
                    HyperLogger companion = HyperLogger.INSTANCE.getInstance();
                    StringBuilder sb2 = new StringBuilder();
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
                    if ((stackTraceElement == null || (className6 = stackTraceElement.getClassName()) == null || (canonicalName6 = StringsKt.L0(className6, '.', null, 2, null)) == null) && (canonicalName6 = HyperVideoEncoder.class.getCanonicalName()) == null) {
                        canonicalName6 = "N/A";
                    }
                    Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName6);
                    if (matcher.find()) {
                        canonicalName6 = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(canonicalName6, "replaceAll(\"\")");
                    }
                    Unit unit2 = Unit.f36324a;
                    if (canonicalName6.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        canonicalName6 = canonicalName6.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(canonicalName6, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    sb2.append(canonicalName6);
                    sb2.append(" - ");
                    String str = "encode() " + d11.getMessage();
                    if (str == null) {
                        str = "null ";
                    }
                    sb2.append(str);
                    sb2.append(' ');
                    sb2.append(org.conscrypt.BuildConfig.FLAVOR);
                    companion.log(level, sb2.toString());
                    try {
                        Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                        Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
                        b17 = o.b(((Application) invoke).getPackageName());
                    } catch (Throwable th2) {
                        o.a aVar3 = o.f37128b;
                        b17 = o.b(p.a(th2));
                    }
                    if (o.f(b17)) {
                        b17 = org.conscrypt.BuildConfig.FLAVOR;
                    }
                }
                poll = this.mEncodeQueue.poll();
            }
            if (poll != null) {
                try {
                    o.a aVar4 = o.f37128b;
                    byte[] byteArray = getByteArray(poll, poll.getWidth(), poll.getHeight(), this.selectedColorFormat);
                    poll.recycle();
                    int length = byteArray.length;
                    MediaCodec mediaCodec2 = this.mediaCodec;
                    if (mediaCodec2 == null) {
                        Intrinsics.v("mediaCodec");
                        mediaCodec2 = null;
                    }
                    int dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(HVFrameRecorder.TIMEOUT_USEC);
                    long computePresentationTime = computePresentationTime(this.mGenerateIndex);
                    if (dequeueInputBuffer >= 0) {
                        MediaCodec mediaCodec3 = this.mediaCodec;
                        if (mediaCodec3 == null) {
                            Intrinsics.v("mediaCodec");
                            mediaCodec3 = null;
                        }
                        ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer != null) {
                            inputBuffer.clear();
                        }
                        if (length <= (inputBuffer != null ? inputBuffer.remaining() : 0)) {
                            if (inputBuffer != null) {
                                inputBuffer.put(byteArray);
                            }
                            MediaCodec mediaCodec4 = this.mediaCodec;
                            if (mediaCodec4 == null) {
                                Intrinsics.v("mediaCodec");
                                mediaCodec = null;
                            } else {
                                mediaCodec = mediaCodec4;
                            }
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, length, computePresentationTime, 0);
                            this.mGenerateIndex++;
                        } else {
                            HyperLogger.Level level2 = HyperLogger.Level.ERROR;
                            HyperLogger companion2 = HyperLogger.INSTANCE.getInstance();
                            StringBuilder sb3 = new StringBuilder();
                            StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                            Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                            StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                            if ((stackTraceElement2 == null || (className5 = stackTraceElement2.getClassName()) == null || (canonicalName5 = StringsKt.L0(className5, '.', null, 2, null)) == null) && (canonicalName5 = HyperVideoEncoder.class.getCanonicalName()) == null) {
                                canonicalName5 = "N/A";
                            }
                            Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName5);
                            if (matcher2.find()) {
                                canonicalName5 = matcher2.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                                Intrinsics.checkNotNullExpressionValue(canonicalName5, "replaceAll(\"\")");
                            }
                            Unit unit3 = Unit.f36324a;
                            if (canonicalName5.length() > 23 && Build.VERSION.SDK_INT < 26) {
                                canonicalName5 = canonicalName5.substring(0, 23);
                                Intrinsics.checkNotNullExpressionValue(canonicalName5, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            sb3.append(canonicalName5);
                            sb3.append(" - ");
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("encode() Frame size exceeds buffer capacity: ");
                            sb4.append(length);
                            sb4.append(" > ");
                            sb4.append(inputBuffer != null ? Integer.valueOf(inputBuffer.remaining()) : null);
                            String sb5 = sb4.toString();
                            if (sb5 == null) {
                                sb5 = "null ";
                            }
                            sb3.append(sb5);
                            sb3.append(' ');
                            sb3.append(org.conscrypt.BuildConfig.FLAVOR);
                            companion2.log(level2, sb3.toString());
                            try {
                                Object invoke2 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                                Intrinsics.e(invoke2, "null cannot be cast to non-null type android.app.Application");
                                b15 = o.b(((Application) invoke2).getPackageName());
                            } catch (Throwable th3) {
                                o.a aVar5 = o.f37128b;
                                b15 = o.b(p.a(th3));
                            }
                            if (o.f(b15)) {
                                b15 = org.conscrypt.BuildConfig.FLAVOR;
                            }
                        }
                    }
                    bufferInfo = new MediaCodec.BufferInfo();
                    MediaCodec mediaCodec5 = this.mediaCodec;
                    if (mediaCodec5 == null) {
                        Intrinsics.v("mediaCodec");
                        mediaCodec5 = null;
                    }
                    dequeueOutputBuffer = mediaCodec5.dequeueOutputBuffer(bufferInfo, HVFrameRecorder.TIMEOUT_USEC);
                } catch (Throwable th4) {
                    o.a aVar6 = o.f37128b;
                    b10 = o.b(p.a(th4));
                }
                if (dequeueOutputBuffer == -1) {
                    HyperLogger.Level level3 = HyperLogger.Level.ERROR;
                    HyperLogger companion3 = HyperLogger.INSTANCE.getInstance();
                    StringBuilder sb6 = new StringBuilder();
                    StackTraceElement[] stackTrace3 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace3, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement3 = (StackTraceElement) AbstractC3574i.A(stackTrace3);
                    if ((stackTraceElement3 == null || (className4 = stackTraceElement3.getClassName()) == null || (canonicalName4 = StringsKt.L0(className4, '.', null, 2, null)) == null) && (canonicalName4 = HyperVideoEncoder.class.getCanonicalName()) == null) {
                        canonicalName4 = "N/A";
                    }
                    Matcher matcher3 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName4);
                    if (matcher3.find()) {
                        canonicalName4 = matcher3.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(canonicalName4, "replaceAll(\"\")");
                    }
                    Unit unit4 = Unit.f36324a;
                    if (canonicalName4.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        canonicalName4 = canonicalName4.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(canonicalName4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    sb6.append(canonicalName4);
                    sb6.append(" - ");
                    sb6.append("encode() No output from encoder available");
                    sb6.append(' ');
                    sb6.append(org.conscrypt.BuildConfig.FLAVOR);
                    companion3.log(level3, sb6.toString());
                    try {
                        Object invoke3 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                        Intrinsics.e(invoke3, "null cannot be cast to non-null type android.app.Application");
                        b14 = o.b(((Application) invoke3).getPackageName());
                    } catch (Throwable th5) {
                        o.a aVar7 = o.f37128b;
                        b14 = o.b(p.a(th5));
                    }
                    if (o.f(b14)) {
                        b14 = org.conscrypt.BuildConfig.FLAVOR;
                    }
                    b10 = o.b(Unit.f36324a);
                    d10 = o.d(b10);
                    if (d10 == null) {
                        HyperLogger.Level level4 = HyperLogger.Level.ERROR;
                        HyperLogger companion4 = HyperLogger.INSTANCE.getInstance();
                        StringBuilder sb7 = new StringBuilder();
                        StackTraceElement[] stackTrace4 = new Throwable().getStackTrace();
                        Intrinsics.checkNotNullExpressionValue(stackTrace4, "Throwable().stackTrace");
                        StackTraceElement stackTraceElement4 = (StackTraceElement) AbstractC3574i.A(stackTrace4);
                        if ((stackTraceElement4 == null || (className = stackTraceElement4.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) && (canonicalName = HyperVideoEncoder.class.getCanonicalName()) == null) {
                            canonicalName = "N/A";
                        }
                        Matcher matcher4 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName);
                        if (matcher4.find()) {
                            canonicalName = matcher4.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
                        }
                        Unit unit5 = Unit.f36324a;
                        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
                            canonicalName = canonicalName.substring(0, 23);
                            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        sb7.append(canonicalName);
                        sb7.append(" - ");
                        String str2 = "encode() " + d10.getClass() + ": " + d10.getMessage();
                        if (str2 == null) {
                            str2 = "null ";
                        }
                        sb7.append(str2);
                        sb7.append(' ');
                        sb7.append(org.conscrypt.BuildConfig.FLAVOR);
                        companion4.log(level4, sb7.toString());
                        try {
                            Object invoke4 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                            Intrinsics.e(invoke4, "null cannot be cast to non-null type android.app.Application");
                            b11 = o.b(((Application) invoke4).getPackageName());
                        } catch (Throwable th6) {
                            o.a aVar8 = o.f37128b;
                            b11 = o.b(p.a(th6));
                        }
                        if (o.f(b11)) {
                            b11 = org.conscrypt.BuildConfig.FLAVOR;
                        }
                        if ((d10 instanceof IllegalStateException) && DeviceExtsKt.isLowStorage(this.mCallback.get$context())) {
                            release();
                            throw d10;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (dequeueOutputBuffer == -2) {
                        MediaCodec mediaCodec6 = this.mediaCodec;
                        if (mediaCodec6 == null) {
                            Intrinsics.v("mediaCodec");
                            mediaCodec6 = null;
                        }
                        MediaFormat outputFormat = mediaCodec6.getOutputFormat();
                        Intrinsics.checkNotNullExpressionValue(outputFormat, "mediaCodec.outputFormat");
                        MediaMuxer mediaMuxer = this.mediaMuxer;
                        if (mediaMuxer == null) {
                            Intrinsics.v("mediaMuxer");
                            mediaMuxer = null;
                        }
                        this.mTrackIndex = mediaMuxer.addTrack(outputFormat);
                        MediaMuxer mediaMuxer2 = this.mediaMuxer;
                        if (mediaMuxer2 == null) {
                            Intrinsics.v("mediaMuxer");
                            mediaMuxer2 = null;
                        }
                        mediaMuxer2.start();
                    } else if (dequeueOutputBuffer < 0) {
                        HyperLogger.Level level5 = HyperLogger.Level.ERROR;
                        HyperLogger companion5 = HyperLogger.INSTANCE.getInstance();
                        StringBuilder sb8 = new StringBuilder();
                        StackTraceElement[] stackTrace5 = new Throwable().getStackTrace();
                        Intrinsics.checkNotNullExpressionValue(stackTrace5, "Throwable().stackTrace");
                        StackTraceElement stackTraceElement5 = (StackTraceElement) AbstractC3574i.A(stackTrace5);
                        if ((stackTraceElement5 == null || (className3 = stackTraceElement5.getClassName()) == null || (canonicalName3 = StringsKt.L0(className3, '.', null, 2, null)) == null) && (canonicalName3 = HyperVideoEncoder.class.getCanonicalName()) == null) {
                            canonicalName3 = "N/A";
                        }
                        Matcher matcher5 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName3);
                        if (matcher5.find()) {
                            canonicalName3 = matcher5.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                            Intrinsics.checkNotNullExpressionValue(canonicalName3, "replaceAll(\"\")");
                        }
                        Unit unit6 = Unit.f36324a;
                        if (canonicalName3.length() > 23 && Build.VERSION.SDK_INT < 26) {
                            canonicalName3 = canonicalName3.substring(0, 23);
                            Intrinsics.checkNotNullExpressionValue(canonicalName3, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        sb8.append(canonicalName3);
                        sb8.append(" - ");
                        String str3 = "encode() unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer;
                        if (str3 == null) {
                            str3 = "null ";
                        }
                        sb8.append(str3);
                        sb8.append(' ');
                        sb8.append(org.conscrypt.BuildConfig.FLAVOR);
                        companion5.log(level5, sb8.toString());
                        try {
                            Object invoke5 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                            Intrinsics.e(invoke5, "null cannot be cast to non-null type android.app.Application");
                            b13 = o.b(((Application) invoke5).getPackageName());
                        } catch (Throwable th7) {
                            o.a aVar9 = o.f37128b;
                            b13 = o.b(p.a(th7));
                        }
                        if (o.f(b13)) {
                            b13 = org.conscrypt.BuildConfig.FLAVOR;
                        }
                    } else if (bufferInfo.size != 0) {
                        MediaCodec mediaCodec7 = this.mediaCodec;
                        if (mediaCodec7 == null) {
                            Intrinsics.v("mediaCodec");
                            mediaCodec7 = null;
                        }
                        ByteBuffer outputBuffer = mediaCodec7.getOutputBuffer(dequeueOutputBuffer);
                        if (outputBuffer == null) {
                            HyperLogger.Level level6 = HyperLogger.Level.ERROR;
                            HyperLogger companion6 = HyperLogger.INSTANCE.getInstance();
                            StringBuilder sb9 = new StringBuilder();
                            StackTraceElement[] stackTrace6 = new Throwable().getStackTrace();
                            Intrinsics.checkNotNullExpressionValue(stackTrace6, "Throwable().stackTrace");
                            StackTraceElement stackTraceElement6 = (StackTraceElement) AbstractC3574i.A(stackTrace6);
                            if ((stackTraceElement6 == null || (className2 = stackTraceElement6.getClassName()) == null || (canonicalName2 = StringsKt.L0(className2, '.', null, 2, null)) == null) && (canonicalName2 = HyperVideoEncoder.class.getCanonicalName()) == null) {
                                canonicalName2 = "N/A";
                            }
                            Matcher matcher6 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName2);
                            if (matcher6.find()) {
                                canonicalName2 = matcher6.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                                Intrinsics.checkNotNullExpressionValue(canonicalName2, "replaceAll(\"\")");
                            }
                            Unit unit7 = Unit.f36324a;
                            if (canonicalName2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                                canonicalName2 = canonicalName2.substring(0, 23);
                                Intrinsics.checkNotNullExpressionValue(canonicalName2, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            sb9.append(canonicalName2);
                            sb9.append(" - ");
                            String str4 = "encode() encoderOutputBuffer " + dequeueOutputBuffer + " was null";
                            if (str4 == null) {
                                str4 = "null ";
                            }
                            sb9.append(str4);
                            sb9.append(' ');
                            sb9.append(org.conscrypt.BuildConfig.FLAVOR);
                            companion6.log(level6, sb9.toString());
                            try {
                                Object invoke6 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                                Intrinsics.e(invoke6, "null cannot be cast to non-null type android.app.Application");
                                b12 = o.b(((Application) invoke6).getPackageName());
                            } catch (Throwable th8) {
                                o.a aVar10 = o.f37128b;
                                b12 = o.b(p.a(th8));
                            }
                            if (o.f(b12)) {
                                b12 = org.conscrypt.BuildConfig.FLAVOR;
                            }
                        } else {
                            outputBuffer.position(bufferInfo.offset);
                            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            MediaMuxer mediaMuxer3 = this.mediaMuxer;
                            if (mediaMuxer3 == null) {
                                Intrinsics.v("mediaMuxer");
                                mediaMuxer3 = null;
                            }
                            mediaMuxer3.writeSampleData(this.mTrackIndex, outputBuffer, bufferInfo);
                            MediaCodec mediaCodec8 = this.mediaCodec;
                            if (mediaCodec8 == null) {
                                Intrinsics.v("mediaCodec");
                                mediaCodec8 = null;
                            }
                            mediaCodec8.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    }
                    b10 = o.b(Unit.f36324a);
                    d10 = o.d(b10);
                    if (d10 == null) {
                    }
                }
            }
        }
    }

    private final byte[] getByteArray(Bitmap scaled, int inputWidth, int inputHeight, int colorFormat) {
        int i10 = inputWidth * inputHeight;
        int[] iArr = new int[i10];
        scaled.getPixels(iArr, 0, inputWidth, 0, 0, inputWidth, inputHeight);
        byte[] bArr = new byte[i10 + (((int) Math.ceil(inputHeight / 2.0d)) * 2 * ((int) Math.ceil(inputWidth / 2.0d)))];
        if (colorFormat == 19) {
            getByteArray$encodeYUV420P(bArr, iArr, inputWidth, inputHeight);
        } else {
            getByteArray$encodeYUV420SP(bArr, iArr, inputWidth, inputHeight);
        }
        scaled.recycle();
        return bArr;
    }

    private static final void getByteArray$encodeYUV420P(byte[] bArr, int[] iArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i10 / 2;
        int i14 = (i12 / 4) + i12;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = 0;
            while (i17 < i10) {
                int i18 = iArr[(i16 * i10) + i17];
                int i19 = (16711680 & i18) >> 16;
                int i20 = (65280 & i18) >> 8;
                int i21 = 255;
                int i22 = i18 & 255;
                int i23 = (((((i19 * 66) + (i20 * 129)) + (i22 * 25)) + 128) >> 8) + 16;
                int i24 = (((((i19 * (-38)) - (i20 * 74)) + (i22 * 112)) + 128) >> 8) + 128;
                int i25 = (((((i19 * 112) - (i20 * 94)) - (i22 * 18)) + 128) >> 8) + 128;
                int i26 = i15 + 1;
                if (i23 < 0) {
                    i23 = 0;
                } else if (i23 > 255) {
                    i23 = 255;
                }
                bArr[i15] = (byte) i23;
                if (i16 % 2 == 0 && i17 % 2 == 0) {
                    int i27 = ((i16 / 2) * i13) + (i17 / 2);
                    int i28 = i12 + i27;
                    if (i24 < 0) {
                        i24 = 0;
                    } else if (i24 > 255) {
                        i24 = 255;
                    }
                    bArr[i28] = (byte) i24;
                    int i29 = i27 + i14;
                    if (i25 < 0) {
                        i21 = 0;
                    } else if (i25 <= 255) {
                        i21 = i25;
                    }
                    bArr[i29] = (byte) i21;
                }
                i17++;
                i15 = i26;
            }
        }
    }

    private static final void getByteArray$encodeYUV420SP(byte[] bArr, int[] iArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            while (i16 < i10) {
                int i17 = iArr[i14];
                int i18 = (16711680 & i17) >> 16;
                int i19 = (65280 & i17) >> 8;
                int i20 = 255;
                int i21 = i17 & 255;
                int i22 = (((((i18 * 66) + (i19 * 129)) + (i21 * 25)) + 128) >> 8) + 16;
                int i23 = (((((i18 * (-38)) - (i19 * 74)) + (i21 * 112)) + 128) >> 8) + 128;
                int i24 = (((((i18 * 112) - (i19 * 94)) - (i21 * 18)) + 128) >> 8) + 128;
                int i25 = i13 + 1;
                if (i22 < 0) {
                    i22 = 0;
                } else if (i22 > 255) {
                    i22 = 255;
                }
                bArr[i13] = (byte) i22;
                if (i15 % 2 == 0 && i14 % 2 == 0) {
                    int i26 = i12 + 1;
                    if (i23 < 0) {
                        i23 = 0;
                    } else if (i23 > 255) {
                        i23 = 255;
                    }
                    bArr[i12] = (byte) i23;
                    i12 += 2;
                    if (i24 < 0) {
                        i20 = 0;
                    } else if (i24 <= 255) {
                        i20 = i24;
                    }
                    bArr[i26] = (byte) i20;
                }
                i14++;
                i16++;
                i13 = i25;
            }
        }
    }

    private final void release() {
        Object b10;
        String canonicalName;
        Object obj;
        String className;
        try {
            o.a aVar = o.f37128b;
            MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec == null) {
                Intrinsics.v("mediaCodec");
                mediaCodec = null;
            }
            mediaCodec.stop();
            mediaCodec.release();
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer == null) {
                Intrinsics.v("mediaMuxer");
                mediaMuxer = null;
            }
            mediaMuxer.stop();
            mediaMuxer.release();
            this.mNewFrameLatch = new CountDownLatch(0);
            b10 = o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            HyperLogger.Level level = HyperLogger.Level.ERROR;
            HyperLogger companion = HyperLogger.INSTANCE.getInstance();
            StringBuilder sb2 = new StringBuilder();
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
            if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) && (canonicalName = HyperVideoEncoder.class.getCanonicalName()) == null) {
                canonicalName = "N/A";
            }
            Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName);
            boolean find = matcher.find();
            Object obj2 = org.conscrypt.BuildConfig.FLAVOR;
            if (find) {
                canonicalName = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
            }
            if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
                canonicalName = canonicalName.substring(0, 23);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            sb2.append(canonicalName);
            sb2.append(" - ");
            String str = "release(): " + d10.getMessage();
            if (str == null) {
                str = "null ";
            }
            sb2.append(str);
            sb2.append(' ');
            sb2.append(org.conscrypt.BuildConfig.FLAVOR);
            companion.log(level, sb2.toString());
            try {
                Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
                obj = o.b(((Application) invoke).getPackageName());
            } catch (Throwable th2) {
                o.a aVar3 = o.f37128b;
                obj = o.b(p.a(th2));
            }
            if (!o.f(obj)) {
                obj2 = obj;
            }
        }
    }

    public final boolean isEncodingStarted$hv_bitmaps_to_video_release() {
        return this.isStarted && !this.mNoMoreFrames;
    }

    public final void queueFrame$hv_bitmaps_to_video_release(Bitmap bitmap) {
        String canonicalName;
        String className;
        if (this.isStarted) {
            this.mEncodeQueue.add(bitmap);
            synchronized (this.mFrameSync) {
                try {
                    if (this.mNewFrameLatch.getCount() > 0) {
                        this.mNewFrameLatch.countDown();
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) && (canonicalName = HyperVideoEncoder.class.getCanonicalName()) == null) {
            canonicalName = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName);
        if (matcher.find()) {
            canonicalName = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        sb2.append("queueFrame() Failed to queue frame. Encoding not started");
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(1:36)(2:10|(12:12|13|(1:15)|16|(1:20)|21|22|23|24|(1:26)|27|28))|33|(1:35)|13|(0)|16|(2:18|20)|21|22|23|24|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        r2 = lc.o.f37128b;
        r0 = lc.o.b(lc.p.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startEncoding$hv_bitmaps_to_video_release(int width, int height, File outputFile, boolean autoColorFormatSelection) {
        String canonicalName;
        Object obj;
        String className;
        Object b10;
        String canonicalName2;
        Object obj2;
        String className2;
        Object b11;
        Object b12;
        Object b13;
        String str;
        Object obj3;
        String className3;
        String str2;
        Object obj4;
        String className4;
        String str3;
        Object obj5;
        String className5;
        String str4;
        String canonicalName3;
        Matcher matcher;
        Object obj6;
        String className6;
        Object obj7 = org.conscrypt.BuildConfig.FLAVOR;
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        mWidth = (width / 2) * 2;
        mHeight = (height / 2) * 2;
        this.mOutputFile = outputFile;
        try {
            String canonicalPath = outputFile.getCanonicalPath();
            Intrinsics.checkNotNullExpressionValue(canonicalPath, "{\n            outputFile.canonicalPath\n        }");
            Companion companion = INSTANCE;
            MediaCodecInfo selectCodec = companion.selectCodec();
            if (selectCodec == null) {
                HyperLogger.Level level = HyperLogger.Level.ERROR;
                HyperLogger companion2 = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb2 = new StringBuilder();
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
                StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
                if (stackTraceElement == null || (className6 = stackTraceElement.getClassName()) == null) {
                    str4 = "N/A";
                } else {
                    str4 = "N/A";
                    String L02 = StringsKt.L0(className6, '.', null, 2, null);
                    if (L02 != null) {
                        canonicalName3 = L02;
                        matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName3);
                        if (matcher.find()) {
                            canonicalName3 = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                            Intrinsics.checkNotNullExpressionValue(canonicalName3, "replaceAll(\"\")");
                        }
                        Unit unit = Unit.f36324a;
                        if (canonicalName3.length() > 23 && Build.VERSION.SDK_INT < 26) {
                            canonicalName3 = canonicalName3.substring(0, 23);
                            Intrinsics.checkNotNullExpressionValue(canonicalName3, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        sb2.append(canonicalName3);
                        sb2.append(" - ");
                        sb2.append("startEncoding() Unable to find an appropriate codec for video/avc");
                        sb2.append(' ');
                        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
                        companion2.log(level, sb2.toString());
                        o.a aVar = o.f37128b;
                        Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                        Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
                        obj6 = o.b(((Application) invoke).getPackageName());
                        if (!o.f(obj6)) {
                            obj7 = obj6;
                        }
                        return;
                    }
                }
                canonicalName3 = HyperVideoEncoder.class.getCanonicalName();
                if (canonicalName3 == null) {
                    canonicalName3 = str4;
                }
                matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName3);
                if (matcher.find()) {
                }
                Unit unit2 = Unit.f36324a;
                if (canonicalName3.length() > 23) {
                    canonicalName3 = canonicalName3.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(canonicalName3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb2.append(canonicalName3);
                sb2.append(" - ");
                sb2.append("startEncoding() Unable to find an appropriate codec for video/avc");
                sb2.append(' ');
                sb2.append(org.conscrypt.BuildConfig.FLAVOR);
                companion2.log(level, sb2.toString());
                o.a aVar2 = o.f37128b;
                Object invoke2 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                Intrinsics.e(invoke2, "null cannot be cast to non-null type android.app.Application");
                obj6 = o.b(((Application) invoke2).getPackageName());
                if (!o.f(obj6)) {
                }
                return;
            }
            int bestColorFormat = autoColorFormatSelection ? companion.getBestColorFormat(selectCodec) : 21;
            this.selectedColorFormat = bestColorFormat;
            this.mCallback.onColorFormatSelected(bestColorFormat);
            try {
                o.a aVar3 = o.f37128b;
                b10 = o.b(MediaCodec.createByCodecName(selectCodec.getName()));
            } catch (Throwable th) {
                o.a aVar4 = o.f37128b;
                b10 = o.b(p.a(th));
            }
            Throwable d10 = o.d(b10);
            if (d10 != null) {
                HyperLogger.Level level2 = HyperLogger.Level.ERROR;
                HyperLogger companion3 = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb3 = new StringBuilder();
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                if ((stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null || (canonicalName2 = StringsKt.L0(className2, '.', null, 2, null)) == null) && (canonicalName2 = HyperVideoEncoder.class.getCanonicalName()) == null) {
                    canonicalName2 = "N/A";
                }
                Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName2);
                if (matcher2.find()) {
                    canonicalName2 = matcher2.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(canonicalName2, "replaceAll(\"\")");
                }
                Unit unit3 = Unit.f36324a;
                if (canonicalName2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    canonicalName2 = canonicalName2.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(canonicalName2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb3.append(canonicalName2);
                sb3.append(" - ");
                String str5 = "startEncoding() MediaCodec.createByCodecName: " + d10.getClass() + ": " + d10.getMessage();
                if (str5 == null) {
                    str5 = "null ";
                }
                sb3.append(str5);
                sb3.append(' ');
                sb3.append(org.conscrypt.BuildConfig.FLAVOR);
                companion3.log(level2, sb3.toString());
                try {
                    Object invoke3 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                    Intrinsics.e(invoke3, "null cannot be cast to non-null type android.app.Application");
                    obj2 = o.b(((Application) invoke3).getPackageName());
                } catch (Throwable th2) {
                    o.a aVar5 = o.f37128b;
                    obj2 = o.b(p.a(th2));
                }
                if (!o.f(obj2)) {
                    obj7 = obj2;
                }
                return;
            }
            this.mediaCodec = (MediaCodec) b10;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", mWidth, mHeight);
            Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(MIME_TYPE, mWidth, mHeight)");
            createVideoFormat.setInteger("bitrate", 1000000);
            createVideoFormat.setInteger("frame-rate", 8);
            createVideoFormat.setInteger("color-format", this.selectedColorFormat);
            createVideoFormat.setInteger("i-frame-interval", 1);
            createVideoFormat.setLong("max-input-size", Long.MAX_VALUE);
            try {
                MediaCodec mediaCodec = this.mediaCodec;
                if (mediaCodec == null) {
                    Intrinsics.v("mediaCodec");
                    mediaCodec = null;
                }
                mediaCodec.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                b11 = o.b(Unit.f36324a);
            } catch (Throwable th3) {
                o.a aVar6 = o.f37128b;
                b11 = o.b(p.a(th3));
            }
            Throwable d11 = o.d(b11);
            if (d11 != null) {
                HyperLogger.Level level3 = HyperLogger.Level.ERROR;
                HyperLogger companion4 = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb4 = new StringBuilder();
                StackTraceElement[] stackTrace3 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace3, "Throwable().stackTrace");
                StackTraceElement stackTraceElement3 = (StackTraceElement) AbstractC3574i.A(stackTrace3);
                if (stackTraceElement3 == null || (className5 = stackTraceElement3.getClassName()) == null || (str3 = StringsKt.L0(className5, '.', null, 2, null)) == null) {
                    String canonicalName4 = HyperVideoEncoder.class.getCanonicalName();
                    str3 = canonicalName4 == null ? "N/A" : canonicalName4;
                }
                Matcher matcher3 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str3);
                if (matcher3.find()) {
                    str3 = matcher3.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str3, "replaceAll(\"\")");
                }
                Unit unit4 = Unit.f36324a;
                if (str3.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str3 = str3.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb4.append(str3);
                sb4.append(" - ");
                String str6 = "startEncoding() mediaCodec.configure: " + d11.getClass() + ": " + d11.getMessage();
                if (str6 == null) {
                    str6 = "null ";
                }
                sb4.append(str6);
                sb4.append(' ');
                sb4.append(org.conscrypt.BuildConfig.FLAVOR);
                companion4.log(level3, sb4.toString());
                try {
                    Object invoke4 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                    Intrinsics.e(invoke4, "null cannot be cast to non-null type android.app.Application");
                    obj5 = o.b(((Application) invoke4).getPackageName());
                } catch (Throwable th4) {
                    o.a aVar7 = o.f37128b;
                    obj5 = o.b(p.a(th4));
                }
                if (!o.f(obj5)) {
                    obj7 = obj5;
                }
                return;
            }
            try {
                MediaCodec mediaCodec2 = this.mediaCodec;
                if (mediaCodec2 == null) {
                    Intrinsics.v("mediaCodec");
                    mediaCodec2 = null;
                }
                mediaCodec2.start();
                b12 = o.b(Unit.f36324a);
            } catch (Throwable th5) {
                o.a aVar8 = o.f37128b;
                b12 = o.b(p.a(th5));
            }
            Throwable d12 = o.d(b12);
            if (d12 != null) {
                HyperLogger.Level level4 = HyperLogger.Level.ERROR;
                HyperLogger companion5 = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb5 = new StringBuilder();
                StackTraceElement[] stackTrace4 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace4, "Throwable().stackTrace");
                StackTraceElement stackTraceElement4 = (StackTraceElement) AbstractC3574i.A(stackTrace4);
                if (stackTraceElement4 == null || (className4 = stackTraceElement4.getClassName()) == null || (str2 = StringsKt.L0(className4, '.', null, 2, null)) == null) {
                    String canonicalName5 = HyperVideoEncoder.class.getCanonicalName();
                    str2 = canonicalName5 == null ? "N/A" : canonicalName5;
                }
                Matcher matcher4 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str2);
                if (matcher4.find()) {
                    str2 = matcher4.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
                }
                Unit unit5 = Unit.f36324a;
                if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str2 = str2.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb5.append(str2);
                sb5.append(" - ");
                String str7 = "startEncoding() mediaCodec.start(): " + d12.getClass() + ": " + d12.getMessage();
                if (str7 == null) {
                    str7 = "null ";
                }
                sb5.append(str7);
                sb5.append(' ');
                sb5.append(org.conscrypt.BuildConfig.FLAVOR);
                companion5.log(level4, sb5.toString());
                try {
                    Object invoke5 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                    Intrinsics.e(invoke5, "null cannot be cast to non-null type android.app.Application");
                    obj4 = o.b(((Application) invoke5).getPackageName());
                } catch (Throwable th6) {
                    o.a aVar9 = o.f37128b;
                    obj4 = o.b(p.a(th6));
                }
                if (!o.f(obj4)) {
                    obj7 = obj4;
                }
                return;
            }
            try {
                b13 = o.b(new MediaMuxer(canonicalPath, 0));
            } catch (Throwable th7) {
                o.a aVar10 = o.f37128b;
                b13 = o.b(p.a(th7));
            }
            Throwable d13 = o.d(b13);
            if (d13 == null) {
                this.mediaMuxer = (MediaMuxer) b13;
                this.isStarted = true;
                AbstractC0891k.d(O.b(), C0874b0.c(), null, new HyperVideoEncoder$startEncoding$10(this, null), 2, null);
                return;
            }
            HyperLogger.Level level5 = HyperLogger.Level.ERROR;
            HyperLogger companion6 = HyperLogger.INSTANCE.getInstance();
            StringBuilder sb6 = new StringBuilder();
            StackTraceElement[] stackTrace5 = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace5, "Throwable().stackTrace");
            StackTraceElement stackTraceElement5 = (StackTraceElement) AbstractC3574i.A(stackTrace5);
            if (stackTraceElement5 == null || (className3 = stackTraceElement5.getClassName()) == null || (str = StringsKt.L0(className3, '.', null, 2, null)) == null) {
                String canonicalName6 = HyperVideoEncoder.class.getCanonicalName();
                str = canonicalName6 == null ? "N/A" : canonicalName6;
            }
            Matcher matcher5 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str);
            if (matcher5.find()) {
                str = matcher5.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
            }
            Unit unit6 = Unit.f36324a;
            if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                str = str.substring(0, 23);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            sb6.append(str);
            sb6.append(" - ");
            String str8 = "startEncoding() MediaMuxer(): " + d13.getClass() + ": " + d13.getMessage();
            if (str8 == null) {
                str8 = "null ";
            }
            sb6.append(str8);
            sb6.append(' ');
            sb6.append(org.conscrypt.BuildConfig.FLAVOR);
            companion6.log(level5, sb6.toString());
            try {
                Object invoke6 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                Intrinsics.e(invoke6, "null cannot be cast to non-null type android.app.Application");
                obj3 = o.b(((Application) invoke6).getPackageName());
            } catch (Throwable th8) {
                o.a aVar11 = o.f37128b;
                obj3 = o.b(p.a(th8));
            }
            if (!o.f(obj3)) {
                obj7 = obj3;
            }
        } catch (IOException e10) {
            HyperLogger.Level level6 = HyperLogger.Level.ERROR;
            HyperLogger companion7 = HyperLogger.INSTANCE.getInstance();
            StringBuilder sb7 = new StringBuilder();
            StackTraceElement[] stackTrace6 = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace6, "Throwable().stackTrace");
            StackTraceElement stackTraceElement6 = (StackTraceElement) AbstractC3574i.A(stackTrace6);
            if ((stackTraceElement6 == null || (className = stackTraceElement6.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) && (canonicalName = HyperVideoEncoder.class.getCanonicalName()) == null) {
                canonicalName = "N/A";
            }
            Matcher matcher6 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName);
            if (matcher6.find()) {
                canonicalName = matcher6.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
            }
            Unit unit7 = Unit.f36324a;
            if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
                canonicalName = canonicalName.substring(0, 23);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            sb7.append(canonicalName);
            sb7.append(" - ");
            String str9 = "startEncoding() " + e10.getMessage();
            if (str9 == null) {
                str9 = "null ";
            }
            sb7.append(str9);
            sb7.append(' ');
            sb7.append(org.conscrypt.BuildConfig.FLAVOR);
            companion7.log(level6, sb7.toString());
            try {
                o.a aVar12 = o.f37128b;
                Object invoke7 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                Intrinsics.e(invoke7, "null cannot be cast to non-null type android.app.Application");
                obj = o.b(((Application) invoke7).getPackageName());
            } catch (Throwable th9) {
                o.a aVar13 = o.f37128b;
                obj = o.b(p.a(th9));
            }
            if (!o.f(obj)) {
                obj7 = obj;
            }
        }
    }

    public final void stopEncoding$hv_bitmaps_to_video_release() {
        String canonicalName;
        String canonicalName2;
        String className;
        String className2;
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger.Companion companion = HyperLogger.INSTANCE;
        HyperLogger companion2 = companion.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if ((stackTraceElement == null || (className2 = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className2, '.', null, 2, null)) == null) && (canonicalName = HyperVideoEncoder.class.getCanonicalName()) == null) {
            canonicalName = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName);
        if (matcher.find()) {
            canonicalName = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        sb2.append("stopEncoding() called");
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
        companion2.log(level, sb2.toString());
        if (this.isStarted) {
            this.mNoMoreFrames = true;
            synchronized (this.mFrameSync) {
                try {
                    if (this.mNewFrameLatch.getCount() > 0) {
                        this.mNewFrameLatch.countDown();
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        HyperLogger companion3 = companion.getInstance();
        StringBuilder sb3 = new StringBuilder();
        StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
        StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
        if ((stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null || (canonicalName2 = StringsKt.L0(className, '.', null, 2, null)) == null) && (canonicalName2 = HyperVideoEncoder.class.getCanonicalName()) == null) {
            canonicalName2 = "N/A";
        }
        Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName2);
        if (matcher2.find()) {
            canonicalName2 = matcher2.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName2, "replaceAll(\"\")");
        }
        if (canonicalName2.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName2 = canonicalName2.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb3.append(canonicalName2);
        sb3.append(" - ");
        sb3.append("stopEncoding() Failed to stop encoding since it never started");
        sb3.append(' ');
        sb3.append(org.conscrypt.BuildConfig.FLAVOR);
        companion3.log(level, sb3.toString());
    }
}
