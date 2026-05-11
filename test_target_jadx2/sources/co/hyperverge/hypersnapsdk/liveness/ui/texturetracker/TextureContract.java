package co.hyperverge.hypersnapsdk.liveness.ui.texturetracker;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spanned;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.CameraProperties;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HVVideoRecordingData;
import co.hyperverge.hypersnapsdk.utils.BasePresenter;
import co.hyperverge.hypersnapsdk.utils.BaseView;
import java.util.List;

/* loaded from: classes.dex */
public interface TextureContract {

    public interface Presenter extends BasePresenter {
        Boolean canResumeCamera();

        void closeOnLowStorage();

        void faceCaptureError(HVError hVError);

        void faceCaptureTimeout();

        FaceConstants.FaceDetectionState getFaceDetectionState();

        void handleNetworkFailureCancellation();

        boolean isFaceDetectedOnce();

        boolean isFacePresent();

        void operationCancelled();

        void resetCounters();

        void resetTimer();

        void resume();

        void retryLivenessCall();

        void savePicture(byte[] bArr, byte[] bArr2, Bitmap bitmap, Integer num, String str, String str2, String str3, String str4, HVFrameRecorderData hVFrameRecorderData);

        void setFaceDetectionStateFromView(FaceConstants.FaceDetectionState faceDetectionState);

        void setFaceDetectorTimedOut();

        void showDialog(boolean z10, String str);

        void submitFrameForProcessing(CameraProperties cameraProperties);

        void waitForUI(boolean z10);
    }

    public interface View extends BaseView<Presenter> {
        void authenticationDone();

        void callCompletionHandler(HVError hVError, HVResponse hVResponse);

        void disableCaptureButton();

        void enableCaptureButton();

        void facePresentForActiveLiveness();

        void finishTextureView(int i10);

        String getRetakeMessageForFaceNotPresentInCapturedImage();

        String getRetakeMessageForStaticVideo();

        String getStringForID(int i10);

        long getVideoRecordedTime();

        HVVideoRecordingData getVideoRecordingDataPoints();

        FaceViewListener getViewListener();

        void hideFaceBox();

        Context injectContext();

        boolean isCameraReleased();

        boolean isFragmentAdded();

        boolean isPhoneHeldStraight();

        void notifyNetworkFailure();

        void onNewPose(Spanned spanned);

        void onPictureSaved(String str);

        void pauseCamera();

        void poseDoesNotMatch(boolean z10);

        void poseMatches(int i10);

        void resetLoader();

        void resetPoseTimer();

        void resetUI();

        void resumeCamera();

        void setFaceDetectionState(FaceConstants.FaceDetectionState faceDetectionState);

        void setShouldAllowActivityClose(boolean z10);

        boolean shouldShowConsentOnBackPress();

        void shouldShowProgress(boolean z10, String str);

        void showFaceBox(List<Integer> list);

        void showLoader(boolean z10, String str, String str2, HVLottieHelper.State state, HVLottieHelper.Listener listener);

        void showMessage(String str);

        void stablePose();

        void stopCamera();
    }
}
