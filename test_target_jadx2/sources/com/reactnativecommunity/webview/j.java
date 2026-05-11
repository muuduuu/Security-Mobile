package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.F0;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;
import v1.AbstractC4909b;
import v1.AbstractC4910c;
import v4.AbstractC4929e;
import x4.C5109a;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: A, reason: collision with root package name */
    public static final a f29334A = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private boolean f29337c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29338d;

    /* renamed from: e, reason: collision with root package name */
    private String f29339e;

    /* renamed from: f, reason: collision with root package name */
    private String f29340f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29341g;

    /* renamed from: h, reason: collision with root package name */
    private String f29342h;

    /* renamed from: i, reason: collision with root package name */
    private String f29343i;

    /* renamed from: a, reason: collision with root package name */
    private final String f29335a = "RNCWebViewManagerImpl";

    /* renamed from: b, reason: collision with root package name */
    private g f29336b = new g() { // from class: com.reactnativecommunity.webview.i
        @Override // com.reactnativecommunity.webview.g
        public final void a(WebView webView) {
            j.j(webView);
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private final String f29344j = "UTF-8";

    /* renamed from: k, reason: collision with root package name */
    private final String f29345k = "text/html";

    /* renamed from: l, reason: collision with root package name */
    private final String f29346l = "POST";

    /* renamed from: m, reason: collision with root package name */
    private final String f29347m = "about:blank";

    /* renamed from: n, reason: collision with root package name */
    private final String f29348n = "Downloading";

    /* renamed from: o, reason: collision with root package name */
    private final String f29349o = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";

    /* renamed from: p, reason: collision with root package name */
    private final int f29350p = 1;

    /* renamed from: q, reason: collision with root package name */
    private final int f29351q = 2;

    /* renamed from: r, reason: collision with root package name */
    private final int f29352r = 3;

    /* renamed from: s, reason: collision with root package name */
    private final int f29353s = 4;

    /* renamed from: t, reason: collision with root package name */
    private final int f29354t = 5;

    /* renamed from: u, reason: collision with root package name */
    private final int f29355u = 6;

    /* renamed from: v, reason: collision with root package name */
    private final int f29356v = 7;

    /* renamed from: w, reason: collision with root package name */
    private final int f29357w = 8;

    /* renamed from: x, reason: collision with root package name */
    private final int f29358x = 1000;

    /* renamed from: y, reason: collision with root package name */
    private final int f29359y = 1001;

    /* renamed from: z, reason: collision with root package name */
    private final int f29360z = 1002;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends com.reactnativecommunity.webview.c {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    public static final class c extends com.reactnativecommunity.webview.c {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Activity f29361o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f29362p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Activity activity, int i10) {
            super(dVar);
            this.f29361o = activity;
            this.f29362p = i10;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (this.f29283b == null) {
                return;
            }
            ViewGroup c10 = c();
            if (c10.getRootView() != this.f29282a.getRootView()) {
                this.f29282a.getRootView().setVisibility(0);
            } else {
                this.f29282a.setVisibility(0);
            }
            this.f29361o.getWindow().clearFlags(512);
            c10.removeView(this.f29283b);
            this.f29284c.onCustomViewHidden();
            this.f29283b = null;
            this.f29284c = null;
            this.f29361o.setRequestedOrientation(this.f29362p);
            this.f29282a.getThemedReactContext().removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.f29283b != null) {
                callback.onCustomViewHidden();
                return;
            }
            this.f29283b = view;
            this.f29284c = callback;
            this.f29361o.setRequestedOrientation(-1);
            this.f29283b.setSystemUiVisibility(7942);
            this.f29361o.getWindow().setFlags(512, 512);
            this.f29283b.setBackgroundColor(-16777216);
            ViewGroup c10 = c();
            c10.addView(this.f29283b, com.reactnativecommunity.webview.c.f29281n);
            if (c10.getRootView() != this.f29282a.getRootView()) {
                this.f29282a.getRootView().setVisibility(8);
            } else {
                this.f29282a.setVisibility(8);
            }
            this.f29282a.getThemedReactContext().addLifecycleEventListener(this);
        }
    }

    private final void e0(o oVar) {
        d webView = oVar.getWebView();
        if (this.f29342h != null) {
            webView.getSettings().setUserAgentString(this.f29342h);
        } else if (this.f29343i != null) {
            webView.getSettings().setUserAgentString(this.f29343i);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d webView, j this$0, String str, String str2, String str3, String str4, long j10) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        webView.setIgnoreErrFailedForThisURL(str);
        RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) webView.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
        if (rNCWebViewModule == null) {
            return;
        }
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String a10 = p.a(str, str3, str4);
            Intrinsics.d(a10);
            String replace = k.a().replace(a10, "_");
            String str5 = "Downloading " + replace;
            try {
                URL url = new URL(str);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e10) {
                Log.w(this$0.f29335a, "Error getting cookie for DownloadManager", e10);
            }
            request.addRequestHeader("User-Agent", str2);
            request.setTitle(replace);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, replace);
            rNCWebViewModule.setDownloadRequest(request);
            if (rNCWebViewModule.grantFileDownloaderPermissions(this$0.h(), this$0.i())) {
                rNCWebViewModule.downloadFile(this$0.h());
            }
        } catch (IllegalArgumentException e11) {
            Log.w(this$0.f29335a, "Unsupported URI, aborting download", e11);
        }
    }

    private final void g0(d dVar) {
        Activity currentActivity = dVar.getThemedReactContext().getCurrentActivity();
        if (this.f29337c && currentActivity != null) {
            c cVar = new c(dVar, currentActivity, currentActivity.getRequestedOrientation());
            cVar.f(this.f29338d);
            cVar.g(this.f29341g);
            dVar.setWebChromeClient(cVar);
            return;
        }
        com.reactnativecommunity.webview.c cVar2 = (com.reactnativecommunity.webview.c) dVar.getWebChromeClient();
        if (cVar2 != null) {
            cVar2.onHideCustomView();
        }
        b bVar = new b(dVar);
        bVar.f(this.f29338d);
        bVar.g(this.f29341g);
        dVar.setWebChromeClient(bVar);
    }

    private final String h() {
        String str = this.f29339e;
        return str == null ? this.f29348n : str;
    }

    private final String i() {
        String str = this.f29340f;
        return str == null ? this.f29349o : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WebView webView) {
    }

    public final void A(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.f29341g = z10;
        g0(webView);
    }

    public final void B(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHasScrollEvent(z10);
    }

    public final void C(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (z10) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    public final void D(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f29297a = str;
    }

    public final void E(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f29298b = str;
    }

    public final void F(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f29301e = z10;
    }

    public final void G(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f29300d = z10;
    }

    public final void H(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setInjectedJavaScriptObject(str);
    }

    public final void I(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
    }

    public final void J(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptEnabled(z10);
    }

    public final void K(String str) {
        this.f29340f = str;
    }

    public final void L(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z10);
    }

    public final void M(o viewWrapper, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (readableArray == null) {
            webView.setMenuCustomItems(null);
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        Intrinsics.e(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        webView.setMenuCustomItems(arrayList);
    }

    public final void N(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setMessagingEnabled(z10);
    }

    public final void O(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f29303g = str;
    }

    public final void P(o viewWrapper, int i10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMinimumFontSize(i10);
    }

    public final void Q(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (str == null || Intrinsics.b("never", str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (Intrinsics.b("always", str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if (Intrinsics.b("compatibility", str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    public final void R(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f29309m = z10;
    }

    public final void S(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        int i10 = 0;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -1414557169) {
                str.equals("always");
            } else if (hashCode != 104712844) {
                if (hashCode == 951530617 && str.equals("content")) {
                    i10 = 1;
                }
            } else if (str.equals("never")) {
                i10 = 2;
            }
        }
        webView.setOverScrollMode(i10);
    }

    public final void T(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSaveFormData(!z10);
    }

    public final void U(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z10);
        webView.getSettings().setUseWideViewPort(z10);
    }

    public final void V(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setBuiltInZoomControls(z10);
    }

    public final void W(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDisplayZoomControls(z10);
    }

    public final void X(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSupportMultipleWindows(z10);
    }

    public final void Y(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHorizontalScrollBarEnabled(z10);
    }

    public final void Z(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setVerticalScrollBarEnabled(z10);
    }

    public final void a0(o viewWrapper, ReadableMap readableMap, boolean z10) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (readableMap != null) {
            boolean hasKey = readableMap.hasKey("html");
            String str = BuildConfig.FLAVOR;
            if (hasKey) {
                String string = readableMap.getString("html");
                if (readableMap.hasKey("baseUrl")) {
                    str = readableMap.getString("baseUrl");
                }
                Intrinsics.d(string);
                webView.loadDataWithBaseURL(str, string, this.f29345k, this.f29344j, null);
                return;
            }
            if (readableMap.hasKey("uri")) {
                String string2 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !Intrinsics.b(url, string2)) {
                    if (readableMap.hasKey("method") && StringsKt.r(readableMap.getString("method"), this.f29346l, true)) {
                        if (readableMap.hasKey("body")) {
                            String string3 = readableMap.getString("body");
                            try {
                                Intrinsics.d(string3);
                                Charset forName = Charset.forName("UTF-8");
                                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                                bArr = string3.getBytes(forName);
                                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
                            } catch (UnsupportedEncodingException unused) {
                                Intrinsics.d(string3);
                                bArr = string3.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
                            }
                        } else {
                            bArr = null;
                        }
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        Intrinsics.d(string2);
                        webView.postUrl(string2, bArr);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        if (z10) {
                            ReadableArray array = readableMap.getArray("headers");
                            Intrinsics.d(array);
                            Iterator<Object> it = array.toArrayList().iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                Intrinsics.e(next, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                                HashMap hashMap2 = (HashMap) next;
                                String str2 = (String) hashMap2.get("name");
                                if (str2 == null) {
                                    str2 = BuildConfig.FLAVOR;
                                }
                                String str3 = (String) hashMap2.get("value");
                                if (str3 == null) {
                                    str3 = BuildConfig.FLAVOR;
                                }
                                Locale ENGLISH = Locale.ENGLISH;
                                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                                String lowerCase = str2.toLowerCase(ENGLISH);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (Intrinsics.b("user-agent", lowerCase)) {
                                    webView.getSettings().setUserAgentString(str3);
                                } else {
                                    hashMap.put(str2, str3);
                                }
                            }
                        } else {
                            ReadableMap map = readableMap.getMap("headers");
                            Intrinsics.d(map);
                            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                            while (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                Locale ENGLISH2 = Locale.ENGLISH;
                                Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
                                String lowerCase2 = nextKey.toLowerCase(ENGLISH2);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                if (Intrinsics.b("user-agent", lowerCase2)) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                } else {
                                    hashMap.put(nextKey, map.getString(nextKey));
                                }
                            }
                        }
                    }
                    Intrinsics.d(string2);
                    webView.loadUrl(string2, hashMap);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(this.f29347m);
    }

    public final void b0(o viewWrapper, int i10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setTextZoom(i10);
    }

    public final d c(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new d(context);
    }

    public final void c0(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(viewWrapper.getWebView(), z10);
    }

    public final o d(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return e(context, c(context));
    }

    public final void d0(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        this.f29342h = str;
        e0(viewWrapper);
    }

    public final o e(F0 context, final d webView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        g0(webView);
        context.addLifecycleEventListener(webView);
        this.f29336b.a(webView);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (C5109a.f44775b) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.setDownloadListener(new DownloadListener() { // from class: com.reactnativecommunity.webview.h
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                j.f(d.this, this, str, str2, str3, str4, j10);
            }
        });
        return new o(context, webView);
    }

    public final void f0(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        WebView.setWebContentsDebuggingEnabled(z10);
    }

    public final Map g() {
        return AbstractC4929e.a().b("goBack", Integer.valueOf(this.f29350p)).b("goForward", Integer.valueOf(this.f29351q)).b("reload", Integer.valueOf(this.f29352r)).b("stopLoading", Integer.valueOf(this.f29353s)).b("postMessage", Integer.valueOf(this.f29354t)).b("injectJavaScript", Integer.valueOf(this.f29355u)).b("loadUrl", Integer.valueOf(this.f29356v)).b("requestFocus", Integer.valueOf(this.f29357w)).b("clearFormData", Integer.valueOf(this.f29358x)).b("clearCache", Integer.valueOf(this.f29359y)).b("clearHistory", Integer.valueOf(this.f29360z)).a();
    }

    public final void k(o viewWrapper) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.c();
        webView.f29312p = null;
    }

    public final void l(o viewWrapper, String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(args, "args");
        d webView = viewWrapper.getWebView();
        switch (commandId.hashCode()) {
            case -1241591313:
                if (commandId.equals("goBack")) {
                    webView.goBack();
                    return;
                }
                return;
            case -948122918:
                if (commandId.equals("stopLoading")) {
                    webView.stopLoading();
                    return;
                }
                return;
            case -934641255:
                if (commandId.equals("reload")) {
                    webView.reload();
                    return;
                }
                return;
            case -759238347:
                if (commandId.equals("clearCache")) {
                    webView.clearCache(args.getBoolean(0));
                    return;
                }
                return;
            case -318289731:
                if (commandId.equals("goForward")) {
                    webView.goForward();
                    return;
                }
                return;
            case -265032709:
                if (commandId.equals("clearFormData")) {
                    webView.clearFormData();
                    return;
                }
                return;
            case 336631465:
                if (commandId.equals("loadUrl")) {
                    webView.f29310n.b(false);
                    webView.loadUrl(args.getString(0));
                    return;
                }
                return;
            case 903120263:
                if (commandId.equals("clearHistory")) {
                    webView.clearHistory();
                    return;
                }
                return;
            case 1280029577:
                if (commandId.equals("requestFocus")) {
                    webView.requestFocus();
                    return;
                }
                return;
            case 1490029383:
                if (commandId.equals("postMessage")) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", args.getString(0));
                        webView.h("(function () {var event;var data = " + jSONObject + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                        return;
                    } catch (JSONException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                return;
            case 2104576510:
                if (commandId.equals("injectJavaScript")) {
                    webView.h(args.getString(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void m(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccess(z10);
    }

    public final void n(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccessFromFileURLs(z10);
    }

    public final void o(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z10);
    }

    public final void p(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.f29337c = z10;
        g0(webView);
    }

    public final void q(o viewWrapper, boolean z10) {
        WebChromeClient webChromeClient;
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.f29338d = z10;
        if (Build.VERSION.SDK_INT < 26 || (webChromeClient = webView.getWebChromeClient()) == null || !(webChromeClient instanceof com.reactnativecommunity.webview.c)) {
            return;
        }
        ((com.reactnativecommunity.webview.c) webChromeClient).f(z10);
    }

    public final void r(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setLayerType(Intrinsics.b(str, "hardware") ? 2 : Intrinsics.b(str, "software") ? 1 : 0, null);
    }

    public final void s(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        if (str != null) {
            this.f29343i = WebSettings.getDefaultUserAgent(viewWrapper.getWebView().getContext()) + " " + str;
        } else {
            this.f29343i = null;
        }
        e0(viewWrapper);
    }

    public final void t(o viewWrapper, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setBasicAuthCredential((readableMap != null && readableMap.hasKey("username") && readableMap.hasKey("password")) ? new com.reactnativecommunity.webview.a(readableMap.getString("username"), readableMap.getString("password")) : null);
    }

    public final void u(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setCacheMode(z10 ? -1 : 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void v(o viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        WebSettings settings = viewWrapper.getWebView().getSettings();
        int i10 = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i10 = 2;
                        break;
                    }
                    break;
                case -1215135800:
                    str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i10 = 1;
                        break;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i10 = 3;
                        break;
                    }
                    break;
            }
        }
        settings.setCacheMode(i10);
    }

    public final void w(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDomStorageEnabled(z10);
    }

    public final void x(String str) {
        this.f29339e = str;
    }

    public final void y(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (AbstractC4910c.a("FORCE_DARK")) {
                AbstractC4909b.b(webView.getSettings(), z10 ? 2 : 0);
            }
            if (z10 && AbstractC4910c.a("FORCE_DARK_STRATEGY")) {
                AbstractC4909b.c(webView.getSettings(), 2);
            }
        }
    }

    public final void z(o viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setGeolocationEnabled(z10);
    }
}
