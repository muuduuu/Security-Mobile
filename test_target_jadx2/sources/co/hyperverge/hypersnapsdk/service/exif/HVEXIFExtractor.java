package co.hyperverge.hypersnapsdk.service.exif;

import android.media.ExifInterface;
import android.util.Log;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.objects.HVExifData;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.IOException;

/* loaded from: classes.dex */
public class HVEXIFExtractor implements HVEXIFService {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.exif.HVEXIFExtractor";

    @Override // co.hyperverge.hypersnapsdk.service.exif.HVEXIFService
    public HVExifData extractExifDataFromImage(String str) {
        HVLogUtils.d(TAG, "extractExifDataFromImage() called with: imageUri = [" + str + "]");
        HVExifData hVExifData = new HVExifData();
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            hVExifData.setAperture(exifInterface.getAttribute("FNumber"));
            hVExifData.setDatetime(exifInterface.getAttribute("DateTime"));
            hVExifData.setExposureTime(exifInterface.getAttribute("ExposureTime"));
            hVExifData.setFlash(exifInterface.getAttribute("Flash"));
            hVExifData.setFocalLength(exifInterface.getAttribute("FocalLength"));
            hVExifData.setIso(exifInterface.getAttribute("ISOSpeedRatings"));
            hVExifData.setMake(exifInterface.getAttribute("Make"));
            hVExifData.setModel(exifInterface.getAttribute("Model"));
            hVExifData.setWhiteBalance(exifInterface.getAttribute("WhiteBalance"));
            hVExifData.setUserComment(exifInterface.getAttribute("UserComment"));
            float[] fArr = new float[2];
            boolean latLong = exifInterface.getLatLong(fArr);
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation() || latLong) {
                hVExifData.setLatitude(fArr[0]);
                hVExifData.setLongitude(fArr[1]);
            }
        } catch (IOException e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "extractExifDataFromImage() with: imageUri = [" + str + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return hVExifData;
    }
}
