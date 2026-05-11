package Zb;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static o f12508b = new o();

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f12509a;

    private SharedPreferences a() {
        if (this.f12509a == null) {
            this.f12509a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f12509a;
    }

    public static o b() {
        return f12508b;
    }

    public String c(String str, String str2) {
        return a().getString(str, str2);
    }

    public SharedPreferences.Editor d(String str) {
        return a().edit().remove(str);
    }

    public void e(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }
}
