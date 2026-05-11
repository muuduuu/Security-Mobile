package com.webengage.sdk.android.actions.rules;

import android.content.Context;
import android.text.TextUtils;
import com.webengage.sdk.android.AbstractC2951a;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.h0;
import com.webengage.sdk.android.h1;
import com.webengage.sdk.android.k4;
import com.webengage.sdk.android.o4;
import com.webengage.sdk.android.p0;
import com.webengage.sdk.android.u2;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30458c;

    /* renamed from: d, reason: collision with root package name */
    private List<WebEngageConstant.d> f30459d;

    /* renamed from: e, reason: collision with root package name */
    String f30460e;

    protected c(Context context) {
        super(context);
        this.f30458c = null;
        this.f30459d = null;
        this.f30460e = null;
        this.f30458c = context.getApplicationContext();
    }

    private List<String> b(List<String> list) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : list) {
            if (DataHolder.get().n() == null || DataHolder.get().n().get(str) == null) {
                arrayList.add(str);
            } else {
                HashMap hashMap2 = (HashMap) DataHolder.get().n().get(str);
                String str2 = (String) hashMap2.get("targetView");
                List list2 = (List) hashMap.get(str2);
                if (!TextUtils.isEmpty(str2)) {
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                    list2.add(hashMap2);
                    hashMap.put(str2, list2);
                    arrayList2.add(str);
                }
            }
        }
        h1 h1Var = new h1(this.f30458c);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        hashMap4.put("ids", arrayList2);
        hashMap4.put("qEntities", hashMap);
        hashMap3.put("action_data", hashMap4);
        h1Var.d((Map<String, Object>) hashMap3);
        DataHolder.get().b(arrayList2);
        return arrayList;
    }

    public boolean a(p0 p0Var) {
        String d10 = p0Var.d();
        boolean z10 = false;
        if (d10 != null) {
            if ("system".equals(p0Var.b()) && !d10.startsWith("we_")) {
                d10 = "we_" + d10;
            }
            List<b> eventCriteriasForEvent = u2.b().getEventCriteriasForEvent(d10);
            if (eventCriteriasForEvent != null) {
                for (b bVar : eventCriteriasForEvent) {
                    Object a10 = bVar.c().a();
                    if (a10 != null && ((Boolean) a10).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(h0.EVENT.toString());
                        arrayList.add(d10);
                        if ("system".equals(bVar.b())) {
                            arrayList.add("we_wk_sys");
                        }
                        arrayList.add(bVar.a());
                        Object a11 = DataHolder.get().a(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(a11);
                        arrayList2.add(DataHolder.get().e(bVar.e()));
                        y0 function = u2.b().getFunction(bVar.d());
                        Object a12 = function != null ? function.a(arrayList2) : null;
                        if (a12 != null) {
                            DataHolder.get().a(this.f30460e, bVar.e(), (Map<String, Object>) a12);
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016f, code lost:
    
        if (com.webengage.sdk.android.o4.b().a(r4, r7, r12) != false) goto L67;
     */
    @Override // com.webengage.sdk.android.AbstractC2951a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object d(Object obj) {
        boolean z10;
        String str;
        boolean z11;
        Map<String, Object> a10;
        boolean z12;
        WebEngageConstant.a aVar;
        Map<String, Object> a11;
        boolean z13;
        Map<String, Object> map;
        List<WebEngageConstant.d> list;
        WebEngageConstant.d dVar;
        String str2 = "order";
        this.f30460e = d().isEmpty() ? h() : d();
        Map map2 = (Map) obj;
        this.f30459d = (List) map2.get("execution_chain");
        p0 p0Var = (p0) map2.get("event_state_data");
        if (p0Var != null) {
            z10 = a(p0Var);
            if (z10) {
                if (this.f30459d.size() > 0) {
                    WebEngageConstant.d dVar2 = this.f30459d.get(0);
                    WebEngageConstant.d dVar3 = WebEngageConstant.d.SESSION_RULE;
                    if (dVar2 != dVar3) {
                        this.f30459d.add(0, dVar3);
                    }
                    if (this.f30459d.size() > 1) {
                        WebEngageConstant.d dVar4 = this.f30459d.get(1);
                        dVar = WebEngageConstant.d.PAGE_RULE;
                        if (dVar4 != dVar) {
                            list = this.f30459d;
                            list.add(1, dVar);
                        }
                    }
                } else {
                    this.f30459d.add(0, WebEngageConstant.d.SESSION_RULE);
                }
                list = this.f30459d;
                dVar = WebEngageConstant.d.PAGE_RULE;
                list.add(1, dVar);
            }
        } else {
            z10 = false;
        }
        List<String> list2 = null;
        for (WebEngageConstant.d dVar5 : this.f30459d) {
            WebEngageConstant.d dVar6 = WebEngageConstant.d.PAGE_RULE;
            if (dVar5.equals(dVar6)) {
                u2.b().setCompetingIds(m());
                Map<String, Map<String, String>> p10 = p();
                List<String> evaluateRulesByCategory = u2.b().evaluateRulesByCategory(dVar6);
                try {
                    ArrayList arrayList = new ArrayList();
                    try {
                        if (evaluateRulesByCategory.size() > 0) {
                            a aVar2 = new a(this.f30458c);
                            long j10 = Long.MAX_VALUE;
                            for (String str3 : evaluateRulesByCategory) {
                                if (DataHolder.get().n() == null || DataHolder.get().n().get(str3) == null) {
                                    aVar = (DataHolder.get().m() == null || DataHolder.get().m().get(str3) == null) ? WebEngageConstant.a.SURVEY : WebEngageConstant.a.NOTIFICATION;
                                    a11 = aVar2.a(str3, aVar);
                                    z13 = false;
                                } else {
                                    aVar = WebEngageConstant.a.INLINE_PERSONALIZATION;
                                    a11 = aVar2.a(str3, aVar);
                                    z13 = true;
                                }
                                long longValue = a11.get(str2) == null ? 0L : ((Long) a11.get(str2)).longValue();
                                if (z13) {
                                    Map<String, String> map3 = p10.get(str3);
                                    Map<String, Object> a12 = map3 != null ? aVar2.a(map3.keySet().iterator().next(), a11) : null;
                                    if (z10) {
                                        if (u2.b().getEvaluationIds().contains(str3)) {
                                            arrayList.add(str3);
                                        }
                                    }
                                } else if (j10 == Long.MAX_VALUE || longValue <= j10) {
                                    Map<String, String> map4 = p10.get(str3);
                                    if (map4 != null) {
                                        str = str2;
                                        try {
                                            map = aVar2.a(map4.keySet().iterator().next(), a11);
                                            z11 = z10;
                                        } catch (Exception unused) {
                                            z11 = z10;
                                            list2 = arrayList;
                                            z10 = z11;
                                            str2 = str;
                                        }
                                    } else {
                                        str = str2;
                                        z11 = z10;
                                        map = null;
                                    }
                                    try {
                                        if (o4.b().a(aVar, a11, map)) {
                                            long min = Math.min(longValue, j10);
                                            arrayList.add(str3);
                                            j10 = min;
                                        }
                                        z10 = z11;
                                        str2 = str;
                                    } catch (Exception unused2) {
                                    }
                                }
                                str = str2;
                                z11 = z10;
                                z10 = z11;
                                str2 = str;
                            }
                        }
                        str = str2;
                        z11 = z10;
                        u2.b().setCompetingIds(arrayList);
                    } catch (Exception unused3) {
                        str = str2;
                    }
                    list2 = arrayList;
                } catch (Exception unused4) {
                    str = str2;
                    z11 = z10;
                }
            } else {
                str = str2;
                z11 = z10;
                WebEngageConstant.d dVar7 = WebEngageConstant.d.SESSION_RULE;
                if (dVar5.equals(dVar7)) {
                    try {
                        a aVar3 = new a(this.f30458c);
                        u2.b().reset();
                        list2 = u2.b().evaluateRulesByCategory(dVar7);
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        HashSet hashSet = new HashSet();
                        for (String str4 : list2) {
                            if (DataHolder.get().n() == null || DataHolder.get().n().get(str4) == null) {
                                a10 = aVar3.a(str4, WebEngageConstant.a.NOTIFICATION);
                                z12 = false;
                            } else {
                                a10 = aVar3.a(str4, WebEngageConstant.a.INLINE_PERSONALIZATION);
                                z12 = true;
                            }
                            HashMap<String, String> a13 = k4.b().a(str4, this.f30460e, a10, aVar3.l());
                            String str5 = a13.get("variationId");
                            if (str5 != null) {
                                String str6 = (String) aVar3.a(str5, a10).get("layout");
                                if (!z12) {
                                    hashSet.add(aVar3.a(str6));
                                }
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put(str5, str6);
                                hashMap.put(str4, hashMap3);
                            } else {
                                hashMap2.put(str4, a13);
                            }
                        }
                        if (!hashSet.isEmpty() && p0Var != null && "visitor_new_session".equals(p0Var.d())) {
                            com.webengage.sdk.android.utils.b.a(hashSet, this.f30458c);
                        }
                        u2.b().setCompetingIds(list2);
                        a(list2);
                        b((Map<String, Map<String, String>>) hashMap);
                        a((Map<String, Map<String, String>>) hashMap2);
                    } catch (Exception unused5) {
                    }
                } else {
                    WebEngageConstant.d dVar8 = WebEngageConstant.d.EVENT_RULE;
                    if (dVar5.equals(dVar8)) {
                        list2 = u2.b().evaluateRulesByCategory(dVar8);
                    }
                }
            }
            z10 = z11;
            str2 = str;
        }
        u2.b().setEvaluationIds(list2);
        Logger.d("WebEngage", "evaluated campaigns: " + list2 + " with chain: " + this.f30459d);
        return list2;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        return map;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
        List<String> list;
        List<String> list2 = (List) obj;
        if (list2 != null) {
            list = u2.b().filterRenderingIds(list2, this.f30459d.get(r1.size() - 1));
        } else {
            list = null;
        }
        c(b(list));
    }
}
