package com.webengage.sdk.android.actions.rules;

import android.content.Context;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.rules.b;
import com.webengage.sdk.android.k4;
import com.webengage.sdk.android.o4;
import com.webengage.sdk.android.s0;
import com.webengage.sdk.android.t2;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f30444a;

    /* renamed from: b, reason: collision with root package name */
    private Context f30445b;

    /* renamed from: c, reason: collision with root package name */
    private long f30446c = -1;

    /* renamed from: com.webengage.sdk.android.actions.rules.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0443a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30447a;

        static {
            int[] iArr = new int[WebEngageConstant.a.values().length];
            f30447a = iArr;
            try {
                iArr[WebEngageConstant.a.INLINE_PERSONALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30447a[WebEngageConstant.a.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30447a[WebEngageConstant.a.SURVEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(Context context) {
        Exception e10;
        InputStream inputStream;
        this.f30445b = context.getApplicationContext();
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/transit+json");
        RequestObject build = new RequestObject.Builder(WebEngageConstant.e.a(WebEngage.get().getWebEngageConfig().getWebEngageKey()), RequestMethod.GET, context.getApplicationContext()).setHeaders(hashMap).setCachePolicy(4).build();
        new HashMap();
        try {
            inputStream = (InputStream) WENetworkUtil.makeRequest(this.f30445b, build, true, true).get("data");
            if (inputStream != null) {
                try {
                    this.f30444a = com.webengage.sdk.android.utils.b.a(inputStream, false);
                    inputStream.close();
                } catch (Exception e11) {
                    e10 = e11;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    Logger.e("WebEngage", "Error while fetching config");
                    e10.printStackTrace();
                }
            }
        } catch (Exception e13) {
            e10 = e13;
            inputStream = null;
        }
    }

    private t2 a(Map<String, Object> map) {
        Map map2 = (Map) map.get("rules");
        if (map2 == null) {
            return new t2("true", "true", "true");
        }
        String str = (String) map2.get(WebEngageConstant.d.SESSION_RULE.toString());
        String str2 = (String) map2.get(WebEngageConstant.d.PAGE_RULE.toString());
        String str3 = (String) map2.get(WebEngageConstant.d.EVENT_RULE.toString());
        if (str == null) {
            str = "true";
        }
        if (str2 == null) {
            str2 = "true";
        }
        return new t2(str, str2, str3 != null ? str3 : "true");
    }

    private Set<String> c() {
        return new HashSet();
    }

    private Map<String, List<b>> g() {
        HashMap hashMap = new HashMap();
        List<Object> f10 = f();
        if (f10 != null) {
            for (int i10 = 0; i10 < f10.size(); i10++) {
                Map map = (Map) f10.get(i10);
                if (map != null && map.get("function") != null) {
                    b a10 = new b.C0444b().d((String) map.get("criteria_id")).c(map.get("function").toString()).a((String) map.get("attribute")).b((String) map.get("attributeCategory")).a(new s0((String) map.get("rule"))).a();
                    String str = (String) map.get("eventName");
                    if (hashMap.get(str) == null) {
                        hashMap.put(str, new ArrayList());
                    }
                    ((List) hashMap.get(str)).add(a10);
                }
            }
        }
        return hashMap;
    }

    public Set<String> b() {
        Set<String> h10 = h();
        h10.addAll(a());
        h10.addAll(c());
        h10.add(WebEngageConstant.e.a(WebEngage.get().getWebEngageConfig().getWebEngageKey()));
        return h10;
    }

    public String d() {
        return (String) this.f30444a.get("gbp");
    }

    public Set<String> e() {
        HashSet hashSet = new HashSet();
        List<Object> f10 = f();
        if (f10 != null) {
            for (int i10 = 0; i10 < f10.size(); i10++) {
                Map map = (Map) f10.get(i10);
                if (map != null) {
                    hashSet.add((String) map.get("criteria_id"));
                }
            }
        }
        return hashSet;
    }

    public List<Object> f() {
        return (List) this.f30444a.get("ecl");
    }

    public Set<String> h() {
        List list;
        HashSet hashSet = new HashSet();
        String d10 = d();
        if (d10 != null && (list = (List) this.f30444a.get("grs")) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(d10 + ((String) it.next()));
            }
        }
        return hashSet;
    }

    public List<String> i() {
        Map map;
        ArrayList arrayList = new ArrayList();
        Map<String, Object> k10 = k();
        if (k10 != null && k10.containsKey("sids") && k10.get("sids") != null && (map = (Map) k10.get("sids")) != null && map.containsKey("ids") && map.get("ids") != null) {
            arrayList.addAll((List) map.get("ids"));
        }
        return arrayList;
    }

    public long j() {
        return this.f30446c;
    }

    public Map<String, Object> k() {
        return (Map) this.f30444a.get("upfc");
    }

    public boolean l() {
        if (this.f30444a.containsKey("applyUCGToExistingCampaigns")) {
            return ((Boolean) this.f30444a.get("applyUCGToExistingCampaigns")).booleanValue();
        }
        return false;
    }

    public a(Map<String, Object> map) {
        this.f30444a = map;
    }

    public String a(String str) {
        return WebEngageConstant.e.a(d(), str);
    }

    public Set<String> b(String str, Map<String, Object> map) {
        HashSet hashSet = new HashSet();
        hashSet.add(a((String) map.get("layout")));
        hashSet.addAll(b(map));
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> a(String str, WebEngageConstant.a aVar) {
        WebEngageConstant.b bVar;
        WebEngageConstant.b bVar2;
        List list;
        int i10;
        String str2;
        int i11 = C0443a.f30447a[aVar.ordinal()];
        if (i11 == 1) {
            bVar = WebEngageConstant.f30863b.get(0);
        } else if (i11 == 2) {
            bVar = WebEngageConstant.f30863b.get(1);
        } else {
            if (i11 != 3) {
                bVar2 = null;
                list = (List) this.f30444a.get(bVar2.f30872a);
                if (list != null && str != null && !str.isEmpty()) {
                    for (i10 = 0; i10 < list.size(); i10++) {
                        List list2 = (List) list.get(i10);
                        if (list2 != null) {
                            for (int i12 = 0; i12 < list2.size(); i12++) {
                                Map<String, Object> map = (Map) list2.get(i12);
                                if (map != null && (str2 = (String) map.get(bVar2.f30873b)) != null && str2.equals(str)) {
                                    return map;
                                }
                            }
                        }
                    }
                }
                return null;
            }
            bVar = WebEngageConstant.f30863b.get(2);
        }
        bVar2 = bVar;
        list = (List) this.f30444a.get(bVar2.f30872a);
        if (list != null) {
            while (i10 < list.size()) {
            }
        }
        return null;
    }

    public Set<String> b(Map<String, Object> map) {
        HashSet hashSet = new HashSet();
        try {
            ArrayList arrayList = (ArrayList) map.get("resources");
            if (arrayList != null) {
                hashSet.addAll(arrayList);
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    public Map<String, Object> a(String str, Map<String, Object> map) {
        List list = (List) map.get("variations");
        if (str == null || list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            Map<String, Object> map2 = (Map) list.get(i10);
            if (map2 != null && str.equals((String) map2.get("id"))) {
                return map2;
            }
        }
        return null;
    }

    private Set<String> a() {
        HashSet hashSet = new HashSet();
        List list = (List) this.f30444a.get(WebEngageConstant.f30863b.get(1).f30872a);
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                List list2 = (List) list.get(i10);
                if (list2 != null) {
                    for (int i11 = 0; i11 < list2.size(); i11++) {
                        Map<String, Object> map = (Map) list2.get(i11);
                        if (map != null) {
                            hashSet.addAll(a(map, WebEngageConstant.a.NOTIFICATION));
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public Set<String> a(RuleExecutor ruleExecutor, DataHolder dataHolder) {
        String str;
        List list;
        List list2;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("tzo", this.f30444a.get("tzo"));
        hashMap.put("events", this.f30444a.get("events"));
        hashMap.put("gbp", d());
        hashMap.put("geoFences", this.f30444a.get("geoFences"));
        hashMap.put("upfc", this.f30444a.get("upfc"));
        if (this.f30444a.get("fc") != null) {
            o4.b().a((HashMap) this.f30444a.get("fc"));
        }
        if (this.f30444a.get("cgDetails") != null) {
            HashMap hashMap2 = (HashMap) this.f30444a.get("cgDetails");
            k4 b10 = k4.b();
            if (hashMap2.get("UNIVERSAL") != null) {
                b10.b((HashMap<String, Object>) hashMap2.get("UNIVERSAL"));
            }
            if (hashMap2.get("CUSTOM") != null) {
                b10.a((HashMap<String, Object>) hashMap2.get("CUSTOM"));
            }
        }
        Object obj = this.f30444a.get("useLegacyRuleCompiler");
        DataHolder.get().e(obj != null ? Boolean.parseBoolean(obj.toString()) : false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap3 = new HashMap();
        HashSet hashSet = new HashSet();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        Iterator<WebEngageConstant.b> it = WebEngageConstant.f30863b.iterator();
        while (it.hasNext()) {
            WebEngageConstant.b next = it.next();
            String str3 = next.f30872a;
            String str4 = next.f30873b;
            List list3 = (List) this.f30444a.get(str3);
            if (list3 != null) {
                int i10 = 0;
                while (i10 < list3.size()) {
                    List list4 = (List) list3.get(i10);
                    Iterator<WebEngageConstant.b> it2 = it;
                    if (list4 != null) {
                        list = list3;
                        int i11 = 0;
                        while (i11 < list4.size()) {
                            Map<String, Object> map = (Map) list4.get(i11);
                            if (map != null) {
                                list2 = list4;
                                String str5 = (String) map.get(str4);
                                str2 = str4;
                                if (str5 != null) {
                                    if ("personalizationRuleList".equals(str3)) {
                                        hashMap4.put(str5, map);
                                    } else if ("notificationRuleList".equals(str3)) {
                                        hashMap5.put(str5, map);
                                    }
                                    hashSet.add(str5);
                                    linkedHashMap.put(str5, a(map));
                                    List list5 = (List) map.get("variations");
                                    if (list5 != null) {
                                        int i12 = 0;
                                        while (i12 < list5.size()) {
                                            Map map2 = (Map) list5.get(i12);
                                            List list6 = list5;
                                            if (map2 != null) {
                                                String str6 = (String) map2.get("id");
                                                List list7 = (List) map2.get("tokens");
                                                if (list7 != null && str6 != null) {
                                                    hashMap3.put(str6, list7);
                                                }
                                            }
                                            i12++;
                                            list5 = list6;
                                        }
                                    }
                                }
                            } else {
                                list2 = list4;
                                str2 = str4;
                            }
                            i11++;
                            str4 = str2;
                            list4 = list2;
                        }
                        str = str4;
                    } else {
                        str = str4;
                        list = list3;
                    }
                    i10++;
                    it = it2;
                    list3 = list;
                    str4 = str;
                }
            }
        }
        ruleExecutor.setRuleMap(linkedHashMap);
        ruleExecutor.setEventCriteriaMap(g());
        hashMap.put("tokens", hashMap3);
        dataHolder.b(HVRetakeActivity.CONFIG_TAG, (Object) hashMap);
        this.f30446c = this.f30444a.get("sdt") != null ? ((Long) this.f30444a.get("sdt")).longValue() : -1L;
        dataHolder.a("inline_campaigns", (Object) hashMap4);
        dataHolder.a("in_app_campaigns", (Object) hashMap5);
        dataHolder.a("inline_properties", this.f30444a.get("properties"));
        dataHolder.a("p_campaign_limit", this.f30444a.get("pCampaignLimit"));
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[LOOP:0: B:10:0x0042->B:16:0x0057, LOOP_START, PHI: r0
  0x0042: PHI (r0v2 int) = (r0v1 int), (r0v3 int) binds: [B:9:0x0040, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set<String> a(Map<String, Object> map, WebEngageConstant.a aVar) {
        WebEngageConstant.b bVar;
        String str;
        List list;
        int i10 = C0443a.f30447a[aVar.ordinal()];
        if (i10 == 1) {
            bVar = WebEngageConstant.f30863b.get(0);
        } else if (i10 == 2) {
            bVar = WebEngageConstant.f30863b.get(1);
        } else {
            if (i10 != 3) {
                str = null;
                String str2 = (String) map.get(str);
                list = (List) map.get("variations");
                HashSet hashSet = new HashSet();
                if (list != null) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Map<String, Object> map2 = (Map) list.get(i11);
                        if (map2 != null) {
                            hashSet.addAll(b(str2, map2));
                        }
                    }
                }
                return hashSet;
            }
            bVar = WebEngageConstant.f30863b.get(2);
        }
        str = bVar.f30873b;
        String str22 = (String) map.get(str);
        list = (List) map.get("variations");
        HashSet hashSet2 = new HashSet();
        if (list != null) {
        }
        return hashSet2;
    }
}
