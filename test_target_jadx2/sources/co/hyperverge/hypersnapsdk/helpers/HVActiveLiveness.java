package co.hyperverge.hypersnapsdk.helpers;

import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.CustomTextStringConst;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.helpers.face.MLKitFaceHelper;
import co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract;
import co.hyperverge.hypersnapsdk.model.HVGesturePose;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.TextConfigUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.utils.threading.MainUIThread;
import g9.C3201a;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class HVActiveLiveness {
    public static int MIN_STABLE_COUNT = 3;
    private static final String TAG = "HVActiveLiveness";
    static HVActiveLiveness instance;
    HVFaceConfig config;
    int currentPosePosition;
    List<HVGesturePose> hvGesturePoses;
    boolean isAuthenticationDone;
    TextureContract.View mView;
    int stableCounter = 0;
    int correctAttempts = 0;
    boolean timeUp = false;
    private final HVGesturePose.FacePose[] _defaultPoses = {HVGesturePose.FacePose.RIGHT_GESTURE, HVGesturePose.FacePose.LEFT_GESTURE, HVGesturePose.FacePose.STRAIGHT_GESTURE};
    boolean isGestureRunning = false;
    boolean isWaiting = false;
    MainUIThread uiThread = MainUIThread.getInstance();
    boolean isFaceDetected = false;
    Map<String, List<String>> savedImagePaths = new HashMap();
    List<String> gestureFilePaths = new ArrayList();
    HVGesturePose.GestureState gestureState = HVGesturePose.GestureState.NEW_GESTURE;

    /* renamed from: co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$FacePose;
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState;

        static {
            int[] iArr = new int[HVGesturePose.GestureState.values().length];
            $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState = iArr;
            try {
                iArr[HVGesturePose.GestureState.NEW_GESTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState[HVGesturePose.GestureState.VALIDATE_POSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState[HVGesturePose.GestureState.POSE_MATCHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState[HVGesturePose.GestureState.TIME_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState[HVGesturePose.GestureState.POSE_DOES_NOT_MATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState[HVGesturePose.GestureState.CAPTURE_IN_PROGRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState[HVGesturePose.GestureState.AUTHENTICATED_STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[HVGesturePose.FacePose.values().length];
            $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$FacePose = iArr2;
            try {
                iArr2[HVGesturePose.FacePose.STRAIGHT_GESTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$FacePose[HVGesturePose.FacePose.LEFT_GESTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$FacePose[HVGesturePose.FacePose.RIGHT_GESTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface FacePoseDetectionListener {
        void onFaceDetected(C3201a c3201a);
    }

    private HVActiveLiveness() {
        this.currentPosePosition = 0;
        this.isAuthenticationDone = false;
        this.hvGesturePoses = new ArrayList();
        this.isAuthenticationDone = false;
        this.hvGesturePoses = new ArrayList();
        this.currentPosePosition = 0;
        loadNextGesture();
    }

    public static HVActiveLiveness get() {
        if (instance == null) {
            instance = new HVActiveLiveness();
        }
        return instance;
    }

    public void changePose(final HVGesturePose.FacePose facePose) {
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness.2
            @Override // java.lang.Runnable
            public void run() {
                HVActiveLiveness hVActiveLiveness = HVActiveLiveness.this;
                hVActiveLiveness.mView.onNewPose(hVActiveLiveness.getPoseText(facePose));
            }
        });
    }

    public boolean checkIfPoseMatches(C3201a c3201a, HVGesturePose.FacePose facePose) {
        HVLogUtils.d(TAG, "checkIfPoseMatches() called");
        int i10 = AnonymousClass5.$SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$FacePose[facePose.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 == 3 && c3201a.d() < -5.0f : c3201a.d() > 5.0f : Math.abs(c3201a.d()) <= 15.0f && Math.abs(c3201a.c()) <= 15.0f && Math.abs(c3201a.e()) <= 15.0f;
    }

    public void destroy() {
        HVLogUtils.d(TAG, "destroy() called");
        try {
            instance = null;
        } catch (Exception | NoClassDefFoundError e10) {
            HVLogUtils.e(TAG, "destroy(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public boolean detectFaceFromImage(C3201a c3201a) {
        boolean z10;
        if (c3201a != null) {
            HVGesturePose.FacePose facePose = this.hvGesturePoses.get(this.currentPosePosition).getFacePose();
            if (this.isAuthenticationDone) {
                facePose = HVGesturePose.FacePose.STRAIGHT_GESTURE;
            }
            z10 = checkIfPoseMatches(c3201a, facePose);
        } else {
            z10 = false;
        }
        this.stableCounter = 0;
        if (z10) {
            this.mView.resetPoseTimer();
        } else {
            if (this.isAuthenticationDone) {
                this.gestureState = HVGesturePose.GestureState.AUTHENTICATED_STATE;
            } else if (this.timeUp) {
                this.timeUp = false;
                resetCounters();
                this.mView.resetUI();
            } else {
                this.gestureState = HVGesturePose.GestureState.VALIDATE_POSE;
            }
            this.isWaiting = false;
        }
        return z10;
    }

    public String getFileNameForPose(String str) {
        if (this.isAuthenticationDone) {
            return str;
        }
        return this.hvGesturePoses.get(this.currentPosePosition).getFacePose().toString() + "_" + this.correctAttempts + "_" + System.currentTimeMillis() + ".jpg";
    }

    public Spanned getPoseText(HVGesturePose.FacePose facePose) {
        int i10 = AnonymousClass5.$SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$FacePose[facePose.ordinal()];
        if (i10 == 1) {
            return TextConfigUtils.getText(this.config.getCustomUIStrings(), CustomTextStringConst.FaceCaptureTextConfigs.FACE_GESTURE_LOOK_STRAIGHT, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_GESTURE_LOOK_STRAIGHT, "Look Straight");
        }
        if (i10 == 2) {
            return TextConfigUtils.getText(this.config.getCustomUIStrings(), CustomTextStringConst.FaceCaptureTextConfigs.FACE_GESTURE_LOOK_LEFT, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_GESTURE_LOOK_LEFT, "Look Left");
        }
        if (i10 != 3) {
            return null;
        }
        return TextConfigUtils.getText(this.config.getCustomUIStrings(), CustomTextStringConst.FaceCaptureTextConfigs.FACE_GESTURE_LOOK_RIGHT, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_GESTURE_LOOK_RIGHT, "Look Right");
    }

    public Map<String, List<String>> getSavedImagePaths() {
        HVLogUtils.d(TAG, "getSavedImagePaths() called");
        return this.savedImagePaths;
    }

    public void handleAuthenticatedState() {
        HVLogUtils.d(TAG, "handleAuthenticatedState() called");
        this.isWaiting = true;
        this.isAuthenticationDone = true;
        this.gestureState = HVGesturePose.GestureState.AUTHENTICATED_STATE;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness.1
            @Override // java.lang.Runnable
            public void run() {
                HVActiveLiveness.this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        HVActiveLiveness.this.mView.authenticationDone();
                    }
                });
            }
        }, 100L);
    }

    public boolean isAuthenticationDone() {
        return this.isAuthenticationDone;
    }

    public boolean isFaceDetected() {
        return this.isFaceDetected;
    }

    public void loadNextGesture() {
        HVGesturePose.FacePose facePose = this._defaultPoses[new SecureRandom().nextInt(this._defaultPoses.length)];
        if (this.hvGesturePoses.size() > 0) {
            while (this.hvGesturePoses.get(this.currentPosePosition - 1).getFacePose() == facePose) {
                facePose = this._defaultPoses[new SecureRandom().nextInt(this._defaultPoses.length)];
            }
        }
        this.hvGesturePoses.add(this.currentPosePosition, new HVGesturePose(facePose));
        this.gestureState = HVGesturePose.GestureState.NEW_GESTURE;
    }

    public void onActiveLivenessFaceDetection(ArrayList<C3201a> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            if (this.isFaceDetected) {
                return;
            }
            this.mView.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
            resetCounters();
            this.isFaceDetected = false;
            return;
        }
        if (this.isWaiting) {
            return;
        }
        if (!this.isFaceDetected) {
            this.mView.facePresentForActiveLiveness();
        }
        this.isFaceDetected = true;
        int i10 = AnonymousClass5.$SwitchMap$co$hyperverge$hypersnapsdk$model$HVGesturePose$GestureState[this.gestureState.ordinal()];
        if (i10 == 1) {
            changePose(this.hvGesturePoses.get(this.currentPosePosition).getFacePose());
            this.gestureState = HVGesturePose.GestureState.VALIDATE_POSE;
            return;
        }
        if (i10 == 2) {
            validatePose(arrayList.get(0), this.hvGesturePoses.get(this.currentPosePosition).getFacePose());
            return;
        }
        if (i10 == 3) {
            poseMatches();
            return;
        }
        if (i10 == 4) {
            this.timeUp = true;
            poseMatches();
        } else if (i10 == 5) {
            poseDoesNotMatch(false);
        } else {
            if (i10 != 7) {
                return;
            }
            handleAuthenticatedState();
        }
    }

    public void poseDoesNotMatch(final boolean z10) {
        HVLogUtils.d(TAG, "poseDoesNotMatch() called with: stopCapture = [" + z10 + "]");
        this.stableCounter = 0;
        this.isWaiting = true;
        this.gestureState = HVGesturePose.GestureState.VALIDATE_POSE;
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness.4
            @Override // java.lang.Runnable
            public void run() {
                HVActiveLiveness.this.mView.poseDoesNotMatch(z10);
            }
        });
    }

    public void poseMatches() {
        this.gestureState = HVGesturePose.GestureState.CAPTURE_IN_PROGRESS;
        this.isWaiting = true;
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness.3
            @Override // java.lang.Runnable
            public void run() {
                HVActiveLiveness hVActiveLiveness = HVActiveLiveness.this;
                hVActiveLiveness.mView.poseMatches(hVActiveLiveness.correctAttempts);
            }
        });
    }

    public void resetCounters() {
        HVLogUtils.d(TAG, "resetCounters() called");
        if (!this.isAuthenticationDone) {
            this.hvGesturePoses.clear();
            this.currentPosePosition = 0;
            this.correctAttempts = 0;
            this.timeUp = false;
            this.savedImagePaths.clear();
            this.gestureFilePaths.clear();
            loadNextGesture();
            this.stableCounter = 0;
            this.isGestureRunning = false;
        }
        this.isWaiting = false;
    }

    public void resetTimer() {
        HVLogUtils.d(TAG, "resetTimer() called");
        this.timeUp = true;
        if (this.gestureState != HVGesturePose.GestureState.CAPTURE_IN_PROGRESS) {
            this.gestureState = HVGesturePose.GestureState.TIME_UP;
        }
    }

    public boolean saveImage(String str) {
        HVLogUtils.d(TAG, "saveImage() called");
        if (this.gestureFilePaths.size() == this.config.getTotalGestures()) {
            return true;
        }
        HVGesturePose.FacePose facePose = this.hvGesturePoses.get(this.currentPosePosition).getFacePose();
        this.correctAttempts++;
        this.gestureFilePaths.add(str);
        List<String> arrayList = new ArrayList<>();
        if (this.savedImagePaths.containsKey(facePose.toString())) {
            arrayList = this.savedImagePaths.get(facePose.toString());
        }
        arrayList.add(str);
        this.savedImagePaths.put(facePose.toString(), arrayList);
        if (this.correctAttempts == this.config.getTotalGestures()) {
            handleAuthenticatedState();
        } else {
            this.currentPosePosition++;
            loadNextGesture();
            this.isWaiting = false;
        }
        return false;
    }

    public void setConfig(TextureContract.View view, HVFaceConfig hVFaceConfig) {
        this.mView = view;
        this.config = hVFaceConfig;
    }

    public void validatePose(C3201a c3201a, HVGesturePose.FacePose facePose) {
        if (!MLKitFaceHelper.get().isSignificantPortionOfFaceInsideFrame(c3201a)) {
            this.mView.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
            this.isFaceDetected = false;
        } else {
            if (!checkIfPoseMatches(c3201a, facePose)) {
                this.gestureState = HVGesturePose.GestureState.POSE_DOES_NOT_MATCH;
                return;
            }
            this.stableCounter++;
            this.mView.stablePose();
            if (this.stableCounter >= MIN_STABLE_COUNT) {
                this.gestureState = HVGesturePose.GestureState.POSE_MATCHES;
            }
        }
    }

    public void waitForUI(boolean z10) {
        this.isWaiting = z10;
    }
}
