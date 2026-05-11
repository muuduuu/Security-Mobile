package co.hyperverge.hypersnapsdk.service.qr;

import android.util.Log;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;
import u5.C4870a;

/* loaded from: classes.dex */
public class QRDataParser {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.qr.QRDataParser";
    JSONObject qrJSONObject;

    public QRDataParser(JSONObject jSONObject) {
        this.qrJSONObject = jSONObject;
    }

    public List<String> MASTER_SET_OCR_KEYS() {
        HVLogUtils.d(TAG, "MASTER_SET_OCR_KEYS() called");
        ArrayList arrayList = new ArrayList();
        arrayList.add("name");
        arrayList.add("signature");
        arrayList.add("full_address");
        arrayList.add("gender");
        arrayList.add("dob");
        arrayList.add("aadhaar");
        arrayList.add("district");
        arrayList.add("care_of");
        arrayList.add("house_number");
        arrayList.add("landmark");
        arrayList.add("locality");
        arrayList.add("pin");
        arrayList.add("po");
        arrayList.add(Keys.STATE);
        arrayList.add("street");
        arrayList.add("subdist");
        arrayList.add("city");
        arrayList.add("yob");
        arrayList.add("gname");
        return arrayList;
    }

    public LinkedHashMap<String, String> PRINTBARCODE_FIELD_KEY_TO_NAME_MAP() {
        HVLogUtils.d(TAG, "PRINTBARCODE_FIELD_KEY_TO_NAME_MAP() called");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name", "name");
        linkedHashMap.put("gender", "gender");
        linkedHashMap.put("dob", "dob");
        linkedHashMap.put("uid", "aadhaar");
        linkedHashMap.put("dist", "district");
        linkedHashMap.put("co", "care_of");
        linkedHashMap.put("house", "house_number");
        linkedHashMap.put("lm", "landmark");
        linkedHashMap.put("loc", "locality");
        linkedHashMap.put("pc", "pin");
        linkedHashMap.put("po", "po");
        linkedHashMap.put(Keys.STATE, Keys.STATE);
        linkedHashMap.put("street", "street");
        linkedHashMap.put("subdist", "subdist");
        linkedHashMap.put("vtc", "city");
        linkedHashMap.put("yob", "yob");
        linkedHashMap.put("gname", "gname");
        return linkedHashMap;
    }

    public LinkedHashMap<String, String> QDB_FIELD_KEY_TO_NAME_MAP() {
        HVLogUtils.d(TAG, "QDB_FIELD_KEY_TO_NAME_MAP() called");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("n", "name");
        linkedHashMap.put("u", "aadhaar");
        linkedHashMap.put("g", "gender");
        linkedHashMap.put("d", "dob");
        linkedHashMap.put("s", "signature");
        linkedHashMap.put(C4870a.f43493a, "full_address");
        linkedHashMap.put("x", "unknown");
        return linkedHashMap;
    }

    public JSONObject getFixedKeyMap() {
        HVLogUtils.d(TAG, "getFixedKeyMap() called");
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap<String, String> keyMap = getKeyMap();
        if (keyMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(MASTER_SET_OCR_KEYS());
        for (String str : keyMap.keySet()) {
            if (this.qrJSONObject.has(str)) {
                try {
                    jSONObject.put(keyMap.get(str), this.qrJSONObject.getString(str));
                } catch (Exception e10) {
                    Log.e(TAG, Utils.getErrorMessage(e10));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                    }
                }
            } else {
                try {
                    jSONObject.put(keyMap.get(str), BuildConfig.FLAVOR);
                } catch (Exception e11) {
                    Log.e(TAG, Utils.getErrorMessage(e11));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                    }
                }
            }
            arrayList.remove(keyMap.get(str));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                jSONObject.put((String) it.next(), BuildConfig.FLAVOR);
            } catch (Exception e12) {
                Log.e(TAG, Utils.getErrorMessage(e12));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                }
            }
        }
        return jSONObject;
    }

    public LinkedHashMap<String, String> getKeyMap() {
        HVLogUtils.d(TAG, "getKeyMap() called");
        if (this.qrJSONObject.has("QDB")) {
            try {
                this.qrJSONObject = this.qrJSONObject.getJSONObject("QDB");
            } catch (JSONException e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            return QDB_FIELD_KEY_TO_NAME_MAP();
        }
        if (!this.qrJSONObject.has("PrintLetterBarcodeData")) {
            if (!this.qrJSONObject.has("QDA")) {
                return null;
            }
            try {
                this.qrJSONObject = this.qrJSONObject.getJSONObject("QDA");
            } catch (JSONException e11) {
                Log.e(TAG, Utils.getErrorMessage(e11));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                }
            }
            return QDB_FIELD_KEY_TO_NAME_MAP();
        }
        try {
            this.qrJSONObject = this.qrJSONObject.getJSONObject("PrintLetterBarcodeData");
        } catch (JSONException e12) {
            String str = TAG;
            HVLogUtils.e(str, "getKeyMap(): exception = [" + Utils.getErrorMessage(e12) + "]", e12);
            Log.e(str, Utils.getErrorMessage(e12));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
            }
        }
        return PRINTBARCODE_FIELD_KEY_TO_NAME_MAP();
    }

    public QRDataParser() {
    }
}
