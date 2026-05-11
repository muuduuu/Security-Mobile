package w1;

import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5022d implements InterfaceC5019a {
    VISUAL_STATE_CALLBACK("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 23),
    OFF_SCREEN_PRERASTER("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 23),
    SAFE_BROWSING_ENABLE("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 26),
    DISABLED_ACTION_MODE_MENU_ITEMS("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 24),
    START_SAFE_BROWSING("START_SAFE_BROWSING", "START_SAFE_BROWSING", 27),
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 27),
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 27),
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 27),
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 27),
    SAFE_BROWSING_PRIVACY_POLICY_URL("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 27),
    SERVICE_WORKER_BASIC_USAGE("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 24),
    SERVICE_WORKER_CACHE_MODE("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 24),
    SERVICE_WORKER_CONTENT_ACCESS("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 24),
    SERVICE_WORKER_FILE_ACCESS("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 24),
    SERVICE_WORKER_BLOCK_NETWORK_LOADS("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 24),
    SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 24),
    RECEIVE_WEB_RESOURCE_ERROR("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 23),
    RECEIVE_HTTP_ERROR("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 23),
    SHOULD_OVERRIDE_WITH_REDIRECTS("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 24),
    SAFE_BROWSING_HIT("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 27),
    WEB_RESOURCE_REQUEST_IS_REDIRECT("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 24),
    WEB_RESOURCE_ERROR_GET_DESCRIPTION("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 23),
    WEB_RESOURCE_ERROR_GET_CODE("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 23),
    SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 27),
    SAFE_BROWSING_RESPONSE_PROCEED("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 27),
    SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 27),
    WEB_MESSAGE_PORT_POST_MESSAGE("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 23),
    WEB_MESSAGE_PORT_CLOSE("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 23),
    WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 23),
    CREATE_WEB_MESSAGE_CHANNEL("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 23),
    POST_WEB_MESSAGE("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 23),
    WEB_MESSAGE_CALLBACK_ON_MESSAGE("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 23),
    GET_WEB_VIEW_CLIENT("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 26),
    GET_WEB_CHROME_CLIENT("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 26),
    GET_WEB_VIEW_RENDERER("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 29),
    WEB_VIEW_RENDERER_TERMINATE("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 29),
    TRACING_CONTROLLER_BASIC_USAGE("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 28),
    WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 29),
    PROXY_OVERRIDE("PROXY_OVERRIDE", "PROXY_OVERRIDE:3"),
    SUPPRESS_ERROR_PAGE("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE"),
    MULTI_PROCESS("MULTI_PROCESS", "MULTI_PROCESS_QUERY"),
    FORCE_DARK("FORCE_DARK", "FORCE_DARK"),
    FORCE_DARK_STRATEGY("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR"),
    WEB_MESSAGE_LISTENER("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER"),
    DOCUMENT_START_SCRIPT("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    private static final int NOT_SUPPORTED_BY_FRAMEWORK = -1;
    private final String mInternalFeatureValue;
    private final int mOsVersion;
    private final String mPublicFeatureValue;

    /* renamed from: w1.d$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final Set f44275a = new HashSet(Arrays.asList(AbstractC5024f.d().a()));
    }

    EnumC5022d(String str, String str2) {
        this(str, str2, -1);
    }

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static Set<String> getWebViewApkFeaturesForTesting() {
        return a.f44275a;
    }

    public static boolean isSupported(String str) {
        HashSet hashSet = new HashSet();
        for (EnumC5022d enumC5022d : values()) {
            hashSet.add(enumC5022d);
        }
        return isSupported(str, hashSet);
    }

    @Override // w1.InterfaceC5019a
    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    public boolean isSupportedByFramework() {
        int i10 = this.mOsVersion;
        return i10 != -1 && Build.VERSION.SDK_INT >= i10;
    }

    public boolean isSupportedByWebView() {
        return ye.a.b(a.f44275a, this.mInternalFeatureValue);
    }

    EnumC5022d(String str, String str2, int i10) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        this.mOsVersion = i10;
    }

    public static boolean isSupported(String str, Collection<InterfaceC5019a> collection) {
        HashSet hashSet = new HashSet();
        for (InterfaceC5019a interfaceC5019a : collection) {
            if (interfaceC5019a.getPublicFeatureName().equals(str)) {
                hashSet.add(interfaceC5019a);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5019a) it.next()).isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    @Override // w1.InterfaceC5019a
    public boolean isSupported() {
        return isSupportedByFramework() || isSupportedByWebView();
    }
}
