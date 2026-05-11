package h5;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class B extends AbstractC1943g {
    public B(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "goBack":
                ((C) this.f22417a).goBack(view);
                break;
            case "stopLoading":
                ((C) this.f22417a).stopLoading(view);
                break;
            case "reload":
                ((C) this.f22417a).reload(view);
                break;
            case "clearCache":
                ((C) this.f22417a).clearCache(view, readableArray.getBoolean(0));
                break;
            case "goForward":
                ((C) this.f22417a).goForward(view);
                break;
            case "clearFormData":
                ((C) this.f22417a).clearFormData(view);
                break;
            case "loadUrl":
                ((C) this.f22417a).loadUrl(view, readableArray.getString(0));
                break;
            case "clearHistory":
                ((C) this.f22417a).clearHistory(view);
                break;
            case "requestFocus":
                ((C) this.f22417a).requestFocus(view);
                break;
            case "postMessage":
                ((C) this.f22417a).postMessage(view, readableArray.getString(0));
                break;
            case "injectJavaScript":
                ((C) this.f22417a).injectJavaScript(view, readableArray.getString(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "allowFileAccessFromFileURLs":
                ((C) this.f22417a).setAllowFileAccessFromFileURLs(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sharedCookiesEnabled":
                ((C) this.f22417a).setSharedCookiesEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowsProtectedMedia":
                ((C) this.f22417a).setAllowsProtectedMedia(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "saveFormDataDisabled":
                ((C) this.f22417a).setSaveFormDataDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "textInteractionEnabled":
                ((C) this.f22417a).setTextInteractionEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "injectedJavaScriptBeforeContentLoaded":
                ((C) this.f22417a).setInjectedJavaScriptBeforeContentLoaded(view, obj != null ? (String) obj : null);
                break;
            case "directionalLockEnabled":
                ((C) this.f22417a).setDirectionalLockEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "javaScriptEnabled":
                ((C) this.f22417a).setJavaScriptEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "messagingEnabled":
                ((C) this.f22417a).setMessagingEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "dataDetectorTypes":
                ((C) this.f22417a).setDataDetectorTypes(view, (ReadableArray) obj);
                break;
            case "menuItems":
                ((C) this.f22417a).setMenuItems(view, (ReadableArray) obj);
                break;
            case "incognito":
                ((C) this.f22417a).setIncognito(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowingReadAccessToURL":
                ((C) this.f22417a).setAllowingReadAccessToURL(view, obj != null ? (String) obj : null);
                break;
            case "overScrollMode":
                ((C) this.f22417a).setOverScrollMode(view, obj != null ? (String) obj : null);
                break;
            case "scrollEnabled":
                ((C) this.f22417a).setScrollEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "keyboardDisplayRequiresUserAction":
                ((C) this.f22417a).setKeyboardDisplayRequiresUserAction(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "domStorageEnabled":
                ((C) this.f22417a).setDomStorageEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowsLinkPreview":
                ((C) this.f22417a).setAllowsLinkPreview(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "useSharedProcessPool":
                ((C) this.f22417a).setUseSharedProcessPool(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "textZoom":
                ((C) this.f22417a).setTextZoom(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "showsVerticalScrollIndicator":
                ((C) this.f22417a).setShowsVerticalScrollIndicator(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "forceDarkOn":
                ((C) this.f22417a).setForceDarkOn(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "minimumFontSize":
                ((C) this.f22417a).setMinimumFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "hideKeyboardAccessoryView":
                ((C) this.f22417a).setHideKeyboardAccessoryView(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowUniversalAccessFromFileURLs":
                ((C) this.f22417a).setAllowUniversalAccessFromFileURLs(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "mediaCapturePermissionGrantType":
                ((C) this.f22417a).setMediaCapturePermissionGrantType(view, (String) obj);
                break;
            case "newSource":
                ((C) this.f22417a).setNewSource(view, (ReadableMap) obj);
                break;
            case "hasOnFileDownload":
                ((C) this.f22417a).setHasOnFileDownload(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "cacheMode":
                ((C) this.f22417a).setCacheMode(view, (String) obj);
                break;
            case "pagingEnabled":
                ((C) this.f22417a).setPagingEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "contentMode":
                ((C) this.f22417a).setContentMode(view, (String) obj);
                break;
            case "messagingModuleName":
                ((C) this.f22417a).setMessagingModuleName(view, obj != null ? (String) obj : null);
                break;
            case "hasOnOpenWindowEvent":
                ((C) this.f22417a).setHasOnOpenWindowEvent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "javaScriptCanOpenWindowsAutomatically":
                ((C) this.f22417a).setJavaScriptCanOpenWindowsAutomatically(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "setDisplayZoomControls":
                ((C) this.f22417a).setSetDisplayZoomControls(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowsFullscreenVideo":
                ((C) this.f22417a).setAllowsFullscreenVideo(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "nestedScrollEnabled":
                ((C) this.f22417a).setNestedScrollEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "injectedJavaScriptBeforeContentLoadedForMainFrameOnly":
                ((C) this.f22417a).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hasOnScroll":
                ((C) this.f22417a).setHasOnScroll(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "bounces":
                ((C) this.f22417a).setBounces(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "setSupportMultipleWindows":
                ((C) this.f22417a).setSetSupportMultipleWindows(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "lackPermissionToDownloadMessage":
                ((C) this.f22417a).setLackPermissionToDownloadMessage(view, obj != null ? (String) obj : null);
                break;
            case "injectedJavaScript":
                ((C) this.f22417a).setInjectedJavaScript(view, obj != null ? (String) obj : null);
                break;
            case "automaticallyAdjustContentInsets":
                ((C) this.f22417a).setAutomaticallyAdjustContentInsets(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "userAgent":
                ((C) this.f22417a).setUserAgent(view, obj != null ? (String) obj : null);
                break;
            case "allowsInlineMediaPlayback":
                ((C) this.f22417a).setAllowsInlineMediaPlayback(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "cacheEnabled":
                ((C) this.f22417a).setCacheEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "injectedJavaScriptForMainFrameOnly":
                ((C) this.f22417a).setInjectedJavaScriptForMainFrameOnly(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "webviewDebuggingEnabled":
                ((C) this.f22417a).setWebviewDebuggingEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "injectedJavaScriptObject":
                ((C) this.f22417a).setInjectedJavaScriptObject(view, obj != null ? (String) obj : null);
                break;
            case "applicationNameForUserAgent":
                ((C) this.f22417a).setApplicationNameForUserAgent(view, obj != null ? (String) obj : null);
                break;
            case "mixedContentMode":
                ((C) this.f22417a).setMixedContentMode(view, (String) obj);
                break;
            case "webviewInstanceKey":
                ((C) this.f22417a).setWebviewInstanceKey(view, obj != null ? (String) obj : null);
                break;
            case "contentInset":
                ((C) this.f22417a).setContentInset(view, (ReadableMap) obj);
                break;
            case "allowsBackForwardNavigationGestures":
                ((C) this.f22417a).setAllowsBackForwardNavigationGestures(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowsAirPlayForMediaPlayback":
                ((C) this.f22417a).setAllowsAirPlayForMediaPlayback(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowFileAccess":
                ((C) this.f22417a).setAllowFileAccess(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "limitsNavigationsToAppBoundDomains":
                ((C) this.f22417a).setLimitsNavigationsToAppBoundDomains(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "setBuiltInZoomControls":
                ((C) this.f22417a).setSetBuiltInZoomControls(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "pullToRefreshEnabled":
                ((C) this.f22417a).setPullToRefreshEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "fraudulentWebsiteWarningEnabled":
                ((C) this.f22417a).setFraudulentWebsiteWarningEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "geolocationEnabled":
                ((C) this.f22417a).setGeolocationEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "downloadingMessage":
                ((C) this.f22417a).setDownloadingMessage(view, obj != null ? (String) obj : null);
                break;
            case "basicAuthCredential":
                ((C) this.f22417a).setBasicAuthCredential(view, (ReadableMap) obj);
                break;
            case "enableApplePay":
                ((C) this.f22417a).setEnableApplePay(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "mediaPlaybackRequiresUserAction":
                ((C) this.f22417a).setMediaPlaybackRequiresUserAction(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "thirdPartyCookiesEnabled":
                ((C) this.f22417a).setThirdPartyCookiesEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "autoManageStatusBarEnabled":
                ((C) this.f22417a).setAutoManageStatusBarEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "androidLayerType":
                ((C) this.f22417a).setAndroidLayerType(view, (String) obj);
                break;
            case "suppressMenuItems":
                ((C) this.f22417a).setSuppressMenuItems(view, (ReadableArray) obj);
                break;
            case "showsHorizontalScrollIndicator":
                ((C) this.f22417a).setShowsHorizontalScrollIndicator(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "scalesPageToFit":
                ((C) this.f22417a).setScalesPageToFit(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "decelerationRate":
                ((C) this.f22417a).setDecelerationRate(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "contentInsetAdjustmentBehavior":
                ((C) this.f22417a).setContentInsetAdjustmentBehavior(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
