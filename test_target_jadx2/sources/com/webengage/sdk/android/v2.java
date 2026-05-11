package com.webengage.sdk.android;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.rules.RuleExecutor;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
class v2 extends RuleExecutor {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f31046e = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, t2> f31049c;

    /* renamed from: a, reason: collision with root package name */
    private List<String> f31047a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<com.webengage.sdk.android.actions.rules.b>> f31050d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private List<String> f31048b = new ArrayList();

    class a extends y0 {
        a(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list.size() == 0 || list.size() == 0) {
                return null;
            }
            return WebEngageUtils.a(list.get(0).toString());
        }
    }

    class b extends y0 {
        b(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(list.get(0) != null);
        }
    }

    class c extends y0 {
        c(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list.size() <= 1) {
                return null;
            }
            return list.get(0) == null ? list.get(1) : list.get(0);
        }
    }

    class d extends y0 {
        d(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(h0.EVENT_CRITERIA.toString());
            arrayList.add(list.get(0));
            arrayList.add("val");
            return u2.b().getFunction("$we_getData").a(arrayList);
        }
    }

    class e extends y0 {
        e(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Number number = (Number) list.get(0);
            Map map = (Map) list.get(1);
            if (map != null) {
                Number number2 = (Number) map.get("val");
                if (number2 == null) {
                    map.put("val", number);
                    return map;
                }
                number = Double.valueOf(number2.doubleValue() + number.doubleValue());
            } else {
                map = new HashMap();
            }
            map.put("val", number);
            return map;
        }
    }

    class f extends y0 {
        f(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            long j10;
            if (list == null || list.size() == 0) {
                return null;
            }
            Number number = (Number) list.get(0);
            Map map = (Map) list.get(1);
            if (map != null) {
                Number number2 = (Number) map.get("val");
                Number number3 = (Number) map.get("count");
                if (number2 != null && number3 != null) {
                    map.put("val", Double.valueOf(((number2.doubleValue() * number3.longValue()) + number.doubleValue()) / (number3.longValue() + 1)));
                    j10 = Long.valueOf(number3.longValue() + 1);
                    map.put("count", j10);
                    return map;
                }
            } else {
                map = new HashMap();
            }
            map.put("val", number);
            j10 = 1L;
            map.put("count", j10);
            return map;
        }
    }

    class g extends y0 {
        g(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            long j10;
            if (list == null || list.size() == 0) {
                return null;
            }
            Map map = (Map) list.get(1);
            if (map != null) {
                Number number = (Number) map.get("val");
                if (number != null) {
                    j10 = Long.valueOf(number.longValue() + 1);
                    map.put("val", j10);
                    return map;
                }
            } else {
                map = new HashMap();
            }
            j10 = 1L;
            map.put("val", j10);
            return map;
        }
    }

    class h extends y0 {
        h(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Object obj = list.get(0);
            Map map = (Map) list.get(1);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("val", obj);
                return hashMap;
            }
            if (obj instanceof Date) {
                Object obj2 = map.get("val");
                if (!(obj2 instanceof Date)) {
                    try {
                        obj2 = DataType.convert(obj2, DataType.DATE, true);
                    } catch (Exception unused) {
                        map.put("val", obj);
                        return map;
                    }
                }
                if (((Date) obj).getTime() < ((Date) obj2).getTime()) {
                    map.put("val", obj);
                }
                return map;
            }
            if (!(obj instanceof Number)) {
                return null;
            }
            Number number = (Number) map.get("val");
            if (number == null) {
                map.put("val", obj);
                return map;
            }
            if (((Number) obj).doubleValue() < number.doubleValue()) {
                map.put("val", obj);
            }
            return map;
        }
    }

    class i extends y0 {
        i(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Object obj = list.get(0);
            Map map = (Map) list.get(1);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("val", obj);
                return hashMap;
            }
            if (obj instanceof Date) {
                Object obj2 = map.get("val");
                if (!(obj2 instanceof Date)) {
                    try {
                        obj2 = DataType.convert(obj2, DataType.DATE, true);
                    } catch (Exception unused) {
                        map.put("val", obj);
                        return map;
                    }
                }
                if (((Date) obj).getTime() > ((Date) obj2).getTime()) {
                    map.put("val", obj);
                }
                return map;
            }
            if (!(obj instanceof Number)) {
                return null;
            }
            Number number = (Number) map.get("val");
            if (number == null) {
                map.put("val", obj);
                return map;
            }
            if (((Number) obj).doubleValue() > number.doubleValue()) {
                map.put("val", obj);
            }
            return map;
        }
    }

    class j extends y0 {
        j(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list != null && list.size() != 0) {
                try {
                    return Long.valueOf(((Date) DataType.convert(list.get(0), DataType.DATE, false)).getTime());
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    class k extends d2 {
        k(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            boolean z10 = obj2 instanceof List;
            if (z10 && (obj instanceof List)) {
                ((List) obj).addAll((List) obj2);
                return obj;
            }
            if (z10) {
                ((List) obj2).add(0, obj);
                return obj2;
            }
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            return arrayList;
        }
    }

    class l extends y0 {
        l(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list.size() == 0 || list.size() < 2) {
                return null;
            }
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(((Integer) list.get(0)).intValue(), TimeUnit.valueOf(((String) list.get(1)).toUpperCase())));
        }
    }

    class m extends y0 {
        m(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            return Long.valueOf(new Date().getTime());
        }
    }

    class n extends y0 {
        n(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            return list.size() < 2 ? Boolean.FALSE : u2.b().getOperator("==").a(list.get(0), list.get(1));
        }
    }

    class o extends y0 {
        o(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            Date a10;
            if (list == null || list.size() < 2 || list.get(0) == null || list.get(1) == null || (a10 = new r2(((Long) list.get(0)).longValue(), (String) list.get(1)).a()) == null) {
                return null;
            }
            return Long.valueOf(a10.getTime());
        }
    }

    class p extends y0 {
        p(String str) {
            super(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x02c2  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x02cb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x02cc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
        @Override // com.webengage.sdk.android.y0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(List<Object> list) {
            String str;
            Object obj;
            HashMap hashMap;
            Map map;
            Map map2;
            HashMap hashMap2;
            Object obj2;
            if (list != null && list.size() != 0 && list.get(0) != null && (str = (String) list.get(0)) != null) {
                if ("user".equals(str)) {
                    if (list.size() <= 1) {
                        HashMap hashMap3 = new HashMap();
                        Map map3 = (Map) DataHolder.get().a(h0.USER.toString());
                        Map map4 = (Map) DataHolder.get().a(h0.ATTR.toString());
                        if ((map3 == null || map3.isEmpty()) && (map4 == null || map4.isEmpty())) {
                            return null;
                        }
                        if (map3 != null && !map3.isEmpty()) {
                            hashMap3.put("system", map3);
                        }
                        if (map4 != null && !map4.isEmpty()) {
                            hashMap3.put("custom", map4);
                        }
                        return hashMap3;
                    }
                    String str2 = (String) list.get(1);
                    if ("system".equals(str2)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(h0.USER.toString());
                        if (list.size() > 2) {
                            arrayList.addAll(list.subList(2, list.size()));
                            return DataHolder.get().a(arrayList);
                        }
                        Map map5 = (Map) DataHolder.get().a(arrayList);
                        if (map5 != null && map5.size() > 0) {
                            return map5;
                        }
                    } else if ("custom".equals(str2)) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(h0.ATTR.toString());
                        if (list.size() > 2) {
                            arrayList2.addAll(list.subList(2, list.size()));
                            return DataHolder.get().a(arrayList2);
                        }
                        Map map6 = (Map) DataHolder.get().a(arrayList2);
                        if (map6 != null && map6.size() > 0) {
                            return map6;
                        }
                    }
                } else {
                    if ("screen".equals(str)) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(h0.PAGE.toString());
                        if (list.size() > 1) {
                            arrayList3.addAll(list.subList(1, list.size()));
                        }
                        return DataHolder.get().a(arrayList3);
                    }
                    if (!Keys.EVENT.equals(str) || list.size() <= 2) {
                        return null;
                    }
                    if (list.size() > 3) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(h0.LATEST_EVENT.toString());
                        if ("system".equals(list.get(1))) {
                            obj2 = "we_" + list.get(2);
                        } else {
                            if ("custom".equals(list.get(1))) {
                                obj2 = list.get(2);
                            }
                            if ("system".equals(list.get(3))) {
                                arrayList4.add("we_wk_sys");
                            }
                            if (list.size() <= 4) {
                                arrayList4.addAll(list.subList(4, list.size()));
                                return DataHolder.get().a(arrayList4);
                            }
                            if ("system".equals(list.get(3))) {
                                Map map7 = (Map) DataHolder.get().a(arrayList4);
                                if (map7 == null || map7.isEmpty()) {
                                    return null;
                                }
                                return map7;
                            }
                            if ("custom".equals(list.get(3))) {
                                Map map8 = (Map) DataHolder.get().a(arrayList4);
                                HashMap hashMap4 = new HashMap();
                                if (map8 == null) {
                                    return null;
                                }
                                for (Map.Entry entry : map8.entrySet()) {
                                    if (!"we_wk_sys".equals(entry.getKey())) {
                                        hashMap4.put((String) entry.getKey(), entry.getValue());
                                    }
                                }
                                if (hashMap4.isEmpty()) {
                                    return null;
                                }
                                return hashMap4;
                            }
                        }
                        arrayList4.add(obj2);
                        if ("system".equals(list.get(3))) {
                        }
                        if (list.size() <= 4) {
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(h0.LATEST_EVENT.toString());
                        if ("system".equals(list.get(1))) {
                            obj = "we_" + list.get(2);
                        } else {
                            if ("custom".equals(list.get(1))) {
                                obj = list.get(2);
                            }
                            hashMap = new HashMap();
                            map = (Map) DataHolder.get().a(arrayList5);
                            if (map != null && !map.isEmpty()) {
                                map2 = (Map) map.get("we_wk_sys");
                                if (map2 != null && !map2.isEmpty()) {
                                    hashMap.put("system", map2);
                                }
                                hashMap2 = new HashMap();
                                for (Map.Entry entry2 : map.entrySet()) {
                                    if (!"we_wk_sys".equals(entry2.getKey())) {
                                        hashMap2.put((String) entry2.getKey(), entry2.getValue());
                                    }
                                }
                                if (!hashMap2.isEmpty()) {
                                    hashMap.put("custom", hashMap2);
                                }
                                if (hashMap.isEmpty()) {
                                    return hashMap;
                                }
                                return null;
                            }
                        }
                        arrayList5.add(obj);
                        hashMap = new HashMap();
                        map = (Map) DataHolder.get().a(arrayList5);
                        if (map != null) {
                            map2 = (Map) map.get("we_wk_sys");
                            if (map2 != null) {
                                hashMap.put("system", map2);
                            }
                            hashMap2 = new HashMap();
                            while (r1.hasNext()) {
                            }
                            if (!hashMap2.isEmpty()) {
                            }
                            if (hashMap.isEmpty()) {
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    static /* synthetic */ class q {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31067a;

        static {
            int[] iArr = new int[WebEngageConstant.d.values().length];
            f31067a = iArr;
            try {
                iArr[WebEngageConstant.d.SESSION_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31067a[WebEngageConstant.d.PAGE_RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31067a[WebEngageConstant.d.EVENT_RULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31067a[WebEngageConstant.d.CUSTOM_RULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class r extends d2 {
        r(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof List)) {
                List list = (List) obj2;
                if (list.size() < 2) {
                    return Boolean.FALSE;
                }
                double doubleValue = ((Number) obj).doubleValue();
                boolean z10 = false;
                if (list.get(0) == null || list.get(1) == null) {
                    return Boolean.FALSE;
                }
                double doubleValue2 = ((Number) list.get(0)).doubleValue();
                double doubleValue3 = ((Number) list.get(1)).doubleValue();
                if (doubleValue >= doubleValue2 && doubleValue <= doubleValue3) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return Boolean.FALSE;
        }
    }

    class s extends d2 {
        s(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return Boolean.FALSE;
            }
            if (!(obj2 instanceof List)) {
                return u2.b().getOperator("==").a(obj, obj2);
            }
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                if (((Boolean) u2.b().getOperator("$we_in").a(obj, it.next())).booleanValue()) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
    }

    class t extends d2 {
        t(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            return Boolean.valueOf(!((Boolean) u2.b().getOperator("$we_in").a(obj, obj2)).booleanValue());
        }
    }

    class u extends d2 {
        u(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if (!(obj instanceof List)) {
                return obj2 instanceof List ? Boolean.FALSE : u2.b().getOperator("==").a(obj, obj2);
            }
            if (!(obj2 instanceof List)) {
                return u2.b().getOperator("$we_in").a(obj2, obj);
            }
            Iterator it = ((List) obj2).iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                if (!it.hasNext()) {
                    z10 = z11;
                    break;
                }
                if (!((Boolean) u2.b().getOperator("$we_contains_all").a(obj, it.next())).booleanValue()) {
                    break;
                }
                z11 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    class v extends d2 {
        v(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            boolean z10 = true;
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    return u2.b().getOperator("$we_in").a(obj2, obj);
                }
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (((Boolean) u2.b().getOperator("$we_contains_any").a(obj, it.next())).booleanValue()) {
                        break;
                    }
                }
                return Boolean.valueOf(z10);
            }
            if (!(obj2 instanceof List)) {
                return u2.b().getOperator("==").a(obj, obj2);
            }
            Iterator it2 = ((List) obj2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((Boolean) u2.b().getOperator("$we_contains_any").a(obj, it2.next())).booleanValue()) {
                    break;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    class w extends d2 {
        w(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            return Boolean.valueOf(!((Boolean) u2.b().getOperator("$we_contains_any").a(obj, obj2)).booleanValue());
        }
    }

    class x extends y0 {
        x(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            if (list.size() <= 1) {
                return Boolean.FALSE;
            }
            if (list.get(0) != null) {
                String obj = list.get(0).toString();
                if (list.get(1) instanceof List) {
                    for (Object obj2 : (List) list.get(1)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(obj);
                        arrayList.add(obj2);
                        if (((Boolean) u2.b().getFunction("$we_matches").a(arrayList)).booleanValue()) {
                            return Boolean.TRUE;
                        }
                    }
                } else if (list.get(1) != null) {
                    return Boolean.valueOf(Pattern.compile(list.get(1).toString()).matcher(obj).find());
                }
            }
            return Boolean.FALSE;
        }
    }

    class y extends y0 {
        y(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            Object a10 = DataHolder.get().a((List<? extends Object>) list);
            return (a10 == null || !(a10 instanceof Date)) ? a10 : Long.valueOf(((Date) a10).getTime());
        }
    }

    v2() {
        this.f31049c = null;
        this.f31049c = new LinkedHashMap();
        a();
    }

    private void a() {
        l0.a().a(new k("->", -2147483647));
        l0.a().a(new r("$we_between", 100));
        l0.a().a(new s("$we_in", 100));
        l0.a().a(new t("$we_nin", 100));
        l0.a().a(new u("$we_contains_all", 100));
        l0.a().a(new v("$we_contains_any", 100));
        l0.a().a(new w("$we_exclude_all", 100));
        l0.a().a(new x("$we_matches"));
        l0.a().a(new y("$we_getData"));
        l0.a().a(new a("$we_escapeRegex"));
        l0.a().a(new b("$we_exists"));
        l0.a().a(new c("$we_default"));
        l0.a().a(new d("$we_event_criteria"));
        l0.a().a(new e("SUM"));
        l0.a().a(new f("AVG"));
        l0.a().a(new g("COUNT"));
        l0.a().a(new h("MIN"));
        l0.a().a(new i("MAX"));
        l0.a().a(new j("$we_date"));
        l0.a().a(new l("$we_ms"));
        l0.a().a(new m("$we_now"));
        l0.a().a(new n("$we_boolean"));
        l0.a().a(new o("$we_ref_date"));
        l0.a().a(new p("$we_getResolvedData"));
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public Object evaluateInfixRule(String str) {
        try {
            return new s0(str).a();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public Object evaluatePostfixRule(List<String> list) {
        try {
            return new s0(list).a();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public boolean evaluateRule(t2 t2Var, WebEngageConstant.d dVar) {
        Boolean bool = Boolean.FALSE;
        try {
            if (q.f31067a[dVar.ordinal()] == 4) {
                bool = (Boolean) t2Var.a().a();
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Exception while evaluating rule for custom rule category", e10);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    protected List<String> evaluateRulesByCategory(WebEngageConstant.d dVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (f31046e) {
            try {
                for (String str : this.f31047a) {
                    if (evaluateRule(str, dVar)) {
                        arrayList.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    protected List<String> filterRenderingIds(List<String> list, WebEngageConstant.d dVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            synchronized (f31046e) {
                try {
                    for (String str : list) {
                        if (this.f31049c.get(str).c().compareTo(dVar) <= 0) {
                            arrayList.add(str);
                        }
                    }
                } finally {
                }
            }
        }
        return arrayList;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public List<String> getEvaluationIds() {
        return this.f31048b;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    protected List<com.webengage.sdk.android.actions.rules.b> getEventCriteriasForEvent(String str) {
        List<com.webengage.sdk.android.actions.rules.b> list;
        synchronized (f31046e) {
            list = this.f31050d.get(str);
        }
        return list;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public y0 getFunction(String str) {
        return l0.a().a(str);
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public d2 getOperator(String str) {
        return l0.a().b(str);
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    protected void reset() {
        synchronized (f31046e) {
            try {
                this.f31047a.clear();
                if (this.f31049c != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.f31049c.keySet());
                    this.f31047a.addAll(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public void setCompetingIds(List<String> list) {
        synchronized (f31046e) {
            try {
                this.f31047a.clear();
                if (list != null) {
                    this.f31047a.addAll(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public void setEvaluationIds(List<String> list) {
        synchronized (f31046e) {
            this.f31048b.clear();
            this.f31048b.addAll(list);
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    protected void setEventCriteriaMap(Map<String, List<com.webengage.sdk.android.actions.rules.b>> map) {
        synchronized (f31046e) {
            try {
                this.f31050d.clear();
                if (map != null) {
                    this.f31050d.putAll(map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    protected void setRuleMap(Map<String, t2> map) {
        synchronized (f31046e) {
            try {
                this.f31049c.clear();
                this.f31047a.clear();
                this.f31048b.clear();
                if (map != null) {
                    this.f31049c.putAll(map);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(map.keySet());
                    this.f31047a.addAll(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[RETURN] */
    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean evaluateRule(String str, WebEngageConstant.d dVar) {
        int i10;
        Object a10;
        Boolean bool = Boolean.FALSE;
        try {
            i10 = q.f31067a[dVar.ordinal()];
        } catch (Exception e10) {
            Logger.e("WebEngage", "Exception while evaluating rule for experiment by category", e10);
        }
        if (i10 == 1) {
            a10 = this.f31049c.get(str).e().a();
        } else if (i10 == 2) {
            a10 = this.f31049c.get(str).d().a();
        } else {
            if (i10 != 3) {
                if (bool == null) {
                    return bool.booleanValue();
                }
                return false;
            }
            a10 = this.f31049c.get(str).b().a();
        }
        bool = (Boolean) a10;
        if (bool == null) {
        }
    }
}
