package co.hyperverge.hypersnapsdk.helpers.face;

import android.util.Log;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.CameraProperties;
import co.hyperverge.hypersnapsdk.helpers.CamPreviewFaceDetectionHandler;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.model.FaceDetectorObj;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class NPDFaceHelper implements CamPreviewFaceDetectionHandler.NPDFaceListener {
    private static final String TAG = "NPDFaceHelper";
    private static NPDFaceHelper instance;
    private CameraProperties cameraProperties;
    private HVFaceConfig faceConfig;
    private final CamPreviewFaceDetectionHandler faceDetectionHandler;
    private FaceDetectionListener faceDetectionListener;
    private FaceViewListener mView;
    private int stableFrameCounter = 0;
    private boolean hasLoggedFirstFaceDetection = false;

    private NPDFaceHelper() {
        CamPreviewFaceDetectionHandler camPreviewFaceDetectionHandler = CamPreviewFaceDetectionHandler.get();
        this.faceDetectionHandler = camPreviewFaceDetectionHandler;
        camPreviewFaceDetectionHandler.setListener(this);
    }

    private boolean areMultipleFacesPresent(List<ArrayList<Integer>> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<ArrayList<Integer>> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (isFaceOccupyingSignificantPortionOfFrame(it.next())) {
                i10++;
            }
        }
        return i10 > 0;
    }

    private void checkFaceConditions(List<Integer> list) {
        HVLogUtils.d(TAG, "checkFaceConditions() called with: faceCoordinates = [" + list + "]");
        if (list.get(2).intValue() - list.get(0).intValue() > UIUtils.getScreenWidth() * 0.6f) {
            this.stableFrameCounter = 0;
            this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_TOO_CLOSE);
        } else {
            if (!isSignificantPortionOfFaceInsideFrame(list)) {
                this.stableFrameCounter = 0;
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
                return;
            }
            int i10 = this.stableFrameCounter + 1;
            this.stableFrameCounter = i10;
            if (i10 <= 5.0f) {
                return;
            }
            this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_DETECTED);
        }
    }

    public static NPDFaceHelper get() {
        if (instance == null) {
            instance = new NPDFaceHelper();
        }
        return instance;
    }

    private Boolean isConfigNull() {
        return Boolean.valueOf(this.faceConfig == null || this.mView == null || this.faceDetectionListener == null);
    }

    private boolean isFaceOccupyingSignificantPortionOfFrame(List<Integer> list) {
        boolean z10 = false;
        if (r0 > (this.faceConfig.getShouldUseBackCamera() ? 0.35f : 0.3f) * UIUtils.getScreenWidth() && r0 < UIUtils.getScreenWidth() * 0.6f) {
            z10 = true;
        }
        HVLogUtils.d(TAG, "isFaceOccupyingSignificantPortionOfFrame() returned: " + z10);
        return z10;
    }

    private boolean isSignificantPortionOfFaceInsideFrame(List<Integer> list) {
        if (isConfigNull().booleanValue()) {
            return false;
        }
        try {
            long intValue = list.get(2).intValue() - list.get(0).intValue();
            long intValue2 = list.get(1).intValue() + ((list.get(3).intValue() - list.get(1).intValue()) / 2);
            float f10 = this.faceConfig.getShouldUseBackCamera() ? 0.35f : 0.3f;
            boolean z10 = ((double) Math.abs(this.mView.getViewYCenter() - (((float) intValue2) + this.mView.getViewY()))) < ((double) this.mView.getViewYCenter()) * 0.3d;
            float f11 = intValue;
            if (f11 <= f10 * UIUtils.getScreenWidth() || f11 >= UIUtils.getScreenWidth() * 0.6f) {
                return false;
            }
            return !this.faceConfig.isQualityCheckEnabled(HVFaceConfig.QualityChecks.FACE_CENTER) || z10;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "isSignificantPortionOfFaceInsideFrame(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            return false;
        }
    }

    private void logFaceDetectionEvent(FaceDetectorObj faceDetectorObj) {
        if (!this.hasLoggedFirstFaceDetection && SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFirstFaceDetected(faceDetectorObj.toString());
        }
        this.hasLoggedFirstFaceDetection = true;
    }

    public void destroy() {
        HVLogUtils.d(TAG, "destroy() called");
        try {
            this.faceDetectionHandler.reset();
            this.faceDetectionListener = null;
            instance = null;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "destroy(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("destroy: exception - ");
            sb2.append(Utils.getErrorMessage(e10));
            Log.e(TAG, sb2.toString());
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.CamPreviewFaceDetectionHandler.NPDFaceListener
    public void onFaceDetected(FaceDetectorObj faceDetectorObj) {
        if (isConfigNull().booleanValue()) {
            return;
        }
        if (areMultipleFacesPresent(faceDetectorObj.getMultipleFaces())) {
            logFaceDetectionEvent(faceDetectorObj);
            if (!this.faceConfig.isQualityCheckEnabled(HVFaceConfig.QualityChecks.MULTIPLE_FACES)) {
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_DETECTED);
                return;
            } else {
                this.stableFrameCounter = 0;
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.MULTIPLE_FACES);
                return;
            }
        }
        if (faceDetectorObj.getRectPoints() == null || faceDetectorObj.getRectPoints().isEmpty()) {
            this.stableFrameCounter = 0;
            this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
        } else {
            logFaceDetectionEvent(faceDetectorObj);
            checkFaceConditions(faceDetectorObj.getRectPoints());
        }
    }

    public void processFrame(CameraProperties cameraProperties) {
        this.cameraProperties = cameraProperties;
        this.faceDetectionHandler.submit(cameraProperties);
    }

    public void setConfig(HVFaceConfig hVFaceConfig, FaceViewListener faceViewListener, FaceDetectionListener faceDetectionListener) {
        HVLogUtils.d(TAG, "setConfig() called with: faceConfig = [" + hVFaceConfig + "], faceViewListener = [" + faceViewListener + "], faceDetectionListener = [" + faceDetectionListener + "]");
        this.faceConfig = hVFaceConfig;
        this.mView = faceViewListener;
        this.faceDetectionListener = faceDetectionListener;
    }
}
