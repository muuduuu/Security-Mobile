package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1pSDK implements AFc1qSDK {
    private final Lazy getMediationNetwork;
    private final AFc1gSDK<SharedPreferences> getMonetizationNetwork;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "m_", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1pSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends xc.m implements Function0<SharedPreferences> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: m_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1pSDK(AFc1gSDK<SharedPreferences> aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getMonetizationNetwork = aFc1gSDK;
        this.getMediationNetwork = lc.i.a(new AnonymousClass4());
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str, boolean z10) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final String getMonetizationNetwork(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getRevenue(String str, String str2) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str, boolean z10) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z10);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return z10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str, long j10) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int getRevenue(String str, int i10) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i10);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return i10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getMonetizationNetwork(String str, long j10) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j10);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, int i10) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMonetizationNetwork(String str) {
        return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
    }
}
