package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import com.webengage.sdk.android.C2958f;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.l1;
import com.webengage.sdk.android.m3;
import com.webengage.sdk.android.p0;
import com.webengage.sdk.android.y3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static o f30426b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30427c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30428a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (o.f30426b == null) {
                o unused = o.f30426b = new o(context, null);
            }
            return o.f30426b;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30429a;

        static {
            int[] iArr = new int[y3.values().length];
            f30429a = iArr;
            try {
                iArr[y3.f31159d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30429a[y3.f31166k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30429a[y3.f31158c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30429a[y3.f31164i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private o(Context context) {
        this.f30428a = null;
        this.f30428a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        HashMap hashMap = new HashMap();
        int i10 = b.f30429a[y3Var.ordinal()];
        if (i10 == 1) {
            hashMap.put("first_time", Boolean.TRUE);
            hashMap.put("current", 0);
            hashMap.put("navigation", "right");
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                obj = (p0) obj;
                hashMap.put("first_time", Boolean.FALSE);
            }
            return hashMap;
        }
        hashMap.put("action_data", obj);
        return hashMap;
    }

    /* synthetic */ o(Context context, a aVar) {
        this(context);
    }

    private void a(FragmentManager fragmentManager) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("WebEngage");
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        String string;
        WeakReference<Activity> activity;
        int i10 = b.f30429a[y3Var.ordinal()];
        if (i10 == 1) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null && bundle.containsKey("source") && "webengage".equalsIgnoreCase(bundle.getString("source")) && (string = bundle.getString("message_action")) != null && string.equalsIgnoreCase("show_system_tray_notification") && bundle.containsKey("message_data")) {
                try {
                    String string2 = bundle.getString("message_data");
                    Logger.d("WebEngage", " Push Payload: " + string2);
                    JSONObject jSONObject = new JSONObject(string2);
                    if (jSONObject.has("testing_details") && DataHolder.get().M()) {
                        if (DataHolder.get().a("entity_is_running") != null && ((AtomicBoolean) DataHolder.get().a("entity_is_running")).get()) {
                            a(C2958f.a(this.f30428a).getActivity().get().getFragmentManager());
                        }
                        a(jSONObject.getJSONObject("testing_details"));
                    }
                    new i(this.f30428a).d(b(y3Var, jSONObject.getString("identifier")));
                    if (jSONObject.has("testing_details") && DataHolder.get().M()) {
                        ((NotificationManager) this.f30428a.getSystemService("notification")).cancel(jSONObject.getString("identifier").hashCode());
                        return;
                    }
                    return;
                } catch (JSONException e10) {
                    WebEngage.startService(l1.a(y3.f31163h, e10, this.f30428a), this.f30428a);
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if ((i10 != 3 && i10 != 4) || !(obj instanceof p0)) {
                return;
            }
            p0 p0Var = (p0) obj;
            if ("we_wk_push_notification_rerender".equals(p0Var.d()) || "we_wk_progress_bar_push_notification_rerender".equals(p0Var.d())) {
                new i(this.f30428a).d(b(y3Var, obj));
                return;
            }
            if (!"we_wk_activity_start".equals(p0Var.d()) || DataHolder.get().a("in_app_testing_data") == null) {
                return;
            }
            activity = C2958f.a(this.f30428a).getActivity();
            if (activity != null && activity.get() != null && !activity.get().isFinishing() && DataHolder.get().a("entity_is_running") != null && ((AtomicBoolean) DataHolder.get().a("entity_is_running")).get()) {
                a(activity.get().getFragmentManager());
            }
            if (activity == null || activity.get() == null || activity.get().isDestroyed() || !DataHolder.get().a(false, true)) {
                return;
            }
        } else {
            if (DataHolder.get().a("in_app_testing_data") == null || !DataHolder.get().M()) {
                List<String> list = (List) obj;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (String str : list) {
                    Boolean bool = (Boolean) DataHolder.get().b("opt_in_inapp");
                    if ((bool == null || bool.booleanValue()) && DataHolder.get().M() && DataHolder.get().a(false, true)) {
                        new e(this.f30428a).d(b(y3Var, str));
                    }
                }
                return;
            }
            activity = C2958f.a(this.f30428a).getActivity();
            if (activity != null && activity.get() != null && !activity.get().isFinishing() && DataHolder.get().a("entity_is_running") != null && ((AtomicBoolean) DataHolder.get().a("entity_is_running")).get()) {
                a(activity.get().getFragmentManager());
            }
            if (activity == null || activity.get() == null || activity.get().isDestroyed() || !DataHolder.get().a(false, true)) {
                return;
            }
        }
        a(activity.get().getFragmentManager());
        a((JSONObject) DataHolder.get().a("in_app_testing_data"));
        DataHolder.get().a("in_app_testing_data", (Object) null);
    }

    private void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("notificationEncId");
            String string3 = jSONObject.getString("layout");
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("tokens")) {
                JSONArray jSONArray = jSONObject.getJSONArray("tokens");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        arrayList2.add(jSONArray2.getString(i11));
                    }
                    arrayList.add(arrayList2);
                }
            }
            e eVar = new e(this.f30428a);
            HashMap hashMap = new HashMap();
            hashMap.put("id", string);
            hashMap.put("notificationEncId", string2);
            hashMap.put("layout", string3);
            hashMap.put("tokens", arrayList);
            eVar.d(b(y3.f31166k, hashMap));
        } catch (Exception unused) {
            Logger.d("WebEngage", "Exception while parsing testing campaign details");
        }
    }
}
