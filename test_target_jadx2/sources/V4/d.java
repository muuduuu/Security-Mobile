package V4;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import c3.AbstractC1721a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final a f10832e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final String f10833f = d.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    private final Context f10834a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f10835b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10836c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10837d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f10834a = appContext;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f10835b = defaultSharedPreferences;
        String packageName = appContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.f10836c = packageName;
        this.f10837d = new LinkedHashMap();
    }

    public final Map a() {
        return this.f10837d;
    }

    public String b() {
        String string = this.f10835b.getString("debug_http_host", null);
        if (string != null && string.length() > 0) {
            return string;
        }
        String h10 = S4.a.h(this.f10834a);
        if (Intrinsics.b(h10, "localhost")) {
            AbstractC1721a.J(f10833f, "You seem to be running on device. Run '" + S4.a.a(this.f10834a) + "' to forward the debug server's port to the device.");
        }
        Intrinsics.d(h10);
        return h10;
    }

    public final String c() {
        return this.f10836c;
    }

    public void d(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f10835b.edit().putString("debug_http_host", host).apply();
    }
}
