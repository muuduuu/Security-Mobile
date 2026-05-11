package co.hyperverge.hypersnapsdk.service.errortracking;

/* loaded from: classes.dex */
public class ErrorTrackingData {
    private String abi;
    private String appId;
    private String hyperSnapSdkVersion;
    private String packageName;

    public String getAbi() {
        return this.abi;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getHyperSnapSdkVersion() {
        return this.hyperSnapSdkVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAbi(String str) {
        this.abi = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setHyperSnapSdkVersion(String str) {
        this.hyperSnapSdkVersion = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
