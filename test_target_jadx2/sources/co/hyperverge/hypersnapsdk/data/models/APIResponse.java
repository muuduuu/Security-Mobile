package co.hyperverge.hypersnapsdk.data.models;

import De.z;
import Td.G;
import Td.v;
import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class APIResponse {
    private static final String TAG = "co.hyperverge.hypersnapsdk.data.models.APIResponse";
    private JSONObject errorBody;
    private JSONObject responseBody;
    private JSONObject responseHeaders;
    private Integer statusCode;
    private String statusMessage;

    public APIResponse(z<G> zVar) {
        this(zVar.b(), zVar.g(), (G) zVar.a(), zVar.d(), zVar.e());
    }

    private void logError(Exception exc) {
        Log.e(TAG, Utils.getErrorMessage(exc));
        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(exc);
        }
    }

    private JSONObject setCustomHeaders(v vVar) {
        JSONObject jSONObject = new JSONObject();
        Map u10 = vVar.u();
        for (String str : vVar.j()) {
            try {
                if (str.equalsIgnoreCase("x-request-id") && vVar.c(str) != null && !u10.containsKey(AppConstants.HV_REQUEST_ID)) {
                    jSONObject.put(AppConstants.HV_REQUEST_ID, vVar.c(str));
                } else if (!str.equalsIgnoreCase("x-response-signature") || vVar.c(str) == null || u10.containsKey("X-HV-Response-Signature")) {
                    jSONObject.put(str, vVar.c(str));
                } else {
                    jSONObject.put("X-HV-Response-Signature", vVar.c(str));
                }
            } catch (JSONException e10) {
                logError(e10);
            }
        }
        return jSONObject;
    }

    public void addHeader(String str, String str2) {
        this.responseHeaders.put(str, str2);
    }

    public void addRawErrorBody() {
        this.responseHeaders.put(AppConstants.RAW_RESPONSE, this.errorBody.toString());
    }

    public void addRawResponseBody() {
        this.responseHeaders.put(AppConstants.RAW_RESPONSE, this.responseBody.toString());
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof APIResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof APIResponse)) {
            return false;
        }
        APIResponse aPIResponse = (APIResponse) obj;
        if (!aPIResponse.canEqual(this)) {
            return false;
        }
        Integer statusCode = getStatusCode();
        Integer statusCode2 = aPIResponse.getStatusCode();
        if (statusCode != null ? !statusCode.equals(statusCode2) : statusCode2 != null) {
            return false;
        }
        JSONObject responseBody = getResponseBody();
        JSONObject responseBody2 = aPIResponse.getResponseBody();
        if (responseBody != null ? !responseBody.equals(responseBody2) : responseBody2 != null) {
            return false;
        }
        JSONObject responseHeaders = getResponseHeaders();
        JSONObject responseHeaders2 = aPIResponse.getResponseHeaders();
        if (responseHeaders != null ? !responseHeaders.equals(responseHeaders2) : responseHeaders2 != null) {
            return false;
        }
        JSONObject errorBody = getErrorBody();
        JSONObject errorBody2 = aPIResponse.getErrorBody();
        if (errorBody != null ? !errorBody.equals(errorBody2) : errorBody2 != null) {
            return false;
        }
        String statusMessage = getStatusMessage();
        String statusMessage2 = aPIResponse.getStatusMessage();
        return statusMessage != null ? statusMessage.equals(statusMessage2) : statusMessage2 == null;
    }

    public JSONObject getErrorBody() {
        return this.errorBody;
    }

    public String getHeaderValue(String str) {
        return this.responseHeaders.getString(str);
    }

    public String getRequestID() {
        String string = this.responseHeaders.has(AppConstants.REQUEST_ID) ? this.responseHeaders.getString(AppConstants.REQUEST_ID) : " ";
        return StringUtils.isEmptyOrNull(string) ? this.responseHeaders.getString(AppConstants.HV_REQUEST_ID) : string;
    }

    public JSONObject getResponseBody() {
        return this.responseBody;
    }

    public JSONObject getResponseHeaders() {
        return this.responseHeaders;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public int hashCode() {
        Integer statusCode = getStatusCode();
        int hashCode = statusCode == null ? 43 : statusCode.hashCode();
        JSONObject responseBody = getResponseBody();
        int hashCode2 = ((hashCode + 59) * 59) + (responseBody == null ? 43 : responseBody.hashCode());
        JSONObject responseHeaders = getResponseHeaders();
        int hashCode3 = (hashCode2 * 59) + (responseHeaders == null ? 43 : responseHeaders.hashCode());
        JSONObject errorBody = getErrorBody();
        int hashCode4 = (hashCode3 * 59) + (errorBody == null ? 43 : errorBody.hashCode());
        String statusMessage = getStatusMessage();
        return (hashCode4 * 59) + (statusMessage != null ? statusMessage.hashCode() : 43);
    }

    public void setErrorBody(JSONObject jSONObject) {
        this.errorBody = jSONObject;
    }

    public void setRequestSignature(String str) {
        this.responseHeaders.put("X-HV-Request-Signature", str);
    }

    public void setResponseBody(JSONObject jSONObject) {
        this.responseBody = jSONObject;
    }

    public void setResponseHeaders(JSONObject jSONObject) {
        this.responseHeaders = jSONObject;
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public String toString() {
        return "APIResponse(responseBody=" + getResponseBody() + ", responseHeaders=" + getResponseHeaders() + ", errorBody=" + getErrorBody() + ", statusCode=" + getStatusCode() + ", statusMessage=" + getStatusMessage() + ")";
    }

    public APIResponse(int i10, String str, G g10, G g11, v vVar) {
        this.statusCode = Integer.valueOf(i10);
        this.statusMessage = str;
        setResponseHeaders(setCustomHeaders(vVar));
        try {
            try {
                if (g10 != null) {
                    this.responseBody = new JSONObject(g10.l());
                } else {
                    Log.e("APIResponse", "responseBody is null");
                }
                if (g10 != null) {
                    g10.close();
                }
            } catch (Throwable th) {
                if (g10 != null) {
                    try {
                        g10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
        if (g11 != null) {
            try {
                try {
                    this.errorBody = new JSONObject(g11.l());
                    g11.close();
                } finally {
                }
            } catch (IOException | JSONException e11) {
                Log.e(TAG, Utils.getErrorMessage(e11));
            }
        }
    }
}
