package com.webengage.sdk.android.actions.database;

import android.content.Context;
import android.text.TextUtils;
import com.webengage.sdk.android.AbstractC2951a;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.c2;
import com.webengage.sdk.android.g4;
import com.webengage.sdk.android.h0;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class f extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    Context f30293c;

    /* renamed from: d, reason: collision with root package name */
    String f30294d;

    /* renamed from: e, reason: collision with root package name */
    com.webengage.sdk.android.actions.rules.a f30295e;

    /* renamed from: f, reason: collision with root package name */
    Set<String> f30296f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30297a;

        static {
            int[] iArr = new int[h0.values().length];
            f30297a = iArr;
            try {
                iArr[h0.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30297a[h0.EVENT_CRITERIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30297a[h0.ATTR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30297a[h0.ANDROID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30297a[h0.IOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30297a[h0.WEB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    f(Context context) {
        super(context);
        this.f30293c = null;
        this.f30294d = null;
        this.f30295e = null;
        this.f30296f = new HashSet();
        this.f30293c = context;
    }

    private String a(Set<String> set, String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            if (!TextUtils.isEmpty(str3)) {
                hashMap2.put("cuid", str3);
            }
            hashMap2.put("luid", str2);
            hashMap2.put("licenseCode", str);
            if (set.contains("jcx")) {
                hashMap2.put("jids", map);
            }
            if (set.contains("static_list")) {
                Map<String, Object> f10 = f(map2);
                if (!f10.isEmpty()) {
                    hashMap2.put("sids", f10);
                }
            }
            hashMap2.put("upf", Boolean.valueOf(set.contains("fetch_profile")));
            if (!hashMap2.containsKey("sids") && !hashMap2.containsKey("jids") && !((Boolean) hashMap2.get("upf")).booleanValue()) {
                return null;
            }
            hashMap.put("upfc", hashMap2);
            return DataType.convert(hashMap, DataType.STRING, true).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private Map<String, Object> f(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        Map<String, Object> a10 = a(map, DataHolder.get().F());
        if (!a10.isEmpty()) {
            hashMap.put("ids", a10);
            Object h10 = DataHolder.get().h("ts");
            hashMap.put("ts", h10 != null ? (Long) h10 : JSONObject.NULL);
        }
        return hashMap;
    }

    private void g(Map<String, Object> map) {
        try {
            if (!map.containsKey("journey") || map.get("journey") == null) {
                return;
            }
            DataHolder.get().b(h0.JOURNEY.toString(), map.get("journey"));
        } catch (Exception unused) {
        }
    }

    private void h(Map<String, Object> map) {
        Map map2;
        try {
            if (!map.containsKey("static_list") || map.get("static_list") == null || (map2 = (Map) map.get("static_list")) == null) {
                return;
            }
            if (map2.containsKey("ts") && map2.get("ts") != null) {
                Long l10 = (Long) map2.get("ts");
                l10.longValue();
                DataHolder.get().a(this.f30294d, "ts", l10);
            }
            if (!map2.containsKey("ids") || map2.get("ids") == null) {
                return;
            }
            DataHolder.get().e(this.f30294d, (Map<String, Object>) map2.get("ids"));
        } catch (Exception unused) {
        }
    }

    private void i(Map<String, Object> map) {
        Map map2;
        if (!map.containsKey("user_profile") || (map2 = (Map) map.get("user_profile")) == null) {
            return;
        }
        Map<String, Object> map3 = (Map) map2.get("upf");
        int i10 = 0;
        if (!d().isEmpty()) {
            if (map3 == null || !d().equals(map3.get("cuid"))) {
                return;
            }
            h0[] values = h0.values();
            int length = values.length;
            while (i10 < length) {
                h0 h0Var = values[i10];
                if (h0Var.d()) {
                    a(h0Var, map3);
                }
                i10++;
            }
            return;
        }
        h0[] values2 = h0.values();
        int length2 = values2.length;
        while (i10 < length2) {
            h0 h0Var2 = values2[i10];
            if (h0Var2.c()) {
                a(h0Var2, map3);
            }
            i10++;
        }
        a(g4.f30608s, map3);
        a(g4.f30609t, map3);
        a(g4.f30610u, map3);
        a(g4.f30612w, map3);
        a(g4.f30611v, map3);
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        Map<String, Object> map = null;
        if (obj != null) {
            String eVar = WebEngageConstant.e.USER_PROFILE_2_BASE.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/transit+json");
            RequestObject build = new RequestObject.Builder(eVar, RequestMethod.POST, this.f30293c).setHeaders(hashMap).setCachePolicy(3).setParams(obj).build();
            new HashMap();
            try {
                InputStream inputStream = (InputStream) WENetworkUtil.makeRequest(this.f30293c, build, true, true).get("data");
                if (inputStream != null) {
                    this.f30294d = d().isEmpty() ? h() : d();
                    try {
                        map = com.webengage.sdk.android.utils.b.a(inputStream, true);
                    } catch (Exception e10) {
                        b(e10);
                    }
                    if (map != null) {
                        g(map);
                        h(map);
                        i(map);
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return inputStream;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        List<Object> f10;
        Map<String, Object> hashMap = new HashMap<>();
        Map<String, Object> hashMap2 = new HashMap<>();
        try {
            this.f30295e = new com.webengage.sdk.android.actions.rules.a(this.f30293c);
            HashSet hashSet = (HashSet) map.get("data");
            this.f30296f = hashSet;
            if (hashSet.contains("fetch_profile") && (((f10 = this.f30295e.f()) == null || f10.isEmpty()) && d().isEmpty())) {
                this.f30296f.remove("fetch_profile");
            }
            if (DataHolder.get().M()) {
                if (this.f30296f.contains("jcx") && ((hashMap2 = DataHolder.get().p()) == null || hashMap2.isEmpty())) {
                    this.f30296f.remove("jcx");
                }
                if (this.f30296f.contains("static_list") && ((hashMap = DataHolder.get().y()) == null || hashMap.isEmpty())) {
                    this.f30296f.remove("static_list");
                }
            }
            Map<String, Object> map2 = hashMap;
            Map<String, Object> map3 = hashMap2;
            if (!this.f30296f.isEmpty()) {
                return a(this.f30296f, WebEngage.get().getWebEngageConfig().getWebEngageKey(), h(), d(), map3, map2);
            }
            Logger.d("WebEngage", "Cancelling UPF request as no data is required");
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private Map<String, Object> a(Map<String, Object> map, Map<String, Object> map2) {
        String str;
        Object obj;
        HashMap hashMap = new HashMap();
        try {
            List list = (List) map.get("ids");
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (map2.containsKey(list.get(i10))) {
                        str = (String) list.get(i10);
                        Boolean bool = (Boolean) map2.get(list.get(i10));
                        bool.booleanValue();
                        obj = bool;
                    } else {
                        str = (String) list.get(i10);
                        obj = JSONObject.NULL;
                    }
                    hashMap.put(str, obj);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
    }

    private void a(g4 g4Var, Map<String, Object> map) {
        String g4Var2;
        Object obj;
        if (map == null || g4Var == null || (obj = map.get((g4Var2 = g4Var.toString()))) == null) {
            return;
        }
        DataHolder.get().a(this.f30294d, g4Var2, obj, h0.USER, c2.FORCE_UPDATE);
    }

    private void a(h0 h0Var, Map<String, Object> map) {
        int i10 = a.f30297a[h0Var.ordinal()];
        if (i10 == 1) {
            for (String str : map.keySet()) {
                g4 a10 = g4.a(str);
                if (!"event_criterias".equals(str) && !"devices".equals(str) && !"user_attributes".equals(str) && !"journey".equals(str) && !"static_list".equals(str)) {
                    try {
                        if (str.equals(g4.f30594e.toString())) {
                            DataHolder.get().a(this.f30294d, g4.f30593d.toString(), null, h0Var, c2.FORCE_UPDATE);
                        }
                        if (str.equals(g4.f30598i.toString())) {
                            DataHolder.get().a(this.f30294d, g4.f30597h.toString(), null, h0Var, c2.FORCE_UPDATE);
                        }
                        DataHolder.get().a(this.f30294d, str, map.get(str), h0Var, a10 == null ? c2.FORCE_UPDATE : a10.a());
                    } catch (Exception unused) {
                    }
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                try {
                    DataHolder.get().f(this.f30294d, (Map) map.get("user_attributes"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
            } else {
                if (i10 == 5 || i10 == 6) {
                    a(map, h0Var);
                    return;
                }
                return;
            }
        }
        Set<String> e10 = this.f30295e.e();
        List list = (List) map.get("event_criterias");
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                Map<String, Object> map2 = (Map) list.get(i11);
                if (map2 != null) {
                    try {
                        String str2 = (String) map2.get("criteria_id");
                        if (e10 != null && e10.contains(str2)) {
                            DataHolder.get().a(this.f30294d, str2, map2);
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    private void a(Map<String, Object> map, h0 h0Var) {
        List list;
        Map map2;
        Map map3 = (Map) map.get("devices");
        if (map3 == null || (list = (List) map3.get(h0Var.b())) == null || list.size() <= 0 || (map2 = (Map) list.get(0)) == null) {
            return;
        }
        for (String str : map2.keySet()) {
            try {
                DataHolder.get().a(this.f30294d, str, map2.get(str), h0Var);
            } catch (Exception unused) {
            }
        }
    }
}
