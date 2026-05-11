package com.webengage.sdk.android.actions.database;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.webengage.sdk.android.AbstractC2951a;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.render.CarouselV1CallToAction;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.c2;
import com.webengage.sdk.android.g4;
import com.webengage.sdk.android.h0;
import com.webengage.sdk.android.l1;
import com.webengage.sdk.android.n0;
import com.webengage.sdk.android.p0;
import com.webengage.sdk.android.s1;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class b extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30286c;

    /* renamed from: d, reason: collision with root package name */
    private Object f30287d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30288a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30289b;

        static {
            int[] iArr = new int[WebEngageConstant.a.values().length];
            f30289b = iArr;
            try {
                iArr[WebEngageConstant.a.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30289b[WebEngageConstant.a.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[WebEngageConstant.STYLE.values().length];
            f30288a = iArr2;
            try {
                iArr2[WebEngageConstant.STYLE.BIG_PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30288a[WebEngageConstant.STYLE.CAROUSEL_V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30288a[WebEngageConstant.STYLE.RATING_V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    protected b(Context context) {
        super(context);
        this.f30286c = null;
        this.f30287d = null;
        this.f30286c = context.getApplicationContext();
    }

    private void a(p0 p0Var) {
        Map<String, Object> h10 = DataHolder.get().h();
        Map<String, Object> c10 = p0Var.c();
        HashMap hashMap = new HashMap();
        if (h10 != null) {
            hashMap.putAll(h10);
        }
        if (c10 != null) {
            hashMap.putAll(c10);
        }
        p0Var.a(hashMap);
    }

    private void b(p0 p0Var) {
        Map<String, Object> l10 = p0Var.l();
        if (l10 == null) {
            l10 = new HashMap<>();
        }
        if (!TextUtils.isEmpty(DataHolder.get().D())) {
            l10.put("landing_page", DataHolder.get().D());
        }
        p0Var.c(l10);
    }

    private void c(p0 p0Var) {
        Map<String, Object> c10 = p0Var.c();
        Map<String, Object> l10 = p0Var.l();
        HashMap hashMap = new HashMap();
        if (l10 != null) {
            l10.put("event_time", p0Var.e());
            hashMap.put("we_wk_sys", l10);
        }
        if (c10 != null) {
            hashMap.putAll(c10);
        }
        String b10 = p0Var.b();
        String d10 = p0Var.d();
        if ("system".equals(b10) && !d10.startsWith("we_")) {
            d10 = "we_" + d10;
        }
        DataHolder.get().c(d10, hashMap);
        Map<String, List<Object>> I10 = DataHolder.get().I();
        if (I10 != null) {
            Iterator<Map.Entry<String, List<Object>>> it = I10.entrySet().iterator();
            while (it.hasNext()) {
                List<Object> value = it.next().getValue();
                if (value != null) {
                    Iterator<Object> it2 = value.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        List<Object> list = (List) it2.next();
                        if (list != null && list.size() != 0 && a(p0Var, list)) {
                            DataHolder.get().d(d10, hashMap);
                            break;
                        }
                    }
                }
            }
        }
    }

    private void l(String str) {
        PushNotificationData pushNotificationData;
        HashSet hashSet;
        try {
            pushNotificationData = new PushNotificationData(new JSONObject(d(str)), this.f30286c);
        } catch (JSONException unused) {
            pushNotificationData = null;
        }
        if (pushNotificationData == null || !pushNotificationData.isBigNotification() || pushNotificationData.getStyle() == null) {
            return;
        }
        int i10 = a.f30288a[pushNotificationData.getStyle().ordinal()];
        if (i10 == 2) {
            hashSet = new HashSet();
            List<CarouselV1CallToAction> callToActions = pushNotificationData.getCarouselV1Data().getCallToActions();
            if (callToActions != null) {
                Iterator<CarouselV1CallToAction> it = callToActions.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().getImageURL());
                }
            }
            if (hashSet.size() <= 0) {
                return;
            }
        } else {
            if (i10 != 3) {
                return;
            }
            hashSet = new HashSet();
            if (pushNotificationData.getRatingV1().getImageUrl() != null) {
                hashSet.add(pushNotificationData.getRatingV1().getImageUrl());
            }
            if (pushNotificationData.getRatingV1().getIconUrl() != null) {
                hashSet.add(pushNotificationData.getRatingV1().getIconUrl());
            }
            if (hashSet.size() <= 0) {
                return;
            }
        }
        com.webengage.sdk.android.utils.http.b.b(this.f30286c).a((Set<String>) hashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x06ab, code lost:
    
        if ("user_device_idchange".equals(r5) != false) goto L145;
     */
    @Override // com.webengage.sdk.android.AbstractC2951a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj2;
        WebEngageConstant.a aVar;
        Location a10;
        HashMap hashMap;
        ArrayList arrayList;
        HashSet hashSet;
        Intent a11;
        Map map;
        JSONObject jSONObject;
        Map map2 = (Map) obj;
        String str5 = (String) map2.get("action_type");
        if ("gcm".equals(str5)) {
            Bundle bundle = (Bundle) map2.get("action_data");
            String string = bundle.getString("message_action");
            if ("show_system_tray_notification".equalsIgnoreCase(string)) {
                try {
                    jSONObject = new JSONObject(bundle.getString("message_data"));
                } catch (JSONException e10) {
                    b(e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    b(jSONObject.optString("identifier"), jSONObject.toString());
                }
            } else if ("ping".equalsIgnoreCase(string)) {
                String string2 = bundle.getString("message_data");
                if (string2 != null) {
                    try {
                        map = (Map) DataType.convert(string2, DataType.MAP, false);
                    } catch (Exception unused) {
                    }
                } else {
                    map = null;
                }
                a((Object) n0.b("push_ping", map, null, null, this.f30286c));
            } else {
                if (HVRetakeActivity.CONFIG_TAG.equals(string)) {
                    a11 = l1.a(y3.f31160e, null, this.f30286c);
                } else {
                    if ("fetch_profile".equals(string)) {
                        hashSet = new HashSet(Arrays.asList("fetch_profile"));
                    } else if ("jcx".equals(string)) {
                        hashSet = new HashSet(Arrays.asList("jcx"));
                    } else if ("static_list".equals(string)) {
                        hashSet = new HashSet(Arrays.asList("static_list"));
                    }
                    a11 = l1.a(y3.f31168m, hashSet, this.f30286c);
                }
                WebEngage.startService(a11, this.f30286c);
            }
        } else {
            if (Keys.EVENT.equalsIgnoreCase(str5) || "internal_event".equalsIgnoreCase(str5)) {
                p0 p0Var = (p0) map2.get("action_data");
                p0Var.a(d());
                p0Var.g(j());
                p0Var.e(h());
                p0Var.a(new Date());
                String d10 = p0Var.d();
                if (!TextUtils.isEmpty(d10) && !TextUtils.isEmpty(p0Var.b()) && (!"app_installed".equalsIgnoreCase(d10) || !"system".equals(p0Var.b()))) {
                    b(p0Var);
                }
                c cVar = new c(this.f30286c);
                if (d10 != null && "system".equals(p0Var.b())) {
                    String h10 = d().isEmpty() ? h() : d();
                    if ("user_update_geo_info".equals(d10) || "user_update".equals(d10) || "user_delete_attributes".equals(d10)) {
                        Map<String, Object> l10 = p0Var.l();
                        DataHolder.get().h(h10, l10);
                        if ("user_update_geo_info".equals(d10)) {
                            Double d11 = (Double) l10.get(AppConstants.LATITUDE);
                            Double d12 = (Double) l10.get(AppConstants.LONGITUDE);
                            if (d11 != null && d12 != null) {
                                Map<String, Object> a12 = cVar.a(d11, d12);
                                DataHolder.get().h(h10, a12);
                                if (a12 != null) {
                                    l10.putAll(a12);
                                    p0Var.c(l10);
                                }
                            }
                        }
                        DataHolder.get().f(h10, p0Var.c());
                        if (!"user_update".equals(d10)) {
                            str = "user_delete_attributes".equals(d10) ? "User attributes successfully removed" : "User attributes successfully saved";
                        }
                        Logger.d("WebEngage", str);
                    } else if ("user_increment".equals(d10)) {
                        DataHolder.get().b(h10, p0Var.l());
                        DataHolder.get().a(h10, p0Var.c());
                    } else {
                        if ("user_logged_in".equals(d10)) {
                            String d13 = d();
                            e.b(this.f30286c).b(d13, h());
                            e.b(this.f30286c).a(d13, h0.STATIC_LIST);
                            if (DataHolder.get().L() == null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("first_logged_in", new Date());
                                DataHolder.get().h(h10, hashMap2);
                            }
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("last_logged_in", new Date());
                            DataHolder.get().h(h10, hashMap3);
                            DataHolder.get().c(e.b(this.f30286c).a(h10));
                            Logger.d("WebEngage", "User successfully Logged in");
                            DataHolder.get().a(h10, "cuid", d13, h0.USER, c2.FORCE_UPDATE);
                        } else if ("user_logged_out".equals(d10)) {
                            Logger.d("WebEngage", "User successfully Logged out");
                            e.b(this.f30286c).a(h10, h0.STATIC_LIST);
                        } else {
                            boolean equals = "notification_click".equals(d10);
                            String str6 = BuildConfig.FLAVOR;
                            try {
                                if (equals || "app_personalization_click".equals(d10)) {
                                    Map<String, Object> l11 = p0Var.l();
                                    String str7 = (String) l11.get("experiment_id");
                                    com.webengage.sdk.android.actions.rules.a aVar2 = new com.webengage.sdk.android.actions.rules.a(this.f30286c);
                                    WebEngageConstant.a aVar3 = "app_personalization_click".equals(d10) ? WebEngageConstant.a.INLINE_PERSONALIZATION : WebEngageConstant.a.NOTIFICATION;
                                    Map<String, Object> a13 = aVar2.a(str7, aVar3);
                                    if (str7 != null && str7.startsWith("T_")) {
                                        a13 = new HashMap<>();
                                        a13.put("journeyId", BuildConfig.FLAVOR);
                                    }
                                    String e11 = DataHolder.get().e(a13, aVar3);
                                    DataHolder.get().a(h10, e11 + "_click", (Number) 1L, h0.SCOPES);
                                    a(p0Var);
                                    l11.put("total_view_count", DataHolder.get().c(str7));
                                    l11.put("total_view_count_session", DataHolder.get().d(str7));
                                    int indexOf = e11.indexOf(91);
                                    if (indexOf != -1) {
                                        l11.put("scope", e11.substring(indexOf + 1, e11.indexOf(93, indexOf)));
                                    }
                                    if (a13.get("journeyId") != null) {
                                        l11.put("journey_id", a13.get("journeyId"));
                                    }
                                    p0Var.c(l11);
                                    a(p0Var, cVar, false);
                                } else if ("notification_view".equals(d10) || "app_personalization_view".equals(d10)) {
                                    Map<String, Object> l12 = p0Var.l();
                                    String str8 = (String) l12.get("experiment_id");
                                    com.webengage.sdk.android.actions.rules.a aVar4 = new com.webengage.sdk.android.actions.rules.a(this.f30286c);
                                    WebEngageConstant.a aVar5 = "app_personalization_view".equals(d10) ? WebEngageConstant.a.INLINE_PERSONALIZATION : WebEngageConstant.a.NOTIFICATION;
                                    Map<String, Object> a14 = aVar4.a(str8, aVar5);
                                    if (str8 != null && str8.startsWith("T_")) {
                                        a14 = new HashMap<>();
                                        a14.put("journeyId", BuildConfig.FLAVOR);
                                    }
                                    String e12 = DataHolder.get().e(a14, aVar5);
                                    h0 h0Var = h0.SCOPES;
                                    DataHolder.get().a(h10, e12 + "_view", (Number) 1L, h0Var);
                                    c2 c2Var = c2.INCREMENT;
                                    DataHolder.get().a(str8 + "_view_session", (Number) 1L, c2Var);
                                    if ("app_personalization_view".equals(d10)) {
                                        str2 = "in_line_view_session";
                                        str3 = "in_line_last_view_time_update";
                                    } else {
                                        str2 = "in_app_view_session";
                                        str3 = "in_app_last_view_time_update";
                                    }
                                    if (((Boolean) (a14.get("fc") != null ? a14.get("fc") : Boolean.FALSE)).booleanValue()) {
                                        DataHolder.get().a(str2, (Number) 1L, c2Var);
                                        DataHolder.get().a(h10, str3, (Object) Long.valueOf(System.currentTimeMillis()), h0Var);
                                    }
                                    String str9 = str8 + "_view";
                                    if (!e12.equals(str8)) {
                                        DataHolder.get().a(h10, str9, (Number) 1L, h0Var);
                                    }
                                    a(p0Var);
                                    l12.put("total_view_count", DataHolder.get().c(str8));
                                    l12.put("total_view_count_session", DataHolder.get().d(str8));
                                    int indexOf2 = e12.indexOf(91);
                                    if (indexOf2 != -1) {
                                        l12.put("scope", e12.substring(indexOf2 + 1, e12.indexOf(93, indexOf2)));
                                    }
                                    if (a14.get("journeyId") != null) {
                                        l12.put("journey_id", a14.get("journeyId"));
                                    }
                                    p0Var.c(l12);
                                    a(p0Var, cVar, false);
                                } else if ("app_personalization_failed".equals(d10) || "app_personalization_received".equals(d10)) {
                                    Map<String, Object> l13 = p0Var.l();
                                    String str10 = (String) l13.get("experiment_id");
                                    com.webengage.sdk.android.actions.rules.a aVar6 = new com.webengage.sdk.android.actions.rules.a(this.f30286c);
                                    WebEngageConstant.a aVar7 = WebEngageConstant.a.INLINE_PERSONALIZATION;
                                    Map<String, Object> a15 = aVar6.a(str10, aVar7);
                                    String e13 = DataHolder.get().e(a15, aVar7);
                                    a(p0Var);
                                    int indexOf3 = e13.indexOf(91);
                                    if (indexOf3 != -1) {
                                        l13.put("scope", e13.substring(indexOf3 + 1, e13.indexOf(93, indexOf3)));
                                    }
                                    if (a15.get("journeyId") != null) {
                                        l13.put("journey_id", a15.get("journeyId"));
                                    }
                                    p0Var.c(l13);
                                    a(p0Var, cVar, false);
                                } else if ("notification_close".equals(d10)) {
                                    Map<String, Object> l14 = p0Var.l();
                                    String str11 = (String) l14.get("experiment_id");
                                    com.webengage.sdk.android.actions.rules.a aVar8 = new com.webengage.sdk.android.actions.rules.a(this.f30286c);
                                    WebEngageConstant.a aVar9 = WebEngageConstant.a.NOTIFICATION;
                                    Map<String, Object> a16 = aVar8.a(str11, aVar9);
                                    if (str11 != null && str11.startsWith("T_")) {
                                        a16 = new HashMap<>();
                                        a16.put("journeyId", BuildConfig.FLAVOR);
                                    }
                                    String e14 = DataHolder.get().e(a16, aVar9);
                                    DataHolder.get().a(e14 + "_close_session", (Number) 1L, c2.INCREMENT);
                                    DataHolder.get().a(h10, e14 + "_close", (Number) 1L, h0.SCOPES);
                                    a(p0Var);
                                    l14.put("total_view_count", DataHolder.get().c(str11));
                                    l14.put("total_view_count_session", DataHolder.get().d(str11));
                                    int indexOf4 = e14.indexOf(91);
                                    if (indexOf4 != -1) {
                                        l14.put("scope", e14.substring(indexOf4 + 1, e14.indexOf(93, indexOf4)));
                                    }
                                    if (a16.get("journeyId") != null) {
                                        l14.put("journey_id", a16.get("journeyId"));
                                    }
                                    p0Var.c(l14);
                                    a(p0Var, cVar, false);
                                } else if ("notification_control_group".equals(d10) || "app_personalization_control_group".equals(d10)) {
                                    Map<String, Object> l15 = p0Var.l();
                                    String str12 = (String) l15.get("experiment_id");
                                    com.webengage.sdk.android.actions.rules.a aVar10 = new com.webengage.sdk.android.actions.rules.a(this.f30286c);
                                    WebEngageConstant.a aVar11 = "app_personalization_control_group".equals(d10) ? WebEngageConstant.a.INLINE_PERSONALIZATION : WebEngageConstant.a.NOTIFICATION;
                                    Map<String, Object> a17 = aVar10.a(str12, aVar11);
                                    String e15 = DataHolder.get().e(a17, aVar11);
                                    DataHolder.get().a(e15 + "_hide_session", (Number) 1L, c2.FORCE_UPDATE);
                                    DataHolder.get().a(h10, e15 + "_hide", (Number) 1L, h0.SCOPES);
                                    a(p0Var);
                                    int indexOf5 = e15.indexOf(91);
                                    if (indexOf5 != -1) {
                                        l15.put("scope", e15.substring(indexOf5 + 1, e15.indexOf(93, indexOf5)));
                                    }
                                    if (a17.get("journeyId") != null) {
                                        l15.put("journey_id", (String) a17.get("journeyId"));
                                    }
                                    Map<String, String> map3 = e().get(str12);
                                    if (map3 != null && !TextUtils.isEmpty(map3.get("attribution_type"))) {
                                        l15.put("attribution_type", map3.get("attribution_type"));
                                    }
                                    p0Var.c(l15);
                                    a(p0Var, cVar, false);
                                    Map<String, Object> c10 = p0Var.c();
                                    if (c10 == null) {
                                        c10 = new HashMap<>();
                                    }
                                    if (map3 != null) {
                                        try {
                                            String str13 = map3.get("bucket_value");
                                            if (str13 == null) {
                                                str13 = "0";
                                            }
                                            c10.put("bucket_value", Double.valueOf(str13));
                                        } catch (Exception unused2) {
                                            c10.put("bucket_value", map3.get("bucket_value"));
                                        }
                                        if (TextUtils.isEmpty(map3.get("cg_id"))) {
                                            str4 = "control_group";
                                            obj2 = a17.get("controlGroup");
                                        } else {
                                            obj2 = map3.get("cg_id");
                                            str4 = "cg_id";
                                        }
                                        c10.put(str4, obj2);
                                    }
                                    p0Var.a(c10);
                                } else {
                                    if ("inbox_notification_click".equals(d10) || "inbox_notification_unread".equals(d10) || "inbox_notification_read".equals(d10) || "inbox_notification_view".equals(d10) || "inbox_notification_delete".equals(d10) || "inbox_notification_reset_count".equals(d10)) {
                                        aVar = WebEngageConstant.a.NOTIFICATION_INBOX;
                                    } else {
                                        if (!"push_notification_received".equals(d10)) {
                                            if ("push_notification_close".equals(d10)) {
                                                Map<String, Object> l16 = p0Var.l();
                                                this.f30287d = l16;
                                                String str14 = (String) l16.get("id");
                                                Map<String, Object> f10 = p0Var.f();
                                                if (f10 != null) {
                                                    String str15 = (String) f10.get("collapseKey");
                                                    if (!TextUtils.isEmpty(str15)) {
                                                        f(str15);
                                                    }
                                                }
                                                a(p0Var, WebEngageConstant.a.PUSH);
                                                a(p0Var);
                                                a(p0Var, cVar, false);
                                                c(p0Var);
                                                l(str14);
                                                f(str14);
                                            } else if (!"push_notification_view".equals(d10) && !"push_notification_failed".equals(d10)) {
                                                boolean z10 = true;
                                                if ("push_notification_click".equals(d10) || "push_notification_rating_submitted".equals(d10)) {
                                                    Map<String, Object> l17 = p0Var.l();
                                                    this.f30287d = l17;
                                                    String str16 = (String) l17.get("id");
                                                    Map<String, Object> f11 = p0Var.f();
                                                    if (f11 != null) {
                                                        str6 = (String) f11.get("collapseKey");
                                                        z10 = ((Boolean) f11.get("dismiss_flag")).booleanValue();
                                                    }
                                                    a(p0Var, WebEngageConstant.a.PUSH);
                                                    a(p0Var);
                                                    a(p0Var, cVar, false);
                                                    c(p0Var);
                                                    if (z10) {
                                                        l(str16);
                                                        f(str16);
                                                        if (str6 != null && !str6.isEmpty()) {
                                                            f(str6);
                                                        }
                                                    }
                                                } else if (!"push_notification_item_view".equals(d10)) {
                                                    if ("we_wk_activity_start".equals(d10)) {
                                                        Map<String, Object> l18 = p0Var.l();
                                                        Map<String, Object> G10 = DataHolder.get().G();
                                                        if (G10 == null) {
                                                            G10 = new HashMap<>();
                                                        }
                                                        if (l18 != null) {
                                                            G10.putAll(l18);
                                                        }
                                                        DataHolder.get().b(G10);
                                                    } else if ("we_wk_screen_navigated".equals(d10)) {
                                                        DataHolder.get().a();
                                                        Map<String, Object> l19 = p0Var.l();
                                                        Map<String, Object> G11 = DataHolder.get().G();
                                                        if (G11 == null) {
                                                            G11 = new HashMap<>();
                                                        }
                                                        if (l19 != null) {
                                                            G11.putAll(l19);
                                                        }
                                                        DataHolder.get().b(G11);
                                                        DataHolder.get().a("page_view_count_session", (Number) 1L, c2.INCREMENT);
                                                        DataHolder.get().a(h10, "total_page_view_count", (Number) 1L, h0.ANDROID);
                                                        DataHolder.get().a(p0Var.c());
                                                    } else if ("visitor_new_session".equals(d10)) {
                                                        String d14 = d();
                                                        e b10 = e.b(this.f30286c);
                                                        if (d14.isEmpty()) {
                                                            d14 = h();
                                                        }
                                                        Map<String, Object> a18 = b10.a(d14);
                                                        if (a18 != null && a18.size() > 0) {
                                                            DataHolder.get().c(a18);
                                                        }
                                                        DataHolder.get().g(h10, p0Var.l());
                                                        if ("online".equals(DataHolder.get().q())) {
                                                            HashMap hashMap4 = new HashMap();
                                                            hashMap4.put("session_count", 1L);
                                                            DataHolder.get().b(h10, (Map<String, Object>) hashMap4);
                                                            Long j10 = DataHolder.get().j();
                                                            if (j10 != null && j10.longValue() == 1) {
                                                                DataHolder.get().a(h10, "first_session_start_time", new Date(), h0.ANDROID);
                                                                DataHolder dataHolder = DataHolder.get();
                                                                String g4Var = g4.f30580A.toString();
                                                                Date date = new Date();
                                                                h0 h0Var2 = h0.USER;
                                                                dataHolder.a(h10, g4Var, date, h0Var2);
                                                                DataHolder.get().a(h10, g4.f30581B.toString(), "direct", h0Var2);
                                                            }
                                                        } else {
                                                            DataHolder.get().a(h10, "b_session_count", (Number) 1L, h0.ANDROID);
                                                        }
                                                        if (WebEngage.get().getWebEngageConfig().isLocationTrackingEnabled() && (a10 = s1.a(this.f30286c).a()) != null) {
                                                            HashMap hashMap5 = new HashMap();
                                                            hashMap5.put(AppConstants.LATITUDE, Double.valueOf(a10.getLatitude()));
                                                            hashMap5.put(AppConstants.LONGITUDE, Double.valueOf(a10.getLongitude()));
                                                            Map<String, Object> a19 = cVar.a(Double.valueOf(a10.getLatitude()), Double.valueOf(a10.getLongitude()));
                                                            if (a19 != null) {
                                                                hashMap5.putAll(a19);
                                                            }
                                                            DataHolder.get().h(h10, hashMap5);
                                                        }
                                                        DataHolder.get().g(h10, cVar.b());
                                                        a(p0Var, cVar, true);
                                                    } else {
                                                        if (!"visitor_session_close".equals(d10)) {
                                                            if ("app_installed".equals(d10)) {
                                                                DataHolder.get().h(h10, p0Var.l());
                                                            } else if ("app_upgraded".equals(d10) || "app_crashed".equals(d10)) {
                                                                DataHolder.get().g(h10, cVar.b());
                                                            } else if (!"gcm_registered".equals(d10) && !"push_ping".equals(d10)) {
                                                                if (!"we_wk_session_delay".equals(d10)) {
                                                                    if (!"we_wk_page_delay".equals(d10)) {
                                                                        if (!"we_wk_leave_intent".equals(d10)) {
                                                                            if (!"geofence_transition".equals(d10)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            a(p0Var);
                                                            a(p0Var, cVar, false);
                                                        } else if ("online".equals(DataHolder.get().q())) {
                                                            HashMap hashMap6 = new HashMap();
                                                            hashMap6.put("last_seen", new Date());
                                                            DataHolder.get().h(h10, hashMap6);
                                                        }
                                                        a(p0Var, cVar, false);
                                                    }
                                                }
                                            }
                                        }
                                        aVar = WebEngageConstant.a.PUSH;
                                    }
                                    a(p0Var, aVar);
                                    a(p0Var);
                                    a(p0Var, cVar, false);
                                }
                                c(p0Var);
                            } catch (Exception e16) {
                                b(e16);
                            }
                        }
                        a(p0Var);
                        c(p0Var);
                    }
                    return null;
                }
                a(p0Var, cVar, false);
                c(p0Var);
                return null;
            }
            if ("change_data".equals(str5) && (hashMap = (HashMap) map2.get("action_data")) != null && (arrayList = (ArrayList) hashMap.get("path")) != null) {
                DataHolder.get().a(arrayList, hashMap.get("data"));
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public Object e(Map<String, Object> map) {
        return map;
    }

    private void a(p0 p0Var, c cVar, boolean z10) {
        Map<String, Object> l10 = p0Var.l();
        if (l10 == null) {
            l10 = new HashMap<>();
        }
        p0Var.c(cVar.a(l10, z10));
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public void e(Object obj) {
    }

    private void a(p0 p0Var, WebEngageConstant.a aVar) {
        Map<String, Object> l10;
        String str;
        if (aVar == null || a.f30289b[aVar.ordinal()] != 1 || (l10 = p0Var.l()) == null || (str = (String) l10.get("id")) == null) {
            return;
        }
        try {
            PushNotificationData pushNotificationData = new PushNotificationData(new JSONObject(d(str)), this.f30286c);
            if (pushNotificationData.getCustomData() != null) {
                HashMap hashMap = new HashMap();
                Map<String, Object> c10 = p0Var.c();
                if (c10 != null) {
                    hashMap.putAll(c10);
                }
                hashMap.putAll(WebEngageUtils.a(pushNotificationData.getCustomData()));
                p0Var.a(hashMap);
            }
        } catch (Exception unused) {
        }
    }

    private boolean a(p0 p0Var, List<Object> list) {
        String str;
        if (p0Var != null && list != null && list.size() > 2 && Keys.EVENT.equals(list.get(0).toString()) && p0Var.d().equals(list.get(2)) && (str = (String) list.get(1)) != null) {
            if ("custom".equals(str)) {
                return "application".equals(p0Var.b());
            }
            if ("system".equals(str)) {
                return "system".equals(p0Var.b());
            }
        }
        return false;
    }
}
