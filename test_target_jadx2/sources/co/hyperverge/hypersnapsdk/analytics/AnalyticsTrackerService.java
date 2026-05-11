package co.hyperverge.hypersnapsdk.analytics;

import co.hyperverge.hypersnapsdk.model.LivenessResponse;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import java.util.Map;

/* loaded from: classes.dex */
public interface AnalyticsTrackerService {
    void logCameraPermissionDeniedError();

    void logCameraPermissionsGranted(long j10);

    void logCameraPermissionsRejected(HVError hVError, long j10);

    void logCameraPermissionsRequested();

    void logCheckBrandingAPIError(String str, int i10);

    void logCheckBrandingAPISuccess();

    void logDocumentAPICallFailed(HVResponse hVResponse, HVError hVError);

    void logDocumentAPIPost(String str, String str2);

    void logDocumentAPIResponseReceived(HVResponse hVResponse, String str, long j10);

    void logDocumentCaptureButtonClicked(HVDocConfig hVDocConfig, long j10);

    void logDocumentCaptureFailed(HVError hVError, HVDocConfig hVDocConfig, long j10);

    void logDocumentCaptureFlashButtonClicked();

    void logDocumentCaptureSaved(HVDocConfig hVDocConfig, String str, long j10);

    void logDocumentCaptureScreenBackPressed();

    void logDocumentCaptureScreenLaunched();

    void logDocumentCaptureScreenLoadFailure(HVError hVError);

    void logDocumentCaptureScreenLoadSuccess(long j10);

    void logDocumentCaptureScreenOpened(HVDocConfig hVDocConfig);

    void logDocumentCaptureSuccessful(HVDocConfig hVDocConfig, long j10);

    void logDocumentCloseClicked();

    void logDocumentDocFlowStarted(HVDocConfig hVDocConfig);

    void logDocumentInstructionsScreenEnabled();

    void logDocumentInstructionsScreenLaunched();

    void logDocumentInstructionsScreenLoadFailure(HVError hVError);

    void logDocumentInstructionsScreenLoadSuccess(long j10);

    void logDocumentInstructionsScreenProceedButtonClicked(long j10);

    void logDocumentPickerScreenCloseClicked();

    void logDocumentPickerScreenDocumentCaptureButtonClicked(long j10);

    void logDocumentPickerScreenDocumentUploadButtonClicked(long j10);

    void logDocumentPickerScreenLaunched();

    void logDocumentPickerScreenLoadFailure(HVError hVError);

    void logDocumentPickerScreenLoadSuccess(long j10);

    void logDocumentRetakeScreenBackPressed();

    void logDocumentRetakeScreenLaunched();

    void logDocumentRetakeScreenLoadFailure(HVError hVError);

    void logDocumentRetakeScreenLoadSuccess(long j10);

    void logDocumentRetakeScreenRetakeButtonClicked(HVDocConfig hVDocConfig, long j10);

    void logDocumentReviewScreenBackPressed();

    void logDocumentReviewScreenConfirmButtonClicked(HVDocConfig hVDocConfig, int i10, long j10);

    void logDocumentReviewScreenLaunched();

    void logDocumentReviewScreenLoadFailure(HVError hVError);

    void logDocumentReviewScreenLoadSuccess(long j10);

    void logDocumentReviewScreenRetakeButtonClicked(HVDocConfig hVDocConfig, long j10);

    void logFaceCaptureTimedOut();

    void logFaceDetectorMissing(String str);

    void logFaceDetectorTimedOut();

    void logFaceMatchAPICallFailed(HVResponse hVResponse, HVError hVError, String str);

    void logFaceMatchAPIPost(String str, String str2, String str3, String str4);

    void logFaceMatchAPIResponseReceived(HVResponse hVResponse, long j10);

    void logFaceMatchEnabled();

    void logFaceMatchFailed(HVError hVError);

    void logFaceMatchSuccess();

    void logGenericTrackEvent(String str, Map<String, Object> map);

    void logHardwareError();

    void logHyperSnapSDKInitError(String str);

    void logHyperSnapSDKInitialised();

    void logIdAPIFailed(boolean z10, String str, String str2, int i10, String str3);

    void logIdAPISuccessful(boolean z10, String str, String str2, long j10);

    void logIdCaptureReviewScreenLaunched();

    void logIdCaptureReviewScreenRetake();

