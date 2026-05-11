package co.hyperverge.hypersnapsdk.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.c;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.helpers.LanguageHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.listeners.CaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback;
import co.hyperverge.hypersnapsdk.listeners.PermDialogCallback;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.service.location.LocationServiceImpl;
import co.hyperverge.hypersnapsdk.utils.FileExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.InsetUtils;
import co.hyperverge.hypersnapsdk.utils.PermissionManager;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.utils.threading.MainUIThread;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class HVBaseActivity extends androidx.appcompat.app.d {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "co.hyperverge.hypersnapsdk.activities.HVBaseActivity";
    protected static boolean isApplicationRecreated = true;
    protected com.google.android.material.bottomsheet.a bsd;
    protected com.google.android.material.bottomsheet.a bsdNetworkRetry;
    public androidx.appcompat.app.c closeAlertDialog;
    ProgressDialog loaderDialog = null;
    MainUIThread uiThread;

    HVBaseActivity() {
    }

    private void applyEdgeToEdge() {
        new InsetUtils().applySystemInsets(getWindow(), getInsetView(), getInsetContentId().intValue());
    }

    protected static void callCompletionHandler(String str, File file, CaptureCompletionHandler captureCompletionHandler, HVError hVError, HVResponse hVResponse) {
        String str2 = TAG;
        HVLogUtils.d(str2, "callCompletionHandler() called with: handler = [" + captureCompletionHandler + "], hvError = [" + hVError + "], hvResponse = [" + hVResponse + "]");
        resetStateForCompletion(str, file, hVError, hVResponse);
        if (captureCompletionHandler != null) {
            captureCompletionHandler.onResult(hVError, hVResponse);
        } else {
            HVLogUtils.e(str2, "callCompletionHandler(), handler is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAndWaitForRemoteConfig$2() {
        if (SDKInternalConfig.getInstance() != null && SDKInternalConfig.getInstance().isRemoteConfigFetchDone() && SDKInternalConfig.getInstance().isDefaultRemoteConfigFetchDone()) {
            onRemoteConfigFetchDone();
        } else {
            new Handler().postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.b
                @Override // java.lang.Runnable
                public final void run() {
                    HVBaseActivity.this.lambda$checkAndWaitForRemoteConfig$1();
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureCloseButton$0(View view) {
        performCloseAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCloseAlert$3(DialogInterface dialogInterface, int i10) {
        onCloseActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showCloseAlert$4(DialogInterface dialogInterface, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNetworkRetryBS$5(NetworkRetryDialogCallback networkRetryDialogCallback, View view) {
        this.bsdNetworkRetry.dismiss();
        networkRetryDialogCallback.onActionClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPermissionBS$7(PermDialogCallback permDialogCallback, View view) {
        this.bsd.dismiss();
        permDialogCallback.onActionClick();
    }

    protected static void resetStateForCompletion(String str, File file, HVError hVError, HVResponse hVResponse) {
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics() && SDKInternalConfig.getInstance().getHvSensorBiometrics() != null) {
            SDKInternalConfig.getInstance().getHvSensorBiometrics().stopSensorBiometrics();
        }
        SPHelper.clearAttemptsCountForFaceNotPresent();
        SPHelper.clearAttemptsCountForStaticVideo();
        if (file != null) {
            FileExtensionsKt.saveSDKResultToFile(file, str, hVError, hVResponse, null);
        } else {
            HVLogUtils.e(TAG, "callCompletionHandler(), unable to save SDK result to file, context is null");
        }
    }

    private void showCloseAlert() {
        String str;
        String str2;
        HVLogUtils.d(TAG, "showCloseAlert() called");
        HVBaseConfig baseConfig = getBaseConfig();
        if (baseConfig != null) {
            str = baseConfig.getCloseAlertDialogTitle();
            str2 = baseConfig.getCloseAlertDialogDesc();
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = getString(R.string.hv_close_alert_title);
        }
        if (str2 == null) {
            str2 = getString(R.string.hv_close_alert_desc);
        }
        this.closeAlertDialog = new c.a(this).o(str).h(str2).d(false).l(getString(R.string.hv_close_alert_positive_action), new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HVBaseActivity.this.lambda$showCloseAlert$3(dialogInterface, i10);
            }
        }).i(getString(R.string.hv_close_alert_negative_action), new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HVBaseActivity.lambda$showCloseAlert$4(dialogInterface, i10);
            }
        }).q();
    }

    private void showPermissionBS(Spanned spanned, Spanned spanned2, Spanned spanned3, final PermDialogCallback permDialogCallback) {
        HVLogUtils.d(TAG, "showPermissionBS() called with: titleSpanned = [" + ((Object) spanned) + "], descSpanned = [" + ((Object) spanned2) + "], buttonSpanned = [" + ((Object) spanned3) + "], callback = [" + permDialogCallback + "]");
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
        this.bsd = aVar;
        aVar.o(true);
        View inflate = getLayoutInflater().inflate(R.layout.hv_dialog_perm_prompt_layout, (ViewGroup) null, false);
        setupBranding(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tvSubtitle);
        Button button = (Button) inflate.findViewById(R.id.btnAllow);
        HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(textView);
        HyperSnapUIConfigUtil.getInstance().customiseDescriptionTextView(textView2);
        HyperSnapUIConfigUtil.getInstance().customisePrimaryButton(button);
        textView.setText(getString(R.string.hv_camera_perm_title));
        textView2.setText(getString(R.string.hv_camera_perm_subtitle));
        button.setText(getString(R.string.hv_camera_perm_button));
        if (spanned != null) {
            textView.setText(spanned);
        }
        if (spanned2 != null) {
            textView2.setText(spanned2);
        }
        if (spanned3 != null) {
            button.setText(spanned3);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVBaseActivity.this.lambda$showPermissionBS$7(permDialogCallback, view);
            }
        });
        this.bsd.setContentView(inflate);
        this.bsd.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: co.hyperverge.hypersnapsdk.activities.f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PermDialogCallback.this.onCancel();
            }
        });
        this.bsd.show();
    }

    private void stopLocationUpdates() {
        HVLogUtils.d(TAG, "stopLocationUpdates() called");
        try {
            LocationServiceImpl.getInstance(this).stopLocationUpdates();
            LocationServiceImpl.destroy();
        } catch (NoClassDefFoundError e10) {
            String str = TAG;
            HVLogUtils.e(str, "stopLocationUpdates(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, "gms excluded");
        }
    }

    private Context updateResourcesLocale(Context context, Locale locale) {
        HVLogUtils.d(TAG, "updateResourcesLocale() called with: context = [" + context + "], locale = [" + locale + "]");
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    private Context updateResourcesLocaleLegacy(Context context, Locale locale) {
        HVLogUtils.d(TAG, "updateResourcesLocaleLegacy() called with: context = [" + context + "], locale = [" + locale + "]");
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }

    abstract void callCompletionHandler(HVError hVError, HVResponse hVResponse);

    /* renamed from: checkAndWaitForRemoteConfig, reason: merged with bridge method [inline-methods] */
    public void lambda$checkAndWaitForRemoteConfig$1() {
        HVLogUtils.d(TAG, "checkAndWaitForRemoteConfig() called");
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.i
            @Override // java.lang.Runnable
            public final void run() {
                HVBaseActivity.this.lambda$checkAndWaitForRemoteConfig$2();
            }
        });
    }

    protected void configureCloseButton(ImageView imageView) {
        HVBaseConfig baseConfig;
        HVLogUtils.d(TAG, "configureCloseButton() called with: ivClose = [\" + ivClose + \"]");
        if (imageView == null || (baseConfig = getBaseConfig()) == null) {
            return;
        }
        imageView.setVisibility(baseConfig.shouldShowCloseIcon() ? 0 : 8);
        if (baseConfig.shouldShowCloseIcon()) {
            HyperSnapUIConfigUtil.getInstance().customiseCloseButtonIcon(imageView);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVBaseActivity.this.lambda$configureCloseButton$0(view);
            }
        });
    }

    protected File getAppFilesDir() {
        try {
            return getApplicationContext().getFilesDir();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "getAppFilesDir(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            return null;
        }
    }

    abstract HVBaseConfig getBaseConfig();

    Locale getCurrentLocale(Context context) {
        HVLogUtils.d(TAG, "getCurrentLocale() called with: context = [" + context + "]");
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    abstract Integer getInsetContentId();

    abstract View getInsetView();

    public void handleCloseAction() {
        HVLogUtils.d(TAG, "handleCloseAction() called");
        if (shouldAllowActivityClose()) {
            if (shouldShowCloseAlert() && Utils.isActivityActive(this)) {
                showCloseAlert();
            } else {
                onCloseActivity();
            }
        }
    }

    @Override // androidx.activity.f, android.app.Activity
    public void onBackPressed() {
        HVLogUtils.d(TAG, "onBackPressed() called");
        handleCloseAction();
    }

    abstract void onCloseActivity();

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HVLogUtils.d(TAG, "onCreate() called with: savedInstanceState = [" + bundle + "]");
        LanguageHelper.refresh(this);
        this.uiThread = MainUIThread.getInstance();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onDestroy() {
        com.google.android.material.bottomsheet.a aVar = this.bsd;
        if (aVar != null) {
            aVar.dismiss();
        }
        com.google.android.material.bottomsheet.a aVar2 = this.bsdNetworkRetry;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
        super.onDestroy();
        HVLogUtils.d(TAG, "onDestroy() called");
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            stopLocationUpdates();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onPause() {
        super.onPause();
        HVLogUtils.d(TAG, "onPause() called");
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            stopLocationUpdates();
        }
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics() || SDKInternalConfig.getInstance().getHvSensorBiometrics() == null) {
            return;
        }
        SDKInternalConfig.getInstance().getHvSensorBiometrics().pauseSensorBiometrics();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        applyEdgeToEdge();
    }

    public abstract void onRemoteConfigFetchDone();

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onResume() {
        super.onResume();
        HVLogUtils.d(TAG, "onResume() called");
        updateBaseContextLocale(this);
        LanguageHelper.refresh(this);
        if (SDKInternalConfig.getInstance().isRemoteConfigFetchDone() && HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics() && SDKInternalConfig.getInstance().getHvSensorBiometrics() != null) {
            SDKInternalConfig.getInstance().getHvSensorBiometrics().resumeSensorBiometrics();
        }
    }

    @Override // androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        HVLogUtils.d(TAG, "onSaveInstanceState() called with: outState = [" + bundle + "]");
        SPHelper.init(getApplicationContext());
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onStart() {
        super.onStart();
        configureCloseButton((ImageView) findViewById(R.id.ivClose));
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onStop() {
        androidx.appcompat.app.c cVar;
        super.onStop();
        HVLogUtils.d(TAG, "onStop() called");
        if (isFinishing() && (cVar = this.closeAlertDialog) != null && cVar.isShowing()) {
            this.closeAlertDialog.dismiss();
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        HVLogUtils.d(TAG, "onSupportNavigateUp() called");
        onBackPressed();
        return false;
    }

    protected void performCloseAction() {
        HVLogUtils.d(TAG, "performCloseAction() called");
        callCompletionHandler(new HVError(44, getResources().getString(R.string.sdk_close_error)), null);
        finish();
    }

    protected boolean performPermissionRevokeCheck(String str) {
        if (isApplicationRecreated) {
            PermissionManager permissionManager = new PermissionManager();
            ArrayList arrayList = new ArrayList(Arrays.asList("android.permission.CAMERA"));
            permissionManager.checkAndRequestPermissions(this, arrayList, false);
            PermissionManager.StatusArray status = permissionManager.getStatus(this, arrayList);
            if (!status.denied.isEmpty()) {
                resetStateForCompletion(str, getAppFilesDir(), new HVError(45, getResources().getString(R.string.hv_permission_revoked_error) + " " + TextUtils.join(",", status.denied)), null);
                finish();
                return true;
            }
        }
        return false;
    }

    protected void setupBranding(View view) {
        HVLogUtils.d(TAG, "setupBranding() called with: rootView = [" + view + "]");
        if (view == null) {
            view = findViewById(android.R.id.content).getRootView();
        }
        TextView textView = (TextView) view.findViewById(R.id.tvBranding);
        TextView textView2 = (TextView) view.findViewById(R.id.tvBrandingHyphen);
        TextView textView3 = (TextView) view.findViewById(R.id.sdkVersionNumber);
        textView3.setText("v7.0.1");
        boolean z10 = SDKInternalConfig.getInstance() != null && SDKInternalConfig.getInstance().isShouldUseBranding();
        boolean z11 = SDKInternalConfig.getInstance() != null && SDKInternalConfig.getInstance().isShouldShowSDKVersion();
        textView.setVisibility(z10 ? 0 : 8);
        textView2.setVisibility(z11 ? 0 : 8);
        textView3.setVisibility(z11 ? 0 : 8);
    }

    abstract boolean shouldAllowActivityClose();

    abstract boolean shouldShowCloseAlert();

    public void showCameraPermissionBS(Spanned spanned, Spanned spanned2, Spanned spanned3, PermDialogCallback permDialogCallback) {
        HVLogUtils.d(TAG, "showCameraPermissionBS() called with: titleTextSpanned = [" + ((Object) spanned) + "], descTextSpanned = [" + ((Object) spanned2) + "], buttonTextSpanned = [" + ((Object) spanned3) + "], callback = [" + permDialogCallback + "]");
        showPermissionBS(spanned, spanned2, spanned3, permDialogCallback);
    }

    public void showNetworkRetryBS(final NetworkRetryDialogCallback networkRetryDialogCallback) {
        HVLogUtils.d(TAG, "showNetworkRetryBS() called with: callback = [" + networkRetryDialogCallback + "]");
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
        this.bsdNetworkRetry = aVar;
        aVar.o(true);
        View inflate = getLayoutInflater().inflate(R.layout.hv_dialog_network_retry_prompt_layout, (ViewGroup) null, false);
        setupBranding(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tvSubtitle_1);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tvSubtitle_2);
        TextView textView4 = (TextView) inflate.findViewById(R.id.tvSubtitle_3);
        Button button = (Button) inflate.findViewById(R.id.btnRetry);
        textView.setText(getString(R.string.hv_network_retry_dialog_title));
        textView2.setText(getString(R.string.hv_network_retry_dialog_subtitle_1));
        textView3.setText(getString(R.string.hv_network_retry_dialog_subtitle_2));
        textView4.setText(getString(R.string.hv_network_retry_dialog_subtitle_3));
        button.setText(getString(R.string.hv_network_retry_dialog_button));
        button.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVBaseActivity.this.lambda$showNetworkRetryBS$5(networkRetryDialogCallback, view);
            }
        });
        this.bsdNetworkRetry.setContentView(inflate);
        this.bsdNetworkRetry.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: co.hyperverge.hypersnapsdk.activities.d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                NetworkRetryDialogCallback.this.onCancel();
            }
        });
        this.bsdNetworkRetry.show();
    }

    public Context updateBaseContextLocale(Context context) {
        HVLogUtils.d(TAG, "updateBaseContextLocale() called with: context = [" + context + "]");
        return updateResourcesLocale(context, getCurrentLocale(context));
    }

    protected static File getAppFilesDir(Context context) {
        try {
            return context.getApplicationContext().getFilesDir();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "getAppFilesDir(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            return null;
        }
    }
}
