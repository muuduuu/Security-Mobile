package co.hyperverge.hypersnapsdk.objects;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVVideoRecordingData {
    private static final String TAG = "HVVideoRecordingData";
    private String colorFormat;
    private Long completeVideoDuration;
    private boolean enabled;
    private String error;
    private Long videoDuration;
    private Double videoSize;

    public HVVideoRecordingData() {
    }

    public String getColorFormat() {
        return this.colorFormat;
    }

    public Long getCompleteVideoDuration() {
        return this.completeVideoDuration;
    }

    public String getError() {
        return this.error;
    }

    public Long getVideoDuration() {
        return this.videoDuration;
    }

    public Double getVideoSize() {
        return this.videoSize;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setColorFormat(String str) {
        this.colorFormat = str;
    }

    public void setCompleteVideoDuration(Long l10) {
        this.completeVideoDuration = l10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setVideoDuration(Long l10) {
        this.videoDuration = l10;
    }

    public void setVideoSize(Double d10) {
        this.videoSize = d10;
    }

    public JSONObject toJson() {
        HVLogUtils.d(TAG, "toJson() called");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppConstants.VIDEO_RECORDING_ENABLED, this.enabled);
            if (this.enabled) {
                String str = this.colorFormat;
                if (str != null) {
                    jSONObject.put(AppConstants.VIDEO_RECORDING_COLOR_FORMAT, str);
                }
                Long l10 = this.completeVideoDuration;
                if (l10 != null) {
                    jSONObject.put(AppConstants.VIDEO_RECORDING_COMPLETE_VIDEO_DURATION, l10);
                }
                Long l11 = this.videoDuration;
                if (l11 != null) {
                    jSONObject.put("videoDuration", l11);
                }
                Double d10 = this.videoSize;
                if (d10 != null) {
                    jSONObject.put("videoSize", d10);
                }
                String str2 = this.error;
                if (str2 != null) {
                    jSONObject.put(AppConstants.VIDEO_RECORDING_ERROR, str2);
                }
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, Utils.getErrorMessage(e10));
        }
        HVLogUtils.d(TAG, "toJson() returning: " + jSONObject);
        return jSONObject;
    }

    public HVVideoRecordingData(boolean z10) {
        this.enabled = z10;
    }
}
