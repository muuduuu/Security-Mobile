package co.hyperverge.hvcamera;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HVCamUtils {
    private static final String TAG = "HVCamUtils";
    public static int currentRotation = 0;
    public static int lastRotation = -1;
    public static Camera.Size newChosensize;

    public static void applyBestPreviewSize(Camera camera, int i10, int i11, float f10) {
        HVLog.d(TAG, "applyBestPreviewSize() called with: mCamera = [" + camera + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "], megapixels = [" + f10 + "]");
        Camera.Parameters parameters = camera.getParameters();
        Camera.Size bestPreviewSize = getBestPreviewSize(camera, i10, i11, f10);
        parameters.setPreviewSize(bestPreviewSize.width, bestPreviewSize.height);
        camera.setParameters(parameters);
    }

    public static Camera.Size checkIfSizeExists(List<Camera.Size> list, Camera.Size size, float f10, int i10, int i11) {
        HVLog.d(TAG, "checkIfSizeExists() called with: captures = [" + list + "], chosenSize = [" + size + "], megapixels = [" + f10 + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "]");
        if (size == null || !list.contains(size)) {
            Iterator<Camera.Size> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Camera.Size next = it.next();
                if (next.width * i10 == next.height * i11) {
                    newChosensize = next;
                    break;
                }
            }
        }
        return newChosensize;
    }

    private static void convertToString(List<Camera.Size> list) {
        HVLog.d(TAG, "convertToString() called with: captures = [" + list + "]");
        try {
            String str = org.conscrypt.BuildConfig.FLAVOR;
            for (Camera.Size size : list) {
                str = str + size.width + "X" + size.height;
            }
            CameraEngine.hardwareInfo.put("resolutions", str);
        } catch (Exception e10) {
            HVLog.e(TAG, e10.getLocalizedMessage());
        }
    }

    public static Camera.Size getBestPictureSize(Camera camera, int i10, int i11, float f10, boolean z10) {
        HVLog.d(TAG, "getBestPictureSize() called with: mCamera = [" + camera + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "], megapixels = [" + f10 + "], shouldCaptureHighResolutionImage = [" + z10 + "]");
        List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
        convertToString(supportedPictureSizes);
        sortSizes(supportedPictureSizes);
        if (z10 && !supportedPictureSizes.isEmpty()) {
            newChosensize = supportedPictureSizes.get(0);
        }
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPictureSizes) {
            int i12 = size.width;
            int i13 = i12 * i10;
            int i14 = size.height;
            if (i13 == i14 * i11 && ((int) (1000000.0f * f10)) > i12 * i14 && i12 >= 640 && i14 >= 480) {
                arrayList.add(size);
            }
        }
        if (CameraEngine.shouldRandomize && arrayList.size() > 1) {
            newChosensize = getRandomResolution(arrayList);
        } else if (!arrayList.isEmpty()) {
            newChosensize = (Camera.Size) arrayList.get(0);
        }
        return checkIfSizeExists(supportedPictureSizes, newChosensize, f10, i10, i11);
    }

    public static Camera.Size getBestPreviewKitkat(Camera camera, int i10, int i11, float f10) {
        HVLog.d(TAG, "getBestPreviewKitkat() called with: mCamera = [" + camera + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "], megapixels = [" + f10 + "]");
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        sortSizeByClosestArea(supportedPreviewSizes, 0);
        for (Camera.Size size : supportedPreviewSizes) {
            if ((Math.abs(size.width - 480) < 10 && Math.abs(size.height - 360) < 10) || (size.width == 1280 && size.height == 720)) {
                return size;
            }
        }
        return null;
    }

    public static Camera.Size getBestPreviewSize(Camera camera, int i10, int i11, float f10) {
        HVLog.d(TAG, "getBestPreviewSize() called with: mCamera = [" + camera + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "], megapixels = [" + f10 + "]");
        CameraEngine.getCaptureMode();
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        sortSizeByClosestArea(supportedPreviewSizes, (int) (f10 * 1000000.0f));
        for (Camera.Size size : supportedPreviewSizes) {
            if (size.width * i10 == size.height * i11) {
                return size;
            }
        }
        return null;
    }

    public static Camera getCameraInstance(int i10) {
        HVLog.d(TAG, "getCameraInstance() called with: id = [" + i10 + "]");
        try {
            return Camera.open(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Camera.Size getRandomResolution(List<Camera.Size> list) {
        HVLog.d(TAG, "getRandomResolution() called with: resolutions = [" + list + "]");
        Camera.Size size = newChosensize;
        if (size != null) {
            return size;
        }
        int size2 = list.size();
        newChosensize = list.get(new SecureRandom().nextInt(size2));
        while (newChosensize.width == CameraEngine.lastUsedWidth && newChosensize.height == CameraEngine.lastUsedHeight && list.size() > 1) {
            newChosensize = list.get(new SecureRandom().nextInt(size2));
        }
        return newChosensize;
    }

    public static boolean hasSupport_16_9(Camera camera) {
        HVLog.d(TAG, "hasSupport_16_9() called with: camera = [" + camera + "]");
        CameraEngine.getCaptureMode();
        for (Camera.Size size : camera.getParameters().getSupportedPreviewSizes()) {
            if (size.width * 9 == size.height * 16) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSupport_16_9KitKat(Camera camera) {
        HVLog.d(TAG, "hasSupport_16_9KitKat() called with: camera = [" + camera + "]");
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        sortSizeByClosestArea(supportedPreviewSizes, 0);
        for (Camera.Size size : supportedPreviewSizes) {
            if (Math.abs(size.width - 480) < 10 && Math.abs(size.height - 360) < 10) {
                return false;
            }
            if (size.width == 1280 && size.height == 720) {
                return true;
            }
        }
        return false;
    }

    public static void scanMediaFile(Context context, String str) {
        HVLog.d(TAG, "scanMediaFile() called with: context = [" + context + "], file = [" + str + "]");
        scanMediaFile(context, new File(str));
    }

    public static void setCameraDisplayOrientation(int i10, Camera camera) {
        HVLog.d(TAG, "setCameraDisplayOrientation() called with: cameraId = [" + i10 + "], camera = [" + camera + "]");
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i10, cameraInfo);
        camera.setDisplayOrientation(cameraInfo.facing == 1 ? (360 - (cameraInfo.orientation % 360)) % 360 : (cameraInfo.orientation + 360) % 360);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        if (r5.get("rotation").equals(org.conscrypt.BuildConfig.FLAVOR + r3) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setPictureOrientation(int i10, Camera camera, int i11) {
        HVLog.d(TAG, "setPictureOrientation() called with: cameraId = [" + i10 + "], mCamera = [" + camera + "], orientation = [" + i11 + "]");
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i10, cameraInfo);
        int i12 = ((i11 + 45) / 90) * 90;
        int i13 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i12) + 360) % 360 : (cameraInfo.orientation + i12) % 360;
        if (lastRotation != i13) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.get("rotation") != null) {
            }
            parameters.setRotation(i13);
            camera.setParameters(parameters);
            currentRotation = i13;
            lastRotation = i13;
        }
    }

    public static void sortSizeByClosestArea(List<Camera.Size> list, final int i10) {
        HVLog.d(TAG, "sortSizeByClosestArea() called with: sizes = [" + list + "], area = [" + i10 + "]");
        Collections.sort(list, new Comparator<Camera.Size>() { // from class: co.hyperverge.hvcamera.HVCamUtils.2
            @Override // java.util.Comparator
            public int compare(Camera.Size size, Camera.Size size2) {
                return Math.abs((size.width * size.height) - i10) - Math.abs((size2.width * size2.height) - i10);
            }
        });
    }

    public static void sortSizes(List<Camera.Size> list) {
        HVLog.d(TAG, "sortSizes() called with: sizes = [" + list + "]");
        Collections.sort(list, new Comparator<Camera.Size>() { // from class: co.hyperverge.hvcamera.HVCamUtils.1
            @Override // java.util.Comparator
            public int compare(Camera.Size size, Camera.Size size2) {
                return (size2.width * size2.height) - (size.width * size.height);
            }
        });
    }

    public static void scanMediaFile(Context context, File file) {
        HVLog.d(TAG, "scanMediaFile() called with: context = [" + context + "], file = [" + file + "]");
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }
}