    void logIdOldReviewScreenEvents(HVDocConfig hVDocConfig, String str);

    void logIdScreenClosedByUser(HVDocConfig hVDocConfig);

    void logLivenessAPIFailed(HVError hVError, LivenessResponse livenessResponse, HVFaceConfig hVFaceConfig);

    void logLivenessAPISuccessful(LivenessResponse livenessResponse, HVFaceConfig hVFaceConfig, long j10);

    void logQRParseFailed();

    void logQRScannerFailed(HVError hVError);

    void logQRScannerLaunched();

    void logRemoteConfigAPIError(String str, int i10);

    void logRemoteConfigAPISuccess();

    void logSelfieAPICallFailed(LivenessResponse livenessResponse, HVError hVError);

    void logSelfieAPIPost(String str, String str2);

    void logSelfieAPIResponseReceived(LivenessResponse livenessResponse, String str, long j10);

    void logSelfieCameraOpen();

    void logSelfieCaptureButtonClicked(long j10);

    void logSelfieCaptureFailed(HVError hVError, HVFaceConfig hVFaceConfig, long j10);

    void logSelfieCaptureFlipCameraButtonClicked();

    void logSelfieCaptureSaved(HVFaceConfig hVFaceConfig, String str, long j10);

    void logSelfieCaptureScreenBackPressed();

    void logSelfieCaptureScreenLaunched();

    void logSelfieCaptureScreenLoadFailure(HVError hVError);

    void logSelfieCaptureScreenLoadSuccess(long j10);

    void logSelfieCaptureScreenOpened(HVFaceConfig hVFaceConfig);

    void logSelfieCaptureSuccessful(HVFaceConfig hVFaceConfig, long j10);

    void logSelfieCloseClicked();

    void logSelfieFirstFaceDetected(String str);

    void logSelfieFirstFrameProcessed(String str);

    void logSelfieFirstFrameReceived();

    void logSelfieFirstFrameSentForProcessing();

    void logSelfieFirstMeaningfulFaceDetected();

    void logSelfieFlowEnded(HVError hVError, HVResponse hVResponse);

    void logSelfieFlowStarted(HVFaceConfig hVFaceConfig);

    void logSelfieInstructionsScreenEnabled();

    void logSelfieInstructionsScreenLaunched();

    void logSelfieInstructionsScreenLoadFailure(HVError hVError);

    void logSelfieInstructionsScreenLoadSuccess(long j10);

    void logSelfieInstructionsScreenProceedButtonClicked(long j10);

    void logSelfieRetakeScreenBackPressed();

    void logSelfieRetakeScreenLaunched();

    void logSelfieRetakeScreenLoadFailure(HVError hVError);

    void logSelfieRetakeScreenLoadSuccess(long j10);

    void logSelfieRetakeScreenRetakeButtonClicked(HVFaceConfig hVFaceConfig, long j10);

    void logSelfieScreenClosedByUser(HVFaceConfig hVFaceConfig);

    void logSelfieVideoRecordFailed(HVError hVError, long j10);

    void logSelfieVideoRecordSuccessful(String str, long j10, long j11);

    void logSensorDataPostFailure(HVError hVError);

    void logSensorDataPostSuccessful();

    void logTextMatchAPICallFailed(HVError hVError);

    void logTextMatchAPIFailed(boolean z10, String str, String str2, int i10, String str3);

    void logTextMatchAPIMethodCalled();

    void logTextMatchAPIPost();

    void logTextMatchAPIResponseReceived();

    void logTextMatchAPISuccessful(boolean z10, String str, String str2, HyperSnapParams.FaceMatchMode faceMatchMode, long j10);

    void logUserSessionEnded(String str);

    void logUserSessionStarted(boolean z10);

    void logValidationAPICallFailed(HVError hVError);

    void logValidationAPIFailed(String str, int i10, String str2);

    void logValidationAPIPost();

    void logValidationAPIResponseReceived();

    void logValidationAPISuccess(String str, long j10);

    void logVerifyAlignmentAPICallFailed(HVError hVError);

    void logVerifyAlignmentAPIFailed(boolean z10, String str, String str2, int i10, String str3);

    void logVerifyAlignmentAPIPost();

    void logVerifyAlignmentAPIResponseReceived();

    void logVerifyAlignmentAPISuccess(boolean z10, String str, String str2, long j10);
}
