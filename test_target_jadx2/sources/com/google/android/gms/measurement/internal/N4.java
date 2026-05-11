package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes2.dex */
final class N4 implements Application.ActivityLifecycleCallbacks, L4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25577a;

    N4(C2642b5 c2642b5) {
        Objects.requireNonNull(c2642b5);
        this.f25577a = c2642b5;
    }

    @Override // com.google.android.gms.measurement.internal.L4
    public final void a(com.google.android.gms.internal.measurement.J0 j02) {
        C2760q3 c2760q3 = this.f25577a.f25694a;
        c2760q3.I().x(j02);
        C2810w6 z10 = c2760q3.z();
        C2760q3 c2760q32 = z10.f25694a;
        c2760q32.b().t(new RunnableC2747o6(z10, c2760q32.f().c()));
    }

    @Override // com.google.android.gms.measurement.internal.L4
    public final void b(com.google.android.gms.internal.measurement.J0 j02) {
        this.f25577a.f25694a.I().z(j02);
    }

    @Override // com.google.android.gms.measurement.internal.L4
    public final void c(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        this.f25577a.f25694a.I().y(j02, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.L4
    public final void d(com.google.android.gms.internal.measurement.J0 j02) {
        C2760q3 c2760q3 = this.f25577a.f25694a;
        C2810w6 z10 = c2760q3.z();
        C2760q3 c2760q32 = z10.f25694a;
        c2760q32.b().t(new RunnableC2739n6(z10, c2760q32.f().c()));
        c2760q3.I().w(j02);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // com.google.android.gms.measurement.internal.L4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        C2760q3 c2760q3;
        C2642b5 c2642b5;
        C2760q3 c2760q32;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        try {
            try {
                c2642b5 = this.f25577a;
                c2760q32 = c2642b5.f25694a;
                c2760q32.a().w().a("onActivityCreated");
                intent = j02.f24245c;
            } catch (RuntimeException e10) {
                this.f25577a.f25694a.a().o().b("Throwable caught in onActivityCreated", e10);
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        c2760q32.C();
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            c2760q32.b().t(new M4(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                            c2760q3 = this.f25577a.f25694a;
                            c2760q3.I().v(j02, bundle);
                        }
                        str = "gs";
                        c2760q32.b().t(new M4(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                        c2760q3 = this.f25577a.f25694a;
                        c2760q3.I().v(j02, bundle);
                    }
                }
                Bundle extras = intent.getExtras();
                uri = null;
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                    }
                }
                if (uri != null) {
                    c2760q32.C();
                    stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                        str = "auto";
                        c2760q32.b().t(new M4(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                        c2760q3 = this.f25577a.f25694a;
                        c2760q3.I().v(j02, bundle);
                    }
                    str = "gs";
                    c2760q32.b().t(new M4(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                    c2760q3 = this.f25577a.f25694a;
                    c2760q3.I().v(j02, bundle);
                }
            }
            c2760q3 = c2642b5.f25694a;
            c2760q3.I().v(j02, bundle);
        } catch (Throwable th) {
            this.f25577a.f25694a.I().v(j02, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(com.google.android.gms.internal.measurement.J0.j(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.J0.j(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(com.google.android.gms.internal.measurement.J0.j(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.J0.j(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(com.google.android.gms.internal.measurement.J0.j(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
