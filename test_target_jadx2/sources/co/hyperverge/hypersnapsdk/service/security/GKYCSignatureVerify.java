package co.hyperverge.hypersnapsdk.service.security;

import android.util.Base64;
import android.util.Log;
import co.hyperverge.hypersnapsdk.data.remote.SignatureHelper;
import co.hyperverge.hypersnapsdk.service.HVSignatureService;
import co.hyperverge.hypersnapsdk.service.security.HVSecurity;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GKYCSignatureVerify {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.security.GKYCSignatureVerify";
    private JSONObject requestBody;
    private JSONObject requestHeaders;
    private JSONObject requestQuery;
    private JSONObject responseBody;
    private JSONObject responseHeaders;
    private HashMap<String, String> tagFileUriMap;

    public static class GKYCSignatureVerifyBuilder {
        private JSONObject requestBody;
        private JSONObject requestHeaders;
        private JSONObject requestQuery;
        private JSONObject responseBody;
        private JSONObject responseHeaders;
        private HashMap<String, String> tagFileUriMap;

        GKYCSignatureVerifyBuilder() {
        }

        public GKYCSignatureVerify build() {
            return new GKYCSignatureVerify(this.requestQuery, this.tagFileUriMap, this.requestBody, this.requestHeaders, this.responseBody, this.responseHeaders);
        }

        public GKYCSignatureVerifyBuilder requestBody(JSONObject jSONObject) {
            this.requestBody = jSONObject;
            return this;
        }

        public GKYCSignatureVerifyBuilder requestHeaders(JSONObject jSONObject) {
            this.requestHeaders = jSONObject;
            return this;
        }

        public GKYCSignatureVerifyBuilder requestQuery(JSONObject jSONObject) {
            this.requestQuery = jSONObject;
            return this;
        }

        public GKYCSignatureVerifyBuilder responseBody(JSONObject jSONObject) {
            this.responseBody = jSONObject;
            return this;
        }

        public GKYCSignatureVerifyBuilder responseHeaders(JSONObject jSONObject) {
            this.responseHeaders = jSONObject;
            return this;
        }

        public GKYCSignatureVerifyBuilder tagFileUriMap(HashMap<String, String> hashMap) {
            this.tagFileUriMap = hashMap;
            return this;
        }

        public String toString() {
            return "GKYCSignatureVerify.GKYCSignatureVerifyBuilder(requestQuery=" + this.requestQuery + ", tagFileUriMap=" + this.tagFileUriMap + ", requestBody=" + this.requestBody + ", requestHeaders=" + this.requestHeaders + ", responseBody=" + this.responseBody + ", responseHeaders=" + this.responseHeaders + ")";
        }
    }

    public GKYCSignatureVerify(JSONObject jSONObject, HashMap<String, String> hashMap, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.requestQuery = jSONObject;
        this.tagFileUriMap = hashMap;
        this.requestBody = jSONObject2;
        this.requestHeaders = jSONObject3;
        this.responseBody = jSONObject4;
        this.responseHeaders = jSONObject5;
    }

    public static GKYCSignatureVerifyBuilder builder() {
        return new GKYCSignatureVerifyBuilder();
    }

    private String createClientHmacHash(String str, String str2) {
        HVLogUtils.d(TAG, "createClientHmacHash() called with: hashInput = [" + str + "], secret = [" + str2 + "]");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = StandardCharsets.UTF_8;
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA256"));
            return SignatureHelper.bytesToHex(mac.doFinal(str.getBytes(charset)));
        } catch (Exception e10) {
            String str3 = TAG;
            HVLogUtils.e(str3, "createClientHmacHash(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str3, Utils.getErrorMessage(e10));
            return null;
        }
    }

    private String createHashInput() {
        HVLogUtils.d(TAG, "createHashInput() called");
        String sortJsonKeys = sortJsonKeys(this.requestQuery);
        return sortedHashOfImages() + sortJsonKeys + sortJsonKeys(this.requestBody) + sortJsonKeys(this.responseBody);
    }

    private PublicKey getPublicKey() {
        HVLogUtils.d(TAG, "getPublicKey() called");
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA7hhIXqpCbIpfdilqLKVQR4wC/T7yUPDsn+/SgCcbv+ANi+zAHR4sQh/q4SvQhOdlPk81uk93Slu+2fr9jG4P3toVYygKM92mYxnXia/NpFLviJg+0iHoIywqGjpa5YGU/7x4IfklkO0/BdCerq3+PrzepD9FI0LnVxKaoki3QpgTb+HSg9IIgWd+alj8YFcRklvwzySZN0ACGrKfyOsb8cxJXn9+n5mR/EDOrG9ET0yjW4d9eonP7R+3yx0h0Ihb0EBoLAUI0u0C9oL07j23+ZArbLjQH4dKHiXwPlmTdjTyQk4UyXHiJgUPmeCQw6YjTOj+ZsgIyEQSSmiaETPG81voIAuGMaWvRF4gTmzCF9cpb1JOubk/2Kp/39ow9av8NxxeI4XmlUVV8ogaC6WnLTytTATRZSqoyHV36R391vO6tQ3KC7/EAin+0RmyFkKbjBWXMS5I+GhSRkvXz9gMgGsfCgAsId+aE85chReUK92TX+/Q22p7a7DOwS+4mQqndV45GjgSJiTeSkqEcMre6VtG+NdgDfV0WMvOAr+jI8WpKXpuOOBIhswiG0wcroT3Bya2FLvGzMfKWm5Q8IE4gfhEzZmJTLYg7deHGjMV+3o/nM+BMswNpVPgnmjGy00VfzH1O5pq2QiXTJrFAqAAY70Ri/xxTdmnXvh+W83NH8MCAwEAAQ==", 0)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            String str = TAG;
            HVLogUtils.e(str, "getPublicKey(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            return null;
        }
    }

    private String getSecret() {
        HVLogUtils.d(TAG, "getSecret() called");
        String str = BuildConfig.FLAVOR;
        try {
            JSONObject jSONObject = this.requestHeaders;
            if (jSONObject == null) {
                JSONObject jSONObject2 = this.responseHeaders;
                if (jSONObject2 != null) {
                    if (jSONObject2.has(AppConstants.HV_REQUEST_ID)) {
                        str = this.responseHeaders.getString(AppConstants.HV_REQUEST_ID);
                    } else if (this.responseHeaders.has("x-hv-request-id")) {
                        str = this.responseHeaders.getString("x-hv-request-id");
                    }
                } else if (this.responseBody.has("metadata")) {
                    JSONObject jSONObject3 = this.responseBody.getJSONObject("metadata");
                    str = jSONObject3.has("transactionId") ? jSONObject3.getString("transactionId") : jSONObject3.getString("requestId");
                }
            } else if (jSONObject.has("transactionId")) {
                str = this.requestHeaders.getString("transactionId");
            }
        } catch (JSONException e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "getSecret(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
        }
        return str;
    }

    private String sortJsonKeys(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "sortJsonKeys() called with: jsonObject = [" + jSONObject + "]");
        if (jSONObject == null || jSONObject.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        try {
            return HVSignatureService.sortJSONKeysAlphabetically(HVSignatureService.convertJSONObjToMap(jSONObject));
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return BuildConfig.FLAVOR;
        }
    }

    private String sortedHashOfImages() {
        HVLogUtils.d(TAG, "sortedHashOfImages() called");
        TreeMap treeMap = new TreeMap();
        for (String str : this.tagFileUriMap.keySet()) {
            treeMap.put(str, SignatureHelper.getHashOfImage(this.tagFileUriMap.get(str), "MD5"));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        return sb2.toString();
    }

    public boolean verify(String str) {
        HVLogUtils.d(TAG, "verify() called with: serverHash = [" + str + "]");
        try {
            return HVSecurity.builder().publicKey(getPublicKey()).signatureAlgorithm(HVSecurity.SignatureAlgorithm.SHA256withRSA).data(createClientHmacHash(createHashInput(), getSecret())).build().verifySignature(str);
        } catch (HVSecurityException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "verify() with: serverHash = [" + str + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            return false;
        }
    }
}
