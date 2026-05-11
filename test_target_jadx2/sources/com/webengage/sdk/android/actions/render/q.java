package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.webengage.sdk.android.Logger;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    WebView f30433a;

    /* renamed from: b, reason: collision with root package name */
    String f30434b;

    /* renamed from: c, reason: collision with root package name */
    String f30435c;

    /* renamed from: d, reason: collision with root package name */
    String f30436d;

    /* renamed from: e, reason: collision with root package name */
    f f30437e;

    /* renamed from: f, reason: collision with root package name */
    WeakReference<Activity> f30438f;

    /* renamed from: g, reason: collision with root package name */
    private String f30439g = "<!DOCTYPE html>\n<html>\n  <head>\n    <meta charset='UTF-8'>\n    <title>Full Page Modal In-App</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n  </head>\n  <body style = \"background-color: transparent\">\n      <script type='text/javascript'>\n        \n        var webengage = {};\n\n        webengage.notification = {\n\t       \n         'x' : 1\n        \n        };\n\n        var instance = {\n\n          layoutId : WebEngage.getLayoutId(),\n\n previewJson : true ,          baseURL: \"";

    /* renamed from: h, reason: collision with root package name */
    private String f30440h = "\",\n\n\t        data : JSON.parse(WebEngage.getData()),\n\n\t        click : function (actionId,actionLink,isPrime) {\n\t           WebEngage.onClick(actionId,actionLink,isPrime);\n\t        },\n\n\t        trackEvent : function (eventName,data) {\n\t           WebEngage.trackEvent(eventName,data);\n\t        },\n\n          close : function (){\n             WebEngage.onClose();\n          },\n\n          open : function(){\n             WebEngage.onOpen();\n          },\n\n          error : function(stackTrace){\n             WebEngage.onError(stackTrace);\n          }\n\n        };\n      </script>\n      <script type='text/javascript' src='";

    /* renamed from: i, reason: collision with root package name */
    private String f30441i = "js/notification-prepare.js'></script>\n      <script type='text/javascript'>\n       var weNotification = webengage.notification.prepare(instance);\n       weNotification.show();\n      </script>\n  </body>\n</html>\n";

    /* renamed from: j, reason: collision with root package name */
    private String f30442j;

    private class b extends WebChromeClient {
        private b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.d("WebEngage", "onConsoleMessage: " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
        }
    }

    q(String str, String str2, String str3, f fVar, Activity activity, JSONObject jSONObject) {
        this.f30442j = null;
        this.f30434b = str;
        this.f30435c = str2;
        this.f30436d = str3;
        this.f30437e = fVar;
        this.f30438f = new WeakReference<>(activity);
        this.f30433a = new WebView(activity);
        this.f30433a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f30442j = this.f30439g + str + this.f30440h + str + this.f30441i;
    }

    WebView a() {
        this.f30433a.getSettings().setJavaScriptEnabled(true);
        this.f30433a.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f30433a.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
        this.f30433a.getSettings().setCacheMode(-1);
        this.f30433a.addJavascriptInterface(this.f30437e, "WebEngage");
        this.f30433a.setWebChromeClient(new b());
        this.f30433a.loadDataWithBaseURL(this.f30434b, this.f30442j, this.f30435c, this.f30436d, null);
        this.f30433a.setBackgroundColor(0);
        this.f30433a.getSettings().setTextZoom(100);
        return this.f30433a;
    }
}
