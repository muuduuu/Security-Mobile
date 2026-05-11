package co.hyperverge.hypersnapsdk.data.remote;

import De.InterfaceC0818b;
import De.InterfaceC0820d;
import De.z;
import Td.C1227c;
import android.util.Log;
import co.hyperverge.hypersnapsdk.data.DefaultRemoteConfig;
import co.hyperverge.hypersnapsdk.data.RemoteConfig;
import co.hyperverge.hypersnapsdk.data.models.FeatureConfig;
import co.hyperverge.hypersnapsdk.data.models.FeatureConfigResponse;
import co.hyperverge.hypersnapsdk.helpers.HVFeatureConfigHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class HVRemoteConfigRepo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo";
    private static HVRemoteConfigRepo instance;
    private final C1227c cacheDir;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public interface HVCallback {
        void onError(HVError hVError);

        void onSuccess();
    }

    private HVRemoteConfigRepo(C1227c c1227c) {
        this.cacheDir = c1227c;
    }

    public static HVRemoteConfigRepo getInstance(C1227c c1227c) {
        if (instance == null) {
            instance = new HVRemoteConfigRepo(c1227c);
        }
        return instance;
    }

    private long getMetadataCacheExpiryTimestamp(k kVar) {
        if (kVar == null || !kVar.D("cacheExpiryTimestamp")) {
            return 0L;
        }
        return kVar.B("cacheExpiryTimestamp").k();
    }

    private int getMetadataResponseCode(k kVar) {
        if (kVar == null || !kVar.D("responseCode")) {
            return 0;
        }
        return kVar.B("responseCode").c();
    }

    private boolean hasCacheExpired(long j10) {
        HVLogUtils.d(TAG, "hasCacheExpired() called with: cacheExpiryTimestamp = [" + j10 + "], System.currentTimeMillis() = [" + System.currentTimeMillis() + "]");
        return j10 < System.currentTimeMillis();
    }

    private boolean isS3ErrorStatusCode(int i10) {
        return i10 >= 400 && i10 < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x0004, B:5:0x0036, B:10:0x0049, B:11:0x0066, B:13:0x006c, B:15:0x007d, B:17:0x0083, B:19:0x008f, B:20:0x0095, B:23:0x00a4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x0004, B:5:0x0036, B:10:0x0049, B:11:0x0066, B:13:0x006c, B:15:0x007d, B:17:0x0083, B:19:0x008f, B:20:0x0095, B:23:0x00a4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x0004, B:5:0x0036, B:10:0x0049, B:11:0x0066, B:13:0x006c, B:15:0x007d, B:17:0x0083, B:19:0x008f, B:20:0x0095, B:23:0x00a4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$getFeatureConfigs$0(Integer num, boolean z10, String str, String str2, String str3, HVCallback hVCallback) {
        boolean z11;
        z zVar;
        try {
            RemoteConfigApiInterface remoteConfigService = ApiClient.getRemoteConfigService(this.cacheDir, num, z10);
            z j10 = remoteConfigService.getFeatureRemoteConfig(str).j();
            k configsMetadata = SPHelper.getConfigsMetadata(AppConstants.SDK_VERSION_SPECIFIC_FEATURE_CONFIGS, str2);
            HVLogUtils.d(TAG, "getFeatureConfigs: metadata: " + configsMetadata);
            if (isS3ErrorStatusCode(getMetadataResponseCode(configsMetadata)) && !hasCacheExpired(getMetadataCacheExpiryTimestamp(configsMetadata))) {
                z11 = false;
                if (z11) {
                    zVar = null;
                } else {
                    zVar = remoteConfigService.getFeatureRemoteConfig(str3).j();
                    SPHelper.setConfigsMetadata(AppConstants.SDK_VERSION_SPECIFIC_FEATURE_CONFIGS, str2, Integer.valueOf(zVar.b()), Long.valueOf(System.currentTimeMillis()), num);
                }
                if (!j10.f()) {
                    List<FeatureConfig> features = ((FeatureConfigResponse) j10.a()).getFeatures();
                    List arrayList = new ArrayList();
                    if (z11) {
                        arrayList = zVar.f() ? ((FeatureConfigResponse) zVar.a()).getFeatures() : new ArrayList();
                    }
                    SDKInternalConfig.getInstance().setFeatureConfigMap(HVFeatureConfigHelper.extractFeatureMap(features, arrayList));
                    hVCallback.onSuccess();
                    return;
                }
                hVCallback.onError(new HVError(12, logServerError(j10) + "\n" + logServerError(zVar)));
                return;
            }
            z11 = true;
            if (z11) {
            }
            if (!j10.f()) {
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "getFeatureConfigs(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            hVCallback.onError(new HVError(12, Utils.getErrorMessage(e10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAPICallError(boolean z10, String str, int i10) {
        HVLogUtils.d(TAG, "logAPICallError() called with: shouldLogForBrandingCheck = [" + z10 + "], errorMessage = [" + str + "], errorCode = [" + i10 + "]");
        if (z10) {
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logCheckBrandingAPIError(str, i10);
            return;
        }
        if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
            return;
        }
        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logRemoteConfigAPIError(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAPICallSuccess(boolean z10) {
        HVLogUtils.d(TAG, "logAPICallSuccess() called with: shouldLogForBrandingCheck = [" + z10 + "]");
        if (z10) {
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logCheckBrandingAPISuccess();
            return;
        }
        if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
            return;
        }
        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logRemoteConfigAPISuccess();
    }

    private <T> String logServerError(z<T> zVar) {
        String l10;
        if (zVar.f()) {
            return BuildConfig.FLAVOR;
        }
        if (zVar.d() != null) {
            try {
                l10 = zVar.d().l();
            } catch (IOException e10) {
                HVLogUtils.e(TAG, "logServerError(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(getClass().getCanonicalName(), Utils.getErrorMessage(e10));
            }
            logAPICallError(false, l10, zVar.b());
            return l10;
        }
        l10 = "Server Error";
        logAPICallError(false, l10, zVar.b());
        return l10;
    }

    public void getDefaultRemoteConfig(boolean z10, Integer num, final HVCallback hVCallback) {
        HVLogUtils.d(TAG, "getDefaultRemoteConfig() called with: callback = [" + hVCallback + "]");
        ApiClient.getRemoteConfigService(this.cacheDir, num, z10).getDefaultRemoteConfig("https://hv-central-config.s3.ap-south-1.amazonaws.com/sdk-client-config/hypersnapsdk/v1/default.json").v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.1
            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b<DefaultRemoteConfig> interfaceC0818b, Throwable th) {
                HVLogUtils.d(HVRemoteConfigRepo.TAG, "getDefaultRemoteConfig(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                SDKInternalConfig.getInstance().setDefaultRemoteConfig(new DefaultRemoteConfig());
                hVCallback.onError(new HVError(12, "Could not fetch default remote configs"));
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b<DefaultRemoteConfig> interfaceC0818b, z<DefaultRemoteConfig> zVar) {
                HVLogUtils.d(HVRemoteConfigRepo.TAG, "getDefaultRemoteConfig(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                if (zVar.f()) {
                    SDKInternalConfig.getInstance().setDefaultRemoteConfig((DefaultRemoteConfig) zVar.a());
                    hVCallback.onSuccess();
                } else {
                    SDKInternalConfig.getInstance().setDefaultRemoteConfig(new DefaultRemoteConfig());
                    hVCallback.onError(new HVError(zVar.b(), "Could not fetch default remote configs"));
                }
            }
        });
    }

    public void getFeatureConfigs(final String str, final boolean z10, final Integer num, final HVCallback hVCallback) {
        String str2 = TAG;
        HVLogUtils.d(str2, "getFeatureConfigs() called with: sdkVersion = [" + str + "], callback = [" + hVCallback + "]");
        String s3FeatureConfigBaseUrl = SDKInternalConfig.getInstance().getS3FeatureConfigBaseUrl();
        final String str3 = s3FeatureConfigBaseUrl + "sdkV2.json";
        final String str4 = s3FeatureConfigBaseUrl + String.format("%s.json", str);
        HVLogUtils.d(str2, "getFeatureConfigs(): sdkJsonUrl: " + str3);
        HVLogUtils.d(str2, "getFeatureConfigs(): versionSpecificJsonUrl: " + str4);
        this.executorService.submit(new Runnable() { // from class: co.hyperverge.hypersnapsdk.data.remote.b
            @Override // java.lang.Runnable
            public final void run() {
                HVRemoteConfigRepo.this.lambda$getFeatureConfigs$0(num, z10, str3, str, str4, hVCallback);
            }
        });
    }

    public void getRemoteConfig(final String str, final boolean z10, boolean z11, final Integer num, final HVCallback hVCallback) {
        String str2 = TAG;
        HVLogUtils.d(str2, "getRemoteConfig() called with: appId = [" + str + "], isForCheckBranding = [" + z10 + "], callback = [" + hVCallback + "]");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://s3-ap-south-1.amazonaws.com/hv-central-config/sdk-client-config/hypersnapsdk/v1/");
        sb2.append(str);
        sb2.append(".json");
        String sb3 = sb2.toString();
        k configsMetadata = SPHelper.getConfigsMetadata(AppConstants.REMOTE_CONFIGS, str);
        HVLogUtils.d(str2, "getRemoteConfig: metadata: " + configsMetadata);
        if (!isS3ErrorStatusCode(getMetadataResponseCode(configsMetadata)) || hasCacheExpired(getMetadataCacheExpiryTimestamp(configsMetadata))) {
            ApiClient.getRemoteConfigService(this.cacheDir, num, z11).getRemoteConfig(sb3).v1(new InterfaceC0820d() { // from class: co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.2
                @Override // De.InterfaceC0820d
                public void onFailure(InterfaceC0818b<RemoteConfig> interfaceC0818b, Throwable th) {
                    HVLogUtils.d(HVRemoteConfigRepo.TAG, "getRemoteConfig(): onFailure() called with: call = [" + interfaceC0818b + "], t = [" + th + "]");
                    if (z10) {
                        HVRemoteConfigRepo.this.logAPICallError(true, Utils.getErrorMessage(th), 12);
                    }
                    SDKInternalConfig.getInstance().setRemoteConfig(new RemoteConfig());
                    hVCallback.onError(new HVError(12, "Could not get remote configs"));
                }

                @Override // De.InterfaceC0820d
                public void onResponse(InterfaceC0818b<RemoteConfig> interfaceC0818b, z<RemoteConfig> zVar) {
                    String l10;
                    HVLogUtils.d(HVRemoteConfigRepo.TAG, "getRemoteConfig(): onResponse() called with: call = [" + interfaceC0818b + "], response = [" + zVar + "]");
                    SPHelper.setConfigsMetadata(AppConstants.REMOTE_CONFIGS, str, Integer.valueOf(zVar.b()), Long.valueOf(System.currentTimeMillis()), num);
                    if (zVar.f()) {
                        HVRemoteConfigRepo.this.logAPICallSuccess(z10);
                        SDKInternalConfig.getInstance().setRemoteConfig((RemoteConfig) zVar.a());
                        hVCallback.onSuccess();
                        return;
                    }
                    if (zVar.d() != null) {
                        try {
                            l10 = zVar.d().l();
                        } catch (IOException e10) {
                            Log.e(getClass().getCanonicalName(), Utils.getErrorMessage(e10));
                        }
                        HVRemoteConfigRepo.this.logAPICallError(z10, l10, zVar.b());
                        SDKInternalConfig.getInstance().createDefaultMixpanelConfigs();
                        hVCallback.onError(new HVError(zVar.b(), "Could not get remote configs"));
                    }
                    l10 = "Server Error";
                    HVRemoteConfigRepo.this.logAPICallError(z10, l10, zVar.b());
                    SDKInternalConfig.getInstance().createDefaultMixpanelConfigs();
                    hVCallback.onError(new HVError(zVar.b(), "Could not get remote configs"));
                }
            });
        } else {
            SDKInternalConfig.getInstance().createDefaultMixpanelConfigs();
            hVCallback.onError(new HVError(403, "Could not get remote configs"));
        }
    }
}
