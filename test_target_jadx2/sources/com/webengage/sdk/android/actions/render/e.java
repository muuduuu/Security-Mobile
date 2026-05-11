package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.webengage.sdk.android.AbstractC2951a;
import com.webengage.sdk.android.C2958f;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.l1;
import com.webengage.sdk.android.n0;
import com.webengage.sdk.android.u2;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import com.webengage.sdk.android.y3;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class e extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30329c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30330d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30331e;

    /* renamed from: f, reason: collision with root package name */
    private String f30332f;

    /* renamed from: g, reason: collision with root package name */
    private String f30333g;

    /* renamed from: h, reason: collision with root package name */
    private String f30334h;

    /* renamed from: i, reason: collision with root package name */
    private InAppNotificationData f30335i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30336j;

    /* renamed from: k, reason: collision with root package name */
    private List<Object> f30337k;

    e(Context context) {
        super(context);
        this.f30329c = null;
        this.f30330d = false;
        this.f30331e = false;
        this.f30332f = null;
        this.f30333g = null;
        this.f30334h = null;
        this.f30335i = null;
        this.f30336j = false;
        this.f30337k = null;
        this.f30329c = context.getApplicationContext();
    }

    private void a(List<Object> list, String str) {
        Object a10;
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            List<Object> list2 = (List) it.next();
            if (list2 != null && list2.size() > 0 && (a10 = u2.b().getFunction("$we_getResolvedData").a(list2)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                arrayList.addAll(list2);
                DataHolder.get().a(arrayList, a10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    private String l(String str) {
        String str2;
        String str3;
        ?? r42;
        List<Object> list;
        Map<String, List<Object>> I10 = DataHolder.get().I();
        if (I10 != null && (list = I10.get(str)) != null) {
            a(list, str);
        }
        if (this.f30336j) {
            a(this.f30337k, str);
        }
        Object obj = (Map) DataHolder.get().a(str);
        if (obj == null) {
            obj = new HashMap();
        }
        String str4 = null;
        String str5 = null;
        str4 = null;
        try {
            str2 = (String) DataType.convert(obj, DataType.STRING, true);
        } catch (Exception unused) {
            str2 = null;
        }
        DataHolder.get().a(str, (Object) null);
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Content-Encoding", "gzip");
        new HashMap();
        try {
            Map<String, Object> makeRequest = WENetworkUtil.makeRequest(this.f30329c, new RequestObject.Builder(WebEngageConstant.e.a(WebEngage.get().getWebEngageConfig().getWebEngageKey(), h(), str, d(), "NOTIFICATION-"), RequestMethod.POST, this.f30329c).setCachePolicy(3).setParams(str2).setHeaders(hashMap).build(), true, true);
            if (!makeRequest.containsKey("data") || makeRequest.get("data") == null) {
                Logger.d("WebEngage", "No data found for variation: " + str);
            } else {
                InputStream inputStream = (InputStream) makeRequest.get("data");
                try {
                    str5 = com.webengage.sdk.android.utils.b.a(inputStream);
                    inputStream.close();
                    str4 = str5;
                } catch (Exception e10) {
                    e = e10;
                    String str6 = str5;
                    r42 = inputStream;
                    str3 = str6;
                    if (r42 != 0) {
                        try {
                            r42.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    Logger.e("WebEngage", "Error while fetching data for variation " + str + "\n" + e);
                    e.printStackTrace();
                    return str3;
                }
            }
            return str4;
        } catch (Exception e12) {
            e = e12;
            str3 = str4;
            r42 = str4;
        }
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        if (this.f30330d) {
            try {
                WeakReference<Activity> activity = C2958f.a(this.f30329c).getActivity();
                if (activity != null && activity.get() != null) {
                    String l10 = l(this.f30333g);
                    if (l10 == null) {
                        this.f30330d = false;
                        return null;
                    }
                    InAppNotificationData inAppNotificationData = new InAppNotificationData(this.f30332f, this.f30333g, this.f30334h, l10, this.f30336j);
                    this.f30335i = inAppNotificationData;
                    JSONObject optJSONObject = inAppNotificationData.getData().optJSONObject("layoutAttributes");
                    boolean optBoolean = optJSONObject.optBoolean("allowLandscape", false);
                    boolean optBoolean2 = optJSONObject.optBoolean("allowPortrait", false);
                    int i10 = activity.get().getResources().getConfiguration().orientation;
                    if (optJSONObject.isNull("allowPortrait")) {
                        if (!optBoolean && i10 == 2) {
                            this.f30330d = false;
                            return null;
                        }
                    } else if ((!optBoolean || !optBoolean2) && ((optBoolean2 && i10 == 2) || (optBoolean && i10 == 1))) {
                        this.f30330d = false;
                        return null;
                    }
                    if (activity.get() != null && !activity.get().isFinishing()) {
                        InAppNotificationData onInAppNotificationPrepared = a(this.f30329c).onInAppNotificationPrepared(this.f30329c, this.f30335i);
                        if (onInAppNotificationPrepared != null) {
                            this.f30335i = onInAppNotificationPrepared;
                        }
                        InAppNotificationData inAppNotificationData2 = this.f30335i;
                        if (inAppNotificationData2 != null && inAppNotificationData2.shouldRender() && activity.get() != null && !activity.get().isFinishing()) {
                            FragmentManager fragmentManager = activity.get().getFragmentManager();
                            n nVar = new n();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("fullscreen", (activity.get().getWindow().getAttributes().flags & 1024) != 0);
                            bundle.putParcelable("notificationData", this.f30335i);
                            bundle.putString("baseUrl", DataHolder.get().d());
                            nVar.setArguments(bundle);
                            nVar.setRetainInstance(true);
                            fragmentManager.beginTransaction().add(nVar, "WebEngage").commitAllowingStateLoss();
                        }
                    }
                    this.f30330d = false;
                }
            } catch (Exception e10) {
                b(e10);
                this.f30330d = false;
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        boolean z10 = map.get("action_data") instanceof HashMap;
        Object obj = map.get("action_data");
        if (z10) {
            HashMap hashMap = (HashMap) obj;
            this.f30332f = (String) hashMap.get("notificationEncId");
            this.f30333g = (String) hashMap.get("id");
            this.f30334h = (String) hashMap.get("layout");
            if (hashMap.containsKey("tokens")) {
                this.f30337k = (List) hashMap.get("tokens");
            }
            this.f30330d = true;
            if (!TextUtils.isEmpty(this.f30332f) && this.f30332f.startsWith("T_")) {
                this.f30336j = true;
            }
        } else {
            this.f30332f = (String) obj;
            Map<String, String> map2 = p().get(this.f30332f);
            if (map2 != null) {
                String next = map2.keySet().iterator().next();
                this.f30333g = next;
                this.f30334h = map2.get(next);
                this.f30330d = true;
            } else {
                try {
                    Logger.d("WebEngage", "In-app (" + this.f30332f + ") has fallen in control group");
                    this.f30330d = false;
                    this.f30331e = true;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("experiment_id", this.f30332f);
                    WebEngage.startService(l1.a(y3.f31158c, n0.b("notification_control_group", hashMap2, null, null, this.f30329c), this.f30329c), this.f30329c);
                } catch (Exception unused) {
                }
            }
        }
        return Boolean.valueOf(this.f30330d);
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
        if (this.f30330d || this.f30331e) {
            return;
        }
        DataHolder.get().c(false);
    }
}
