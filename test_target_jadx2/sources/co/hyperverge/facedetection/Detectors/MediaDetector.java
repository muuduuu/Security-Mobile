package co.hyperverge.facedetection.Detectors;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.FaceDetector;
import android.util.Log;
import co.hyperverge.facedetection.DetectorUtils;
import co.hyperverge.facedetection.FileInterface;
import co.hyperverge.facedetection.HVFace;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MediaDetector extends HVFaceDetector {
    private static final int MAX_FACES = 10;
    private static final String TAG = "co.hyperverge.facedetection.Detectors.MediaDetector";

    @Override // co.hyperverge.facedetection.Detectors.HVFaceDetector
    protected List<HVFace> detectFacesFromBitmap(FileInterface fileInterface, Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        if (bitmap == null) {
            return arrayList;
        }
        if (1 == bitmap.getWidth() % 2) {
            bitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() + 1, bitmap.getHeight(), false);
        }
        FaceDetector.Face[] faceArr = new FaceDetector.Face[10];
        int findFaces = new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 10).findFaces(bitmap, faceArr);
        if (findFaces > 0) {
            for (int i10 = 0; i10 < findFaces; i10++) {
                FaceDetector.Face face = faceArr[i10];
                PointF pointF = new PointF();
                face.getMidPoint(pointF);
                float eyesDistance = face.eyesDistance();
                float f10 = pointF.x;
                float f11 = eyesDistance * 2.0f;
                float f12 = f10 - f11;
                float f13 = pointF.y;
                float f14 = f13 - f11;
                float f15 = (f10 + f11) - f12;
                float f16 = (f13 + f11) - f14;
                try {
                    HVFace hVFace = new HVFace(fileInterface.getLabel() + "_" + i10, fileInterface.getPathOriginal());
                    hVFace.setFileLabel(fileInterface.getLabel());
                    hVFace.setFaceLocation(DetectorUtils.performFaceCalculations(f12, f14, f15, f16, (float) bitmap.getWidth(), (float) bitmap.getHeight()));
                    arrayList.add(hVFace);
                } catch (Exception e10) {
                    Log.d(TAG, e10.getMessage());
                }
            }
        }
        return arrayList;
    }
}
