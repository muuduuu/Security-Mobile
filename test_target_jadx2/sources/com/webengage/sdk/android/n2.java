package com.webengage.sdk.android;

import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.lang.reflect.InvocationTargetException;
import x7.AbstractC5131n;
import x7.C5127j;
import x7.InterfaceC5121d;
import x7.InterfaceC5125h;

/* loaded from: classes2.dex */
public class n2 {
    public static Object a(String str, String str2, Class<?>[] clsArr, Object[] objArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean b() {
        try {
            Class.forName("com.webengage.cordova.WebEngagePlugin");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean c() {
        try {
            S6.a aVar = AbstractC5131n.f44873a;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        try {
            Parcelable.Creator<C5127j> creator = C5127j.CREATOR;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean g() {
        try {
            Class.forName("com.google.android.gms.gcm.GoogleCloudMessaging");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean h() {
        return true;
    }

    public static boolean i() {
        try {
            return InterfaceC5121d.class.isInterface();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean j() {
        try {
            return InterfaceC5125h.class.isInterface();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean k() {
        return c() && i() && j() && l();
    }

    public static boolean l() {
        return true;
    }

    public static boolean m() {
        try {
            Parcelable.Creator<LocationResult> creator = LocationResult.CREATOR;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean a() {
        return true;
    }
}
