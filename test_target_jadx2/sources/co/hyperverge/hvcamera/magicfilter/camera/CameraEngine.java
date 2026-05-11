package co.hyperverge.hvcamera.magicfilter.camera;

import android.content.Context;
import android.graphics.Point;
import co.hyperverge.hvcamera.HVLog;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CameraEngine {
    private static final String TAG = "co.hyperverge.hvcamera.magicfilter.camera.CameraEngine";
    public static float zoomFactor = 1.0f;
    public static JSONObject hardwareInfo = new JSONObject();
    public static boolean shouldUseDefaultZoom = false;
    public static boolean shouldRandomize = true;
    public static int lastUsedWidth = -1;
    public static int lastUsedHeight = -1;
    private static boolean useCamera2 = false;
    private static boolean setPreviewCallback = false;
    private static boolean isScreenFlashSet = false;
    private static boolean facePriority = false;

    public static void clearEvent(Object obj) {
        HVLog.d(TAG, "clearEvent() called with: o = [" + obj + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().clearEvent(null);
        } else {
            CameraEngine1.getInstance().clearEvent(null);
        }
    }

    public static boolean getCaptureMode() {
        HVLog.d(TAG, "getCaptureMode() called");
        return useCamera2 ? CameraEngine2.getInstance().getIsStillImageMode() : CameraEngine1.getInstance().getIsStillImageMode();
    }

    public static JSONObject getHardwareInfo() {
        HVLog.d(TAG, "getHardwareInfo() returned: " + hardwareInfo);
        return hardwareInfo;
    }

    public static void getNextPreviewFrame() {
        HVLog.d(TAG, "getNextPreviewFrame() called");
        if (useCamera2) {
            CameraEngine2.getInstance().returnNextFrame = true;
        } else {
            CameraEngine1.getInstance().returnNextFrame = true;
        }
    }

    public static int getOrientation() {
        HVLog.d(TAG, "getOrientation() called");
        return useCamera2 ? CameraEngine2.getInstance().getOrientation() : CameraEngine1.getInstance().getOrientation();
    }

    public static void init(Context context, boolean z10) {
        HVLog.d(TAG, "init() called with: context = [" + context + "], useFFC = [" + z10 + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().init(context, z10);
        } else {
            CameraEngine1.getInstance().setInitialFrontCam(z10);
        }
    }

    public static boolean isCamera2(Context context) {
        HVLog.d(TAG, "isCamera2() called with: context = [" + context + "]");
        return useCamera2;
    }

    public static boolean isCameraReleased() {
        HVLog.d(TAG, "isCameraReleased() called");
        return useCamera2 ? CameraEngine2.getInstance().isReleased() : CameraEngine1.getInstance().isReleased();
    }

    public static boolean isFacePriority() {
        HVLog.d(TAG, "isFacePriority() called");
        return facePriority;
    }

    public static boolean isFrontFacingCamera() {
        return useCamera2 ? CameraEngine2.getInstance().isFrontFacingCamera() : CameraEngine1.getInstance().isFrontFacingCamera();
    }

    public static boolean isScreenFlashSet() {
        HVLog.d(TAG, "isScreenFlashSet() called");
        return isScreenFlashSet;
    }

    public static boolean isSetPreviewCallback() {
        HVLog.d(TAG, "isSetPreviewCallback() called");
        return setPreviewCallback;
    }

    public static void nextFlashMode() {
        HVLog.d(TAG, "nextFlashMode() called");
        if (useCamera2) {
            CameraEngine2.getInstance().nextFlashMode();
        } else {
            CameraEngine1.getInstance().nextFlashMode();
        }
    }

    public static void resetZoom() {
        HVLog.d(TAG, "resetZoom() called");
        if (useCamera2) {
            return;
        }
        CameraEngine1.getInstance().resetZoom();
    }

    public static void rotateNV21a(byte[] bArr, int i10, int i11, int i12, byte[] bArr2) {
        int i13;
        int i14;
        if (i12 % 90 != 0 || i12 < 0 || i12 > 270) {
            throw new IllegalArgumentException("0 <= rotation < 360, rotation % 90 == 0");
        }
        boolean z10 = i12 % 180 != 0;
        boolean z11 = i12 % 270 != 0;
        boolean z12 = i12 >= 180;
        int i15 = z10 ? i11 : i10;
        int i16 = z10 ? i10 : i11;
        if (z10) {
            i13 = (z11 ? i15 - 1 : 0) + (z12 ? (i16 - 1) * i15 : 0);
            i14 = (i16 * i15) + 1;
        } else {
            i13 = (z11 ? i15 - 1 : 0) + ((z12 ? i16 - 1 : 0) * i15);
            i14 = 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < i11; i18++) {
            if (z10) {
                int i19 = 0;
                while (i19 < i10) {
                    int i20 = i17 + 1;
                    bArr2[i13] = (byte) (bArr[i17] & 255);
                    i13 += z12 ? -i15 : i15;
                    i19++;
                    i17 = i20;
                }
                i13 += z12 ? i14 : -i14;
            } else {
                int i21 = 0;
                while (i21 < i10) {
                    int i22 = i17 + 1;
                    bArr2[i13] = (byte) (bArr[i17] & 255);
                    i13 += z11 ? -1 : 1;
                    i21++;
                    i17 = i22;
                }
            }
        }
    }

    public static void setCaptureMode(boolean z10) {
        HVLog.d(TAG, "setCaptureMode() called with: stillCapture = [" + z10 + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().setIsStillImageMode(z10);
        } else {
            CameraEngine1.getInstance().setIsStillImageMode(z10);
        }
    }

    public static void setDefaultZoom(float f10) {
        HVLog.d(TAG, "setDefaultZoom() called with: delta = [" + f10 + "]");
        zoomFactor = f10;
        shouldUseDefaultZoom = true;
        if (useCamera2) {
            CameraEngine2.getInstance().setZoom(f10);
        } else {
            CameraEngine1.getInstance().setZoomLevel((int) f10);
        }
    }

    public static void setExposure(double d10) {
        HVLog.d(TAG, "setExposure() called with: exposure = [" + d10 + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().setExposure(d10);
        } else {
            CameraEngine1.getInstance().setExposure(d10);
        }
    }

    public static void setFacePriority(boolean z10) {
        HVLog.d(TAG, "setFacePriority() called with: facePriority = [" + z10 + "]");
        facePriority = z10;
    }

    public static void setFeatureConfig(Map<String, Boolean> map) {
        HVLog.d(TAG, "setFeatureConfig() called with: remoteConfigMapper = [" + map + "]");
        if (map.containsKey("camera2")) {
            useCamera2 = map.get("camera2").booleanValue();
        }
    }

    public static void setLastUsedResolution(int i10, int i11) {
        HVLog.d(TAG, "setLastUsedResolution() called with: width = [" + i10 + "], height = [" + i11 + "]");
        lastUsedWidth = i10;
        lastUsedHeight = i11;
    }

    public static void setOrientation(int i10) {
        HVLog.d(TAG, "setOrientation() called with: orientation = [" + i10 + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().setOrientation(i10);
        } else {
            CameraEngine1.getInstance().setOrientation(i10);
        }
    }

    public static void setPreviewCallback(boolean z10) {
        HVLog.d(TAG, "setPreviewCallback() called with: setPreviewCallback = [" + z10 + "]");
        setPreviewCallback = z10;
    }

    public static void setScreenFlash(boolean z10) {
        HVLog.d(TAG, "setScreenFlash() called with: isScreenFlashSet = [" + z10 + "]");
        isScreenFlashSet = z10;
    }

    public static void setScreenSize(Point point) {
        HVLog.d(TAG, "setScreenSize() called with: screenSize = [" + point + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().setScreenDisplaySize(point);
        } else {
            CameraEngine1.getInstance().setScreenDisplaySize(point);
        }
    }

    public static void setShouldRandomize(boolean z10) {
        HVLog.d(TAG, "setShouldRandomize() called with: shouldRandomize = [" + z10 + "]");
        shouldRandomize = z10;
    }

    public static void setShouldUseDefaultZoom(boolean z10) {
        HVLog.d(TAG, "setShouldUseDefaultZoom() called with: value = [" + z10 + "]");
        shouldUseDefaultZoom = z10;
        if (z10) {
            return;
        }
        zoomFactor = 1.0f;
    }

    public static void setUseEnhancedCameraFeatures(boolean z10) {
        HVLog.d(TAG, "setUseEnhancedCameraFeatures() called with: enhancedCameraFeatures = [" + z10 + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().setUseEnhancedCamera(z10);
        } else {
            CameraEngine1.getInstance().setUseEnhancedCamera(z10);
        }
    }

    public static void setZoom(float f10) {
        HVLog.d(TAG, "setZoom() called with: delta = [" + f10 + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().setZoom(f10);
        } else {
            CameraEngine1.getInstance().setZoom(f10);
        }
    }

    public static void setZoomBase() {
        HVLog.d(TAG, "setZoomBase() called");
        if (useCamera2) {
            return;
        }
        CameraEngine1.getInstance().setZoomBase();
    }

    public static void willNeedNextFrame(boolean z10) {
        HVLog.d(TAG, "willNeedNextFrame() called with: nextFramed = [" + z10 + "]");
        if (useCamera2) {
            CameraEngine2.getInstance().willNeedNextFrame = z10;
        }
    }
}
