package com.webengage.sdk.android.actions.database;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.appsflyer.attribution.RequestError;
import com.webengage.sdk.android.v1;

/* loaded from: classes2.dex */
class d {
    private static String a(int i10) {
        switch (i10) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            default:
                return "UNKNOWN";
        }
    }

    public static Boolean b(Context context) {
        if (!v1.a("android.permission.BLUETOOTH", context)) {
            return null;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return Boolean.valueOf(defaultAdapter != null && defaultAdapter.isEnabled());
    }

    public static String c(Context context) {
        if (v1.a("android.permission.ACCESS_NETWORK_STATE", context)) {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        }
        return null;
    }

    public static String d(Context context) {
        if (v1.a("android.permission.ACCESS_NETWORK_STATE", context) && v1.a("android.permission.READ_PHONE_STATE", context)) {
            return a(((TelephonyManager) context.getSystemService("phone")).getDataNetworkType());
        }
        return null;
    }

    public static Boolean e(Context context) {
        if (v1.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            return Boolean.valueOf(((LocationManager) context.getSystemService("location")).isProviderEnabled("gps"));
        }
        return null;
    }

    public static boolean f(Context context) {
        try {
            NfcAdapter defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.isEnabled();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Boolean g(Context context) {
        if (v1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            return Boolean.valueOf(((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected());
        }
        return null;
    }

    public static boolean a(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
