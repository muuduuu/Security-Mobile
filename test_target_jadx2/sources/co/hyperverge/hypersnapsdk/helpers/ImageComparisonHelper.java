package co.hyperverge.hypersnapsdk.helpers;

import Td.E;
import Td.z;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.model.ImageComparisonObj;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.utils.threading.ThreadExecutor;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.PSKKeyManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ImageComparisonHelper {
    private static final int BLOCK_SIZE = 8;
    public static final int RESIZE_CONSTANT = 4;
    private static final String TAG = "ImageComparisonHelper";
    private static ImageComparisonHelper imageComparisonInstance;
    long totalPixels;
    private final int PATCH_SIZE = 50;
    private final int NUMBER_OF_PATCHES = 25;
    private final int END_TIMER = ModuleDescriptor.MODULE_VERSION;
    private final int FRAME_INTERVAL = 10;
    private final int FRAME_DATA_LENGTH_COUNTER = 10;
    int frameNumber = 0;
    private byte[][] previousFramePatches = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 25, 50);
    ImageComparisonObj imageComparisonObj = new ImageComparisonObj();
    AtomicBoolean jobDone = new AtomicBoolean(false);

    ImageComparisonHelper() {
    }

    private double calculateAverageDistance(List<Double> list) {
        double d10 = 0.0d;
        if (list == null || list.size() <= 0) {
            return 0.0d;
        }
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            d10 += it.next().doubleValue();
        }
        return d10 / list.size();
    }

    private int calculateEuclideanDistance(byte[] bArr, byte[] bArr2) {
        double d10 = 0.0d;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            d10 += Math.pow(bArr[i10] - bArr2[i10], 2.0d);
        }
        return (int) Math.sqrt(d10);
    }

    private byte[][] extract25PointGridPatches(byte[] bArr, int i10, int i11, boolean z10) {
        int i12 = z10 ? 4 : 3;
        int i13 = i10 / 6;
        int i14 = i11 / 6;
        byte[][] bArr2 = new byte[25][];
        int i15 = 0;
        int i16 = 1;
        while (i16 <= 5) {
            int i17 = i16 * i14;
            int i18 = i15;
            int i19 = 1;
            while (i19 <= 5) {
                bArr2[i18] = extractPatchAtPosition(bArr, i10, i12, i19 * i13, i17);
                i19++;
                i18++;
            }
            i16++;
            i15 = i18;
        }
        return bArr2;
    }

    private byte[] extractPatchAtPosition(byte[] bArr, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, Math.min((((i13 * i10) * i11) + (i12 * i11)) - 25, bArr.length - 50));
        return Arrays.copyOfRange(bArr, max, max + 50);
    }

    public static ImageComparisonHelper get() {
        if (imageComparisonInstance == null) {
            imageComparisonInstance = new ImageComparisonHelper();
        }
        return imageComparisonInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runComparisonMethods$0(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap makeBlocks;
        Bitmap makeBlocks2;
        try {
            try {
                get().performHistogramComparison(bitmap, bitmap2);
                makeBlocks = get().makeBlocks(bitmap);
                makeBlocks2 = get().makeBlocks(bitmap2);
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "runComparisonMethods(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            if (makeBlocks != null && makeBlocks2 != null) {
                get().performSimilarity(makeBlocks, makeBlocks2);
                makeBlocks.recycle();
                makeBlocks2.recycle();
                bitmap2.recycle();
                bitmap.recycle();
            }
        } finally {
            this.jobDone.set(true);
        }
    }

    private Integer[] normalizeBins(Integer[] numArr) {
        try {
            Integer[] numArr2 = new Integer[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            Arrays.fill((Object[]) numArr2, (Object) 0);
            float intValue = ((Integer) Collections.min(Arrays.asList(numArr))).intValue();
            float intValue2 = ((Integer) Collections.max(Arrays.asList(numArr))).intValue();
            for (int i10 = 0; i10 < numArr.length; i10++) {
                numArr2[i10] = Integer.valueOf(Math.round((((numArr[i10].intValue() - intValue) * 255.0f) / (intValue2 - intValue)) + 0.0f));
            }
            return numArr2;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "normalizeBins(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            return numArr;
        }
    }

    private static double performChiSquared(int[] iArr, int[] iArr2) {
        double d10 = 0.0d;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            double pow = Math.pow(iArr[i10] - iArr2[i10], 2.0d);
            double d11 = iArr[i10] + iArr2[i10];
            if (d11 > 0.0d) {
                d10 += pow / d11;
            }
        }
        return d10 * 0.5d;
    }

    private float performHellinger(Integer[] numArr, Integer[] numArr2) {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < numArr.length; i10++) {
            try {
                f10 = (float) (f10 + Math.pow(sqrt(numArr[i10].intValue()) - sqrt(numArr2[i10].intValue()), 2.0d));
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "performHellinger(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
                return 0.0f;
            }
        }
        return (1.0f / sqrt(2.0f)) * sqrt(f10);
    }

    private void resetVariables() {
        HVLogUtils.d(TAG, "resetVariables() called");
        this.imageComparisonObj.getFrameDistanceValue().clear();
        this.imageComparisonObj.setFrameDataLength(new ArrayList(Collections.nCopies(10, 0L)));
        this.jobDone.set(false);
        this.frameNumber = 0;
    }

    public void addRequestBodyParams(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "addRequestBodyParams() called with: params = [" + jSONObject + "]");
        if (SDKInternalConfig.getInstance().isShouldDoImageInjectionChecks()) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isEmulator", Utils.isEmulator());
                    jSONObject2.put(Keys.IMAGE_SIZE, this.imageComparisonObj.getImageWidth() + "X" + this.imageComparisonObj.getImageHeight());
                    jSONObject2.put("cameraCaptureSize", this.imageComparisonObj.getCaptureWidth() + "X" + this.imageComparisonObj.getCaptureHeight());
                    if (SDKInternalConfig.getInstance().isFaceDetectionOn()) {
                        while (!this.jobDone.get() && System.currentTimeMillis() - currentTimeMillis <= 10000) {
                        }
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(round(this.imageComparisonObj.getRedChannelDistance()));
                        jSONArray.put(round(this.imageComparisonObj.getGreenChannelDistance()));
                        jSONArray.put(round(this.imageComparisonObj.getBlueChannelDistance()));
                        jSONObject2.put("frameDiffs", new JSONArray((Collection) this.imageComparisonObj.getFrameDistanceValue()));
                        jSONObject2.put("frameDataLength", new JSONArray((Collection) this.imageComparisonObj.getFrameDataLength()));
                        if (this.jobDone.get()) {
                            jSONObject2.put("channelDiffs", jSONArray);
                            jSONObject2.put("blocksDiff", this.imageComparisonObj.getSimilarityScore());
                        }
                    }
                    E.create(z.g("text/plain"), jSONObject2.toString());
                    jSONObject.put("captureData", jSONObject2.toString());
                } catch (Exception e10) {
                    HVLogUtils.e(TAG, "addRequestBodyParams(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                    Log.e(TAG, Utils.getErrorMessage(e10));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                    }
                }
                resetVariables();
            } catch (Throwable th) {
                resetVariables();
                throw th;
            }
        }
    }

    public List<Float> calculateDistance(List<Integer[]> list, List<Integer[]> list2) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                arrayList.add(Float.valueOf(performHellinger(list.get(i10), list2.get(i10))));
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "calculateDistance(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        return arrayList;
    }

    public void compareConsecutiveFrames(byte[] bArr, long j10, int i10, int i11, Boolean bool) {
        if (SDKInternalConfig.getInstance() == null || !SDKInternalConfig.getInstance().isShouldDoImageInjectionChecks()) {
            return;
        }
        try {
            if (this.frameNumber == 0) {
                this.previousFramePatches = extract25PointGridPatches(bArr, i10, i11, bool.booleanValue());
            }
            this.imageComparisonObj.getFrameDataLength().set(this.frameNumber % 10, Long.valueOf(j10));
            int i12 = this.frameNumber + 1;
            this.frameNumber = i12;
            if (i12 % 10 == 0) {
                byte[][] extract25PointGridPatches = extract25PointGridPatches(bArr, i10, i11, bool.booleanValue());
                int i13 = 0;
                for (int i14 = 0; i14 < 25; i14++) {
                    i13 += calculateEuclideanDistance(extract25PointGridPatches[i14], this.previousFramePatches[i14]);
                }
                this.imageComparisonObj.getFrameDistanceValue().add(Integer.valueOf(i13 / 25));
                this.previousFramePatches = extract25PointGridPatches;
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "compareConsecutiveFrames(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void destroy() {
        HVLogUtils.d(TAG, "destroy() called");
        imageComparisonInstance = null;
    }

    public List<Integer[]> getHistogram(Bitmap bitmap) {
        HVLogUtils.d(TAG, "getHistogram() called");
        ArrayList arrayList = new ArrayList();
        try {
            Integer[] numArr = new Integer[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            Arrays.fill((Object[]) numArr, (Object) 0);
            Integer[] numArr2 = new Integer[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            Arrays.fill((Object[]) numArr2, (Object) 0);
            Integer[] numArr3 = new Integer[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            Arrays.fill((Object[]) numArr3, (Object) 0);
            this.totalPixels = bitmap.getWidth() * bitmap.getHeight();
            int width = bitmap.getWidth() * bitmap.getHeight();
            int[] iArr = new int[width];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            for (int i10 = 0; i10 < width; i10++) {
                int i11 = iArr[i10];
                int red = Color.red(i11);
                int green = Color.green(i11);
                int blue = Color.blue(i11);
                numArr[red] = Integer.valueOf(numArr[red].intValue() + 1);
                numArr2[green] = Integer.valueOf(numArr2[green].intValue() + 1);
                numArr3[blue] = Integer.valueOf(numArr3[blue].intValue() + 1);
            }
            arrayList.add(normalizeBins(numArr));
            arrayList.add(normalizeBins(numArr2));
            arrayList.add(normalizeBins(numArr3));
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: OutOfMemoryError -> 0x0065, Exception -> 0x008b, LOOP:2: B:20:0x0092->B:21:0x0094, LOOP_END, TryCatch #0 {OutOfMemoryError -> 0x0065, blocks: (B:3:0x0008, B:8:0x0035, B:11:0x003c, B:13:0x0042, B:15:0x004e, B:18:0x0061, B:21:0x0094, B:23:0x00a8, B:26:0x00b9, B:27:0x00cb, B:31:0x00c2, B:32:0x00c7, B:35:0x006e, B:37:0x007f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap makeBlocks(Bitmap bitmap) {
        int[] iArr;
        int i10;
        int i11;
        HVLogUtils.d(TAG, "makeBlocks() called");
        try {
            try {
                int width = bitmap.getWidth();
                get();
                int height = bitmap.getHeight();
                get();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width / 4, height / 4, false);
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), createScaledBitmap.getConfig());
                if (createBitmap == null) {
                    return null;
                }
                int i12 = 0;
                while (i12 < createScaledBitmap.getWidth()) {
                    int i13 = 0;
                    while (i13 < createScaledBitmap.getHeight()) {
                        int width2 = createScaledBitmap.getWidth() * createScaledBitmap.getHeight();
                        int[] iArr2 = new int[width2];
                        try {
                            iArr = iArr2;
                            i10 = width2;
                        } catch (Exception e10) {
                            e = e10;
                            iArr = iArr2;
                            i10 = width2;
                        }
                        try {
                            createScaledBitmap.getPixels(iArr2, 0, createScaledBitmap.getWidth(), i12, i13, 8, 8);
                        } catch (Exception e11) {
                            e = e11;
                            Log.e(TAG, Utils.getErrorMessage(e));
                            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                            }
                            int i14 = 0;
                            int i15 = 0;
                            int i16 = 0;
                            while (i11 < i10) {
                            }
                            int[] iArr3 = new int[createScaledBitmap.getWidth() * createScaledBitmap.getHeight()];
                            Arrays.fill(iArr3, (i14 >= i15 || i14 < i16) ? (i15 >= i14 || i15 < i16) ? Color.rgb(0, 0, 255) : Color.rgb(0, 255, 0) : Color.rgb(255, 0, 0));
                            int i17 = i13;
                            int i18 = i12;
                            createBitmap.setPixels(iArr3, 0, createBitmap.getWidth(), i12, i13, 8, 8);
                            i13 = i17 + 8;
                            i12 = i18;
                        }
                        int i142 = 0;
                        int i152 = 0;
                        int i162 = 0;
                        for (i11 = 0; i11 < i10; i11++) {
                            int i19 = iArr[i11];
                            i142 += Color.red(i19);
                            i152 += Color.green(i19);
                            i162 += Color.blue(i19);
                        }
                        int[] iArr32 = new int[createScaledBitmap.getWidth() * createScaledBitmap.getHeight()];
                        Arrays.fill(iArr32, (i142 >= i152 || i142 < i162) ? (i152 >= i142 || i152 < i162) ? Color.rgb(0, 0, 255) : Color.rgb(0, 255, 0) : Color.rgb(255, 0, 0));
                        int i172 = i13;
                        int i182 = i12;
                        createBitmap.setPixels(iArr32, 0, createBitmap.getWidth(), i12, i13, 8, 8);
                        i13 = i172 + 8;
                        i12 = i182;
                    }
                    i12 += 8;
                }
                return createBitmap;
            } catch (OutOfMemoryError e12) {
                e = e12;
                HVLogUtils.e(TAG, "makeBlocks(): exception = [" + Utils.getErrorMessage(e) + "]", e);
                Log.e(TAG, Utils.getErrorMessage(e));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    return null;
                }
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                return null;
            }
        } catch (Exception e13) {
            e = e13;
            HVLogUtils.e(TAG, "makeBlocks(): exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(TAG, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            }
        }
    }

    public void performHistogramComparison(Bitmap bitmap, Bitmap bitmap2) {
        HVLogUtils.d(TAG, "performHistogramComparison() called");
        try {
            List<Float> calculateDistance = calculateDistance(getHistogram(bitmap), getHistogram(bitmap2));
            if (calculateDistance == null || calculateDistance.isEmpty()) {
                return;
            }
            this.imageComparisonObj.setRedChannelDistance(calculateDistance.get(0).floatValue());
            this.imageComparisonObj.setGreenChannelDistance(calculateDistance.get(1).floatValue());
            this.imageComparisonObj.setBlueChannelDistance(calculateDistance.get(2).floatValue());
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "performHistogramComparison(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public float performSimilarity(Bitmap bitmap, Bitmap bitmap2) {
        HVLogUtils.d(TAG, "performSimilarity() called");
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < bitmap.getWidth(); i12 += 8) {
            try {
                for (int i13 = 0; i13 < bitmap.getHeight(); i13 += 8) {
                    i11++;
                    if (bitmap.getPixel(i12, i13) == bitmap2.getPixel(i12, i13)) {
                        i10++;
                    }
                }
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        float f10 = (i10 * 100) / i11;
        this.imageComparisonObj.setSimilarityScore(f10);
        return f10;
    }

    public double round(float f10) {
        HVLogUtils.d(TAG, "round() called with: value = [" + f10 + "]");
        double round = ((double) Math.round(((double) f10) * 100.0d)) / 100.0d;
        HVLogUtils.d(TAG, "round() returned: " + round);
        return round;
    }

    public void runComparisonMethods(final Bitmap bitmap, final Bitmap bitmap2) {
        HVLogUtils.d(TAG, "runComparisonMethods() called");
        ThreadExecutor.getInstance().execute(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.d
            @Override // java.lang.Runnable
            public final void run() {
                ImageComparisonHelper.this.lambda$runComparisonMethods$0(bitmap, bitmap2);
            }
        });
    }

    public void setImageSize(int i10, int i11) {
        HVLogUtils.d(TAG, "setImageSize() called with: width = [" + i10 + "], height = [" + i11 + "]");
        this.imageComparisonObj.setImageWidth(i10);
        this.imageComparisonObj.setImageHeight(i11);
    }

    public void setPictureSize(int i10, int i11) {
        HVLogUtils.d(TAG, "setPictureSize() called with: width = [" + i10 + "], height = [" + i11 + "]");
        this.imageComparisonObj.setCaptureWidth(i10);
        this.imageComparisonObj.setCaptureHeight(i11);
    }

    public float sqrt(float f10) {
        if (f10 > 0.0f) {
            return (float) Math.sqrt(f10);
        }
        return 0.0f;
    }
}
