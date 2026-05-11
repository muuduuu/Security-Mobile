package co.hyperverge.hypersnapsdk.data.remote;

import De.InterfaceC0818b;
import De.InterfaceC0820d;
import Td.A;
import Td.E;
import Td.G;
import Td.v;
import Td.z;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.data.DataSource;
import co.hyperverge.hypersnapsdk.data.models.APIResponse;
import co.hyperverge.hypersnapsdk.helpers.FileHelper;
import co.hyperverge.hypersnapsdk.helpers.ImageComparisonHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.listeners.APICompletionCallback;
import co.hyperverge.hypersnapsdk.model.GestureResponse;
import co.hyperverge.hypersnapsdk.model.LivenessResponse;
import co.hyperverge.hypersnapsdk.objects.Consent;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import co.hyperverge.hypersnapsdk.objects.HyperSnapSDKConfig;
import co.hyperverge.hypersnapsdk.service.security.GKYCSignatureVerify;
import co.hyperverge.hypersnapsdk.service.security.encryption.EncryptedRequestBody;
import co.hyperverge.hypersnapsdk.service.security.encryption.HVEncrypt;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RemoteDataSource extends DataSource {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String INTERNAL_SDK_ERROR = "Internal SDK error";
    private static final String NETWORK_ERROR_OCCURRED = "Network error occurred";
    private static final String TAG = "co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource";
    private static RemoteDataSource instance;

    /* renamed from: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource$18, reason: invalid class name */
    static /* synthetic */ class AnonymousClass18 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hypersnapsdk$objects$HyperSnapParams$FaceMatchMode;

        static {
            int[] iArr = new int[HyperSnapParams.FaceMatchMode.values().length];
            $SwitchMap$co$hyperverge$hypersnapsdk$objects$HyperSnapParams$FaceMatchMode = iArr;
            try {
                iArr[HyperSnapParams.FaceMatchMode.FACE_FACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$objects$HyperSnapParams$FaceMatchMode[HyperSnapParams.FaceMatchMode.FACE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$objects$HyperSnapParams$FaceMatchMode[HyperSnapParams.FaceMatchMode.FACE_IDFACESTRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$objects$HyperSnapParams$FaceMatchMode[HyperSnapParams.FaceMatchMode.FACE_ID_FACE_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void addAuthenticationHeaders(Map<String, String> map) {
        String accessToken = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken();
        if (accessToken != null && !accessToken.isEmpty()) {
            map.put("Authorization", accessToken);
        } else {
            map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        }
    }

    private Map<String, String> buildHeaders(HVFaceConfig hVFaceConfig) {
        Map<String, String> map = (Map) new e().k(addHeaderParams(hVFaceConfig.getHeaders() != null ? hVFaceConfig.getHeaders() : new JSONObject()).toString(), HashMap.class);
        addAuthenticationHeaders(map);
        return map;
    }

    public static boolean checkForDataLogging(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "checkForDataLogging() called with: parameters = [" + jSONObject + "]");
        if (jSONObject == null || !jSONObject.has("dataLogging")) {
            return false;
        }
        try {
            return jSONObject.getString("dataLogging").equals("yes");
        } catch (JSONException e10) {
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return false;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject convertMapToJson(Map<String, String> map) {
        HVLogUtils.d(TAG, "convertMapToJson() called with: map = [" + map + "]");
        try {
            return new JSONObject(new e().t(map));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    private JSONObject createFaceMatchHeaders(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "createFaceMatchHeaders() called with: headers = [" + jSONObject + "]");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return addHeaderParams(jSONObject);
    }

    private JSONObject createFaceMatchParams(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "createFaceMatchParams() called with: parameters = [" + jSONObject + "]");
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    private A.c createFilePart(HVEncrypt.Builder builder, String str, String str2) {
        File file = new File(str);
        try {
            return A.c.c(str2, file.getName(), new EncryptedRequestBody(builder.encryptFile(new FileInputStream(file)), z.g("application/octet-stream")));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static RemoteDataSource getInstance() {
        if (instance == null) {
            instance = new RemoteDataSource();
        }
        return instance;
    }

    private JSONObject getLivenessRequestParams(HVFaceConfig hVFaceConfig, List<Integer> list) {
        Log.d(TAG, "getLivenessRequestParams() called with: hvFaceConfig = [" + hVFaceConfig + "], faceCoords = [" + list + "]");
        JSONObject livenessParams = hVFaceConfig.getLivenessParams();
        try {
            if (hVFaceConfig.isShouldUseDefaultZoom()) {
                livenessParams.put("zoom-factor", String.valueOf(hVFaceConfig.getShouldUseBackCamera() ? AppConstants.ZOOM_FACTOR_BACK_CAM : AppConstants.ZOOM_FACTOR_FRONT_CAM));
            }
            SDKInternalConfig sDKInternalConfig = SDKInternalConfig.getInstance();
            if (sDKInternalConfig != null) {
                livenessParams.put("face-detection-on", String.valueOf(sDKInternalConfig.isFaceDetectionOn()));
                livenessParams.put("face-detection-processor", sDKInternalConfig.getFaceDetectionProcessor().name());
                if (!AppConstants.mlkitMissing.isEmpty()) {
                    livenessParams.put("mlkit-missing", AppConstants.mlkitMissing);
                    AppConstants.mlkitMissing = BuildConfig.FLAVOR;
                }
                if (!AppConstants.mlkitUnavailableError.isEmpty()) {
                    livenessParams.put("mlkit-unavailable", AppConstants.mlkitUnavailableError);
                    AppConstants.mlkitUnavailableError = BuildConfig.FLAVOR;
                }
            }
            HyperSnapParams.Region hyperSnapRegion = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getHyperSnapRegion();
            if (hyperSnapRegion == HyperSnapParams.Region.ASIA_PACIFIC || hyperSnapRegion == HyperSnapParams.Region.AsiaPacific) {
                livenessParams.put("validateFaceSize", "no");
            }
        } catch (JSONException e10) {
            handleJsonError(e10);
        }
        if (list != null && list.size() >= 4) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x1", list.get(0));
                jSONObject.put("y1", list.get(1));
                jSONObject.put("x2", list.get(2));
                jSONObject.put("y2", list.get(3));
                livenessParams.put("face-coordinates", jSONObject.toString());
            } catch (Exception e11) {
                HVLogUtils.e(TAG, "Error adding face coordinates: " + Utils.getErrorMessage(e11), e11);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                }
            }
        }
        ImageComparisonHelper.get().addRequestBodyParams(livenessParams);
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()) {
            SDKInternalConfig.getInstance().getHvSensorBiometrics().addSensorDataToRequestBody(livenessParams);
        }
        try {
            livenessParams.put("isBackCamera", hVFaceConfig.getShouldUseBackCamera() ? "yes" : "no");
        } catch (JSONException e12) {
            HVLogUtils.e(TAG, "Error adding camera usage flag: " + Utils.getErrorMessage(e12), e12);
        }
        return livenessParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleJsonError(JSONException jSONException) {
        HVLogUtils.e(TAG, "JSON exception: " + Utils.getErrorMessage(jSONException), jSONException);
        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(jSONException);
        }
    }

    private boolean isAfrica(String str) {
        HVLogUtils.d(TAG, "isAfrica() called with: endpoint = [" + str + "]");
        return str.contains("zaf") || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getHyperSnapRegion().equals(HyperSnapParams.Region.AFRICA);
    }

    private boolean isApac(String str) {
        HVLogUtils.d(TAG, "isApac() called with: endpoint = [" + str + "]");
        HyperSnapParams.Region hyperSnapRegion = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getHyperSnapRegion();
        return str.contains("apac") || hyperSnapRegion.equals(HyperSnapParams.Region.ASIA_PACIFIC) || hyperSnapRegion.equals(HyperSnapParams.Region.AsiaPacific);
    }

    private boolean isIndia(String str) {
        HVLogUtils.d(TAG, "isIndia() called with: endpoint = [" + str + "]");
        HyperSnapParams.Region hyperSnapRegion = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getHyperSnapRegion();
        return str.contains("ind") || hyperSnapRegion.equals(HyperSnapParams.Region.INDIA) || hyperSnapRegion.equals(HyperSnapParams.Region.India);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSignatureVerified(APIResponse aPIResponse, String str, JSONObject jSONObject, HashMap<String, String> hashMap, JSONObject jSONObject2, JSONObject jSONObject3, boolean z10, List<Integer> list) {
        HVLogUtils.d(TAG, "isSignatureVerified() called with: apiResponse = [" + aPIResponse + "], uuid = [" + str + "], requestQuery = [" + jSONObject + "], tagFileUriMap = [" + hashMap + "], requestBody = [" + jSONObject2 + "], requestHeaders = [" + jSONObject3 + "], shouldUseApacSignatureCheck = [" + z10 + "], allowedStatusCodes = [" + list + "]");
        if (list == null || list.isEmpty()) {
            list = new HVBaseConfig().getAllowedStatusCodes();
        }
        HyperSnapSDKConfig hyperSnapSDKConfig = HyperSnapSDK.getInstance().getHyperSnapSDKConfig();
        if (!hyperSnapSDKConfig.isShouldUseSignature() || !list.contains(aPIResponse.getStatusCode())) {
            return true;
        }
        JSONObject responseBody = aPIResponse.getResponseBody();
        if (responseBody == null) {
            responseBody = aPIResponse.getErrorBody();
        }
        JSONObject responseHeaders = aPIResponse.getResponseHeaders();
        boolean validateSignatureIfNeededAPAC = (!hyperSnapSDKConfig.isShouldUseSHA256Signature() || z10) ? SignatureHelper.validateSignatureIfNeededAPAC(responseBody, responseHeaders, str) : SignatureHelper.validateSignatureIfNeeded(responseBody, responseHeaders, str);
        if (validateSignatureIfNeededAPAC) {
            return validateSignatureIfNeededAPAC;
        }
        try {
            return GKYCSignatureVerify.builder().requestQuery(jSONObject).tagFileUriMap(hashMap).requestBody(jSONObject2).requestHeaders(jSONObject3).responseBody(responseBody).responseHeaders(responseHeaders).build().verify(responseHeaders.getString("X-HV-Signature"));
        } catch (JSONException e10) {
            logError(e10);
            return validateSignatureIfNeededAPAC;
        }
    }

    private boolean isValidFaceMatchInputs(Context context, String str, String str2, String str3, HyperSnapParams.FaceMatchMode faceMatchMode, APICompletionCallback aPICompletionCallback) {
        String str4;
        boolean z10;
        HVLogUtils.d(TAG, "isValidFaceMatchInputs() called with: context = [" + context + "], endpoint = [" + str + "], image1 = [" + str2 + "], image2 = [" + str3 + "], hyperSnapFaceMatchMode = [" + faceMatchMode + "], callback = [" + aPICompletionCallback + "]");
        if (aPICompletionCallback == null) {
            return false;
        }
        if (context == null) {
            str4 = "Context object is null";
            z10 = false;
        } else {
            str4 = BuildConfig.FLAVOR;
            z10 = true;
        }
        if (StringUtils.isEmptyOrNull(str)) {
            str4 = "Face match endpoint is empty";
            z10 = false;
        }
        if (StringUtils.isEmptyOrNull(str2) || !new File(str2).exists()) {
            str4 = "Face file path is invalid";
            z10 = false;
        }
        int i10 = AnonymousClass18.$SwitchMap$co$hyperverge$hypersnapsdk$objects$HyperSnapParams$FaceMatchMode[faceMatchMode.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4) && StringUtils.isEmptyOrNull(str3)) {
                    str4 = "ID Face String is invalid";
                    z10 = false;
                }
            } else if (StringUtils.isEmptyOrNull(str3) || !new File(str3).exists()) {
                str4 = "Document file path is invalid";
                z10 = false;
            }
        } else if (StringUtils.isEmptyOrNull(str3) || !new File(str3).exists()) {
            str4 = "Second face file path is invalid";
            z10 = false;
        }
        if (z10) {
            return true;
        }
        aPICompletionCallback.onResult(new HVError(6, str4), null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logError(Exception exc) {
        String str = TAG;
        HVLogUtils.d(str, "logError() called with: e = [" + exc + "]");
        Log.e(str, Utils.getErrorMessage(exc));
        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(exc);
        }
    }

    private A.c prepareFilePart(Context context, String str, String str2) {
        HVLogUtils.d(TAG, "prepareFilePart() called with: context = [" + context + "], partName = [" + str + "], filePath = [" + str2 + "]");
        File file = new File(str2);
        return A.c.c(str, file.getName(), E.create(z.g(context.getContentResolver().getType(Uri.parse(str2))), file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printLogs(Exception exc) {
        try {
            if (TextUtils.isEmpty(Utils.getErrorMessage(exc))) {
                return;
            }
            Log.e(TAG, Utils.getErrorMessage(exc));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivenessResponseForSummary(LivenessResponse livenessResponse, APIResponse aPIResponse) {
        HVLogUtils.d(TAG, "setLivenessResponseForSummary() called with: livenessResponse = [" + livenessResponse + "], apiResponse = [" + aPIResponse + "]");
        try {
            JSONObject errorBody = aPIResponse.getErrorBody();
            HVError error = getError(errorBody);
            livenessResponse.setLivenessError(error.getErrorMessage());
            livenessResponse.setErrorCode(error.getErrorCode());
            if (errorBody.has("result") && errorBody.getJSONObject("result").has(AppConstants.SUMMARY)) {
                livenessResponse.setResponse(errorBody);
            }
            livenessResponse.setRequestID(aPIResponse.getRequestID());
        } catch (JSONException e10) {
            logError(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HVResponse setSummaryDetails(HVResponse hVResponse, JSONObject jSONObject) {
        HVLogUtils.d(TAG, "setSummaryDetails() called with: response = [" + hVResponse + "], resultObj = [" + jSONObject + "]");
        try {
            if (jSONObject.has("result")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                if (jSONObject2.has(AppConstants.SUMMARY)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(AppConstants.SUMMARY);
                    String string = jSONObject3.getString("action");
                    String str = AppConstants.RETAKE_DEFAULT_MESSAGE;
                    if (jSONObject3.has(AppConstants.RETAKE_MESSAGE)) {
                        str = jSONObject3.getString(AppConstants.RETAKE_MESSAGE);
                    }
                    hVResponse.setAction(string);
                    hVResponse.setRetakeMessage(str);
                    hVResponse.setApiResult(jSONObject);
                }
            }
        } catch (Exception e10) {
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return hVResponse;
    }

    private boolean shouldSendQRCodeToOCREndpoint(String str) {
        HVLogUtils.d(TAG, "shouldSendQRCodeToOCREndpoint() called with: ocrEndpoint = [" + str + "]");
        return !StringUtils.isEmptyOrNull(str) && (str.contains("/v1.1/readNID") || str.contains("/v2/nationalID"));
    }

    private void updateAPIResponseWithRequestSignature(APIResponse aPIResponse, String str) {
        HVLogUtils.d(TAG, "updateAPIResponseWithRequestSignature() called with: apiResponse = [" + aPIResponse + "], uuid = [" + str + "]");
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() || str == null) {
            return;
        }
        try {
            aPIResponse.setRequestSignature(str);
        } catch (JSONException e10) {
            logError(e10);
        }
    }

    public JSONObject addHeaderParams(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "addHeaderParams() called with: header = [" + jSONObject + "]");
        try {
            if (jSONObject.has("transactionId") && jSONObject.getString("transactionId").equalsIgnoreCase("transactionId")) {
                jSONObject.remove("transactionId");
            }
        } catch (Exception e10) {
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        try {
            if (!jSONObject.has("sdk-version")) {
                jSONObject.put("sdk-version", co.hyperverge.hypersnapsdk.BuildConfig.HYPERSNAP_VERSION_NAME);
            }
            jSONObject.put("os", "android");
            jSONObject.put("app-version", SDKInternalConfig.getInstance().getAppVersion());
            jSONObject.put("device", Build.MODEL);
            jSONObject.put("device-brand", Build.BRAND);
            jSONObject.put("device-manufacturer", Build.MANUFACTURER);
            jSONObject.put("abi-arch", Build.CPU_ABI);
            jSONObject.put("os-version", Build.VERSION.SDK_INT);
            jSONObject.put("sensor-orientation", AppConstants.sensorOrientation);
            if (!AppConstants.cameraLevel.isEmpty()) {
                jSONObject.put("camera-level", AppConstants.cameraLevel + "-" + AppConstants.cameraType);
            }
        } catch (Exception e11) {
            printLogs(e11);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
        }
        return jSONObject;
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void getEncryptedLivenessTextureScore(String str, String str2, String str3, String str4, List<Integer> list, final HVFaceConfig hVFaceConfig, final DataSource.NetworkCallback networkCallback) {
        A.c cVar;
        A.c cVar2;
        InterfaceC0818b<G> uploadEncryptedImage;
        HVLogUtils.d(TAG, "getEncryptedLivenessTextureScore() called with: filePath=[" + str + "], croppedFacePath=[" + str2 + "], videoUri=[" + str3 + "], faceCoords=[" + list + "], hvFaceConfig=[" + hVFaceConfig + "], callback=[" + networkCallback + "]");
        String publicKey = SDKInternalConfig.getInstance().getPublicKey();
        final byte[] generateIV = HVEncrypt.generateIV();
        final SecretKey generateRandomKey = HVEncrypt.generateRandomKey();
        HVEncrypt.Builder aesKey = HVEncrypt.builder(HVEncrypt.EncryptionMethod.AES_GCM).iv(generateIV).aesKey(generateRandomKey);
        HVEncrypt.Builder publicKey2 = HVEncrypt.builder(HVEncrypt.EncryptionMethod.RSA).publicKey(publicKey);
        try {
            A.c createFilePart = createFilePart(aesKey, str, "image");
            final HashMap hashMap = new HashMap();
            hashMap.put("image", str);
            if (str3 == null || str3.endsWith("hv_dummy_video.mp4")) {
                cVar = null;
            } else {
                try {
                    A.c createFilePart2 = createFilePart(aesKey, str3, "video");
                    hashMap.put("video", str3);
                    cVar = createFilePart2;
                } catch (Exception unused) {
                    networkCallback.onFailure(43, INTERNAL_SDK_ERROR);
                    return;
                }
            }
            if (str4 != null) {
                try {
                    A.c createFilePart3 = createFilePart(aesKey, str4, "frame");
                    hashMap.put("frames", str4);
                    cVar2 = createFilePart3;
                } catch (Exception unused2) {
                    networkCallback.onFailure(43, INTERNAL_SDK_ERROR);
                    return;
                }
            } else {
                cVar2 = null;
            }
            final JSONObject livenessRequestParams = getLivenessRequestParams(hVFaceConfig, list);
            final Map<String, String> buildHeaders = buildHeaders(hVFaceConfig);
            buildHeaders.put("key-version", SDKInternalConfig.getInstance().getPublicKeyVersion());
            final boolean isShouldUseSignature = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature();
            if (!isShouldUseSignature && isApac(hVFaceConfig.getLivenessEndpoint())) {
                HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(true);
            }
            final String uniqueIdentifierIfNeeded = (!hVFaceConfig.isUseBothImagesSignature() || str2 == null) ? SignatureHelper.getUniqueIdentifierIfNeeded(str, hVFaceConfig.getHeaders()) : SignatureHelper.getUniqueIdentifierIfNeeded(str, str2, hVFaceConfig.getHeaders());
            try {
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature() && uniqueIdentifierIfNeeded != null && !buildHeaders.containsKey(AppConstants.PARAMS_UUID)) {
                    buildHeaders.put(AppConstants.PARAMS_UUID, uniqueIdentifierIfNeeded);
                }
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "Error adding signature to headers: " + Utils.getErrorMessage(e10), e10);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            try {
                String encrypt = publicKey2.encrypt(Base64.encode(generateIV, 2));
                String encrypt2 = publicKey2.encrypt(generateRandomKey.getEncoded());
                String encrypt3 = aesKey.encrypt(livenessRequestParams.toString());
                A.c b10 = A.c.b("imprint", encrypt);
                A.c b11 = A.c.b("trace", encrypt2);
                A.c b12 = A.c.b("payload", encrypt3);
                if (!hVFaceConfig.isShouldRecordVideo() || cVar == null) {
                    HVLogUtils.d(TAG, "fileToUpload: " + createFilePart + "encryptedIVPart: " + b10 + "encryptedAesKeyPart: " + b11 + "encryptedPayloadPart: " + b12);
                    uploadEncryptedImage = ApiClient.getService().uploadEncryptedImage(hVFaceConfig.getLivenessEndpoint(), buildHeaders, createFilePart, b10, b11, b12);
                } else {
                    uploadEncryptedImage = cVar2 != null ? ApiClient.getService().uploadEncryptedImageAndVideoWithFrames(hVFaceConfig.getLivenessEndpoint(), buildHeaders, createFilePart, cVar, cVar2, b10, b11, b12) : ApiClient.getService().uploadEncryptedImageAndVideo(hVFaceConfig.getLivenessEndpoint(), buildHeaders, createFilePart, cVar, b10, b11, b12);
                }
                uploadEncryptedImage.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.3
                    @Override // De.InterfaceC0820d
                    public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                        HVLogUtils.d(RemoteDataSource.TAG, "onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                        HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Network error occurred url: ");
                        sb2.append(hVFaceConfig.getLivenessEndpoint());
                        networkCallback.onFailure(12, Utils.getLocalizedErrorMessage(th, sb2.toString()));
                    }

                    @Override // De.InterfaceC0820d
                    public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                        String str5;
                        HVLogUtils.d(RemoteDataSource.TAG, "onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                        try {
                            G d10 = zVar.f() ? (G) zVar.a() : zVar.d();
                            try {
                                if (d10 == null) {
                                    networkCallback.onFailure(12, zVar.f() ? "Response body is null" : "Response error body is null");
                                    if (d10 != null) {
                                        d10.close();
                                        return;
                                    }
                                    return;
                                }
                                String decrypt = HVEncrypt.builder(HVEncrypt.EncryptionMethod.AES_GCM).aesKey(generateRandomKey).iv(generateIV).decrypt(Base64.decode(new JSONObject(d10.l()).getString("payload"), 2));
                                boolean f10 = zVar.f();
                                String str6 = BuildConfig.FLAVOR;
                                if (!f10) {
                                    str6 = decrypt;
                                    decrypt = BuildConfig.FLAVOR;
                                }
                                d10.close();
                                APIResponse aPIResponse = new APIResponse(zVar.b(), zVar.g(), G.i(z.g("application/json"), decrypt), G.i(z.g("application/json"), str6), zVar.e());
                                LivenessResponse livenessResponse = new LivenessResponse();
                                try {
                                    try {
                                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str5 = uniqueIdentifierIfNeeded) != null) {
                                            aPIResponse.setRequestSignature(str5);
                                        }
                                        RemoteDataSource remoteDataSource = RemoteDataSource.this;
                                        boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, uniqueIdentifierIfNeeded, null, hashMap, livenessRequestParams, remoteDataSource.convertMapToJson(buildHeaders), false, hVFaceConfig.getAllowedStatusCodes());
                                        if (!isSignatureVerified) {
                                            livenessResponse.setLivenessError(AppConstants.SIGNATURE_ERROR);
                                            livenessResponse.setErrorCode(18);
                                        }
                                        livenessResponse.setHttpStatusCode(aPIResponse.getStatusCode());
                                        livenessResponse.setStatusMessage(aPIResponse.getStatusMessage());
                                        livenessResponse.setHeaders(aPIResponse.getResponseHeaders());
                                        if (zVar.f()) {
                                            JSONObject responseBody = aPIResponse.getResponseBody();
                                            if (responseBody != null) {
                                                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                                    try {
                                                        aPIResponse.addRawResponseBody();
                                                    } catch (JSONException e11) {
                                                        RemoteDataSource.this.logError(e11);
                                                    }
                                                }
                                                if (isSignatureVerified) {
                                                    livenessResponse.setResponse(responseBody);
                                                }
                                            }
                                        } else if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                                try {
                                                    aPIResponse.addRawErrorBody();
                                                } catch (JSONException e12) {
                                                    RemoteDataSource.this.logError(e12);
                                                }
                                            }
                                            RemoteDataSource.this.setLivenessResponseForSummary(livenessResponse, aPIResponse);
                                        }
                                    } catch (JSONException e13) {
                                        RemoteDataSource.this.handleJsonError(e13);
                                        networkCallback.onFailure(43, RemoteDataSource.INTERNAL_SDK_ERROR);
                                    }
                                    HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                                    networkCallback.onSuccess(livenessResponse);
                                } catch (Throwable th) {
                                    HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                                    networkCallback.onSuccess(livenessResponse);
                                    throw th;
                                }
                            } finally {
                            }
                        } catch (IOException e14) {
                            e = e14;
                            networkCallback.onFailure(2, Utils.getLocalizedErrorMessage(e, RemoteDataSource.INTERNAL_SDK_ERROR));
                        } catch (JSONException e15) {
                            e = e15;
                            networkCallback.onFailure(2, Utils.getLocalizedErrorMessage(e, RemoteDataSource.INTERNAL_SDK_ERROR));
                        }
                    }
                });
                if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                    return;
                }
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieAPIPost(hVFaceConfig.getLivenessEndpoint(), str);
            } catch (Exception unused3) {
                networkCallback.onFailure(43, INTERNAL_SDK_ERROR);
            }
        } catch (Exception unused4) {
            networkCallback.onFailure(43, INTERNAL_SDK_ERROR);
        }
    }

    public HVError getError(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "getError() called with: error = [" + jSONObject + "]");
        new JSONObject();
        HVError hVError = new HVError();
        try {
            String string = jSONObject.has(AppConstants.VIDEO_RECORDING_ERROR) ? jSONObject.getString(AppConstants.VIDEO_RECORDING_ERROR) : " ";
            if (jSONObject.has("result")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                if (jSONObject2.has(AppConstants.VIDEO_RECORDING_ERROR)) {
                    string = jSONObject2.getString(AppConstants.VIDEO_RECORDING_ERROR);
                }
            } else if (jSONObject.has("message")) {
                string = jSONObject.getString("message");
            }
            return new HVError(jSONObject.has(Keys.STATUS_CODE) ? jSONObject.getInt(Keys.STATUS_CODE) : 14, string);
        } catch (JSONException e10) {
            printLogs(e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return hVError;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return hVError;
        }
    }

    public HVError getErrorFromException(Exception exc) {
        String str = TAG;
        HVLogUtils.d(str, "getErrorFromException() called with: e = [" + exc + "]");
        Log.e(str, Utils.getErrorMessage(exc));
        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(exc);
        }
        return new HVError(2, exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : "Internal SDK error occurred");
    }

    public HVError getErrorValidationAPI(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "getErrorValidationAPI() called with: error = [" + jSONObject + "]");
        new JSONObject();
        HVError hVError = new HVError();
        try {
            int i10 = jSONObject.getInt(Keys.STATUS_CODE);
            JSONObject jSONObject2 = jSONObject.getJSONObject(AppConstants.VIDEO_RECORDING_ERROR);
            if (jSONObject2.has(AppConstants.RETAKE_ERROR_CODE)) {
                i10 = jSONObject2.getInt(AppConstants.RETAKE_ERROR_CODE);
            }
            String str = BuildConfig.FLAVOR;
            if (jSONObject2.has("message")) {
                str = jSONObject2.getString("message");
            }
            if (jSONObject2.has("path")) {
                try {
                    str = str + ", path:" + jSONObject2.getJSONArray("path").toString();
                } catch (Exception e10) {
                    printLogs(e10);
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                    }
                }
            }
            return new HVError(i10, str);
        } catch (JSONException e11) {
            printLogs(e11);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return hVError;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            return hVError;
        }
    }

    public byte[] getFileBytes(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        int i10 = 0;
        while (i10 < length) {
            int read = fileInputStream.read(bArr, i10, length - i10);
            if (read == -1) {
                break;
            }
            i10 += read;
        }
        fileInputStream.close();
        return bArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:0|1|(1:5)|6|(1:8)|9|(8:10|11|(6:122|123|(1:125)(1:130)|126|127|128)(1:13)|14|(5:16|17|(4:19|20|21|22)(1:117)|23|(1:25))(1:121)|26|(1:110)|30)|31|(1:33)(1:109)|(1:35)(1:108)|36|(2:40|41)|47|(1:49)|(4:50|51|(1:53)(1:104)|54)|55|(1:57)|58|(1:102)(1:62)|63|(1:67)|68|(8:(1:71)|73|74|(1:79)|81|(1:96)(1:(1:85)(1:95))|86|(1:93)(2:90|91))(1:101)|72|73|74|(2:77|79)|81|(0)|96|86|(2:88|93)(1:94)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x037a, code lost:
    
        co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x034d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x034e, code lost:
    
        r1 = co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.TAG;
        co.hyperverge.hypersnapsdk.utils.HVLogUtils.e(r1, "getLivenessTextureScore(): exception = [" + co.hyperverge.hypersnapsdk.utils.Utils.getErrorMessage(r0) + "]", r0);
        co.hyperverge.hypersnapsdk.utils.HVLogUtils.e(r1, co.hyperverge.hypersnapsdk.utils.Utils.getErrorMessage(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0378, code lost:
    
        if (co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig.getInstance().getErrorMonitoringService() != null) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getLivenessTextureScore(String str, String str2, String str3, String str4, List<Integer> list, final HVFaceConfig hVFaceConfig, final DataSource.NetworkCallback networkCallback) {
        A.c cVar;
        HashMap hashMap;
        String str5;
        A.c cVar2;
        A.c cVar3;
        final Map<String, String> map;
        final boolean isShouldUseSignature;
        String uniqueIdentifierIfNeeded;
        Map<String, E> mapFromJson;
        final HashMap hashMap2;
        InterfaceC0818b<G> uploadImage;
        HVLogUtils.d(TAG, "getLivenessTextureScore() called with: filePath = [" + str + "], croppedFacePath = [" + str2 + "], videoUri = [" + str3 + "], faceCoords = [" + list + "], hvFaceConfig = [" + hVFaceConfig + "], callback = [" + networkCallback + "]");
        File file = new File(str);
        A.c c10 = A.c.c("image", file.getName(), E.create(z.g("image/jpeg"), file));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("image", str);
        if (str3 != null && !str3.endsWith("hv_dummy_video.mp4")) {
            hashMap3.put("video", str3);
        }
        if (str4 != null) {
            hashMap3.put("frames", str4);
        }
        final JSONObject livenessParams = hVFaceConfig.getLivenessParams();
        try {
            if (hVFaceConfig.isShouldUseDefaultZoom()) {
                try {
                    hashMap = hashMap3;
                    try {
                        livenessParams.put("zoom-factor", String.valueOf(hVFaceConfig.getShouldUseBackCamera() ? AppConstants.ZOOM_FACTOR_BACK_CAM : AppConstants.ZOOM_FACTOR_FRONT_CAM));
                    } catch (JSONException e10) {
                        e = e10;
                        cVar = c10;
                        String str6 = TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getLivenessTextureScore(): exception = [");
                        str5 = "no";
                        sb2.append(Utils.getErrorMessage(e));
                        sb2.append("]");
                        HVLogUtils.e(str6, sb2.toString(), e);
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        }
                        String str7 = null;
                        if (str3 == null) {
                        }
                        if (str4 == null) {
                        }
                        if (list != null) {
                        }
                        ImageComparisonHelper.get().addRequestBodyParams(livenessParams);
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()) {
                        }
                        livenessParams.put("isBackCamera", !hVFaceConfig.getShouldUseBackCamera() ? "yes" : str5);
                        new HashMap();
                        JSONObject jSONObject = new JSONObject();
                        if (hVFaceConfig.getHeaders() != null) {
                        }
                        JSONObject addHeaderParams = addHeaderParams(jSONObject);
                        map = (Map) new e().k(addHeaderParams.toString(), HashMap.class);
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null) {
                        }
                        map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
                        map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
                        isShouldUseSignature = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature();
                        if (!isShouldUseSignature) {
                        }
                        if (!hVFaceConfig.isUseBothImagesSignature()) {
                        }
                        str7 = uniqueIdentifierIfNeeded;
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature()) {
                        }
                        mapFromJson = getMapFromJson(livenessParams);
                        HVLogUtils.e(TAG, "getLivenessTextureScore: requestParams: " + livenessParams.toString());
                        if (hVFaceConfig.isShouldRecordVideo()) {
                        }
                        hashMap2 = hashMap;
                        uploadImage = ApiClient.getService().uploadImage(hVFaceConfig.getLivenessEndpoint(), map, cVar, mapFromJson);
                        final String str8 = str7;
                        uploadImage.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.2
                            @Override // De.InterfaceC0820d
                            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                                HVLogUtils.d(RemoteDataSource.TAG, "getLivenessTextureScore(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                                HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                                DataSource.NetworkCallback networkCallback2 = networkCallback;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Network error occurred url: ");
                                sb3.append(hVFaceConfig.getLivenessEndpoint());
                                networkCallback2.onFailure(12, Utils.getLocalizedErrorMessage(th, sb3.toString()));
                            }

                            @Override // De.InterfaceC0820d
                            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                                String str9;
                                HVLogUtils.d(RemoteDataSource.TAG, "onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                                APIResponse aPIResponse = new APIResponse(zVar);
                                LivenessResponse livenessResponse = new LivenessResponse();
                                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str9 = str8) != null) {
                                    try {
                                        aPIResponse.setRequestSignature(str9);
                                    } catch (JSONException e11) {
                                        HVLogUtils.e(RemoteDataSource.TAG, "getLivenessTextureScore(): onResponse exception = [" + Utils.getErrorMessage(e11) + "]", e11);
                                        RemoteDataSource.this.logError(e11);
                                    }
                                }
                                RemoteDataSource remoteDataSource = RemoteDataSource.this;
                                boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str8, null, hashMap2, livenessParams, remoteDataSource.convertMapToJson(map), false, hVFaceConfig.getAllowedStatusCodes());
                                if (!isSignatureVerified) {
                                    livenessResponse.setLivenessError(AppConstants.SIGNATURE_ERROR);
                                    livenessResponse.setErrorCode(18);
                                }
                                livenessResponse.setHttpStatusCode(aPIResponse.getStatusCode());
                                livenessResponse.setStatusMessage(aPIResponse.getStatusMessage());
                                livenessResponse.setHeaders(aPIResponse.getResponseHeaders());
                                JSONObject responseBody = aPIResponse.getResponseBody();
                                boolean isShouldReturnRawResponse = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse();
                                if (zVar.f()) {
                                    if (responseBody != null) {
                                        if (isShouldReturnRawResponse) {
                                            try {
                                                aPIResponse.addRawResponseBody();
                                            } catch (JSONException e12) {
                                                RemoteDataSource.this.logError(e12);
                                            }
                                        }
                                        if (isSignatureVerified) {
                                            livenessResponse.setResponse(responseBody);
                                        }
                                    }
                                } else if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                                    if (isShouldReturnRawResponse) {
                                        try {
                                            aPIResponse.addRawErrorBody();
                                        } catch (JSONException e13) {
                                            RemoteDataSource.this.logError(e13);
                                        }
                                    }
                                    RemoteDataSource.this.setLivenessResponseForSummary(livenessResponse, aPIResponse);
                                }
                                HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                                networkCallback.onSuccess(livenessResponse);
                            }
                        });
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        }
                    }
                } catch (JSONException e11) {
                    e = e11;
                    hashMap = hashMap3;
                    cVar = c10;
                    String str62 = TAG;
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("getLivenessTextureScore(): exception = [");
                    str5 = "no";
                    sb22.append(Utils.getErrorMessage(e));
                    sb22.append("]");
                    HVLogUtils.e(str62, sb22.toString(), e);
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    }
                    String str72 = null;
                    if (str3 == null) {
                    }
                    if (str4 == null) {
                    }
                    if (list != null) {
                    }
                    ImageComparisonHelper.get().addRequestBodyParams(livenessParams);
                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()) {
                    }
                    livenessParams.put("isBackCamera", !hVFaceConfig.getShouldUseBackCamera() ? "yes" : str5);
                    new HashMap();
                    JSONObject jSONObject2 = new JSONObject();
                    if (hVFaceConfig.getHeaders() != null) {
                    }
                    JSONObject addHeaderParams2 = addHeaderParams(jSONObject2);
                    map = (Map) new e().k(addHeaderParams2.toString(), HashMap.class);
                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null) {
                    }
                    map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
                    map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
                    isShouldUseSignature = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature();
                    if (!isShouldUseSignature) {
                    }
                    if (!hVFaceConfig.isUseBothImagesSignature()) {
                    }
                    str72 = uniqueIdentifierIfNeeded;
                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature()) {
                    }
                    mapFromJson = getMapFromJson(livenessParams);
                    HVLogUtils.e(TAG, "getLivenessTextureScore: requestParams: " + livenessParams.toString());
                    if (hVFaceConfig.isShouldRecordVideo()) {
                    }
                    hashMap2 = hashMap;
                    uploadImage = ApiClient.getService().uploadImage(hVFaceConfig.getLivenessEndpoint(), map, cVar, mapFromJson);
                    final String str82 = str72;
                    uploadImage.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.2
                        @Override // De.InterfaceC0820d
                        public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                            HVLogUtils.d(RemoteDataSource.TAG, "getLivenessTextureScore(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                            HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                            DataSource.NetworkCallback networkCallback2 = networkCallback;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Network error occurred url: ");
                            sb3.append(hVFaceConfig.getLivenessEndpoint());
                            networkCallback2.onFailure(12, Utils.getLocalizedErrorMessage(th, sb3.toString()));
                        }

                        @Override // De.InterfaceC0820d
                        public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                            String str9;
                            HVLogUtils.d(RemoteDataSource.TAG, "onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                            APIResponse aPIResponse = new APIResponse(zVar);
                            LivenessResponse livenessResponse = new LivenessResponse();
                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str9 = str82) != null) {
                                try {
                                    aPIResponse.setRequestSignature(str9);
                                } catch (JSONException e112) {
                                    HVLogUtils.e(RemoteDataSource.TAG, "getLivenessTextureScore(): onResponse exception = [" + Utils.getErrorMessage(e112) + "]", e112);
                                    RemoteDataSource.this.logError(e112);
                                }
                            }
                            RemoteDataSource remoteDataSource = RemoteDataSource.this;
                            boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str82, null, hashMap2, livenessParams, remoteDataSource.convertMapToJson(map), false, hVFaceConfig.getAllowedStatusCodes());
                            if (!isSignatureVerified) {
                                livenessResponse.setLivenessError(AppConstants.SIGNATURE_ERROR);
                                livenessResponse.setErrorCode(18);
                            }
                            livenessResponse.setHttpStatusCode(aPIResponse.getStatusCode());
                            livenessResponse.setStatusMessage(aPIResponse.getStatusMessage());
                            livenessResponse.setHeaders(aPIResponse.getResponseHeaders());
                            JSONObject responseBody = aPIResponse.getResponseBody();
                            boolean isShouldReturnRawResponse = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse();
                            if (zVar.f()) {
                                if (responseBody != null) {
                                    if (isShouldReturnRawResponse) {
                                        try {
                                            aPIResponse.addRawResponseBody();
                                        } catch (JSONException e12) {
                                            RemoteDataSource.this.logError(e12);
                                        }
                                    }
                                    if (isSignatureVerified) {
                                        livenessResponse.setResponse(responseBody);
                                    }
                                }
                            } else if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                                if (isShouldReturnRawResponse) {
                                    try {
                                        aPIResponse.addRawErrorBody();
                                    } catch (JSONException e13) {
                                        RemoteDataSource.this.logError(e13);
                                    }
                                }
                                RemoteDataSource.this.setLivenessResponseForSummary(livenessResponse, aPIResponse);
                            }
                            HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                            networkCallback.onSuccess(livenessResponse);
                        }
                    });
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    }
                }
            } else {
                hashMap = hashMap3;
            }
            if (SDKInternalConfig.getInstance() != null) {
                livenessParams.put("face-detection-on", String.valueOf(SDKInternalConfig.getInstance().isFaceDetectionOn()));
                livenessParams.put("face-detection-processor", SDKInternalConfig.getInstance().getFaceDetectionProcessor().name());
                if (AppConstants.mlkitMissing.isEmpty()) {
                    cVar = c10;
                } else {
                    cVar = c10;
                    try {
                        livenessParams.put("mlkit-missing", AppConstants.mlkitMissing);
                        AppConstants.mlkitMissing = BuildConfig.FLAVOR;
                    } catch (JSONException e12) {
                        e = e12;
                        String str622 = TAG;
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append("getLivenessTextureScore(): exception = [");
                        str5 = "no";
                        sb222.append(Utils.getErrorMessage(e));
                        sb222.append("]");
                        HVLogUtils.e(str622, sb222.toString(), e);
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                        }
                        String str722 = null;
                        if (str3 == null) {
                        }
                        if (str4 == null) {
                        }
                        if (list != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("x1", list.get(0));
                                jSONObject3.put("y1", list.get(1));
                                jSONObject3.put("x2", list.get(2));
                                jSONObject3.put("y2", list.get(3));
                                livenessParams.put("face-coordinates", jSONObject3.toString());
                            } catch (Exception e13) {
                                String str9 = TAG;
                                HVLogUtils.e(str9, "getLivenessTextureScore(): face-coordinates exception = [" + Utils.getErrorMessage(e13) + "]", e13);
                                Log.e(str9, Utils.getErrorMessage(e13));
                                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e13);
                                }
                            }
                        }
                        ImageComparisonHelper.get().addRequestBodyParams(livenessParams);
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()) {
                        }
                        livenessParams.put("isBackCamera", !hVFaceConfig.getShouldUseBackCamera() ? "yes" : str5);
                        new HashMap();
                        JSONObject jSONObject22 = new JSONObject();
                        if (hVFaceConfig.getHeaders() != null) {
                        }
                        JSONObject addHeaderParams22 = addHeaderParams(jSONObject22);
                        map = (Map) new e().k(addHeaderParams22.toString(), HashMap.class);
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null) {
                        }
                        map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
                        map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
                        isShouldUseSignature = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature();
                        if (!isShouldUseSignature) {
                            HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(true);
                        }
                        if (!hVFaceConfig.isUseBothImagesSignature()) {
                        }
                        str722 = uniqueIdentifierIfNeeded;
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature()) {
                        }
                        mapFromJson = getMapFromJson(livenessParams);
                        HVLogUtils.e(TAG, "getLivenessTextureScore: requestParams: " + livenessParams.toString());
                        if (hVFaceConfig.isShouldRecordVideo()) {
                        }
                        hashMap2 = hashMap;
                        uploadImage = ApiClient.getService().uploadImage(hVFaceConfig.getLivenessEndpoint(), map, cVar, mapFromJson);
                        final String str822 = str722;
                        uploadImage.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.2
                            @Override // De.InterfaceC0820d
                            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                                HVLogUtils.d(RemoteDataSource.TAG, "getLivenessTextureScore(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                                HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                                DataSource.NetworkCallback networkCallback2 = networkCallback;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Network error occurred url: ");
                                sb3.append(hVFaceConfig.getLivenessEndpoint());
                                networkCallback2.onFailure(12, Utils.getLocalizedErrorMessage(th, sb3.toString()));
                            }

                            @Override // De.InterfaceC0820d
                            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                                String str92;
                                HVLogUtils.d(RemoteDataSource.TAG, "onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                                APIResponse aPIResponse = new APIResponse(zVar);
                                LivenessResponse livenessResponse = new LivenessResponse();
                                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str92 = str822) != null) {
                                    try {
                                        aPIResponse.setRequestSignature(str92);
                                    } catch (JSONException e112) {
                                        HVLogUtils.e(RemoteDataSource.TAG, "getLivenessTextureScore(): onResponse exception = [" + Utils.getErrorMessage(e112) + "]", e112);
                                        RemoteDataSource.this.logError(e112);
                                    }
                                }
                                RemoteDataSource remoteDataSource = RemoteDataSource.this;
                                boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str822, null, hashMap2, livenessParams, remoteDataSource.convertMapToJson(map), false, hVFaceConfig.getAllowedStatusCodes());
                                if (!isSignatureVerified) {
                                    livenessResponse.setLivenessError(AppConstants.SIGNATURE_ERROR);
                                    livenessResponse.setErrorCode(18);
                                }
                                livenessResponse.setHttpStatusCode(aPIResponse.getStatusCode());
                                livenessResponse.setStatusMessage(aPIResponse.getStatusMessage());
                                livenessResponse.setHeaders(aPIResponse.getResponseHeaders());
                                JSONObject responseBody = aPIResponse.getResponseBody();
                                boolean isShouldReturnRawResponse = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse();
                                if (zVar.f()) {
                                    if (responseBody != null) {
                                        if (isShouldReturnRawResponse) {
                                            try {
                                                aPIResponse.addRawResponseBody();
                                            } catch (JSONException e122) {
                                                RemoteDataSource.this.logError(e122);
                                            }
                                        }
                                        if (isSignatureVerified) {
                                            livenessResponse.setResponse(responseBody);
                                        }
                                    }
                                } else if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                                    if (isShouldReturnRawResponse) {
                                        try {
                                            aPIResponse.addRawErrorBody();
                                        } catch (JSONException e132) {
                                            RemoteDataSource.this.logError(e132);
                                        }
                                    }
                                    RemoteDataSource.this.setLivenessResponseForSummary(livenessResponse, aPIResponse);
                                }
                                HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                                networkCallback.onSuccess(livenessResponse);
                            }
                        });
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        }
                    }
                }
                if (!AppConstants.mlkitUnavailableError.isEmpty()) {
                    livenessParams.put("mlkit-unavailable", AppConstants.mlkitUnavailableError);
                    AppConstants.mlkitUnavailableError = BuildConfig.FLAVOR;
                }
            } else {
                cVar = c10;
            }
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getHyperSnapRegion() == HyperSnapParams.Region.ASIA_PACIFIC || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getHyperSnapRegion() == HyperSnapParams.Region.AsiaPacific) {
                livenessParams.put("validateFaceSize", "no");
            }
            str5 = "no";
        } catch (JSONException e14) {
            e = e14;
            cVar = c10;
            hashMap = hashMap3;
        }
        String str7222 = null;
        if (str3 == null) {
            File file2 = new File(str3);
            cVar2 = A.c.c("video", file2.getName(), E.create(z.g("video/mp4"), file2));
        } else {
            cVar2 = null;
        }
        if (str4 == null) {
            File file3 = new File(str4);
            cVar3 = A.c.c("frames", file3.getName(), E.create(z.g("application/zip"), file3));
        } else {
            cVar3 = null;
        }
        if (list != null && !list.isEmpty()) {
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("x1", list.get(0));
            jSONObject32.put("y1", list.get(1));
            jSONObject32.put("x2", list.get(2));
            jSONObject32.put("y2", list.get(3));
            livenessParams.put("face-coordinates", jSONObject32.toString());
        }
        ImageComparisonHelper.get().addRequestBodyParams(livenessParams);
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()) {
            SDKInternalConfig.getInstance().getHvSensorBiometrics().addSensorDataToRequestBody(livenessParams);
        }
        try {
            livenessParams.put("isBackCamera", !hVFaceConfig.getShouldUseBackCamera() ? "yes" : str5);
        } catch (JSONException e15) {
            String str10 = TAG;
            HVLogUtils.e(str10, "getLivenessTextureScore(): exception = [" + Utils.getErrorMessage(e15) + "]", e15);
            Log.e(str10, Utils.getErrorMessage(e15));
        }
        new HashMap();
        JSONObject jSONObject222 = new JSONObject();
        if (hVFaceConfig.getHeaders() != null) {
            jSONObject222 = hVFaceConfig.getHeaders();
        }
        JSONObject addHeaderParams222 = addHeaderParams(jSONObject222);
        map = (Map) new e().k(addHeaderParams222.toString(), HashMap.class);
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            map.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        isShouldUseSignature = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature();
        if (!isShouldUseSignature && isApac(hVFaceConfig.getLivenessEndpoint())) {
            HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(true);
        }
        if (!hVFaceConfig.isUseBothImagesSignature()) {
            if (str2 != null) {
                uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str, str2, addHeaderParams222);
            }
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature() && str7222 != null && !map.containsKey(AppConstants.PARAMS_UUID)) {
                map.put(AppConstants.PARAMS_UUID, str7222);
            }
            mapFromJson = getMapFromJson(livenessParams);
            HVLogUtils.e(TAG, "getLivenessTextureScore: requestParams: " + livenessParams.toString());
            if (hVFaceConfig.isShouldRecordVideo() || str3 == null) {
                hashMap2 = hashMap;
                uploadImage = ApiClient.getService().uploadImage(hVFaceConfig.getLivenessEndpoint(), map, cVar, mapFromJson);
            } else if (str4 != null) {
                hashMap2 = hashMap;
                uploadImage = ApiClient.getService().uploadImageAndVideoWithFrames(hVFaceConfig.getLivenessEndpoint(), map, cVar, cVar2, cVar3, mapFromJson);
            } else {
                hashMap2 = hashMap;
                uploadImage = ApiClient.getService().uploadImageAndVideo(hVFaceConfig.getLivenessEndpoint(), map, cVar, cVar2, mapFromJson);
            }
            final String str8222 = str7222;
            uploadImage.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.2
                @Override // De.InterfaceC0820d
                public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                    HVLogUtils.d(RemoteDataSource.TAG, "getLivenessTextureScore(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                    HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                    DataSource.NetworkCallback networkCallback2 = networkCallback;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Network error occurred url: ");
                    sb3.append(hVFaceConfig.getLivenessEndpoint());
                    networkCallback2.onFailure(12, Utils.getLocalizedErrorMessage(th, sb3.toString()));
                }

                @Override // De.InterfaceC0820d
                public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                    String str92;
                    HVLogUtils.d(RemoteDataSource.TAG, "onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                    APIResponse aPIResponse = new APIResponse(zVar);
                    LivenessResponse livenessResponse = new LivenessResponse();
                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str92 = str8222) != null) {
                        try {
                            aPIResponse.setRequestSignature(str92);
                        } catch (JSONException e112) {
                            HVLogUtils.e(RemoteDataSource.TAG, "getLivenessTextureScore(): onResponse exception = [" + Utils.getErrorMessage(e112) + "]", e112);
                            RemoteDataSource.this.logError(e112);
                        }
                    }
                    RemoteDataSource remoteDataSource = RemoteDataSource.this;
                    boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str8222, null, hashMap2, livenessParams, remoteDataSource.convertMapToJson(map), false, hVFaceConfig.getAllowedStatusCodes());
                    if (!isSignatureVerified) {
                        livenessResponse.setLivenessError(AppConstants.SIGNATURE_ERROR);
                        livenessResponse.setErrorCode(18);
                    }
                    livenessResponse.setHttpStatusCode(aPIResponse.getStatusCode());
                    livenessResponse.setStatusMessage(aPIResponse.getStatusMessage());
                    livenessResponse.setHeaders(aPIResponse.getResponseHeaders());
                    JSONObject responseBody = aPIResponse.getResponseBody();
                    boolean isShouldReturnRawResponse = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse();
                    if (zVar.f()) {
                        if (responseBody != null) {
                            if (isShouldReturnRawResponse) {
                                try {
                                    aPIResponse.addRawResponseBody();
                                } catch (JSONException e122) {
                                    RemoteDataSource.this.logError(e122);
                                }
                            }
                            if (isSignatureVerified) {
                                livenessResponse.setResponse(responseBody);
                            }
                        }
                    } else if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                        if (isShouldReturnRawResponse) {
                            try {
                                aPIResponse.addRawErrorBody();
                            } catch (JSONException e132) {
                                RemoteDataSource.this.logError(e132);
                            }
                        }
                        RemoteDataSource.this.setLivenessResponseForSummary(livenessResponse, aPIResponse);
                    }
                    HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                    networkCallback.onSuccess(livenessResponse);
                }
            });
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieAPIPost(hVFaceConfig.getLivenessEndpoint(), str);
            return;
        }
        uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str, addHeaderParams222);
        str7222 = uniqueIdentifierIfNeeded;
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature()) {
            map.put(AppConstants.PARAMS_UUID, str7222);
        }
        mapFromJson = getMapFromJson(livenessParams);
        HVLogUtils.e(TAG, "getLivenessTextureScore: requestParams: " + livenessParams.toString());
        if (hVFaceConfig.isShouldRecordVideo()) {
        }
        hashMap2 = hashMap;
        uploadImage = ApiClient.getService().uploadImage(hVFaceConfig.getLivenessEndpoint(), map, cVar, mapFromJson);
        final String str82222 = str7222;
        uploadImage.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.2
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "getLivenessTextureScore(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                DataSource.NetworkCallback networkCallback2 = networkCallback;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Network error occurred url: ");
                sb3.append(hVFaceConfig.getLivenessEndpoint());
                networkCallback2.onFailure(12, Utils.getLocalizedErrorMessage(th, sb3.toString()));
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                String str92;
                HVLogUtils.d(RemoteDataSource.TAG, "onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                LivenessResponse livenessResponse = new LivenessResponse();
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str92 = str82222) != null) {
                    try {
                        aPIResponse.setRequestSignature(str92);
                    } catch (JSONException e112) {
                        HVLogUtils.e(RemoteDataSource.TAG, "getLivenessTextureScore(): onResponse exception = [" + Utils.getErrorMessage(e112) + "]", e112);
                        RemoteDataSource.this.logError(e112);
                    }
                }
                RemoteDataSource remoteDataSource = RemoteDataSource.this;
                boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str82222, null, hashMap2, livenessParams, remoteDataSource.convertMapToJson(map), false, hVFaceConfig.getAllowedStatusCodes());
                if (!isSignatureVerified) {
                    livenessResponse.setLivenessError(AppConstants.SIGNATURE_ERROR);
                    livenessResponse.setErrorCode(18);
                }
                livenessResponse.setHttpStatusCode(aPIResponse.getStatusCode());
                livenessResponse.setStatusMessage(aPIResponse.getStatusMessage());
                livenessResponse.setHeaders(aPIResponse.getResponseHeaders());
                JSONObject responseBody = aPIResponse.getResponseBody();
                boolean isShouldReturnRawResponse = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse();
                if (zVar.f()) {
                    if (responseBody != null) {
                        if (isShouldReturnRawResponse) {
                            try {
                                aPIResponse.addRawResponseBody();
                            } catch (JSONException e122) {
                                RemoteDataSource.this.logError(e122);
                            }
                        }
                        if (isSignatureVerified) {
                            livenessResponse.setResponse(responseBody);
                        }
                    }
                } else if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                    if (isShouldReturnRawResponse) {
                        try {
                            aPIResponse.addRawErrorBody();
                        } catch (JSONException e132) {
                            RemoteDataSource.this.logError(e132);
                        }
                    }
                    RemoteDataSource.this.setLivenessResponseForSummary(livenessResponse, aPIResponse);
                }
                HyperSnapSDK.getInstance().getHyperSnapSDKConfig().setShouldUseSignature(isShouldUseSignature);
                networkCallback.onSuccess(livenessResponse);
            }
        });
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
        }
    }

    public Map<String, E> getMapFromJson(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "getMapFromJson() called with: params = [" + jSONObject + "]");
        e eVar = new e();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Map map = (Map) eVar.k(jSONObject.toString(), hashMap2.getClass());
        for (String str : map.keySet()) {
            hashMap.put(str, E.create(z.g("text/plain"), (String) map.get(str)));
        }
        return hashMap;
    }

    public String getReferenceId(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "getReferenceId() called with: headers = [" + jSONObject + "]");
        if (jSONObject != null && jSONObject.has("referenceId")) {
            try {
                return jSONObject.getString("referenceId");
            } catch (JSONException e10) {
                printLogs(e10);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        return " ";
    }

    public String getRequestId(v vVar) {
        String str;
        HVLogUtils.d(TAG, "getRequestId() called with: object = [" + vVar + "]");
        try {
            str = vVar.c(AppConstants.REQUEST_ID);
        } catch (Exception e10) {
            printLogs(e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            str = " ";
        }
        if (str != null && !str.trim().isEmpty()) {
            return str;
        }
        try {
            return vVar.c(AppConstants.HV_REQUEST_ID);
        } catch (Exception e11) {
            printLogs(e11);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return " ";
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            return " ";
        }
    }

    public InterfaceC0818b<G> getResponseBodyForSingleImageRequest(Context context, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        HVLogUtils.d(TAG, "getResponseBodyForSingleImageRequest() called with: context = [" + context + "], endpoint = [" + str + "], imageUri = [" + str2 + "], parameters = [" + jSONObject + "], headers = [" + jSONObject2 + "]");
        File file = new File(str2);
        A.c c10 = A.c.c("selfie", file.getName(), E.create(z.g("image/jpeg"), file));
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        JSONObject addHeaderParams = addHeaderParams(jSONObject2);
        Map<String, E> mapFromJson = getMapFromJson(jSONObject);
        Map<String, String> hashMap = new HashMap<>();
        if (addHeaderParams != null) {
            hashMap = (Map) new e().k(addHeaderParams.toString(), HashMap.class);
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            hashMap.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        return ApiClient.getService().singleImageUpload(str, hashMap, c10, mapFromJson);
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void getShouldShowConsent(final APICompletionCallback aPICompletionCallback) {
        new HashMap();
        Map<String, String> map = (Map) new e().k(addHeaderParams(new JSONObject()).toString(), HashMap.class);
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            map.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        map.put("Content-Type", "application/json");
        try {
            if (!SPHelper.getTransactionID().trim().isEmpty() && !map.containsKey("transactionId")) {
                map.put("transactionId", SPHelper.getTransactionID());
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
        ApiClient.getThomasAPIService().consentIsEnabled("https://ind-thomas.hyperverge.co/v1/getConsentConfig", map).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.16
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "getShouldShowConsent(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(th);
                aPICompletionCallback.onResult(new HVError(12, Utils.getLocalizedErrorMessage(th, RemoteDataSource.NETWORK_ERROR_OCCURRED)), null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "getShouldShowConsent(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                if (zVar.f()) {
                    try {
                        hVResponse.setApiResult(aPIResponse.getResponseBody());
                        aPICompletionCallback.onResult(null, hVResponse);
                        return;
                    } catch (Exception e11) {
                        Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(e11));
                        aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e11), hVResponse);
                        return;
                    }
                }
                try {
                    aPICompletionCallback.onResult(RemoteDataSource.this.getError(aPIResponse.getErrorBody()), hVResponse);
                } catch (Exception e12) {
                    Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(e12));
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                    aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e12), hVResponse);
                }
            }
        });
    }

    public String getUUIDForImage(Context context, String str, JSONObject jSONObject) {
        HVLogUtils.d(TAG, "getUUIDForImage() called with: context = [" + context + "], imageUri = [" + str + "], headers = [" + jSONObject + "]");
        String uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str, jSONObject);
        try {
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && uniqueIdentifierIfNeeded != null) {
                jSONObject.put(AppConstants.PARAMS_UUID, uniqueIdentifierIfNeeded);
            }
        } catch (JSONException e10) {
            printLogs(e10);
            SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e10);
        }
        return uniqueIdentifierIfNeeded;
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void ipAddressToGeo(final APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "ipAddressToGeo() called with: callback = [" + aPICompletionCallback + "]");
        HashMap hashMap = new HashMap();
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            hashMap.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        try {
            if (!SPHelper.getTransactionID().trim().isEmpty() && !hashMap.containsKey("transactionId")) {
                hashMap.put("transactionId", SPHelper.getTransactionID());
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
        ApiClient.getService().ipAddressToGeo("https://hypersnapweb.hyperverge.co/api/proxy/geoIP/", hashMap).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.13
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "ipAddressToGeo(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(th);
                aPICompletionCallback.onResult(new HVError(12, Utils.getLocalizedErrorMessage(th, RemoteDataSource.NETWORK_ERROR_OCCURRED)), null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "ipAddressToGeo(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                if (zVar.f()) {
                    try {
                        hVResponse.setApiResult(aPIResponse.getResponseBody());
                        aPICompletionCallback.onResult(null, hVResponse);
                        return;
                    } catch (Exception e11) {
                        Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(e11));
                        aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e11), hVResponse);
                        return;
                    }
                }
                try {
                    aPICompletionCallback.onResult(RemoteDataSource.this.getError(aPIResponse.getErrorBody()), hVResponse);
                } catch (Exception e12) {
                    Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(e12));
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                    aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e12), hVResponse);
                }
            }
        });
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void makeCheckSessionAPICall(Map<String, String> map, JSONObject jSONObject, final APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "makeCheckSessionAPICall() called with: parameters = [" + jSONObject + "], callback = [" + aPICompletionCallback + "]");
        final String str = "https://ind-state.idv.hyperverge.co/v2/check-session";
        ApiClient.getService().checkSessionCall("https://ind-state.idv.hyperverge.co/v2/check-session", map, E.create(z.g("application/json"), jSONObject.toString())).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.1
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "makeCheckSessionAPICall(): onFailure() called with: t = [" + th + "]");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Network error occurred url: ");
                sb2.append(str);
                aPICompletionCallback.onResult(new HVError(12, Utils.getLocalizedErrorMessage(th, sb2.toString())), null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "makeCheckSessionAPICall(): onResponse() called with: response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                JSONObject responseBody = aPIResponse.getResponseBody();
                JSONObject errorBody = aPIResponse.getErrorBody();
                if (zVar.f() && responseBody != null) {
                    hVResponse.setApiResult(responseBody);
                    aPICompletionCallback.onResult(null, hVResponse);
                } else if (zVar.b() < 400 || zVar.b() >= 500) {
                    hVResponse.setApiResult(errorBody);
                    aPICompletionCallback.onResult(null, hVResponse);
                } else {
                    hVResponse.setApiResult(errorBody);
                    aPICompletionCallback.onResult(new HVError(HVError.CPR_CHECK_SESSION_INTERNAL_ERROR, "Session Validation Failed"), hVResponse);
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:(2:22|(22:28|29|30|31|32|33|34|(1:36)(1:76)|37|38|39|(1:44)|46|47|(1:49)|50|(1:73)(1:54)|55|(1:72)(1:62)|63|64|(1:70)(2:68|69)))|32|33|34|(0)(0)|37|38|39|(2:42|44)|46|47|(0)|50|(1:52)|73|55|(1:57)|72|63|64|(2:66|70)(1:71)) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0169, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
    
        r3 = co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.TAG;
        r4 = new java.lang.StringBuilder();
        r24 = r6;
        r4.append("makeEncryptedOcrCall(): exception = [");
        r4.append(co.hyperverge.hypersnapsdk.utils.Utils.getErrorMessage(r0));
        r4.append("]");
        co.hyperverge.hypersnapsdk.utils.HVLogUtils.e(r3, r4.toString(), r0);
        co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig.getInstance().getErrorMonitoringService(r21).sendErrorMessage(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void makeEncryptedOcrCall(final Context context, final String str, final String str2, String str3, HVDocConfig hVDocConfig, final JSONObject jSONObject, JSONObject jSONObject2, final List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        String str4;
        A.c cVar;
        A.c b10;
        A.c b11;
        A.c b12;
        JSONObject addHeaderParams;
        String uniqueIdentifierIfNeeded;
        String str5;
        Map<String, String> hashMap;
        String str6;
        HashMap hashMap2;
        InterfaceC0818b<G> encryptedOcrCall;
        HVLogUtils.d(TAG, "makeEncryptedOcrCall() called with: context=[" + context + "], endpoint=[" + str + "], documentUri=[" + str2 + "], qrCodeCroppedImageUri=[" + str3 + "], hvDocConfig=[" + hVDocConfig + "], parameters=[" + jSONObject + "], headers=[" + jSONObject2 + "], allowedStatusCodes=[" + list + "], callback=[" + aPICompletionCallback + "]");
        if (aPICompletionCallback == null) {
            return;
        }
        if (context == null) {
            aPICompletionCallback.onResult(new HVError(6, "Context object is null"), null);
            return;
        }
        if (str2 == null || str2.trim().isEmpty() || !new File(str2).exists()) {
            aPICompletionCallback.onResult(new HVError(6, "Document file path is null"), null);
            return;
        }
        HashMap hashMap3 = new HashMap();
        if (str2.contains(".pdf")) {
            str4 = "pdf";
            hashMap3.put("pdf", str2);
        } else {
            str4 = "image";
            hashMap3.put("image", str2);
        }
        String publicKey = SDKInternalConfig.getInstance().getPublicKey();
        final byte[] generateIV = HVEncrypt.generateIV();
        final SecretKey generateRandomKey = HVEncrypt.generateRandomKey();
        HVEncrypt.Builder aesKey = HVEncrypt.builder(HVEncrypt.EncryptionMethod.AES_GCM).iv(generateIV).aesKey(generateRandomKey);
        HVEncrypt.Builder publicKey2 = HVEncrypt.builder(HVEncrypt.EncryptionMethod.RSA).publicKey(publicKey);
        try {
            A.c createFilePart = createFilePart(aesKey, str2, str4);
            try {
                if (!StringUtils.isEmptyOrNull(str3)) {
                    hashMap3.put("qrCroppedImage", str3);
                    if (hVDocConfig != null && hVDocConfig.isShouldReadNIDQR() && shouldSendQRCodeToOCREndpoint(str)) {
                        try {
                            cVar = createFilePart(aesKey, str3, "qrCroppedImage");
                            String encrypt = publicKey2.encrypt(Base64.encode(generateIV, 2));
                            String encrypt2 = publicKey2.encrypt(generateRandomKey.getEncoded());
                            String encrypt3 = aesKey.encrypt(jSONObject.toString());
                            b10 = A.c.b("imprint", encrypt);
                            b11 = A.c.b("trace", encrypt2);
                            b12 = A.c.b("payload", encrypt3);
                            addHeaderParams = addHeaderParams(jSONObject2 != null ? new JSONObject() : jSONObject2);
                            uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str2, addHeaderParams);
                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature() && uniqueIdentifierIfNeeded != null && !addHeaderParams.has(AppConstants.PARAMS_UUID)) {
                                addHeaderParams.put(AppConstants.PARAMS_UUID, uniqueIdentifierIfNeeded);
                            }
                            str5 = uniqueIdentifierIfNeeded;
                            hashMap = new HashMap<>();
                            if (addHeaderParams != null) {
                                hashMap = (Map) new e().k(addHeaderParams.toString(), HashMap.class);
                            }
                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
                                hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
                                hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
                            } else {
                                hashMap.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
                            }
                            hashMap.put("key-version", SDKInternalConfig.getInstance().getPublicKeyVersion());
                            if (hVDocConfig == null && hVDocConfig.isShouldReadNIDQR() && shouldSendQRCodeToOCREndpoint(str) && cVar != null) {
                                str6 = str5;
                                hashMap2 = hashMap3;
                                encryptedOcrCall = ApiClient.getService().encryptedOcrPlusQRCall(str, hashMap, createFilePart, cVar, b10, b11, b12);
                            } else {
                                str6 = str5;
                                hashMap2 = hashMap3;
                                encryptedOcrCall = ApiClient.getService().encryptedOcrCall(str, hashMap, createFilePart, b10, b11, b12);
                            }
                            InterfaceC0818b<G> interfaceC0818b = encryptedOcrCall;
                            final TimingUtils timingUtils = new TimingUtils();
                            final String str7 = str6;
                            final HashMap hashMap4 = hashMap2;
                            final Map<String, String> map = hashMap;
                            interfaceC0818b.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.6
                                @Override // De.InterfaceC0820d
                                public void onFailure(InterfaceC0818b<G> interfaceC0818b2, Throwable th) {
                                    HVError hVError;
                                    HVLogUtils.d(RemoteDataSource.TAG, "makeEncryptedOcrCall(): onFailure() called with: call = [" + interfaceC0818b2 + "], t = [" + th + "]");
                                    if (th.getLocalizedMessage().contains("Certificate pinning")) {
                                        hVError = new HVError(15, "Secure connection could not be established.");
                                    } else {
                                        hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred. url: " + str));
                                    }
                                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, hVError);
                                    }
                                    aPICompletionCallback.onResult(hVError, null);
                                }

                                @Override // De.InterfaceC0820d
                                public void onResponse(InterfaceC0818b<G> interfaceC0818b2, De.z<G> zVar) {
                                    String str8;
                                    HVLogUtils.d(RemoteDataSource.TAG, "makeEncryptedOcrCall(): onResponse() called with: call = [" + interfaceC0818b2 + "], response = [" + zVar + "]");
                                    try {
                                        G d10 = zVar.f() ? (G) zVar.a() : zVar.d();
                                        try {
                                            if (d10 == null) {
                                                aPICompletionCallback.onResult(new HVError(12, zVar.f() ? "Response body is null" : "Response error body is null"), null);
                                                if (d10 != null) {
                                                    d10.close();
                                                    return;
                                                }
                                                return;
                                            }
                                            String decrypt = HVEncrypt.builder(HVEncrypt.EncryptionMethod.AES_GCM).aesKey(generateRandomKey).iv(generateIV).decrypt(Base64.decode(new JSONObject(d10.l()).getString("payload"), 2));
                                            boolean f10 = zVar.f();
                                            String str9 = BuildConfig.FLAVOR;
                                            if (!f10) {
                                                str9 = decrypt;
                                                decrypt = BuildConfig.FLAVOR;
                                            }
                                            d10.close();
                                            APIResponse aPIResponse = new APIResponse(zVar.b(), zVar.g(), G.i(z.g("application/json"), decrypt), G.i(z.g("application/json"), str9), zVar.e());
                                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str8 = str7) != null) {
                                                try {
                                                    aPIResponse.setRequestSignature(str8);
                                                } catch (JSONException e10) {
                                                    RemoteDataSource.this.logError(e10);
                                                }
                                            }
                                            RemoteDataSource remoteDataSource = RemoteDataSource.this;
                                            boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str7, null, hashMap4, jSONObject, remoteDataSource.convertMapToJson(map), false, list);
                                            HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                                            HVResponse hVResponse = new HVResponse();
                                            hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                            hVResponse.setStatusCode(aPIResponse.getStatusCode());
                                            hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                                            if (!zVar.f()) {
                                                new HVError();
                                                if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                                                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                                        try {
                                                            aPIResponse.addHeader(AppConstants.RAW_RESPONSE, aPIResponse.getErrorBody().toString());
                                                            hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                                        } catch (JSONException e11) {
                                                            RemoteDataSource.this.logError(e11);
                                                        }
                                                    }
                                                    hVResponse = RemoteDataSource.this.setSummaryDetails(hVResponse, aPIResponse.getErrorBody());
                                                    error = RemoteDataSource.this.getError(aPIResponse.getErrorBody());
                                                }
                                                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                                                }
                                                aPICompletionCallback.onResult(error, hVResponse);
                                                return;
                                            }
                                            JSONObject responseBody = aPIResponse.getResponseBody();
                                            if (responseBody != null) {
                                                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                                    try {
                                                        aPIResponse.addRawResponseBody();
                                                        hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                                    } catch (JSONException e12) {
                                                        RemoteDataSource.this.logError(e12);
                                                    }
                                                }
                                                if (!isSignatureVerified) {
                                                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                                                    }
                                                    aPICompletionCallback.onResult(error, hVResponse);
                                                } else {
                                                    hVResponse.setApiResult(responseBody);
                                                    HVResponse summaryDetails = RemoteDataSource.this.setSummaryDetails(hVResponse, responseBody);
                                                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPIResponseReceived(summaryDetails, str2, timingUtils.getTimeDifferenceLong().longValue());
                                                    }
                                                    aPICompletionCallback.onResult(null, summaryDetails);
                                                }
                                            }
                                        } finally {
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        aPICompletionCallback.onResult(new HVError(2, Utils.getLocalizedErrorMessage(e, RemoteDataSource.INTERNAL_SDK_ERROR)), null);
                                    } catch (JSONException e14) {
                                        e = e14;
                                        aPICompletionCallback.onResult(new HVError(2, Utils.getLocalizedErrorMessage(e, RemoteDataSource.INTERNAL_SDK_ERROR)), null);
                                    }
                                }
                            });
                            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                                return;
                            }
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPIPost(str, str2);
                            return;
                        } catch (Exception unused) {
                            aPICompletionCallback.onResult(new HVError(43, INTERNAL_SDK_ERROR), null);
                            return;
                        }
                    }
                }
                String encrypt4 = publicKey2.encrypt(Base64.encode(generateIV, 2));
                String encrypt22 = publicKey2.encrypt(generateRandomKey.getEncoded());
                String encrypt32 = aesKey.encrypt(jSONObject.toString());
                b10 = A.c.b("imprint", encrypt4);
                b11 = A.c.b("trace", encrypt22);
                b12 = A.c.b("payload", encrypt32);
                addHeaderParams = addHeaderParams(jSONObject2 != null ? new JSONObject() : jSONObject2);
                uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str2, addHeaderParams);
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature()) {
                    addHeaderParams.put(AppConstants.PARAMS_UUID, uniqueIdentifierIfNeeded);
                }
                str5 = uniqueIdentifierIfNeeded;
                hashMap = new HashMap<>();
                if (addHeaderParams != null) {
                }
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null) {
                }
                hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
                hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
                hashMap.put("key-version", SDKInternalConfig.getInstance().getPublicKeyVersion());
                if (hVDocConfig == null) {
                }
                str6 = str5;
                hashMap2 = hashMap3;
                encryptedOcrCall = ApiClient.getService().encryptedOcrCall(str, hashMap, createFilePart, b10, b11, b12);
                InterfaceC0818b<G> interfaceC0818b2 = encryptedOcrCall;
                final TimingUtils timingUtils2 = new TimingUtils();
                final String str72 = str6;
                final HashMap hashMap42 = hashMap2;
                final Map map2 = hashMap;
                interfaceC0818b2.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.6
                    @Override // De.InterfaceC0820d
                    public void onFailure(InterfaceC0818b<G> interfaceC0818b22, Throwable th) {
                        HVError hVError;
                        HVLogUtils.d(RemoteDataSource.TAG, "makeEncryptedOcrCall(): onFailure() called with: call = [" + interfaceC0818b22 + "], t = [" + th + "]");
                        if (th.getLocalizedMessage().contains("Certificate pinning")) {
                            hVError = new HVError(15, "Secure connection could not be established.");
                        } else {
                            hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred. url: " + str));
                        }
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, hVError);
                        }
                        aPICompletionCallback.onResult(hVError, null);
                    }

                    @Override // De.InterfaceC0820d
                    public void onResponse(InterfaceC0818b<G> interfaceC0818b22, De.z<G> zVar) {
                        String str8;
                        HVLogUtils.d(RemoteDataSource.TAG, "makeEncryptedOcrCall(): onResponse() called with: call = [" + interfaceC0818b22 + "], response = [" + zVar + "]");
                        try {
                            G d10 = zVar.f() ? (G) zVar.a() : zVar.d();
                            try {
                                if (d10 == null) {
                                    aPICompletionCallback.onResult(new HVError(12, zVar.f() ? "Response body is null" : "Response error body is null"), null);
                                    if (d10 != null) {
                                        d10.close();
                                        return;
                                    }
                                    return;
                                }
                                String decrypt = HVEncrypt.builder(HVEncrypt.EncryptionMethod.AES_GCM).aesKey(generateRandomKey).iv(generateIV).decrypt(Base64.decode(new JSONObject(d10.l()).getString("payload"), 2));
                                boolean f10 = zVar.f();
                                String str9 = BuildConfig.FLAVOR;
                                if (!f10) {
                                    str9 = decrypt;
                                    decrypt = BuildConfig.FLAVOR;
                                }
                                d10.close();
                                APIResponse aPIResponse = new APIResponse(zVar.b(), zVar.g(), G.i(z.g("application/json"), decrypt), G.i(z.g("application/json"), str9), zVar.e());
                                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str8 = str72) != null) {
                                    try {
                                        aPIResponse.setRequestSignature(str8);
                                    } catch (JSONException e10) {
                                        RemoteDataSource.this.logError(e10);
                                    }
                                }
                                RemoteDataSource remoteDataSource = RemoteDataSource.this;
                                boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str72, null, hashMap42, jSONObject, remoteDataSource.convertMapToJson(map2), false, list);
                                HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                                HVResponse hVResponse = new HVResponse();
                                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                                if (!zVar.f()) {
                                    new HVError();
                                    if (isSignatureVerified && aPIResponse.getErrorBody() != null) {
                                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                            try {
                                                aPIResponse.addHeader(AppConstants.RAW_RESPONSE, aPIResponse.getErrorBody().toString());
                                                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                            } catch (JSONException e11) {
                                                RemoteDataSource.this.logError(e11);
                                            }
                                        }
                                        hVResponse = RemoteDataSource.this.setSummaryDetails(hVResponse, aPIResponse.getErrorBody());
                                        error = RemoteDataSource.this.getError(aPIResponse.getErrorBody());
                                    }
                                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                                    }
                                    aPICompletionCallback.onResult(error, hVResponse);
                                    return;
                                }
                                JSONObject responseBody = aPIResponse.getResponseBody();
                                if (responseBody != null) {
                                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                        try {
                                            aPIResponse.addRawResponseBody();
                                            hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                        } catch (JSONException e12) {
                                            RemoteDataSource.this.logError(e12);
                                        }
                                    }
                                    if (!isSignatureVerified) {
                                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                                        }
                                        aPICompletionCallback.onResult(error, hVResponse);
                                    } else {
                                        hVResponse.setApiResult(responseBody);
                                        HVResponse summaryDetails = RemoteDataSource.this.setSummaryDetails(hVResponse, responseBody);
                                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPIResponseReceived(summaryDetails, str2, timingUtils2.getTimeDifferenceLong().longValue());
                                        }
                                        aPICompletionCallback.onResult(null, summaryDetails);
                                    }
                                }
                            } finally {
                            }
                        } catch (IOException e13) {
                            e = e13;
                            aPICompletionCallback.onResult(new HVError(2, Utils.getLocalizedErrorMessage(e, RemoteDataSource.INTERNAL_SDK_ERROR)), null);
                        } catch (JSONException e14) {
                            e = e14;
                            aPICompletionCallback.onResult(new HVError(2, Utils.getLocalizedErrorMessage(e, RemoteDataSource.INTERNAL_SDK_ERROR)), null);
                        }
                    }
                });
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    return;
                } else {
                    return;
                }
            } catch (Exception unused2) {
                aPICompletionCallback.onResult(new HVError(43, INTERNAL_SDK_ERROR), null);
                return;
            }
            cVar = null;
        } catch (Exception unused3) {
            aPICompletionCallback.onResult(new HVError(43, INTERNAL_SDK_ERROR), null);
        }
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void makeFaceAuthAPICall(final Context context, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, final List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "makeFaceAuthAPICall() called with: context = [" + context + "], endpoint = [" + str + "], selfieImageURL = [" + str2 + "], parameters = [" + jSONObject + "], headers = [" + jSONObject2 + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        final String uUIDForImage = getUUIDForImage(context, str2, jSONObject2);
        getResponseBodyForSingleImageRequest(context, str, str2, jSONObject, jSONObject2).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.15
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "makeFaceAuthAPICall(): onFailure() called with: call = [" + interfaceC0818b + "], throwable = [" + th + "]");
                RemoteDataSource.this.processFailureResponse(context, th, aPICompletionCallback);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "makeFaceAuthAPICall(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                RemoteDataSource.this.processResponse(context, zVar, uUIDForImage, list, aPICompletionCallback);
            }
        });
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void makeFaceDedupeAPICall(final Context context, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, final List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "makeFaceDedupeAPICall() called with: context = [" + context + "], endpoint = [" + str + "], selfieImageURL = [" + str2 + "], parameters = [" + jSONObject + "], headers = [" + jSONObject2 + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        final String uUIDForImage = getUUIDForImage(context, str2, jSONObject2);
        getResponseBodyForSingleImageRequest(context, str, str2, jSONObject, jSONObject2).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.14
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "makeFaceDedupeAPICall(): onFailure() called with: call = [" + interfaceC0818b + "], throwable = [" + th + "]");
                RemoteDataSource.this.processFailureResponse(context, th, aPICompletionCallback);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "makeFaceDedupeAPICall() onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                RemoteDataSource.this.processResponse(context, zVar, uUIDForImage, list, aPICompletionCallback);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fd  */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.Map] */
    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void makeFaceMatchCall(final Context context, final String str, String str2, String str3, final HyperSnapParams.FaceMatchMode faceMatchMode, JSONObject jSONObject, JSONObject jSONObject2, final List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        String str4;
        A.c cVar;
        HashMap hashMap;
        HVLogUtils.d(TAG, "makeFaceMatchCall() called with: context = [" + context + "], endpoint = [" + str + "], image1 = [" + str2 + "], image2 = [" + str3 + "], hyperSnapFaceMatchMode = [" + faceMatchMode + "], parameters = [" + jSONObject + "], headers = [" + jSONObject2 + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        if (!isValidFaceMatchInputs(context, str, str2, str3, faceMatchMode, aPICompletionCallback)) {
            return;
        }
        final HashMap hashMap2 = new HashMap();
        JSONObject createFaceMatchHeaders = createFaceMatchHeaders(jSONObject2);
        final JSONObject createFaceMatchParams = createFaceMatchParams(jSONObject);
        final String uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str3, str2, createFaceMatchHeaders);
        try {
            if (!StringUtils.isEmptyOrNull(SPHelper.getTransactionID()) && !createFaceMatchHeaders.has("transactionId")) {
                createFaceMatchHeaders.put("transactionId", SPHelper.getTransactionID());
            }
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature() && uniqueIdentifierIfNeeded != null && !createFaceMatchHeaders.has(AppConstants.PARAMS_UUID)) {
                createFaceMatchHeaders.put(AppConstants.PARAMS_UUID, uniqueIdentifierIfNeeded);
            }
        } catch (JSONException e10) {
            String str5 = TAG;
            HVLogUtils.e(str5, "makeOcrCall(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str5, Utils.getErrorMessage(e10));
            SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e10);
        }
        int i10 = AnonymousClass18.$SwitchMap$co$hyperverge$hypersnapsdk$objects$HyperSnapParams$FaceMatchMode[faceMatchMode.ordinal()];
        String str6 = "image2";
        String str7 = "image1";
        if (i10 == 1) {
            str4 = str;
            if (isIndia(str4)) {
                str6 = "selfie2";
                str7 = "selfie";
            } else if (isApac(str4) || isAfrica(str4)) {
                try {
                    createFaceMatchParams.put("type", "id");
                } catch (JSONException e11) {
                    Log.e(TAG, Utils.getErrorMessage(e11));
                    SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e11);
                }
            }
            File file = new File(str2);
            A.c c10 = A.c.c(str7, file.getName(), E.create(z.g("image/jpeg"), file));
            if (faceMatchMode != HyperSnapParams.FaceMatchMode.FACE_IDFACESTRING) {
            }
            cVar = null;
            A.c cVar2 = cVar;
            hashMap2.put(str7, str2);
            hashMap2.put(str6, str3);
            Map<String, E> mapFromJson = getMapFromJson(createFaceMatchParams);
            if (createFaceMatchHeaders != null) {
            }
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null) {
            }
            hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
            final HashMap hashMap3 = hashMap;
            InterfaceC0818b<G> verifyPair = ApiClient.getService().verifyPair(str, hashMap, c10, cVar2, mapFromJson);
            final TimingUtils timingUtils = new TimingUtils();
            verifyPair.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.7
                @Override // De.InterfaceC0820d
                public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                    HVError hVError;
                    HVLogUtils.d(RemoteDataSource.TAG, "onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                    Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                    if (th.getLocalizedMessage().contains("Certificate pinning")) {
                        hVError = new HVError(15, "Secure connection error");
                    } else {
                        hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred url: " + str));
                    }
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, hVError, faceMatchMode.toString());
                    }
                    aPICompletionCallback.onResult(hVError, null);
                }

                @Override // De.InterfaceC0820d
                public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                    String str8;
                    HVLogUtils.d(RemoteDataSource.TAG, "makeOCRCall(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                    APIResponse aPIResponse = new APIResponse(zVar);
                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str8 = uniqueIdentifierIfNeeded) != null) {
                        try {
                            aPIResponse.setRequestSignature(str8);
                        } catch (JSONException e12) {
                            HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e12) + "]", e12);
                            RemoteDataSource.this.logError(e12);
                        }
                    }
                    RemoteDataSource remoteDataSource = RemoteDataSource.this;
                    boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, uniqueIdentifierIfNeeded, null, hashMap2, createFaceMatchParams, remoteDataSource.convertMapToJson(hashMap3), false, list);
                    HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                    HVResponse hVResponse = new HVResponse();
                    hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                    hVResponse.setStatusCode(aPIResponse.getStatusCode());
                    hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                    JSONObject responseBody = aPIResponse.getResponseBody();
                    if (!zVar.f()) {
                        HVError hVError = new HVError();
                        if (isSignatureVerified) {
                            JSONObject errorBody = aPIResponse.getErrorBody();
                            if (errorBody != null) {
                                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                    try {
                                        aPIResponse.addHeader(AppConstants.RAW_RESPONSE, errorBody.toString());
                                        hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                    } catch (JSONException e13) {
                                        HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e13) + "]", e13);
                                        RemoteDataSource.this.logError(e13);
                                    }
                                }
                                hVResponse = RemoteDataSource.this.setSummaryDetails(hVResponse, errorBody);
                                error = RemoteDataSource.this.getError(errorBody);
                            } else {
                                error = hVError;
                            }
                        }
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                        }
                        aPICompletionCallback.onResult(error, hVResponse);
                        return;
                    }
                    if (responseBody != null) {
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                            try {
                                aPIResponse.addHeader(AppConstants.RAW_RESPONSE, responseBody.toString());
                                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                            } catch (JSONException e14) {
                                HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e14) + "]", e14);
                                RemoteDataSource.this.logError(e14);
                            }
                        }
                        if (!isSignatureVerified) {
                            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, error, faceMatchMode.toString());
                            }
                            aPICompletionCallback.onResult(error, hVResponse);
                            return;
                        }
                        if (responseBody.has("result")) {
                            try {
                                JSONObject jSONObject3 = responseBody.getJSONObject("result");
                                if (jSONObject3 != null && jSONObject3.has(AppConstants.VIDEO_RECORDING_ERROR) && jSONObject3.getString(AppConstants.VIDEO_RECORDING_ERROR).toLowerCase().contains("face not detected")) {
                                    HVError error2 = RemoteDataSource.this.getError(jSONObject3.getString(AppConstants.VIDEO_RECORDING_ERROR), 22);
                                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, error2, faceMatchMode.toString());
                                    }
                                    aPICompletionCallback.onResult(error2, hVResponse);
                                    return;
                                }
                            } catch (JSONException e15) {
                                HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e15) + "]", e15);
                                RemoteDataSource.this.logError(e15);
                            }
                            hVResponse.setApiResult(responseBody);
                            HVResponse summaryDetails = RemoteDataSource.this.setSummaryDetails(hVResponse, responseBody);
                            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPIResponseReceived(summaryDetails, timingUtils.getTimeDifferenceLong().longValue());
                            }
                            aPICompletionCallback.onResult(null, summaryDetails);
                        }
                    }
                }
            });
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            }
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                try {
                    createFaceMatchParams.put("idFaceString", str3);
                } catch (JSONException e12) {
                    Log.e(TAG, Utils.getErrorMessage(e12));
                    SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e12);
                }
            }
            str4 = str;
        } else {
            str4 = str;
            if (!isIndia(str4) && (isApac(str4) || isAfrica(str4))) {
                try {
                    createFaceMatchParams.put("type", "selfie");
                } catch (JSONException e13) {
                    Log.e(TAG, Utils.getErrorMessage(e13));
                    SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e13);
                }
                File file2 = new File(str2);
                A.c c102 = A.c.c(str7, file2.getName(), E.create(z.g("image/jpeg"), file2));
                if (faceMatchMode != HyperSnapParams.FaceMatchMode.FACE_IDFACESTRING || faceMatchMode == HyperSnapParams.FaceMatchMode.FACE_ID_FACE_STRING) {
                    cVar = null;
                } else {
                    File file3 = new File(str3);
                    cVar = A.c.c(str6, file3.getName(), E.create(z.g("image/jpeg"), file3));
                }
                A.c cVar22 = cVar;
                hashMap2.put(str7, str2);
                hashMap2.put(str6, str3);
                Map<String, E> mapFromJson2 = getMapFromJson(createFaceMatchParams);
                hashMap = createFaceMatchHeaders != null ? (Map) new e().k(createFaceMatchHeaders.toString(), HashMap.class) : new HashMap();
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
                    hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
                    hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
                } else {
                    hashMap.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
                }
                final Map hashMap32 = hashMap;
                InterfaceC0818b<G> verifyPair2 = ApiClient.getService().verifyPair(str, hashMap, c102, cVar22, mapFromJson2);
                final TimingUtils timingUtils2 = new TimingUtils();
                verifyPair2.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.7
                    @Override // De.InterfaceC0820d
                    public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                        HVError hVError;
                        HVLogUtils.d(RemoteDataSource.TAG, "onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                        Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                        if (th.getLocalizedMessage().contains("Certificate pinning")) {
                            hVError = new HVError(15, "Secure connection error");
                        } else {
                            hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred url: " + str));
                        }
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, hVError, faceMatchMode.toString());
                        }
                        aPICompletionCallback.onResult(hVError, null);
                    }

                    @Override // De.InterfaceC0820d
                    public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                        String str8;
                        HVLogUtils.d(RemoteDataSource.TAG, "makeOCRCall(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                        APIResponse aPIResponse = new APIResponse(zVar);
                        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str8 = uniqueIdentifierIfNeeded) != null) {
                            try {
                                aPIResponse.setRequestSignature(str8);
                            } catch (JSONException e122) {
                                HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e122) + "]", e122);
                                RemoteDataSource.this.logError(e122);
                            }
                        }
                        RemoteDataSource remoteDataSource = RemoteDataSource.this;
                        boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, uniqueIdentifierIfNeeded, null, hashMap2, createFaceMatchParams, remoteDataSource.convertMapToJson(hashMap32), false, list);
                        HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                        HVResponse hVResponse = new HVResponse();
                        hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                        hVResponse.setStatusCode(aPIResponse.getStatusCode());
                        hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                        JSONObject responseBody = aPIResponse.getResponseBody();
                        if (!zVar.f()) {
                            HVError hVError = new HVError();
                            if (isSignatureVerified) {
                                JSONObject errorBody = aPIResponse.getErrorBody();
                                if (errorBody != null) {
                                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                        try {
                                            aPIResponse.addHeader(AppConstants.RAW_RESPONSE, errorBody.toString());
                                            hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                        } catch (JSONException e132) {
                                            HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e132) + "]", e132);
                                            RemoteDataSource.this.logError(e132);
                                        }
                                    }
                                    hVResponse = RemoteDataSource.this.setSummaryDetails(hVResponse, errorBody);
                                    error = RemoteDataSource.this.getError(errorBody);
                                } else {
                                    error = hVError;
                                }
                            }
                            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                            }
                            aPICompletionCallback.onResult(error, hVResponse);
                            return;
                        }
                        if (responseBody != null) {
                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                try {
                                    aPIResponse.addHeader(AppConstants.RAW_RESPONSE, responseBody.toString());
                                    hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                } catch (JSONException e14) {
                                    HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e14) + "]", e14);
                                    RemoteDataSource.this.logError(e14);
                                }
                            }
                            if (!isSignatureVerified) {
                                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, error, faceMatchMode.toString());
                                }
                                aPICompletionCallback.onResult(error, hVResponse);
                                return;
                            }
                            if (responseBody.has("result")) {
                                try {
                                    JSONObject jSONObject3 = responseBody.getJSONObject("result");
                                    if (jSONObject3 != null && jSONObject3.has(AppConstants.VIDEO_RECORDING_ERROR) && jSONObject3.getString(AppConstants.VIDEO_RECORDING_ERROR).toLowerCase().contains("face not detected")) {
                                        HVError error2 = RemoteDataSource.this.getError(jSONObject3.getString(AppConstants.VIDEO_RECORDING_ERROR), 22);
                                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, error2, faceMatchMode.toString());
                                        }
                                        aPICompletionCallback.onResult(error2, hVResponse);
                                        return;
                                    }
                                } catch (JSONException e15) {
                                    HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e15) + "]", e15);
                                    RemoteDataSource.this.logError(e15);
                                }
                                hVResponse.setApiResult(responseBody);
                                HVResponse summaryDetails = RemoteDataSource.this.setSummaryDetails(hVResponse, responseBody);
                                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPIResponseReceived(summaryDetails, timingUtils2.getTimeDifferenceLong().longValue());
                                }
                                aPICompletionCallback.onResult(null, summaryDetails);
                            }
                        }
                    }
                });
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPIPost(str4, faceMatchMode.toString(), str2, str3);
                    return;
                }
                return;
            }
        }
        str7 = "selfie";
        str6 = "id";
        File file22 = new File(str2);
        A.c c1022 = A.c.c(str7, file22.getName(), E.create(z.g("image/jpeg"), file22));
        if (faceMatchMode != HyperSnapParams.FaceMatchMode.FACE_IDFACESTRING) {
        }
        cVar = null;
        A.c cVar222 = cVar;
        hashMap2.put(str7, str2);
        hashMap2.put(str6, str3);
        Map<String, E> mapFromJson22 = getMapFromJson(createFaceMatchParams);
        if (createFaceMatchHeaders != null) {
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() != null) {
        }
        hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
        hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        final Map hashMap322 = hashMap;
        InterfaceC0818b<G> verifyPair22 = ApiClient.getService().verifyPair(str, hashMap, c1022, cVar222, mapFromJson22);
        final TimingUtils timingUtils22 = new TimingUtils();
        verifyPair22.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.7
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVError hVError;
                HVLogUtils.d(RemoteDataSource.TAG, "onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                if (th.getLocalizedMessage().contains("Certificate pinning")) {
                    hVError = new HVError(15, "Secure connection error");
                } else {
                    hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred url: " + str));
                }
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, hVError, faceMatchMode.toString());
                }
                aPICompletionCallback.onResult(hVError, null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                String str8;
                HVLogUtils.d(RemoteDataSource.TAG, "makeOCRCall(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str8 = uniqueIdentifierIfNeeded) != null) {
                    try {
                        aPIResponse.setRequestSignature(str8);
                    } catch (JSONException e122) {
                        HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e122) + "]", e122);
                        RemoteDataSource.this.logError(e122);
                    }
                }
                RemoteDataSource remoteDataSource = RemoteDataSource.this;
                boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, uniqueIdentifierIfNeeded, null, hashMap2, createFaceMatchParams, remoteDataSource.convertMapToJson(hashMap322), false, list);
                HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                JSONObject responseBody = aPIResponse.getResponseBody();
                if (!zVar.f()) {
                    HVError hVError = new HVError();
                    if (isSignatureVerified) {
                        JSONObject errorBody = aPIResponse.getErrorBody();
                        if (errorBody != null) {
                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                try {
                                    aPIResponse.addHeader(AppConstants.RAW_RESPONSE, errorBody.toString());
                                    hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                } catch (JSONException e132) {
                                    HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e132) + "]", e132);
                                    RemoteDataSource.this.logError(e132);
                                }
                            }
                            hVResponse = RemoteDataSource.this.setSummaryDetails(hVResponse, errorBody);
                            error = RemoteDataSource.this.getError(errorBody);
                        } else {
                            error = hVError;
                        }
                    }
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                    }
                    aPICompletionCallback.onResult(error, hVResponse);
                    return;
                }
                if (responseBody != null) {
                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                        try {
                            aPIResponse.addHeader(AppConstants.RAW_RESPONSE, responseBody.toString());
                            hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                        } catch (JSONException e14) {
                            HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e14) + "]", e14);
                            RemoteDataSource.this.logError(e14);
                        }
                    }
                    if (!isSignatureVerified) {
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, error, faceMatchMode.toString());
                        }
                        aPICompletionCallback.onResult(error, hVResponse);
                        return;
                    }
                    if (responseBody.has("result")) {
                        try {
                            JSONObject jSONObject3 = responseBody.getJSONObject("result");
                            if (jSONObject3 != null && jSONObject3.has(AppConstants.VIDEO_RECORDING_ERROR) && jSONObject3.getString(AppConstants.VIDEO_RECORDING_ERROR).toLowerCase().contains("face not detected")) {
                                HVError error2 = RemoteDataSource.this.getError(jSONObject3.getString(AppConstants.VIDEO_RECORDING_ERROR), 22);
                                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPICallFailed(null, error2, faceMatchMode.toString());
                                }
                                aPICompletionCallback.onResult(error2, hVResponse);
                                return;
                            }
                        } catch (JSONException e15) {
                            HVLogUtils.e(RemoteDataSource.TAG, "makeOCRCall(): onResponse exception = [" + Utils.getErrorMessage(e15) + "]", e15);
                            RemoteDataSource.this.logError(e15);
                        }
                        hVResponse.setApiResult(responseBody);
                        HVResponse summaryDetails = RemoteDataSource.this.setSummaryDetails(hVResponse, responseBody);
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logFaceMatchAPIResponseReceived(summaryDetails, timingUtils22.getTimeDifferenceLong().longValue());
                        }
                        aPICompletionCallback.onResult(null, summaryDetails);
                    }
                }
            }
        });
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
        }
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void makeOcrCall(final Context context, final String str, final String str2, String str3, HVDocConfig hVDocConfig, final JSONObject jSONObject, JSONObject jSONObject2, final List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        String str4;
        String str5;
        A.c cVar;
        String str6;
        String str7;
        InterfaceC0818b<G> ocrCall;
        HVLogUtils.d(TAG, "makeOcrCall() called with: context = [" + context + "], endpoint = [" + str + "], documentUri = [" + str2 + "], qrCodeCroppedImageUri = [" + str3 + "], hvDocConfig = [" + hVDocConfig + "], parameters = [" + jSONObject + "], headers = [" + jSONObject2 + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        if (aPICompletionCallback == null) {
            return;
        }
        if (context == null) {
            aPICompletionCallback.onResult(new HVError(6, "Context object is null"), null);
            return;
        }
        final HashMap hashMap = new HashMap();
        if (str2 == null || str2.trim().isEmpty() || !new File(str2).exists()) {
            aPICompletionCallback.onResult(new HVError(6, "Document file path is null"), null);
            return;
        }
        File file = new File(str2);
        if (str2.contains(".pdf")) {
            str4 = "pdf";
            hashMap.put("pdf", str2);
            str5 = "application/pdf";
        } else {
            str4 = "image";
            hashMap.put("image", str2);
            str5 = "image/jpeg";
        }
        A.c c10 = A.c.c(str4, file.getName(), E.create(z.g(str5), file));
        if (!StringUtils.isEmptyOrNull(str3)) {
            hashMap.put("qrCroppedImage", str3);
        }
        if (hVDocConfig == null || !hVDocConfig.isShouldReadNIDQR() || StringUtils.isEmptyOrNull(str3)) {
            cVar = null;
        } else {
            File file2 = new File(str3);
            cVar = A.c.c("qrCroppedImage", file2.getName(), E.create(z.g("image/jpeg"), file2));
        }
        JSONObject addHeaderParams = addHeaderParams(jSONObject2 == null ? new JSONObject() : jSONObject2);
        String uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str2, addHeaderParams);
        try {
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSHA256Signature() && uniqueIdentifierIfNeeded != null && !addHeaderParams.has(AppConstants.PARAMS_UUID)) {
                addHeaderParams.put(AppConstants.PARAMS_UUID, uniqueIdentifierIfNeeded);
            }
            str6 = uniqueIdentifierIfNeeded;
        } catch (JSONException e10) {
            String str8 = TAG;
            str6 = uniqueIdentifierIfNeeded;
            HVLogUtils.e(str8, "makeOcrCall(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str8, Utils.getErrorMessage(e10));
            SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e10);
        }
        checkForDataLogging(jSONObject);
        Map<String, E> mapFromJson = getMapFromJson(jSONObject);
        Map<String, String> hashMap2 = new HashMap<>();
        if (addHeaderParams != null) {
            hashMap2 = (Map) new e().k(addHeaderParams.toString(), HashMap.class);
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            hashMap2.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            hashMap2.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            hashMap2.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        if (hVDocConfig == null || !hVDocConfig.isShouldReadNIDQR() || !shouldSendQRCodeToOCREndpoint(str) || cVar == null) {
            str7 = str6;
            ocrCall = ApiClient.getService().ocrCall(str, hashMap2, c10, mapFromJson);
        } else {
            str7 = str6;
            ocrCall = ApiClient.getService().ocrPlusQRCall(str, hashMap2, c10, cVar, mapFromJson);
        }
        InterfaceC0818b<G> interfaceC0818b = ocrCall;
        getReferenceId(addHeaderParams);
        final TimingUtils timingUtils = new TimingUtils();
        final String str9 = str7;
        final Map<String, String> map = hashMap2;
        interfaceC0818b.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.5
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b2, Throwable th) {
                HVError hVError;
                HVLogUtils.d(RemoteDataSource.TAG, "makeOcrCall(): onFailure() called with: call = [" + interfaceC0818b2 + "], t = [" + th + "]");
                Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                if (th.getLocalizedMessage().contains("Certificate pinning")) {
                    hVError = new HVError(15, "Secure connection could not be established.");
                } else {
                    hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred url: " + str));
                }
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, hVError);
                }
                aPICompletionCallback.onResult(hVError, null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b2, De.z<G> zVar) {
                String str10;
                HVLogUtils.d(RemoteDataSource.TAG, "makeOcrCall(): onResponse() called with: call = [" + interfaceC0818b2 + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str10 = str9) != null) {
                    try {
                        aPIResponse.setRequestSignature(str10);
                    } catch (JSONException e11) {
                        RemoteDataSource.this.logError(e11);
                    }
                }
                RemoteDataSource remoteDataSource = RemoteDataSource.this;
                boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, str9, null, hashMap, jSONObject, remoteDataSource.convertMapToJson(map), false, list);
                HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                boolean isShouldReturnRawResponse = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse();
                JSONObject responseBody = aPIResponse.getResponseBody();
                if (!zVar.f()) {
                    HVError hVError = new HVError();
                    if (isSignatureVerified) {
                        if (aPIResponse.getErrorBody() != null) {
                            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()) {
                                try {
                                    aPIResponse.addHeader(AppConstants.RAW_RESPONSE, aPIResponse.getErrorBody().toString());
                                    hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                                } catch (JSONException e12) {
                                    RemoteDataSource.this.logError(e12);
                                }
                            }
                            hVResponse = RemoteDataSource.this.setSummaryDetails(hVResponse, aPIResponse.getErrorBody());
                            error = RemoteDataSource.this.getError(aPIResponse.getErrorBody());
                        } else {
                            error = hVError;
                        }
                    }
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                    }
                    aPICompletionCallback.onResult(error, hVResponse);
                    return;
                }
                if (responseBody != null) {
                    if (isShouldReturnRawResponse) {
                        try {
                            aPIResponse.addRawResponseBody();
                            hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                        } catch (JSONException e13) {
                            RemoteDataSource.this.logError(e13);
                        }
                    }
                    if (!isSignatureVerified) {
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPICallFailed(null, error);
                        }
                        aPICompletionCallback.onResult(error, hVResponse);
                    } else {
                        hVResponse.setApiResult(responseBody);
                        HVResponse summaryDetails = RemoteDataSource.this.setSummaryDetails(hVResponse, responseBody);
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPIResponseReceived(summaryDetails, str2, timingUtils.getTimeDifferenceLong().longValue());
                        }
                        aPICompletionCallback.onResult(null, summaryDetails);
                    }
                }
            }
        });
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logDocumentAPIPost(str, str2);
        }
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void makeTextMatchAPICall(final Context context, final String str, JSONObject jSONObject, JSONObject jSONObject2, final List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "makeTextMatchAPICall() called with: context = [" + context + "], endpoint = [" + str + "], parameters = [" + jSONObject + "], headers = [" + jSONObject2 + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        if (aPICompletionCallback == null) {
            return;
        }
        if (context == null) {
            aPICompletionCallback.onResult(new HVError(6, "Context object is null"), null);
            return;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject3 = jSONObject;
        JSONObject addHeaderParams = addHeaderParams(jSONObject2);
        final String uniqueIdentifierForReqIfNeeded = SignatureHelper.getUniqueIdentifierForReqIfNeeded(jSONObject3.toString());
        Map<String, String> hashMap = new HashMap<>();
        if (addHeaderParams != null) {
            hashMap = (Map) new e().k(addHeaderParams.toString(), HashMap.class);
        }
        final Map<String, String> map = hashMap;
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            map.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        InterfaceC0818b<G> matchingAPI = ApiClient.getService().matchingAPI(str, map, E.create(z.g("application/json"), jSONObject3.toString()));
        getReferenceId(addHeaderParams);
        new TimingUtils();
        matchingAPI.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.9
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVError hVError;
                HVLogUtils.d(RemoteDataSource.TAG, "makeTextMatchAPICall(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(th);
                if (th.getLocalizedMessage().contains("Certificate pinning")) {
                    hVError = new HVError(15, "Secure connection could not be established.");
                } else {
                    hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred url: " + str));
                }
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logTextMatchAPICallFailed(hVError);
                }
                aPICompletionCallback.onResult(hVError, null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                boolean isSignatureVerified;
                HVLogUtils.d(RemoteDataSource.TAG, "makeTextMatchAPICall(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                if (str.contains("apac")) {
                    RemoteDataSource remoteDataSource = RemoteDataSource.this;
                    isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, uniqueIdentifierForReqIfNeeded, null, null, jSONObject3, remoteDataSource.convertMapToJson(map), true, list);
                } else {
                    RemoteDataSource remoteDataSource2 = RemoteDataSource.this;
                    isSignatureVerified = remoteDataSource2.isSignatureVerified(aPIResponse, uniqueIdentifierForReqIfNeeded, null, null, jSONObject3, remoteDataSource2.convertMapToJson(map), false, list);
                }
                HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                JSONObject responseBody = aPIResponse.getResponseBody();
                if (!zVar.f()) {
                    if (!isSignatureVerified) {
                        aPICompletionCallback.onResult(error, hVResponse);
                        return;
                    } else {
                        if (aPIResponse.getErrorBody() != null) {
                            aPICompletionCallback.onResult(RemoteDataSource.this.getError(aPIResponse.getErrorBody()), hVResponse);
                            return;
                        }
                        return;
                    }
                }
                if (responseBody != null) {
                    if (!isSignatureVerified) {
                        aPICompletionCallback.onResult(error, hVResponse);
                    } else {
                        hVResponse.setApiResult(responseBody);
                        aPICompletionCallback.onResult(null, hVResponse);
                    }
                }
            }
        });
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logTextMatchAPIPost();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void makeValidationAPICall(final Context context, final String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, Boolean bool, List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "makeValidationAPICall() called with: context = [" + context + "], endpoint = [" + str + "], userInput = [" + jSONObject + "], ocrResultFront = [" + jSONObject2 + "], ocrResultBack = [" + jSONObject3 + "], qr = [" + jSONObject4 + "], checkDatabase = [" + bool + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        if (aPICompletionCallback == null) {
            return;
        }
        if (context == null) {
            aPICompletionCallback.onResult(new HVError(6, "Context object is null"), null);
            return;
        }
        HashMap hashMap = new HashMap();
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            hashMap.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject5.put("userInput", jSONObject);
            } catch (Exception e10) {
                printLogs(e10);
                SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e10);
            }
        }
        if (jSONObject2 != null && jSONObject3 != null) {
            jSONObject5.put("ocrResultFront", jSONObject2);
            jSONObject5.put("ocrResultBack", jSONObject3);
        }
        if (jSONObject2 != null && jSONObject3 == null) {
            jSONObject5.put("ocrResult", jSONObject2);
        }
        if (jSONObject4 != null) {
            jSONObject5.put("qrResult", jSONObject4);
        }
        jSONObject5.put("checkDatabase", bool);
        InterfaceC0818b<G> validationAPICall = ApiClient.getService().validationAPICall(str, hashMap, E.create(z.g("application/json"), jSONObject5.toString()));
        final TimingUtils timingUtils = new TimingUtils();
        validationAPICall.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.10
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVError hVError;
                HVLogUtils.d(RemoteDataSource.TAG, "makeValidationAPICall(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(th);
                if (th.getLocalizedMessage().contains("Certificate pinning")) {
                    hVError = new HVError(15, "Secure connection could not be established.");
                } else {
                    hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred url: " + str));
                }
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logValidationAPICallFailed(hVError);
                }
                aPICompletionCallback.onResult(hVError, null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "makeValidationAPICall(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                if (zVar.f()) {
                    try {
                        hVResponse.setApiResult(aPIResponse.getResponseBody());
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logValidationAPISuccess(aPIResponse.getRequestID(), timingUtils.getTimeDifferenceLong().longValue());
                        }
                        aPICompletionCallback.onResult(null, hVResponse);
                        return;
                    } catch (JSONException e11) {
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            try {
                                SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logValidationAPIFailed(e11.getLocalizedMessage(), zVar.b(), aPIResponse.getRequestID());
                            } catch (JSONException unused) {
                                RemoteDataSource.this.logError(e11);
                            }
                        }
                        aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e11), hVResponse);
                        RemoteDataSource.this.printLogs(e11);
                        SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e11);
                        return;
                    }
                }
                try {
                    HVError errorValidationAPI = RemoteDataSource.this.getErrorValidationAPI(aPIResponse.getErrorBody());
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logValidationAPIFailed(errorValidationAPI.getErrorMessage(), errorValidationAPI.getErrorCode(), aPIResponse.getRequestID());
                    }
                    aPICompletionCallback.onResult(errorValidationAPI, hVResponse);
                } catch (JSONException e12) {
                    RemoteDataSource.this.printLogs(e12);
                    SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e12);
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        try {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logValidationAPIFailed(e12.getLocalizedMessage(), zVar.b(), aPIResponse.getRequestID());
                        } catch (JSONException unused2) {
                            RemoteDataSource.this.logError(e12);
                        }
                    }
                    aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e12), hVResponse);
                }
            }
        });
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logValidationAPIPost();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void makeVerifyDocAlignmentCall(final Context context, final String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, final List<Integer> list, final APICompletionCallback aPICompletionCallback) {
        JSONObject jSONObject3 = jSONObject2;
        HVLogUtils.d(TAG, "makeVerifyDocAlignmentCall() called with: context = [" + context + "], endpoint = [" + str + "], documentUri = [" + str2 + "], parameters = [" + jSONObject + "], headers = [" + jSONObject3 + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        if (aPICompletionCallback == null) {
            return;
        }
        if (context == null) {
            aPICompletionCallback.onResult(new HVError(6, "Context object is null"), null);
            return;
        }
        if (str2 == null || str2.trim().isEmpty() || !new File(str2).exists()) {
            aPICompletionCallback.onResult(new HVError(6, "Document file path is invalid"), null);
            return;
        }
        File file = new File(str2);
        A.c c10 = A.c.c("image", file.getName(), E.create(z.g("image/jpeg"), file));
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        JSONObject addHeaderParams = addHeaderParams(jSONObject3);
        final String uniqueIdentifierIfNeeded = SignatureHelper.getUniqueIdentifierIfNeeded(str2, addHeaderParams);
        try {
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && uniqueIdentifierIfNeeded != null) {
                addHeaderParams.put(AppConstants.PARAMS_UUID, uniqueIdentifierIfNeeded);
            }
        } catch (JSONException e10) {
            printLogs(e10);
            SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e10);
        }
        final boolean checkForDataLogging = checkForDataLogging(jSONObject);
        Map<String, E> mapFromJson = getMapFromJson(jSONObject);
        Map<String, String> hashMap = new HashMap<>();
        if (addHeaderParams != null) {
            hashMap = (Map) new e().k(addHeaderParams.toString(), HashMap.class);
        }
        final Map<String, String> map = hashMap;
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            map.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        InterfaceC0818b<G> verifyAlignment = ApiClient.getService().verifyAlignment(str, map, c10, mapFromJson);
        final String referenceId = getReferenceId(addHeaderParams);
        final TimingUtils timingUtils = new TimingUtils();
        verifyAlignment.v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.8
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVError hVError;
                HVLogUtils.d(RemoteDataSource.TAG, "makeVerifyDocAlignmentCall(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(th);
                if (th.getLocalizedMessage().contains("Certificate pinning")) {
                    hVError = new HVError(15, "Secure connection could not be established.");
                } else {
                    hVError = new HVError(12, Utils.getLocalizedErrorMessage(th, "Network error occurred url: " + str));
                }
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logVerifyAlignmentAPICallFailed(hVError);
                }
                aPICompletionCallback.onResult(hVError, null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                String str3;
                String str4;
                HVLogUtils.d(RemoteDataSource.TAG, "makeVerifyDocAlignmentCall(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                HVResponse hVResponse = new HVResponse();
                JSONObject responseBody = aPIResponse.getResponseBody();
                if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && (str4 = uniqueIdentifierIfNeeded) != null) {
                    try {
                        aPIResponse.setRequestSignature(str4);
                    } catch (JSONException e11) {
                        RemoteDataSource.this.logError(e11);
                    }
                }
                RemoteDataSource remoteDataSource = RemoteDataSource.this;
                boolean isSignatureVerified = remoteDataSource.isSignatureVerified(aPIResponse, uniqueIdentifierIfNeeded, null, null, null, remoteDataSource.convertMapToJson(map), false, list);
                HVError error = !isSignatureVerified ? RemoteDataSource.this.getError(AppConstants.SIGNATURE_ERROR, 18) : null;
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                try {
                    str3 = aPIResponse.getRequestID();
                } catch (JSONException e12) {
                    RemoteDataSource.this.logError(e12);
                    str3 = null;
                }
                if (!zVar.f()) {
                    JSONObject errorBody = aPIResponse.getErrorBody();
                    HVError hVError = new HVError();
                    if (isSignatureVerified) {
                        error = errorBody != null ? RemoteDataSource.this.getError(errorBody) : hVError;
                    }
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logVerifyAlignmentAPIFailed(checkForDataLogging, referenceId, error.getErrorMessage(), error.getErrorCode(), str3);
                    }
                    aPICompletionCallback.onResult(error, hVResponse);
                    return;
                }
                if (responseBody != null) {
                    if (!isSignatureVerified) {
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logVerifyAlignmentAPIFailed(checkForDataLogging, referenceId, error.getErrorMessage(), error.getErrorCode(), str3);
                        }
                        aPICompletionCallback.onResult(error, hVResponse);
                    } else {
                        hVResponse.setApiResult(responseBody);
                        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logVerifyAlignmentAPISuccess(checkForDataLogging, referenceId, str3, timingUtils.getTimeDifferenceLong().longValue());
                        }
                        aPICompletionCallback.onResult(null, hVResponse);
                    }
                }
            }
        });
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logVerifyAlignmentAPIPost();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void postAnalyticsData(Context context, String str, Map<String, Object> map) {
        String str2 = TAG;
        HVLogUtils.d(str2, "postAnalyticsData() called with: context = [" + context + "], endpoint = [" + str + "], analyticsData = [" + map + "]");
        HashMap hashMap = new HashMap();
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            hashMap.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("project", "mobile_sdk_analytics");
        hashMap2.put("properties", map);
        JSONObject jSONObject = new JSONObject(hashMap2);
        HVLogUtils.d(str2, "postAnalyticsData: requestBodyJsonObject: " + jSONObject);
        ApiClient.getAnalyticsApiInterface().postAnalyticsData(str, hashMap, E.create(z.g("application/json"), jSONObject.toString())).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.12
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "postAnalyticsData: onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "postAnalyticsData: onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
            }
        });
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void postSensorDataFiles(final Context context, String str, File file) {
        HVLogUtils.d(TAG, "postSensorDataFiles() called with: context = [" + context + "], endpoint = [" + str + "], sensorDataZipFile = [" + file + "]");
        A.c c10 = A.c.c("sensorDataZipFile", file.getName(), E.create(z.g("application/zip"), file));
        HashMap hashMap = new HashMap();
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            hashMap.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            hashMap.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            hashMap.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        ApiClient.getSensorDataInterface().postSensorData(str, hashMap, c10).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.11
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "postSensorDataFiles(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                String str2 = RemoteDataSource.TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure postSensorDataFiles : ");
                sb2.append(Utils.getErrorMessage(th));
                Log.e(str2, sb2.toString());
                FileHelper.delete(new File(context.getFilesDir(), "hv/sensorData"));
                if (SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSensorDataPostFailure(new HVError(2, Utils.getErrorMessage(th)));
                }
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "postSensorDataFiles(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                FileHelper.delete(new File(context.getFilesDir(), "hv/sensorData"));
                if (zVar.f()) {
                    if (SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSensorDataPostSuccessful();
                    }
                } else if (SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSensorDataPostFailure(new HVError(2, "response.isSuccessful() is false"));
                }
            }
        });
    }

    public void processFailureResponse(Context context, Throwable th, APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "processFailureResponse() called with: context = [" + context + "], t = [" + th + "], callback = [" + aPICompletionCallback + "]");
        SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(th);
        aPICompletionCallback.onResult(th.getLocalizedMessage().contains("Certificate pinning") ? new HVError(15, "Secure connection could not be established.") : new HVError(12, Utils.getLocalizedErrorMessage(th, NETWORK_ERROR_OCCURRED)), null);
    }

    public void processResponse(Context context, De.z<G> zVar, String str, List<Integer> list, APICompletionCallback aPICompletionCallback) {
        HVLogUtils.d(TAG, "processResponse() called with: context = [" + context + "], response = [" + zVar + "], uuid = [" + str + "], allowedStatusCodes = [" + list + "], callback = [" + aPICompletionCallback + "]");
        APIResponse aPIResponse = new APIResponse(zVar);
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && str != null) {
            try {
                aPIResponse.setRequestSignature(str);
            } catch (JSONException e10) {
                logError(e10);
            }
        }
        boolean isSignatureVerified = isSignatureVerified(aPIResponse, str, null, null, null, null, false, list);
        HVError error = !isSignatureVerified ? getError(AppConstants.SIGNATURE_ERROR, 18) : null;
        HVResponse hVResponse = new HVResponse();
        hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
        hVResponse.setStatusCode(aPIResponse.getStatusCode());
        hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
        JSONObject responseBody = aPIResponse.getResponseBody();
        if (!zVar.f()) {
            if (!isSignatureVerified) {
                aPICompletionCallback.onResult(error, hVResponse);
                return;
            } else {
                if (aPIResponse.getErrorBody() != null) {
                    aPICompletionCallback.onResult(getError(aPIResponse.getErrorBody()), hVResponse);
                    return;
                }
                return;
            }
        }
        if (responseBody != null) {
            if (!isSignatureVerified) {
                aPICompletionCallback.onResult(error, hVResponse);
            } else {
                hVResponse.setApiResult(responseBody);
                aPICompletionCallback.onResult(null, hVResponse);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void saveConsent(Consent consent, final APICompletionCallback aPICompletionCallback) {
        new HashMap();
        Map<String, String> map = (Map) new e().k(addHeaderParams(new JSONObject()).toString(), HashMap.class);
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken() == null || HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken().isEmpty()) {
            map.put("appId", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId());
            map.put("appKey", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey());
        } else {
            map.put("Authorization", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAccessToken());
        }
        map.put("Content-Type", "application/json");
        try {
            if (!SPHelper.getTransactionID().trim().isEmpty() && !map.containsKey("transactionId")) {
                map.put("transactionId", SPHelper.getTransactionID());
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
        ApiClient.getThomasAPIService().saveConsent("https://ind-thomas.hyperverge.co/v1/saveConsentConfig", map, E.create(z.g("application/json"), new e().t(Collections.singletonMap("consent", consent)))).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.17
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<G> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "saveConsent(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                Log.d(RemoteDataSource.TAG, Utils.getErrorMessage(th));
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(th);
                aPICompletionCallback.onResult(new HVError(12, Utils.getLocalizedErrorMessage(th, RemoteDataSource.NETWORK_ERROR_OCCURRED)), null);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<G> interfaceC0818b, De.z<G> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "saveConsent(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                APIResponse aPIResponse = new APIResponse(zVar);
                HVResponse hVResponse = new HVResponse();
                hVResponse.setApiHeaders(aPIResponse.getResponseHeaders());
                hVResponse.setStatusCode(aPIResponse.getStatusCode());
                hVResponse.setStatusMessage(aPIResponse.getStatusMessage());
                if (zVar.f()) {
                    try {
                        hVResponse.setApiResult(aPIResponse.getResponseBody());
                        aPICompletionCallback.onResult(null, hVResponse);
                        return;
                    } catch (Exception e11) {
                        Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(e11));
                        aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e11), hVResponse);
                        return;
                    }
                }
                try {
                    aPICompletionCallback.onResult(RemoteDataSource.this.getError(aPIResponse.getErrorBody()), hVResponse);
                } catch (Exception e12) {
                    Log.e(RemoteDataSource.TAG, Utils.getErrorMessage(e12));
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                    aPICompletionCallback.onResult(RemoteDataSource.this.getErrorFromException(e12), hVResponse);
                }
            }
        });
    }

    JSONObject setCustomHeaders(v vVar, String str) {
        HVLogUtils.d(TAG, "setCustomHeaders() called with: headers = [" + vVar + "], uuid = [" + str + "]");
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < vVar.size(); i10++) {
            try {
                String h10 = vVar.h(i10);
                String v10 = vVar.v(i10);
                if (h10.toLowerCase().startsWith("x-hv-")) {
                    jSONObject.put(h10, v10);
                }
                if (h10.equalsIgnoreCase("x-request-id")) {
                    jSONObject.put(AppConstants.HV_REQUEST_ID, v10);
                }
                if (h10.equalsIgnoreCase("x-response-signature")) {
                    jSONObject.put("X-HV-Response-Signature", v10);
                }
            } catch (Exception e10) {
                printLogs(e10);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                    return null;
                }
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                return null;
            }
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() && str != null) {
            jSONObject.put("X-HV-Request-Signature", str);
        }
        return jSONObject;
    }

    @Override // co.hyperverge.hypersnapsdk.data.DataSource
    public void verifyPair(String str, String str2, final DataSource.NetworkCallback networkCallback) {
        HVLogUtils.d(TAG, "verifyPair() called with: imageFilePath1 = [" + str + "], imageFilePath2 = [" + str2 + "], callback = [" + networkCallback + "]");
        File file = new File(str);
        A.c c10 = A.c.c("image1", file.getName(), E.create(z.g("image/jpeg"), file));
        File file2 = new File(str2);
        ApiClient.getDocsService().verifyPair(SDKInternalConfig.getInstance().getVerifyPairUri(), HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId(), HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppKey(), c10, A.c.c("image2", file2.getName(), E.create(z.g("image/jpeg"), file2)), E.create(z.g("text/plain"), "selfie")).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.RemoteDataSource.4
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<GestureResponse> interfaceC0818b, Throwable th) {
                HVLogUtils.d(RemoteDataSource.TAG, "verifyPair(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                networkCallback.onFailure(12, Utils.getLocalizedErrorMessage(th, RemoteDataSource.NETWORK_ERROR_OCCURRED));
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<GestureResponse> interfaceC0818b, De.z<GestureResponse> zVar) {
                HVLogUtils.d(RemoteDataSource.TAG, "verifyPair(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                GestureResponse gestureResponse = (GestureResponse) zVar.a();
                gestureResponse.setHttpStatusCode(Integer.valueOf(zVar.b()));
                gestureResponse.setStatusMessage(zVar.g());
                networkCallback.onSuccess(gestureResponse);
            }
        });
    }

    public HVError getError(String str, int i10) {
        HVLogUtils.d(TAG, "getError() called with: errorMessage = [" + str + "], errorCode = [" + i10 + "]");
        return new HVError(i10, str);
    }
}
