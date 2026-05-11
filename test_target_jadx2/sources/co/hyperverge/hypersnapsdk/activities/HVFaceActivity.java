package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.core.app.AbstractC1480b;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.helpers.CustomTextStringConst;
import co.hyperverge.hypersnapsdk.helpers.HVGenericCallback;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.helpers.face.MLKitFaceHelper;
import co.hyperverge.hypersnapsdk.listeners.FaceCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback;
import co.hyperverge.hypersnapsdk.listeners.PermDialogCallback;
import co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract;
import co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment;
import co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TexturePresenter;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import co.hyperverge.hypersnapsdk.objects.HyperSnapSDKConfig;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.service.location.LocationServiceImpl;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.PermissionManager;
import co.hyperverge.hypersnapsdk.utils.TextConfigUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Arrays;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVFaceActivity extends HVBaseActivity {
    private static final int INSTRUCTIONS_REQUEST_CODE = 1002;
    private static final int LOCATION_SETTINGS_REQUEST_CODE = 1001;
    private static final String TAG = "co.hyperverge.hypersnapsdk.activities.HVFaceActivity";
    HVFaceConfig faceConfig;
    private boolean isCheckingForPerms;
    private LottieAnimationView lavLoader;
    private TextureFragment mFragment;
    private TexturePresenter mPresenter;
    public final String camViewTag = "faceCaptureCameraPreview";
    PermissionManager permissionManager = new PermissionManager();
    private boolean isFromRetake = false;
    private final TimingUtils permissionTimingUtils = new TimingUtils();
    private final TimingUtils screenLoadSuccessTimingUtils = new TimingUtils();
    private boolean shouldAllowActivityClose = true;

    private void addTextureFragment() {
        HVLogUtils.d(TAG, "addTextureFragment() called");
        try {
            if (this.mFragment == null) {
                this.mFragment = new TextureFragment();
            }
            if (this.mFragment.getPresenter() == null) {
                TexturePresenter texturePresenter = new TexturePresenter();
                this.mPresenter = texturePresenter;
                texturePresenter.setFaceConfig(getFaceConfig());
                this.mPresenter.setView(this.mFragment);
                this.mFragment.setPresenter((TextureContract.Presenter) this.mPresenter);
                this.mPresenter.setMode(getFaceConfig().getMode());
                this.mPresenter.setClientId(getFaceConfig().getClientID());
            }
            this.mFragment.setConfig(getFaceConfig());
            getSupportFragmentManager().n().n(R.id.texture_container, this.mFragment).g();
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            long longValue = this.screenLoadSuccessTimingUtils.getTimeDifferenceLong().longValue();
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureScreenOpened(getFaceConfig());
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureScreenLoadSuccess(longValue);
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureScreenLaunched();
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "addTextureFragment(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureScreenLoadFailure(new HVError(2, Utils.getErrorMessage(e10)));
            }
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private HVFaceConfig getFaceConfig() {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig != null) {
            return hVFaceConfig;
        }
        callCompletionHandler(new HVError(2, getResources().getString(R.string.face_config_error)), null);
        finish();
        return new HVFaceConfig();
    }

    private void getLocation() {
        HVLogUtils.d(TAG, "getLocation() called");
        if (!LocationServiceImpl.getInstance(this).isGPSSwitchedOn()) {
            showLocationSettingsDialog();
        } else {
            LocationServiceImpl.getInstance(this).getLastKnownLocation();
            LocationServiceImpl.getInstance(this).startLocationUpdates();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRemoteConfigFetchDone$3() {
        findViewById(R.id.texture_container).setBackground(null);
        LottieAnimationView lottieAnimationView = this.lavLoader;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRemoteConfigFetchDone$4() {
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.F0
            @Override // java.lang.Runnable
            public final void run() {
                HVFaceActivity.this.lambda$onRemoteConfigFetchDone$3();
            }
        });
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()) {
            String sensorDataZipFileName = Utils.getSensorDataZipFileName(HVRetakeActivity.FACE_TAG);
            if (SDKInternalConfig.getInstance().getHvSensorBiometrics() != null) {
                SDKInternalConfig.getInstance().getHvSensorBiometrics().registerSensorBiometrics(sensorDataZipFileName);
                SDKInternalConfig.getInstance().getHvSensorBiometrics().updateSensorDataEvents(System.currentTimeMillis(), "selfieFlowStarted");
            }
            JSONObject headers = getFaceConfig().getHeaders();
            try {
                headers.put(AppConstants.SENSOR_DATA_ZIP_FILE_NAME, sensorDataZipFileName);
                getFaceConfig().setLivenessAPIHeaders(headers);
            } catch (Exception e10) {
                String str = TAG;
                HVLogUtils.e(str, "onRemoteConfigFetchDone(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start() livenessHeaders :- JSON Exception :");
                sb2.append(Utils.getErrorMessage(e10));
                Log.e(str, sb2.toString());
            }
        }
        addTextureFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRemoteConfigFetchDone$5() {
        HVLogUtils.e(TAG, "Both preferred and fallback detectors failed initialization.");
        if (!this.faceConfig.isShouldShowInstructionPage() && !this.faceConfig.shouldShowConsent()) {
            sendDetectorUnavailableError(getResources().getString(R.string.mlkit_detector_unavailable_error));
            return;
        }
        HVError hVError = new HVError(60, getResources().getString(R.string.mlkit_detector_unavailable_error));
        Intent intent = new Intent();
        intent.putExtra("hvError", hVError);
        setResult(AppConstants.FACE_DETECTOR_ERROR, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRemoteConfigFetchDone$6(Runnable runnable, Runnable runnable2) {
        if (!SDKInternalConfig.getInstance().isNpdDetectorAvailable()) {
            HVLogUtils.e(TAG, "Fallback to NPD skipped: NPD detector not available.");
            runOnUiThread(runnable2);
            return;
        }
        String str = TAG;
        HVLogUtils.w(str, "Preferred detector MLKit failed. Attempting fallback: NPD");
        if (getFaceConfig().shouldCheckForFaceTilt()) {
            HVLogUtils.d(str, "Allowing face tilt for NPD fallback");
            getFaceConfig().setAllowFaceTilt(true);
        }
        if (getFaceConfig().isShouldCheckActiveLiveness()) {
            HVLogUtils.d(str, "Disabling active liveness for fallback to NPD");
            getFaceConfig().setShouldCheckActiveLiveness(false);
        }
        tryInitializeNPD(runnable, runnable2, shouldUseCameraX());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRemoteConfigFetchDone$7(Runnable runnable, Runnable runnable2) {
        HVLogUtils.w(TAG, "Preferred detector NPD failed. Attempting fallback: MLKit");
        tryInitializeMLKit(runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendDetectorUnavailableError$10(String str) {
        callCompletionHandler(new HVError(60, str), null);
        if (isFinishing() || isDestroyed()) {
            HVLogUtils.w(TAG, "Activity already finishing/destroyed when detector error was sent.");
        } else {
            HVLogUtils.i(TAG, "Finishing activity because no detector is available.");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationSettingsDialog$0(DialogInterface dialogInterface, int i10) {
        startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), LOCATION_SETTINGS_REQUEST_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationSettingsDialog$1(Spanned spanned, DialogInterface dialogInterface, int i10) {
        String string = getString(R.string.hv_gps_access_denied_by_user);
        if (spanned != null) {
            string = spanned.toString();
        }
        HVError hVError = new HVError(33, string);
        HVBaseActivity.resetStateForCompletion(this.faceConfig.getModuleId(), getAppFilesDir(), hVError, null);
        this.mPresenter.lambda$onFailureResponse$8(null, hVError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFaceCapture$2() {
        this.lavLoader = (LottieAnimationView) findViewById(R.id.lavLoader);
        HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(findViewById(R.id.texture_container));
        LottieAnimationView lottieAnimationView = this.lavLoader;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
            HVLottieHelper.load(this.lavLoader, HVLottieHelper.LOADER_LOTTIE, HVLottieHelper.State.START, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$tryInitializeMLKit$8(Boolean bool, Runnable runnable, Runnable runnable2) {
        if (bool.booleanValue()) {
            HVLogUtils.i(TAG, "MLKit initialized and operational.");
            runnable.run();
        } else {
            HVLogUtils.e(TAG, "MLKit is available but not operational (download/internal init issue).");
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryInitializeMLKit$9(final Runnable runnable, final Runnable runnable2, final Boolean bool) {
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.D0
            @Override // java.lang.Runnable
            public final void run() {
                HVFaceActivity.lambda$tryInitializeMLKit$8(bool, runnable, runnable2);
            }
        });
    }

    private void reinitTimingUtils() {
        HVLogUtils.d(TAG, "reinitTimingUtils() called");
        try {
            this.permissionTimingUtils.init();
            this.screenLoadSuccessTimingUtils.init();
            TextureFragment textureFragment = this.mFragment;
            if (textureFragment != null) {
                textureFragment.reinitTimingUtils();
            }
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "reinitTimingUtils(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
        }
    }

    private void sendDetectorUnavailableError(final String str) {
        HVLogUtils.e(TAG, "sendDetectorUnavailableError: " + str);
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.E0
            @Override // java.lang.Runnable
            public final void run() {
                HVFaceActivity.this.lambda$sendDetectorUnavailableError$10(str);
            }
        });
    }

    private void sendError(HVError hVError) {
        HVLogUtils.d(TAG, "sendError() called with: hvError = [" + hVError + "]");
        try {
            callCompletionHandler(hVError, null);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "reinitTimingUtils(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInsufficientPermissions(String str) {
        HVLogUtils.d(TAG, "sendInsufficientPermissions() called with: message = [" + str + "]");
        try {
            callCompletionHandler(new HVError(4, str), null);
        } catch (Exception e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "reinitTimingUtils(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private void sendOperationCancelled() {
        HVLogUtils.d(TAG, "sendOperationCancelled() called");
        try {
            callCompletionHandler(new HVError(3, getResources().getString(R.string.operation_cancelled)), null);
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "reinitTimingUtils(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private boolean shouldUseCameraX() {
        boolean shouldUseCameraX = SDKInternalConfig.getInstance().shouldUseCameraX();
        return (!shouldUseCameraX || getFaceConfig().shouldUseCameraX() == null) ? shouldUseCameraX : getFaceConfig().shouldUseCameraX().booleanValue();
    }

    private void showLocationSettingsDialog() {
        HVLogUtils.d(TAG, "showLocationSettingsDialog() called");
        HVJSONObject customUIStrings = getFaceConfig().getCustomUIStrings();
        Spanned text = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOCATION_PERMISSION_TITLE, getString(R.string.hv_gps_switched_off));
        Spanned text2 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOCATION_PERMISSION_DESC, getString(R.string.hv_please_enable_gps_to_continue));
        Spanned text3 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOCATION_PERMISSION_SETTINGS_BUTTON, getString(R.string.hv_open_settings));
        Spanned text4 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOCATION_PERMISSION_CANCEL_BUTTON, getString(R.string.hv_cancel));
        final Spanned text5 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOCATION_PERMISSION_ERROR, getString(R.string.hv_gps_access_denied_by_user));
        c.a aVar = new c.a(this);
        aVar.o(text);
        aVar.h(text2);
        aVar.d(false);
        aVar.l(text3, new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.G0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HVFaceActivity.this.lambda$showLocationSettingsDialog$0(dialogInterface, i10);
            }
        });
        aVar.i(text4, new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.x0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HVFaceActivity.this.lambda$showLocationSettingsDialog$1(text5, dialogInterface, i10);
            }
        });
        aVar.q();
    }

    public static void start(Context context, HVFaceConfig hVFaceConfig, FaceCaptureCompletionHandler faceCaptureCompletionHandler) {
        Intent intent;
        String str = TAG;
        HVLogUtils.d(str, "start() called with: context = [" + context + "], faceConfig = [" + hVFaceConfig + "], handler = [" + faceCaptureCompletionHandler + "]");
        if (faceCaptureCompletionHandler == null) {
            return;
        }
        HVBaseActivity.isApplicationRecreated = false;
        CallbackProvider.get().setCallback(faceCaptureCompletionHandler);
        String moduleId = hVFaceConfig.getModuleId();
        if (context == null) {
            HVBaseActivity.callCompletionHandler(moduleId, HVBaseActivity.getAppFilesDir(context), faceCaptureCompletionHandler, new HVError(6, "Context object is null"), null);
            return;
        }
        HyperSnapSDK hyperSnapSDK = HyperSnapSDK.getInstance();
        HyperSnapSDKConfig hyperSnapSDKConfig = hyperSnapSDK.getHyperSnapSDKConfig();
        if (!hyperSnapSDK.isHyperSnapSDKInitialised() || ((hyperSnapSDKConfig.getAppId() != null && hyperSnapSDKConfig.getAppId().isEmpty()) || (hyperSnapSDKConfig.getAppKey() != null && hyperSnapSDKConfig.getAppKey().isEmpty()))) {
            HVError hVError = new HVError(11, context.getResources().getString(R.string.initialised_error));
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logHyperSnapSDKInitError(hVError.getErrorMessage());
            }
            HVLogUtils.d(str, "start: error = [" + hVError + "]");
            HVBaseActivity.callCompletionHandler(moduleId, HVBaseActivity.getAppFilesDir(context), faceCaptureCompletionHandler, hVError, null);
            return;
        }
        if (hyperSnapSDKConfig.getHyperSnapRegion() == HyperSnapParams.Region.ASIA_PACIFIC && !HyperSnapSDK.isUserSessionActive()) {
            HVError hVError2 = new HVError(11, context.getResources().getString(R.string.user_session_not_created_error));
            HVLogUtils.d(str, "start: error = [" + hVError2 + "]");
            HVBaseActivity.callCompletionHandler(moduleId, HVBaseActivity.getAppFilesDir(context), faceCaptureCompletionHandler, hVError2, null);
            return;
        }
        if (hVFaceConfig.isShouldShowInstructionPage()) {
            intent = new Intent(context, (Class<?>) HVFaceInstructionActivity.class);
            if (hVFaceConfig.getCustomUIStrings() != null) {
                intent.putExtra("customUIStrings", hVFaceConfig.getCustomUIStrings().toString());
            }
            intent.putExtra("shouldUseBackCam", hVFaceConfig.getShouldUseBackCamera());
        } else {
            intent = hVFaceConfig.shouldShowConsent() ? new Intent(context, (Class<?>) HVConsentActivity.class) : new Intent(context, (Class<?>) HVFaceActivity.class);
        }
        intent.putExtra("hvFaceConfig", hVFaceConfig);
        context.startActivity(intent);
    }

    private void tryInitializeMLKit(final Runnable runnable, final Runnable runnable2) {
        try {
            MLKitFaceHelper.get();
            SDKInternalConfig.getInstance().setFaceDetectionProcessor(SDKInternalConfig.FaceDetectionProcessor.MLKIT);
            if (SDKInternalConfig.getInstance().isMLKitDetectorMissing() || SDKInternalConfig.getInstance().isMLKitUnavailable()) {
                HVLogUtils.w(TAG, "MLKit detector missing or unavailable (library issue). Check 'facedetection-mlkit' module dependency.");
                runOnUiThread(runnable2);
            } else {
                HVLogUtils.d(TAG, "MLKit libraries present, checking if operational...");
                MLKitFaceHelper.get().isOperational(new HVGenericCallback() { // from class: co.hyperverge.hypersnapsdk.activities.C0
                    @Override // co.hyperverge.hypersnapsdk.helpers.HVGenericCallback
                    public final void accept(Object obj) {
                        HVFaceActivity.this.lambda$tryInitializeMLKit$9(runnable, runnable2, (Boolean) obj);
                    }
                });
            }
        } catch (UnsatisfiedLinkError e10) {
            HVLogUtils.e(TAG, "MLKit initialization failed (link error). Check 'facedetection-mlkit' module dependency.", e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            runOnUiThread(runnable2);
        }
    }

    private void tryInitializeNPD(Runnable runnable, Runnable runnable2, boolean z10) {
        SDKInternalConfig.getInstance().setFaceDetectionProcessor(SDKInternalConfig.FaceDetectionProcessor.NPD);
        String str = TAG;
        HVLogUtils.i(str, "NPD initialized successfully.");
        if (z10) {
            HVLogUtils.i(str, "Fallback to NPD from CameraX: Ensure legacy camera is used and check tilt config.");
            getFaceConfig().setUseCameraX(false);
        }
        runOnUiThread(runnable);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public void callCompletionHandler(HVError hVError, HVResponse hVResponse) {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        HVBaseActivity.callCompletionHandler(hVFaceConfig != null ? hVFaceConfig.getModuleId() : null, getAppFilesDir(), CallbackProvider.get().injectFaceCaptureCallback(), hVError, hVResponse);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    /* renamed from: checkAndWaitForRemoteConfig */
    public /* bridge */ /* synthetic */ void lambda$checkAndWaitForRemoteConfig$1() {
        super.lambda$checkAndWaitForRemoteConfig$1();
    }

    public void checkForPermissions() {
        HVLogUtils.d(TAG, "checkForPermissions() called");
        this.isCheckingForPerms = true;
        this.permissionTimingUtils.init();
        ArrayList arrayList = new ArrayList(Arrays.asList("android.permission.CAMERA"));
        this.permissionManager.checkAndRequestPermissions(this, arrayList);
        if (this.permissionManager.getStatus(this, arrayList).denied.isEmpty()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logCameraPermissionsGranted(this.permissionTimingUtils.getTimeDifferenceLong().longValue());
            this.isCheckingForPerms = false;
            startFaceCapture();
        }
    }

    public void displayNetworkRetryOptions() {
        String str = TAG;
        HVLogUtils.d(str, "displayNetworkRetryOptions() called");
        if (this.mFragment == null) {
            HVLogUtils.e(str, "displayNetworkRetryOptions called but mFragment is null");
        } else if (this.mPresenter == null) {
            HVLogUtils.e(str, "displayNetworkRetryOptions called but presenter is null");
        } else {
            showNetworkRetryBS(new NetworkRetryDialogCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVFaceActivity.2
                @Override // co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback
                public void onActionClick() {
                    HVLogUtils.d(HVFaceActivity.TAG, "NetworkRetryDialog - User clicked Retry");
                    HVFaceActivity.this.mPresenter.retryLivenessCall();
                }

                @Override // co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback
                public void onCancel() {
                    HVLogUtils.d(HVFaceActivity.TAG, "NetworkRetryDialog - User clicked Cancel");
                    HVFaceActivity.this.mPresenter.handleNetworkFailureCancellation();
                }
            });
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    HVBaseConfig getBaseConfig() {
        return getFaceConfig();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    Integer getInsetContentId() {
        return Integer.valueOf(R.id.hv_face_capture);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    View getInsetView() {
        return findViewById(R.id.texture_container);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void handleCloseAction() {
        super.handleCloseAction();
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        TextureFragment textureFragment;
        super.onActivityResult(i10, i11, intent);
        HVLogUtils.d(TAG, "onActivityResult() called with: requestCode = [" + i10 + "], resultCode = [" + i11 + "], data = [" + intent + "]");
        reinitTimingUtils();
        if (getFaceConfig().isShouldRecordVideo() && (textureFragment = this.mFragment) != null) {
            textureFragment.reinitVideoRecording();
        }
        if (i11 == 18) {
            HVError hVError = (HVError) intent.getSerializableExtra("hvError");
            sendError(hVError);
            Intent intent2 = new Intent();
            intent2.putExtra("hvError", hVError);
            setResult(AppConstants.SDK_EXIT_ERROR, intent2);
            finish();
        } else if (i11 == 21) {
            this.isFromRetake = true;
        }
        if (i10 != LOCATION_SETTINGS_REQUEST_CODE) {
            return;
        }
        try {
            getLocation();
        } catch (NoClassDefFoundError unused) {
            Log.e(TAG, "gms excluded");
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.activity.f, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    void onCloseActivity() {
        HVLogUtils.d(TAG, "onCloseActivity() called");
        if (getFaceConfig().shouldShowModuleBackButton() || getFaceConfig().isShouldShowInstructionPage()) {
            try {
                TextureFragment textureFragment = this.mFragment;
                if (textureFragment != null) {
                    textureFragment.onBackPress();
                }
                if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                    return;
                }
                SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logSelfieCaptureScreenBackPressed();
            } catch (Exception e10) {
                String str = TAG;
                HVLogUtils.e(str, "onCloseActivity(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(str, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // androidx.appcompat.app.d, androidx.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HVLogUtils.d(TAG, "onConfigurationChanged: newConfig = " + configuration);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hv_activity_face_capture);
        getWindow().getDecorView().getRootView().setTag("faceCaptureCameraPreview");
        String str = TAG;
        HVLogUtils.d(str, "onCreate() called with: savedInstanceState = [" + bundle + "]");
        if (bundle != null) {
            HVLogUtils.d(str, "onCreate() savedInstance is not null, finishing activity");
            HVFaceConfig hVFaceConfig = (HVFaceConfig) new com.google.gson.e().k(bundle.getString("faceConfig"), HVFaceConfig.class);
            this.faceConfig = hVFaceConfig;
            if (performPermissionRevokeCheck(hVFaceConfig.getModuleId())) {
                return;
            }
        }
        this.faceConfig = (HVFaceConfig) getIntent().getSerializableExtra("hvFaceConfig");
        HVFaceConfig.setFaceConfigInstance(getFaceConfig());
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFlowStarted(getFaceConfig());
        }
        this.screenLoadSuccessTimingUtils.init();
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            try {
                getLocation();
            } catch (NoClassDefFoundError unused) {
                Log.e(TAG, "gms excluded");
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public void onRemoteConfigFetchDone() {
        String str = TAG;
        HVLogUtils.d(str, "onRemoteConfigFetchDone() called");
        boolean z10 = shouldUseCameraX() || SDKInternalConfig.getInstance().getFaceDetectionProcessor() == SDKInternalConfig.FaceDetectionProcessor.MLKIT;
        final Runnable runnable = new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.w0
            @Override // java.lang.Runnable
            public final void run() {
                HVFaceActivity.this.lambda$onRemoteConfigFetchDone$4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.y0
            @Override // java.lang.Runnable
            public final void run() {
                HVFaceActivity.this.lambda$onRemoteConfigFetchDone$5();
            }
        };
        if (z10) {
            HVLogUtils.i(str, "Attempting preferred detector: MLKit (due to config or CameraX or npd exclusion initially)");
            tryInitializeMLKit(runnable, new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.z0
                @Override // java.lang.Runnable
                public final void run() {
                    HVFaceActivity.this.lambda$onRemoteConfigFetchDone$6(runnable, runnable2);
                }
            });
            return;
        }
        HVLogUtils.i(str, "Attempting preferred detector: NPD");
        if (SDKInternalConfig.getInstance().isNpdDetectorAvailable()) {
            tryInitializeNPD(runnable, new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.A0
                @Override // java.lang.Runnable
                public final void run() {
                    HVFaceActivity.this.lambda$onRemoteConfigFetchDone$7(runnable, runnable2);
                }
            }, false);
        } else {
            HVLogUtils.e(str, "Preferred detector NPD failed and not available. Attempting fallback: MLKit");
            tryInitializeMLKit(runnable, runnable2);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        HVLogUtils.d(TAG, "onRequestPermissionsResult() called with: requestCode = [" + i10 + "], permissions = [" + strArr + "], grantResults = [" + iArr + "]");
        final PermissionManager.StatusArray status = this.permissionManager.getStatus(this, new ArrayList(Arrays.asList("android.permission.CAMERA")));
        this.isCheckingForPerms = false;
        if (status.denied.isEmpty()) {
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logCameraPermissionsGranted(this.permissionTimingUtils.getTimeDifferenceLong().longValue());
            }
            startFaceCapture();
        } else {
            showCameraPermissionBS(TextConfigUtils.getText(getFaceConfig().getCustomUIStrings(), BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_CAMERA_PERMISSION_TITLE), TextConfigUtils.getText(getFaceConfig().getCustomUIStrings(), BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_CAMERA_PERMISSION_DESC), TextConfigUtils.getText(getFaceConfig().getCustomUIStrings(), BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_CAMERA_PERMISSION_BUTTON), new PermDialogCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVFaceActivity.1
                @Override // co.hyperverge.hypersnapsdk.listeners.PermDialogCallback
                public void onActionClick() {
                    if (AbstractC1480b.y(HVFaceActivity.this, "android.permission.CAMERA")) {
                        HVFaceActivity.this.checkForPermissions();
                        return;
                    }
                    HVFaceActivity.this.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + HVFaceActivity.this.getApplicationContext().getPackageName())));
                }

                @Override // co.hyperverge.hypersnapsdk.listeners.PermDialogCallback
                public void onCancel() {
                    String join = TextUtils.join(",", status.denied);
                    HVError hVError = new HVError(4, "Following Permissions not granted by user: " + join);
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logCameraPermissionsRejected(hVError, HVFaceActivity.this.permissionTimingUtils.getTimeDifferenceLong().longValue());
                    }
                    if (HVFaceActivity.this.faceConfig.isShouldShowInstructionPage() || HVFaceActivity.this.faceConfig.shouldShowConsent()) {
                        Intent intent = new Intent();
                        intent.putExtra("hvError", hVError);
                        HVFaceActivity.this.setResult(AppConstants.PERMISSION_CANCELLED, intent);
                    } else {
                        HVFaceActivity.this.sendInsufficientPermissions("Following Permissions not granted by user: " + join);
                    }
                    HVFaceActivity.this.finish();
                }
            });
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onResume() {
        super.onResume();
        HVLogUtils.d(TAG, "onResume() called");
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("faceConfig", new com.google.gson.e().t(this.faceConfig));
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onStart() {
        super.onStart();
        HVLogUtils.d(TAG, "onStart() called");
        if (this.isCheckingForPerms || this.isFromRetake) {
            this.isFromRetake = false;
        } else {
            checkForPermissions();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.appcompat.app.d
    public /* bridge */ /* synthetic */ boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    public void setShouldAllowActivityClose(boolean z10) {
        this.shouldAllowActivityClose = z10;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    boolean shouldAllowActivityClose() {
        return this.shouldAllowActivityClose;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    boolean shouldShowCloseAlert() {
        boolean z10 = !getFaceConfig().isShouldShowInstructionPage() && getFaceConfig().shouldShowCloseAlert();
        HVLogUtils.d(TAG, "shouldShowCloseAlert() returned: " + z10);
        return z10;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void showCameraPermissionBS(Spanned spanned, Spanned spanned2, Spanned spanned3, PermDialogCallback permDialogCallback) {
        super.showCameraPermissionBS(spanned, spanned2, spanned3, permDialogCallback);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void showNetworkRetryBS(NetworkRetryDialogCallback networkRetryDialogCallback) {
        super.showNetworkRetryBS(networkRetryDialogCallback);
    }

    public void startFaceCapture() {
        HVLogUtils.d(TAG, "startFaceCapture() called");
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.B0
            @Override // java.lang.Runnable
            public final void run() {
                HVFaceActivity.this.lambda$startFaceCapture$2();
            }
        });
        lambda$checkAndWaitForRemoteConfig$1();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startFaceInstruction() {
        HVLogUtils.d(TAG, "startFaceInstruction() called");
        try {
            Intent intent = new Intent(this, (Class<?>) HVFaceInstructionActivity.class);
            if (getFaceConfig().getCustomUIStrings() != null) {
                intent.putExtra("customUIStrings", getFaceConfig().getCustomUIStrings().toString());
            }
            intent.putExtra("shouldUseBackCam", getFaceConfig().getShouldUseBackCamera());
            startActivityForResult(intent, INSTRUCTIONS_REQUEST_CODE);
        } catch (Exception e10) {
            e = e10;
            String str = TAG;
            HVLogUtils.e(str, "startFaceInstruction(): exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(str, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
            }
            callCompletionHandler(new HVError(31, getResources().getString(R.string.instructions_error)), null);
            finish();
        } catch (NoClassDefFoundError e11) {
            e = e11;
            String str2 = TAG;
            HVLogUtils.e(str2, "startFaceInstruction(): exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(str2, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            }
            callCompletionHandler(new HVError(31, getResources().getString(R.string.instructions_error)), null);
            finish();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ Context updateBaseContextLocale(Context context) {
        return super.updateBaseContextLocale(context);
    }
}
