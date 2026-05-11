package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2818x6 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f26458a;

    C2818x6(Map map) {
        HashMap hashMap = new HashMap();
        this.f26458a = hashMap;
        hashMap.putAll(map);
    }

    private final Bundle f() {
        int g10;
        Map map = this.f26458a;
        if ("1".equals(map.get("GoogleConsent")) && (g10 = g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(Z3.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(Z3.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && g10 >= 4) {
                    String str3 = Z3.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    private final int g() {
        try {
            String str = (String) this.f26458a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    final String a() {
        StringBuilder sb2 = new StringBuilder();
        com.google.common.collect.i iVar = AbstractC2834z6.f26499a;
        int size = iVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) iVar.get(i10);
            Map map = this.f26458a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        if (r0.get("Version") != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        return f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (g() >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r1 = new android.os.Bundle();
        r2 = com.google.android.gms.measurement.internal.Z3.AD_STORAGE.zze;
        r6 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (true == java.util.Objects.equals(r0.get("AuthorizePurpose1"), "1")) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r4 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r1.putString(r2, r4);
        r2 = com.google.android.gms.measurement.internal.Z3.AD_PERSONALIZATION.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose3"), "1") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose4"), "1") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        r4 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        r1.putString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (g() < 4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r2 = com.google.android.gms.measurement.internal.Z3.AD_USER_DATA.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose1"), "1") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose7"), "1") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        r1.putString(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        r6 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r4 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r4 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        return f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        if ("1".equals(r2.get("EnableAdvertiserConsentMode")) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if ("1".equals(r2.get("EnableAdvertiserConsentMode")) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        if (((java.lang.Boolean) r0.b(null)).booleanValue() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        r0 = r9.f26458a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle b() {
        C2663e2 c2663e2 = AbstractC2671f2.f25989a1;
        if (((Boolean) c2663e2.b(null)).booleanValue()) {
            Map map = this.f26458a;
            if ("1".equals(map.get("gdprApplies"))) {
            }
            return Bundle.EMPTY;
        }
        Map map2 = this.f26458a;
        if ("1".equals(map2.get("GoogleConsent"))) {
            if ("1".equals(map2.get("gdprApplies"))) {
            }
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        String str = (String) this.f26458a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String d(C2818x6 c2818x6) {
        Map map = c2818x6.f26458a;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle b10 = b();
        Bundle b11 = c2818x6.b();
        return str.concat((b10.size() == b11.size() && Objects.equals(b10.getString("ad_storage"), b11.getString("ad_storage")) && Objects.equals(b10.getString("ad_personalization"), b11.getString("ad_personalization")) && Objects.equals(b10.getString("ad_user_data"), b11.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i10 = -1;
        try {
            String str = (String) this.f26458a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int g10 = g();
        if (g10 < 0 || g10 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(g10));
        }
        AbstractC1287s.a(true);
        Map map = this.f26458a;
        int i11 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean equals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i12 = i11 | 4;
        if (equals) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2818x6) {
            return a().equalsIgnoreCase(((C2818x6) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
