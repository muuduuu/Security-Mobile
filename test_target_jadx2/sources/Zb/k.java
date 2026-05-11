package Zb;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private static k f12505b = new k();

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f12506a;

    private SharedPreferences c() {
        if (this.f12506a == null) {
            this.f12506a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f12506a;
    }

    public static k d() {
        return f12505b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : c().getAll().entrySet()) {
            m.g(entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public void e(String str, boolean z10) {
        c().edit().putBoolean(str, z10).apply();
    }

    public void f(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }
}
