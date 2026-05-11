package co.hyperverge.hypersnapsdk.service.qr;

import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.objects.AadhaarQRResponse;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AadhaarQRParser {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.qr.AadhaarQRParser";

    public AadhaarQRResponse parseAadhaarQR(String str) {
        HVLogUtils.d(TAG, "parseAadhaarQR() called with: rawString = [" + str + "]");
        e eVar = new e();
        return str.matches("\\d*") ? (AadhaarQRResponse) eVar.k(Utils.secureQRDataToJSON(str), AadhaarQRResponse.class) : ((AadhaarQrData) eVar.k(Utils.XMLToJSON(str), AadhaarQrData.class)).aadhaarQRResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject parseAadhaarQRData(String str) {
        JSONObject jSONObject;
        Exception e10;
        HVLogUtils.d(TAG, "parseAadhaarQRData() called with: xmlString = [" + str + "]");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2 = new QRDataParser(new JSONObject(Utils.XMLToJSON(str))).getFixedKeyMap();
        } catch (Exception e11) {
            jSONObject = jSONObject2;
            e10 = e11;
        }
        if (jSONObject2 == null) {
            jSONObject = new JSONObject();
            try {
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logQRParseFailed();
                }
            } catch (Exception e12) {
                e10 = e12;
                String str2 = TAG;
                HVLogUtils.e(str2, "parseAadhaarQRData(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(str2, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
                jSONObject2 = jSONObject;
                if (jSONObject2 != null) {
                }
                return jSONObject2;
            }
            jSONObject2 = jSONObject;
        }
        if (jSONObject2 != null) {
            try {
                jSONObject2.put("value", str);
            } catch (JSONException e13) {
                String str3 = TAG;
                HVLogUtils.e(str3, "parseAadhaarQRData(): exception = [" + Utils.getErrorMessage(e13) + "]", e13);
                Log.e(str3, Utils.getErrorMessage(e13));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e13);
                }
            }
        }
        return jSONObject2;
    }
}
