package com.webengage.sdk.android;

import android.text.TextUtils;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class k4 {

    /* renamed from: g, reason: collision with root package name */
    public static k4 f30685g;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f30686a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f30687b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    double f30688c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    double f30689d = 0.0d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30690e = false;

    /* renamed from: f, reason: collision with root package name */
    HashMap<String, String> f30691f = new HashMap<>();

    private k4() {
    }

    public static synchronized k4 b() {
        synchronized (k4.class) {
            synchronized (k4.class) {
                try {
                    if (f30685g == null) {
                        f30685g = new k4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f30685g;
        }
        return f30685g;
    }

    public HashMap<String, String> a(String str, String str2, Map<String, Object> map, boolean z10) {
        this.f30690e = false;
        this.f30688c = 0.0d;
        this.f30691f = new HashMap<>();
        this.f30689d = Double.parseDouble(String.valueOf(Math.abs(str2.hashCode()) % 100));
        if ((!map.containsKey("excludeUCG") && z10) || (map.containsKey("excludeUCG") && (map.get("excludeUCG") instanceof Boolean) && !((Boolean) map.get("excludeUCG")).booleanValue())) {
            a();
        }
        if (!this.f30690e) {
            if (!map.containsKey("cgId") || this.f30687b.get((String) map.get("cgId")) == null) {
                a(str, str2, map);
            } else {
                a((String) map.get("cgId"));
            }
        }
        if (!this.f30690e) {
            b(str, str2, map);
        }
        return this.f30691f;
    }

    private void a() {
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        for (String str4 : this.f30686a.keySet()) {
            if (this.f30686a.get(str4) != null) {
                HashMap hashMap = (HashMap) this.f30686a.get(str4);
                List<List<Integer>> b10 = b((String) hashMap.get("range"));
                str2 = (String) hashMap.get("name");
                if (TextUtils.isEmpty(str2)) {
                    str2 = "UNIVERSAL";
                }
                for (List<Integer> list : b10) {
                    this.f30688c += (list.get(1).intValue() - list.get(0).intValue()) + 1;
                    if (this.f30689d >= list.get(0).intValue() && this.f30689d < list.get(1).intValue()) {
                        str3 = list.toString();
                        str = str4;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30691f.put("attribution_type", str2);
        this.f30691f.put("cg_id", str);
        this.f30691f.put("cg_range", str3);
        this.f30691f.put("bucket_value", this.f30689d + BuildConfig.FLAVOR);
        this.f30691f.put("size", this.f30688c + BuildConfig.FLAVOR);
        this.f30690e = true;
    }

    private List<List<Integer>> b(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.replace(",[", ";").replace("[", BuildConfig.FLAVOR).replace("]", BuildConfig.FLAVOR).split(";")) {
                String[] split = str2.split(",");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(Integer.parseInt(split[0])));
                arrayList2.add(Integer.valueOf(Integer.parseInt(split[1])));
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private void a(String str) {
        if (this.f30687b.get(str) != null) {
            HashMap hashMap = (HashMap) this.f30687b.get(str);
            List<List<Integer>> b10 = b((String) hashMap.get("range"));
            String str2 = (String) hashMap.get("name");
            boolean z10 = false;
            String str3 = BuildConfig.FLAVOR;
            for (List<Integer> list : b10) {
                this.f30688c += (list.get(1).intValue() - list.get(0).intValue()) + 1;
                if (this.f30689d >= list.get(0).intValue() && this.f30689d < list.get(1).intValue()) {
                    str3 = list.toString();
                    z10 = true;
                }
            }
            if (z10) {
                this.f30691f.put("attribution_type", str2);
                this.f30691f.put("cg_id", str);
                this.f30691f.put("bucket_value", this.f30689d + BuildConfig.FLAVOR);
                this.f30691f.put("cg_range", str3);
                this.f30691f.put("size", this.f30688c + BuildConfig.FLAVOR);
                this.f30690e = true;
            }
        }
    }

    private void b(String str, String str2, Map<String, Object> map) {
        if (map != null) {
            if (map.get("journeyId") != null) {
                str = (String) map.get("journeyId");
            }
            double a10 = WebEngageUtils.a(str, str2);
            List list = (List) map.get("variations");
            if (list != null) {
                double d10 = 0.0d;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Map map2 = (Map) list.get(i10);
                    if (map2 != null) {
                        double doubleValue = map2.get("sampling") == null ? 100.0d : ((Double) map2.get("sampling")).doubleValue();
                        if (a10 >= d10 && a10 < d10 + doubleValue) {
                            this.f30691f.put("variationId", (String) map2.get("id"));
                            return;
                        }
                        d10 += doubleValue;
                    }
                }
            }
        }
    }

    private void a(String str, String str2, Map<String, Object> map) {
        if (map != null) {
            if (map.get("journeyId") != null) {
                str = (String) map.get("journeyId");
            }
            double a10 = WebEngageUtils.a(str, str2);
            if (map.containsKey("controlGroup")) {
                long longValue = ((Long) map.get("controlGroup")).longValue();
                if (longValue <= 0 || a10 < 100 - longValue) {
                    return;
                }
                this.f30691f.put("bucket_value", a10 + BuildConfig.FLAVOR);
                this.f30691f.put("size", longValue + BuildConfig.FLAVOR);
                this.f30690e = true;
            }
        }
    }

    public void b(HashMap<String, Object> hashMap) {
        this.f30686a = hashMap;
    }

    public void a(HashMap<String, Object> hashMap) {
        this.f30687b = hashMap;
    }
}
