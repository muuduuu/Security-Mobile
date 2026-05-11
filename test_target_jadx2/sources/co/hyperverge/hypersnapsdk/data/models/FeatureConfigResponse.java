package co.hyperverge.hypersnapsdk.data.models;

import O8.c;
import java.util.List;

/* loaded from: classes.dex */
public class FeatureConfigResponse {

    @c("features")
    private List<FeatureConfig> features;

    protected boolean canEqual(Object obj) {
        return obj instanceof FeatureConfigResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureConfigResponse)) {
            return false;
        }
        FeatureConfigResponse featureConfigResponse = (FeatureConfigResponse) obj;
        if (!featureConfigResponse.canEqual(this)) {
            return false;
        }
        List<FeatureConfig> features = getFeatures();
        List<FeatureConfig> features2 = featureConfigResponse.getFeatures();
        return features != null ? features.equals(features2) : features2 == null;
    }

    public List<FeatureConfig> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        List<FeatureConfig> features = getFeatures();
        return 59 + (features == null ? 43 : features.hashCode());
    }

    public void setFeatures(List<FeatureConfig> list) {
        this.features = list;
    }

    public String toString() {
        return "FeatureConfigResponse(features=" + getFeatures() + ")";
    }
}
