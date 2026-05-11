package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFc1aSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "p1", "p2", BuildConfig.FLAVOR, "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getRevenue", "()Lorg/json/JSONObject;", "getMonetizationNetwork", "()Ljava/lang/String;", "toString", "getMediationNetwork", "I", "AFAdRevenueData", "Ljava/lang/String;", "getCurrencyIso4217Code", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.appsflyer.internal.AFc1aSDK, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class ExceptionInfo {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata and from toString */
    final String hashName;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata and from toString */
    public String label;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata and from toString */
    int counter;

    /* renamed from: getRevenue, reason: from kotlin metadata and from toString */
    public String stackTrace;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFc1aSDK$AFa1zSDK;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, "AFAdRevenueData", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1aSDK;", "getMediationNetwork", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1aSDK;", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1aSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private static boolean AFAdRevenueData(Integer p02, String... p12) {
            boolean z10 = p02 == null;
            int length = p12.length;
            for (int i10 = 0; i10 < 3; i10++) {
                String str = p12[i10];
                z10 = z10 || str == null || str.length() == 0;
            }
            return z10;
        }

        public static ExceptionInfo getMediationNetwork(String p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            List<String> split$default = StringsKt.split$default(p02, new String[]{"\n"}, false, 0, 6, null);
            if (split$default.size() != 4) {
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            for (String str4 : split$default) {
                if (StringsKt.F(str4, "label=", false, 2, null)) {
                    str = getRevenue(str4, "label=");
                } else if (StringsKt.F(str4, "hashName=", false, 2, null)) {
                    str2 = getRevenue(str4, "hashName=");
                } else if (!StringsKt.F(str4, "stackTrace=", false, 2, null)) {
                    if (!StringsKt.F(str4, "c=", false, 2, null)) {
                        break;
                    }
                    String substring = str4.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(StringsKt.S0(substring).toString()));
                } else {
                    str3 = getRevenue(str4, "stackTrace=");
                }
            }
            if (AFAdRevenueData(num, str, str2, str3)) {
                return null;
            }
            Intrinsics.d(str);
            Intrinsics.d(str2);
            Intrinsics.d(str3);
            Intrinsics.d(num);
            return new ExceptionInfo(str, str2, str3, num.intValue());
        }

        private static String getRevenue(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = StringsKt.S0(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExceptionInfo(String str, String str2, String str3, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.hashName = str2;
        this.stackTrace = str3;
        this.counter = i10;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) p02;
        return Intrinsics.b(this.label, exceptionInfo.label) && Intrinsics.b(this.hashName, exceptionInfo.hashName) && Intrinsics.b(this.stackTrace, exceptionInfo.stackTrace) && this.counter == exceptionInfo.counter;
    }

    public final String getMonetizationNetwork() {
        String str = this.label;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.hashName;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.stackTrace;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + encodeToString + "\nhashName=" + encodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.counter;
    }

    public final JSONObject getRevenue() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.label);
        jSONObject.put("hash_name", this.hashName);
        jSONObject.put("st", this.stackTrace);
        jSONObject.put("c", String.valueOf(this.counter));
        return jSONObject;
    }

    public final int hashCode() {
        return (((((this.label.hashCode() * 31) + this.hashName.hashCode()) * 31) + this.stackTrace.hashCode()) * 31) + Integer.hashCode(this.counter);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.label + ", hashName=" + this.hashName + ", stackTrace=" + this.stackTrace + ", counter=" + this.counter + ")";
    }

    public /* synthetic */ ExceptionInfo(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 1 : i10);
    }
}
