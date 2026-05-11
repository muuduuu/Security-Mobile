package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class h1 extends AbstractC2951a {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f30630d = true;

    /* renamed from: c, reason: collision with root package name */
    private Context f30631c;

    public h1(Context context) {
        super(context);
        this.f30631c = context;
    }

    private List<HashMap<String, Object>> a(HashMap<String, List<Object>> hashMap) {
        Object obj;
        String str;
        ArrayList arrayList = new ArrayList();
        List<HashMap<String, Object>> o10 = DataHolder.get().o();
        HashSet hashSet = new HashSet();
        if (o10 != null) {
            Iterator<HashMap<String, Object>> it = o10.iterator();
            while (it.hasNext()) {
                HashMap hashMap2 = new HashMap(it.next());
                String str2 = (String) hashMap2.get("targetView");
                if (str2 != null && !TextUtils.isEmpty(str2.trim())) {
                    String trim = str2.trim();
                    if (hashSet.contains(trim)) {
                        Logger.i("WebEngage", "TargetView " + trim + " already has a campaign attached. Skipping Property " + hashMap2.get("p_id"));
                    } else if (!f(hashMap2)) {
                        Logger.d("WebEngage", "Ignoring property: " + trim + " with Id: " + hashMap2.get("p_id") + " because screen rule failed");
                    } else if (!hashMap.containsKey(trim)) {
                        arrayList.add(hashMap2);
                    } else if (hashMap.get(trim) != null) {
                        Iterator<Object> it2 = hashMap.get(trim).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (next != null) {
                                Map<String, String> map = p().get((String) ((HashMap) next).get("notificationEncId"));
                                String next2 = map != null ? map.keySet().iterator().next() : null;
                                HashMap hashMap3 = new HashMap(hashMap2);
                                if (next2 != null) {
                                    hashMap3.put("variationId", next2);
                                    obj = l(next2);
                                    str = "params";
                                } else {
                                    obj = Boolean.TRUE;
                                    str = "CONTROL_GROUP";
                                }
                                hashMap3.put(str, obj);
                                hashMap3.put("campaign", next);
                                arrayList.add(hashMap3);
                                if (next2 != null) {
                                    hashSet.add(trim);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean f(Map<String, Object> map) {
        return u2.b().evaluateRule(new t2(String.valueOf(map.get("pageRuleCode"))), WebEngageConstant.d.CUSTOM_RULE);
    }

    private String l(String str) {
        List<Object> list;
        Object a10;
        Map<String, List<Object>> I10 = DataHolder.get().I();
        if (I10 != null && (list = I10.get(str)) != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList != null && arrayList.size() > 0 && (a10 = u2.b().getFunction("$we_getResolvedData").a(arrayList)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str);
                    arrayList2.addAll(arrayList);
                    DataHolder.get().a(arrayList2, a10);
                }
            }
        }
        HashMap hashMap = (HashMap) DataHolder.get().a(str);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        try {
            return (String) DataType.convert(hashMap, DataType.STRING, true);
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        List list = (List) obj;
        Logger.d("WebEngage", "InLinePersonalizationAction show campaign  execute: " + list.size());
        HashMap hashMap2 = new HashMap();
        if (!list.isEmpty()) {
            hashMap2.put("luid", h());
            hashMap2.put("cuid", d());
            hashMap2.put("base_url", WebEngageConstant.e.PERSONALISATION_BASE.toString());
            hashMap.put("systemData", hashMap2);
            hashMap.put("properties", obj);
            hashMap.put("limit", Integer.valueOf(DataHolder.get().l()));
            WeakReference<Activity> activity = C2958f.a(this.f30631c).getActivity();
            if (activity != null && activity.get() != null && !activity.get().isFinishing()) {
                x.a(this.f30631c).propertiesReceived(activity, hashMap);
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        HashMap hashMap = (HashMap) map.get("action_data");
        if (hashMap != null && (!hashMap.containsKey("ids") || !hashMap.containsKey("qEntities"))) {
            return null;
        }
        List<String> list = (List) hashMap.get("ids");
        List<String> u10 = DataHolder.get().u();
        if (!f30630d && list == null) {
            throw new AssertionError();
        }
        if (list.size() == u10.size()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!u10.contains(it.next())) {
                }
            }
            Logger.d("WebEngage", "Not processing inline campaigns as their is no change, new ids: " + list + " old ids: " + u10);
            DataHolder.get().b(list);
            return null;
        }
        HashMap<String, List<Object>> hashMap2 = (HashMap) hashMap.get("qEntities");
        if (hashMap2 == null) {
            return null;
        }
        List<HashMap<String, Object>> a10 = a(hashMap2);
        Logger.d("WebEngage", "InLinePersonalizationAction show campaign  pre-execute: " + new JSONArray((Collection) a10));
        return a10;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
    }
}
