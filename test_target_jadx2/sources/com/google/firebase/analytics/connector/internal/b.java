package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.AbstractC2657d4;
import com.google.common.collect.i;
import com.google.common.collect.k;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final k f27949a = k.D("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final i f27950b = i.D("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final i f27951c = i.B("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final i f27952d = i.A("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final i f27953e = new i.a().e(AbstractC2657d4.f25885a).e(AbstractC2657d4.f25886b).f();

    /* renamed from: f, reason: collision with root package name */
    private static final i f27954f = i.A("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27955g = 0;

    public static boolean a(String str) {
        return !f27951c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f27950b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        i iVar = f27952d;
        int size = iVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean containsKey = bundle.containsKey((String) iVar.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f27953e.contains(str2)) {
            return false;
        }
        i iVar = f27954f;
        int size = iVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean matches = str2.matches((String) iVar.get(i10));
            i10++;
            if (matches) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        char c10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        i iVar = f27952d;
        int size = iVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean containsKey = bundle.containsKey((String) iVar.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("fdl")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (c10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (c10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
