package co.hyperverge.hypersnapsdk.analytics.mixpanel.network;

import O8.c;
import co.hyperverge.hypersnapsdk.utils.AppConstants;

@Deprecated
/* loaded from: classes.dex */
public class MixPanelErrorResponse {

    @c(AppConstants.VIDEO_RECORDING_ERROR)
    private String error;

    @c("status")
    private String status;

    protected boolean canEqual(Object obj) {
        return obj instanceof MixPanelErrorResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixPanelErrorResponse)) {
            return false;
        }
        MixPanelErrorResponse mixPanelErrorResponse = (MixPanelErrorResponse) obj;
        if (!mixPanelErrorResponse.canEqual(this)) {
            return false;
        }
        String error = getError();
        String error2 = mixPanelErrorResponse.getError();
        if (error != null ? !error.equals(error2) : error2 != null) {
            return false;
        }
        String status = getStatus();
        String status2 = mixPanelErrorResponse.getStatus();
        return status != null ? status.equals(status2) : status2 == null;
    }

    public String getError() {
        return this.error;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String error = getError();
        int hashCode = error == null ? 43 : error.hashCode();
        String status = getStatus();
        return ((hashCode + 59) * 59) + (status != null ? status.hashCode() : 43);
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "MixPanelErrorResponse(error=" + getError() + ", status=" + getStatus() + ")";
    }
}
