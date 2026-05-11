package co.hyperverge.hypersnapsdk.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Size;
import co.hyperverge.hypersnapsdk.data.models.FeatureConfig;
import co.hyperverge.hypersnapsdk.listeners.SessionStatusCallback;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.IPAddress;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.e;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SPHelper {
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.SPHelper";
    private static SharedPreferences configsSp = null;
    private static SharedPreferences.Editor editor = null;
    private static SharedPreferences sp = null;
    private static final String spHyperSnap = "HyperSnapSP";
    private static final String spHyperSnapConfigs = "HyperSnapConfigsSP";

    public static void clearAttemptsCountForFaceNotPresent() {
        HVLogUtils.d(TAG, "clearAttemptsCountForFaceNotPresent() called");
        try {
            getEditor().remove(AppConstants.spFaceNotPresentKey).apply();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
    }

    public static void clearAttemptsCountForStaticVideo() {
        HVLogUtils.d(TAG, "clearAttemptsCountForStaticVideo() called");
        try {
            getEditor().remove(AppConstants.spStaticVideoKey).apply();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
    }

    public static void closeTransactionId() {
        HVLogUtils.d(TAG, "closeTransactionId() called");
        getEditor().remove(getTransactionID());
        getEditor().remove("transactionId");
        getEditor().clear();
        getEditor().commit();
    }

    @Deprecated
    public static boolean generateRandomTransactionId(SessionStatusCallback sessionStatusCallback) {
        HVLogUtils.d(TAG, "generateRandomTransactionId() called with: callback = [" + sessionStatusCallback + "]");
        return setTransactionID(String.valueOf(System.currentTimeMillis()) + UUID.randomUUID().toString().substring(1, 5), sessionStatusCallback);
    }

    public static int getAttemptsCountForFaceNotPresent() {
        HVLogUtils.d(TAG, "getAttemptsCountForFaceNotPresent() called");
        try {
            return sp.getInt(AppConstants.spFaceNotPresentKey, 0);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return -1;
        }
    }

    public static int getAttemptsCountForImage(String str, String str2) {
        HVLogUtils.d(TAG, "getAttemptsCountForImage() called with: url = [" + str + "], suffix = [" + str2 + "]");
        try {
            String keyName = getKeyName(str, str2);
            HashMap<String, Integer> hashMapFromSharedPref = getHashMapFromSharedPref();
            if (hashMapFromSharedPref == null || !hashMapFromSharedPref.containsKey(keyName)) {
                return 0;
            }
            return hashMapFromSharedPref.get(keyName).intValue();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return 0;
        }
    }

    public static int getAttemptsCountForStaticVideo() {
        HVLogUtils.d(TAG, "getAttemptsCountForFaceNotPresent() called");
        try {
            return sp.getInt(AppConstants.spStaticVideoKey, 0);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return -1;
        }
    }

    public static k getConfigsMetadata(String str, String str2) {
        String str3 = TAG;
        HVLogUtils.d(str3, "getConfigsMetadata() called with: configType = [" + str + "], parent = [" + str2 + "]");
        SharedPreferences configsSp2 = getConfigsSp();
        if (configsSp2 == null) {
            HVLogUtils.d(str3, "getConfigsMetadata: SharedPreferences is null");
            return null;
        }
        String metadataKey = getMetadataKey(str, str2);
        if (metadataKey == null) {
            HVLogUtils.d(str3, "getConfigsMetadata: Metadata key is null");
            return null;
        }
        String string = configsSp2.getString(metadataKey, null);
        if (string == null || string.isEmpty()) {
            HVLogUtils.d(str3, "getConfigsMetadata: No metadata found for key: " + metadataKey);
            return null;
        }
        try {
            k h10 = m.c(string).h();
            HVLogUtils.d(str3, "getConfigsMetadata: returning: " + h10);
            return h10;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "getConfigsMetadata: Error parsing metadata JSON", e10);
            return null;
        }
    }

    private static SharedPreferences getConfigsSp() {
        return configsSp;
    }

    private static SharedPreferences.Editor getEditor() {
        if (editor == null) {
            editor = getSP().edit();
        }
        return editor;
    }

    public static long getFeatureConfigLastModified() {
        HVLogUtils.d(TAG, "getFeatureConfigLastModified() called");
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(AppConstants.FEATURE_CONFIG_LAST_MODIFIED, 0L);
        }
        return 0L;
    }

    public static Map<String, FeatureConfig> getFeatureConfigMap() {
        HVLogUtils.d(TAG, "getFeatureConfigMap() called");
        try {
            SharedPreferences sharedPreferences = sp;
            if (sharedPreferences != null) {
                return (Map) new e().l(sharedPreferences.getString(AppConstants.FEATURE_CONFIG, BuildConfig.FLAVOR), new TypeToken<HashMap<String, Boolean>>() { // from class: co.hyperverge.hypersnapsdk.helpers.SPHelper.1
                }.getType());
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
        return HVFeatureConfigHelper.getDefaultFeatureMap();
    }

    public static HashMap<String, Integer> getHashMapFromSharedPref() {
        HVLogUtils.d(TAG, "getHashMapFromSharedPref() called");
        e eVar = new e();
        SharedPreferences sharedPreferences = sp;
        String str = BuildConfig.FLAVOR;
        if (sharedPreferences != null) {
            str = sharedPreferences.getString(getTransactionID(), BuildConfig.FLAVOR);
        }
        HashMap<String, Integer> hashMap = (HashMap) eVar.l(str, new TypeToken<HashMap<String, Integer>>() { // from class: co.hyperverge.hypersnapsdk.helpers.SPHelper.2
        }.getType());
        return hashMap == null ? new HashMap<>() : hashMap;
    }

    public static HVError getInvalidTransactionIdError() {
        return new HVError(6, String.format("Cannot set \"%s\" as the transaction ID value", "transactionId"));
    }

    public static IPAddress getIpToGeoData() {
        HVLogUtils.d(TAG, "getIpToGeoData() called");
        return (IPAddress) new e().k(sp.getString("ipAddressData", new JSONObject().toString()), IPAddress.class);
    }

    public static String getKeyName(String str, String str2) {
        HVLogUtils.d(TAG, "getKeyName() called with: url = [" + str + "], suffix = [" + str2 + "]");
        String splitURLIntoKey = splitURLIntoKey(str);
        if (str2 == null || str2.trim().isEmpty()) {
            return splitURLIntoKey;
        }
        return splitURLIntoKey + "_" + str2;
    }

    public static Size getLastUsedCameraResolution() {
        HVLogUtils.d(TAG, "getLastUsedCameraResolution() called");
        if (getSP() == null) {
            return null;
        }
        return new Size(getSP().contains(AppConstants.LAST_USED_WIDTH) ? getSP().getInt(AppConstants.LAST_USED_WIDTH, -1) : -1, getSP().contains(AppConstants.LAST_USED_HEIGHT) ? getSP().getInt(AppConstants.LAST_USED_HEIGHT, -1) : -1);
    }

    public static HashMap<String, Integer> getMapper(HashMap<String, Integer> hashMap, String str) {
        HVLogUtils.d(TAG, "getMapper() called with: hashMap = [" + hashMap + "], keyName = [" + str + "]");
        if (hashMap.containsKey(str)) {
            hashMap.put(str, Integer.valueOf(hashMap.get(str).intValue() + 1));
        } else {
            hashMap.put(str, 1);
        }
        if (hashMap.containsKey(AppConstants.TOTAL_ATTEMPTS)) {
            hashMap.put(AppConstants.TOTAL_ATTEMPTS, Integer.valueOf(hashMap.get(AppConstants.TOTAL_ATTEMPTS).intValue() + 1));
        } else {
            hashMap.put(AppConstants.TOTAL_ATTEMPTS, 1);
        }
        return hashMap;
    }

    private static String getMetadataKey(String str, String str2) {
        HVLogUtils.d(TAG, "getMetadataKey() called with: configType = [" + str + "], parent = [" + str2 + "]");
        str.hashCode();
        if (str.equals(AppConstants.REMOTE_CONFIGS)) {
            return "remote-configs-metadata_" + str2;
        }
        if (!str.equals(AppConstants.SDK_VERSION_SPECIFIC_FEATURE_CONFIGS)) {
            return null;
        }
        return "sdk-version-specific-feature-configs-metadata_" + str2;
    }

    public static JSONObject getRetryCountForKey(String str, String str2) {
        String str3 = TAG;
        HVLogUtils.d(str3, "getRetryCountForKey() called with: url = [" + str + "], suffix = [" + str2 + "]");
        HashMap<String, Integer> hashMapFromSharedPref = getHashMapFromSharedPref();
        JSONObject jSONObject = new JSONObject();
        String keyName = getKeyName(str, str2);
        HVLogUtils.d(str3, "getRetryCountForKey: hashMap = " + hashMapFromSharedPref + ", keyName = " + keyName);
        int intValue = hashMapFromSharedPref.containsKey(AppConstants.TOTAL_ATTEMPTS) ? hashMapFromSharedPref.get(AppConstants.TOTAL_ATTEMPTS).intValue() + 1 : 1;
        try {
            jSONObject.put(AppConstants.ATTEMPTS_KEY, hashMapFromSharedPref.containsKey(keyName) ? 1 + hashMapFromSharedPref.get(keyName).intValue() : 1);
            jSONObject.put(AppConstants.TOTAL_ATTEMPTS, intValue);
        } catch (Exception e10) {
            String str4 = TAG;
            HVLogUtils.d(str4, Utils.getErrorMessage(e10));
            Log.e(str4, Utils.getErrorMessage(e10));
        }
        return jSONObject;
    }

    private static SharedPreferences getSP() {
        return sp;
    }

    public static HVError getSessionError() {
        return new HVError(16, "An active session already exists. Please call endUserSession before starting a new session");
    }

    public static String getTransactionID() {
        HVLogUtils.d(TAG, "getTransactionID() called");
        return getSP() != null ? getSP().getString("transactionId", BuildConfig.FLAVOR) : BuildConfig.FLAVOR;
    }

    public static int getUserRandomNumber() {
        HVLogUtils.d(TAG, "getUserRandomNumber() called");
        return getSP().getInt(AppConstants.USER_RANDOM_NUMBER, 1000);
    }

    public static void init(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(spHyperSnap, 0);
            sp = sharedPreferences;
            editor = sharedPreferences.edit();
        }
    }

    public static void initConfigsSP(Context context) {
        configsSp = context.getSharedPreferences(spHyperSnapConfigs, 0);
    }

    public static void saveIpToGeoData(IPAddress iPAddress) {
        HVLogUtils.d(TAG, "saveIpToGeoData() called with: ipAddress = [" + iPAddress + "]");
        sp.edit().putString("ipAddressData", new e().t(iPAddress)).apply();
    }

    public static void saveUserRandomNumber(int i10) {
        HVLogUtils.d(TAG, "saveUserRandomNumber() called with: number = [" + i10 + "]");
        getEditor().putInt(AppConstants.USER_RANDOM_NUMBER, i10).apply();
    }

    public static void setAttemptsCountForFaceNotPresent(int i10) {
        HVLogUtils.d(TAG, "setAttemptsCountForFaceNotPresent() called with: attemptsCount = [" + i10 + "]");
        try {
            getEditor().putInt(AppConstants.spFaceNotPresentKey, i10).apply();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
    }

    public static void setAttemptsCountForStaticVideo(int i10) {
        HVLogUtils.d(TAG, "setAttemptsCountForStaticVideo() called with: attemptsCount = [" + i10 + "]");
        try {
            getEditor().putInt(AppConstants.spStaticVideoKey, i10).apply();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
    }

    public static void setConfigsMetadata(String str, String str2, Integer num, Long l10, Integer num2) {
        String str3 = TAG;
        HVLogUtils.d(str3, "setConfigsMetadata() called with: configType = [" + str + "], parent = [" + str2 + "], responseCode = [" + num + "], fetchTimestamp = [" + l10 + "], cacheExpiryInSeconds = [" + num2 + "]");
        SharedPreferences configsSp2 = getConfigsSp();
        if (configsSp2 == null) {
            HVLogUtils.d(str3, "setConfigsMetadata: SharedPreferences is null");
            return;
        }
        k kVar = new k();
        kVar.w("responseCode", num);
        kVar.w("cacheExpiryTimestamp", Long.valueOf(l10.longValue() + (num2 != null ? num2.intValue() * 1000 : 0L)));
        String hVar = kVar.toString();
        String metadataKey = getMetadataKey(str, str2);
        if (metadataKey != null) {
            HVLogUtils.d(str3, "setConfigsMetadata: key = [" + metadataKey + "], metadataJson = [" + hVar + "]");
            SharedPreferences.Editor edit = configsSp2.edit();
            edit.putString(metadataKey, hVar);
            edit.apply();
        }
    }

    public static void setFeatureConfigLastModified(long j10) {
        HVLogUtils.d(TAG, "setFeatureConfigLastModified() called with: lastModified = [" + j10 + "]");
        if (sp != null) {
            getEditor().putLong(AppConstants.FEATURE_CONFIG_LAST_MODIFIED, j10);
            getEditor().commit();
        }
    }

    public static void setLastUsedResolution(int i10, int i11) {
        HVLogUtils.d(TAG, "setLastUsedResolution() called with: width = [" + i10 + "], height = [" + i11 + "]");
        if (getSP() == null) {
            return;
        }
        getEditor().putInt(AppConstants.LAST_USED_WIDTH, i10);
        getEditor().putInt(AppConstants.LAST_USED_HEIGHT, i11);
        getEditor().commit();
    }

    public static String setMapperForUrl(String str, String str2) {
        HVLogUtils.d(TAG, "setMapperForUrl() called with: url = [" + str + "], suffix = [" + str2 + "]");
        if (getTransactionID().trim().isEmpty()) {
            return null;
        }
        HashMap<String, Integer> hashMapFromSharedPref = getHashMapFromSharedPref();
        getMapper(hashMapFromSharedPref, getKeyName(str, str2));
        String t10 = new e().t(hashMapFromSharedPref);
        if (sp != null) {
            getEditor().putString(getTransactionID(), t10);
            getEditor().commit();
        }
        return t10;
    }

    @Deprecated
    public static boolean setTransactionID(String str, SessionStatusCallback sessionStatusCallback) {
        HVLogUtils.d(TAG, "setTransactionID() called with: transactionID = [" + str + "], callback = [" + sessionStatusCallback + "]");
        if (getSP() == null) {
            return false;
        }
        if (getSP().contains("transactionId")) {
            if (sessionStatusCallback != null) {
                sessionStatusCallback.onFailure(getSessionError());
            }
            return false;
        }
        if (Objects.equals(str, "transactionId")) {
            if (sessionStatusCallback != null) {
                sessionStatusCallback.onFailure(getInvalidTransactionIdError());
            }
            return false;
        }
        getEditor().putString("transactionId", str);
        getEditor().commit();
        return true;
    }

    public static boolean shouldFetchFromS3() {
        HVLogUtils.d(TAG, "shouldFetchFromS3() called");
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null) {
            return true;
        }
        return ((int) ((System.currentTimeMillis() - getFeatureConfigLastModified()) / 1000)) > sharedPreferences.getInt(AppConstants.FEATURE_CONFIG_EXPIRY, 3600);
    }

    public static String splitURLIntoKey(String str) {
        HVLogUtils.d(TAG, "splitURLIntoKey() called with: url = [" + str + "]");
        return str.split("/")[r3.length - 1];
    }

    public static String getTransactionID(Context context) {
        HVLogUtils.d(TAG, "getTransactionID() called");
        if (getSP() == null) {
            init(context);
        }
        SharedPreferences sp2 = getSP();
        return sp2 != null ? sp2.getString("transactionId", BuildConfig.FLAVOR) : BuildConfig.FLAVOR;
    }

    public static HVError generateRandomTransactionId() {
        HVLogUtils.d(TAG, "generateRandomTransactionId() called");
        return setTransactionID(String.valueOf(System.currentTimeMillis()) + UUID.randomUUID().toString().substring(1, 5));
    }

    public static int getAttemptsCountForImage(String str, String str2, String str3) {
        try {
            String keyName = getKeyName(str, str2);
            HashMap<String, Integer> hashMapFromSharedPref = getHashMapFromSharedPref();
            if (hashMapFromSharedPref == null || !hashMapFromSharedPref.containsKey(keyName)) {
                return 0;
            }
            return hashMapFromSharedPref.get(keyName).intValue();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return 0;
        }
    }

    public static HVError setTransactionID(String str) {
        HVLogUtils.d(TAG, "setTransactionID() called with: transactionID = [" + str + "]");
        if (getSP().contains("transactionId")) {
            return getSessionError();
        }
        if (Objects.equals(str, "transactionId")) {
            return getInvalidTransactionIdError();
        }
        getEditor().putString("transactionId", str);
        getEditor().commit();
        return null;
    }
}
