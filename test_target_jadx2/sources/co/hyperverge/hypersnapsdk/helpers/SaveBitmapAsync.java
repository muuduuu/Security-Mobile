package co.hyperverge.hypersnapsdk.helpers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import co.hyperverge.hvcamera.magicfilter.utils.Exif;
import co.hyperverge.hypersnapsdk.BuildConfig;
import co.hyperverge.hypersnapsdk.helpers.FileHelper;
import co.hyperverge.hypersnapsdk.helpers.face.MLKitFaceHelper;
import co.hyperverge.hypersnapsdk.model.HVFaceObj;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.BitmapUtils;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import g9.C3201a;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class SaveBitmapAsync implements Runnable {
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.SaveBitmapAsync";
    private Bitmap bitmap;
    private final SaveCallBack callBack;
    private final byte[] data;
    private final HVFaceConfig faceConfig;
    HVFaceObj faceObj;
    private final String filePath;
    private final String filename;
    private final String mTransactionId;
    private Bitmap previewFrameBitmap;
    private final byte[] previewFrameData;
    private final Integer rotationDegrees;
    private List<Integer> faceCoords = new ArrayList();
    boolean isFaceDetectorExcluded = false;

    public interface SaveCallBack {
        void onImageSaved(String str, List<Integer> list, boolean z10);
    }

    public SaveBitmapAsync(byte[] bArr, byte[] bArr2, Bitmap bitmap, Integer num, String str, String str2, HVFaceConfig hVFaceConfig, String str3, SaveCallBack saveCallBack) {
        this.data = bArr;
        this.filePath = str;
        this.filename = str2;
        this.callBack = saveCallBack;
        this.faceConfig = hVFaceConfig;
        this.previewFrameData = bArr2;
        this.previewFrameBitmap = bitmap;
        this.rotationDegrees = num;
        this.mTransactionId = str3;
    }

    private void setColorToRandomPixel(Bitmap bitmap) {
        int i10;
        HVLogUtils.d(TAG, "setColorToRandomPixel() called with: bitmap = [" + bitmap + "]");
        try {
            if (StringUtils.isEmptyOrNull(this.mTransactionId)) {
                i10 = 0;
            } else {
                byte[] bytes = this.mTransactionId.getBytes(StandardCharsets.US_ASCII);
                Arrays.toString(bytes);
                i10 = 0;
                for (byte b10 : bytes) {
                    i10 += b10;
                }
            }
            int i11 = 0;
            for (String str : BuildConfig.HYPERSNAP_VERSION_NAME.split("\\.")) {
                i11 += Integer.parseInt(str);
            }
            int i12 = i10 + i11;
            if (i12 >= bitmap.getHeight() || i12 >= bitmap.getWidth()) {
                i12 = Math.floorMod(i12, bitmap.getWidth());
            }
            int i13 = i12 + 1;
            bitmap.setPixel(i12, i12, -16777216);
            bitmap.setPixel(i13, i13, -1);
        } catch (Exception e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "setColorToRandomPixel(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void checkForPose(C3201a c3201a) {
        boolean z10;
        HVLogUtils.d(TAG, "checkForPose() called with: mlkitFace = [" + c3201a + "]");
        if (this.faceConfig.isShouldCheckActiveLiveness()) {
            z10 = HVActiveLiveness.get().detectFaceFromImage(c3201a);
        } else {
            float d10 = c3201a.d();
            float c10 = c3201a.c();
            float e10 = c3201a.e();
            float faceTiltAngle = this.faceConfig.getFaceTiltAngle();
            z10 = Math.abs(d10) <= faceTiltAngle && Math.abs(c10) <= faceTiltAngle && Math.abs(e10) <= faceTiltAngle;
        }
        if (z10) {
            proceedToSaveBitmap(this.bitmap);
        } else {
            this.callBack.onImageSaved(null, this.faceCoords, this.isFaceDetectorExcluded);
        }
    }

    public void fallbackToNPD(Bitmap bitmap) {
        HVLogUtils.d(TAG, "fallbackToNPD() called with: bitmap = [" + bitmap + "]");
        HVFaceObj faceFromBitmapNPD = FileHelper.getFaceFromBitmapNPD(bitmap);
        this.isFaceDetectorExcluded = faceFromBitmapNPD == null && (SDKInternalConfig.getInstance().isMLKitDetectorMissing() || SDKInternalConfig.getInstance().isMLKitUnavailable());
        this.faceCoords = FileHelper.getCoordinatesFromFaceObj(faceFromBitmapNPD, bitmap);
        proceedToSaveBitmap(bitmap);
    }

    public Bitmap getBitmapFromBufferData(int i10) {
        HVLogUtils.d(TAG, "getBitmapFromBufferData() called with: exifOrientation = [" + i10 + "]");
        byte[] bArr = this.data;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        this.bitmap = decodeByteArray;
        Bitmap rotateBitmap = UIUtils.rotateBitmap(decodeByteArray, i10);
        this.bitmap = rotateBitmap;
        return rotateBitmap;
    }

    public Bitmap getCroppedBitmap(Bitmap bitmap) {
        HVLogUtils.d(TAG, "getCroppedBitmap() called with: bitmap = [" + bitmap + "]");
        try {
            return FileHelper.getCroppedFaceFromBitmap(bitmap, this.faceCoords, this.faceConfig);
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "getCroppedBitmap(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public void performImageInjectionChecks(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap;
        HVLogUtils.d(TAG, "performImageInjectionChecks() called with: previousFrameBitmap = [" + bitmap + "], fullImageBitmap = [" + bitmap2 + "]");
        try {
            setColorToRandomPixel(bitmap2);
            if (!bitmap.sameAs(bitmap2) && (bitmap2.getWidth() != bitmap.getWidth() || bitmap2.getHeight() != bitmap.getHeight())) {
                createBitmap = Bitmap.createScaledBitmap(bitmap2, bitmap.getWidth(), bitmap.getHeight(), false);
                ImageComparisonHelper.get().runComparisonMethods(bitmap, createBitmap);
            }
            createBitmap = Bitmap.createBitmap(bitmap2);
            ImageComparisonHelper.get().runComparisonMethods(bitmap, createBitmap);
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "performImageInjectionChecks(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void proceedToSaveBitmap(Bitmap bitmap) {
        HVLogUtils.d(TAG, "proceedToSaveBitmap() called with: bitmap = [" + bitmap + "]");
        if (SDKInternalConfig.getInstance().isShouldDoImageInjectionChecks()) {
            ImageComparisonHelper.get().setImageSize(bitmap.getHeight(), bitmap.getWidth());
            Bitmap bitmap2 = this.previewFrameBitmap;
            if (bitmap2 == null) {
                byte[] bArr = this.previewFrameData;
                if (bArr != null) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    this.previewFrameBitmap = decodeByteArray;
                    performImageInjectionChecks(decodeByteArray, bitmap);
                }
            } else {
                Integer num = this.rotationDegrees;
                Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmap2, num != null ? num.floatValue() : 0.0f);
                this.previewFrameBitmap = rotateBitmap;
                performImageInjectionChecks(rotateBitmap, bitmap);
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.filePath, this.filename));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap croppedBitmap = getCroppedBitmap(bitmap);
            if (croppedBitmap == null) {
                this.callBack.onImageSaved(null, this.faceCoords, this.isFaceDetectorExcluded);
                return;
            }
            File file = new File(this.filePath, "FD_crop_" + System.currentTimeMillis() + ".jpg");
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            FileHelper.Dimensions dimensions = new FileHelper.Dimensions(croppedBitmap.getWidth(), croppedBitmap.getHeight());
            FileHelper.Dimensions scaledDim = FileHelper.getScaledDim(dimensions, 300);
            new BitmapFactory.Options().inSampleSize = FileHelper.calculateInSampleSize(dimensions, scaledDim);
            try {
                if (scaledDim.width < croppedBitmap.getWidth()) {
                    croppedBitmap = Bitmap.createScaledBitmap(croppedBitmap, scaledDim.width, scaledDim.height, true);
                }
            } catch (Exception e10) {
                this.callBack.onImageSaved(null, this.faceCoords, this.isFaceDetectorExcluded);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            croppedBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream2);
            fileOutputStream2.close();
            this.callBack.onImageSaved(file.getAbsolutePath(), this.faceCoords, this.isFaceDetectorExcluded);
        } catch (Exception e11) {
            String str = TAG;
            HVLogUtils.e(str, "proceedToSaveBitmap(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            this.callBack.onImageSaved(null, this.faceCoords, this.isFaceDetectorExcluded);
            Log.e(str, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        HVLogUtils.d(TAG, "run() called");
        int orientation = Exif.getOrientation(this.data);
        if (this.faceConfig.getShouldUseBackCamera()) {
            orientation = Utils.checkForOrientationCorrection(orientation);
        }
        Bitmap bitmapFromBufferData = getBitmapFromBufferData(orientation);
        this.bitmap = bitmapFromBufferData;
        if (bitmapFromBufferData == null) {
            this.callBack.onImageSaved(null, this.faceCoords, this.isFaceDetectorExcluded);
            return;
        }
        try {
            if (SDKInternalConfig.getInstance().isMLKitDetectorMissing()) {
                fallbackToNPD(this.bitmap);
                return;
            }
            C3201a processImage = MLKitFaceHelper.get().processImage(this.bitmap);
            if (processImage == null) {
                fallbackToNPD(this.bitmap);
                return;
            }
            this.faceCoords = Utils.getHVFaceObj(processImage, this.bitmap);
            if (!this.faceConfig.shouldCheckForFaceTilt() && !this.faceConfig.isShouldCheckActiveLiveness()) {
                proceedToSaveBitmap(this.bitmap);
                return;
            }
            checkForPose(processImage);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            SDKInternalConfig.getInstance().setMLKitUnavailable(true);
            AppConstants.mlkitUnavailableError = Utils.getErrorMessage(e10);
            fallbackToNPD(this.bitmap);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }
}
