package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFi1xSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p2", BuildConfig.FLAVOR, "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AFAdRevenueData", "()Z", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMediationNetwork", "getMonetizationNetwork", "I", "F", "component4", "getRevenue", "Ljava/util/List;", "component1", "J", "component3"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFi1xSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public List<String> component1;

    /* renamed from: component4, reason: from kotlin metadata */
    public final String getRevenue;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final String getMediationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public final float getCurrencyIso4217Code;
    public final int getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public long component3;

    public AFi1xSDK(long j10, float f10, List<String> list, int i10, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = j10;
        this.getCurrencyIso4217Code = f10;
        this.component1 = list;
        this.getMonetizationNetwork = i10;
        this.getMediationNetwork = str;
        this.getRevenue = str2;
    }

    public final boolean AFAdRevenueData() {
        return TimeUnit.SECONDS.toMillis(this.component3) > AFa1ySDK.getRevenue().getMonetizationNetwork().component3().getCurrencyIso4217Code();
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!Intrinsics.b(AFi1xSDK.class, p02 != null ? p02.getClass() : null)) {
            return false;
        }
        Intrinsics.e(p02, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) p02;
        return this.component3 == aFi1xSDK.component3 && this.getCurrencyIso4217Code == aFi1xSDK.getCurrencyIso4217Code && Intrinsics.b(this.component1, aFi1xSDK.component1) && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.b(this.getMediationNetwork, aFi1xSDK.getMediationNetwork) && Intrinsics.b(this.getRevenue, aFi1xSDK.getRevenue);
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.component3) * 31) + Float.hashCode(this.getCurrencyIso4217Code)) * 31) + this.component1.hashCode()) * 31) + this.getMonetizationNetwork) * 31) + this.getMediationNetwork.hashCode()) * 31) + this.getRevenue.hashCode();
    }
}
