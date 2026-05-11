package co.hyperverge.facedetection;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Log;
import co.hyperverge.facedetection.Detectors.HVFaceDetector;
import co.hyperverge.facedetection.Detectors.MediaDetector;
import co.hyperverge.facedetection.Detectors.NDPDetector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FaceDetectorApi {
    public static final int DETECTOR_HV = 2;
    public static final int DETECTOR_MEDIA = 0;
    public static final int DETECTOR_MOBILE_VISION = 1;
    private static final String LOG_TAG = "co.hyperverge.facedetection.FaceDetectorApi";
    private static HVFaceDetector mDetector;

    public static ArrayList<ArrayList<Float>> detectFacesFromBitmap(Bitmap bitmap) {
        HVFaceDetector hVFaceDetector = mDetector;
        if (hVFaceDetector != null) {
            return ((NDPDetector) hVFaceDetector).detectFacesFromBitmap(bitmap);
        }
        Log.e(LOG_TAG, "Detector not initialized");
        return null;
    }

    public static ArrayList<ArrayList<Float>> detectFacesFromByteArray(byte[] bArr, int i10, int i11, int i12) {
        HVFaceDetector hVFaceDetector = mDetector;
        if (hVFaceDetector != null) {
            return ((NDPDetector) hVFaceDetector).detectFacesFromData(bArr, i10, i11, i12);
        }
        Log.e(LOG_TAG, "Detector not initialized");
        return null;
    }

    public static List<RectF> detectFacesFromByteArray2(byte[] bArr, int i10, int i11, int i12) {
        HVFaceDetector hVFaceDetector = mDetector;
        if (hVFaceDetector != null) {
            return ((NDPDetector) hVFaceDetector).detectFacesFromData2(bArr, i10, i11, i12);
        }
        Log.e(LOG_TAG, "Detector not initialized");
        return null;
    }

    public static List<HVFace> detectFacesFromFile(FileInterface fileInterface) {
        if (mDetector != null) {
            Log.i("ABCDE", "mDetector is not null");
            return mDetector.detectFaces(fileInterface);
        }
        Log.i("ABCDE", "mDetector is null");
        Log.e(LOG_TAG, "Detector not initialized");
        Log.i("ABCDE", "Returning null");
        return null;
    }

    public static int getAvgIntensity(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        Log.i("touchh", i12 + "," + i13 + "," + i14 + "," + i15);
        HVFaceDetector hVFaceDetector = mDetector;
        if (hVFaceDetector != null) {
            return ((NDPDetector) hVFaceDetector).getAvgIntensity(bArr, i10, i11, i12, i13, i14, i15, z10);
        }
        Log.e(LOG_TAG, "Detector not initialized");
        return -1;
    }

    public static void initialize(Context context, int i10) {
        release();
        if (i10 == 0) {
            MediaDetector mediaDetector = new MediaDetector();
            mDetector = mediaDetector;
            mediaDetector.initialize(context);
        } else {
            if (i10 != 2) {
                return;
            }
            NDPDetector nDPDetector = new NDPDetector();
            mDetector = nDPDetector;
            nDPDetector.initialize(context);
        }
    }

    public static void release() {
        HVFaceDetector hVFaceDetector = mDetector;
        if (hVFaceDetector != null) {
            hVFaceDetector.release();
            mDetector = null;
        }
    }
}
