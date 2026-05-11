package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0019\u0010\u001eR\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1ySDK;", "Lcom/appsflyer/internal/AFe1jSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1iSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1iSDK;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getMonetizationNetwork", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1hSDK;", "getRevenue", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;", "getCurrencyIso4217Code", "(Ljava/util/Map;)Ljava/lang/String;", BuildConfig.FLAVOR, "getMediationNetwork", "(Ljava/lang/String;I)V", "()V", "hashCode", "Ljava/util/Map;", "copydefault", "Lcom/appsflyer/internal/AFj1iSDK;", "equals", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "AFAdRevenueData", "component2", "Lcom/appsflyer/AppsFlyerProperties;", "toString", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1ySDK extends AFe1jSDK {

    /* renamed from: component2, reason: from kotlin metadata */
    private final AppsFlyerProperties getRevenue;

    /* renamed from: copydefault, reason: from kotlin metadata */
    private final AFj1iSDK getMonetizationNetwork;

    /* renamed from: equals, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback AFAdRevenueData;

    /* renamed from: hashCode, reason: from kotlin metadata */
    private final Map<String, String> getCurrencyIso4217Code;

    /* renamed from: toString, reason: from kotlin metadata */
    private final AFPurchaseDetails getMediationNetwork;

    public static final class AFa1tSDK extends RuntimeException {
    }

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
        }
    }

    public /* synthetic */ AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i10 & 32) != 0 ? new AFj1hSDK() : aFj1iSDK);
    }

    private final void getMediationNetwork(String p02, int p12) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFAdRevenueData;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(kotlin.collections.G.k(lc.t.a("error_code", Integer.valueOf(p12)), lc.t.a("error_message", p02)));
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        Object b10;
        Unit unit;
        super.getCurrencyIso4217Code();
        Throwable component1 = component1();
        if (component1 != null && !(component1 instanceof AFe1iSDK)) {
            if (component1 instanceof AFe1nSDK) {
                getMediationNetwork("No dev key", -1);
            } else if (component1 instanceof AFa1tSDK) {
                getMediationNetwork("One or more of provided arguments is empty", -1);
            } else {
                getMediationNetwork("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFAdRevenueData;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(kotlin.collections.G.k(lc.t.a("error_code", Integer.valueOf(responseNetwork.getStatusCode())), lc.t.a("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                o.a aVar = lc.o.f37128b;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFAdRevenueData;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1bSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.f36324a;
                } else {
                    unit = null;
                }
                b10 = lc.o.b(unit);
            } catch (Throwable th) {
                o.a aVar2 = lc.o.f37128b;
                b10 = lc.o.b(lc.p.a(th));
            }
            if (lc.o.d(b10) != null) {
                getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            lc.o.a(b10);
        }
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    protected final void getMonetizationNetwork(Map<String, Object> p02, String p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        super.getMonetizationNetwork(p02, p12);
        List m10 = CollectionsKt.m(this.getMediationNetwork.getPurchaseToken(), this.getMediationNetwork.getProductId());
        if (!(m10 instanceof Collection) || !m10.isEmpty()) {
            Iterator it = m10.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        p02.put("purchase_token", this.getMediationNetwork.getPurchaseToken());
        p02.put("product_id", this.getMediationNetwork.getProductId());
        p02.put("purchase_type", this.getMediationNetwork.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p02.put("purchase_additional_details", this.getCurrencyIso4217Code);
        }
        String string = this.getRevenue.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        p02.put("custom_data", (string == null || string.length() == 0) ? kotlin.collections.G.h() : AFj1bSDK.getMonetizationNetwork(new JSONObject(string)));
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final AFd1hSDK<String> getRevenue(Map<String, Object> p02, String p12, String p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        int i10 = AFa1ySDK.getRevenue[this.getMediationNetwork.getPurchaseType().ordinal()];
        if (i10 == 1) {
            return ((AFe1fSDK) this).component4.getCurrencyIso4217Code(p02, p12);
        }
        if (i10 == 2) {
            return ((AFe1fSDK) this).component4.getMonetizationNetwork(p02, p12);
        }
        throw new lc.m();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK) {
        super(AFe1pSDK.MANUAL_PURCHASE_VALIDATION, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, null, kotlin.collections.G.h());
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1iSDK, "");
        this.getRevenue = appsFlyerProperties;
        this.getMediationNetwork = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.AFAdRevenueData = appsFlyerInAppPurchaseValidationCallback;
        this.getMonetizationNetwork = aFj1iSDK;
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    protected final String getCurrencyIso4217Code(Map<String, Object> p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return this.getMonetizationNetwork.getMediationNetwork();
    }
}
