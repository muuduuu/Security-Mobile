package co.hyperverge.hypersnapsdk.data.remote;

import Td.v;
import android.util.Base64;
import android.util.Log;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.service.HVSignatureService;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SignatureHelper {
    private static final String TAG = "co.hyperverge.hypersnapsdk.data.remote.SignatureHelper";
    private static final char[] hexArray = "0123456789abcdef".toCharArray();

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = hexArray;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    static String computeHMAC256Hashing(String str, String str2) {
        HVLogUtils.d(TAG, "computeHMAC256Hashing() called with: uuid = [" + str + "], responseString = [" + str2 + "]");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = StandardCharsets.UTF_8;
            mac.init(new SecretKeySpec(str.getBytes(charset), "HmacSHA256"));
            return bytesToHex(mac.doFinal(str2.getBytes(charset)));
        } catch (Exception e10) {
            String str3 = TAG;
            HVLogUtils.e(str3, "computeHMAC256Hashing(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str3, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    static String decryptUsingRSA(String str) {
        HVLogUtils.d(TAG, "decryptUsingRSA() called with: checksum = [" + str + "]");
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDFusF4/wCAVrq6m0uomaGHD9O2YpwBZulbyaSb5s8WMyyy/xT4zMGrghJEsQV8REAH9pAqZk06YvkT01fMP8mTr9uUwW3CngVdjgrxGKfL1YZACS93SfvAXXX95w/EYkUiDr3sby7YV7NaqlcmTeRFDzJLFRPkDLxzAj+l3QCdkQIDAQAB", 0)));
            byte[] decode = Base64.decode(str, 0);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, generatePublic);
            return new String(cipher.doFinal(decode));
        } catch (Exception e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "initErrorMonitoring(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    static String fetchChecksumFromHeader(v vVar) {
        HVLogUtils.d(TAG, "fetchChecksumFromHeader() called with: headers = [" + vVar + "]");
        if (vVar == null) {
            return null;
        }
        return vVar.c("X-Response-Signature");
    }

    private static InputStream getFileInputStream(String str) {
        HVLogUtils.d(TAG, "getFileInputStream() called with: file = [" + str + "]");
        try {
            return new FileInputStream(str);
        } catch (FileNotFoundException e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "getFileInputStream(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, "Exception while getting FileInputStream", e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public static String getHashOfImage(String str, String str2) {
        InputStream fileInputStream;
        HVLogUtils.d(TAG, "getHashOfImage() called with: file = [" + str + "], algo = [" + str2 + "]");
        MessageDigest messageDigest = getMessageDigest(str2);
        if (messageDigest == null || (fileInputStream = getFileInputStream(str)) == null) {
            return null;
        }
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e10) {
                        HVLogUtils.e(TAG, "getHashOfImage(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                        Log.e(TAG, "Exception on closing SHA_256 input stream", e10);
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                        }
                    }
                    throw th;
                }
            } catch (Exception e11) {
                String str3 = TAG;
                HVLogUtils.e(str3, "getHashOfImage(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
                Log.e(str3, "Exception on closing SHA_256 input stream", e11);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                }
                try {
                    fileInputStream.close();
                } catch (IOException e12) {
                    HVLogUtils.e(TAG, "getHashOfImage(): exception = [" + Utils.getErrorMessage(e12) + "]", e12);
                    Log.e(TAG, "Exception on closing SHA_256 input stream", e12);
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                    }
                }
                return null;
            }
        }
        String sb2 = getHexRepresentation(messageDigest.digest()).toString();
        try {
            fileInputStream.close();
        } catch (IOException e13) {
            HVLogUtils.e(TAG, "getHashOfImage(): exception = [" + Utils.getErrorMessage(e13) + "]", e13);
            Log.e(TAG, "Exception on closing SHA_256 input stream", e13);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e13);
            }
        }
        return sb2;
    }

    private static StringBuilder getHexRepresentation(byte[] bArr) {
        HVLogUtils.d(TAG, "getHexRepresentation() called with: sha256Sum = [" + bArr + "]");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2;
    }

    private static MessageDigest getMessageDigest(String str) {
        HVLogUtils.d(TAG, "getMessageDigest() called with: algo = [" + str + "]");
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            HVLogUtils.e(TAG, "getMessageDigest(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, "Exception while getting digest", e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public static String getSha1HashOfRequest(String str) {
        TreeMap<String, Object> treeMap;
        HVLogUtils.d(TAG, "getSha1HashOfRequest() called with: requestStr = [" + str + "]");
        new TimingUtils();
        try {
            treeMap = HVSignatureService.convertJSONObjToMap(new JSONObject(str));
        } catch (JSONException e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "getSha1HashOfRequest(): convertJSONObjToMap exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            treeMap = null;
        }
        String sortJSONKeysAlphabetically = HVSignatureService.sortJSONKeysAlphabetically(treeMap);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(sortJSONKeysAlphabetically.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e11) {
            String str3 = TAG;
            HVLogUtils.e(str3, "getSha1HashOfRequest(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            Log.e(str3, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return BuildConfig.FLAVOR;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            return BuildConfig.FLAVOR;
        }
    }

    public static String getSha256Hash(byte[] bArr) {
        HVLogUtils.d(TAG, "getSha256Hash() called with: bytes = [" + bArr + "]");
        return new String(MessageDigest.getInstance("SHA-256").digest(bArr), StandardCharsets.UTF_8);
    }

    public static String getUniqueIdentifierForReqIfNeeded(String str) {
        HVLogUtils.d(TAG, "getUniqueIdentifierForReqIfNeeded() called with: request = [" + str + "]");
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature()) {
            return getSha1HashOfRequest(str);
        }
        return null;
    }

    public static String getUniqueIdentifierIfNeeded(String str, String str2, JSONObject jSONObject) {
        HVLogUtils.d(TAG, "getUniqueIdentifierIfNeeded() called with: file1 = [" + str + "], file2 = [" + str2 + "], headers = [" + jSONObject + "]");
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature()) {
            return null;
        }
        if (jSONObject.has(AppConstants.PARAMS_UUID)) {
            try {
                return jSONObject.getString(AppConstants.PARAMS_UUID);
            } catch (JSONException e10) {
                String str3 = TAG;
                HVLogUtils.e(str3, "getUniqueIdentifierIfNeeded(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(str3, Utils.getErrorMessage(e10));
            }
        }
        String hashOfImage = getHashOfImage(str, HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getSignatureMethod());
        String hashOfImage2 = getHashOfImage(str2, HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getSignatureMethod());
        if (hashOfImage == null || hashOfImage2 == null) {
            return null;
        }
        return hashOfImage + hashOfImage2;
    }

    static boolean validateSignature(String str, String str2, String str3) {
        String str4 = TAG;
        HVLogUtils.d(str4, "validateSignature() called with: responseString = [" + str + "], checksum = [" + str2 + "], uuid = [" + str3 + "]");
        boolean z10 = false;
        if (str != null && str2 != null) {
            String decryptUsingRSA = decryptUsingRSA(str2);
            String computeHMAC256Hashing = computeHMAC256Hashing(str3, str);
            if (decryptUsingRSA != null && computeHMAC256Hashing != null && decryptUsingRSA.equals(computeHMAC256Hashing)) {
                z10 = true;
            }
            HVLogUtils.d(str4, "validateSignature() returned: " + z10);
        }
        return z10;
    }

    static boolean validateSignatureIfNeeded(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String str2 = TAG;
        HVLogUtils.d(str2, "validateSignatureIfNeeded() called with: responseString = [" + jSONObject + "], headers = [" + jSONObject2 + "], uuid = [" + str + "]");
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() || str == null) {
            return true;
        }
        boolean validateSignature = validateSignature(jSONObject.toString(), fetchChecksumFromHeader(jSONObject2), str);
        HVLogUtils.d(str2, "validateSignatureIfNeededAPAC() returned: " + validateSignature);
        return validateSignature;
    }

    static boolean validateSignatureIfNeededAPAC(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        HVLogUtils.d(TAG, "validateSignatureIfNeededAPAC() called with: responseObject = [" + jSONObject + "], headers = [" + jSONObject2 + "], uuid = [" + str + "]");
        String sortJSONKeysAlphabetically = HVSignatureService.sortJSONKeysAlphabetically(HVSignatureService.convertJSONObjToMap(jSONObject));
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() || str == null) {
            return true;
        }
        return validateSignature(sortJSONKeysAlphabetically, fetchChecksumFromHeader(jSONObject2), str);
    }

    static String fetchChecksumFromHeader(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "fetchChecksumFromHeader() called with: headers = [" + jSONObject + "]");
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("X-Response-Signature")) {
                str = jSONObject.getString("X-Response-Signature");
            } else if (jSONObject.has("X-HV-Response-Signature")) {
                str = jSONObject.getString("X-HV-Response-Signature");
            }
        } catch (JSONException e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "fetchChecksumFromHeader(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
        }
        HVLogUtils.d(TAG, "fetchChecksumFromHeader() returned: " + str);
        return str;
    }

    static boolean validateSignatureIfNeeded(String str, v vVar, String str2) {
        String str3 = TAG;
        HVLogUtils.d(str3, "validateSignatureIfNeeded() called with: responseString = [" + str + "], headers = [" + vVar + "], uuid = [" + str2 + "]");
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() || str2 == null) {
            return true;
        }
        boolean validateSignature = validateSignature(str, fetchChecksumFromHeader(vVar), str2);
        HVLogUtils.d(str3, "validateSignatureIfNeededAPAC() returned: " + validateSignature);
        return validateSignature;
    }

    static boolean validateSignatureIfNeededAPAC(String str, v vVar, String str2) {
        TreeMap<String, Object> treeMap;
        HVLogUtils.d(TAG, "validateSignatureIfNeededAPAC() called with: responseString = [" + str + "], headers = [" + vVar + "], uuid = [" + str2 + "]");
        try {
            treeMap = HVSignatureService.convertJSONObjToMap(new JSONObject(str));
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            treeMap = null;
        }
        String sortJSONKeysAlphabetically = HVSignatureService.sortJSONKeysAlphabetically(treeMap);
        if (sortJSONKeysAlphabetically != null) {
            str = sortJSONKeysAlphabetically;
        }
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature() || str2 == null) {
            return true;
        }
        boolean validateSignature = validateSignature(str, fetchChecksumFromHeader(vVar), str2);
        HVLogUtils.d(TAG, "validateSignatureIfNeededAPAC() returned: " + validateSignature);
        return validateSignature;
    }

    public static String getUniqueIdentifierIfNeeded(String str, JSONObject jSONObject) {
        HVLogUtils.d(TAG, "getUniqueIdentifierIfNeeded() called with: file = [" + str + "], headers = [" + jSONObject + "]");
        if (!HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature()) {
            return null;
        }
        if (jSONObject.has(AppConstants.PARAMS_UUID)) {
            try {
                return jSONObject.getString(AppConstants.PARAMS_UUID);
            } catch (JSONException e10) {
                String str2 = TAG;
                HVLogUtils.e(str2, "getUniqueIdentifierIfNeeded(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(str2, Utils.getErrorMessage(e10));
            }
        }
        return getHashOfImage(str, HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getSignatureMethod());
    }
}
