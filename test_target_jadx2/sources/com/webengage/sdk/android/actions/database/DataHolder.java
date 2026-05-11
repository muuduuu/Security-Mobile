package com.webengage.sdk.android.actions.database;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.AdRevenueScheme;
import com.webengage.sdk.android.b2;
import com.webengage.sdk.android.c2;
import com.webengage.sdk.android.c4;
import com.webengage.sdk.android.g4;
import com.webengage.sdk.android.h0;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class DataHolder {

    /* renamed from: c, reason: collision with root package name */
    private static DataHolder f30277c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f30278d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private List<b2> f30279a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List<Object> f30280b;
    public Map<String, Object> container;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30281a;

        static {
            int[] iArr = new int[WebEngageConstant.a.values().length];
            f30281a = iArr;
            try {
                iArr[WebEngageConstant.a.NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30281a[WebEngageConstant.a.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30281a[WebEngageConstant.a.INLINE_PERSONALIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30281a[WebEngageConstant.a.SURVEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private DataHolder() {
        this.container = null;
        this.f30280b = null;
        this.container = new HashMap();
        this.f30280b = new ArrayList();
    }

    public static DataHolder get() {
        if (f30277c == null) {
            synchronized (f30278d) {
                try {
                    if (f30277c == null) {
                        f30277c = new DataHolder();
                    }
                } finally {
                }
            }
        }
        return f30277c;
    }

    public String A() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.PAGE.toString());
            this.f30280b.add("system");
            this.f30280b.add("screen_path");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public String B() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.PAGE.toString());
            this.f30280b.add("system");
            this.f30280b.add("screen_title");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public List<Object> C() {
        List<Object> list;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("events");
            this.f30280b.add("we_wk_session_delay");
            list = (List) a(this.f30280b);
        }
        return list;
    }

    public String D() {
        String str;
        synchronized (f30278d) {
            try {
                this.f30280b.clear();
                this.f30280b.add(h0.ANDROID);
                this.f30280b.add("landing_page");
                try {
                    str = (String) a(this.f30280b);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public Long E() {
        Long g10;
        synchronized (f30278d) {
            g10 = g("page_view_count_session");
        }
        return g10;
    }

    public Map<String, Object> F() {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.STATIC_LIST.toString());
            map = (Map) a(this.f30280b);
            map.remove("ts");
        }
        return map;
    }

    public Map<String, Object> G() {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.PAGE.toString());
            this.f30280b.add("system");
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    public Long H() {
        Long l10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("tzo");
            l10 = (Long) a(this.f30280b);
        }
        return l10;
    }

    public Map<String, List<Object>> I() {
        Map<String, List<Object>> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("tokens");
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    public Long J() {
        Long l10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("total_page_view_count");
            l10 = (Long) a(this.f30280b);
        }
        return l10;
    }

    public Map<String, Object> K() {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("upfc");
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    public Date L() {
        Date date;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("last_logged_in");
            date = (Date) a(this.f30280b);
        }
        return date;
    }

    public boolean M() {
        boolean z10;
        synchronized (f30278d) {
            try {
                z10 = this.container.get("app_foreground") != null && ((Boolean) this.container.get("app_foreground")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean N() {
        boolean z10;
        synchronized (f30278d) {
            try {
                z10 = this.container.get("boot_up") != null && ((Boolean) this.container.get("boot_up")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean O() {
        boolean z10;
        synchronized (f30278d) {
            try {
                z10 = this.container.get("refreshSessionPageRule") != null && ((Boolean) this.container.get("refreshSessionPageRule")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean P() {
        boolean z10;
        synchronized (f30278d) {
            try {
                z10 = this.container.get("interface_id_checked") != null && ((Boolean) this.container.get("interface_id_checked")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean Q() {
        boolean z10;
        synchronized (f30278d) {
            try {
                z10 = this.container.get("we_instance_id_checked") != null && ((Boolean) this.container.get("we_instance_id_checked")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean R() {
        boolean z10;
        synchronized (f30278d) {
            try {
                z10 = this.container.get("useLegacyRuleCompiler") != null && ((Boolean) this.container.get("useLegacyRuleCompiler")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public Long a(Map<String, Object> map, WebEngageConstant.a aVar) {
        this.f30280b.clear();
        this.f30280b.add(h0.SCOPES.toString());
        this.f30280b.add(e(map, aVar) + "_click");
        Long l10 = (Long) a(this.f30280b);
        return Long.valueOf(l10 == null ? 0L : l10.longValue());
    }

    public Long b(Map<String, Object> map, WebEngageConstant.a aVar) {
        Long g10;
        synchronized (f30278d) {
            g10 = g(e(map, aVar) + "_close_session");
        }
        return g10;
    }

    public Long c() {
        Long l10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("b_session_count");
            l10 = (Long) a(this.f30280b);
        }
        return l10;
    }

    public Long d(String str) {
        Long g10;
        synchronized (f30278d) {
            g10 = g(str + "_view_session");
        }
        return g10;
    }

    public String e() {
        String str;
        synchronized (f30278d) {
            try {
                str = this.container.get("c_sdk_versions") != null ? (String) this.container.get("c_sdk_versions") : BuildConfig.FLAVOR;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public Long f(String str) {
        Long valueOf;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.SCOPES.toString());
            this.f30280b.add(str);
            Long l10 = (Long) a(this.f30280b);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0023, B:11:0x0036, B:12:0x003a, B:16:0x0032), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Long g(String str) {
        Long l10;
        Long valueOf;
        synchronized (f30278d) {
            try {
                Map<String, Object> map = this.container;
                h0 h0Var = h0.ANDROID;
                if (map.containsKey(h0Var.toString())) {
                    HashMap hashMap = (HashMap) this.container.get(h0Var.toString());
                    if (hashMap.containsKey(str)) {
                        l10 = (Long) hashMap.get(str);
                        valueOf = Long.valueOf(l10 != null ? 0L : l10.longValue());
                    }
                }
                l10 = null;
                valueOf = Long.valueOf(l10 != null ? 0L : l10.longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
        return valueOf;
    }

    public Object h(String str) {
        Object a10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.STATIC_LIST.toString());
            this.f30280b.add(str);
            a10 = a(this.f30280b);
        }
        return a10;
    }

    public long i() {
        long longValue;
        synchronized (f30278d) {
            try {
                longValue = this.container.containsKey("f_activity_start_ep") ? ((Long) this.container.get("f_activity_start_ep")).longValue() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return longValue;
    }

    public Long j() {
        Long l10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("session_count");
            l10 = (Long) a(this.f30280b);
        }
        return l10;
    }

    public Map<String, Object> k() {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("geoFences");
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    public int l() {
        int parseInt;
        synchronized (f30278d) {
            parseInt = this.container.get("p_campaign_limit") == null ? 5 : Integer.parseInt(String.valueOf((Long) this.container.get("p_campaign_limit")));
        }
        return parseInt;
    }

    public Map<String, Object> m() {
        Map<String, Object> map;
        synchronized (f30278d) {
            map = this.container.get("in_app_campaigns") == null ? null : (Map) this.container.get("in_app_campaigns");
        }
        return map;
    }

    public Map<String, Object> n() {
        Map<String, Object> map;
        synchronized (f30278d) {
            map = this.container.get("inline_campaigns") == null ? null : (Map) this.container.get("inline_campaigns");
        }
        return map;
    }

    public List<HashMap<String, Object>> o() {
        List<HashMap<String, Object>> list;
        synchronized (f30278d) {
            list = this.container.get("inline_properties") == null ? null : (List) this.container.get("inline_properties");
        }
        return list;
    }

    public Map<String, Object> p() {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("upfc");
            this.f30280b.add("jids");
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    public String q() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("session_type");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public Double r() {
        Double d10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add(AppConstants.LATITUDE);
            d10 = (Double) a(this.f30280b);
        }
        return d10;
    }

    public String s() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("locality");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public Double t() {
        Double d10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add(AppConstants.LONGITUDE);
            d10 = (Double) a(this.f30280b);
        }
        return d10;
    }

    public List<String> u() {
        synchronized (f30278d) {
            try {
                if (this.container.get("old_inline_qualified_campaigns") != null) {
                    return (List) this.container.get("old_inline_qualified_campaigns");
                }
                return new ArrayList();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<Object> v() {
        List<Object> list;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("events");
            this.f30280b.add("we_wk_page_delay");
            list = (List) a(this.f30280b);
        }
        return list;
    }

    public String w() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("postal_code");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public String x() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("region");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public Map<String, Object> y() {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("upfc");
            this.f30280b.add("sids");
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    public String z() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.PAGE.toString());
            this.f30280b.add("system");
            this.f30280b.add("screen_name");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public Object a(String str) {
        Object obj;
        synchronized (f30278d) {
            obj = this.container.get(str);
        }
        try {
            return DataType.cloneInternal(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public Object b(String str) {
        Object a10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add(str);
            a10 = a(this.f30280b);
        }
        return a10;
    }

    public Long c(String str) {
        Long valueOf;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.SCOPES.toString());
            this.f30280b.add(str + "_view");
            Long l10 = (Long) a(this.f30280b);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    public Long d(Map<String, Object> map, WebEngageConstant.a aVar) {
        Long valueOf;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.SCOPES.toString());
            this.f30280b.add(e(map, aVar) + "_view");
            Long l10 = (Long) a(this.f30280b);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0003, B:11:0x003e, B:13:0x004e, B:15:0x0068, B:16:0x0075, B:17:0x0079, B:21:0x0028, B:22:0x002d, B:23:0x003c, B:24:0x0032, B:25:0x0037), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String e(Map<String, Object> map, WebEngageConstant.a aVar) {
        WebEngageConstant.b bVar;
        String sb2;
        synchronized (f30278d) {
            try {
                String str = (String) map.get("journeyId");
                List<WebEngageConstant.b> list = WebEngageConstant.f30863b;
                String str2 = list.get(0).f30873b;
                int i10 = a.f30281a[aVar.ordinal()];
                if (i10 == 1) {
                    bVar = list.get(1);
                } else if (i10 == 3) {
                    bVar = list.get(0);
                } else if (i10 != 4) {
                    String str3 = (String) map.get(str2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str3);
                    if (str != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("journey");
                        arrayList.add(str);
                        arrayList.add("id");
                        String str4 = (String) a(arrayList);
                        if (str4 != null) {
                            sb3.append("[");
                            sb3.append(str4);
                            sb3.append("]");
                        }
                    }
                    sb2 = sb3.toString();
                } else {
                    bVar = list.get(2);
                }
                str2 = bVar.f30873b;
                String str32 = (String) map.get(str2);
                StringBuilder sb32 = new StringBuilder();
                sb32.append(str32);
                if (str != null) {
                }
                sb2 = sb32.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb2;
    }

    public String f() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add("city");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public String g() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID.toString());
            this.f30280b.add(AdRevenueScheme.COUNTRY);
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public Map<String, Object> h() {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.PAGE.toString());
            this.f30280b.add("custom");
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    public Object i(String str) {
        Object a10;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.USER.toString());
            this.f30280b.add(str);
            a10 = a(this.f30280b);
        }
        return a10;
    }

    public void j(String str) {
        synchronized (f30278d) {
            this.container.put("c_sdk_versions", str);
        }
    }

    public Object a(List<? extends Object> list) {
        Object obj;
        if (list == null) {
            return null;
        }
        synchronized (f30278d) {
            try {
                obj = this.container.containsKey(list.get(0).toString()) ? this.container.get(list.get(0).toString()) : null;
                for (int i10 = 1; i10 < list.size(); i10++) {
                    if (obj != null) {
                        if (obj instanceof Map) {
                            for (Map.Entry entry : ((Map) obj).entrySet()) {
                                if (((String) entry.getKey()).equalsIgnoreCase(list.get(i10).toString())) {
                                    obj = entry.getValue();
                                    break;
                                }
                            }
                            obj = null;
                        } else {
                            if (obj instanceof List) {
                                List list2 = (List) obj;
                                if (list.get(i10) != null && list2.size() > Integer.parseInt(list.get(i10).toString())) {
                                    obj = list2.get(Integer.parseInt(list.get(i10).toString()));
                                }
                            }
                            obj = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return DataType.cloneInternal(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public void b() {
        synchronized (f30278d) {
            try {
                Map<String, Object> map = this.container;
                h0 h0Var = h0.ANDROID;
                if (map.containsKey(h0Var.toString())) {
                    HashMap hashMap = (HashMap) this.container.get(h0Var.toString());
                    for (String str : hashMap.keySet()) {
                        if (str.endsWith("session")) {
                            hashMap.put(str, 0);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Long c(Map<String, Object> map, WebEngageConstant.a aVar) {
        Long g10;
        synchronized (f30278d) {
            g10 = g(e(map, aVar) + "_hide_session");
        }
        return g10;
    }

    public String d() {
        String str;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(HVRetakeActivity.CONFIG_TAG);
            this.f30280b.add("gbp");
            str = (String) a(this.f30280b);
        }
        return str;
    }

    public Map<String, Object> e(String str) {
        Map<String, Object> map;
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.EVENT_CRITERIA.toString());
            this.f30280b.add(str);
            map = (Map) a(this.f30280b);
        }
        return map;
    }

    protected void f(String str, Map<String, Object> map) {
        synchronized (f30278d) {
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        a(str, entry.getKey(), entry.getValue(), h0.ATTR);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void g(String str, Map<String, Object> map) {
        synchronized (f30278d) {
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        a(str, entry.getKey(), entry.getValue(), h0.ANDROID);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void h(String str, Map<String, Object> map) {
        synchronized (f30278d) {
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (g4.a(key) != null) {
                            a(str, key, entry.getValue(), h0.USER);
                        }
                        if (c4.a(key)) {
                            a(str, key, entry.getValue(), h0.ANDROID);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a() {
        HashMap hashMap;
        synchronized (f30278d) {
            try {
                Map map = (Map) a(h0.EVENT.toString());
                if (map != null) {
                    hashMap = new HashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((String) entry.getKey()).equals("we_wk_session_delay")) {
                            hashMap.put("we_wk_session_delay", entry.getValue());
                        }
                    }
                } else {
                    hashMap = null;
                }
                this.f30280b.clear();
                this.f30280b.add(h0.EVENT.toString());
                a(this.f30280b, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str, Object obj) {
        synchronized (f30278d) {
            this.container.put(str, obj);
        }
    }

    protected void c(String str, Map<String, Object> map) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.EVENT.toString());
            this.f30280b.add(str);
            a(this.f30280b, map);
        }
    }

    protected void d(String str, Map<String, Object> map) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.LATEST_EVENT.toString());
            this.f30280b.add(str);
            a(this.f30280b, map);
        }
    }

    public void e(String str, Map<String, Object> map) {
        synchronized (f30278d) {
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        a(str, entry.getKey(), entry.getValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void f(boolean z10) {
        synchronized (f30278d) {
            this.container.put("we_instance_id_checked", Boolean.valueOf(z10));
        }
    }

    public void a(long j10) {
        synchronized (f30278d) {
            this.container.put("f_activity_start_ep", Long.valueOf(j10));
        }
    }

    protected void b(String str, Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (g4.a(key) != null) {
                    a(str, key, (Number) entry.getValue(), h0.USER);
                }
                if (c4.a(key)) {
                    a(str, key, (Number) entry.getValue(), h0.ANDROID);
                }
            }
        }
    }

    public void c(Map<String, Object> map) {
        synchronized (f30278d) {
            this.container.putAll(map);
        }
    }

    public void d(boolean z10) {
        synchronized (f30278d) {
            this.container.put("interface_id_checked", Boolean.valueOf(z10));
        }
    }

    public void e(boolean z10) {
        synchronized (f30278d) {
            this.container.put("useLegacyRuleCompiler", Boolean.valueOf(z10));
        }
    }

    public void a(b2 b2Var) {
        if (this.f30279a == null) {
            this.f30279a = new ArrayList();
        }
        this.f30279a.add(b2Var);
    }

    public void b(List<String> list) {
        synchronized (f30278d) {
            this.container.put("old_inline_qualified_campaigns", list);
        }
    }

    public void c(boolean z10) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) a("entity_is_running");
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
        }
        atomicBoolean.set(z10);
        b("entity_is_running", atomicBoolean);
    }

    private void b(List<Object> list, Object obj, String str, c2 c2Var) {
        int parseInt;
        synchronized (f30278d) {
            try {
                Object obj2 = this.container;
                boolean z10 = false;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Object obj3 = obj2 instanceof Map ? ((Map) obj2).get(list.get(i10).toString()) : (!(obj2 instanceof List) || (parseInt = Integer.parseInt(list.get(i10).toString())) >= ((List) obj2).size()) ? null : ((List) obj2).get(parseInt);
                    if (i10 != list.size() - 1) {
                        if (obj3 == null) {
                            int i11 = i10 + 1;
                            Cloneable hashMap = (i11 >= list.size() || !(list.get(i11) instanceof Number)) ? new HashMap() : new ArrayList();
                            if (obj2 instanceof Map) {
                                ((Map) obj2).put(list.get(i10).toString(), hashMap);
                            } else if (obj2 instanceof List) {
                                List list2 = (List) obj2;
                                int parseInt2 = Integer.parseInt(list.get(i10).toString());
                                if (list2.size() <= parseInt2) {
                                    for (int size = list2.size() + 1; size <= parseInt2 + 1; size++) {
                                        list2.add(null);
                                    }
                                }
                                list2.set(parseInt2, hashMap);
                            }
                        }
                        if (obj2 instanceof Map) {
                            obj2 = ((Map) obj2).get(list.get(i10).toString());
                        } else if (obj2 instanceof List) {
                            obj2 = ((List) obj2).get(Integer.parseInt(list.get(i10).toString()));
                        }
                    } else if (!c2.OPT_UPDATE.equals(c2Var) || obj3 == null) {
                        if (obj2 instanceof Map) {
                            ((Map) obj2).put(list.get(i10).toString(), obj);
                        } else if (obj2 instanceof List) {
                            List list3 = (List) obj2;
                            int parseInt3 = Integer.parseInt(list.get(i10).toString());
                            if (list3.size() <= parseInt3) {
                                for (int size2 = list3.size() + 1; size2 <= parseInt3 + 1; size2++) {
                                    list3.add(null);
                                }
                            }
                            list3.set(parseInt3, obj);
                        }
                        z10 = true;
                    }
                }
                if (z10) {
                    a(list, obj, str, c2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(String str, Number number, c2 c2Var) {
        long longValue;
        Long valueOf;
        synchronized (f30278d) {
            try {
                HashMap hashMap = (HashMap) this.container.get(h0.ANDROID.toString());
                if (c2Var != c2.INCREMENT) {
                    longValue = number.longValue();
                } else if (hashMap.containsKey(str)) {
                    valueOf = Long.valueOf(((Long) hashMap.get(str)).longValue() + number.longValue());
                    hashMap.put(str, valueOf);
                } else {
                    longValue = number.longValue();
                }
                valueOf = Long.valueOf(longValue);
                hashMap.put(str, valueOf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, Object obj) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(str);
            a(this.f30280b, obj);
        }
    }

    public void b(Map<String, Object> map) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.PAGE.toString());
            this.f30280b.add("system");
            a(this.f30280b, map);
        }
    }

    public void a(String str, String str2) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.ANDROID);
            this.f30280b.add("landing_page");
            b(this.f30280b, str2, str, c2.FORCE_UPDATE);
        }
    }

    public void b(boolean z10) {
        synchronized (f30278d) {
            this.container.put("boot_up", Boolean.valueOf(z10));
        }
    }

    public void a(String str, String str2, Number number, h0 h0Var) {
        Number number2;
        synchronized (f30278d) {
            try {
                this.f30280b.clear();
                this.f30280b.add(h0Var.toString());
                this.f30280b.add(str2);
                Number number3 = (Number) a(this.f30280b);
                if (number3 == null) {
                    number3 = 0;
                }
                Number valueOf = Double.valueOf(number3.doubleValue() + number.doubleValue());
                try {
                    number2 = (Number) DataType.convert(valueOf, DataType.detect(number), false);
                } catch (Exception unused) {
                }
                try {
                    b(this.f30280b, number2, str, c2.INCREMENT);
                } catch (Exception unused2) {
                    valueOf = number2;
                    b(this.f30280b, valueOf, str, c2.INCREMENT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2, Object obj) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.STATIC_LIST.toString());
            this.f30280b.add(str2);
            b(this.f30280b, obj, str, c2.FORCE_UPDATE);
        }
    }

    public void a(String str, String str2, Object obj, h0 h0Var) {
        synchronized (f30278d) {
            a(str, str2, obj, h0Var, c2.FORCE_UPDATE);
        }
    }

    protected void a(String str, String str2, Object obj, h0 h0Var, c2 c2Var) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0Var.toString());
            this.f30280b.add(str2);
            b(this.f30280b, obj, str, c2Var);
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        synchronized (f30278d) {
            a(str, str2, map, h0.EVENT_CRITERIA);
        }
    }

    protected void a(String str, Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                a(str, entry.getKey(), (Number) entry.getValue(), h0.ATTR);
            }
        }
    }

    public void a(List<Object> list, Object obj) {
        b(list, obj, null, c2.FORCE_UPDATE);
    }

    private void a(List<Object> list, Object obj, String str, c2 c2Var) {
        List<b2> list2 = this.f30279a;
        if (list2 != null) {
            Iterator<b2> it = list2.iterator();
            while (it.hasNext()) {
                it.next().a(list, obj, str, c2Var);
            }
        }
    }

    protected void a(Map<String, Object> map) {
        synchronized (f30278d) {
            this.f30280b.clear();
            this.f30280b.add(h0.PAGE.toString());
            this.f30280b.add("custom");
            a(this.f30280b, map);
        }
    }

    public void a(boolean z10) {
        synchronized (f30278d) {
            this.container.put("app_foreground", Boolean.valueOf(z10));
        }
    }

    public boolean a(boolean z10, boolean z11) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) a("entity_is_running");
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
        }
        boolean compareAndSet = atomicBoolean.compareAndSet(z10, z11);
        b("entity_is_running", atomicBoolean);
        return compareAndSet;
    }
}
