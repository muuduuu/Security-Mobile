package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2411z1;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2731m6 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26178a;

    public C2731m6(Context context) {
        AbstractC1287s.m(context);
        this.f26178a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    private final void k(b7 b7Var, Runnable runnable) {
        b7Var.b().t(new RunnableC2691h6(this, b7Var, runnable));
    }

    public final void a() {
        Log.v("FA", this.f26178a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.f26178a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f26178a;
        C2760q3 O10 = C2760q3.O(context, null, null);
        final C2 a10 = O10.a();
        String action = intent.getAction();
        O10.c();
        a10.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(b7.F(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.l6
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C2731m6.this.f(i11, a10, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new S3(b7.F(this.f26178a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC1287s.m(string);
            b7 F10 = b7.F(this.f26178a);
            final C2 a10 = F10.a();
            F10.c();
            a10.w().b("Local AppMeasurementJobService called. action", str);
            k(F10, new Runnable() { // from class: com.google.android.gms.measurement.internal.j6
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C2731m6.this.g(a10, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C2411z1.s(this.f26178a, null).J(new Runnable() { // from class: com.google.android.gms.measurement.internal.k6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C2731m6.this.h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(int i10, C2 c22, Intent intent) {
        Context context = this.f26178a;
        InterfaceC2699i6 interfaceC2699i6 = (InterfaceC2699i6) context;
        if (interfaceC2699i6.b(i10)) {
            c22.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            C2760q3.O(context, null, null).a().w().a("Completed wakeful intent.");
            interfaceC2699i6.a(intent);
        }
    }

    final /* synthetic */ void g(C2 c22, JobParameters jobParameters) {
        c22.w().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC2699i6) this.f26178a).c(jobParameters, false);
    }

    final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC2699i6) this.f26178a).c(jobParameters, false);
    }
}
