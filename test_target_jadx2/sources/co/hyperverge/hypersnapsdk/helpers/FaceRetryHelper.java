package co.hyperverge.hypersnapsdk.helpers;

import android.util.Log;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FaceRetryHelper {
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.FaceRetryHelper";
    static FaceRetryHelper faceRetryHelper;

    public interface FaceRetryListener {
        void onResult(boolean z10, String str, String str2, HVError hVError);
    }

    public static void destroy() {
        faceRetryHelper = null;
    }

    public static FaceRetryHelper get() {
        if (faceRetryHelper == null) {
            faceRetryHelper = new FaceRetryHelper();
        }
        return faceRetryHelper;
    }

    public void checkForRetakeMessage(JSONObject jSONObject, HVFaceConfig hVFaceConfig, FaceRetryListener faceRetryListener) {
        HVLogUtils.d(TAG, "checkForRetakeMessage() called with: result = [" + jSONObject + "], faceConfig = [" + hVFaceConfig + "], listener = [" + faceRetryListener + "]");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
            if (!jSONObject2.has(AppConstants.SUMMARY)) {
                faceRetryListener.onResult(false, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null);
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(AppConstants.SUMMARY);
            String string = jSONObject3.getString("action");
            String str = AppConstants.RETAKE_DEFAULT_MESSAGE;
            String mapperForUrl = SPHelper.setMapperForUrl(hVFaceConfig.getLivenessEndpoint(), hVFaceConfig.getSuffixModuleId());
            if (jSONObject3.has(AppConstants.RETAKE_MESSAGE)) {
                str = jSONObject3.getString(AppConstants.RETAKE_MESSAGE);
            }
            if (jSONObject3.has(AppConstants.DETAILS)) {
                JSONArray jSONArray = jSONObject3.getJSONArray(AppConstants.DETAILS);
                if (jSONArray.length() > 0) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(0);
                    if (jSONObject4.has(AppConstants.RETAKE_ERROR_CODE)) {
                        String string2 = jSONObject4.getString(AppConstants.RETAKE_ERROR_CODE);
                        try {
                            HVJSONObject customUIStrings = hVFaceConfig.getCustomUIStrings();
                            if (customUIStrings.hasAndNotEmpty(string2)) {
                                str = customUIStrings.getString(string2);
                            }
                        } catch (JSONException e10) {
                            Log.e(TAG, Utils.getErrorMessage(e10));
                            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                            }
                        }
                    }
                }
            }
            if (!hVFaceConfig.isShouldHandleRetries()) {
                faceRetryListener.onResult(false, str, string, null);
                return;
            }
            if (!string.equalsIgnoreCase(AppConstants.RETAKE)) {
                faceRetryListener.onResult(false, BuildConfig.FLAVOR, string, null);
            } else if (mapperForUrl != null) {
                faceRetryListener.onResult(true, str, string, null);
            } else {
                faceRetryListener.onResult(false, str, string, getErrorForEmptyTransactionID());
            }
        } catch (JSONException e11) {
            String str2 = TAG;
            HVLogUtils.e(str2, "checkForRetakeMessage(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            Log.e(str2, Utils.getErrorMessage(e11));
            faceRetryListener.onResult(false, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null);
        }
    }

    @Deprecated
    public String getAdvertisingID() {
        String advertisingID = AdvertisingIDHelper.get().getAdvertisingID();
        HVLogUtils.d(TAG, "getAdvertisingID() returned: " + advertisingID);
        return advertisingID;
    }

    public HVError getErrorForEmptyTransactionID() {
        HVLogUtils.d(TAG, "getErrorForEmptyTransactionID() called");
        return new HVError(17, AppConstants.EMPTY_TRANSACTION_ERROR);
    }

    public JSONObject setLivenessHeaders(HVFaceConfig hVFaceConfig) {
        HVLogUtils.d(TAG, "setLivenessHeaders() called with: faceConfig = [" + hVFaceConfig + "]");
        JSONObject headers = hVFaceConfig.getHeaders();
        try {
            if (!SPHelper.getTransactionID().isEmpty() && !headers.has("transactionId")) {
                headers.put("transactionId", SPHelper.getTransactionID());
            }
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldActivateDeviceBlocklist() && !StringUtils.isEmptyOrNull(null)) {
                headers.put(AppConstants.DEVICE_ID, (Object) null);
            }
            hVFaceConfig.setLivenessAPIHeaders(headers);
        } catch (JSONException e10) {
            String str = TAG;
            HVLogUtils.e(str, "setLivenessHeaders(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
        }
        return headers;
    }

    public JSONObject setLivenessParams(HVFaceConfig hVFaceConfig) {
        String str = TAG;
        HVLogUtils.d(str, "setLivenessParams() called with: faceConfig = [" + hVFaceConfig + "]");
        JSONObject livenessParams = hVFaceConfig.getLivenessParams();
        try {
            JSONObject retryCountForKey = SPHelper.getRetryCountForKey(hVFaceConfig.getLivenessEndpoint(), hVFaceConfig.getSuffixModuleId());
            HVLogUtils.d(str, "setLivenessParams(): retryObj = [" + retryCountForKey + "]");
            if (retryCountForKey != null) {
                Iterator<String> keys = retryCountForKey.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        livenessParams.put(next, String.valueOf(retryCountForKey.getInt(next)));
                    } catch (JSONException e10) {
                        String str2 = TAG;
                        HVLogUtils.d(str2, "setLivenessParams(): exception = [" + Utils.getErrorMessage(e10) + "]");
                        Log.e(str2, Utils.getErrorMessage(e10));
                    }
                }
            }
            hVFaceConfig.setLivenessAPIParameters(livenessParams);
        } catch (Exception e11) {
            String str3 = TAG;
            HVLogUtils.e(str3, "setLivenessParams(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            Log.e(str3, Utils.getErrorMessage(e11));
        }
        return livenessParams;
    }

    public void setRetryLivenessParamsAndHeaders(HVFaceConfig hVFaceConfig) {
        HVLogUtils.d(TAG, "setRetryLivenessParamsAndHeaders() called with: faceConfig = [" + hVFaceConfig + "]");
        setLivenessHeaders(hVFaceConfig);
        setLivenessParams(hVFaceConfig);
    }
}
