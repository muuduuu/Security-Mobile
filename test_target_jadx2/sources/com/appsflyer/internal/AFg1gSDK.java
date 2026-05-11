package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFg1dSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1gSDK {
    private final LinkedHashMap<String, Object> getMediationNetwork;
    public static final Object getRevenue = new Object() { // from class: com.appsflyer.internal.AFg1gSDK.4
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double getCurrencyIso4217Code = Double.valueOf(-0.0d);

    public AFg1gSDK() {
        this.getMediationNetwork = new LinkedHashMap<>();
    }

    static String getCurrencyIso4217Code(Number number) {
        if (number == null) {
            throw new AFg1mSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Map map = AFa1hSDK.f20116d;
            Object obj = map.get(-1740817925);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue(287 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 36 - (Process.myPid() >> 22))).getDeclaredMethod("AFAdRevenueData", Double.TYPE);
                map.put(-1740817925, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).doubleValue();
            if (number.equals(getCurrencyIso4217Code)) {
                return "-0";
            }
            long longValue = number.longValue();
            return doubleValue == ((double) longValue) ? Long.toString(longValue) : number.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMediationNetwork(Object obj) {
        if (obj == null) {
            return getRevenue;
        }
        if (((Class) AFa1hSDK.getRevenue(View.combineMeasuredStates(0, 0) + 323, (char) (31688 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 36 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0))).isInstance(obj) || (obj instanceof AFg1gSDK)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Map map = AFa1hSDK.f20116d;
                Object obj2 = map.get(1701394550);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1hSDK.getRevenue(322 - ExpandableListView.getPackedPositionChild(0L), (char) (31686 - ExpandableListView.getPackedPositionChild(0L)), 35 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0))).getDeclaredConstructor(String.class);
                    map.put(1701394550, obj2);
                }
                obj = ((Constructor) obj2).newInstance(objArr);
                return obj;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof JSONObject) {
            return new AFg1gSDK(obj.toString());
        }
        if (obj.equals(getRevenue)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Map map2 = AFa1hSDK.f20116d;
                Object obj3 = map2.get(1736765615);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1hSDK.getRevenue(323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (31686 - ImageFormat.getBitsPerPixel(0)), 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getDeclaredConstructor(Collection.class);
                    map2.put(1736765615, obj3);
                }
                return ((Constructor) obj3).newInstance(objArr2);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (obj.getClass().isArray()) {
            try {
                Object[] objArr3 = {obj};
                Map map3 = AFa1hSDK.f20116d;
                Object obj4 = map3.get(-3119068);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getJumpTapTimeout() >> 16) + 323, (char) ((-16745529) - Color.rgb(0, 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36)).getDeclaredConstructor(Object.class);
                    map3.put(-3119068, obj4);
                }
                return ((Constructor) obj4).newInstance(objArr3);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        if (obj instanceof Map) {
            return new AFg1gSDK((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
        return null;
    }

    public final AFg1gSDK getMonetizationNetwork(String str, Object obj) {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1hSDK.f20116d;
                Object obj2 = map.get(-1740817925);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getScrollDefaultDelay() >> 16) + 287, (char) View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionGroup(0L) + 36)).getMethod("AFAdRevenueData", Double.TYPE);
                    map.put(-1740817925, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).doubleValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMediationNetwork;
        if (str == null) {
            throw new AFg1mSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public final String toString() {
        try {
            AFg1dSDK aFg1dSDK = new AFg1dSDK();
            getCurrencyIso4217Code(aFg1dSDK);
            return aFg1dSDK.toString();
        } catch (AFg1mSDK unused) {
            return null;
        }
    }

    public AFg1gSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.getMediationNetwork.put(str, getMediationNetwork(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    private AFg1gSDK(Object obj) {
        try {
            Map map = AFa1hSDK.f20116d;
            Object obj2 = map.get(1233250772);
            if (obj2 == null) {
                obj2 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 359, (char) (17849 - (ViewConfiguration.getScrollBarSize() >> 8)), Color.argb(0, 0, 0, 0) + 36)).getDeclaredMethod("AFAdRevenueData", null);
                map.put(1233250772, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFg1gSDK) {
                this.getMediationNetwork = ((AFg1gSDK) invoke).getMediationNetwork;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = map.get(-508700964);
            if (obj3 == null) {
                obj3 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 287, (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), 36 - ExpandableListView.getPackedPositionType(0L))).getDeclaredMethod("getMonetizationNetwork", Object.class, String.class);
                map.put(-508700964, obj3);
            }
            throw ((Throwable) ((Method) obj3).invoke(null, objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    final void getCurrencyIso4217Code(AFg1dSDK aFg1dSDK) {
        aFg1dSDK.getMediationNetwork(AFg1dSDK.AFa1zSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMediationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                aFg1dSDK.getMonetizationNetwork();
                aFg1dSDK.AFAdRevenueData(key);
                aFg1dSDK.getCurrencyIso4217Code(entry.getValue());
            } else {
                throw new AFg1mSDK("Names must be non-null");
            }
        }
        aFg1dSDK.getMonetizationNetwork(AFg1dSDK.AFa1zSDK.EMPTY_OBJECT, AFg1dSDK.AFa1zSDK.NONEMPTY_OBJECT, "}");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFg1gSDK(String str) {
        this(((Constructor) r2).newInstance(r6));
        try {
            Object[] objArr = {str};
            Map map = AFa1hSDK.f20116d;
            Object obj = map.get(-1433104906);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue(359 - View.resolveSizeAndState(0, 0, 0), (char) (17849 - Color.green(0)), 36 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredConstructor(String.class);
                map.put(-1433104906, obj);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
