package com.webengage.sdk.android;

import android.content.Context;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class d0 extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30492c;

    /* renamed from: d, reason: collision with root package name */
    private y3 f30493d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30494a;

        static {
            int[] iArr = new int[y3.values().length];
            f30494a = iArr;
            try {
                iArr[y3.f31157b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30494a[y3.f31160e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    d0(Context context) {
        super(context);
        this.f30492c = null;
        this.f30493d = null;
        this.f30492c = context.getApplicationContext();
    }

    private void a(com.webengage.sdk.android.actions.rules.a aVar) {
        List<String> i10 = aVar.i();
        Map<String, Set<String>> f10 = com.webengage.sdk.android.actions.database.e.b(this.f30492c).f();
        if (f10 != null) {
            for (Map.Entry<String, Set<String>> entry : f10.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                value.removeAll(i10);
                if (value.size() > 0) {
                    Iterator<String> it = value.iterator();
                    while (it.hasNext()) {
                        DataHolder.get().a(key, it.next(), (Object) null);
                    }
                }
            }
        }
    }

    private void f(Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Map map2 = (Map) entry.getValue();
                if (map2 != null) {
                    s1.a(this.f30492c).a(((Double) map2.get("lat")).doubleValue(), ((Double) map2.get("long")).doubleValue(), Float.parseFloat(map2.get(HVRetakeActivity.RADIUS_TAG).toString()), entry.getKey(), WebEngage.get().getWebEngageConfig());
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        Map hashMap = new HashMap();
        try {
            hashMap = WENetworkUtil.makeRequest(this.f30492c, (RequestObject) obj, true, true);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        int intValue = ((Integer) hashMap.get("status")).intValue();
        if (hashMap.get("data") == null) {
            Logger.e("WebEngage", "ConfigurationAction result data is null");
            return null;
        }
        InputStream inputStream = (InputStream) hashMap.get("data");
        int i10 = a.f30494a[this.f30493d.ordinal()];
        try {
        } catch (Exception e11) {
            b(e11);
        }
        if (i10 != 1) {
            if (i10 == 2 && intValue == 200) {
                DataHolder.get().b("refreshSessionPageRule", Boolean.TRUE);
                Map<String, Object> k10 = DataHolder.get().k();
                com.webengage.sdk.android.actions.rules.a aVar = new com.webengage.sdk.android.actions.rules.a(com.webengage.sdk.android.utils.b.a(inputStream, false));
                a(aVar, aVar.a(u2.b(), DataHolder.get()));
                com.webengage.sdk.android.utils.b.a(aVar.h(), this.f30492c);
                a(k10, DataHolder.get().k());
                b(aVar.j());
            }
            return inputStream;
        }
        com.webengage.sdk.android.actions.rules.a aVar2 = new com.webengage.sdk.android.actions.rules.a(com.webengage.sdk.android.utils.b.a(inputStream, false));
        aVar2.a(u2.b(), DataHolder.get());
        f(DataHolder.get().k());
        b(aVar2.j());
        inputStream.close();
        return inputStream;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        String str = (String) map.get("config_url");
        y3 y3Var = (y3) map.get("topic");
        this.f30493d = y3Var;
        int i10 = a.f30494a[y3Var.ordinal()] != 1 ? 2 : 4;
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/transit+json");
        return new RequestObject.Builder(str, RequestMethod.GET, this.f30492c).setCachePolicy(i10).setHeaders(hashMap).build();
    }

    private void a(com.webengage.sdk.android.actions.rules.a aVar, Set<String> set) {
        Set<String> b10 = aVar.b();
        Set<String> d10 = com.webengage.sdk.android.utils.http.b.b(this.f30492c).d();
        d10.removeAll(b10);
        com.webengage.sdk.android.utils.http.b.b(this.f30492c).a(d10);
        Set<String> e10 = aVar.e();
        Map<String, Set<String>> d11 = com.webengage.sdk.android.actions.database.e.b(this.f30492c).d();
        if (d11 != null) {
            for (Map.Entry<String, Set<String>> entry : d11.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                value.removeAll(e10);
                if (value.size() > 0) {
                    Iterator<String> it = value.iterator();
                    while (it.hasNext()) {
                        DataHolder.get().a(key, it.next(), (Map<String, Object>) null);
                    }
                }
            }
        }
        Map<String, Set<String>> e11 = com.webengage.sdk.android.actions.database.e.b(this.f30492c).e();
        if (e11 != null) {
            for (Map.Entry<String, Set<String>> entry2 : e11.entrySet()) {
                String key2 = entry2.getKey();
                Set<String> value2 = entry2.getValue();
                HashSet<String> hashSet = new HashSet();
                for (String str : value2) {
                    int indexOf = str.indexOf(91);
                    if (indexOf == -1) {
                        indexOf = str.indexOf(95);
                    }
                    if (indexOf != -1) {
                        hashSet.add(str.substring(0, indexOf));
                    }
                }
                hashSet.removeAll(set);
                if (hashSet.size() > 0) {
                    for (String str2 : hashSet) {
                        for (String str3 : value2) {
                            if (str3.startsWith(str2)) {
                                DataHolder.get().a(key2, str3, (Object) null, h0.SCOPES);
                            }
                        }
                    }
                }
            }
        }
        a(aVar);
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
        if (obj != null) {
            try {
                ((InputStream) obj).close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        f(map2);
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.keySet());
            if (map2 != null) {
                arrayList.removeAll(map2.keySet());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            s1.a(this.f30492c).a(arrayList);
        }
    }
}
