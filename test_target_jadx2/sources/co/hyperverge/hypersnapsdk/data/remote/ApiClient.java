package co.hyperverge.hypersnapsdk.data.remote;

import De.A;
import Td.B;
import Td.C1227c;
import Td.C1228d;
import Td.C1231g;
import Td.F;
import Td.x;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.network.MixPanelApiInterface;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapSDKConfig;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ApiClient {
    private static final String IND_DOCS_PATTERN = "ind.docs.hyperverge.co";
    private static final String IND_FACE_ID_PATTERN = "ind.faceid.hyperverge.co";
    private static final String SHA_1 = "sha256/hHWXbXBGT2chaVwYyxEyGqtPJX9H/dh5HbOAz5CmclM=";
    private static final String SHA_2 = "sha256/8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=";
    private static final String SHA_3 = "sha256/Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=";
    private static final String SHA_4 = "sha256/C3U1B8/WXNaje+K8wU4TRgV0htiLVH9gikN4+kwR+P4=";
    private static final String STAGING_API_PATTERN = "staging.api.hyperverge.co";
    private static final String TAG = "co.hyperverge.hypersnapsdk.data.remote.ApiClient";
    private static final String WILD_CARD_PATTERN = "*.hyperverge.co";
    private static AnalyticsApiInterface analyticsApiInterface;
    private static ApiInterface apiService;
    private static DocsApiInterface docsService;
    private static MixPanelApiInterface mixPanelApiService;
    private static RemoteConfigApiInterface prefetchRemoteConfigApiInterfaceService;
    private static RemoteConfigApiInterface remoteConfigApiInterfaceService;
    private static SensorDataInterface sensorDataInterface;
    private static ApiInterface thomasAPIService;
    private final long CACHE_SIZE = 5242880;

    private ApiClient() {
    }

    private static void configureRemoteConfigTimeout(B.a aVar, boolean z10) {
        String str = TAG;
        HVLogUtils.d(str, "configureRemoteConfigTimeout() called with: client = [" + aVar + "]");
        HyperSnapSDKConfig hyperSnapSDKConfig = HyperSnapSDK.getInstance().getHyperSnapSDKConfig();
        Integer prefetchCallTimeout = z10 ? hyperSnapSDKConfig.getPrefetchCallTimeout() : hyperSnapSDKConfig.getInitCallTimeout();
        HVLogUtils.d(str, "configureRemoteConfigTimeout() - timeout value = [" + prefetchCallTimeout + "]");
        if (prefetchCallTimeout != null) {
            aVar.e(prefetchCallTimeout.intValue(), TimeUnit.SECONDS);
        } else {
            configureTimeouts(aVar);
        }
    }

    private static void configureTimeouts(B.a aVar) {
        String str = TAG;
        HVLogUtils.d(str, "configureTimeouts() called with: client = [" + aVar + "]");
        HyperSnapSDKConfig hyperSnapSDKConfig = HyperSnapSDK.getInstance().getHyperSnapSDKConfig();
        Integer callTimeOut = hyperSnapSDKConfig.getCallTimeOut();
        HVLogUtils.d(str, "configureTimeouts() - timeout value = [" + callTimeOut + "]");
        if (callTimeOut != null) {
            aVar.e(callTimeOut.intValue(), TimeUnit.SECONDS);
            return;
        }
        long readTimeOut = hyperSnapSDKConfig.getReadTimeOut();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.d0(readTimeOut, timeUnit);
        aVar.i0(hyperSnapSDKConfig.getWriteTimeOut(), timeUnit);
        aVar.g(hyperSnapSDKConfig.getConnectTimeOut(), timeUnit);
    }

    public static AnalyticsApiInterface getAnalyticsApiInterface() {
        HVLogUtils.d(TAG, "getAnalyticsApiInterface() called");
        if (analyticsApiInterface == null) {
            configureTimeouts(new B.a());
            analyticsApiInterface = (AnalyticsApiInterface) new A.b().c((SDKInternalConfig.getInstance() == null || SDKInternalConfig.getInstance().getFaceBaseUrl() == null) ? "https://ind-faceid.hyperverge.co/v1/" : SDKInternalConfig.getInstance().getFaceBaseUrl()).a(Ee.a.f()).d().b(AnalyticsApiInterface.class);
        }
        return analyticsApiInterface;
    }

    public static DocsApiInterface getDocsService() {
        HVLogUtils.d(TAG, "getDocsService() called");
        if (docsService == null) {
            B.a aVar = new B.a();
            configureTimeouts(aVar);
            docsService = (DocsApiInterface) new A.b().c(SDKInternalConfig.getInstance().getDocsBaseUrl() != null ? SDKInternalConfig.getInstance().getDocsBaseUrl() : "https://ind-docs.hyperverge.co/").f(aVar.c()).a(Ee.a.f()).d().b(DocsApiInterface.class);
        }
        return docsService;
    }

    @Deprecated
    public static MixPanelApiInterface getMixPanelService() {
        HVLogUtils.d(TAG, "getMixPanelService() called");
        if (mixPanelApiService == null) {
            HyperSnapSDKConfig hyperSnapSDKConfig = HyperSnapSDK.getInstance().getHyperSnapSDKConfig();
            B.a aVar = new B.a();
            long connectTimeOut = hyperSnapSDKConfig.getConnectTimeOut();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.g(connectTimeOut, timeUnit);
            aVar.i0(hyperSnapSDKConfig.getWriteTimeOut(), timeUnit);
            aVar.d0(hyperSnapSDKConfig.getReadTimeOut(), timeUnit);
            mixPanelApiService = (MixPanelApiInterface) new A.b().c((SDKInternalConfig.getInstance() == null || SDKInternalConfig.getInstance().getMixPanelBaseUrl() == null) ? "https://ind-faceid.hyperverge.co/v1/" : SDKInternalConfig.getInstance().getMixPanelBaseUrl()).a(Ee.a.f()).f(aVar.c()).d().b(MixPanelApiInterface.class);
        }
        return mixPanelApiService;
    }

    public static RemoteConfigApiInterface getRemoteConfigService(C1227c c1227c, Integer num, boolean z10) {
        HVLogUtils.d(TAG, "getRemoteConfigService() called with: cacheDir = [" + c1227c + "], cacheExpiryInSeconds = [" + num + "], isPrefetch = [" + z10 + "]");
        if (z10) {
            RemoteConfigApiInterface remoteConfigApiInterface = prefetchRemoteConfigApiInterfaceService;
            if (remoteConfigApiInterface != null) {
                return remoteConfigApiInterface;
            }
        } else {
            RemoteConfigApiInterface remoteConfigApiInterface2 = remoteConfigApiInterfaceService;
            if (remoteConfigApiInterface2 != null) {
                return remoteConfigApiInterface2;
            }
        }
        B.a aVar = new B.a();
        configureRemoteConfigTimeout(aVar, z10);
        final C1228d a10 = num != null ? new C1228d.a().j(num.intValue(), TimeUnit.SECONDS).a() : new C1228d.a().l().a();
        aVar.d(c1227c).b(new x() { // from class: co.hyperverge.hypersnapsdk.data.remote.a
            @Override // Td.x
            public final F intercept(x.a aVar2) {
                F lambda$getRemoteConfigService$0;
                lambda$getRemoteConfigService$0 = ApiClient.lambda$getRemoteConfigService$0(C1228d.this, aVar2);
                return lambda$getRemoteConfigService$0;
            }
        });
        A d10 = new A.b().c((SDKInternalConfig.getInstance() == null || SDKInternalConfig.getInstance().getS3RemoteConfigBaseUrl() == null) ? "https://s3-ap-south-1.amazonaws.com/" : SDKInternalConfig.getInstance().getS3RemoteConfigBaseUrl()).f(aVar.c()).a(Ee.a.f()).d();
        if (z10) {
            RemoteConfigApiInterface remoteConfigApiInterface3 = (RemoteConfigApiInterface) d10.b(RemoteConfigApiInterface.class);
            prefetchRemoteConfigApiInterfaceService = remoteConfigApiInterface3;
            return remoteConfigApiInterface3;
        }
        RemoteConfigApiInterface remoteConfigApiInterface4 = (RemoteConfigApiInterface) d10.b(RemoteConfigApiInterface.class);
        remoteConfigApiInterfaceService = remoteConfigApiInterface4;
        return remoteConfigApiInterface4;
    }

    public static SensorDataInterface getSensorDataInterface() {
        if (sensorDataInterface == null) {
            configureTimeouts(new B.a());
            sensorDataInterface = (SensorDataInterface) new A.b().c("https://armxjib6ub.execute-api.ap-southeast-1.amazonaws.com").a(Ee.a.f()).d().b(SensorDataInterface.class);
        }
        return sensorDataInterface;
    }

    public static ApiInterface getService() {
        HVLogUtils.d(TAG, "getService() called");
        if (apiService == null) {
            B.a aVar = new B.a();
            configureTimeouts(aVar);
            if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldEnableSSLPinning()) {
                aVar.f(new C1231g.a().a(IND_FACE_ID_PATTERN, SHA_1).a(IND_FACE_ID_PATTERN, SHA_2).a(IND_FACE_ID_PATTERN, SHA_3).a(IND_DOCS_PATTERN, SHA_1).a(IND_DOCS_PATTERN, SHA_2).a(IND_DOCS_PATTERN, SHA_3).a(STAGING_API_PATTERN, SHA_1).a(STAGING_API_PATTERN, SHA_2).a(STAGING_API_PATTERN, SHA_3).a(WILD_CARD_PATTERN, SHA_4).a(WILD_CARD_PATTERN, SHA_2).a(WILD_CARD_PATTERN, SHA_3).b());
            }
            apiService = (ApiInterface) new A.b().c((SDKInternalConfig.getInstance() == null || SDKInternalConfig.getInstance().getFaceBaseUrl() == null) ? "https://ind-faceid.hyperverge.co/v1/" : SDKInternalConfig.getInstance().getFaceBaseUrl()).f(aVar.c()).a(Ee.a.f()).d().b(ApiInterface.class);
        }
        return apiService;
    }

    public static ApiInterface getThomasAPIService() {
        HVLogUtils.d(TAG, "getConsentService() called");
        if (thomasAPIService == null) {
            B.a aVar = new B.a();
            configureTimeouts(aVar);
            thomasAPIService = (ApiInterface) new A.b().c("https://ind-thomas.hyperverge.co/").f(aVar.c()).a(Ee.a.f()).d().b(ApiInterface.class);
        }
        return thomasAPIService;
    }

    private static F handleResponseWithCache(x.a aVar, C1228d c1228d) {
        return aVar.a(aVar.t()).t().q("Pragma").q(AppConstants.S3_CACHE_CONTROL).i(AppConstants.S3_CACHE_CONTROL, c1228d.toString()).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F lambda$getRemoteConfigService$0(C1228d c1228d, x.a aVar) {
        return handleResponseWithCache(aVar, c1228d);
    }
}
