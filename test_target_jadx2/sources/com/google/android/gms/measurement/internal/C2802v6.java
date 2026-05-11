package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2802v6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2810w6 f26416a;

    C2802v6(C2810w6 c2810w6) {
        Objects.requireNonNull(c2810w6);
        this.f26416a = c2810w6;
    }

    final void a() {
        C2810w6 c2810w6 = this.f26416a;
        c2810w6.h();
        C2760q3 c2760q3 = c2810w6.f25694a;
        if (c2760q3.x().A(c2760q3.f().a())) {
            c2760q3.x().f25640m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c2760q3.a().w().a("Detected application was in foreground");
                c(c2760q3.f().a(), false);
            }
        }
    }

    final void b(long j10, boolean z10) {
        C2810w6 c2810w6 = this.f26416a;
        c2810w6.h();
        c2810w6.q();
        C2760q3 c2760q3 = c2810w6.f25694a;
        if (c2760q3.x().A(j10)) {
            c2760q3.x().f25640m.b(true);
            c2810w6.f25694a.L().p();
        }
        c2760q3.x().f25644q.b(j10);
        if (c2760q3.x().f25640m.a()) {
            c(j10, z10);
        }
    }

    final void c(long j10, boolean z10) {
        C2810w6 c2810w6 = this.f26416a;
        c2810w6.h();
        if (c2810w6.f25694a.g()) {
            C2760q3 c2760q3 = c2810w6.f25694a;
            c2760q3.x().f25644q.b(j10);
            c2760q3.a().w().b("Session started, time", Long.valueOf(c2760q3.f().c()));
            long j11 = j10 / 1000;
            C2760q3 c2760q32 = c2810w6.f25694a;
            c2760q32.B().B("auto", "_sid", Long.valueOf(j11), j10);
            c2760q3.x().f25645r.b(j11);
            c2760q3.x().f25640m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            c2760q32.B().u("auto", "_s", j10, bundle);
            String a10 = c2760q3.x().f25650w.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a10);
            c2760q32.B().u("auto", "_ssr", j10, bundle2);
        }
    }
}
