package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x4.C5109a;

/* renamed from: com.facebook.react.devsupport.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1873i implements P4.a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final a f21617e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f21618a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f21619b;

    /* renamed from: c, reason: collision with root package name */
    private final V4.d f21620c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21621d;

    /* renamed from: com.facebook.react.devsupport.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.facebook.react.devsupport.i$b */
    public interface b {
        void a();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC1873i(Context applicationContext, b bVar) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f21618a = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f21619b = defaultSharedPreferences;
        this.f21620c = new V4.d(applicationContext);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f21621d = C5109a.f44775b;
    }

    @Override // P4.a
    public boolean a() {
        return this.f21619b.getBoolean("inspector_debug", false);
    }

    @Override // P4.a
    public void b(boolean z10) {
        this.f21619b.edit().putBoolean("inspector_debug", z10).apply();
    }

    @Override // P4.a
    public void c(boolean z10) {
        this.f21619b.edit().putBoolean("hot_module_replacement", z10).apply();
    }

    @Override // P4.a
    public boolean d() {
        return this.f21619b.getBoolean("js_minify_debug", false);
    }

    @Override // P4.a
    public boolean e() {
        return this.f21619b.getBoolean("fps_debug", false);
    }

    @Override // P4.a
    public void f(boolean z10) {
        this.f21619b.edit().putBoolean("fps_debug", z10).apply();
    }

    @Override // P4.a
    public void g(boolean z10) {
        this.f21619b.edit().putBoolean("remote_js_debug", z10).apply();
    }

    @Override // P4.a
    public boolean h() {
        return this.f21619b.getBoolean("js_dev_mode_debug", true);
    }

    @Override // P4.a
    public boolean i() {
        return this.f21619b.getBoolean("hot_module_replacement", true);
    }

    @Override // P4.a
    public V4.d j() {
        return this.f21620c;
    }

    @Override // P4.a
    public boolean k() {
        return this.f21621d;
    }

    @Override // P4.a
    public void l(boolean z10) {
        this.f21619b.edit().putBoolean("js_dev_mode_debug", z10).apply();
    }

    @Override // P4.a
    public boolean m() {
        return this.f21619b.getBoolean("remote_js_debug", false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (this.f21618a != null) {
            if (Intrinsics.b("fps_debug", str) || Intrinsics.b("js_dev_mode_debug", str) || Intrinsics.b("js_minify_debug", str)) {
                this.f21618a.a();
            }
        }
    }
}
