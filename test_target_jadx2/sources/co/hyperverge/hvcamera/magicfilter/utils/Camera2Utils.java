package co.hyperverge.hvcamera.magicfilter.utils;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import co.hyperverge.hvcamera.HVLog;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class Camera2Utils {
    private static final String TAG = "Camera2Utils";
    public static Size newChosensize;

    public static Size checkIfSizeExists(StreamConfigurationMap streamConfigurationMap, Size size, float f10, int i10, int i11) {
        HVLog.d(TAG, "checkIfSizeExists() called with: sMap = [" + streamConfigurationMap + "], chosenSize = [" + size + "], megaPixels = [" + f10 + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "]");
        ArrayList<Size> arrayList = new ArrayList(Arrays.asList(streamConfigurationMap.getOutputSizes(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        convertToString(arrayList, "jpgResolutions");
        sortSizeByClosestArea(arrayList, (int) (f10 * 1000000.0f));
        if (size == null || !arrayList.contains(size)) {
            for (Size size2 : arrayList) {
                if (size2.getWidth() * i10 == size2.getHeight() * i11) {
                    newChosensize = size2;
                    return size2;
                }
            }
        }
        return size;
    }

    private static void convertToString(List<Size> list, String str) {
        HVLog.d(TAG, "convertToString() called with: captures = [" + list + "], keyName = [" + str + "]");
        try {
            String str2 = BuildConfig.FLAVOR;
            for (Size size : list) {
                str2 = str2 + size.getWidth() + "X" + size.getHeight();
            }
            CameraEngine.hardwareInfo.put(str, str2);
        } catch (Exception e10) {
            HVLog.e(TAG, "convertToString: " + e10.getLocalizedMessage());
        }
    }

    public static Size getBestCaptureSize(StreamConfigurationMap streamConfigurationMap, int i10, int i11, float f10, boolean z10) {
        HVLog.d(TAG, "getBestCaptureSize() called with: sMap = [" + streamConfigurationMap + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "], megaPixels = [" + f10 + "], shouldCaptureHighResolutionImage = [" + z10 + "]");
        ArrayList<Size> arrayList = new ArrayList(Arrays.asList(streamConfigurationMap.getOutputSizes(35)));
        convertToString(arrayList, "yuvResolutions");
        int i12 = (int) (1000000.0f * f10);
        sortSizeByClosestArea(arrayList, i12);
        if (!z10 || arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Size size : arrayList) {
                if (size.getWidth() * i10 == size.getHeight() * i11 && i12 > size.getWidth() * size.getHeight() && size.getWidth() >= 480 && size.getHeight() >= 640) {
                    arrayList2.add(size);
                }
            }
            if (CameraEngine.shouldRandomize && arrayList2.size() > 1) {
                newChosensize = getRandomResolution(arrayList2);
            } else if (!arrayList2.isEmpty()) {
                newChosensize = (Size) arrayList2.get(0);
            }
        } else {
            newChosensize = (Size) arrayList.get(0);
        }
        return checkIfSizeExists(streamConfigurationMap, newChosensize, f10, i10, i11);
    }

    public static Size getBestPreviewSize(StreamConfigurationMap streamConfigurationMap, int i10, int i11, float f10) {
        HVLog.d(TAG, "getBestPreviewSize() called with: sMap = [" + streamConfigurationMap + "], mRatioWidth = [" + i10 + "], mRatioHeight = [" + i11 + "], megaPixels = [" + f10 + "]");
        Size size = new Size(HVFrameRecorder.VIDEO_WIDTH, HVFrameRecorder.VIDEO_HEIGHT);
        try {
            ArrayList<Size> arrayList = new ArrayList(Arrays.asList(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)));
            sortSizeByClosestArea(arrayList, (int) (f10 * 1000000.0f));
            for (Size size2 : arrayList) {
                if (size2.getWidth() * i10 == size2.getHeight() * i11) {
                    return size2;
                }
            }
        } catch (AssertionError | Exception e10) {
            HVLog.e(TAG, "getBestPreviewSize error: " + e10.getLocalizedMessage());
        }
        return size;
    }

    public static Size getRandomResolution(List<Size> list) {
        HVLog.d(TAG, "getRandomResolution() called with: resolutions = [" + list + "]");
        int size = list.size();
        newChosensize = list.get(new SecureRandom().nextInt(size));
        while (newChosensize.getWidth() == CameraEngine.lastUsedWidth && newChosensize.getHeight() == CameraEngine.lastUsedHeight && list.size() > 1) {
            newChosensize = list.get(new SecureRandom().nextInt(size));
        }
        return newChosensize;
    }

    public static void sortSizeByClosestArea(List<Size> list, final int i10) {
        HVLog.d(TAG, "sortSizeByClosestArea() called with: sizes = [" + list + "], area = [" + i10 + "]");
        Collections.sort(list, new Comparator<Size>() { // from class: co.hyperverge.hvcamera.magicfilter.utils.Camera2Utils.1
            @Override // java.util.Comparator
            public int compare(Size size, Size size2) {
                return Math.abs((size.getWidth() * size.getHeight()) - i10) - Math.abs((size2.getWidth() * size2.getHeight()) - i10);
            }
        });
    }
}
