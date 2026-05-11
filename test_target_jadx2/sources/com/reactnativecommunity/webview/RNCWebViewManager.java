package com.reactnativecommunity.webview;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import h5.B;
import h5.C;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import v4.AbstractC4929e;

@K4.a(name = "RNCWebView")
/* loaded from: classes2.dex */
public class RNCWebViewManager extends ViewGroupManager<o> implements C {
    private final c1 mDelegate = new B(this);
    private final j mRNCWebViewManagerImpl = new j();

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return this.mRNCWebViewManagerImpl.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = AbstractC4929e.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", AbstractC4929e.d("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", AbstractC4929e.d("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", AbstractC4929e.d("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", AbstractC4929e.d("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", AbstractC4929e.d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", AbstractC4929e.d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(com.facebook.react.views.scroll.h.getJSEventName(com.facebook.react.views.scroll.h.SCROLL), AbstractC4929e.d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", AbstractC4929e.d("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", AbstractC4929e.d("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", AbstractC4929e.d("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", AbstractC4929e.d("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // h5.C
    public void setAllowingReadAccessToURL(o oVar, String str) {
    }

    @Override // h5.C
    public void setAllowsAirPlayForMediaPlayback(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setAllowsBackForwardNavigationGestures(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setAllowsInlineMediaPlayback(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setAllowsLinkPreview(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setAutoManageStatusBarEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setAutomaticallyAdjustContentInsets(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setBounces(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setContentInset(o oVar, ReadableMap readableMap) {
    }

    @Override // h5.C
    public void setContentInsetAdjustmentBehavior(o oVar, String str) {
    }

    @Override // h5.C
    public void setContentMode(o oVar, String str) {
    }

    @Override // h5.C
    public void setDataDetectorTypes(o oVar, ReadableArray readableArray) {
    }

    @Override // h5.C
    public void setDecelerationRate(o oVar, double d10) {
    }

    @Override // h5.C
    public void setDirectionalLockEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setEnableApplePay(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setFraudulentWebsiteWarningEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setHasOnFileDownload(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setHideKeyboardAccessoryView(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setKeyboardDisplayRequiresUserAction(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setLimitsNavigationsToAppBoundDomains(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setMediaCapturePermissionGrantType(o oVar, String str) {
    }

    @Override // h5.C
    public void setPagingEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setPullToRefreshEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setScrollEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setSharedCookiesEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    @Z4.a(name = "suppressMenuItems ")
    public void setSuppressMenuItems(o oVar, ReadableArray readableArray) {
    }

    @Override // h5.C
    public void setTextInteractionEnabled(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setUseSharedProcessPool(o oVar, boolean z10) {
    }

    @Override // h5.C
    public void setWebviewInstanceKey(o oVar, String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(F0 f02, o oVar) {
        oVar.getWebView().setWebViewClient(new f());
    }

    @Override // h5.C
    public void clearCache(o oVar, boolean z10) {
        oVar.getWebView().clearCache(z10);
    }

    @Override // h5.C
    public void clearFormData(o oVar) {
        oVar.getWebView().clearFormData();
    }

    @Override // h5.C
    public void clearHistory(o oVar) {
        oVar.getWebView().clearHistory();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public o createViewInstance(F0 f02) {
        return this.mRNCWebViewManagerImpl.d(f02);
    }

    @Override // h5.C
    public void goBack(o oVar) {
        oVar.getWebView().goBack();
    }

    @Override // h5.C
    public void goForward(o oVar) {
        oVar.getWebView().goForward();
    }

    @Override // h5.C
    public void injectJavaScript(o oVar, String str) {
        oVar.getWebView().h(str);
    }

    @Override // h5.C
    public void loadUrl(o oVar, String str) {
        oVar.getWebView().loadUrl(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(o oVar) {
        this.mRNCWebViewManagerImpl.k(oVar);
        super.onDropViewInstance((RNCWebViewManager) oVar);
    }

    @Override // h5.C
    public void postMessage(o oVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            oVar.getWebView().h("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(o oVar, String str, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.l(oVar, str, readableArray);
        super.receiveCommand((RNCWebViewManager) oVar, str, readableArray);
    }

    @Override // h5.C
    public void reload(o oVar) {
        oVar.getWebView().reload();
    }

    @Override // h5.C
    public void requestFocus(o oVar) {
        oVar.requestFocus();
    }

    @Override // h5.C
    @Z4.a(name = "allowFileAccess")
    public void setAllowFileAccess(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.m(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.n(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.o(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.p(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.q(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "androidLayerType")
    public void setAndroidLayerType(o oVar, String str) {
        this.mRNCWebViewManagerImpl.r(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.s(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "basicAuthCredential")
    public void setBasicAuthCredential(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.t(oVar, readableMap);
    }

    @Override // h5.C
    @Z4.a(name = "cacheEnabled")
    public void setCacheEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.u(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "cacheMode")
    public void setCacheMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.v(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "domStorageEnabled")
    public void setDomStorageEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.w(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "downloadingMessage")
    public void setDownloadingMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.x(str);
    }

    @Override // h5.C
    @Z4.a(name = "forceDarkOn")
    public void setForceDarkOn(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.y(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "geolocationEnabled")
    public void setGeolocationEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.z(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.A(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "hasOnScroll")
    public void setHasOnScroll(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.B(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "incognito")
    public void setIncognito(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.C(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "injectedJavaScript")
    public void setInjectedJavaScript(o oVar, String str) {
        this.mRNCWebViewManagerImpl.D(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(o oVar, String str) {
        this.mRNCWebViewManagerImpl.E(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.F(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.G(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(o oVar, String str) {
        this.mRNCWebViewManagerImpl.H(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.I(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.J(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.K(str);
    }

    @Override // h5.C
    @Z4.a(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.L(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "menuItems")
    public void setMenuItems(o oVar, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.M(oVar, readableArray);
    }

    @Override // h5.C
    @Z4.a(name = "messagingEnabled")
    public void setMessagingEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.N(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "messagingModuleName")
    public void setMessagingModuleName(o oVar, String str) {
        this.mRNCWebViewManagerImpl.O(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "minimumFontSize")
    public void setMinimumFontSize(o oVar, int i10) {
        this.mRNCWebViewManagerImpl.P(oVar, i10);
    }

    @Override // h5.C
    @Z4.a(name = "mixedContentMode")
    public void setMixedContentMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.Q(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.R(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "newSource")
    public void setNewSource(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.a0(oVar, readableMap, true);
    }

    @Override // h5.C
    @Z4.a(name = "overScrollMode")
    public void setOverScrollMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.S(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.T(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "scalesPageToFit")
    public void setScalesPageToFit(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.U(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.V(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.W(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.X(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.Y(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.Z(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "textZoom")
    public void setTextZoom(o oVar, int i10) {
        this.mRNCWebViewManagerImpl.b0(oVar, i10);
    }

    @Override // h5.C
    @Z4.a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.c0(oVar, z10);
    }

    @Override // h5.C
    @Z4.a(name = "userAgent")
    public void setUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.d0(oVar, str);
    }

    @Override // h5.C
    @Z4.a(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(o oVar, boolean z10) {
        this.mRNCWebViewManagerImpl.f0(oVar, z10);
    }

    @Override // h5.C
    public void stopLoading(o oVar) {
        oVar.getWebView().stopLoading();
    }
}
