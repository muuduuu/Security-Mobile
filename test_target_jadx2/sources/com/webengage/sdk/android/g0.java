package com.webengage.sdk.android;

/* loaded from: classes2.dex */
class g0 implements f0 {
    g0() {
    }

    @Override // com.webengage.sdk.android.f0
    public Object a(String str) {
        if (str.equalsIgnoreCase("null")) {
            return null;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
            return Boolean.valueOf(str);
        }
        try {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return (!str.isEmpty() && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') ? str.substring(1, str.length() - 1) : str;
            }
        } catch (NumberFormatException unused2) {
            return Double.valueOf(str);
        }
    }
}
