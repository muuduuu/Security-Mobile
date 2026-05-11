package com.ReactNativeBlobUtil;

import Td.B;
import Td.y;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import com.ReactNativeBlobUtil.g;
import com.ReactNativeBlobUtil.j;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class e {

    /* renamed from: b, reason: collision with root package name */
    static ReactApplicationContext f19857b;

    /* renamed from: c, reason: collision with root package name */
    private static final LinkedBlockingQueue f19858c;

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadPoolExecutor f19859d;

    /* renamed from: e, reason: collision with root package name */
    static LinkedBlockingQueue f19860e;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadPoolExecutor f19861f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f19862g;

    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray f19863h;

    /* renamed from: a, reason: collision with root package name */
    private final B f19864a;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19866b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19867c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f19868d;

        a(e eVar, String str, String str2, Promise promise) {
            this.f19865a = str;
            this.f19866b = str2;
            this.f19867c = promise;
            this.f19868d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.o(this.f19865a, this.f19866b, this.f19867c);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f19869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19872d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19873e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f19874f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f19875g;

        b(e eVar, ReactApplicationContext reactApplicationContext, String str, String str2, int i10, int i11, String str3) {
            this.f19869a = reactApplicationContext;
            this.f19870b = str;
            this.f19871c = str2;
            this.f19872d = i10;
            this.f19873e = i11;
            this.f19874f = str3;
            this.f19875g = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            new m(this.f19869a).e(this.f19870b, this.f19871c, this.f19872d, this.f19873e, this.f19874f, e.f19857b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19876a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f19877b;

        c(e eVar, Callback callback) {
            this.f19876a = callback;
            this.f19877b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.e(this.f19876a, e.f19857b);
        }
    }

    class d implements ActivityEventListener {
        d() {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            Integer num = com.ReactNativeBlobUtil.c.f19850a;
            if (i10 == num.intValue() && i11 == -1) {
                ((Promise) e.f19863h.get(num.intValue())).resolve(intent.getData().toString());
                e.f19863h.remove(num.intValue());
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    /* renamed from: com.ReactNativeBlobUtil.e$e, reason: collision with other inner class name */
    class RunnableC0359e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19880b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19881c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19882d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f19883e;

        RunnableC0359e(e eVar, String str, String str2, String str3, Promise promise) {
            this.f19879a = str;
            this.f19880b = str2;
            this.f19881c = str3;
            this.f19882d = promise;
            this.f19883e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.b(this.f19879a, this.f19880b, this.f19881c, this.f19882d);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f19885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f19887d;

        f(e eVar, String str, ReadableArray readableArray, Promise promise) {
            this.f19884a = str;
            this.f19885b = readableArray;
            this.f19886c = promise;
            this.f19887d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.c(this.f19884a, this.f19885b, this.f19886c);
        }
    }

    class g implements LifecycleEventListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f19888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f19889b;

        g(e eVar, Promise promise) {
            this.f19888a = promise;
            this.f19889b = eVar;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (e.f19862g) {
                this.f19888a.resolve(null);
            }
            e.f19857b.removeLifecycleEventListener(this);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f19892c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f19893d;

        h(e eVar, String str, String str2, Callback callback) {
            this.f19890a = str;
            this.f19891b = str2;
            this.f19892c = callback;
            this.f19893d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.a(this.f19890a, this.f19891b, this.f19892c);
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19894a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19895b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f19896c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19897d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f19898e;

        i(e eVar, String str, String str2, boolean z10, Promise promise) {
            this.f19894a = str;
            this.f19895b = str2;
            this.f19896c = z10;
            this.f19897d = promise;
            this.f19898e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.v(this.f19894a, this.f19895b, this.f19896c, this.f19897d);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19899a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f19900b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f19901c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19902d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f19903e;

        j(e eVar, String str, ReadableArray readableArray, boolean z10, Promise promise) {
            this.f19899a = str;
            this.f19900b = readableArray;
            this.f19901c = z10;
            this.f19902d = promise;
            this.f19903e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.C(this.f19899a, this.f19900b, this.f19901c, this.f19902d);
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19904a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19905b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19906c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f19907d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f19908e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Promise f19909f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f19910g;

        k(e eVar, String str, String str2, String str3, boolean z10, boolean z11, Promise promise) {
            this.f19904a = str;
            this.f19905b = str2;
            this.f19906c = str3;
            this.f19907d = z10;
            this.f19908e = z11;
            this.f19909f = promise;
            this.f19910g = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.d.D(this.f19904a, this.f19905b, this.f19906c, this.f19907d, this.f19908e, this.f19909f);
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReadableArray f19911a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f19912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f19913c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f19914d;

        l(e eVar, ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f19911a = readableArray;
            this.f19912b = reactApplicationContext;
            this.f19913c = callback;
            this.f19914d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f19911a.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = this.f19911a.getMap(i10);
                if (map.hasKey("path")) {
                    strArr[i10] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i10] = map.getString("mime");
                    } else {
                        strArr2[i10] = null;
                    }
                }
            }
            new com.ReactNativeBlobUtil.d(this.f19912b).x(strArr, strArr2, this.f19913c);
        }
    }

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f19858c = linkedBlockingQueue;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f19859d = new ThreadPoolExecutor(5, 10, 5000L, timeUnit, linkedBlockingQueue);
        f19860e = new LinkedBlockingQueue();
        f19861f = new ThreadPoolExecutor(2, 10, 5000L, timeUnit, linkedBlockingQueue);
        f19862g = false;
        f19863h = new SparseArray();
    }

    public e(ReactApplicationContext reactApplicationContext) {
        B f10 = com.facebook.react.modules.network.h.f();
        this.f19864a = f10;
        ((com.facebook.react.modules.network.a) f10.n()).a(new y(new com.facebook.react.modules.network.e(reactApplicationContext)));
        f19857b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new d());
    }

    public void A(String str, String str2, Callback callback) {
        com.ReactNativeBlobUtil.d.u(str, str2, callback);
    }

    public void B(String str, String str2, boolean z10, Promise promise) {
        f19859d.execute(new i(this, str, str2, z10, promise));
    }

    public void C(String str, String str2, int i10, int i11, String str3) {
        f19861f.execute(new b(this, f19857b, str, str2, i10, i11, str3));
    }

    public void D(ReadableArray readableArray, Callback callback) {
        com.ReactNativeBlobUtil.d.w(readableArray, callback);
    }

    public void E(ReadableArray readableArray, Callback callback) {
        f19859d.execute(new l(this, readableArray, f19857b, callback));
    }

    public void F(String str, String str2, long j10, long j11, Promise promise) {
        com.ReactNativeBlobUtil.d.y(str, str2, j10, j11, BuildConfig.FLAVOR, promise);
    }

    public void G(String str, Callback callback) {
        com.ReactNativeBlobUtil.d.z(str, callback);
    }

    public void H(String str, Callback callback) {
        com.ReactNativeBlobUtil.d.B(str, callback);
    }

    public void I(String str, ReadableArray readableArray, Callback callback) {
        m.f(str, readableArray, callback);
    }

    public void J(String str, String str2, Callback callback) {
        m.g(str, str2, callback);
    }

    public void K(String str, String str2, String str3, boolean z10, boolean z11, Promise promise) {
        f19859d.execute(new k(this, str, str2, str3, z10, z11, promise));
    }

    public void L(String str, ReadableArray readableArray, boolean z10, Promise promise) {
        f19859d.execute(new j(this, str, readableArray, z10, promise));
    }

    public void M(String str, String str2, boolean z10, Callback callback) {
        new m(f19857b).h(str, str2, z10, callback);
    }

    public void N(String str, String str2, boolean z10, Promise promise) {
        if (com.ReactNativeBlobUtil.g.f(Uri.parse(str), str2, z10, promise, f19857b)) {
            promise.resolve("Success");
        }
    }

    public void c(String str, String str2, String str3, Promise promise) {
        Uri parse;
        try {
            if (n.e(str)) {
                parse = Uri.parse(str);
            } else {
                parse = androidx.core.content.b.h(f19857b, f19857b.getPackageName() + ".provider", new File(str));
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(parse, str2);
            intent.setFlags(1);
            intent.addFlags(268435456);
            if (str3 != null) {
                intent = Intent.createChooser(intent, str3);
            }
            try {
                f19857b.startActivity(intent);
                promise.resolve(Boolean.TRUE);
            } catch (ActivityNotFoundException unused) {
                promise.reject("ENOAPP", "No app installed for " + str2);
            }
            f19862g = true;
            f19857b.addLifecycleEventListener(new g(this, promise));
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    public void d(ReadableMap readableMap, Promise promise) {
        DownloadManager downloadManager = (DownloadManager) f19857b.getSystemService("download");
        if (readableMap == null || !readableMap.hasKey("path")) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload config or path missing.");
            return;
        }
        String f10 = n.f(readableMap.getString("path"));
        if (f10 == null) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload can not resolve URI:" + readableMap.getString("path"));
            return;
        }
        try {
            WritableMap A10 = com.ReactNativeBlobUtil.d.A(f10);
            boolean hasKey = readableMap.hasKey("title");
            String str = BuildConfig.FLAVOR;
            String string = hasKey ? readableMap.getString("title") : BuildConfig.FLAVOR;
            if (readableMap.hasKey("description")) {
                str = readableMap.getString("description");
            }
            downloadManager.addCompletedDownload(string, str, true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, f10, Long.valueOf(A10.getString("size")).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
            promise.resolve(null);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    public void e(String str, Callback callback) {
        try {
            com.ReactNativeBlobUtil.l.f(str);
            callback.invoke(null, str);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), null);
        }
    }

    public void f(String str, Callback callback) {
        m.a(str, callback);
    }

    public void g(String str, String str2, Promise promise) {
        com.ReactNativeBlobUtil.g.a(Uri.parse(str), str2, promise);
    }

    public void h(ReadableMap readableMap, String str, String str2, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
            return;
        }
        if (str2 == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid path");
            return;
        }
        Uri b10 = com.ReactNativeBlobUtil.g.b(new N1.a(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), g.a.valueOf(str), f19857b);
        if (b10 == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        } else if (com.ReactNativeBlobUtil.g.f(b10, str2, false, promise, f19857b)) {
            promise.resolve(b10.toString());
        }
    }

    public void i(String str, String str2, Callback callback) {
        f19859d.execute(new h(this, str, str2, callback));
    }

    public void j(String str, String str2, String str3, Promise promise) {
        f19859d.execute(new RunnableC0359e(this, str, str2, str3, promise));
    }

    public void k(String str, ReadableArray readableArray, Promise promise) {
        f19859d.execute(new f(this, str, readableArray, promise));
    }

    public void l(ReadableMap readableMap, String str, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
        }
        Uri b10 = com.ReactNativeBlobUtil.g.b(new N1.a(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), g.a.valueOf(str), f19857b);
        if (b10 != null) {
            promise.resolve(b10.toString());
        } else {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        }
    }

    public void m(Callback callback) {
        f19861f.execute(new c(this, callback));
    }

    public void n(String str, int i10, int i11) {
        com.ReactNativeBlobUtil.l.f19922B.put(str, new com.ReactNativeBlobUtil.j(true, i10, i11, j.a.Download));
    }

    public void o(String str, int i10, int i11) {
        com.ReactNativeBlobUtil.l.f19923C.put(str, new com.ReactNativeBlobUtil.j(true, i10, i11, j.a.Upload));
    }

    public void p(String str, Callback callback) {
        com.ReactNativeBlobUtil.d.f(str, callback);
    }

    public void q(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new com.ReactNativeBlobUtil.l(readableMap, str, str2, str3, readableMap2, str4, null, this.f19864a, callback).run();
    }

    public void r(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new com.ReactNativeBlobUtil.l(readableMap, str, str2, str3, readableMap2, null, readableArray, this.f19864a, callback).run();
    }

    public void s(String str, String str2, Promise promise) {
        com.ReactNativeBlobUtil.g.c(Uri.parse(str), str2, promise);
    }

    public void t(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        SparseArray sparseArray = f19863h;
        Integer num = com.ReactNativeBlobUtil.c.f19850a;
        sparseArray.put(num.intValue(), promise);
        f19857b.startActivityForResult(intent, num.intValue(), null);
    }

    public void u(Promise promise) {
        com.ReactNativeBlobUtil.d.k(f19857b, promise);
    }

    public void v(Promise promise) {
        com.ReactNativeBlobUtil.d.l(f19857b, promise);
    }

    public void w(String str, String str2, Promise promise) {
        f19859d.execute(new a(this, str, str2, promise));
    }

    public void x(String str, Promise promise) {
        com.ReactNativeBlobUtil.d.r(str, promise);
    }

    public void y(String str, Callback callback) {
        com.ReactNativeBlobUtil.d.s(str, callback);
    }

    public void z(String str, Promise promise) {
        com.ReactNativeBlobUtil.d.t(str, promise);
    }
}
