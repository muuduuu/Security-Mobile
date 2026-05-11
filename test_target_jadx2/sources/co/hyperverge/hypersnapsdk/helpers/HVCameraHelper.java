package co.hyperverge.hypersnapsdk.helpers;

import android.content.Context;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.util.HashMap;

/* loaded from: classes.dex */
public class HVCameraHelper {
    private static final String TAG = "HVCameraHelper";

    public static void enableCameraParameters(Context context, boolean z10, boolean z11) {
        HVLogUtils.d(TAG, "enableCameraParameters() called with: context = [" + context + "], useBackCamera = [" + z10 + "]");
        String infoHardwareLevel = Utils.getInfoHardwareLevel(context, z10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("enableCameraParameters(): level = [");
        sb2.append(infoHardwareLevel);
        sb2.append("]");
        HVLogUtils.d(TAG, sb2.toString());
        if (z11) {
            AppConstants.cameraType = AppConstants.CAMERAX;
            return;
        }
        HashMap hashMap = new HashMap();
        boolean shouldUseCamera2 = SDKInternalConfig.getInstance().shouldUseCamera2();
        HVLogUtils.d(TAG, "enableCameraParameters(): shouldUseCamera2 = [" + shouldUseCamera2 + "]");
        if (SDKInternalConfig.getInstance().isAutoCamSelectionEnabled(infoHardwareLevel)) {
            shouldUseCamera2 = true;
        }
        hashMap.put("camera2", Boolean.valueOf(shouldUseCamera2));
        CameraEngine.setFeatureConfig(hashMap);
        AppConstants.cameraType = CameraEngine.isCamera2(null) ? "camera2" : "camera1";
    }
}
