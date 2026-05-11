package com.appsflyer.internal;

import H6.a;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1vSDK;
import com.google.android.gms.common.C2017i;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0012\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0019J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u001b*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u0012\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0015\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\tR\u001b\u0010\u000e\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010\tR\u0014\u0010\u001d\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0015\u0010#\u001a\u00020\u00148BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b*\u0010'"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "Lcom/appsflyer/internal/AFh1rSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;)V", BuildConfig.FLAVOR, "copydefault", "()Z", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(I)Z", "getMediationNetwork", "getMonetizationNetwork", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", "p1", "getRevenue", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;)Z", BuildConfig.FLAVOR, "AFAdRevenueData", "()J", "Lcom/appsflyer/internal/AFe1uSDK;", "()Lcom/appsflyer/internal/AFe1uSDK;", "(Landroid/content/Context;)I", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "(Lcom/appsflyer/internal/AFh1rSDK;Ljava/lang/String;)V", "component3", "Lcom/appsflyer/internal/AFh1rSDK;", "Lcom/appsflyer/internal/AFc1hSDK;", "component4", "Lcom/appsflyer/internal/AFc1hSDK;", "Lcom/appsflyer/internal/AFc1oSDK;", "component1", "Lcom/appsflyer/internal/AFc1oSDK;", "component2", "copy", "Lkotlin/Lazy;", "Lcom/appsflyer/internal/AFc1eSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "areAllFieldsValid", "AFa1tSDK", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1eSDK extends AFe1mSDK<AdvertisingIdData> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final Lazy component1;

    /* renamed from: component1, reason: from kotlin metadata */
    private final AFc1oSDK getMediationNetwork;

    /* renamed from: component2, reason: from kotlin metadata */
    private final AFc1eSDK component3;

    /* renamed from: component3, reason: from kotlin metadata */
    private final AdvertisingIdData getCurrencyIso4217Code;

    /* renamed from: component4, reason: from kotlin metadata */
    private final AFc1hSDK getRevenue;

    /* renamed from: copy, reason: from kotlin metadata */
    private final Lazy getMonetizationNetwork;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends xc.m implements Function0<Boolean> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends xc.m implements Function0<Long> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long l10;
            String currencyIso4217Code = AFe1eSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (l10 = StringsKt.l(currencyIso4217Code)) == null) ? 1000L : l10.longValue());
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "advertisingId", BuildConfig.FLAVOR, "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$AFa1uSDK, reason: from toString */
    static final /* data */ class FetchGaidData {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public FetchGaidData() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ FetchGaidData copy$default(FetchGaidData fetchGaidData, String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fetchGaidData.advertisingId;
            }
            if ((i10 & 2) != 0) {
                bool = fetchGaidData.isLimitAdTrackingEnabled;
            }
            if ((i10 & 4) != 0) {
                z10 = fetchGaidData.advertisingIdWithGps;
            }
            if ((i10 & 8) != 0) {
                sb2 = fetchGaidData.gaidError;
            }
            return fetchGaidData.copy(str, bool, z10, sb2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final FetchGaidData copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new FetchGaidData(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchGaidData)) {
                return false;
            }
            FetchGaidData fetchGaidData = (FetchGaidData) other;
            return Intrinsics.b(this.advertisingId, fetchGaidData.advertisingId) && Intrinsics.b(this.isLimitAdTrackingEnabled, fetchGaidData.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == fetchGaidData.advertisingIdWithGps && Intrinsics.b(this.gaidError, fetchGaidData.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z10 = this.advertisingIdWithGps;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return ((hashCode2 + i10) * 31) + this.gaidError.hashCode();
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z10) {
            this.advertisingIdWithGps = z10;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public FetchGaidData(String str, Boolean bool, boolean z10, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z10;
            this.gaidError = gaidError;
        }

        public /* synthetic */ FetchGaidData(String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", BuildConfig.FLAVOR, "reason", BuildConfig.FLAVOR, "onSuccess", "kinds", BuildConfig.FLAVOR, "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1ySDK implements CloudDevCallback {
        final /* synthetic */ FetchGaidData $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1ySDK(FetchGaidData fetchGaidData, CountDownLatch countDownLatch) {
            this.$fetchGaidData = fetchGaidData;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.FETCH_ADVERTISING_ID, new AFe1pSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        AFc1hSDK AFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        this.getRevenue = AFInAppEventParameterName;
        AFc1oSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        this.getMediationNetwork = AFAdRevenueData;
        AFc1eSDK force = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.component3 = force;
        this.getCurrencyIso4217Code = new AdvertisingIdData(null, null, null, null, null, null, null, null, 255, null);
        this.component1 = lc.i.a(new AnonymousClass4());
        this.getMonetizationNetwork = lc.i.a(new AnonymousClass1());
    }

    private static boolean component2() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
            return false;
        }
    }

    private final boolean component3() {
        return ((Boolean) this.getMonetizationNetwork.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:2:0x0005->B:10:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[EDGE_INSN: B:11:0x0048->B:12:0x0048 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean copydefault() {
        boolean z10 = false;
        for (int i10 = 2; i10 > 0; i10--) {
            if (component3() && getMonetizationNetwork(i10)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else if (!getCurrencyIso4217Code(i10)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                z10 = false;
                if (!z10) {
                    break;
                }
            } else {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
            }
            z10 = true;
            if (!z10) {
            }
        }
        this.component3.component3 = this.getCurrencyIso4217Code;
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        getRevenue(r20.getCurrencyIso4217Code, r2.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d8, code lost:
    
        r0 = r2.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dc, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e2, code lost:
    
        if (r0.length() != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e5, code lost:
    
        r0 = r20.getCurrencyIso4217Code;
        r0.advertisingId = r2.getAdvertisingId();
        r2 = java.lang.Boolean.FALSE;
        r0.isLimited = r2;
        r4 = java.lang.Boolean.TRUE;
        r0.isEnabled = r4;
        r0.isGaidWithGps = r2;
        r0.isGaidWithSamsungCloudDev = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fc, code lost:
    
        if (r21 == 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fe, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ff, code lost:
    
        r0.retry = java.lang.Boolean.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0105, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0106, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r2.getGaidError().length() <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006e, code lost:
    
        if (r2.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(int p02) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        boolean z10 = false;
        if (component2()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getRevenue.getMonetizationNetwork;
            Intrinsics.d(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                FetchGaidData fetchGaidData = new FetchGaidData(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getRevenue.getMonetizationNetwork;
                    Intrinsics.d(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.e("gaid"), new AFa1ySDK(fetchGaidData, countDownLatch));
                    countDownLatch.await(((Number) this.component1.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = fetchGaidData.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                    } catch (Throwable th2) {
                        if (fetchGaidData.getGaidError().length() > 0) {
                            getRevenue(this.getCurrencyIso4217Code, fetchGaidData.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
            }
        }
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return ((Number) this.component1.getValue()).longValue();
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        if (this.component3.AFAdRevenueData()) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1uSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        AFe1uSDK aFe1uSDK = CollectionsKt.m(valueOf, bool, bool).contains(Boolean.TRUE) ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
        AFc1eSDK aFc1eSDK = this.component3;
        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1aSDK.getMediationNetwork + "ms", false, 4, null);
        aFc1eSDK.getMediationNetwork(aFd1aSDK);
        return aFe1uSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getCurrencyIso4217Code(int p02) {
        boolean z10;
        String obj;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        FetchGaidData fetchGaidData = new FetchGaidData(null, null, false, null, 15, null);
        Context context = this.getRevenue.getMonetizationNetwork;
        Intrinsics.d(context);
        int revenue = getRevenue(context);
        Context context2 = this.getRevenue.getMonetizationNetwork;
        Intrinsics.d(context2);
        if (!getCurrencyIso4217Code(context2, fetchGaidData)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getRevenue.getMonetizationNetwork;
                Intrinsics.d(context3);
                if (getRevenue(context3, fetchGaidData)) {
                    z10 = true;
                    obj = fetchGaidData.getGaidError().toString();
                    if (obj != null && !StringsKt.Z(obj)) {
                        obj = revenue + ": " + StringsKt.S0(obj).toString();
                    }
                    getRevenue(this.getCurrencyIso4217Code, obj);
                    if (!z10) {
                        return false;
                    }
                }
            }
            z10 = false;
            obj = fetchGaidData.getGaidError().toString();
            if (obj != null) {
                obj = revenue + ": " + StringsKt.S0(obj).toString();
            }
            getRevenue(this.getCurrencyIso4217Code, obj);
            if (!z10) {
            }
        }
        AdvertisingIdData advertisingIdData = this.getCurrencyIso4217Code;
        advertisingIdData.advertisingId = fetchGaidData.getAdvertisingId();
        advertisingIdData.isLimited = fetchGaidData.isLimitAdTrackingEnabled();
        advertisingIdData.isEnabled = fetchGaidData.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r2.booleanValue()) : null;
        advertisingIdData.isGaidWithGps = Boolean.valueOf(fetchGaidData.getAdvertisingIdWithGps());
        advertisingIdData.isGaidWithSamsungCloudDev = Boolean.FALSE;
        advertisingIdData.retry = Boolean.valueOf(p02 != 2);
        return true;
    }

    private final boolean getMonetizationNetwork(int p02) {
        return getMediationNetwork(p02);
    }

    private static int getRevenue(Context p02) {
        try {
            return C2017i.q().i(p02);
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:2:0x0000, B:4:0x001a, B:7:0x002c, B:12:0x0032, B:13:0x0042, B:15:0x0023), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(Context p02, FetchGaidData p12) {
        try {
            AFb1vSDK.AFa1ySDK AFAdRevenueData = AFb1vSDK.AFAdRevenueData(p02);
            p12.setAdvertisingId(AFAdRevenueData.getCurrencyIso4217Code);
            p12.setLimitAdTrackingEnabled(Boolean.valueOf(AFAdRevenueData.AFAdRevenueData()));
            String advertisingId = p12.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f36324a == null) {
                    return true;
                }
                p12.getGaidError().append("gpsAdInfo-null (bypass) |");
                throw new IllegalStateException("GpsAdInfo is null (bypass)");
            }
            p12.getGaidError().append("emptyOrNull (bypass) |");
            if (Unit.f36324a == null) {
            }
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, "Failed to fetch GAID: " + th.getMessage(), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, localizedMessage == null ? th.toString() : localizedMessage, false, 4, null);
            return false;
        }
    }

    private static void getRevenue(AdvertisingIdData advertisingIdData, String str) {
        if (str == null) {
            return;
        }
        String str2 = advertisingIdData.gaidError;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        advertisingIdData.gaidError = str;
    }

    private final boolean getCurrencyIso4217Code(Context p02, FetchGaidData p12) {
        Unit unit;
        try {
            a.C0076a a10 = H6.a.a(p02);
            if (a10 != null) {
                p12.setAdvertisingId(a10.a());
                p12.setLimitAdTrackingEnabled(Boolean.valueOf(a10.b()));
                p12.setAdvertisingIdWithGps(true);
                String advertisingId = p12.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    unit = Unit.f36324a;
                }
                p12.getGaidError().append("emptyOrNull |");
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }
}
