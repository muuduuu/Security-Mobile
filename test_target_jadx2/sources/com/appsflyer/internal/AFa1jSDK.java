package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "Lcom/appsflyer/internal/AFa1lSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V", BuildConfig.FLAVOR, "getMonetizationNetwork", "(Ljava/lang/String;)Z", BuildConfig.FLAVOR, "getRevenue", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/Map;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFa1lSDK;", "getMediationNetwork", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1jSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    final AFa1lSDK getMediationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    final Map<String, Object> AFAdRevenueData;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK$AFa1ySDK;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/appsflyer/internal/AFh1mSDK;", "p0", "Lcom/appsflyer/internal/AFa1jSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1mSDK;)Lcom/appsflyer/internal/AFa1jSDK;", "Lcom/appsflyer/internal/AFa1lSDK;", "getRevenue", "(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1jSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFa1jSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AFa1jSDK AFAdRevenueData(AFh1mSDK p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Map<String, Object> map = p02.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1jSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        public static AFa1jSDK getRevenue(AFa1lSDK p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            return new AFa1jSDK(new LinkedHashMap(), p02, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1lSDK aFa1lSDK) {
        this.AFAdRevenueData = map;
        this.getMediationNetwork = aFa1lSDK;
    }

    public static final AFa1jSDK getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        return Companion.AFAdRevenueData(aFh1mSDK);
    }

    public static final AFa1jSDK getMediationNetwork(AFa1lSDK aFa1lSDK) {
        return Companion.getRevenue(aFa1lSDK);
    }

    public final boolean getMonetizationNetwork(String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return this.AFAdRevenueData.containsKey(p02);
    }

    public final void getRevenue(String p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        this.AFAdRevenueData.put(p02, p12);
        AFa1lSDK aFa1lSDK = this.getMediationNetwork;
        if (aFa1lSDK != null) {
            aFa1lSDK.getMonetizationNetwork(this.AFAdRevenueData);
        }
    }

    /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? null : aFa1lSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1lSDK);
    }
}
