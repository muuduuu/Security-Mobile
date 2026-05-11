package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFg1dSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1zSDK> getMonetizationNetwork = new ArrayList();
    private final String AFAdRevenueData = null;

    enum AFa1zSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    final void AFAdRevenueData(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\f') {
                this.getMediationNetwork.append("\\f");
            } else if (charAt == '\r') {
                this.getMediationNetwork.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        this.getMediationNetwork.append("\\b");
                        break;
                    case '\t':
                        this.getMediationNetwork.append("\\t");
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        this.getMediationNetwork.append("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            this.getMediationNetwork.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb2 = this.getMediationNetwork;
                sb2.append('\\');
                sb2.append(charAt);
            }
        }
        this.getMediationNetwork.append("\"");
    }

    public final AFg1dSDK getCurrencyIso4217Code(Object obj) {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        if (!((Class) AFa1hSDK.getRevenue(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 324, (char) (Drawable.resolveOpacity(0, 0) + 31687), (ViewConfiguration.getTouchSlop() >> 8) + 36)).isInstance(obj)) {
            if (obj instanceof AFg1gSDK) {
                ((AFg1gSDK) obj).getCurrencyIso4217Code(this);
                return this;
            }
            AFAdRevenueData();
            if (obj == null || (obj instanceof Boolean) || obj == AFg1gSDK.getRevenue) {
                this.getMediationNetwork.append(obj);
            } else if (obj instanceof Number) {
                this.getMediationNetwork.append(AFg1gSDK.getCurrencyIso4217Code((Number) obj));
            } else {
                AFAdRevenueData(obj.toString());
            }
            return this;
        }
        try {
            Object[] objArr = {this};
            Map map = AFa1hSDK.f20116d;
            Object obj2 = map.get(-811011778);
            if (obj2 == null) {
                obj2 = ((Class) AFa1hSDK.getRevenue((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 322, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31686), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35)).getDeclaredMethod("getCurrencyIso4217Code", AFg1dSDK.class);
                map.put(-811011778, obj2);
            }
            ((Method) obj2).invoke(obj, objArr);
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFg1dSDK getMediationNetwork(AFa1zSDK aFa1zSDK, String str) {
        if (this.getMonetizationNetwork.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFg1mSDK("Nesting problem: multiple top-level roots");
        }
        AFAdRevenueData();
        this.getMonetizationNetwork.add(aFa1zSDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final AFg1dSDK getMonetizationNetwork(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) {
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork != aFa1zSDK2 && mediationNetwork != aFa1zSDK) {
            throw new AFg1mSDK("Nesting problem");
        }
        this.getMonetizationNetwork.remove(r2.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }

    final void getMonetizationNetwork() {
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1zSDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (mediationNetwork != AFa1zSDK.EMPTY_OBJECT) {
            throw new AFg1mSDK("Nesting problem");
        }
        AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
        this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK);
    }

    private AFa1zSDK getMediationNetwork() {
        if (!this.getMonetizationNetwork.isEmpty()) {
            return this.getMonetizationNetwork.get(r0.size() - 1);
        }
        throw new AFg1mSDK("Nesting problem");
    }

    private void AFAdRevenueData() {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1zSDK.EMPTY_ARRAY) {
            AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
            this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK);
        } else {
            if (mediationNetwork == AFa1zSDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (mediationNetwork == AFa1zSDK.DANGLING_KEY) {
                this.getMediationNetwork.append(":");
                AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
                this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK2);
                return;
            }
            if (mediationNetwork != AFa1zSDK.NULL) {
                throw new AFg1mSDK("Nesting problem");
            }
        }
    }
}
