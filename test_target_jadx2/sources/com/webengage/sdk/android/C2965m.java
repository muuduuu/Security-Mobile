package com.webengage.sdk.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.webengage.sdk.android.utils.DataType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;

/* renamed from: com.webengage.sdk.android.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2965m {

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f30720b;

    /* renamed from: a, reason: collision with root package name */
    public Context f30721a;

    static {
        ArrayList arrayList = new ArrayList();
        f30720b = arrayList;
        arrayList.add("com.webengage.static.interfaceID");
    }

    protected C2965m(Context context) {
        this.f30721a = null;
        this.f30721a = context.getApplicationContext();
    }

    private Set<String> o() {
        return new HashSet(b("webengage_prefs.txt").getStringSet("push_shown", new HashSet()));
    }

    void a() {
        Set<String> o10 = o();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        HashSet hashSet = new HashSet();
        for (String str : o10) {
            try {
                if (System.currentTimeMillis() - simpleDateFormat.parse(str.substring(str.lastIndexOf(" ") + 1)).getTime() < 604800000) {
                    hashSet.add(str);
                }
            } catch (ParseException e10) {
                Logger.d("WebEngage", "Exception while parsing push shown date" + e10);
            }
        }
        a("push_shown", hashSet);
    }

    protected long b() {
        return b("webengage_prefs.txt").getLong("amplify_interval", 10800000L);
    }

    public String c(String str) {
        return b("webengage_persistent_prefs.txt").getString("com.webengage.magic." + str, BuildConfig.FLAVOR);
    }

    public String d() {
        return b("webengage_prefs.txt").getString("com.webengage.static.cuid", BuildConfig.FLAVOR);
    }

    public Map<String, Map<String, String>> e() {
        try {
            return (Map) DataType.convert(b("webengage_prefs.txt").getString("com.webengage.session.control_group", BuildConfig.FLAVOR), DataType.MAP, false);
        } catch (Exception unused) {
            return null;
        }
    }

    public String f() {
        return b("webengage_prefs.txt").getString("com.webengage.static.hwRegID", BuildConfig.FLAVOR);
    }

    public String g() {
        String string = b("webengage_persistent_prefs.txt").getString("com.webengage.static.interfaceID", BuildConfig.FLAVOR);
        return string.isEmpty() ? b("webengage_prefs.txt").getString("com.webengage.static.interfaceID", BuildConfig.FLAVOR) : string;
    }

    public String h() {
        return b("webengage_prefs.txt").getString("com.webengage.static.luid", BuildConfig.FLAVOR);
    }

    public String i() {
        return b("webengage_prefs.txt").getString("com.webengage.static.regID", BuildConfig.FLAVOR);
    }

    public String j() {
        return b("webengage_prefs.txt").getString("com.webengage.session.suid", BuildConfig.FLAVOR);
    }

    public long k() {
        return b("webengage_prefs.txt").getLong("we_sdt_sc_at", -1L);
    }

    protected long l() {
        return b("webengage_prefs.txt").getLong("session_destroy_time", -1L);
    }

    public List<String> m() {
        try {
            return (List) DataType.convert(b("webengage_prefs.txt").getString("com.webengage.session.evaluatedIds", BuildConfig.FLAVOR), DataType.LIST, false);
        } catch (Exception unused) {
            return null;
        }
    }

    Set<String> n() {
        Set<String> o10 = o();
        HashSet hashSet = new HashSet();
        for (String str : o10) {
            hashSet.add(str.substring(0, str.lastIndexOf(" ")));
        }
        return hashSet;
    }

    public Map<String, Map<String, String>> p() {
        try {
            return (Map) DataType.convert(b("webengage_prefs.txt").getString("com.webengage.session.variations", BuildConfig.FLAVOR), DataType.MAP, false);
        } catch (Exception unused) {
            return null;
        }
    }

    public int q() {
        return b("webengage_prefs.txt").getInt("com.webengage.static.version_code", -1);
    }

    public String r() {
        return b("webengage_prefs.txt").getString("com.webengage.static.we_instance_id", BuildConfig.FLAVOR);
    }

    public String s() {
        return b("webengage_prefs.txt").getString("com.webengage.static.mIregion", null);
    }

    public String t() {
        return b("webengage_prefs.txt").getString("com.webengage.static.mIregID", BuildConfig.FLAVOR);
    }

    public boolean u() {
        return b("webengage_prefs.txt").getBoolean("enable_ad_id", false);
    }

    boolean v() {
        return b("webengage_prefs.txt").getBoolean("install_referrer_set", true);
    }

    protected void a(long j10) {
        a("amplify_interval", Long.valueOf(j10));
    }

    public SharedPreferences b(String str) {
        return this.f30721a.getSharedPreferences(str, 0);
    }

    public void c(long j10) {
        a("we_sdt_sc_at", Long.valueOf(j10));
    }

    public String d(String str) {
        return b("webengage_volatile_prefs.txt").getString(str, BuildConfig.FLAVOR);
    }

    public void e(String str) {
        SharedPreferences.Editor edit = b("webengage_persistent_prefs.txt").edit();
        edit.remove("com.webengage.magic." + str);
        edit.apply();
    }

    public void f(String str) {
        SharedPreferences.Editor edit = b("webengage_volatile_prefs.txt").edit();
        edit.remove(str);
        edit.apply();
    }

    public void g(String str) {
        Logger.d("WebEngage", "HW token: " + str);
        a("com.webengage.static.hwRegID", (Object) str);
    }

    public void h(String str) {
        Logger.d("WebEngage", "Push token: " + str);
        a("com.webengage.static.regID", (Object) str);
    }

    void i(String str) {
        if (str != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str2 = str + " " + simpleDateFormat.format(new Date());
            Set<String> o10 = o();
            o10.add(str2);
            a("push_shown", o10);
        }
    }

    public void j(String str) {
        Logger.d("WebEngage", "MI region: " + str);
        a("com.webengage.static.mIregion", (Object) str);
    }

    public void k(String str) {
        Logger.d("WebEngage", "MI token: " + str);
        a("com.webengage.static.mIregID", (Object) str);
    }

    public void a(Boolean bool) {
        a("webengage_prefs.txt", "enable_ad_id", bool, true);
    }

    protected void b(long j10) {
        a("session_destroy_time", Long.valueOf(j10));
    }

    public boolean c() {
        return b("webengage_volatile_prefs.txt").getBoolean("com.webengage.static.app_crashed", false);
    }

    public void a(String str, String str2) {
        b("webengage_persistent_prefs.txt");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a("webengage_persistent_prefs.txt", "com.webengage.magic." + str, str2);
    }

    public void b(String str, String str2) {
        a("webengage_volatile_prefs.txt", str, str2, true);
    }

    public void a(List<String> list) {
        try {
            a("com.webengage.session.evaluatedIds", DataType.convert(list, DataType.STRING, false));
        } catch (Exception unused) {
        }
    }

    public void b(Map<String, Map<String, String>> map) {
        try {
            a("com.webengage.session.variations", DataType.convert(map, DataType.STRING, false));
        } catch (Exception unused) {
        }
    }

    public void a(Map<String, Map<String, String>> map) {
        try {
            a("com.webengage.session.control_group", DataType.convert(map, DataType.STRING, false));
        } catch (Exception unused) {
        }
    }

    public boolean a(String str) {
        return b(str).edit().clear().commit();
    }

    public boolean a(String str, Object obj) {
        return a(str, obj, true);
    }

    public boolean a(String str, Object obj, boolean z10) {
        return a(f30720b.contains(str) ? "webengage_persistent_prefs.txt" : "webengage_prefs.txt", str, obj, z10);
    }

    public boolean a(String str, String str2, Object obj) {
        return a(str, str2, obj, true);
    }

    public boolean a(String str, String str2, Object obj, boolean z10) {
        SharedPreferences b10 = b(str);
        if (b10 == null) {
            return false;
        }
        if (!z10 && b10.contains(str2)) {
            return true;
        }
        SharedPreferences.Editor edit = b10.edit();
        if (obj instanceof String) {
            edit.putString(str2, String.valueOf(obj));
        } else if (obj instanceof Integer) {
            edit.putInt(str2, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str2, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str2, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            edit.putLong(str2, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            edit.putStringSet(str2, (Set) obj);
        }
        edit.apply();
        return true;
    }
}
