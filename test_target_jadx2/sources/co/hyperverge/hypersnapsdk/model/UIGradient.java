package co.hyperverge.hypersnapsdk.model;

import java.io.Serializable;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class UIGradient implements Serializable {
    private UIGradientProperties primaryButtonEnabledGradient = new UIGradientProperties();
    private UIGradientProperties primaryButtonDisabledGradient = new UIGradientProperties();
    private UIGradientProperties secondaryButtonEnabledGradient = new UIGradientProperties();
    private UIGradientProperties secondaryButtonDisabledGradient = new UIGradientProperties();
    private UIGradientProperties captureScreenEnabledButtonGradient = new UIGradientProperties();
    private UIGradientProperties captureScreenDisabledButtonGradient = new UIGradientProperties();

    public static class UIGradientProperties implements Serializable {
        private String imageUrl = BuildConfig.FLAVOR;

        protected boolean canEqual(Object obj) {
            return obj instanceof UIGradientProperties;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UIGradientProperties)) {
                return false;
            }
            UIGradientProperties uIGradientProperties = (UIGradientProperties) obj;
            if (!uIGradientProperties.canEqual(this)) {
                return false;
            }
            String imageUrl = getImageUrl();
            String imageUrl2 = uIGradientProperties.getImageUrl();
            return imageUrl != null ? imageUrl.equals(imageUrl2) : imageUrl2 == null;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            String imageUrl = getImageUrl();
            return 59 + (imageUrl == null ? 43 : imageUrl.hashCode());
        }

        public void setImageUrl(String str) {
            this.imageUrl = str;
        }

        public String toString() {
            return "UIGradient.UIGradientProperties(imageUrl=" + getImageUrl() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof UIGradient;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UIGradient)) {
            return false;
        }
        UIGradient uIGradient = (UIGradient) obj;
        if (!uIGradient.canEqual(this)) {
            return false;
        }
        UIGradientProperties primaryButtonEnabledGradient = getPrimaryButtonEnabledGradient();
        UIGradientProperties primaryButtonEnabledGradient2 = uIGradient.getPrimaryButtonEnabledGradient();
        if (primaryButtonEnabledGradient != null ? !primaryButtonEnabledGradient.equals(primaryButtonEnabledGradient2) : primaryButtonEnabledGradient2 != null) {
            return false;
        }
        UIGradientProperties primaryButtonDisabledGradient = getPrimaryButtonDisabledGradient();
        UIGradientProperties primaryButtonDisabledGradient2 = uIGradient.getPrimaryButtonDisabledGradient();
        if (primaryButtonDisabledGradient != null ? !primaryButtonDisabledGradient.equals(primaryButtonDisabledGradient2) : primaryButtonDisabledGradient2 != null) {
            return false;
        }
        UIGradientProperties secondaryButtonEnabledGradient = getSecondaryButtonEnabledGradient();
        UIGradientProperties secondaryButtonEnabledGradient2 = uIGradient.getSecondaryButtonEnabledGradient();
        if (secondaryButtonEnabledGradient != null ? !secondaryButtonEnabledGradient.equals(secondaryButtonEnabledGradient2) : secondaryButtonEnabledGradient2 != null) {
            return false;
        }
        UIGradientProperties secondaryButtonDisabledGradient = getSecondaryButtonDisabledGradient();
        UIGradientProperties secondaryButtonDisabledGradient2 = uIGradient.getSecondaryButtonDisabledGradient();
        if (secondaryButtonDisabledGradient != null ? !secondaryButtonDisabledGradient.equals(secondaryButtonDisabledGradient2) : secondaryButtonDisabledGradient2 != null) {
            return false;
        }
        UIGradientProperties captureScreenEnabledButtonGradient = getCaptureScreenEnabledButtonGradient();
        UIGradientProperties captureScreenEnabledButtonGradient2 = uIGradient.getCaptureScreenEnabledButtonGradient();
        if (captureScreenEnabledButtonGradient != null ? !captureScreenEnabledButtonGradient.equals(captureScreenEnabledButtonGradient2) : captureScreenEnabledButtonGradient2 != null) {
            return false;
        }
        UIGradientProperties captureScreenDisabledButtonGradient = getCaptureScreenDisabledButtonGradient();
        UIGradientProperties captureScreenDisabledButtonGradient2 = uIGradient.getCaptureScreenDisabledButtonGradient();
        return captureScreenDisabledButtonGradient != null ? captureScreenDisabledButtonGradient.equals(captureScreenDisabledButtonGradient2) : captureScreenDisabledButtonGradient2 == null;
    }

    public UIGradientProperties getCaptureScreenDisabledButtonGradient() {
        return this.captureScreenDisabledButtonGradient;
    }

    public UIGradientProperties getCaptureScreenEnabledButtonGradient() {
        return this.captureScreenEnabledButtonGradient;
    }

    public UIGradientProperties getPrimaryButtonDisabledGradient() {
        return this.primaryButtonDisabledGradient;
    }

    public UIGradientProperties getPrimaryButtonEnabledGradient() {
        return this.primaryButtonEnabledGradient;
    }

    public UIGradientProperties getSecondaryButtonDisabledGradient() {
        return this.secondaryButtonDisabledGradient;
    }

    public UIGradientProperties getSecondaryButtonEnabledGradient() {
        return this.secondaryButtonEnabledGradient;
    }

    public int hashCode() {
        UIGradientProperties primaryButtonEnabledGradient = getPrimaryButtonEnabledGradient();
        int hashCode = primaryButtonEnabledGradient == null ? 43 : primaryButtonEnabledGradient.hashCode();
        UIGradientProperties primaryButtonDisabledGradient = getPrimaryButtonDisabledGradient();
        int hashCode2 = ((hashCode + 59) * 59) + (primaryButtonDisabledGradient == null ? 43 : primaryButtonDisabledGradient.hashCode());
        UIGradientProperties secondaryButtonEnabledGradient = getSecondaryButtonEnabledGradient();
        int hashCode3 = (hashCode2 * 59) + (secondaryButtonEnabledGradient == null ? 43 : secondaryButtonEnabledGradient.hashCode());
        UIGradientProperties secondaryButtonDisabledGradient = getSecondaryButtonDisabledGradient();
        int hashCode4 = (hashCode3 * 59) + (secondaryButtonDisabledGradient == null ? 43 : secondaryButtonDisabledGradient.hashCode());
        UIGradientProperties captureScreenEnabledButtonGradient = getCaptureScreenEnabledButtonGradient();
        int hashCode5 = (hashCode4 * 59) + (captureScreenEnabledButtonGradient == null ? 43 : captureScreenEnabledButtonGradient.hashCode());
        UIGradientProperties captureScreenDisabledButtonGradient = getCaptureScreenDisabledButtonGradient();
        return (hashCode5 * 59) + (captureScreenDisabledButtonGradient != null ? captureScreenDisabledButtonGradient.hashCode() : 43);
    }

    public void setCaptureScreenDisabledButtonGradient(UIGradientProperties uIGradientProperties) {
        this.captureScreenDisabledButtonGradient = uIGradientProperties;
    }

    public void setCaptureScreenEnabledButtonGradient(UIGradientProperties uIGradientProperties) {
        this.captureScreenEnabledButtonGradient = uIGradientProperties;
    }

    public void setPrimaryButtonDisabledGradient(UIGradientProperties uIGradientProperties) {
        this.primaryButtonDisabledGradient = uIGradientProperties;
    }

    public void setPrimaryButtonEnabledGradient(UIGradientProperties uIGradientProperties) {
        this.primaryButtonEnabledGradient = uIGradientProperties;
    }

    public void setSecondaryButtonDisabledGradient(UIGradientProperties uIGradientProperties) {
        this.secondaryButtonDisabledGradient = uIGradientProperties;
    }

    public void setSecondaryButtonEnabledGradient(UIGradientProperties uIGradientProperties) {
        this.secondaryButtonEnabledGradient = uIGradientProperties;
    }

    public String toString() {
        return "UIGradient(primaryButtonEnabledGradient=" + getPrimaryButtonEnabledGradient() + ", primaryButtonDisabledGradient=" + getPrimaryButtonDisabledGradient() + ", secondaryButtonEnabledGradient=" + getSecondaryButtonEnabledGradient() + ", secondaryButtonDisabledGradient=" + getSecondaryButtonDisabledGradient() + ", captureScreenEnabledButtonGradient=" + getCaptureScreenEnabledButtonGradient() + ", captureScreenDisabledButtonGradient=" + getCaptureScreenDisabledButtonGradient() + ")";
    }
}
