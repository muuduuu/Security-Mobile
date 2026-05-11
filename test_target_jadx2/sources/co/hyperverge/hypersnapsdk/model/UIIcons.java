package co.hyperverge.hypersnapsdk.model;

import java.io.Serializable;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class UIIcons implements Serializable {
    private UIIconProperties primaryButtonIcon = new UIIconProperties();
    private UIIconProperties backButtonIcon = new UIIconProperties();
    private UIIconProperties captureScreenBackButtonIcon = new UIIconProperties();
    private UIIconProperties closeButtonIcon = new UIIconProperties();

    public static class UIIconProperties implements Serializable {
        private String url = BuildConfig.FLAVOR;
        private boolean shouldShow = true;

        protected boolean canEqual(Object obj) {
            return obj instanceof UIIconProperties;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UIIconProperties)) {
                return false;
            }
            UIIconProperties uIIconProperties = (UIIconProperties) obj;
            if (!uIIconProperties.canEqual(this) || isShouldShow() != uIIconProperties.isShouldShow()) {
                return false;
            }
            String url = getUrl();
            String url2 = uIIconProperties.getUrl();
            return url != null ? url.equals(url2) : url2 == null;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int i10 = isShouldShow() ? 79 : 97;
            String url = getUrl();
            return ((i10 + 59) * 59) + (url == null ? 43 : url.hashCode());
        }

        public boolean isShouldShow() {
            return this.shouldShow;
        }

        public void setShouldShow(boolean z10) {
            this.shouldShow = z10;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "UIIcons.UIIconProperties(url=" + getUrl() + ", shouldShow=" + isShouldShow() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof UIIcons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UIIcons)) {
            return false;
        }
        UIIcons uIIcons = (UIIcons) obj;
        if (!uIIcons.canEqual(this)) {
            return false;
        }
        UIIconProperties primaryButtonIcon = getPrimaryButtonIcon();
        UIIconProperties primaryButtonIcon2 = uIIcons.getPrimaryButtonIcon();
        if (primaryButtonIcon != null ? !primaryButtonIcon.equals(primaryButtonIcon2) : primaryButtonIcon2 != null) {
            return false;
        }
        UIIconProperties backButtonIcon = getBackButtonIcon();
        UIIconProperties backButtonIcon2 = uIIcons.getBackButtonIcon();
        if (backButtonIcon != null ? !backButtonIcon.equals(backButtonIcon2) : backButtonIcon2 != null) {
            return false;
        }
        UIIconProperties captureScreenBackButtonIcon = getCaptureScreenBackButtonIcon();
        UIIconProperties captureScreenBackButtonIcon2 = uIIcons.getCaptureScreenBackButtonIcon();
        if (captureScreenBackButtonIcon != null ? !captureScreenBackButtonIcon.equals(captureScreenBackButtonIcon2) : captureScreenBackButtonIcon2 != null) {
            return false;
        }
        UIIconProperties closeButtonIcon = getCloseButtonIcon();
        UIIconProperties closeButtonIcon2 = uIIcons.getCloseButtonIcon();
        return closeButtonIcon != null ? closeButtonIcon.equals(closeButtonIcon2) : closeButtonIcon2 == null;
    }

    public UIIconProperties getBackButtonIcon() {
        return this.backButtonIcon;
    }

    public UIIconProperties getCaptureScreenBackButtonIcon() {
        return this.captureScreenBackButtonIcon;
    }

    public UIIconProperties getCloseButtonIcon() {
        return this.closeButtonIcon;
    }

    public UIIconProperties getPrimaryButtonIcon() {
        return this.primaryButtonIcon;
    }

    public int hashCode() {
        UIIconProperties primaryButtonIcon = getPrimaryButtonIcon();
        int hashCode = primaryButtonIcon == null ? 43 : primaryButtonIcon.hashCode();
        UIIconProperties backButtonIcon = getBackButtonIcon();
        int hashCode2 = ((hashCode + 59) * 59) + (backButtonIcon == null ? 43 : backButtonIcon.hashCode());
        UIIconProperties captureScreenBackButtonIcon = getCaptureScreenBackButtonIcon();
        int hashCode3 = (hashCode2 * 59) + (captureScreenBackButtonIcon == null ? 43 : captureScreenBackButtonIcon.hashCode());
        UIIconProperties closeButtonIcon = getCloseButtonIcon();
        return (hashCode3 * 59) + (closeButtonIcon != null ? closeButtonIcon.hashCode() : 43);
    }

    public void setBackButtonIcon(UIIconProperties uIIconProperties) {
        this.backButtonIcon = uIIconProperties;
    }

    public void setCaptureScreenBackButtonIcon(UIIconProperties uIIconProperties) {
        this.captureScreenBackButtonIcon = uIIconProperties;
    }

    public void setCloseButtonIcon(UIIconProperties uIIconProperties) {
        this.closeButtonIcon = uIIconProperties;
    }

    public void setPrimaryButtonIcon(UIIconProperties uIIconProperties) {
        this.primaryButtonIcon = uIIconProperties;
    }

    public String toString() {
        return "UIIcons(primaryButtonIcon=" + getPrimaryButtonIcon() + ", backButtonIcon=" + getBackButtonIcon() + ", captureScreenBackButtonIcon=" + getCaptureScreenBackButtonIcon() + ", closeButtonIcon=" + getCloseButtonIcon() + ")";
    }
}
