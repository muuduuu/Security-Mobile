package co.hyperverge.hypersnapsdk.helpers;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import co.hyperverge.facedetection.FaceDetectorApi;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.CameraProperties;
import co.hyperverge.hypersnapsdk.helpers.FaceCoordinateObjsManager;
import co.hyperverge.hypersnapsdk.model.FaceDetectorObj;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class CamPreviewFaceDetectionHandler extends HandlerThread {
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.CamPreviewFaceDetectionHandler";
    private static int count;
    static CamPreviewFaceDetectionHandler detectionHandler;
    private final Handler backHandler;
    boolean isFrontfacingCamera;
    NPDFaceListener npdFaceListener;
    private final float[] tapCoordinates;
    private final Handler uiHandler;
    private int viewHeight;
    private int viewWidth;

    public class DetectionRunnable implements Runnable {
        public byte[] data;
        public int height;
        private final boolean isCapturedFramePreviewed;
        private final boolean isFrontFacingCam;
        public int mRotation;
        public int orientation;
        public int width;
        public ArrayList<ArrayList<Float>> matrices = new ArrayList<>();
        public FaceCoordinateObjsManager.FaceCoordinateObject faceCoordinateObject = new FaceCoordinateObjsManager.FaceCoordinateObject(System.currentTimeMillis());

        public DetectionRunnable(byte[] bArr, int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            this.data = bArr;
            this.width = i10;
            this.height = i11;
            this.orientation = i12;
            this.mRotation = i13;
            this.isFrontFacingCam = z10;
            this.isCapturedFramePreviewed = z11;
        }

        public ArrayList<Float> getLargestMatrix(ArrayList<ArrayList<Float>> arrayList) {
            ArrayList<Float> arrayList2 = arrayList.get(0);
            float floatValue = (arrayList2.get(4).floatValue() - arrayList2.get(0).floatValue()) * (arrayList2.get(3).floatValue() - arrayList2.get(1).floatValue());
            Iterator<ArrayList<Float>> it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList<Float> next = it.next();
                if ((next.get(4).floatValue() - next.get(0).floatValue()) * (next.get(3).floatValue() - next.get(1).floatValue()) > floatValue) {
                    floatValue = (next.get(4).floatValue() - next.get(0).floatValue()) * (next.get(3).floatValue() - next.get(1).floatValue());
                    arrayList2 = next;
                }
            }
            return arrayList2;
        }

        public void rotateCoordinates() {
            float f10;
            float f11;
            float f12;
            float f13;
            int i10 = this.mRotation;
            if (i10 != 0) {
                if (i10 == 90) {
                    f12 = CamPreviewFaceDetectionHandler.this.tapCoordinates[0];
                    f13 = CamPreviewFaceDetectionHandler.this.tapCoordinates[1];
                } else if (i10 == 180) {
                    f12 = 1.0f - CamPreviewFaceDetectionHandler.this.tapCoordinates[1];
                    f13 = CamPreviewFaceDetectionHandler.this.tapCoordinates[0];
                } else if (i10 != 270) {
                    f11 = 1.0f - CamPreviewFaceDetectionHandler.this.tapCoordinates[0];
                    f10 = CamPreviewFaceDetectionHandler.this.tapCoordinates[1];
                } else {
                    f11 = 1.0f - CamPreviewFaceDetectionHandler.this.tapCoordinates[0];
                    f10 = CamPreviewFaceDetectionHandler.this.tapCoordinates[1];
                }
                f11 = f12;
                f10 = 1.0f - f13;
            } else {
                float f14 = CamPreviewFaceDetectionHandler.this.tapCoordinates[0];
                f10 = 1.0f - CamPreviewFaceDetectionHandler.this.tapCoordinates[0];
                f11 = CamPreviewFaceDetectionHandler.this.tapCoordinates[1];
            }
            CamPreviewFaceDetectionHandler.this.tapCoordinates[0] = f11;
            CamPreviewFaceDetectionHandler.this.tapCoordinates[1] = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            try {
                FaceCoordinateObjsManager.FaceCoordinateObject latestFaceCoordinateObject = FaceCoordinateObjsManager.getLatestFaceCoordinateObject();
                if (CamPreviewFaceDetectionHandler.this.tapCoordinates[0] > 0.0f) {
                    rotateCoordinates();
                    i10 = FaceDetectorApi.getAvgIntensity(this.data, this.width, this.height, Math.max(0, Math.round(CamPreviewFaceDetectionHandler.this.tapCoordinates[0] * this.width) - 20), Math.min(this.width, Math.round(CamPreviewFaceDetectionHandler.this.tapCoordinates[0] * this.width) + 20), Math.max(0, Math.round(CamPreviewFaceDetectionHandler.this.tapCoordinates[1] * this.height) - 20), Math.min(this.height, Math.round(CamPreviewFaceDetectionHandler.this.tapCoordinates[1] * this.height) + 20), false);
                    Log.i("avgtouch", i10 + BuildConfig.FLAVOR);
                    CamPreviewFaceDetectionHandler.this.setExposure(Math.log(89.0d) - Math.log((double) i10));
                    int unused = CamPreviewFaceDetectionHandler.count = 0;
                    CamPreviewFaceDetectionHandler.this.tapCoordinates[0] = -1.0f;
                    CamPreviewFaceDetectionHandler.this.tapCoordinates[1] = -1.0f;
                } else if (latestFaceCoordinateObject == null || CamPreviewFaceDetectionHandler.count % 10 != 0) {
                    i10 = -1;
                } else {
                    byte[] bArr = this.data;
                    int i11 = this.width;
                    i10 = FaceDetectorApi.getAvgIntensity(bArr, i11, this.height, Math.round((i11 / 100.0f) * latestFaceCoordinateObject.getTopLeftX()), Math.round((this.width / 100.0f) * latestFaceCoordinateObject.getBottomRightX()), Math.round((this.height / 100.0f) * latestFaceCoordinateObject.getTopLeftY()), Math.round((this.height / 100.0f) * latestFaceCoordinateObject.getBottomRightY()), true);
                }
                CamPreviewFaceDetectionHandler.count++;
                CamPreviewFaceDetectionHandler.count %= 10;
                this.matrices = FaceDetectorApi.detectFacesFromByteArray(this.data, this.width, this.height, this.mRotation % 180 == 0 ? 0 : 1);
                this.faceCoordinateObject.setDetectionTimeStamp(System.currentTimeMillis());
                CamPreviewFaceDetectionHandler.this.uiHandler.removeCallbacksAndMessages(null);
                ArrayList<ArrayList<Float>> arrayList = this.matrices;
                if (arrayList != null && arrayList.size() != 0) {
                    ArrayList<Float> largestMatrix = getLargestMatrix(this.matrices);
                    if (i10 > 0 && latestFaceCoordinateObject != null && (StrictMath.abs(((largestMatrix.get(0).floatValue() * 100.0f) + (largestMatrix.get(4).floatValue() * 100.0f)) - (latestFaceCoordinateObject.getTopLeftX() + latestFaceCoordinateObject.getBottomRightX())) * this.width) / 200.0f < 15.0f && (StrictMath.abs(((largestMatrix.get(1).floatValue() * 100.0f) + (largestMatrix.get(3).floatValue() * 100.0f)) - (latestFaceCoordinateObject.getTopLeftY() + latestFaceCoordinateObject.getBottomRightY())) * this.height) / 200.0f < 15.0f) {
                        Log.i("avg", i10 + BuildConfig.FLAVOR);
                        CamPreviewFaceDetectionHandler.this.setExposure(Math.log(89.0d) - Math.log((double) i10));
                        int unused2 = CamPreviewFaceDetectionHandler.count = 1;
                    }
                    ArrayList<ArrayList<Float>> arrayList2 = this.matrices;
                    if (arrayList2 == null || arrayList2.size() <= 1) {
                        CamPreviewFaceDetectionHandler.this.uiHandler.post(CamPreviewFaceDetectionHandler.this.new VertexRunnable(largestMatrix, this.orientation, this.faceCoordinateObject, this.isFrontFacingCam, this.isCapturedFramePreviewed, null));
                        return;
                    } else {
                        CamPreviewFaceDetectionHandler.this.uiHandler.post(CamPreviewFaceDetectionHandler.this.new VertexRunnable(largestMatrix, this.orientation, this.faceCoordinateObject, this.isFrontFacingCam, this.isCapturedFramePreviewed, this.matrices));
                        return;
                    }
                }
                CamPreviewFaceDetectionHandler.this.uiHandler.post(CamPreviewFaceDetectionHandler.this.new VertexRunnable(null, this.orientation, this.faceCoordinateObject, this.isFrontFacingCam, this.isCapturedFramePreviewed, null));
            } catch (IllegalArgumentException e10) {
                Log.e(CamPreviewFaceDetectionHandler.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    public interface NPDFaceListener {
        void onFaceDetected(FaceDetectorObj faceDetectorObj);
    }

    public class VertexRunnable implements Runnable {
        FaceCoordinateObjsManager.FaceCoordinateObject faceCoordinateObject;
        boolean isCapturedFramePreviewed;
        boolean isFrontFacingCam;
        boolean isMultipleFaces;
        ArrayList<ArrayList<Float>> matrices;
        private ArrayList<Float> matrix;
        int orientation;

        public VertexRunnable(ArrayList<Float> arrayList, int i10, FaceCoordinateObjsManager.FaceCoordinateObject faceCoordinateObject, boolean z10, boolean z11, ArrayList<ArrayList<Float>> arrayList2) {
            this.matrix = new ArrayList<>();
            new ArrayList();
            this.matrix = arrayList;
            this.orientation = i10;
            this.faceCoordinateObject = faceCoordinateObject;
            this.isFrontFacingCam = z10;
            this.isCapturedFramePreviewed = z11;
            this.matrices = arrayList2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x01dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ArrayList<Integer> getDiagonalEdgesOfBoxMirrored(int i10, ArrayList<Float> arrayList) {
            int i11;
            int i12;
            int i13;
            int i14;
            int floatValue;
            int i15;
            int i16;
            if (i10 != 0) {
                if (i10 == 90) {
                    int floatValue2 = (int) (arrayList.get(1).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                    int floatValue3 = (int) (arrayList.get(0).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight);
                    int floatValue4 = (int) (arrayList.get(5).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                    double d10 = (floatValue4 - floatValue2) * 0.25d;
                    i12 = (int) (floatValue2 - d10);
                    double d11 = (r2 - floatValue3) * 0.35d;
                    i13 = (int) (floatValue3 - d11);
                    i14 = (int) (floatValue4 + d10);
                    floatValue = (int) (((int) (arrayList.get(4).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight)) + d11);
                    i11 = 0;
                } else if (i10 == 180) {
                    int floatValue5 = (int) (arrayList.get(2).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                    int floatValue6 = (int) ((1.0f - arrayList.get(3).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight);
                    int floatValue7 = (int) (arrayList.get(6).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                    double d12 = (floatValue7 - floatValue5) * 0.35d;
                    i12 = (int) (floatValue5 - d12);
                    double d13 = (r2 - floatValue6) * 0.25d;
                    i15 = (int) (floatValue6 - d13);
                    i16 = (int) (floatValue7 + d12);
                    floatValue = (int) (((int) ((1.0f - arrayList.get(7).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight)) + d13);
                } else {
                    int floatValue8 = (int) ((1.0f - arrayList.get(5).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
                    int floatValue9 = (int) ((1.0f - arrayList.get(4).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight);
                    int floatValue10 = (int) ((1.0f - arrayList.get(1).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
                    i11 = 0;
                    double d14 = (floatValue10 - floatValue8) * 0.35d;
                    i12 = (int) (floatValue8 - d14);
                    double d15 = (r2 - floatValue9) * 0.25d;
                    i13 = (int) (floatValue9 - d15);
                    i14 = (int) (floatValue10 + d14);
                    floatValue = (int) (((int) ((1.0f - arrayList.get(0).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight)) + d15);
                }
                int i17 = i14;
                i15 = i13;
                i16 = i17;
                if (i12 <= 0) {
                    i12 = i11;
                }
                int i18 = i15 <= 0 ? i15 : i11;
                if (floatValue > CamPreviewFaceDetectionHandler.this.viewHeight - 3) {
                    floatValue = CamPreviewFaceDetectionHandler.this.viewHeight - 3;
                }
                if (i16 > CamPreviewFaceDetectionHandler.this.viewWidth - 3) {
                    i16 = CamPreviewFaceDetectionHandler.this.viewWidth - 3;
                }
                return new ArrayList<>(Arrays.asList(Integer.valueOf(i12), Integer.valueOf(i18), Integer.valueOf(i16), Integer.valueOf(floatValue)));
            }
            int floatValue11 = (int) ((1.0f - arrayList.get(6).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
            int floatValue12 = (int) (arrayList.get(7).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight);
            int floatValue13 = (int) ((1.0f - arrayList.get(2).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
            double d16 = (floatValue13 - floatValue11) * 0.25d;
            i12 = (int) (floatValue11 - d16);
            double d17 = (r2 - floatValue12) * 0.35d;
            i15 = (int) (floatValue12 - d17);
            i16 = (int) (floatValue13 + d16);
            floatValue = (int) (((int) (arrayList.get(3).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight)) + d17);
            i11 = 0;
            if (i12 <= 0) {
            }
            if (i15 <= 0) {
            }
            if (floatValue > CamPreviewFaceDetectionHandler.this.viewHeight - 3) {
            }
            if (i16 > CamPreviewFaceDetectionHandler.this.viewWidth - 3) {
            }
            return new ArrayList<>(Arrays.asList(Integer.valueOf(i12), Integer.valueOf(i18), Integer.valueOf(i16), Integer.valueOf(floatValue)));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x01c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ArrayList<Integer> getDiagonalEdgesOfBox(int i10, ArrayList<Float> arrayList) {
            int i11;
            int i12;
            int i13;
            int i14;
            double floatValue;
            int i15;
            int i16;
            double floatValue2;
            if (i10 == 0) {
                int floatValue3 = (int) (arrayList.get(0).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                int floatValue4 = (int) (arrayList.get(1).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight);
                int floatValue5 = (int) (arrayList.get(4).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                double d10 = (floatValue5 - floatValue3) * 0.25d;
                i12 = (int) (floatValue3 - d10);
                double d11 = (r2 - floatValue4) * 0.35d;
                i13 = (int) (floatValue4 - d11);
                i16 = (int) (floatValue5 + d10);
                floatValue2 = ((int) (arrayList.get(5).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight)) + d11;
            } else {
                if (i10 != 90) {
                    if (i10 == 180) {
                        int floatValue6 = (int) ((1.0f - arrayList.get(4).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
                        int floatValue7 = (int) ((1.0f - arrayList.get(5).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight);
                        i11 = 0;
                        int floatValue8 = (int) ((1.0f - arrayList.get(0).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
                        double d12 = (floatValue8 - floatValue6) * 0.25d;
                        i12 = (int) (floatValue6 - d12);
                        double d13 = (r2 - floatValue7) * 0.35d;
                        i13 = (int) (floatValue7 - d13);
                        i14 = (int) (floatValue8 + d12);
                        floatValue = ((int) ((1.0f - arrayList.get(1).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight)) + d13;
                    } else {
                        i11 = 0;
                        int floatValue9 = (int) ((1.0f - arrayList.get(3).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
                        int floatValue10 = (int) (arrayList.get(2).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight);
                        int floatValue11 = (int) ((1.0f - arrayList.get(7).floatValue()) * CamPreviewFaceDetectionHandler.this.viewWidth);
                        double d14 = (floatValue11 - floatValue9) * 0.35d;
                        i12 = (int) (floatValue9 - d14);
                        double d15 = (r2 - floatValue10) * 0.25d;
                        i13 = (int) (floatValue10 - d15);
                        i14 = (int) (floatValue11 + d14);
                        floatValue = ((int) (arrayList.get(6).floatValue() * CamPreviewFaceDetectionHandler.this.viewHeight)) + d15;
                    }
                    i15 = (int) floatValue;
                    if (i12 <= 0) {
                        i12 = i11;
                    }
                    int i17 = i13 <= 0 ? i13 : i11;
                    if (i15 > CamPreviewFaceDetectionHandler.this.viewHeight - 3) {
                        i15 = CamPreviewFaceDetectionHandler.this.viewHeight - 3;
                    }
                    if (i14 > CamPreviewFaceDetectionHandler.this.viewWidth - 3) {
                        i14 = CamPreviewFaceDetectionHandler.this.viewWidth - 3;
                    }
                    return new ArrayList<>(Arrays.asList(Integer.valueOf(i12), Integer.valueOf(i17), Integer.valueOf(i14), Integer.valueOf(i15)));
                }
                int floatValue12 = (int) (arrayList.get(7).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                int floatValue13 = (int) ((1.0f - arrayList.get(6).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight);
                int floatValue14 = (int) (arrayList.get(3).floatValue() * CamPreviewFaceDetectionHandler.this.viewWidth);
                double d16 = (floatValue14 - floatValue12) * 0.35d;
                i12 = (int) (floatValue12 - d16);
                double d17 = (r2 - floatValue13) * 0.25d;
                i13 = (int) (floatValue13 - d17);
                i16 = (int) (floatValue14 + d16);
                floatValue2 = ((int) ((1.0f - arrayList.get(2).floatValue()) * CamPreviewFaceDetectionHandler.this.viewHeight)) + d17;
            }
            i15 = (int) floatValue2;
            i14 = i16;
            i11 = 0;
            if (i12 <= 0) {
            }
            if (i13 <= 0) {
            }
            if (i15 > CamPreviewFaceDetectionHandler.this.viewHeight - 3) {
            }
            if (i14 > CamPreviewFaceDetectionHandler.this.viewWidth - 3) {
            }
            return new ArrayList<>(Arrays.asList(Integer.valueOf(i12), Integer.valueOf(i17), Integer.valueOf(i14), Integer.valueOf(i15)));
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.matrix == null) {
                NPDFaceListener nPDFaceListener = CamPreviewFaceDetectionHandler.this.npdFaceListener;
                if (nPDFaceListener != null) {
                    nPDFaceListener.onFaceDetected(new FaceDetectorObj(new ArrayList(), null, 0, 0, null));
                    return;
                }
                return;
            }
            if (this.matrices == null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.CamPreviewFaceDetectionHandler.VertexRunnable.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ArrayList arrayList = new ArrayList();
                        float floatValue = ((Float) VertexRunnable.this.matrix.get(4)).floatValue() - ((Float) VertexRunnable.this.matrix.get(0)).floatValue();
                        float floatValue2 = ((Float) VertexRunnable.this.matrix.get(5)).floatValue() - ((Float) VertexRunnable.this.matrix.get(1)).floatValue();
                        float f10 = floatValue * 0.35f;
                        float floatValue3 = (((Float) VertexRunnable.this.matrix.get(0)).floatValue() - f10) * 100.0f < 0.0f ? 0.0f : (((Float) VertexRunnable.this.matrix.get(0)).floatValue() - f10) * 100.0f;
                        float f11 = floatValue2 * 0.45f;
                        float floatValue4 = (((Float) VertexRunnable.this.matrix.get(1)).floatValue() - f11) * 100.0f >= 0.0f ? (((Float) VertexRunnable.this.matrix.get(1)).floatValue() - f11) * 100.0f : 0.0f;
                        float floatValue5 = (((Float) VertexRunnable.this.matrix.get(4)).floatValue() + f10) * 100.0f > 100.0f ? 100.0f : (((Float) VertexRunnable.this.matrix.get(4)).floatValue() + f10) * 100.0f;
                        float floatValue6 = (((Float) VertexRunnable.this.matrix.get(5)).floatValue() + f11) * 100.0f <= 100.0f ? 100.0f * (((Float) VertexRunnable.this.matrix.get(5)).floatValue() + f11) : 100.0f;
                        arrayList.add(Float.valueOf(floatValue3));
                        arrayList.add(Float.valueOf(floatValue4));
                        arrayList.add(Float.valueOf(floatValue5));
                        arrayList.add(Float.valueOf(floatValue6));
                        VertexRunnable.this.faceCoordinateObject.setCoordinates(arrayList);
                        FaceCoordinateObjsManager.addNewFaceCoordinateObject(VertexRunnable.this.faceCoordinateObject);
                        VertexRunnable vertexRunnable = VertexRunnable.this;
                        ArrayList<Integer> diagonalEdgesOfBox = vertexRunnable.getDiagonalEdgesOfBox(vertexRunnable.orientation, vertexRunnable.matrix);
                        VertexRunnable vertexRunnable2 = VertexRunnable.this;
                        CamPreviewFaceDetectionHandler camPreviewFaceDetectionHandler = CamPreviewFaceDetectionHandler.this;
                        NPDFaceListener nPDFaceListener2 = camPreviewFaceDetectionHandler.npdFaceListener;
                        if (nPDFaceListener2 != null) {
                            nPDFaceListener2.onFaceDetected(new FaceDetectorObj(diagonalEdgesOfBox, vertexRunnable2.faceCoordinateObject, camPreviewFaceDetectionHandler.viewWidth, CamPreviewFaceDetectionHandler.this.viewHeight, null));
                        }
                    }
                });
            } else {
                final ArrayList arrayList = new ArrayList();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.CamPreviewFaceDetectionHandler.VertexRunnable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator<ArrayList<Float>> it = VertexRunnable.this.matrices.iterator();
                        while (it.hasNext()) {
                            ArrayList<Float> next = it.next();
                            VertexRunnable vertexRunnable = VertexRunnable.this;
                            arrayList.add(vertexRunnable.getDiagonalEdgesOfBox(vertexRunnable.orientation, next));
                        }
                        NPDFaceListener nPDFaceListener2 = CamPreviewFaceDetectionHandler.this.npdFaceListener;
                        if (nPDFaceListener2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            VertexRunnable vertexRunnable2 = VertexRunnable.this;
                            nPDFaceListener2.onFaceDetected(new FaceDetectorObj(arrayList2, vertexRunnable2.faceCoordinateObject, CamPreviewFaceDetectionHandler.this.viewWidth, CamPreviewFaceDetectionHandler.this.viewHeight, arrayList));
                        }
                    }
                });
            }
        }
    }

    public CamPreviewFaceDetectionHandler() {
        super("FaceHandler");
        this.tapCoordinates = new float[]{-1.0f, -1.0f};
        start();
        this.backHandler = new Handler(getLooper());
        this.uiHandler = new Handler(Looper.getMainLooper());
    }

    public static CamPreviewFaceDetectionHandler get() {
        if (detectionHandler == null) {
            detectionHandler = new CamPreviewFaceDetectionHandler();
        }
        return detectionHandler;
    }

    public void onTapToFocus(float f10, float f11) {
        float[] fArr = this.tapCoordinates;
        fArr[0] = f10;
        fArr[1] = f11;
    }

    public void reset() {
        this.npdFaceListener = null;
        detectionHandler = null;
    }

    public void setExposure(double d10) {
        if (this.isFrontfacingCamera) {
            CameraEngine.setExposure(d10);
        }
    }

    public void setListener(NPDFaceListener nPDFaceListener) {
        this.npdFaceListener = nPDFaceListener;
    }

    public void submit(CameraProperties cameraProperties) {
        this.viewWidth = cameraProperties.getViewWidth();
        this.viewHeight = cameraProperties.getViewHeight();
        this.isFrontfacingCamera = cameraProperties.isFrontFacingCam();
        this.backHandler.removeCallbacksAndMessages(null);
        this.backHandler.post(new DetectionRunnable(cameraProperties.getData(), cameraProperties.getWidth(), cameraProperties.getHeight(), cameraProperties.getOrientation(), cameraProperties.getRotation(), cameraProperties.isFrontFacingCam(), cameraProperties.isCapturedFramePreviewed()));
    }
}
