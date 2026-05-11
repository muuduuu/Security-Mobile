package co.hyperverge.hypersnapsdk.objects;

import co.hyperverge.hypersnapsdk.model.UIConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;

/* loaded from: classes.dex */
public class HyperSnapSDKConfig {
    private String accessToken;
    private String appId;
    private String appKey;
    private Integer callTimeOut;
    private int connectTimeOut;
    private ExternalConfigs externalConfigs;
    private HyperSnapParams.Product hyperSnapProduct;
    private HyperSnapParams.Region hyperSnapRegion;
    private Integer initCallTimeout;
    private String mixpanelToken;
    private Integer prefetchCallTimeout;
    private int readTimeOut;

    @Deprecated
    private boolean shouldActivateDeviceBlocklist;
    private boolean shouldEnableSSLPinning;
    private boolean shouldLogOnlyErrors;
    private boolean shouldReturnRawResponse;
    private boolean shouldUseLocation;
    private boolean shouldUseRemoteConfig;
    private boolean shouldUseSHA256Signature;
    private boolean shouldUseSensorBiometrics;
    private boolean shouldUseSignature;
    private String signatureMethod;
    private UIConfig uiConfig;
    private int writeTimeOut;

    public HyperSnapSDKConfig() {
        this.signatureMethod = "MD5";
        this.shouldActivateDeviceBlocklist = true;
        this.shouldUseSHA256Signature = false;
        this.callTimeOut = null;
        this.prefetchCallTimeout = null;
        this.initCallTimeout = null;
        this.connectTimeOut = 120;
        this.readTimeOut = 120;
        this.writeTimeOut = 120;
        this.shouldUseSensorBiometrics = true;
        this.shouldUseRemoteConfig = true;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof HyperSnapSDKConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HyperSnapSDKConfig)) {
            return false;
        }
        HyperSnapSDKConfig hyperSnapSDKConfig = (HyperSnapSDKConfig) obj;
        if (!hyperSnapSDKConfig.canEqual(this) || isShouldEnableSSLPinning() != hyperSnapSDKConfig.isShouldEnableSSLPinning() || isShouldUseSignature() != hyperSnapSDKConfig.isShouldUseSignature() || isShouldLogOnlyErrors() != hyperSnapSDKConfig.isShouldLogOnlyErrors() || isShouldReturnRawResponse() != hyperSnapSDKConfig.isShouldReturnRawResponse() || isShouldActivateDeviceBlocklist() != hyperSnapSDKConfig.isShouldActivateDeviceBlocklist() || isShouldUseSHA256Signature() != hyperSnapSDKConfig.isShouldUseSHA256Signature() || getConnectTimeOut() != hyperSnapSDKConfig.getConnectTimeOut() || getReadTimeOut() != hyperSnapSDKConfig.getReadTimeOut() || getWriteTimeOut() != hyperSnapSDKConfig.getWriteTimeOut() || isShouldUseSensorBiometrics() != hyperSnapSDKConfig.isShouldUseSensorBiometrics() || isShouldUseRemoteConfig() != hyperSnapSDKConfig.isShouldUseRemoteConfig() || isShouldUseLocation() != hyperSnapSDKConfig.isShouldUseLocation()) {
            return false;
        }
        Integer callTimeOut = getCallTimeOut();
        Integer callTimeOut2 = hyperSnapSDKConfig.getCallTimeOut();
        if (callTimeOut != null ? !callTimeOut.equals(callTimeOut2) : callTimeOut2 != null) {
            return false;
        }
        Integer prefetchCallTimeout = getPrefetchCallTimeout();
        Integer prefetchCallTimeout2 = hyperSnapSDKConfig.getPrefetchCallTimeout();
        if (prefetchCallTimeout != null ? !prefetchCallTimeout.equals(prefetchCallTimeout2) : prefetchCallTimeout2 != null) {
            return false;
        }
        Integer initCallTimeout = getInitCallTimeout();
        Integer initCallTimeout2 = hyperSnapSDKConfig.getInitCallTimeout();
        if (initCallTimeout != null ? !initCallTimeout.equals(initCallTimeout2) : initCallTimeout2 != null) {
            return false;
        }
        String appId = getAppId();
        String appId2 = hyperSnapSDKConfig.getAppId();
        if (appId != null ? !appId.equals(appId2) : appId2 != null) {
            return false;
        }
        String appKey = getAppKey();
        String appKey2 = hyperSnapSDKConfig.getAppKey();
        if (appKey != null ? !appKey.equals(appKey2) : appKey2 != null) {
            return false;
        }
        String accessToken = getAccessToken();
        String accessToken2 = hyperSnapSDKConfig.getAccessToken();
        if (accessToken != null ? !accessToken.equals(accessToken2) : accessToken2 != null) {
            return false;
        }
        HyperSnapParams.Region hyperSnapRegion = getHyperSnapRegion();
        HyperSnapParams.Region hyperSnapRegion2 = hyperSnapSDKConfig.getHyperSnapRegion();
        if (hyperSnapRegion != null ? !hyperSnapRegion.equals(hyperSnapRegion2) : hyperSnapRegion2 != null) {
            return false;
        }
        HyperSnapParams.Product hyperSnapProduct = getHyperSnapProduct();
        HyperSnapParams.Product hyperSnapProduct2 = hyperSnapSDKConfig.getHyperSnapProduct();
        if (hyperSnapProduct != null ? !hyperSnapProduct.equals(hyperSnapProduct2) : hyperSnapProduct2 != null) {
            return false;
        }
        String signatureMethod = getSignatureMethod();
        String signatureMethod2 = hyperSnapSDKConfig.getSignatureMethod();
        if (signatureMethod != null ? !signatureMethod.equals(signatureMethod2) : signatureMethod2 != null) {
            return false;
        }
        String mixpanelToken = getMixpanelToken();
        String mixpanelToken2 = hyperSnapSDKConfig.getMixpanelToken();
        if (mixpanelToken != null ? !mixpanelToken.equals(mixpanelToken2) : mixpanelToken2 != null) {
            return false;
        }
        ExternalConfigs externalConfigs = getExternalConfigs();
        ExternalConfigs externalConfigs2 = hyperSnapSDKConfig.getExternalConfigs();
        if (externalConfigs != null ? !externalConfigs.equals(externalConfigs2) : externalConfigs2 != null) {
            return false;
        }
        UIConfig uiConfig = getUiConfig();
        UIConfig uiConfig2 = hyperSnapSDKConfig.getUiConfig();
        return uiConfig != null ? uiConfig.equals(uiConfig2) : uiConfig2 == null;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public Integer getCallTimeOut() {
        return this.callTimeOut;
    }

    public int getConnectTimeOut() {
        return this.connectTimeOut;
    }

    public ExternalConfigs getExternalConfigs() {
        return this.externalConfigs;
    }

    public HyperSnapParams.Product getHyperSnapProduct() {
        return this.hyperSnapProduct;
    }

    public HyperSnapParams.Region getHyperSnapRegion() {
        return this.hyperSnapRegion;
    }

    public Integer getInitCallTimeout() {
        return this.initCallTimeout;
    }

    public String getMixpanelToken() {
        return this.mixpanelToken;
    }

    public Integer getPrefetchCallTimeout() {
        return this.prefetchCallTimeout;
    }

    public int getReadTimeOut() {
        return this.readTimeOut;
    }

    public String getSignatureMethod() {
        return this.signatureMethod;
    }

    public UIConfig getUiConfig() {
        return this.uiConfig;
    }

    public int getWriteTimeOut() {
        return this.writeTimeOut;
    }

    public int hashCode() {
        int connectTimeOut = (((((((((((((((((((((((isShouldEnableSSLPinning() ? 79 : 97) + 59) * 59) + (isShouldUseSignature() ? 79 : 97)) * 59) + (isShouldLogOnlyErrors() ? 79 : 97)) * 59) + (isShouldReturnRawResponse() ? 79 : 97)) * 59) + (isShouldActivateDeviceBlocklist() ? 79 : 97)) * 59) + (isShouldUseSHA256Signature() ? 79 : 97)) * 59) + getConnectTimeOut()) * 59) + getReadTimeOut()) * 59) + getWriteTimeOut()) * 59) + (isShouldUseSensorBiometrics() ? 79 : 97)) * 59) + (isShouldUseRemoteConfig() ? 79 : 97)) * 59) + (isShouldUseLocation() ? 79 : 97);
        Integer callTimeOut = getCallTimeOut();
        int hashCode = (connectTimeOut * 59) + (callTimeOut == null ? 43 : callTimeOut.hashCode());
        Integer prefetchCallTimeout = getPrefetchCallTimeout();
        int hashCode2 = (hashCode * 59) + (prefetchCallTimeout == null ? 43 : prefetchCallTimeout.hashCode());
        Integer initCallTimeout = getInitCallTimeout();
        int hashCode3 = (hashCode2 * 59) + (initCallTimeout == null ? 43 : initCallTimeout.hashCode());
        String appId = getAppId();
        int hashCode4 = (hashCode3 * 59) + (appId == null ? 43 : appId.hashCode());
        String appKey = getAppKey();
        int hashCode5 = (hashCode4 * 59) + (appKey == null ? 43 : appKey.hashCode());
        String accessToken = getAccessToken();
        int hashCode6 = (hashCode5 * 59) + (accessToken == null ? 43 : accessToken.hashCode());
        HyperSnapParams.Region hyperSnapRegion = getHyperSnapRegion();
        int hashCode7 = (hashCode6 * 59) + (hyperSnapRegion == null ? 43 : hyperSnapRegion.hashCode());
        HyperSnapParams.Product hyperSnapProduct = getHyperSnapProduct();
        int hashCode8 = (hashCode7 * 59) + (hyperSnapProduct == null ? 43 : hyperSnapProduct.hashCode());
        String signatureMethod = getSignatureMethod();
        int hashCode9 = (hashCode8 * 59) + (signatureMethod == null ? 43 : signatureMethod.hashCode());
        String mixpanelToken = getMixpanelToken();
        int hashCode10 = (hashCode9 * 59) + (mixpanelToken == null ? 43 : mixpanelToken.hashCode());
        ExternalConfigs externalConfigs = getExternalConfigs();
        int hashCode11 = (hashCode10 * 59) + (externalConfigs == null ? 43 : externalConfigs.hashCode());
        UIConfig uiConfig = getUiConfig();
        return (hashCode11 * 59) + (uiConfig != null ? uiConfig.hashCode() : 43);
    }

    @Deprecated
    public boolean isShouldActivateDeviceBlocklist() {
        return this.shouldActivateDeviceBlocklist;
    }

    public boolean isShouldEnableSSLPinning() {
        return this.shouldEnableSSLPinning;
    }

    public boolean isShouldLogOnlyErrors() {
        return this.shouldLogOnlyErrors;
    }

    public boolean isShouldReturnRawResponse() {
        return this.shouldReturnRawResponse;
    }

    public boolean isShouldUseLocation() {
        return this.shouldUseLocation;
    }

    public boolean isShouldUseRemoteConfig() {
        return this.shouldUseRemoteConfig;
    }

    public boolean isShouldUseSHA256Signature() {
        return this.shouldUseSHA256Signature;
    }

    public boolean isShouldUseSensorBiometrics() {
        return this.shouldUseSensorBiometrics;
    }

    public boolean isShouldUseSignature() {
        return this.shouldUseSignature;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setCallTimeOut(Integer num) {
        this.callTimeOut = num;
    }

    public void setConnectTimeOut(int i10) {
        this.connectTimeOut = i10;
    }

    public void setExternalConfigs(ExternalConfigs externalConfigs) {
        this.externalConfigs = externalConfigs;
    }

    public void setHttpTimeoutValues(int i10, int i11, int i12) {
        this.connectTimeOut = i10;
        this.readTimeOut = i11;
        this.writeTimeOut = i12;
    }

    public void setHyperSnapProduct(HyperSnapParams.Product product) {
        this.hyperSnapProduct = product;
    }

    public void setHyperSnapRegion(HyperSnapParams.Region region) {
        this.hyperSnapRegion = region;
    }

    public void setInitCallTimeout(Integer num) {
        this.initCallTimeout = num;
    }

    public void setMixpanelToken(String str) {
        this.mixpanelToken = str;
    }

    public void setPrefetchCallTimeout(Integer num) {
        this.prefetchCallTimeout = num;
    }

    public void setReadTimeOut(int i10) {
        this.readTimeOut = i10;
    }

    @Deprecated
    public void setShouldActivateDeviceBlocklist(boolean z10) {
        this.shouldActivateDeviceBlocklist = z10;
    }

    public void setShouldEnableSSLPinning(boolean z10) {
        this.shouldEnableSSLPinning = z10;
    }

    public void setShouldLogOnlyErrors(boolean z10) {
        this.shouldLogOnlyErrors = z10;
    }

    public void setShouldReturnRawResponse(boolean z10) {
        this.shouldReturnRawResponse = z10;
    }

    public void setShouldUseLocation(boolean z10) {
        this.shouldUseLocation = z10;
    }

    public void setShouldUseRemoteConfig(boolean z10) {
        this.shouldUseRemoteConfig = z10;
    }

    public void setShouldUseSHA256Signature(boolean z10) {
        this.shouldUseSHA256Signature = z10;
    }

    public void setShouldUseSensorBiometrics(boolean z10) {
        this.shouldUseSensorBiometrics = z10;
    }

    public void setShouldUseSignature(boolean z10) {
        this.shouldUseSignature = z10;
    }

    public void setSignatureMethod(String str) {
        this.signatureMethod = str;
    }

    public void setUiConfig(UIConfig uIConfig) {
        this.uiConfig = uIConfig;
    }

    public void setWriteTimeOut(int i10) {
        this.writeTimeOut = i10;
    }

    public String toString() {
        return "HyperSnapSDKConfig(appId=" + getAppId() + ", appKey=" + getAppKey() + ", accessToken=" + getAccessToken() + ", hyperSnapRegion=" + getHyperSnapRegion() + ", hyperSnapProduct=" + getHyperSnapProduct() + ", shouldEnableSSLPinning=" + isShouldEnableSSLPinning() + ", shouldUseSignature=" + isShouldUseSignature() + ", shouldLogOnlyErrors=" + isShouldLogOnlyErrors() + ", signatureMethod=" + getSignatureMethod() + ", mixpanelToken=" + getMixpanelToken() + ", shouldReturnRawResponse=" + isShouldReturnRawResponse() + ", shouldActivateDeviceBlocklist=" + isShouldActivateDeviceBlocklist() + ", shouldUseSHA256Signature=" + isShouldUseSHA256Signature() + ", callTimeOut=" + getCallTimeOut() + ", prefetchCallTimeout=" + getPrefetchCallTimeout() + ", initCallTimeout=" + getInitCallTimeout() + ", connectTimeOut=" + getConnectTimeOut() + ", readTimeOut=" + getReadTimeOut() + ", writeTimeOut=" + getWriteTimeOut() + ", externalConfigs=" + getExternalConfigs() + ", shouldUseSensorBiometrics=" + isShouldUseSensorBiometrics() + ", shouldUseRemoteConfig=" + isShouldUseRemoteConfig() + ", shouldUseLocation=" + isShouldUseLocation() + ", uiConfig=" + getUiConfig() + ")";
    }

    public HyperSnapSDKConfig(String str, String str2, HyperSnapParams.Region region) {
        this.signatureMethod = "MD5";
        this.shouldActivateDeviceBlocklist = true;
        this.shouldUseSHA256Signature = false;
        this.callTimeOut = null;
        this.prefetchCallTimeout = null;
        this.initCallTimeout = null;
        this.connectTimeOut = 120;
        this.readTimeOut = 120;
        this.writeTimeOut = 120;
        this.shouldUseSensorBiometrics = true;
        this.shouldUseRemoteConfig = true;
        this.appId = str;
        this.appKey = str2;
        this.hyperSnapRegion = region;
        this.hyperSnapProduct = HyperSnapParams.Product.FACEID;
    }
}
