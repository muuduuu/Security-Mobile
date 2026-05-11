package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC2342r4;
import com.google.android.gms.internal.measurement.EnumC2351s4;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.z6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2834z6 {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.common.collect.i f26499a = com.google.common.collect.i.E("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, BuildConfig.FLAVOR);
        } catch (ClassCastException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean c(EnumC2342r4 enumC2342r4, com.google.common.collect.j jVar, com.google.common.collect.j jVar2, com.google.common.collect.k kVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char c10;
        com.google.common.collect.j jVar3;
        int i21;
        EnumC2826y6 enumC2826y6;
        int ordinal;
        char c11;
        int e10 = e(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (e10 > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 == 1) {
                    i18 = 1;
                    i17 = 1;
                    if (i(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i14, str, str2, str3, z10, z11, true) != EnumC2351s4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
                        c11 = '3';
                    } else {
                        if (enumC2342r4 == EnumC2342r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                            i19 = i14;
                            i20 = 1;
                            if (i19 == 1) {
                                if (kVar.contains(str)) {
                                    if (e10 > 0 && cArr[e10] != '2') {
                                        cArr[e10] = '1';
                                    }
                                    return true;
                                }
                                c10 = '2';
                                jVar3 = jVar;
                                i21 = 1;
                                if (jVar3.containsKey(enumC2342r4) && (enumC2826y6 = (EnumC2826y6) jVar3.get(enumC2342r4)) != null) {
                                    ordinal = enumC2826y6.ordinal();
                                    if (ordinal == 0) {
                                        if (ordinal != i20) {
                                            if (ordinal == 2) {
                                                return i(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == EnumC2351s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) : g(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                                            }
                                            if (ordinal == 3) {
                                                return i(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == EnumC2351s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) : h(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                                            }
                                        } else if (i(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != EnumC2351s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                            return h(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                                        }
                                    } else if (i(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != EnumC2351s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                        return g(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                                    }
                                    c11 = '8';
                                }
                                c11 = '0';
                            }
                        } else {
                            i19 = i14;
                            i20 = 1;
                        }
                        c10 = '2';
                        jVar3 = jVar;
                        i21 = i19;
                        if (jVar3.containsKey(enumC2342r4)) {
                            ordinal = enumC2826y6.ordinal();
                            if (ordinal == 0) {
                            }
                            c11 = '8';
                        }
                        c11 = '0';
                    }
                    if (e10 <= 0 && cArr[e10] != '2') {
                        cArr[e10] = c11;
                        return false;
                    }
                }
                i16 = 1;
            } else {
                i15 = i11;
            }
            cArr[e10] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        i17 = i16;
        i18 = i15;
        if (i(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i18, i17, i13, i14, str, str2, str3, z10, z11, true) != EnumC2351s4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
        }
        return e10 <= 0 ? false : false;
    }

    public static final Map d(com.google.common.collect.j jVar, com.google.common.collect.j jVar2, com.google.common.collect.k kVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return com.google.common.collect.j.h();
        }
        EnumC2342r4 enumC2342r4 = EnumC2342r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC2351s4 enumC2351s4 = (EnumC2351s4) jVar2.get(enumC2342r4);
        EnumC2342r4 enumC2342r42 = EnumC2342r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC2351s4 enumC2351s42 = (EnumC2351s4) jVar2.get(enumC2342r42);
        EnumC2342r4 enumC2342r43 = EnumC2342r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC2351s4 enumC2351s43 = (EnumC2351s4) jVar2.get(enumC2342r43);
        EnumC2342r4 enumC2342r44 = EnumC2342r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC2351s4 enumC2351s44 = (EnumC2351s4) jVar2.get(enumC2342r44);
        return com.google.common.collect.j.a().f("Version", "2").f("VendorConsent", true != z10 ? "0" : "1").f("VendorLegitimateInterest", true != z11 ? "0" : "1").f("gdprApplies", i12 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(enumC2351s4 != null ? enumC2351s4.zza() : EnumC2351s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(enumC2351s42 != null ? enumC2351s42.zza() : EnumC2351s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(enumC2351s43 != null ? enumC2351s43.zza() : EnumC2351s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(enumC2351s44 != null ? enumC2351s44.zza() : EnumC2351s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(com.google.common.collect.j.i("Purpose1", f(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(enumC2342r42, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(enumC2342r43, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(enumC2342r44, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).i(com.google.common.collect.j.j("AuthorizePurpose1", true != c(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose3", true != c(enumC2342r42, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose4", true != c(enumC2342r43, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose7", true == c(enumC2342r44, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "1" : "0", "PurposeDiagnostics", new String(cArr))).c();
    }

    private static final int e(EnumC2342r4 enumC2342r4, com.google.common.collect.j jVar, com.google.common.collect.j jVar2, com.google.common.collect.k kVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (enumC2342r4 == EnumC2342r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC2342r4 == EnumC2342r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC2342r4 == EnumC2342r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC2342r4 == EnumC2342r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String f(EnumC2342r4 enumC2342r4, com.google.common.collect.j jVar, com.google.common.collect.j jVar2, com.google.common.collect.k kVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String str4 = "0";
        String valueOf = (TextUtils.isEmpty(str2) || str2.length() < enumC2342r4.zza()) ? "0" : String.valueOf(str2.charAt(enumC2342r4.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC2342r4.zza()) {
            str4 = String.valueOf(str3.charAt(enumC2342r4.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str4));
    }

    private static final boolean g(EnumC2342r4 enumC2342r4, com.google.common.collect.j jVar, com.google.common.collect.j jVar2, com.google.common.collect.k kVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int e10 = e(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= enumC2342r4.zza()) {
                char charAt = str2.charAt(enumC2342r4.zza() - 1);
                boolean z13 = charAt == '1';
                if (e10 > 0 && cArr[e10] != '2') {
                    cArr[e10] = charAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (e10 > 0 && cArr[e10] != '2') {
            cArr[e10] = c10;
        }
        return false;
    }

    private static final boolean h(EnumC2342r4 enumC2342r4, com.google.common.collect.j jVar, com.google.common.collect.j jVar2, com.google.common.collect.k kVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int e10 = e(enumC2342r4, jVar, jVar2, kVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= enumC2342r4.zza()) {
                char charAt = str3.charAt(enumC2342r4.zza() - 1);
                boolean z13 = charAt == '1';
                if (e10 > 0 && cArr[e10] != '2') {
                    cArr[e10] = charAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (e10 > 0 && cArr[e10] != '2') {
            cArr[e10] = c10;
        }
        return false;
    }

    private static final EnumC2351s4 i(EnumC2342r4 enumC2342r4, com.google.common.collect.j jVar, com.google.common.collect.j jVar2, com.google.common.collect.k kVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (EnumC2351s4) jVar2.getOrDefault(enumC2342r4, EnumC2351s4.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
