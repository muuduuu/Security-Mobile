package com.webengage.sdk.android;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.webengage.sdk.android.Analytics;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.BuildConfig;

/* renamed from: com.webengage.sdk.android.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2959g extends Analytics {

    /* renamed from: a, reason: collision with root package name */
    Context f30574a;

    /* renamed from: b, reason: collision with root package name */
    C2961i f30575b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Activity> f30576c = null;

    /* renamed from: d, reason: collision with root package name */
    z2 f30577d;

    /* renamed from: e, reason: collision with root package name */
    x2 f30578e;

    /* renamed from: f, reason: collision with root package name */
    AtomicInteger f30579f;

    C2959g(Context context, C2961i c2961i, z2 z2Var, x2 x2Var) {
        this.f30574a = null;
        this.f30575b = null;
        this.f30577d = null;
        this.f30578e = null;
        this.f30579f = null;
        this.f30574a = context.getApplicationContext();
        this.f30575b = c2961i;
        this.f30578e = x2Var;
        this.f30577d = z2Var;
        this.f30579f = new AtomicInteger(0);
    }

    @Override // com.webengage.sdk.android.Analytics
    protected C2961i a() {
        return this.f30575b;
    }

    @Override // com.webengage.sdk.android.Analytics
    protected x2 b() {
        return this.f30578e;
    }

    @Override // com.webengage.sdk.android.Analytics
    protected z2 c() {
        return this.f30577d;
    }

    @Override // com.webengage.sdk.android.Analytics
    public WeakReference<Activity> getActivity() {
        return this.f30576c;
    }

    @Override // com.webengage.sdk.android.Analytics
    public void installed(Intent intent) {
        try {
            if (intent == null) {
                Logger.e("WebEngage", "Intent is Null");
                return;
            }
            if (this.f30575b.v()) {
                return;
            }
            this.f30575b.b(true);
            if (intent.hasExtra("referrer")) {
                this.f30575b.b("referrer", intent.getStringExtra("referrer"));
            } else {
                this.f30575b.b("referrer", BuildConfig.FLAVOR);
            }
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str) {
        screenNavigated(str, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void setScreenData(Map<String, ? extends Object> map) {
        Map map2;
        try {
            Logger.d("WebEngage", "Set screen data: " + map);
            ArrayList arrayList = new ArrayList();
            arrayList.add(h0.PAGE.toString());
            arrayList.add("custom");
            HashMap hashMap = new HashMap();
            try {
                map2 = (Map) DataType.cloneExternal(map);
            } catch (Exception unused) {
                map2 = null;
            }
            hashMap.put("data", map2);
            hashMap.put("path", arrayList);
            WebEngage.startService(l1.a(y3.f31165j, hashMap, this.f30574a), this.f30574a);
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void start(Activity activity) {
        try {
            this.f30578e.a();
            int incrementAndGet = this.f30579f.incrementAndGet();
            DataHolder.get().a(true);
            this.f30576c = new WeakReference<>(activity);
            if (activity != null) {
                Logger.d("WebEngage", " Activity start: " + activity.getClass().getName());
                HashMap hashMap = new HashMap();
                hashMap.put("screen_path", activity.getClass().getName());
                if (activity.getTitle() != null) {
                    hashMap.put("screen_title", activity.getTitle().toString());
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("activity_count", Integer.valueOf(incrementAndGet));
                Intent intent = activity.getIntent();
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("we_landing_page_intent");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        hashMap2.put("landing_page", stringExtra);
                    }
                }
                WebEngage.startService(l1.a(y3.f31164i, n0.b("we_wk_activity_start", hashMap, null, hashMap2, this.f30574a), this.f30574a), this.f30574a);
                if (WebEngage.get().getWebEngageConfig().getEveryActivityIsScreen()) {
                    screenNavigated(activity.getClass().getName());
                }
            }
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void stop(Activity activity) {
        if (activity != null) {
            try {
                Logger.d("WebEngage", " Activity stop: " + activity.getClass().getName());
                try {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    Fragment findFragmentByTag = fragmentManager.findFragmentByTag("WebEngage");
                    if (findFragmentByTag != null) {
                        fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
                    }
                } catch (Exception unused) {
                    Logger.e("WebEngage", "Unable to remove attached in-app fragment from stopped activity.");
                }
            } catch (Exception e10) {
                b(e10);
                return;
            }
        }
        int decrementAndGet = this.f30579f.decrementAndGet();
        HashMap hashMap = new HashMap();
        hashMap.put("activity_count", Integer.valueOf(decrementAndGet));
        if (decrementAndGet == 0) {
            this.f30576c = null;
            DataHolder.get().a(false);
            long h10 = this.f30577d.h();
            a().c(System.currentTimeMillis() + h10);
            this.f30578e.d(System.currentTimeMillis() + h10);
        }
        WebEngage.startService(l1.a(y3.f31164i, n0.b("we_wk_activity_stop", null, null, hashMap, this.f30574a), this.f30574a), this.f30574a);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str) {
        track(str, null, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void trackSystem(String str, Map<String, ?> map, Map<String, ?> map2) {
        if (o0.f30738a.contains(str)) {
            if (map2 == null) {
                map2 = null;
            }
            a(n0.b(str, map, map2, null, this.f30574a));
        } else {
            Logger.d("WebEngage", "Event name: " + str + " is not a system event");
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    protected void a(Object obj) {
        WebEngage.startService(l1.a(y3.f31158c, obj, this.f30574a), this.f30574a);
    }

    @Override // com.webengage.sdk.android.Analytics
    protected void b(Object obj) {
        if (obj != null) {
            Logger.e("WebEngage", "Some error occurred : " + obj.toString());
        }
        WebEngage.startService(l1.a(y3.f31163h, obj, this.f30574a), this.f30574a);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str, Map<String, ? extends Object> map) {
        try {
            DataHolder.get().b(new ArrayList());
            Logger.d("WebEngage", "Screen navigated: " + str + " with data: " + map);
            HashMap hashMap = new HashMap();
            hashMap.put("screen_name", str);
            WebEngage.startService(l1.a(y3.f31164i, n0.b("we_wk_screen_navigated", hashMap, map, null, this.f30574a), this.f30574a), this.f30574a);
            x.a(this.f30574a).screenNavigated(str);
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Analytics.Options options) {
        track(str, null, options);
    }

    private boolean a(String str) {
        String str2;
        if (WebEngageUtils.c(str)) {
            str2 = "Event Name is Invalid";
        } else {
            if (!str.startsWith("we_")) {
                return true;
            }
            str2 = "Found prefix \"we_\" in event name : " + str;
        }
        Logger.e("WebEngage", str2);
        return false;
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ? extends Object> map) {
        track(str, map, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ?> map, Analytics.Options options) {
        if (a(str)) {
            a(n0.a(str, null, map, options != null ? options.toMap() : null, this.f30574a));
        }
    }
}
