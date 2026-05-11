package com.reactnativecommunity.webview;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import java.util.List;
import java.util.Map;
import m5.C3652b;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends WebView implements LifecycleEventListener {

    /* renamed from: a, reason: collision with root package name */
    protected String f29297a;

    /* renamed from: b, reason: collision with root package name */
    protected String f29298b;

    /* renamed from: c, reason: collision with root package name */
    protected C0433d f29299c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f29300d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f29301e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f29302f;

    /* renamed from: g, reason: collision with root package name */
    protected String f29303g;

    /* renamed from: h, reason: collision with root package name */
    protected RNCWebViewMessagingModule f29304h;

    /* renamed from: i, reason: collision with root package name */
    protected f f29305i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f29306j;

    /* renamed from: k, reason: collision with root package name */
    private C3652b f29307k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f29308l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f29309m;

    /* renamed from: n, reason: collision with root package name */
    protected c f29310n;

    /* renamed from: o, reason: collision with root package name */
    protected List f29311o;

    /* renamed from: p, reason: collision with root package name */
    WebChromeClient f29312p;

    class a extends ActionMode.Callback2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMode.Callback f29313a;

        /* renamed from: com.reactnativecommunity.webview.d$a$a, reason: collision with other inner class name */
        class C0432a implements ValueCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MenuItem f29315a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WritableMap f29316b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActionMode f29317c;

            C0432a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f29315a = menuItem;
                this.f29316b = writableMap;
                this.f29317c = actionMode;
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String str2;
                Map map = (Map) d.this.f29311o.get(this.f29315a.getItemId());
                this.f29316b.putString("label", (String) map.get("label"));
                this.f29316b.putString("key", (String) map.get("key"));
                try {
                    str2 = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    str2 = BuildConfig.FLAVOR;
                }
                this.f29316b.putString("selectedText", str2);
                d dVar = d.this;
                dVar.g(dVar, new I9.a(o.a(d.this), this.f29316b));
                this.f29317c.finish();
            }
        }

        a(ActionMode.Callback callback) {
            this.f29313a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            d.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0432a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i10 = 0; i10 < d.this.f29311o.size(); i10++) {
                menu.add(0, i10, i10, (CharSequence) ((Map) d.this.f29311o.get(i10)).get("label"));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f29313a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f29319a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29320b;

        b(WebView webView, String str) {
            this.f29319a = webView;
            this.f29320b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = d.this.f29305i;
            if (fVar == null) {
                return;
            }
            WebView webView = this.f29319a;
            WritableMap a10 = fVar.a(webView, webView.getUrl());
            a10.putString("data", this.f29320b);
            d dVar = d.this;
            if (dVar.f29304h != null) {
                dVar.e(a10);
            } else {
                dVar.g(this.f29319a, new I9.g(o.a(this.f29319a), a10));
            }
        }
    }

    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private boolean f29322a = false;

        protected c() {
        }

        public boolean a() {
            return this.f29322a;
        }

        public void b(boolean z10) {
            this.f29322a = z10;
        }
    }

    /* renamed from: com.reactnativecommunity.webview.d$d, reason: collision with other inner class name */
    protected class C0433d {

        /* renamed from: a, reason: collision with root package name */
        private String f29323a = "RNCWebViewBridge";

        /* renamed from: b, reason: collision with root package name */
        d f29324b;

        /* renamed from: c, reason: collision with root package name */
        String f29325c;

        C0433d(d dVar) {
            this.f29324b = dVar;
        }

        public void a(String str) {
            this.f29325c = str;
        }

        @JavascriptInterface
        public String injectedObjectJson() {
            return this.f29325c;
        }

        @JavascriptInterface
        public void postMessage(String str) {
            if (this.f29324b.getMessagingEnabled()) {
                this.f29324b.i(str);
            } else {
                AbstractC1721a.J(this.f29323a, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public d(F0 f02) {
        super(f02);
        this.f29300d = true;
        this.f29301e = true;
        this.f29302f = false;
        this.f29306j = false;
        this.f29308l = false;
        this.f29309m = false;
        this.f29304h = (RNCWebViewMessagingModule) ((F0) getContext()).b().getJSModule(RNCWebViewMessagingModule.class);
        this.f29310n = new c();
    }

    public void a() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f29297a) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f29297a + ";\n})();");
    }

    public void b() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f29298b) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f29298b + ";\n})();");
    }

    protected void c() {
        setWebViewClient(null);
        destroy();
    }

    protected C0433d d(d dVar) {
        if (this.f29299c == null) {
            C0433d c0433d = new C0433d(dVar);
            this.f29299c = c0433d;
            addJavascriptInterface(c0433d, "ReactNativeWebView");
        }
        return this.f29299c;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.f29312p;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    protected void e(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f29303g);
        this.f29304h.onMessage(writableNativeMap);
    }

    protected boolean f(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f29303g);
        this.f29304h.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    protected void g(WebView webView, com.facebook.react.uimanager.events.d dVar) {
        L0.c(getThemedReactContext(), o.a(webView)).c(dVar);
    }

    public boolean getMessagingEnabled() {
        return this.f29302f;
    }

    public f getRNCWebViewClient() {
        return this.f29305i;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().b();
    }

    public F0 getThemedReactContext() {
        return (F0) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f29312p;
    }

    protected void h(String str) {
        evaluateJavascript(str, null);
    }

    public void i(String str) {
        getThemedReactContext();
        if (this.f29305i != null) {
            post(new b(this, str));
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", str);
        if (this.f29304h != null) {
            e(createMap);
        } else {
            g(this, new I9.g(o.a(this), createMap));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f29308l) {
            if (this.f29307k == null) {
                this.f29307k = new C3652b();
            }
            if (this.f29307k.c(i10, i11)) {
                g(this, com.facebook.react.views.scroll.g.e(o.a(this), com.facebook.react.views.scroll.h.SCROLL, i10, i11, this.f29307k.a(), this.f29307k.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f29306j) {
            g(this, new com.facebook.react.uimanager.events.c(o.a(this), i10, i11));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f29309m) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
        this.f29305i.c(aVar);
    }

    public void setHasScrollEvent(boolean z10) {
        this.f29308l = z10;
    }

    public void setIgnoreErrFailedForThisURL(String str) {
        this.f29305i.d(str);
    }

    public void setInjectedJavaScriptObject(String str) {
        if (getSettings().getJavaScriptEnabled()) {
            d(this).a(str);
        }
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f29311o = list;
    }

    public void setMessagingEnabled(boolean z10) {
        if (this.f29302f == z10) {
            return;
        }
        this.f29302f = z10;
        if (z10) {
            d(this);
        }
    }

    public void setNestedScrollEnabled(boolean z10) {
        this.f29309m = z10;
    }

    public void setSendContentSizeChangeEvents(boolean z10) {
        this.f29306j = z10;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f29312p = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof com.reactnativecommunity.webview.c) {
            ((com.reactnativecommunity.webview.c) webChromeClient).h(this.f29310n);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof f) {
            f fVar = (f) webViewClient;
            this.f29305i = fVar;
            fVar.e(this.f29310n);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return this.f29311o == null ? super.startActionMode(callback, i10) : super.startActionMode(new a(callback), i10);
    }
}
