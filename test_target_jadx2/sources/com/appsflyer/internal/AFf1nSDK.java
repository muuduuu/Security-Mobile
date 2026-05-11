package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFf1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component2 = 1;
    private static char[] getCurrencyIso4217Code;
    private static int getMediationNetwork;
    private static boolean getMonetizationNetwork;
    private static boolean getRevenue;

    static {
        getMediationNetwork();
        ExpandableListView.getPackedPositionChild(0L);
        AFAdRevenueData = (component2 + 25) % 128;
    }

    private static void a(String str, int[] iArr, String str2, int i10, Object[] objArr) {
        char[] cArr = str2;
        if (str2 != null) {
            $11 = ($10 + 75) % 128;
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = getCurrencyIso4217Code;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i11 = 0; i11 < length; i11++) {
                cArr4[i11] = (char) (cArr3[i11] ^ 1825820251896122634L);
            }
            cArr3 = cArr4;
        }
        int i12 = (int) (1825820251896122634L ^ getMediationNetwork);
        if (getRevenue) {
            $10 = ($11 + 3) % 128;
            int length2 = bArr2.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i13 = aFk1oSDK.AFAdRevenueData;
                int i14 = aFk1oSDK.getMonetizationNetwork;
                if (i13 >= i14) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i13] = (char) (cArr3[bArr2[(i14 - 1) - i13] + i10] - i12);
                    aFk1oSDK.AFAdRevenueData = i13 + 1;
                }
            }
        } else {
            if (!getMonetizationNetwork) {
                int length3 = iArr.length;
                aFk1oSDK.getMonetizationNetwork = length3;
                char[] cArr6 = new char[length3];
                aFk1oSDK.AFAdRevenueData = 0;
                while (true) {
                    int i15 = aFk1oSDK.AFAdRevenueData;
                    int i16 = aFk1oSDK.getMonetizationNetwork;
                    if (i15 >= i16) {
                        break;
                    }
                    $10 = ($11 + 81) % 128;
                    cArr6[i15] = (char) (cArr3[iArr[(i16 - 1) - i15] - i10] - i12);
                    aFk1oSDK.AFAdRevenueData = i15 + 1;
                }
                String str3 = new String(cArr6);
                int i17 = $11 + 41;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str3;
                return;
            }
            int length4 = cArr2.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i18 = aFk1oSDK.AFAdRevenueData;
                int i19 = aFk1oSDK.getMonetizationNetwork;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i18] = (char) (cArr3[cArr2[(i19 - 1) - i18] - i10] - i12);
                    aFk1oSDK.AFAdRevenueData = i18 + 1;
                }
            }
        }
    }

    private static AFi1sSDK getCurrencyIso4217Code(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFi1sSDK(aFi1vSDK.getRevenue == AFh1dSDK.DEFAULT, AFi1ySDK.NA);
        }
        Object[] objArr = new Object[1];
        a("\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1vSDK.getRevenue == AFh1dSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = BuildConfig.FLAVOR;
            str3 = intern;
        }
        boolean equals = getMonetizationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.getMediationNetwork, "android", "v1", str4).equals(str);
        return new AFi1sSDK(equals, equals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    static void getMediationNetwork() {
        getCurrencyIso4217Code = new char[]{36169, 36173, 36172, 36163, 36168, 36174, 36175, 36162, 36170, 36190, 36171, 36187, 36191};
        getMediationNetwork = 1912311066;
        getMonetizationNetwork = true;
        getRevenue = true;
    }

    private static String getMonetizationNetwork(String str, String str2, String str3, String str4, String str5) {
        String monetizationNetwork = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, BuildConfig.FLAVOR}), str);
        if (monetizationNetwork.length() >= 12) {
            return monetizationNetwork.substring(0, 12);
        }
        int i10 = (AFAdRevenueData + 113) % 128;
        component2 = i10;
        int i11 = i10 + 111;
        AFAdRevenueData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 63 / 0;
        }
        return monetizationNetwork;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        return getCurrencyIso4217Code(r4, r5, r6, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFi1sSDK getRevenue(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        if (aFi1vSDK != null) {
            int i10 = AFAdRevenueData + 111;
            component2 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 89 / 0;
            }
        }
        component2 = (AFAdRevenueData + 17) % 128;
        return new AFi1sSDK(false, AFi1ySDK.INTERNAL_ERROR);
    }
}
