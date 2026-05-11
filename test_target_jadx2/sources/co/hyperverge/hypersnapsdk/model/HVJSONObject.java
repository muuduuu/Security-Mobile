package co.hyperverge.hypersnapsdk.model;

import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVJSONObject extends JSONObject implements Serializable {
    private static final String TAG = "co.hyperverge.hypersnapsdk.model.HVJSONObject";

    public HVJSONObject() {
    }

    public boolean hasAndNotEmpty(String str) {
        try {
            if (!has(str)) {
                return false;
            }
            if (get(str) instanceof String) {
                return !((String) get(str)).trim().isEmpty();
            }
            return true;
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            return false;
        }
    }

    public HVJSONObject(String str) {
        super(str);
    }
}
