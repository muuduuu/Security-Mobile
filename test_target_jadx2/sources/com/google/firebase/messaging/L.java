package com.google.firebase.messaging;

import D7.AbstractC0789m;
import G8.a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import j8.C3511e;
import java.util.concurrent.ExecutionException;
import m8.InterfaceC3657a;
import s6.AbstractC4318d;
import s6.AbstractC4320f;
import s6.C4317c;
import s6.InterfaceC4321g;
import s6.InterfaceC4323i;

/* loaded from: classes2.dex */
public abstract class L {
    static void A(String str, Bundle bundle) {
        try {
            C3511e.n();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d10 = d(bundle);
            if (d10 != null) {
                bundle2.putString("_nmid", d10);
            }
            String e10 = e(bundle);
            if (e10 != null) {
                bundle2.putString("_nmn", e10);
            }
            String i10 = i(bundle);
            if (!TextUtils.isEmpty(i10)) {
                bundle2.putString("label", i10);
            }
            String g10 = g(bundle);
            if (!TextUtils.isEmpty(g10)) {
                bundle2.putString("message_channel", g10);
            }
            String r10 = r(bundle);
            if (r10 != null) {
                bundle2.putString("_nt", r10);
            }
            String l10 = l(bundle);
            if (l10 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(l10));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e11);
                }
            }
            String t10 = t(bundle);
            if (t10 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(t10));
                } catch (NumberFormatException e12) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e12);
                }
            }
            String n10 = n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", n10);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC3657a interfaceC3657a = (InterfaceC3657a) C3511e.n().j(InterfaceC3657a.class);
            if (interfaceC3657a != null) {
                interfaceC3657a.c("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    static void B(boolean z10) {
        C3511e.n().l().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z10).apply();
    }

    private static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC3657a interfaceC3657a = (InterfaceC3657a) C3511e.n().j(InterfaceC3657a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC3657a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC3657a.f("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC3657a.c("fcm", "_cmp", bundle2);
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean E(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return F(intent.getExtras());
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C3511e.n();
            Context l10 = C3511e.n().l();
            SharedPreferences sharedPreferences = l10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = l10.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(l10.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static G8.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0070a j10 = G8.a.p().n(s(extras)).e(bVar).f(f(extras)).i(o()).l(a.d.ANDROID).h(m(extras)).j(k(extras));
        String h10 = h(extras);
        if (h10 != null) {
            j10.g(h10);
        }
        String r10 = r(extras);
        if (r10 != null) {
            j10.m(r10);
        }
        String c10 = c(extras);
        if (c10 != null) {
            j10.c(c10);
        }
        String i10 = i(extras);
        if (i10 != null) {
            j10.b(i10);
        }
        String e10 = e(extras);
        if (e10 != null) {
            j10.d(e10);
        }
        long q10 = q(extras);
        if (q10 > 0) {
            j10.k(q10);
        }
        return j10.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) AbstractC0789m.a(com.google.firebase.installations.c.t(C3511e.n()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    private static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    static int k(Bundle bundle) {
        int p10 = p(bundle);
        if (p10 == 2) {
            return 5;
        }
        return p10 == 1 ? 10 : 0;
    }

    static String l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static a.c m(Bundle bundle) {
        return (bundle == null || !N.t(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    static String n(Bundle bundle) {
        return (bundle == null || !N.t(bundle)) ? "data" : "display";
    }

    static String o() {
        return C3511e.n().l().getPackageName();
    }

    static int p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return j(string);
    }

    static long q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        C3511e n10 = C3511e.n();
        String f10 = n10.q().f();
        if (f10 != null) {
            try {
                return Long.parseLong(f10);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String c10 = n10.q().c();
        if (c10.startsWith("1:")) {
            String[] split = c10.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing app ID", e12);
            }
        } else {
            try {
                return Long.parseLong(c10);
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing app ID", e13);
            }
        }
        return 0L;
    }

    static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    static String t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A("_nd", intent.getExtras());
    }

    public static void w(Intent intent) {
        A("_nf", intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A("_no", bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A("_nr", intent.getExtras());
        }
        if (D(intent)) {
            z(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.y());
        }
    }

    private static void z(a.b bVar, Intent intent, InterfaceC4323i interfaceC4323i) {
        if (interfaceC4323i == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        G8.a b10 = b(bVar, intent);
        if (b10 == null) {
            return;
        }
        try {
            interfaceC4323i.a("FCM_CLIENT_EVENT_LOGGING", G8.b.class, C4317c.b("proto"), new InterfaceC4321g() { // from class: com.google.firebase.messaging.K
                @Override // s6.InterfaceC4321g
                public final Object apply(Object obj) {
                    return ((G8.b) obj).c();
                }
            }).a(AbstractC4318d.f(G8.b.b().b(b10).a(), AbstractC4320f.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }
}
