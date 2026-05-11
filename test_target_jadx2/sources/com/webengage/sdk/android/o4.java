package com.webengage.sdk.android;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class o4 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile o4 f30744f;

    /* renamed from: a, reason: collision with root package name */
    private final String f30745a = o4.class.getCanonicalName();

    /* renamed from: b, reason: collision with root package name */
    private Long f30746b;

    /* renamed from: c, reason: collision with root package name */
    private long f30747c;

    /* renamed from: d, reason: collision with root package name */
    private Long f30748d;

    /* renamed from: e, reason: collision with root package name */
    private long f30749e;

    public static synchronized o4 b() {
        o4 o4Var;
        synchronized (o4.class) {
            try {
                if (f30744f == null) {
                    synchronized (o4.class) {
                        try {
                            if (f30744f == null) {
                                f30744f = new o4();
                            }
                        } finally {
                        }
                    }
                }
                o4Var = f30744f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o4Var;
    }

    public void a() {
        Map<String, Object> n10 = DataHolder.get().n();
        Map<String, Object> m10 = DataHolder.get().m();
        if (m10 != null) {
            Iterator<Map.Entry<String, Object>> it = m10.entrySet().iterator();
            while (it.hasNext()) {
                Map<String, Object> map = (Map) it.next().getValue();
                if (map.get("lc") != null) {
                    a(map, WebEngageConstant.a.NOTIFICATION);
                }
            }
        }
        if (n10 != null) {
            Iterator<Map.Entry<String, Object>> it2 = n10.entrySet().iterator();
            while (it2.hasNext()) {
                Map<String, Object> map2 = (Map) it2.next().getValue();
                if (map2.get("lc") != null) {
                    a(map2, WebEngageConstant.a.INLINE_PERSONALIZATION);
                }
            }
        }
    }

    private void a(String str, String str2) {
        String str3 = str2 + "_last_recur_reset";
        if (DataHolder.get().f(str3).longValue() == 0) {
            DataHolder.get().a(str, str3, (Object) Long.valueOf(System.currentTimeMillis()), h0.SCOPES);
        }
    }

    public void a(HashMap<String, Object> hashMap) {
        HashMap hashMap2;
        HashMap hashMap3;
        if (hashMap != null) {
            if (hashMap.get("ina") != null && (hashMap3 = (HashMap) hashMap.get("ina")) != null) {
                if (hashMap3.get("vps") != null) {
                    this.f30746b = (Long) hashMap3.get("vps");
                }
                if (hashMap3.get("tg") != null) {
                    this.f30747c = ((Long) hashMap3.get("tg")).longValue();
                }
            }
            if (hashMap.get("inl") == null || (hashMap2 = (HashMap) hashMap.get("inl")) == null) {
                return;
            }
            if (hashMap2.get("vps") != null) {
                this.f30748d = (Long) hashMap2.get("vps");
            }
            if (hashMap2.get("tg") != null) {
                this.f30749e = ((Long) hashMap2.get("tg")).longValue();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(Map<String, Object> map, WebEngageConstant.a aVar) {
        char c10;
        String str = (String) map.get("notificationEncId");
        Long d10 = DataHolder.get().d(map, aVar);
        String str2 = str + "_recur_count";
        String str3 = str + "_last_recur_reset";
        C2961i a10 = WebEngage.get().analytics().a();
        String h10 = a10.d().isEmpty() ? a10.h() : a10.d();
        long longValue = map.get("startTimestamp") == null ? Long.MIN_VALUE : ((Long) map.get("startTimestamp")).longValue();
        if (d10.longValue() <= 0) {
            DataHolder.get().a(h10, str3, (Object) Long.valueOf(System.currentTimeMillis()), h0.SCOPES);
            return;
        }
        Long f10 = DataHolder.get().f(str3);
        Calendar calendar = Calendar.getInstance();
        if (f10.longValue() != 0) {
            longValue = f10.longValue();
        }
        calendar.setTimeInMillis(longValue);
        String str4 = (String) WebEngageUtils.b((String) map.get("lc")).first;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setFirstDayOfWeek(2);
        calendar.setFirstDayOfWeek(2);
        String upperCase = str4.toUpperCase();
        upperCase.hashCode();
        switch (upperCase.hashCode()) {
            case 68:
                if (upperCase.equals("D")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 72:
                if (upperCase.equals("H")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 77:
                if (upperCase.equals("M")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case AppConstants.REQUEST_CODE /* 87 */:
                if (upperCase.equals("W")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 89:
                if (upperCase.equals("Y")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 76338:
                if (upperCase.equals("MIN")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                if (calendar2.get(1) - calendar.get(1) <= 0 && Math.abs(calendar2.get(2) - calendar.get(2)) <= 0 && Math.abs(calendar2.get(5) - calendar.get(5)) <= 0) {
                    return;
                }
                break;
            case 1:
                if (calendar2.get(1) - calendar.get(1) <= 0 && Math.abs(calendar2.get(2) - calendar.get(2)) <= 0 && Math.abs(calendar2.get(5) - calendar.get(5)) <= 0 && calendar2.get(10) - calendar.get(10) <= 0) {
                    return;
                }
                break;
            case 2:
                if (calendar2.get(1) - calendar.get(1) <= 0 && Math.abs(calendar2.get(2) - calendar.get(2)) <= 0) {
                    return;
                }
                break;
            case 3:
                if (calendar2.get(1) - calendar.get(1) <= 0 && Math.abs(calendar2.get(2) - calendar.get(2)) <= 0 && Math.abs(calendar2.get(4) - calendar.get(4)) <= 0) {
                    return;
                }
                break;
            case 4:
                if (calendar2.get(1) - calendar.get(1) <= 0) {
                    return;
                }
                break;
            case 5:
                if (calendar2.get(1) - calendar.get(1) <= 0 && Math.abs(calendar2.get(2) - calendar.get(2)) <= 0 && Math.abs(calendar2.get(5) - calendar.get(5)) <= 0 && calendar2.get(10) - calendar.get(10) <= 0 && calendar2.get(12) - calendar.get(12) <= 0) {
                    return;
                }
                break;
            default:
                return;
        }
        String e10 = DataHolder.get().e(map, aVar);
        h0 h0Var = h0.SCOPES;
        DataHolder.get().a(h10, e10 + "_click", (Object) 0L, h0Var);
        DataHolder.get().a(h10, e10 + "_view", (Object) 0L, h0Var);
        DataHolder.get().a(h10, str3, (Object) Long.valueOf(System.currentTimeMillis()), h0Var);
        DataHolder.get().a(h10, str2, (Number) 1L, h0Var);
    }

    public boolean a(WebEngageConstant.a aVar, Map<String, Object> map, Map<String, Object> map2) {
        boolean z10;
        boolean z11;
        StringBuilder sb2;
        String str;
        String str2 = (String) map.get("notificationEncId");
        Long l10 = (Long) map.get("maxTimesPerUser");
        Long d10 = DataHolder.get().d(map, aVar);
        Long a10 = DataHolder.get().a(map, aVar);
        Long b10 = DataHolder.get().b(map, aVar);
        Long c10 = DataHolder.get().c(map, aVar);
        String str3 = "_view_session";
        String str4 = "_last_view_time_update";
        if (WebEngageConstant.a.INLINE_PERSONALIZATION.equals(aVar)) {
            str3 = "in_line_view_session";
            str4 = "in_line_last_view_time_update";
            z10 = true;
        } else {
            if (WebEngageConstant.a.NOTIFICATION.equals(aVar)) {
                str3 = "in_app_view_session";
                str4 = "in_app_last_view_time_update";
            }
            z10 = false;
        }
        Long g10 = DataHolder.get().g(str3);
        Long f10 = DataHolder.get().f(str4);
        if (((Boolean) (map.get("fc") != null ? map.get("fc") : Boolean.FALSE)).booleanValue()) {
            z11 = a(z10, g10, f10, str2);
            if (!z11) {
                return false;
            }
        } else {
            z11 = true;
        }
        if (l10 != null) {
            z11 = z11 && d10.longValue() < l10.longValue();
            if (!z11) {
                sb2 = new StringBuilder();
                sb2.append(this.f30745a);
                str = " MaxTimesPerUser condition reached ";
                sb2.append(str);
                sb2.append(str2);
                Logger.d("WebEngage", sb2.toString());
                return false;
            }
        }
        if (!z10) {
            z11 = z11 && a10.longValue() < 1 && b10.longValue() < 1 && c10.longValue() < 1;
        }
        if (!z11) {
            sb2 = new StringBuilder();
            sb2.append(this.f30745a);
            str = " Total click or hide or close already happen, hence returning false ";
            sb2.append(str);
            sb2.append(str2);
            Logger.d("WebEngage", sb2.toString());
            return false;
        }
        if (map.get("lc") != null) {
            C2961i a11 = WebEngage.get().analytics().a();
            a(a11.d().isEmpty() ? a11.h() : a11.d(), str2);
            Long f11 = DataHolder.get().f(str2 + "_recur_count");
            long longValue = ((Long) WebEngageUtils.b((String) map.get("lc")).second).longValue();
            z11 = f11.longValue() < longValue;
            if (!z11) {
                sb2 = new StringBuilder();
                sb2.append(this.f30745a);
                sb2.append(" Recur condition failed for ");
                sb2.append(str2);
                sb2.append("Already recurred:");
                sb2.append(f11);
                sb2.append(" freq: ");
                sb2.append(longValue);
                Logger.d("WebEngage", sb2.toString());
                return false;
            }
        }
        if (map2 != null) {
            List list = (List) map2.get("targetActivities");
            boolean booleanValue = map.containsKey("skipTargetPage") ? Boolean.valueOf(map.get("skipTargetPage").toString()).booleanValue() : false;
            if (list != null && !list.isEmpty() && booleanValue) {
                z11 = z11 && !list.contains(DataHolder.get().A());
            }
        }
        long longValue2 = map.get("startTimestamp") == null ? Long.MIN_VALUE : ((Long) map.get("startTimestamp")).longValue();
        long longValue3 = map.get("endTimestamp") == null ? Long.MAX_VALUE : ((Long) map.get("endTimestamp")).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return z11 && currentTimeMillis >= longValue2 && currentTimeMillis <= longValue3;
    }

    private boolean a(boolean z10, Long l10, Long l11, String str) {
        long currentTimeMillis = System.currentTimeMillis() - l11.longValue();
        long longValue = l11.longValue();
        if (z10) {
            boolean z11 = longValue <= 0 || currentTimeMillis >= this.f30749e;
            return this.f30748d != null ? z11 && l10.longValue() < this.f30748d.longValue() : z11;
        }
        boolean z12 = longValue <= 0 || currentTimeMillis >= this.f30747c;
        return this.f30746b != null ? z12 && l10.longValue() < this.f30746b.longValue() : z12;
    }
}
