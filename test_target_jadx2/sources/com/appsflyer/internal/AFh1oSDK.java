package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.migration.internal.MigrationDataProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1oSDK implements AFh1pSDK {
    private final AFc1oSDK AFAdRevenueData;
    private boolean component3;
    private boolean component4;
    private Long getCurrencyIso4217Code;
    private final AFj1sSDK getMediationNetwork;
    private JSONObject getMonetizationNetwork;
    private Long getRevenue;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1pSDK.values().length];
            try {
                iArr[AFe1pSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1pSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
        }
    }

    public AFh1oSDK(AFc1oSDK aFc1oSDK, AFj1sSDK aFj1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        this.AFAdRevenueData = aFc1oSDK;
        this.getMediationNetwork = aFj1sSDK;
    }

    private final void AFAdRevenueData(String str, AFh1mSDK aFh1mSDK, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("branch", hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("external", hashMap2);
        aFh1mSDK.AFAdRevenueData(hashMap3);
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFe1pSDK AFAdRevenueData = aFh1mSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        getMonetizationNetwork(map, AFAdRevenueData);
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            AFAdRevenueData("attr", aFh1mSDK, attributionData);
            this.component3 = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject jSONObject = this.getMonetizationNetwork;
        if (jSONObject != null) {
            Intrinsics.d(jSONObject);
            AFAdRevenueData("attr", aFh1mSDK, jSONObject);
        } else {
            JSONObject mediationNetwork = getMediationNetwork();
            if (mediationNetwork != null) {
                AFAdRevenueData("attr", aFh1mSDK, mediationNetwork);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFf1rSDK aFf1rSDK, Function0<Unit> function0) {
        JSONObject mediationNetwork;
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.AFAdRevenueData.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 1 && aFf1rSDK.getRevenue == AFe1pSDK.CONVERSION && this.getMediationNetwork.getMediationNetwork() && !getRevenue() && (mediationNetwork = getMediationNetwork()) != null) {
            this.getMonetizationNetwork = mediationNetwork;
            function0.invoke();
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getRevenue() {
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void u_(Intent intent, AFa1mSDK aFa1mSDK) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component4 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1mSDK};
            Map map = AFa1hSDK.f20116d;
            Object obj = map.get(862139947);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (62049 - ExpandableListView.getPackedPositionGroup(0L)), 37 - (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                map.put(862139947, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            Object obj2 = map.get(-180621578);
            if (obj2 == null) {
                obj2 = ((Class) AFa1hSDK.getRevenue((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (62050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36)).getMethod("getMediationNetwork", null);
                map.put(-180621578, obj2);
            }
            Object invoke = ((Method) obj2).invoke(newInstance, null);
            Object obj3 = map.get(614194017);
            if (obj3 == null) {
                obj3 = ((Class) AFa1hSDK.getRevenue(Color.blue(0) + 37, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 52 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", null);
                map.put(614194017, obj3);
            }
            this.component4 = !((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final JSONObject getMediationNetwork() {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (waitForAttributionData != null) {
            this.getCurrencyIso4217Code = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        }
        return waitForAttributionData;
    }

    private final void getMonetizationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        Long l10;
        int i10 = AFa1uSDK.AFAdRevenueData[aFe1pSDK.ordinal()];
        if (i10 != 1) {
            l10 = i10 != 2 ? null : this.getCurrencyIso4217Code;
        } else {
            l10 = this.getRevenue;
        }
        if (l10 != null) {
            long longValue = l10.longValue();
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("migration", kotlin.collections.G.e(lc.t.a("delay", Long.valueOf(longValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void AFAdRevenueData() {
        this.component4 = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getMonetizationNetwork() {
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (waitForDeepLinkingData != null) {
            this.getRevenue = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            AFAdRevenueData("dl", aFh1mSDK, waitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }
}
