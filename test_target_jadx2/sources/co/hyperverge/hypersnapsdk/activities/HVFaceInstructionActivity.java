package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.helpers.CustomTextStringConst;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback;
import co.hyperverge.hypersnapsdk.listeners.PermDialogCallback;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.TextConfigUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import org.json.JSONException;

/* loaded from: classes.dex */
public class HVFaceInstructionActivity extends HVBaseActivity {
    public static final int CANCEL_SELFIE = 3;
    public static final int CONSENT_REQUEST_CODE = 1;
    public static final int PROCEED_SELFIE = 2;
    private static final String TAG = "co.hyperverge.hypersnapsdk.activities.HVFaceInstructionActivity";
    private MaterialButton btnProceed;
    private HVFaceConfig faceConfig;
    private TextView tvSubtitle;
    private TextView tvTitle;
    private final TimingUtils screenLoadSuccessTimingUtils = new TimingUtils();
    private final TimingUtils proceedButtonClickTimingUtils = new TimingUtils();

    private void findViews() {
        HVLogUtils.d(TAG, "findViews() called");
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.proceed_button);
        this.btnProceed = materialButton;
        materialButton.setEnabled(true);
        ImageView imageView = (ImageView) findViewById(R.id.ivBack);
        imageView.setEnabled(true);
        this.tvTitle = (TextView) findViewById(R.id.tvTitle);
        this.tvSubtitle = (TextView) findViewById(R.id.tvSubtitle);
        this.btnProceed.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVFaceInstructionActivity.this.lambda$findViews$0(view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVFaceInstructionActivity.this.lambda$findViews$1(view);
            }
        });
    }

    private HVFaceConfig getFaceConfig() {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig != null) {
            return hVFaceConfig;
        }
        HVBaseActivity.callCompletionHandler(null, getAppFilesDir(), CallbackProvider.get().injectFaceCaptureCallback(), new HVError(2, getResources().getString(R.string.face_config_error)), null);
        finish();
        return new HVFaceConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findViews$0(View view) {
        view.setEnabled(false);
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieInstructionsScreenProceedButtonClicked(this.proceedButtonClickTimingUtils.getTimeDifferenceLong().longValue());
        }
        if (this.faceConfig.shouldShowConsent()) {
            proceedToConsent();
        } else {
            proceedToSelfie();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findViews$1(View view) {
        view.setEnabled(false);
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendDetectorUnavailableError$2(HVError hVError) {
        HVBaseActivity.callCompletionHandler(getFaceConfig().getModuleId(), getAppFilesDir(), CallbackProvider.get().injectFaceCaptureCallback(), new HVError(60, hVError.getErrorMessage()), null);
        if (isFinishing() || isDestroyed()) {
            HVLogUtils.w(TAG, "Activity already finishing/destroyed when detector error was sent.");
        } else {
            HVLogUtils.i(TAG, "Finishing activity because no detector is available.");
            finish();
        }
    }

    private void loadAnimation() {
        HVLogUtils.d(TAG, "loadAnimation() called");
        HVLottieHelper.load((LottieAnimationView) findViewById(R.id.lavFaceInstructions), HVLottieHelper.FACE_INSTRUCTION, HVLottieHelper.State.START, null);
    }

    private void sendDetectorUnavailableError(Intent intent) {
        final HVError hVError = (HVError) intent.getSerializableExtra("hvError");
        HVLogUtils.e(TAG, "sendDetectorUnavailableError() called with: message = [" + hVError.getErrorMessage() + "]");
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.H0
            @Override // java.lang.Runnable
            public final void run() {
                HVFaceInstructionActivity.this.lambda$sendDetectorUnavailableError$2(hVError);
            }
        });
    }

    private void sendInsufficientPermissions(Intent intent) {
        HVError hVError = (HVError) intent.getSerializableExtra("hvError");
        HVLogUtils.d(TAG, "sendInsufficientPermissions() called with: message = [" + hVError.getErrorMessage() + "]");
        try {
            HVBaseActivity.callCompletionHandler(this.faceConfig.getModuleId(), getAppFilesDir(), CallbackProvider.get().injectFaceCaptureCallback(), new HVError(4, hVError.getErrorMessage()), null);
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "reinitTimingUtils(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        finish();
    }

    private void sendOperationCancelled() {
        HVLogUtils.d(TAG, "sendOperationCancelled() called");
        try {
            HVBaseActivity.callCompletionHandler(this.faceConfig.getModuleId(), getAppFilesDir(), CallbackProvider.get().injectFaceCaptureCallback(), new HVError(3, getResources().getString(R.string.operation_cancelled)), null);
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "sendOperationCancelled(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    void callCompletionHandler(HVError hVError, HVResponse hVResponse) {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        HVBaseActivity.callCompletionHandler(hVFaceConfig != null ? hVFaceConfig.getModuleId() : null, getAppFilesDir(), CallbackProvider.get().injectFaceCaptureCallback(), hVError, hVResponse);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    /* renamed from: checkAndWaitForRemoteConfig */
    public /* bridge */ /* synthetic */ void lambda$checkAndWaitForRemoteConfig$1() {
        super.lambda$checkAndWaitForRemoteConfig$1();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    HVBaseConfig getBaseConfig() {
        return getFaceConfig();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    Integer getInsetContentId() {
        return Integer.valueOf(R.id.hv_face_instruction);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    View getInsetView() {
        return findViewById(R.id.hvBackgroundContainer);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void handleCloseAction() {
        super.handleCloseAction();
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        HVLogUtils.d(TAG, "onActivityResult() called with: requestCode = [" + i10 + "], resultCode = [" + i11 + "], data = [" + intent + "]");
        if (i11 == 1003 && intent != null) {
            sendInsufficientPermissions(intent);
            return;
        }
        if (i11 == 1004 && intent != null) {
            sendDetectorUnavailableError(intent);
            return;
        }
        if (i11 == 1005) {
            finish();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2 && i11 == -1) {
                finish();
                return;
            }
            return;
        }
        if (i11 == 120 || i11 == -1) {
            finish();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.activity.f, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    void onCloseActivity() {
        HVLogUtils.d(TAG, "onCloseActivity() called");
        if (getFaceConfig().shouldShowModuleBackButton()) {
            sendOperationCancelled();
            finish();
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
        HVLogUtils.d(TAG, "onCreate() called with: savedInstanceState = [" + bundle + "]");
        this.screenLoadSuccessTimingUtils.init();
        setContentView(R.layout.hv_activity_face_instruction);
        if (bundle != null) {
            HVFaceConfig hVFaceConfig = (HVFaceConfig) new com.google.gson.e().k(bundle.getString("faceConfig"), HVFaceConfig.class);
            this.faceConfig = hVFaceConfig;
            if (performPermissionRevokeCheck(hVFaceConfig.getModuleId())) {
                return;
            }
        }
        findViews();
        boolean booleanExtra = getIntent().getBooleanExtra("shouldUseBackCam", false);
        this.faceConfig = (HVFaceConfig) getIntent().getSerializableExtra("hvFaceConfig");
        HVJSONObject hVJSONObject = null;
        setupBranding(null);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                hVJSONObject = new HVJSONObject(extras.getString("customUIStrings"));
            }
        } catch (JSONException e10) {
            String str = TAG;
            HVLogUtils.e(str, "onCreate(): customUIStrings exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieInstructionsScreenLoadFailure(new HVError(2, Utils.getErrorMessage(e10)));
            }
        }
        if (hVJSONObject != null) {
            try {
                if (hVJSONObject.has("faceInstructionsTitleTypeFace") && hVJSONObject.getInt("faceInstructionsTitleTypeFace") > 0) {
                    this.tvTitle.setTypeface(androidx.core.content.res.f.h(getApplicationContext(), hVJSONObject.getInt("faceInstructionsTitleTypeFace")));
                }
                if (hVJSONObject.hasAndNotEmpty("faceInstructionsProceedBackCamTypeFace") && hVJSONObject.getInt("faceInstructionsProceedBackCamTypeFace") > 0) {
                    this.btnProceed.setTypeface(androidx.core.content.res.f.h(getApplicationContext(), hVJSONObject.getInt("faceInstructionsProceedBackCamTypeFace")));
                }
                Spanned text = TextConfigUtils.getText(hVJSONObject, CustomTextStringConst.FaceCaptureTextConfigs.FACE_INSTRUCTIONS_TITLE, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_INSTRUCTIONS_TITLE);
                if (text != null) {
                    this.tvTitle.setText(text);
                }
                Spanned text2 = TextConfigUtils.getText(hVJSONObject, CustomTextStringConst.FaceCaptureTextConfigs.FACE_INSTRUCTIONS_DESC, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_INSTRUCTIONS_DESC);
                if (text2 != null) {
                    this.tvSubtitle.setText(text2);
                }
                if (booleanExtra) {
                    Spanned text3 = TextConfigUtils.getText(hVJSONObject, "faceInstructionsProceedBackCam", "faceInstructionsProceedBackCam", getResources().getString(R.string.faceInstructionsProceedBackCam));
                    if (text3 != null) {
                        this.btnProceed.setText(text3);
                    }
                } else {
                    Spanned text4 = TextConfigUtils.getText(hVJSONObject, "faceInstructionsProceed", "faceInstructions_button", getResources().getString(R.string.faceInstructionsProceed));
                    if (text4 != null) {
                        this.btnProceed.setText(text4);
                    }
                }
            } catch (JSONException e11) {
                String str2 = TAG;
                HVLogUtils.e(str2, "onCreate(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
                Log.e(str2, Utils.getErrorMessage(e11));
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieInstructionsScreenLoadFailure(new HVError(2, Utils.getErrorMessage(e11)));
                }
            }
        }
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieInstructionsScreenLoadSuccess(this.screenLoadSuccessTimingUtils.getTimeDifferenceLong().longValue());
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieInstructionsScreenLaunched();
            this.proceedButtonClickTimingUtils.init();
        }
        loadAnimation();
        HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(this.tvTitle);
        HyperSnapUIConfigUtil.getInstance().customiseDescriptionTextView(this.tvSubtitle);
        HyperSnapUIConfigUtil.getInstance().customisePrimaryButton(this.btnProceed);
        HyperSnapUIConfigUtil.getInstance().customiseBackButtonIcon((ImageView) findViewById(R.id.ivBack));
        HyperSnapUIConfigUtil.getInstance().customiseClientLogo((ImageView) findViewById(R.id.clientLogo));
        HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(findViewById(R.id.hvBackgroundContainer));
        HyperSnapUIConfigUtil.getInstance().customiseBrandingColor((TextView) findViewById(R.id.tvBranding));
        if (getFaceConfig().shouldShowModuleBackButton()) {
            return;
        }
        findViewById(R.id.ivBack).setVisibility(4);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public void onRemoteConfigFetchDone() {
        HVLogUtils.d(TAG, "onRemoteConfigFetchDone() called");
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("faceConfig", new com.google.gson.e().t(this.faceConfig));
        HVLogUtils.d(TAG, "onSaveInstanceState() called with: outState = [" + bundle + "]");
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.appcompat.app.d
    public /* bridge */ /* synthetic */ boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    public void proceedToConsent() {
        HVLogUtils.d(TAG, "proceedToConsent() called");
        Intent intent = new Intent(this, (Class<?>) HVConsentActivity.class);
        intent.putExtra("hvFaceConfig", (HVFaceConfig) getIntent().getSerializableExtra("hvFaceConfig"));
        this.btnProceed.setEnabled(true);
        startActivityForResult(intent, 1);
    }

    public void proceedToSelfie() {
        HVLogUtils.d(TAG, "proceedToSelfie() called");
        Intent intent = new Intent(this, (Class<?>) HVFaceActivity.class);
        intent.putExtra("hvFaceConfig", (HVFaceConfig) getIntent().getSerializableExtra("hvFaceConfig"));
        this.btnProceed.setEnabled(true);
        startActivityForResult(intent, 2);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    boolean shouldAllowActivityClose() {
        return true;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    boolean shouldShowCloseAlert() {
        return getFaceConfig().shouldShowCloseAlert();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void showCameraPermissionBS(Spanned spanned, Spanned spanned2, Spanned spanned3, PermDialogCallback permDialogCallback) {
        super.showCameraPermissionBS(spanned, spanned2, spanned3, permDialogCallback);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void showNetworkRetryBS(NetworkRetryDialogCallback networkRetryDialogCallback) {
        super.showNetworkRetryBS(networkRetryDialogCallback);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ Context updateBaseContextLocale(Context context) {
        return super.updateBaseContextLocale(context);
    }
}
