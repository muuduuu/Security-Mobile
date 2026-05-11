package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\f\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFf1jSDK;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "Lcom/appsflyer/internal/AFf1hSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFf1hSDK;)V", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "()J", BuildConfig.FLAVOR, "AFAdRevenueData", "()Z", "Lcom/appsflyer/internal/AFc1oSDK;", "getMediationNetwork", "Lkotlin/Lazy;", "getMonetizationNetwork", "getRevenue", "Lcom/appsflyer/internal/AFf1hSDK;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1jSDK {
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFc1oSDK getMediationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final Lazy AFAdRevenueData;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final Lazy getRevenue;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final AFf1hSDK getMonetizationNetwork;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1jSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends xc.m implements Function0<Boolean> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getRevenue", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1jSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends xc.m implements Function0<Boolean> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
        }
    }

    public AFf1jSDK(AFc1oSDK aFc1oSDK, AFf1hSDK aFf1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFf1hSDK, "");
        this.getMediationNetwork = aFc1oSDK;
        this.getMonetizationNetwork = aFf1hSDK;
        this.getRevenue = lc.i.a(new AnonymousClass4());
        this.AFAdRevenueData = lc.i.a(new AnonymousClass5());
    }

    public final boolean AFAdRevenueData() {
        AFi1xSDK aFi1xSDK;
        AFi1vSDK aFi1vSDK = this.getMonetizationNetwork.getCurrencyIso4217Code;
        if (aFi1vSDK == null) {
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        boolean AFAdRevenueData = (aFi1zSDK == null || (aFi1xSDK = aFi1zSDK.getMediationNetwork) == null) ? false : aFi1xSDK.AFAdRevenueData();
        long currentTimeMillis = System.currentTimeMillis();
        AFf1hSDK aFf1hSDK = this.getMonetizationNetwork;
        return AFAdRevenueData || currentTimeMillis - aFf1hSDK.getRevenue > TimeUnit.SECONDS.toMillis(aFf1hSDK.getMonetizationNetwork);
    }

    public final long getCurrencyIso4217Code() {
        Object b10;
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        try {
            o.a aVar = lc.o.f37128b;
            b10 = lc.o.b(Long.valueOf(Long.parseLong(currencyIso4217Code)));
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        Throwable d10 = lc.o.d(b10);
        if (d10 != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + d10.getMessage(), d10);
            b10 = Long.valueOf(getMonetizationNetwork);
        }
        return ((Number) b10).longValue();
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }
}
