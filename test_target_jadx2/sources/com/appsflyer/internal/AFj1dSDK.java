package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFj1dSDK {
    public static byte[] AFAdRevenueData(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e10);
            return null;
        }
    }

    public static String getCurrencyIso4217Code(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return getCurrencyIso4217Code(messageDigest.digest());
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e10);
            return null;
        }
    }

    public static String getMonetizationNetwork(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return getCurrencyIso4217Code(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, true);
            return e10.getMessage();
        }
    }

    public static long getRevenue(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return -1L;
        }
        if (bArr.length > 8) {
            bArr = Arrays.copyOfRange(bArr, 0, 8);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(bArr);
        allocate.flip();
        return allocate.getLong();
    }

    private static String getCurrencyIso4217Code(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(Integer.toString((b10 & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES, 16).substring(1));
        }
        return sb2.toString();
    }

    public static boolean getCurrencyIso4217Code(Map<String, Object> map, String[] strArr, AFc1oSDK aFc1oSDK) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String component4 = AFc1oSDK.component4();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new JSONObject(map));
        sb2.append(component4);
        return getMonetizationNetwork(sb2.toString(), AFb1kSDK.getCurrencyIso4217Code(aFc1oSDK.getMediationNetwork)).equals(str2);
    }
}
