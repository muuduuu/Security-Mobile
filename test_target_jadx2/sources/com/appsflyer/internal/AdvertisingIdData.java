package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, "p1", "p2", "p3", "p4", "p5", "p6", BuildConfig.FLAVOR, "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMediationNetwork", "component3", "getRevenue", "AFAdRevenueData", "Ljava/lang/Boolean;", "getMonetizationNetwork", "component2", "component1", "Ljava/util/Map;", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.appsflyer.internal.AFh1rSDK, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class AdvertisingIdData {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata and from toString */
    public Boolean isEnabled;

    /* renamed from: component1, reason: from kotlin metadata and from toString */
    public Map<String, Object> metadata;

    /* renamed from: component2, reason: from kotlin metadata and from toString */
    public Boolean retry;

    /* renamed from: component3, reason: from kotlin metadata and from toString */
    public String gaidError;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata and from toString */
    public String advertisingId;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata and from toString */
    public Boolean isGaidWithGps;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata and from toString */
    public Boolean isGaidWithSamsungCloudDev;

    /* renamed from: getRevenue, reason: from kotlin metadata and from toString */
    public Boolean isLimited;

    private AdvertisingIdData(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.advertisingId = str;
        this.isLimited = bool;
        this.isEnabled = bool2;
        this.isGaidWithGps = bool3;
        this.isGaidWithSamsungCloudDev = bool4;
        this.gaidError = str2;
        this.retry = bool5;
        this.metadata = map;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AdvertisingIdData)) {
            return false;
        }
        AdvertisingIdData advertisingIdData = (AdvertisingIdData) p02;
        return Intrinsics.b(this.advertisingId, advertisingIdData.advertisingId) && Intrinsics.b(this.isLimited, advertisingIdData.isLimited) && Intrinsics.b(this.isEnabled, advertisingIdData.isEnabled) && Intrinsics.b(this.isGaidWithGps, advertisingIdData.isGaidWithGps) && Intrinsics.b(this.isGaidWithSamsungCloudDev, advertisingIdData.isGaidWithSamsungCloudDev) && Intrinsics.b(this.gaidError, advertisingIdData.gaidError) && Intrinsics.b(this.retry, advertisingIdData.retry) && Intrinsics.b(this.metadata, advertisingIdData.metadata);
    }

    public final int hashCode() {
        String str = this.advertisingId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isLimited;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isGaidWithGps;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isGaidWithSamsungCloudDev;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.gaidError;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.retry;
        return ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.metadata.hashCode();
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.advertisingId + ", isLimited=" + this.isLimited + ", isEnabled=" + this.isEnabled + ", isGaidWithGps=" + this.isGaidWithGps + ", isGaidWithSamsungCloudDev=" + this.isGaidWithSamsungCloudDev + ", gaidError=" + this.gaidError + ", retry=" + this.retry + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ AdvertisingIdData(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : bool4, (i10 & 32) != 0 ? null : str2, (i10 & 64) == 0 ? bool5 : null, (i10 & 128) != 0 ? new HashMap() : map);
    }

    public AdvertisingIdData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
