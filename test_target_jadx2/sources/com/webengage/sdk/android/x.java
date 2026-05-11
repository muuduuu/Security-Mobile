package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.webengage.sdk.android.actions.render.InAppNotificationData;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.callbacks.InAppNotificationCallbacks;
import com.webengage.sdk.android.callbacks.LifeCycleCallbacks;
import com.webengage.sdk.android.callbacks.PushNotificationCallbacks;
import com.webengage.sdk.android.callbacks.StateChangeCallbacks;
import com.webengage.sdk.android.callbacks.WENetworkInterceptor;
import com.webengage.sdk.android.callbacks.WESecurityCallback;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.Response;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class x extends StateChangeCallbacks implements PushNotificationCallbacks, LifeCycleCallbacks, InAppNotificationCallbacks, CustomPushRender, CustomPushRerender, InLinePersonalizationListener, WESecurityCallback, WENetworkInterceptor {

    /* renamed from: c, reason: collision with root package name */
    static volatile x f31109c;

    /* renamed from: d, reason: collision with root package name */
    static List<LifeCycleCallbacks> f31110d;

    /* renamed from: e, reason: collision with root package name */
    static List<PushNotificationCallbacks> f31111e;

    /* renamed from: f, reason: collision with root package name */
    static CustomPushRender f31112f;

    /* renamed from: g, reason: collision with root package name */
    static CustomPushRerender f31113g;

    /* renamed from: h, reason: collision with root package name */
    static List<InAppNotificationCallbacks> f31114h;

    /* renamed from: i, reason: collision with root package name */
    static List<StateChangeCallbacks> f31115i;

    /* renamed from: j, reason: collision with root package name */
    static InLinePersonalizationListener f31116j;

    /* renamed from: k, reason: collision with root package name */
    static WESecurityCallback f31117k;

    /* renamed from: l, reason: collision with root package name */
    static WENetworkInterceptor f31118l;

    /* renamed from: a, reason: collision with root package name */
    Context f31119a;

    /* renamed from: b, reason: collision with root package name */
    Handler f31120b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LifeCycleCallbacks f31121a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31122b;

        a(LifeCycleCallbacks lifeCycleCallbacks, String str) {
            this.f31121a = lifeCycleCallbacks;
            this.f31122b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f31121a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onGCMRegistered(x.this.f31119a, this.f31122b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LifeCycleCallbacks f31124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f31125b;

        b(LifeCycleCallbacks lifeCycleCallbacks, Intent intent) {
            this.f31124a = lifeCycleCallbacks;
            this.f31125b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f31124a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onGCMMessageReceived(x.this.f31119a, this.f31125b);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LifeCycleCallbacks f31127a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f31128b;

        c(LifeCycleCallbacks lifeCycleCallbacks, Intent intent) {
            this.f31127a = lifeCycleCallbacks;
            this.f31128b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f31127a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onAppInstalled(x.this.f31119a, this.f31128b);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LifeCycleCallbacks f31130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31131b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31132c;

        d(LifeCycleCallbacks lifeCycleCallbacks, int i10, int i11) {
            this.f31130a = lifeCycleCallbacks;
            this.f31131b = i10;
            this.f31132c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f31130a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onAppUpgraded(x.this.f31119a, this.f31131b, this.f31132c);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PushNotificationCallbacks f31134a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PushNotificationData f31135b;

        e(PushNotificationCallbacks pushNotificationCallbacks, PushNotificationData pushNotificationData) {
            this.f31134a = pushNotificationCallbacks;
            this.f31135b = pushNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushNotificationCallbacks pushNotificationCallbacks = this.f31134a;
            if (pushNotificationCallbacks != null) {
                pushNotificationCallbacks.onPushNotificationShown(x.this.f31119a, this.f31135b);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PushNotificationCallbacks f31137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PushNotificationData f31138b;

        f(PushNotificationCallbacks pushNotificationCallbacks, PushNotificationData pushNotificationData) {
            this.f31137a = pushNotificationCallbacks;
            this.f31138b = pushNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushNotificationCallbacks pushNotificationCallbacks = this.f31137a;
            if (pushNotificationCallbacks != null) {
                pushNotificationCallbacks.onPushNotificationDismissed(x.this.f31119a, this.f31138b);
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InAppNotificationCallbacks f31140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InAppNotificationData f31141b;

        g(InAppNotificationCallbacks inAppNotificationCallbacks, InAppNotificationData inAppNotificationData) {
            this.f31140a = inAppNotificationCallbacks;
            this.f31141b = inAppNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppNotificationCallbacks inAppNotificationCallbacks = this.f31140a;
            if (inAppNotificationCallbacks != null) {
                inAppNotificationCallbacks.onInAppNotificationShown(x.this.f31119a, this.f31141b);
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InAppNotificationCallbacks f31143a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InAppNotificationData f31144b;

        h(InAppNotificationCallbacks inAppNotificationCallbacks, InAppNotificationData inAppNotificationData) {
            this.f31143a = inAppNotificationCallbacks;
            this.f31144b = inAppNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppNotificationCallbacks inAppNotificationCallbacks = this.f31143a;
            if (inAppNotificationCallbacks != null) {
                inAppNotificationCallbacks.onInAppNotificationDismissed(x.this.f31119a, this.f31144b);
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StateChangeCallbacks f31146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f31147b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31148c;

        i(StateChangeCallbacks stateChangeCallbacks, Context context, String str) {
            this.f31146a = stateChangeCallbacks;
            this.f31147b = context;
            this.f31148c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31146a.onAnonymousIdChanged(this.f31147b, this.f31148c);
        }
    }

    private x(Context context) {
        this.f31119a = null;
        this.f31120b = null;
        this.f31119a = context.getApplicationContext();
        this.f31120b = new Handler(Looper.getMainLooper());
    }

    public static x a(Context context) {
        if (f31109c == null) {
            synchronized (x.class) {
                try {
                    if (f31109c == null) {
                        f31109c = new x(context);
                    }
                } finally {
                }
            }
        }
        return f31109c;
    }

    public static void b() {
        f31118l = null;
    }

    protected static void c(LifeCycleCallbacks lifeCycleCallbacks) {
        List<LifeCycleCallbacks> list = f31110d;
        if (list != null) {
            list.remove(lifeCycleCallbacks);
        }
    }

    @Override // com.webengage.sdk.android.callbacks.StateChangeCallbacks
    public void onAnonymousIdChanged(Context context, String str) {
        List<StateChangeCallbacks> list = f31115i;
        if (list != null) {
            for (StateChangeCallbacks stateChangeCallbacks : list) {
                if (stateChangeCallbacks != null) {
                    this.f31120b.post(new i(stateChangeCallbacks, context, str));
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onAppInstalled(Context context, Intent intent) {
        if (f31110d != null) {
            for (int i10 = 0; i10 < f31110d.size(); i10++) {
                this.f31120b.post(new c(f31110d.get(i10), intent));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onAppUpgraded(Context context, int i10, int i11) {
        if (f31110d != null) {
            for (int i12 = 0; i12 < f31110d.size(); i12++) {
                this.f31120b.post(new d(f31110d.get(i12), i10, i11));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onGCMMessageReceived(Context context, Intent intent) {
        if (f31110d != null) {
            for (int i10 = 0; i10 < f31110d.size(); i10++) {
                this.f31120b.post(new b(f31110d.get(i10), intent));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onGCMRegistered(Context context, String str) {
        if (f31110d != null) {
            for (int i10 = 0; i10 < f31110d.size(); i10++) {
                this.f31120b.post(new a(f31110d.get(i10), str));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public boolean onInAppNotificationClicked(Context context, InAppNotificationData inAppNotificationData, String str) {
        if (f31114h == null) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < f31114h.size(); i10++) {
            InAppNotificationCallbacks inAppNotificationCallbacks = f31114h.get(i10);
            if (inAppNotificationCallbacks != null) {
                z10 |= inAppNotificationCallbacks.onInAppNotificationClicked(this.f31119a, inAppNotificationData, str);
            }
        }
        return z10;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public void onInAppNotificationDismissed(Context context, InAppNotificationData inAppNotificationData) {
        if (f31114h != null) {
            for (int i10 = 0; i10 < f31114h.size(); i10++) {
                this.f31120b.post(new h(f31114h.get(i10), inAppNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public InAppNotificationData onInAppNotificationPrepared(Context context, InAppNotificationData inAppNotificationData) {
        if (f31114h != null) {
            for (int i10 = 0; i10 < f31114h.size(); i10++) {
                InAppNotificationCallbacks inAppNotificationCallbacks = f31114h.get(i10);
                if (inAppNotificationCallbacks != null) {
                    inAppNotificationData = inAppNotificationCallbacks.onInAppNotificationPrepared(this.f31119a, inAppNotificationData);
                }
            }
        }
        return inAppNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public void onInAppNotificationShown(Context context, InAppNotificationData inAppNotificationData) {
        if (f31114h != null) {
            for (int i10 = 0; i10 < f31114h.size(); i10++) {
                this.f31120b.post(new g(f31114h.get(i10), inAppNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onNewSessionStarted() {
        if (f31110d != null) {
            for (int i10 = 0; i10 < f31110d.size(); i10++) {
                final LifeCycleCallbacks lifeCycleCallbacks = f31110d.get(i10);
                this.f31120b.post(new Runnable() { // from class: com.webengage.sdk.android.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a(LifeCycleCallbacks.this);
                    }
                });
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public boolean onPushNotificationActionClicked(Context context, PushNotificationData pushNotificationData, String str) {
        if (f31111e == null) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < f31111e.size(); i10++) {
            PushNotificationCallbacks pushNotificationCallbacks = f31111e.get(i10);
            if (pushNotificationCallbacks != null) {
                z10 |= pushNotificationCallbacks.onPushNotificationActionClicked(this.f31119a, pushNotificationData, str);
            }
        }
        return z10;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public boolean onPushNotificationClicked(Context context, PushNotificationData pushNotificationData) {
        if (f31111e == null) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < f31111e.size(); i10++) {
            PushNotificationCallbacks pushNotificationCallbacks = f31111e.get(i10);
            if (pushNotificationCallbacks != null) {
                z10 |= pushNotificationCallbacks.onPushNotificationClicked(this.f31119a, pushNotificationData);
            }
        }
        return z10;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public void onPushNotificationDismissed(Context context, PushNotificationData pushNotificationData) {
        if (f31111e != null) {
            for (int i10 = 0; i10 < f31111e.size(); i10++) {
                this.f31120b.post(new f(f31111e.get(i10), pushNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public PushNotificationData onPushNotificationReceived(Context context, PushNotificationData pushNotificationData) {
        if (f31111e != null) {
            for (int i10 = 0; i10 < f31111e.size(); i10++) {
                PushNotificationCallbacks pushNotificationCallbacks = f31111e.get(i10);
                if (pushNotificationCallbacks != null) {
                    pushNotificationData = pushNotificationCallbacks.onPushNotificationReceived(this.f31119a, pushNotificationData);
                }
            }
        }
        return pushNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public void onPushNotificationShown(Context context, PushNotificationData pushNotificationData) {
        if (f31111e != null) {
            for (int i10 = 0; i10 < f31111e.size(); i10++) {
                this.f31120b.post(new e(f31111e.get(i10), pushNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        CustomPushRender customPushRender = f31112f;
        if (customPushRender != null) {
            return customPushRender.onRender(context, pushNotificationData);
        }
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.WENetworkInterceptor
    public RequestObject onRequest(Context context, RequestObject requestObject) {
        WENetworkInterceptor wENetworkInterceptor = f31118l;
        return wENetworkInterceptor != null ? wENetworkInterceptor.onRequest(context, requestObject) : requestObject;
    }

    @Override // com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        CustomPushRerender customPushRerender = f31113g;
        if (customPushRerender != null) {
            return customPushRerender.onRerender(context, pushNotificationData, bundle);
        }
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.WENetworkInterceptor
    public Response onResponse(Context context, Response response) {
        WENetworkInterceptor wENetworkInterceptor = f31118l;
        return wENetworkInterceptor != null ? wENetworkInterceptor.onResponse(context, response) : response;
    }

    @Override // com.webengage.sdk.android.callbacks.WESecurityCallback
    public void onSecurityException(Map<String, Object> map) {
        WESecurityCallback wESecurityCallback = f31117k;
        if (wESecurityCallback != null) {
            wESecurityCallback.onSecurityException(map);
        } else {
            Logger.e("WebEngage", "CallbackDispatcher  onSecurityException: no call back set");
        }
    }

    @Override // com.webengage.sdk.android.InLinePersonalizationListener
    public void propertiesReceived(WeakReference<Activity> weakReference, HashMap<String, Object> hashMap) {
        InLinePersonalizationListener inLinePersonalizationListener = f31116j;
        if (inLinePersonalizationListener != null) {
            inLinePersonalizationListener.propertiesReceived(weakReference, hashMap);
        } else {
            Logger.d("WebEngage", "In callback propertiesReceived: No callback set");
        }
    }

    @Override // com.webengage.sdk.android.InLinePersonalizationListener
    public void screenNavigated(String str) {
        InLinePersonalizationListener inLinePersonalizationListener = f31116j;
        if (inLinePersonalizationListener != null) {
            inLinePersonalizationListener.screenNavigated(str);
        } else {
            Logger.d("WebEngage", "In callback propertiesReceived: No callback set");
        }
    }

    protected static void a(InLinePersonalizationListener inLinePersonalizationListener) {
        f31116j = inLinePersonalizationListener;
    }

    protected static void b(InAppNotificationCallbacks inAppNotificationCallbacks) {
        List<InAppNotificationCallbacks> list = f31114h;
        if (list != null) {
            list.remove(inAppNotificationCallbacks);
        }
    }

    protected static void a(CustomPushRender customPushRender) {
        if (customPushRender != null) {
            f31112f = customPushRender;
        }
    }

    protected static void b(LifeCycleCallbacks lifeCycleCallbacks) {
        if (lifeCycleCallbacks != null) {
            if (f31110d == null) {
                f31110d = new ArrayList();
            }
            if (f31110d.contains(lifeCycleCallbacks)) {
                return;
            }
            f31110d.add(lifeCycleCallbacks);
        }
    }

    protected static void a(CustomPushRerender customPushRerender) {
        if (customPushRerender != null) {
            f31113g = customPushRerender;
        }
    }

    protected static void b(PushNotificationCallbacks pushNotificationCallbacks) {
        List<PushNotificationCallbacks> list = f31111e;
        if (list != null) {
            list.remove(pushNotificationCallbacks);
        }
    }

    protected static void a(InAppNotificationCallbacks inAppNotificationCallbacks) {
        if (inAppNotificationCallbacks != null) {
            if (f31114h == null) {
                f31114h = new ArrayList();
            }
            if (f31114h.contains(inAppNotificationCallbacks)) {
                return;
            }
            f31114h.add(inAppNotificationCallbacks);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(LifeCycleCallbacks lifeCycleCallbacks) {
        if (lifeCycleCallbacks != null) {
            lifeCycleCallbacks.onNewSessionStarted();
        }
    }

    protected static void a(PushNotificationCallbacks pushNotificationCallbacks) {
        if (pushNotificationCallbacks != null) {
            if (f31111e == null) {
                f31111e = new ArrayList();
            }
            if (f31111e.contains(pushNotificationCallbacks)) {
                return;
            }
            f31111e.add(pushNotificationCallbacks);
        }
    }

    protected static void a(StateChangeCallbacks stateChangeCallbacks) {
        List<StateChangeCallbacks> list = f31115i;
        if (list != null) {
            list.remove(stateChangeCallbacks);
        }
    }

    protected static void a(StateChangeCallbacks stateChangeCallbacks, Analytics analytics, Context context) {
        if (stateChangeCallbacks != null) {
            if (f31115i == null) {
                f31115i = new ArrayList();
            }
            if (f31115i.contains(stateChangeCallbacks)) {
                return;
            }
            f31115i.add(stateChangeCallbacks);
            if (analytics == null || !(analytics instanceof C2959g) || context == null) {
                return;
            }
            String h10 = analytics.a().h();
            if (h10.isEmpty()) {
                h10 = null;
            }
            stateChangeCallbacks.onAnonymousIdChanged(context, h10);
        }
    }

    public static void a(WENetworkInterceptor wENetworkInterceptor) {
        if (wENetworkInterceptor != null) {
            f31118l = wENetworkInterceptor;
        }
    }

    protected static void a(WESecurityCallback wESecurityCallback) {
        if (wESecurityCallback != null) {
            f31117k = wESecurityCallback;
        }
    }

    public boolean a() {
        return f31112f != null;
    }
}
