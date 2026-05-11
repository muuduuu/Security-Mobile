package co.hyperverge.encoder;

import Jd.AbstractC0891k;
import Jd.O;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import co.hyperverge.encoder.HyperVideoEncoder;
import co.hyperverge.encoder.utils.extensions.LogExtsKt;
import co.hyperverge.hyperlogger.HyperLogger;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oc.AbstractC3775a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J6\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0012\u0010%\u001a\u00020\u00142\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lco/hyperverge/encoder/HyperVideoRecorder;", org.conscrypt.BuildConfig.FLAVOR, "()V", "bitmapToVideoEncoder", "Lco/hyperverge/encoder/HyperVideoEncoder;", "cameraPreviewTag", org.conscrypt.BuildConfig.FLAVOR, "currentWindow", "Landroid/view/Window;", "isAutoColorFormatSelectionEnabled", org.conscrypt.BuildConfig.FLAVOR, "isRecordingStarted", "mCallback", "Lco/hyperverge/encoder/HyperVideoListener;", "outputVideoFile", "Ljava/io/File;", "timer", "Ljava/util/Timer;", "videoPath", "createBitmaps", org.conscrypt.BuildConfig.FLAVOR, "previewToBitmap", "view", "Landroid/view/View;", "queueBitmap", "bitmap", "Landroid/graphics/Bitmap;", "start", "context", "Landroid/content/Context;", "window", "videoFile", "autoColorFormatSelection", "hyperVideoColorFormatListener", "Lco/hyperverge/encoder/HyperVideoColorFormatListener;", "hyperVideoLowStorageExceptionListener", "Lco/hyperverge/encoder/HyperVideoLowStorageExceptionListener;", "stop", "callback", "Companion", "hv-bitmaps-to-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HyperVideoRecorder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static HyperVideoRecorder instance;
    private HyperVideoEncoder bitmapToVideoEncoder;
    private String cameraPreviewTag;
    private Window currentWindow;
    private boolean isAutoColorFormatSelectionEnabled;
    private boolean isRecordingStarted;
    private HyperVideoListener mCallback;
    private File outputVideoFile;
    private Timer timer;
    private String videoPath;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lco/hyperverge/encoder/HyperVideoRecorder$Companion;", org.conscrypt.BuildConfig.FLAVOR, "()V", "instance", "Lco/hyperverge/encoder/HyperVideoRecorder;", "getInstance", "hv-bitmaps-to-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HyperVideoRecorder getInstance() {
            if (HyperVideoRecorder.instance == null) {
                HyperVideoRecorder.instance = new HyperVideoRecorder(null);
            }
            HyperVideoRecorder hyperVideoRecorder = HyperVideoRecorder.instance;
            Intrinsics.e(hyperVideoRecorder, "null cannot be cast to non-null type co.hyperverge.encoder.HyperVideoRecorder");
            return hyperVideoRecorder;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HyperVideoRecorder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void createBitmaps() {
        String canonicalName;
        String className;
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) && (canonicalName = HyperVideoRecorder.class.getCanonicalName()) == null) {
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
        sb2.append("createBitmaps() called");
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer a10 = AbstractC3775a.a("timer", false);
        a10.scheduleAtFixedRate(new TimerTask() { // from class: co.hyperverge.encoder.HyperVideoRecorder$createBitmaps$$inlined$fixedRateTimer$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Window window;
                window = HyperVideoRecorder.this.currentWindow;
                if (window == null) {
                    Intrinsics.v("currentWindow");
                    window = null;
                }
                View rootView = window.getDecorView().getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "currentWindow.decorView.rootView");
                if (rootView.isLaidOut()) {
                    HyperVideoRecorder.this.previewToBitmap(rootView);
                }
            }
        }, 0L, 125L);
        this.timer = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void previewToBitmap(View view) {
        AbstractC0891k.d(O.b(), null, null, new HyperVideoRecorder$previewToBitmap$1(this, view, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queueBitmap(Bitmap bitmap) {
        HyperVideoEncoder hyperVideoEncoder = this.bitmapToVideoEncoder;
        HyperVideoEncoder hyperVideoEncoder2 = null;
        if (hyperVideoEncoder == null) {
            Intrinsics.v("bitmapToVideoEncoder");
            hyperVideoEncoder = null;
        }
        if (!hyperVideoEncoder.isEncodingStarted$hv_bitmaps_to_video_release() && this.isRecordingStarted) {
            File file = this.outputVideoFile;
            if (file == null) {
                Intrinsics.v("outputVideoFile");
                file = null;
            }
            HyperVideoEncoder hyperVideoEncoder3 = this.bitmapToVideoEncoder;
            if (hyperVideoEncoder3 == null) {
                Intrinsics.v("bitmapToVideoEncoder");
                hyperVideoEncoder3 = null;
            }
            hyperVideoEncoder3.startEncoding$hv_bitmaps_to_video_release(bitmap.getWidth(), bitmap.getHeight(), file, this.isAutoColorFormatSelectionEnabled);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            this.videoPath = absolutePath;
        }
        HyperVideoEncoder hyperVideoEncoder4 = this.bitmapToVideoEncoder;
        if (hyperVideoEncoder4 == null) {
            Intrinsics.v("bitmapToVideoEncoder");
        } else {
            hyperVideoEncoder2 = hyperVideoEncoder4;
        }
        hyperVideoEncoder2.queueFrame$hv_bitmaps_to_video_release(bitmap);
    }

    public static /* synthetic */ void stop$default(HyperVideoRecorder hyperVideoRecorder, HyperVideoListener hyperVideoListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hyperVideoListener = null;
        }
        hyperVideoRecorder.stop(hyperVideoListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005c, code lost:
    
        if (r10 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(final Context context, Window window, File videoFile, boolean autoColorFormatSelection, final HyperVideoColorFormatListener hyperVideoColorFormatListener, final HyperVideoLowStorageExceptionListener hyperVideoLowStorageExceptionListener) {
        String str;
        String str2;
        String canonicalName;
        String className;
        String className2;
        Window window2 = window;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window2, "window");
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        Intrinsics.checkNotNullParameter(hyperVideoColorFormatListener, "hyperVideoColorFormatListener");
        Intrinsics.checkNotNullParameter(hyperVideoLowStorageExceptionListener, "hyperVideoLowStorageExceptionListener");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger.Companion companion = HyperLogger.INSTANCE;
        HyperLogger companion2 = companion.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className2 = stackTraceElement.getClassName()) == null) {
            str = "N/A";
        } else {
            str = "N/A";
            str2 = StringsKt.L0(className2, '.', null, 2, null);
        }
        str2 = HyperVideoRecorder.class.getCanonicalName();
        if (str2 == null) {
            str2 = str;
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(str2);
        if (matcher.find()) {
            str2 = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
        }
        if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
            str2 = str2.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(str2);
        sb2.append(" - ");
        String str3 = "start() called with: window = " + window2 + ", videoFile = " + videoFile;
        if (str3 == null) {
            str3 = "null ";
        }
        sb2.append(str3);
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
        companion2.log(level, sb2.toString());
        if (this.isRecordingStarted) {
            return;
        }
        this.currentWindow = window2;
        if (window2 == null) {
            Intrinsics.v("currentWindow");
            window2 = null;
        }
        Object tag = window2.getDecorView().getRootView().getTag();
        this.cameraPreviewTag = tag != null ? tag.toString() : null;
        this.outputVideoFile = videoFile;
        this.isAutoColorFormatSelectionEnabled = autoColorFormatSelection;
        this.bitmapToVideoEncoder = new HyperVideoEncoder(new HyperVideoEncoder.HyperVideoEncoderCallback() { // from class: co.hyperverge.encoder.HyperVideoRecorder$start$2
            @Override // co.hyperverge.encoder.HyperVideoEncoder.HyperVideoEncoderCallback
            /* renamed from: getContext, reason: from getter */
            public Context get$context() {
                return context;
            }

            @Override // co.hyperverge.encoder.HyperVideoEncoder.HyperVideoEncoderCallback
            public void onColorFormatSelected(int colorFormat) {
                String canonicalName2;
                String className3;
                HyperLogger.Level level2 = HyperLogger.Level.DEBUG;
                HyperLogger companion3 = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb3 = new StringBuilder();
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                if ((stackTraceElement2 == null || (className3 = stackTraceElement2.getClassName()) == null || (canonicalName2 = StringsKt.L0(className3, '.', null, 2, null)) == null) && (canonicalName2 = HyperVideoRecorder$start$2.class.getCanonicalName()) == null) {
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
                String str4 = "onColorFormatSelected() called with: colorFormat = " + colorFormat;
                if (str4 == null) {
                    str4 = "null ";
                }
                sb3.append(str4);
                sb3.append(' ');
                sb3.append(org.conscrypt.BuildConfig.FLAVOR);
                companion3.log(level2, sb3.toString());
                hyperVideoColorFormatListener.invoke(colorFormat);
            }

            @Override // co.hyperverge.encoder.HyperVideoEncoder.HyperVideoEncoderCallback
            public void onEncodingComplete(File outputFile) {
                String canonicalName2;
                HyperVideoListener hyperVideoListener;
                String className3;
                HyperLogger.Level level2 = HyperLogger.Level.DEBUG;
                HyperLogger companion3 = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb3 = new StringBuilder();
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                if ((stackTraceElement2 == null || (className3 = stackTraceElement2.getClassName()) == null || (canonicalName2 = StringsKt.L0(className3, '.', null, 2, null)) == null) && (canonicalName2 = HyperVideoRecorder$start$2.class.getCanonicalName()) == null) {
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
                String str4 = "onEncodingComplete() called with: outputFile = " + outputFile;
                if (str4 == null) {
                    str4 = "null ";
                }
                sb3.append(str4);
                sb3.append(' ');
                sb3.append(org.conscrypt.BuildConfig.FLAVOR);
                companion3.log(level2, sb3.toString());
                hyperVideoListener = HyperVideoRecorder.this.mCallback;
                if (hyperVideoListener != null) {
                    hyperVideoListener.invoke(outputFile);
                }
            }

            @Override // co.hyperverge.encoder.HyperVideoEncoder.HyperVideoEncoderCallback
            public void onLowStorage() {
                String canonicalName2;
                String className3;
                HyperLogger.Level level2 = HyperLogger.Level.DEBUG;
                HyperLogger companion3 = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb3 = new StringBuilder();
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                if ((stackTraceElement2 == null || (className3 = stackTraceElement2.getClassName()) == null || (canonicalName2 = StringsKt.L0(className3, '.', null, 2, null)) == null) && (canonicalName2 = HyperVideoRecorder$start$2.class.getCanonicalName()) == null) {
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
                sb3.append("onLowStorage() called");
                sb3.append(' ');
                sb3.append(org.conscrypt.BuildConfig.FLAVOR);
                companion3.log(level2, sb3.toString());
                HyperVideoRecorder.stop$default(HyperVideoRecorder.this, null, 1, null);
                hyperVideoLowStorageExceptionListener.invoke();
            }
        });
        this.isRecordingStarted = true;
        HyperLogger companion3 = companion.getInstance();
        StringBuilder sb3 = new StringBuilder();
        StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
        StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
        if ((stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) && (canonicalName = HyperVideoRecorder.class.getCanonicalName()) == null) {
            canonicalName = str;
        }
        Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(canonicalName);
        if (matcher2.find()) {
            canonicalName = matcher2.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb3.append(canonicalName);
        sb3.append(" - ");
        sb3.append("start() HyperVideo started");
        sb3.append(' ');
        sb3.append(org.conscrypt.BuildConfig.FLAVOR);
        companion3.log(level, sb3.toString());
        createBitmaps();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
    
        if (r4 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        r4 = co.hyperverge.encoder.utils.extensions.LogExtsKt.ANON_CLASS_PATTERN.matcher(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r4.find() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r8 = r4.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "replaceAll(\"\")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
    
        if (r8.length() <= 23) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0102, code lost:
    
        r8 = r8.substring(0, 23);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "this as java.lang.String…ing(startIndex, endIndex)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        r3.append(r8);
        r3.append(" - ");
        r3.append("stop() Stopping HyperVideo");
        r3.append(' ');
        r3.append(org.conscrypt.BuildConfig.FLAVOR);
        r1.log(r2, r3.toString());
        r16.isRecordingStarted = false;
        r1 = r16.timer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        r1.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        r1 = r16.bitmapToVideoEncoder;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012e, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0130, code lost:
    
        kotlin.jvm.internal.Intrinsics.v("bitmapToVideoEncoder");
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0138, code lost:
    
        r12.stopEncoding$hv_bitmaps_to_video_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0137, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        if (r4 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void stop(HyperVideoListener callback) {
        String canonicalName;
        HyperVideoEncoder hyperVideoEncoder;
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
        String str = "N/A";
        if ((stackTraceElement == null || (className2 = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className2, '.', null, 2, null)) == null) && (canonicalName = HyperVideoRecorder.class.getCanonicalName()) == null) {
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
        String str2 = "stop() called with: callback = " + callback;
        if (str2 == null) {
            str2 = "null ";
        }
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
        companion2.log(level, sb2.toString());
        if (!this.isRecordingStarted) {
            return;
        }
        this.mCallback = callback;
        HyperLogger companion3 = companion.getInstance();
        StringBuilder sb3 = new StringBuilder();
        StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
        StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
        if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
            hyperVideoEncoder = null;
        } else {
            hyperVideoEncoder = null;
            canonicalName2 = StringsKt.L0(className, '.', null, 2, null);
        }
        canonicalName2 = HyperVideoRecorder.class.getCanonicalName();
    }

    private HyperVideoRecorder() {
        this.videoPath = org.conscrypt.BuildConfig.FLAVOR;
    }
}
