package com.reactnativecommunity.webview;

import android.R;
import android.content.ComponentCallbacks2;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.L0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.reactnativecommunity.webview.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x4.C5109a;

/* loaded from: classes2.dex */
public abstract class c extends WebChromeClient implements LifecycleEventListener {

    /* renamed from: n, reason: collision with root package name */
    protected static final FrameLayout.LayoutParams f29281n = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: a, reason: collision with root package name */
    protected d f29282a;

    /* renamed from: b, reason: collision with root package name */
    protected View f29283b;

    /* renamed from: c, reason: collision with root package name */
    protected WebChromeClient.CustomViewCallback f29284c;

    /* renamed from: d, reason: collision with root package name */
    protected PermissionRequest f29285d;

    /* renamed from: e, reason: collision with root package name */
    protected List f29286e;

    /* renamed from: f, reason: collision with root package name */
    protected GeolocationPermissions.Callback f29287f;

    /* renamed from: g, reason: collision with root package name */
    protected String f29288g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f29289h = false;

    /* renamed from: i, reason: collision with root package name */
    protected List f29290i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    protected d.c f29291j = null;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f29292k = false;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f29293l = false;

    /* renamed from: m, reason: collision with root package name */
    private O4.h f29294m = new O4.h() { // from class: com.reactnativecommunity.webview.b
        @Override // O4.h
        public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            boolean d10;
            d10 = c.this.d(i10, strArr, iArr);
            return d10;
        }
    };

    class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f29295a;

        a(WebView webView) {
            this.f29295a = webView;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("targetUrl", str);
            WebView webView2 = this.f29295a;
            ((d) webView2).g(webView2, new I9.h(o.a(this.f29295a), createMap));
            return true;
        }
    }

    public c(d dVar) {
        this.f29282a = dVar;
    }

    private O4.g b() {
        ComponentCallbacks2 currentActivity = this.f29282a.getThemedReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof O4.g) {
            return (O4.g) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(int i10, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        List list;
        List list2;
        List list3;
        List list4;
        GeolocationPermissions.Callback callback;
        String str;
        this.f29289h = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            boolean z11 = iArr[i11] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = this.f29287f) != null && (str = this.f29288g) != null) {
                if (z11) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                this.f29287f = null;
                this.f29288g = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z11 && (list4 = this.f29286e) != null) {
                    list4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z10 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z11 && (list3 = this.f29286e) != null) {
                    list3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z10 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z11 && (list2 = this.f29286e) != null) {
                    list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z10 = true;
            }
        }
        if (z10 && (permissionRequest = this.f29285d) != null && (list = this.f29286e) != null) {
            permissionRequest.grant((String[]) list.toArray(new String[0]));
            this.f29285d = null;
            this.f29286e = null;
        }
        if (this.f29290i.isEmpty()) {
            return true;
        }
        e(this.f29290i);
        return false;
    }

    private synchronized void e(List list) {
        if (this.f29289h) {
            this.f29290i.addAll(list);
            return;
        }
        O4.g b10 = b();
        this.f29289h = true;
        b10.c((String[]) list.toArray(new String[0]), 3, this.f29294m);
        this.f29290i.clear();
    }

    protected ViewGroup c() {
        return (ViewGroup) this.f29282a.getThemedReactContext().getCurrentActivity().findViewById(R.id.content);
    }

    public void f(boolean z10) {
        this.f29292k = z10;
    }

    public void g(boolean z10) {
        this.f29293l = z10;
    }

    public void h(d.c cVar) {
        this.f29291j = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (C5109a.f44775b) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f29293l) {
            webView2.setWebViewClient(new a(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (androidx.core.content.a.a(this.f29282a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f29287f = callback;
        this.f29288g = str;
        e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        View view = this.f29283b;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.f29283b.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f29286e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i10 = 0;
        while (true) {
            String str = null;
            if (i10 >= length) {
                break;
            }
            String str2 = resources[i10];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.f29292k) {
                    this.f29286e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (androidx.core.content.a.a(this.f29282a.getThemedReactContext(), str) == 0) {
                    this.f29286e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f29286e.toArray(new String[0]));
            this.f29286e = null;
        } else {
            this.f29285d = permissionRequest;
            e(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        String url = webView.getUrl();
        if (this.f29291j.a()) {
            return;
        }
        int a10 = o.a(webView);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("target", a10);
        createMap.putString("title", webView.getTitle());
        createMap.putString("url", url);
        createMap.putBoolean("canGoBack", webView.canGoBack());
        createMap.putBoolean("canGoForward", webView.canGoForward());
        createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, i10 / 100.0f);
        L0.c(this.f29282a.getThemedReactContext(), a10).c(new I9.e(a10, createMap));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((RNCWebViewModule) this.f29282a.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }
}
