package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC1873i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    private final P4.a f21584b;

    /* renamed from: c, reason: collision with root package name */
    private final C1874j f21585c;

    public static final class a implements SharedPreferencesOnSharedPreferenceChangeListenerC1873i.b {
        a() {
        }

        @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC1873i.b
        public void a() {
        }
    }

    public c0(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f21584b = new SharedPreferencesOnSharedPreferenceChangeListenerC1873i(applicationContext, new a());
        this.f21585c = new C1874j(w(), applicationContext, w().j());
    }

    @Override // com.facebook.react.devsupport.j0, C4.e
    public void m() {
        this.f21585c.h();
    }

    @Override // com.facebook.react.devsupport.j0, C4.e
    public P4.a w() {
        return this.f21584b;
    }

    @Override // com.facebook.react.devsupport.j0, C4.e
    public void z() {
        this.f21585c.z();
    }
}
