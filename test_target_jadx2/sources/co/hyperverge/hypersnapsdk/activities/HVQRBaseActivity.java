package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.helpers.CustomTextStringConst;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.listeners.PermDialogCallback;
import co.hyperverge.hypersnapsdk.listeners.QRCompletionHandler;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.FileExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.TextConfigUtils;
import java.util.Locale;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVQRBaseActivity extends androidx.appcompat.app.d {
    private static final String TAG = "HVQRBaseActivity";

    protected static void callCompletionHandler(String str, Context context, QRCompletionHandler qRCompletionHandler, HVError hVError, JSONObject jSONObject) {
        HVLogUtils.d(TAG, "callCompletionHandler() called with: handler = [" + qRCompletionHandler + "], hvError = [" + hVError + "], result = [" + jSONObject + "]");
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics() && SDKInternalConfig.getInstance().getHvSensorBiometrics() != null) {
            SDKInternalConfig.getInstance().getHvSensorBiometrics().stopSensorBiometrics();
        }
        if (context != null) {
            FileExtensionsKt.saveSDKResultToFile(context.getApplicationContext().getFilesDir(), str, hVError, null, jSONObject);
        } else {
            HVLogUtils.e(TAG, "callCompletionHandler(), unable to save SDK result to file, context is null");
        }
        if (qRCompletionHandler != null) {
            qRCompletionHandler.onResult(hVError, jSONObject);
        } else {
            HVLogUtils.e(TAG, "callCompletionHandler(), handler is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showPermissionAlert$0(com.google.android.material.bottomsheet.a aVar, PermDialogCallback permDialogCallback, View view) {
        aVar.dismiss();
        permDialogCallback.onActionClick();
    }

    private void showPermissionAlert(HVJSONObject hVJSONObject, final PermDialogCallback permDialogCallback) {
        HVLogUtils.d(TAG, "showPermissionAlert() called with: customUIStrings = [" + hVJSONObject + "], callback = [" + permDialogCallback + "]");
        final com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
        aVar.o(true);
        View inflate = getLayoutInflater().inflate(R.layout.hv_dialog_perm_prompt_layout, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tvSubtitle);
        Button button = (Button) inflate.findViewById(R.id.btnAllow);
        HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(textView);
        HyperSnapUIConfigUtil.getInstance().customiseDescriptionTextView(textView2);
        HyperSnapUIConfigUtil.getInstance().customisePrimaryButton(button);
        HyperSnapUIConfigUtil.getInstance().customiseBackButtonIcon((ImageView) findViewById(R.id.ivBack));
        HyperSnapUIConfigUtil.getInstance().customiseClientLogo((ImageView) findViewById(R.id.clientLogo));
        HyperSnapUIConfigUtil.getInstance().customiseBrandingColor((TextView) findViewById(R.id.tvBranding));
        setupBranding(inflate);
        textView.setText(getString(R.string.hv_qr_camera_perm_title));
        textView2.setText(getString(R.string.hv_qr_camera_perm_subtitle));
        button.setText(getString(R.string.hv_qr_camera_perm_button));
        if (hVJSONObject != null) {
            Spanned text = TextConfigUtils.getText(hVJSONObject, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_CAMERA_PERMISSION_TITLE, getString(R.string.hv_qr_camera_perm_title));
            if (text != null) {
                textView.setText(text);
            }
            Spanned text2 = TextConfigUtils.getText(hVJSONObject, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_CAMERA_PERMISSION_DESC, getString(R.string.hv_qr_camera_perm_subtitle));
            if (text2 != null) {
                textView2.setText(text2);
            }
            Spanned text3 = TextConfigUtils.getText(hVJSONObject, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_CAMERA_PERMISSION_BUTTON, getString(R.string.hv_qr_camera_perm_button));
            if (text3 != null) {
                button.setText(text3);
            }
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVQRBaseActivity.lambda$showPermissionAlert$0(com.google.android.material.bottomsheet.a.this, permDialogCallback, view);
            }
        });
        aVar.setContentView(inflate);
        aVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: co.hyperverge.hypersnapsdk.activities.L0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PermDialogCallback.this.onCancel();
            }
        });
        aVar.show();
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

    Locale getCurrentLocale(Context context) {
        HVLogUtils.d(TAG, "getCurrentLocale() called with: context = [" + context + "]");
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    @Override // androidx.appcompat.app.d, androidx.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HVLogUtils.d(TAG, "onConfigurationChanged: newConfig = " + configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HVLogUtils.d(TAG, "onCreate() called with: savedInstanceState = [" + bundle + "]");
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        HVLogUtils.d(TAG, "onDestroy() called");
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onResume() {
        super.onResume();
        HVLogUtils.d(TAG, "onResume() called");
        updateBaseContextLocale(this);
    }

    protected void setupBranding(View view) {
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

    public void showCameraPermissionAlert(HVJSONObject hVJSONObject, PermDialogCallback permDialogCallback) {
        HVLogUtils.d(TAG, "showCameraPermissionAlert() called with: customUIStrings = [" + hVJSONObject + "], callback = [" + permDialogCallback + "]");
        showPermissionAlert(hVJSONObject, permDialogCallback);
    }

    public Context updateBaseContextLocale(Context context) {
        HVLogUtils.d(TAG, "updateBaseContextLocale() called with: context = [" + context + "]");
        return updateResourcesLocale(context, getCurrentLocale(context));
    }
}
