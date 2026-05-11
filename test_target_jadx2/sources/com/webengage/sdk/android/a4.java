package com.webengage.sdk.android;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.Provider;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class a4 implements z3 {

    /* renamed from: a, reason: collision with root package name */
    Context f30272a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f30273b = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Analytics f30274a;

        a(Analytics analytics) {
            this.f30274a = analytics;
        }

        @Override // java.lang.Runnable
        public void run() {
            long b10 = this.f30274a.a().b();
            q2.b(false);
            this.f30274a.b().a(b10);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30276a;

        static {
            int[] iArr = new int[y3.values().length];
            f30276a = iArr;
            try {
                iArr[y3.f31157b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30276a[y3.f31158c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30276a[y3.f31164i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30276a[y3.f31165j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30276a[y3.f31159d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30276a[y3.f31160e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30276a[y3.f31169n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30276a[y3.f31168m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30276a[y3.f31170o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    a4(Context context) {
        this.f30272a = null;
        this.f30272a = context.getApplicationContext();
    }

    private void a() {
        if (!l4.c().e() && WebEngage.get().getWebEngageConfig().getShouldEncryptUserStorage()) {
            l4.c().b();
            ArrayList<String> b10 = WebEngageUtils.b();
            if (b10.isEmpty()) {
                return;
            }
            com.webengage.sdk.android.actions.database.e.b(this.f30272a).b(b10);
            return;
        }
        if (!l4.c().e() || WebEngage.get().getWebEngageConfig().getShouldEncryptUserStorage()) {
            return;
        }
        ArrayList<String> b11 = WebEngageUtils.b();
        if (b11.isEmpty()) {
            return;
        }
        com.webengage.sdk.android.actions.database.e.b(this.f30272a).a(b11);
        l4.c().a();
    }

    private void b(Analytics analytics) {
        if (TextUtils.isEmpty(analytics.a().r())) {
            e(analytics);
        }
        DataHolder.get().f(true);
    }

    private void c(Analytics analytics) {
        String str;
        if (analytics.a().b("webengage_volatile_prefs.txt").contains("referrer")) {
            try {
                str = URLDecoder.decode(analytics.a().d("referrer"), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = BuildConfig.FLAVOR;
            }
            analytics.a().f("referrer");
            HashMap hashMap = new HashMap();
            if (!str.isEmpty()) {
                hashMap.put("referrer", str);
                hashMap.putAll(new z0().a(str));
            }
            WebEngage.startService(l1.a(y3.f31158c, n0.b("app_installed", hashMap, null, null, this.f30272a), this.f30272a), this.f30272a);
        }
    }

    private void d(Analytics analytics) {
        int q10 = analytics.a().q();
        PackageInfo e10 = WebEngageUtils.e(this.f30272a);
        if (e10 != null) {
            int i10 = e10.versionCode;
            if (q10 != -1 && q10 != i10) {
                HashMap hashMap = new HashMap();
                hashMap.put("app_version_code_old", Integer.valueOf(q10));
                hashMap.put("app_version_code_new", Integer.valueOf(i10));
                WebEngage.startService(l1.a(y3.f31158c, n0.b("app_upgraded", null, hashMap, null, this.f30272a), this.f30272a), this.f30272a);
                x.a(this.f30272a).onAppUpgraded(this.f30272a, q10, i10);
            }
            analytics.a().a(e10.versionCode);
        }
    }

    private void e(Analytics analytics) {
        String h10 = analytics.a().h();
        String[] split = analytics.a().g().split("\\|");
        String str = h10 + "|" + split[1] + "|" + WebEngage.get().getWebEngageConfig().getWebEngageKey();
        Logger.i("WebEngage", "generated new WEInstanceID");
        analytics.a().p(str);
    }

    private void a(Analytics analytics) {
        String g10 = analytics.a().g();
        if (g10.isEmpty()) {
            analytics.a().m(this.f30272a.getPackageName() + "|" + WebEngageUtils.b(this.f30272a));
        } else {
            String str = this.f30272a.getPackageName() + "|" + WebEngageUtils.a();
            if (str.equalsIgnoreCase(g10)) {
                analytics.a().m(this.f30272a.getPackageName() + "|" + WebEngageUtils.b(this.f30272a));
                a(str);
            }
        }
        DataHolder.get().d(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (com.facebook.react.modules.appstate.AppStateModule.APP_STATE_BACKGROUND.equals(r0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        if (com.facebook.react.modules.appstate.AppStateModule.APP_STATE_BACKGROUND.equals(r0) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(p0 p0Var) {
        Map map;
        Map map2;
        String string;
        String str;
        x2 b10;
        long currentTimeMillis;
        String str2;
        String str3;
        String d10 = p0Var.d();
        Analytics a10 = C2958f.a(this.f30272a);
        if (d10 != null) {
            if (!"we_wk_activity_start".equals(d10)) {
                Map map3 = null;
                if ("we_wk_activity_stop".equals(d10)) {
                    Map<String, Object> l10 = p0Var.l();
                    if (l10 != null && (str2 = (String) l10.get("screen_path")) != null && str2.equals("com.webengage.sdk.android.actions.render.WebEngageActivity")) {
                        return false;
                    }
                    Map<String, Object> f10 = p0Var.f();
                    if (f10 != null && f10.containsKey("activity_count") && ((Number) f10.get("activity_count")).intValue() == 0) {
                        long i10 = DataHolder.get().i();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (i10 != -1 && currentTimeMillis2 > i10) {
                            DataHolder.get().a(-1L);
                            a10.c().a(currentTimeMillis2 - i10);
                        }
                        WebEngage.get().c((BroadcastReceiver) null);
                    }
                } else if ("visitor_new_session".equals(d10)) {
                    a10.b().b(DataHolder.get().C());
                    DataHolder.get().b();
                    o4.b().a();
                    a10.a().a((List<String>) null);
                    for (h0 h0Var : h0.values()) {
                        if (!h0Var.a()) {
                            DataHolder.get().a(h0Var.toString(), (Object) null);
                        }
                    }
                    a10.c().g();
                    if ("online".equals(p0Var.l().get("session_type").toString())) {
                        try {
                            o3.a(this.f30272a).a(y3.f31160e, null);
                            o3.a(this.f30272a).a(y3.f31168m, new HashSet(Arrays.asList("fetch_profile", "jcx", "static_list")));
                        } catch (Exception e10) {
                            try {
                                o3.a(this.f30272a).a(y3.f31163h, e10);
                            } catch (Exception unused) {
                            }
                        }
                        if (DataHolder.get().K() != null) {
                            b10 = a10.b();
                            currentTimeMillis = System.currentTimeMillis() + 15000;
                        } else {
                            b10 = a10.b();
                            currentTimeMillis = System.currentTimeMillis() + 60000;
                        }
                        b10.c(currentTimeMillis);
                        a10.b().b(System.currentTimeMillis() + 120000);
                        a10.b().d(DataHolder.get().C());
                        a10.b().a(10000L);
                    } else {
                        a(a10, (Map<String, Object>) null);
                        a10.b().d(System.currentTimeMillis() + 21600000);
                    }
                } else if (!"visitor_session_close".equals(d10)) {
                    if ("user_logged_in".equals(d10)) {
                        String obj = p0Var.f().get("cuid").toString();
                        if (a10.a().d().equals(obj)) {
                            str = "INVALID OPERATION: User: " + obj + " is Already Logged-in";
                        } else {
                            if (!a10.a().d().equals(obj) && !a10.a().d().isEmpty()) {
                                try {
                                    o3.a(this.f30272a).a(y3.f31158c, n0.b("user_logged_out", null, null, null, this.f30272a));
                                } catch (Exception e11) {
                                    try {
                                        o3.a(this.f30272a).a(y3.f31163h, e11);
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                            a10.a().l(obj);
                        }
                    } else if ("user_logged_out".equals(d10)) {
                        if (a10.a().d().isEmpty()) {
                            str = "INVALID OPERATION: User Not Logged-in";
                        }
                    } else if ("we_wk_screen_navigated".equals(d10)) {
                        a10.b().a(DataHolder.get().v());
                        a10.b().c(DataHolder.get().v());
                        WeakReference<Activity> activity = a10.getActivity();
                        if (activity != null && activity.get() != null) {
                            FragmentManager fragmentManager = activity.get().getFragmentManager();
                            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("WebEngage");
                            if (findFragmentByTag != null) {
                                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                                try {
                                    if (!((com.webengage.sdk.android.actions.render.n) findFragmentByTag).b().isTestInApp()) {
                                        beginTransaction.remove(findFragmentByTag).commitAllowingStateLoss();
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                            try {
                                Map<String, Object> c10 = p0Var.c();
                                Bundle extras = activity.get().getIntent().getExtras();
                                if (extras != null && (string = extras.getString("we_add_to_screen_data")) != null && Boolean.valueOf(string).booleanValue()) {
                                    if (c10 == null) {
                                        c10 = new HashMap<>();
                                    }
                                    c10.putAll((Map) DataType.cloneExternal(d10, WebEngageUtils.a(extras)));
                                    activity.get().getIntent().removeExtra("we_add_to_screen_data");
                                    p0Var.a(c10);
                                }
                            } catch (Exception unused4) {
                            }
                        }
                    } else if ("user_update".equals(d10)) {
                        try {
                            Map<String, Object> l11 = p0Var.l();
                            if (l11 != null && !l11.isEmpty()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(h0.USER.toString());
                                try {
                                    map = (Map) DataHolder.get().a(arrayList);
                                } catch (Exception e12) {
                                    Logger.e("WebEngage", "Exception while getting user-map from data-holder", e12);
                                    map = null;
                                }
                                arrayList.clear();
                                arrayList.add(h0.ANDROID.toString());
                                try {
                                    map2 = (Map) DataHolder.get().a(arrayList);
                                } catch (Exception e13) {
                                    Logger.e("WebEngage", "Exception while getting android-map from data-holder", e13);
                                    map2 = null;
                                }
                                for (Map.Entry<String, Object> entry : l11.entrySet()) {
                                    String key = entry.getKey();
                                    Object value = entry.getValue();
                                    if (g4.a(key) != null) {
                                        if (map != null) {
                                            try {
                                                if (!map.isEmpty()) {
                                                    if (!WebEngageUtils.a(map.get(key), value)) {
                                                        return true;
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                Logger.e("WebEngage", "Exception while pre-analyzing user-update", e);
                                                return true;
                                            }
                                        }
                                        return true;
                                    }
                                    if (c4.a(key)) {
                                        if (map2 != null) {
                                            try {
                                                if (!map2.isEmpty()) {
                                                    if (!WebEngageUtils.a(map2.get(key), value)) {
                                                        return true;
                                                    }
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                Logger.e("WebEngage", "Exception while pre-analyzing user-update", e);
                                                return true;
                                            }
                                        }
                                        return true;
                                    }
                                }
                            }
                            Map<String, Object> c11 = p0Var.c();
                            if (c11 != null && !c11.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(h0.ATTR.toString());
                                try {
                                    map3 = (Map) DataHolder.get().a(arrayList2);
                                } catch (Exception e16) {
                                    Logger.e("WebEngage", "Exception while getting attr-map from data-holder", e16);
                                }
                                for (Map.Entry<String, Object> entry2 : c11.entrySet()) {
                                    if (map3 == null || map3.isEmpty()) {
                                        return true;
                                    }
                                    if (!WebEngageUtils.a(map3.get(entry2.getKey()), entry2.getValue())) {
                                        return true;
                                    }
                                }
                            }
                            Logger.w("WebEngage", "User profile is up-to-date, hence not updating");
                            return false;
                        } catch (Exception e17) {
                            e = e17;
                            Logger.e("WebEngage", "Exception while pre-analyzing user-update", e);
                            return true;
                        }
                    }
                    Logger.e("WebEngage", str);
                    return false;
                }
                return true;
            }
            Map<String, Object> l12 = p0Var.l();
            if (l12 != null && (str3 = (String) l12.get("screen_path")) != null && str3.equals("com.webengage.sdk.android.actions.render.WebEngageActivity")) {
                return false;
            }
            String q10 = DataHolder.get().q();
            Map<String, Object> f11 = p0Var.f();
            if (f11 != null && f11.containsKey("activity_count") && ((Number) f11.get("activity_count")).intValue() == 1) {
                a10.a().c(-1L);
                if (DataHolder.get().K() != null) {
                    a10.b().c(System.currentTimeMillis() + 15000);
                } else {
                    a10.b().c(System.currentTimeMillis() + 60000);
                }
                a10.b().b(System.currentTimeMillis() + 120000);
                DataHolder.get().a(System.currentTimeMillis());
                if (DataHolder.get().N()) {
                    DataHolder.get().b(false);
                }
                a10.c().d();
                a(a10, f11);
                a10.c().b();
            }
        }
        return true;
    }

    private void a(Analytics analytics, Map<String, Object> map) {
        String obj = (map == null || !map.containsKey("landing_page")) ? BuildConfig.FLAVOR : map.get("landing_page").toString();
        boolean isEmpty = analytics.a().d().isEmpty();
        C2961i a10 = analytics.a();
        DataHolder.get().a(isEmpty ? a10.h() : a10.d(), obj);
        Logger.d("WebEngage", "Session Referrer(Landing Page) extracted: " + obj);
    }

    @Override // com.webengage.sdk.android.z3
    public boolean b(y3 y3Var, Object obj) {
        JSONObject jSONObject;
        Analytics a10 = C2958f.a(this.f30272a);
        if (!DataHolder.get().P()) {
            a(a10);
        }
        if (!DataHolder.get().Q()) {
            b(a10);
        }
        long k10 = a10.a().k();
        if ("online".equalsIgnoreCase(DataHolder.get().q()) && k10 != -1 && System.currentTimeMillis() >= k10) {
            a10.c().c();
            a10.b().a();
        }
        int i10 = b.f30276a[y3Var.ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2 || i10 == 3) {
            p0 p0Var = (p0) obj;
            if ("system".equals(p0Var.b())) {
                return b(p0Var);
            }
        } else if (i10 == 5) {
            Bundle bundle = (Bundle) obj;
            if ("show_system_tray_notification".equalsIgnoreCase(bundle.getString("message_action"))) {
                try {
                    jSONObject = new JSONObject(bundle.getString("message_data"));
                } catch (JSONException e10) {
                    Logger.e("WebEngage", "Exception while parsing push message_data for deduping", e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    String optString = jSONObject.optString("experimentId");
                    String optString2 = jSONObject.optString("identifier");
                    C2961i a11 = C2958f.a(this.f30272a).a();
                    Set<String> n10 = a11.n();
                    if (n10 != null && n10.contains(optString)) {
                        Logger.d("WebEngage", "Push {id: " + optString2 + ", experiment-id: " + optString + "} is already shown, hence not rendering.");
                        return false;
                    }
                    a11.i(optString);
                }
            }
        }
        return true;
    }

    private void a(p0 p0Var) {
        String d10 = p0Var.d();
        Analytics a10 = C2958f.a(this.f30272a);
        if (d10 != null) {
            if ("user_logged_out".equals(d10)) {
                if (DataHolder.get().M()) {
                    long i10 = DataHolder.get().i();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (i10 != -1 && currentTimeMillis > i10) {
                        DataHolder.get().a(currentTimeMillis);
                        a10.c().a(currentTimeMillis - i10);
                    }
                }
                a10.c().d();
                a10.a().l(BuildConfig.FLAVOR);
                WebEngage.get().analytics().a().a(Boolean.FALSE);
                ((e4) d4.a(this.f30272a, a10)).a();
                e(a10);
                String d11 = a10.a().d();
                com.webengage.sdk.android.actions.database.e b10 = com.webengage.sdk.android.actions.database.e.b(this.f30272a);
                if (d11.isEmpty()) {
                    d11 = a10.a().h();
                }
                Map<String, Object> a11 = b10.a(d11);
                if (a11 != null && a11.size() > 0) {
                    DataHolder.get().c(a11);
                }
                if (DataHolder.get().M()) {
                    a10.c().b();
                } else {
                    a10.c().a();
                }
                a10.b().b();
                return;
            }
            if ("visitor_session_close".equals(d10)) {
                n4.b();
                a(a10, (Map<String, Object>) null);
                return;
            }
            if ("user_logged_in".equals(d10)) {
                try {
                    o3.a(this.f30272a).a(y3.f31168m, new HashSet(Arrays.asList("fetch_profile", "jcx", "static_list")));
                } catch (Exception e10) {
                    try {
                        o3.a(this.f30272a).a(y3.f31163h, e10);
                    } catch (Exception unused) {
                    }
                }
                a10.b().e(System.currentTimeMillis() + 60000);
                return;
            }
            if ("notification_control_group".equals(d10)) {
                DataHolder.get().c(false);
                return;
            }
            if (!"app_upgraded".equals(d10)) {
                "we_wk_activity_start".equals(d10);
                return;
            }
            HashMap hashMap = new HashMap();
            String i11 = a10.a().i();
            if (!WebEngageUtils.d(i11)) {
                hashMap.put("gcm_regId", i11);
                hashMap.put("gcm_project_number", null);
                hashMap.put("provider", Provider.FCM.name());
                WebEngage.startService(l1.a(y3.f31158c, n0.b("gcm_registered", null, hashMap, null, this.f30272a), this.f30272a), this.f30272a);
            }
            HashMap hashMap2 = new HashMap();
            String t10 = a10.a().t();
            String s10 = a10.a().s();
            if (!WebEngageUtils.d(t10)) {
                hashMap2.put("gcm_regId", t10);
                hashMap2.put("gcm_project_number", null);
                hashMap2.put("provider", Provider.MI.name());
                if (!TextUtils.isEmpty(s10)) {
                    hashMap2.put("region", s10);
                }
                WebEngage.startService(l1.a(y3.f31158c, n0.b("gcm_registered", null, hashMap2, null, this.f30272a), this.f30272a), this.f30272a);
            }
            HashMap hashMap3 = new HashMap();
            String f10 = a10.a().f();
            if (WebEngageUtils.d(f10)) {
                return;
            }
            hashMap.put("gcm_regId", f10);
            hashMap.put("gcm_project_number", null);
            hashMap.put("provider", Provider.HW.name());
            WebEngage.startService(l1.a(y3.f31158c, n0.b("gcm_registered", null, hashMap3, null, this.f30272a), this.f30272a), this.f30272a);
        }
    }

    @Override // com.webengage.sdk.android.z3
    public void a(y3 y3Var, Object obj) {
        x2 b10;
        long currentTimeMillis;
        Analytics a10 = C2958f.a(this.f30272a);
        long j10 = 60000;
        switch (b.f30276a[y3Var.ordinal()]) {
            case 1:
                o4.b().a();
                a10.c().f();
                try {
                    c(a10);
                    d(a10);
                } catch (Exception e10) {
                    Logger.e("WebEngage", "Exception while checking for app install and app upgrade events", e10);
                }
                x2 b11 = a10.b();
                if (!b11.d()) {
                    b11.a(a10.a().b());
                    break;
                }
                break;
            case 2:
            case 3:
                p0 p0Var = (p0) obj;
                if ("system".equals(p0Var.b())) {
                    a(p0Var);
                    if (y3.f31158c.equals(y3Var) && AppStateModule.APP_STATE_BACKGROUND.equals(DataHolder.get().q())) {
                        WebEngage.get().c((BroadcastReceiver) null);
                        break;
                    }
                }
                break;
            case 4:
                a10.c().e();
                break;
            case 6:
                if (DataHolder.get().M()) {
                    a10.b().b(System.currentTimeMillis() + 120000);
                }
                if (DataHolder.get().O()) {
                    a10.c().f();
                    DataHolder.get().b("refreshSessionPageRule", Boolean.FALSE);
                    break;
                }
                break;
            case 7:
                if (!DataHolder.get().M()) {
                    b10 = a10.b();
                    currentTimeMillis = System.currentTimeMillis();
                    j10 = 10800000;
                } else if (DataHolder.get().K() != null) {
                    b10 = a10.b();
                    currentTimeMillis = System.currentTimeMillis();
                    j10 = 15000;
                } else {
                    b10 = a10.b();
                    currentTimeMillis = System.currentTimeMillis();
                }
                b10.c(currentTimeMillis + j10);
                break;
            case 8:
                ArrayList arrayList = new ArrayList();
                arrayList.add(h0.USER.toString());
                arrayList.add("cuid");
                String str = (String) DataHolder.get().a(arrayList);
                if (!a10.a().d().isEmpty() && ((str == null || str.isEmpty()) && DataHolder.get().M())) {
                    a10.b().e(System.currentTimeMillis() + 60000);
                }
                a10.c().f();
                break;
            case 9:
                a10.a().a();
                if (this.f30273b == null) {
                    this.f30273b = new ScheduledThreadPoolExecutor(1);
                }
                this.f30273b.schedule(new a(a10), 30000L, TimeUnit.MILLISECONDS);
                break;
        }
    }

    private void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("old_interface_id", str);
        WebEngage.startService(l1.a(y3.f31158c, n0.b("user_device_idchange", hashMap, null, null, this.f30272a), this.f30272a), this.f30272a);
    }
}
