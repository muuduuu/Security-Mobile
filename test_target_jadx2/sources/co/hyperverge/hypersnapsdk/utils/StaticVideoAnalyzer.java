package co.hyperverge.hypersnapsdk.utils;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.O;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002J'\u0010\u001a\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lco/hyperverge/hypersnapsdk/utils/StaticVideoAnalyzer;", BuildConfig.FLAVOR, "()V", "isVideoStatic", BuildConfig.FLAVOR, "analyze", BuildConfig.FLAVOR, "videoPath", BuildConfig.FLAVOR, "retriever", "Landroid/media/MediaMetadataRetriever;", "videoAnalysisCallback", "Lco/hyperverge/hypersnapsdk/utils/StaticVideoAnalyzer$VideoAnalysisCallback;", "calculateAbsoluteError", BuildConfig.FLAVOR, "bitmap1", "Landroid/graphics/Bitmap;", "bitmap2", "extractAndCompareFrames", "isNonPlainImage", "bitmap", "sampleRate", BuildConfig.FLAVOR, "recycleBitmaps", "previousFrame", "currentFrame", "isIdenticalAs", "other", "tolerance", BuildConfig.FLAVOR, "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;D)Ljava/lang/Boolean;", "Companion", "VideoAnalysisCallback", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaticVideoAnalyzer {
    private static final String TAG = "StaticVideoAnalyzer";
    private boolean isVideoStatic = true;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lco/hyperverge/hypersnapsdk/utils/StaticVideoAnalyzer$VideoAnalysisCallback;", BuildConfig.FLAVOR, "onAnalysisComplete", BuildConfig.FLAVOR, "isStatic", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface VideoAnalysisCallback {
        void onAnalysisComplete(boolean isStatic);
    }

    private final long calculateAbsoluteError(Bitmap bitmap1, Bitmap bitmap2) {
        HVLogUtils.d(TAG, "calculateAbsoluteError called");
        if (bitmap1.getWidth() != bitmap2.getWidth() || bitmap1.getHeight() != bitmap2.getHeight()) {
            throw new IllegalArgumentException("Bitmaps must have the same dimensions");
        }
        int width = bitmap1.getWidth();
        int height = bitmap1.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        bitmap1.getPixels(iArr, 0, width, 0, 0, width, height);
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            int i13 = (iArr2[i11] >> 16) & 255;
            j10 += Math.abs(((i12 >> 16) & 255) - i13) + Math.abs(((i12 >> 8) & 255) - ((r5 >> 8) & 255)) + Math.abs((i12 & 255) - (r5 & 255));
        }
        HVLogUtils.d(TAG, "calculateAbsoluteError result: " + j10);
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (r20 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        recycleBitmaps$default(r25, r7, r9, r1, r9);
        r19 = r2;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        if (r20 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean extractAndCompareFrames(MediaMetadataRetriever retriever) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i10;
        Bitmap bitmap3;
        int i11;
        Bitmap bitmap4;
        Bitmap bitmap5;
        MediaMetadataRetriever mediaMetadataRetriever = retriever;
        HVLogUtils.d(TAG, "extractAndCompareFrames called");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        int i12 = 0;
        kotlin.ranges.b o10 = kotlin.ranges.d.o(kotlin.ranges.d.q(0, extractMetadata != null ? Long.parseLong(extractMetadata) : 0L), 125L);
        long c10 = o10.c();
        long e10 = o10.e();
        long h10 = o10.h();
        Bitmap bitmap6 = null;
        if ((h10 > 0 && c10 <= e10) || (h10 < 0 && e10 <= c10)) {
            long j10 = c10;
            bitmap = null;
            Bitmap bitmap7 = null;
            int i13 = 1;
            while (true) {
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1000 * j10, 3);
                if (frameAtTime == null) {
                    bitmap3 = bitmap6;
                    i11 = i12;
                } else {
                    boolean isNonPlainImage$default = i13 != 0 ? isNonPlainImage$default(this, frameAtTime, i12, 2, bitmap6) : true;
                    if (isNonPlainImage$default) {
                        bitmap4 = frameAtTime;
                        Bitmap bitmap8 = bitmap7;
                        bitmap3 = bitmap6;
                        try {
                            if (Intrinsics.b(isIdenticalAs$default(this, bitmap7, frameAtTime, 0.0d, 2, null), Boolean.FALSE)) {
                                bitmap5 = bitmap8;
                                try {
                                    recycleBitmaps(bitmap5, bitmap4);
                                    if (!isNonPlainImage$default) {
                                        return false;
                                    }
                                    recycleBitmaps$default(this, bitmap5, bitmap3, 2, bitmap3);
                                    return false;
                                } catch (Exception e11) {
                                    e = e11;
                                    i10 = 2;
                                    i11 = 0;
                                    try {
                                        HVLogUtils.e(TAG, "Error extracting frame: " + e.getMessage());
                                    } catch (Throwable th) {
                                        th = th;
                                        if (isNonPlainImage$default) {
                                            recycleBitmaps$default(this, bitmap5, bitmap3, i10, bitmap3);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i10 = 2;
                                    if (isNonPlainImage$default) {
                                    }
                                    throw th;
                                }
                            } else {
                                bitmap5 = bitmap8;
                                i10 = 2;
                                i11 = 0;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            bitmap5 = bitmap8;
                        } catch (Throwable th3) {
                            th = th3;
                            bitmap5 = bitmap8;
                        }
                    } else {
                        i10 = 2;
                        bitmap3 = bitmap6;
                        i11 = i12;
                        bitmap4 = frameAtTime;
                        bitmap5 = bitmap7;
                    }
                }
                if (j10 == e10) {
                    bitmap2 = bitmap7;
                    break;
                }
                j10 += h10;
                i12 = i11;
                bitmap6 = bitmap3;
                mediaMetadataRetriever = retriever;
            }
        } else {
            bitmap = null;
            bitmap2 = null;
        }
        recycleBitmaps(bitmap2, bitmap);
        return true;
    }

    private final Boolean isIdenticalAs(Bitmap bitmap, Bitmap bitmap2, double d10) {
        HVLogUtils.d(TAG, "Bitmap.isIdenticalAs called");
        if (bitmap == null) {
            return null;
        }
        return Boolean.valueOf(calculateAbsoluteError(bitmap, bitmap2) <= ((long) (((double) ((bitmap.getWidth() * bitmap.getHeight()) * 765)) * d10)));
    }

    static /* synthetic */ Boolean isIdenticalAs$default(StaticVideoAnalyzer staticVideoAnalyzer, Bitmap bitmap, Bitmap bitmap2, double d10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = 0.01d;
        }
        return staticVideoAnalyzer.isIdenticalAs(bitmap, bitmap2, d10);
    }

    private final boolean isNonPlainImage(Bitmap bitmap, int sampleRate) {
        HVLogUtils.d(TAG, "isNonPlainImage called with sampleRate: " + sampleRate);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.a n10 = kotlin.ranges.d.n(kotlin.ranges.d.p(0, height), sampleRate);
        int c10 = n10.c();
        int e10 = n10.e();
        int h10 = n10.h();
        if ((h10 > 0 && c10 <= e10) || (h10 < 0 && e10 <= c10)) {
            while (true) {
                kotlin.ranges.a n11 = kotlin.ranges.d.n(kotlin.ranges.d.p(0, width), sampleRate);
                int c11 = n11.c();
                int e11 = n11.e();
                int h11 = n11.h();
                if ((h11 > 0 && c11 <= e11) || (h11 < 0 && e11 <= c11)) {
                    while (true) {
                        arrayList.add(Integer.valueOf(bitmap.getPixel(c11, c10)));
                        if (c11 == e11) {
                            break;
                        }
                        c11 += h11;
                    }
                }
                if (c10 == e10) {
                    break;
                }
                c10 += h10;
            }
        }
        int size = arrayList.size();
        int intValue = ((Number) arrayList.get(0)).intValue();
        int i10 = 1;
        for (int i11 = 1; i11 < size; i11++) {
            if (((Number) arrayList.get(i11)).intValue() == intValue) {
                i10++;
            } else {
                i10--;
                if (i10 == 0) {
                    intValue = ((Number) arrayList.get(i11)).intValue();
                    i10 = 1;
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (((Number) it.next()).intValue() == intValue) {
                i12++;
            }
        }
        return ((double) i12) < ((double) size) * 0.9d;
    }

    static /* synthetic */ boolean isNonPlainImage$default(StaticVideoAnalyzer staticVideoAnalyzer, Bitmap bitmap, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        return staticVideoAnalyzer.isNonPlainImage(bitmap, i10);
    }

    private final void recycleBitmaps(Bitmap previousFrame, Bitmap currentFrame) {
        HVLogUtils.d(TAG, "recycleBitmaps called");
        if (previousFrame != null) {
            previousFrame.recycle();
        }
        if (currentFrame != null) {
            currentFrame.recycle();
        }
    }

    static /* synthetic */ void recycleBitmaps$default(StaticVideoAnalyzer staticVideoAnalyzer, Bitmap bitmap, Bitmap bitmap2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = null;
        }
        if ((i10 & 2) != 0) {
            bitmap2 = null;
        }
        staticVideoAnalyzer.recycleBitmaps(bitmap, bitmap2);
    }

    public final void analyze(String videoPath, MediaMetadataRetriever retriever, VideoAnalysisCallback videoAnalysisCallback) {
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(retriever, "retriever");
        Intrinsics.checkNotNullParameter(videoAnalysisCallback, "videoAnalysisCallback");
        HVLogUtils.d(TAG, "analyze called with videoPath: " + videoPath);
        AbstractC0891k.d(O.a(C0874b0.a()), null, null, new StaticVideoAnalyzer$analyze$1(retriever, videoPath, this, videoAnalysisCallback, null), 3, null);
    }
}
