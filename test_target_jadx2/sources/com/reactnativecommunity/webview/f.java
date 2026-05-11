package com.reactnativecommunity.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.L0;
import com.reactnativecommunity.webview.d;
import com.reactnativecommunity.webview.l;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class f extends WebViewClient {

    /* renamed from: e, reason: collision with root package name */
    private static String f29327e = "RNCWebViewClient";

    /* renamed from: a, reason: collision with root package name */
    protected boolean f29328a = false;

    /* renamed from: b, reason: collision with root package name */
    protected d.c f29329b = null;

    /* renamed from: c, reason: collision with root package name */
    protected String f29330c = null;

    /* renamed from: d, reason: collision with root package name */
    protected a f29331d = null;

    protected WritableMap a(WebView webView, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("target", o.a(webView));
        createMap.putString("url", str);
        createMap.putBoolean("loading", (this.f29328a || webView.getProgress() == 100) ? false : true);
        createMap.putString("title", webView.getTitle());
        createMap.putBoolean("canGoBack", webView.canGoBack());
        createMap.putBoolean("canGoForward", webView.canGoForward());
        return createMap;
    }

    protected void b(WebView webView, String str) {
        int a10 = o.a(webView);
        L0.c((ReactContext) webView.getContext(), a10).c(new I9.d(a10, a(webView, str)));
    }

    public void c(a aVar) {
        this.f29331d = aVar;
    }

    public void d(String str) {
        this.f29330c = str;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        super.doUpdateVisitedHistory(webView, str, z10);
        ((d) webView).g(webView, new I9.f(o.a(webView), a(webView, str)));
    }

    public void e(d.c cVar) {
        this.f29329b = cVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f29328a) {
            return;
        }
        ((d) webView).a();
        b(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f29328a = false;
        ((d) webView).b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        String str3 = this.f29330c;
        if (str3 != null && str2.equals(str3) && i10 == -1 && str.equals("net::ERR_FAILED")) {
            d(null);
            return;
        }
        super.onReceivedError(webView, i10, str, str2);
        this.f29328a = true;
        b(webView, str2);
        WritableMap a10 = a(webView, str2);
        a10.putDouble(AppConstants.RETAKE_ERROR_CODE, i10);
        a10.putString("description", str);
        int a11 = o.a(webView);
        L0.c((ReactContext) webView.getContext(), a11).c(new I9.c(a11, a10));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        a aVar = this.f29331d;
        if (aVar != null) {
            httpAuthHandler.proceed(aVar.f29278a, aVar.f29279b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap a10 = a(webView, webResourceRequest.getUrl().toString());
            a10.putInt(Keys.STATUS_CODE, webResourceResponse.getStatusCode());
            a10.putString("description", webResourceResponse.getReasonPhrase());
            int a11 = o.a(webView);
            L0.c((ReactContext) webView.getContext(), a11).c(new I9.b(a11, a10));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        if (!url.equalsIgnoreCase(url2)) {
            Log.w(f29327e, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
            return;
        }
        int primaryError = sslError.getPrimaryError();
        onReceivedError(webView, primaryError, "SSL error: " + (primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid"), url2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        boolean didCrash2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        didCrash = renderProcessGoneDetail.didCrash();
        if (didCrash) {
            Log.e(f29327e, "The WebView rendering process crashed.");
        } else {
            Log.w(f29327e, "The WebView rendering process was killed by the system.");
        }
        if (webView == null) {
            return true;
        }
        WritableMap a10 = a(webView, webView.getUrl());
        didCrash2 = renderProcessGoneDetail.didCrash();
        a10.putBoolean("didCrash", didCrash2);
        int a11 = o.a(webView);
        L0.c((ReactContext) webView.getContext(), a11).c(new I9.i(a11, a10));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        d dVar = (d) webView;
        if (dVar.getReactApplicationContext().getJavaScriptContextHolder().get() == 0 || dVar.f29304h == null) {
            AbstractC1721a.J(f29327e, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.f29329b.b(true);
            int a10 = o.a(webView);
            L0.c((ReactContext) webView.getContext(), a10).c(new I9.j(a10, a(webView, str)));
            return true;
        }
        y0.c b10 = l.f29364g.b();
        Double d10 = (Double) b10.f45130a;
        double doubleValue = d10.doubleValue();
        AtomicReference atomicReference = (AtomicReference) b10.f45131b;
        WritableMap a11 = a(webView, str);
        a11.putDouble("lockIdentifier", doubleValue);
        dVar.f(a11);
        try {
            synchronized (atomicReference) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    while (atomicReference.get() == l.d.a.UNDECIDED) {
                        if (SystemClock.elapsedRealtime() - elapsedRealtime > 250) {
                            AbstractC1721a.J(f29327e, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                            l.f29364g.c(d10);
                            return false;
                        }
                        atomicReference.wait(250L);
                    }
                    boolean z10 = atomicReference.get() == l.d.a.SHOULD_OVERRIDE;
                    l.f29364g.c(d10);
                    return z10;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e10) {
            AbstractC1721a.n(f29327e, "shouldOverrideUrlLoading was interrupted while waiting for result.", e10);
            l.f29364g.c(d10);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
