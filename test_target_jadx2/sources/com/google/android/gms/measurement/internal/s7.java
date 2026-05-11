package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C2301m7;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class s7 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final C2760q3 f26344a;

    public s7(C2760q3 c2760q3) {
        this.f26344a = c2760q3;
    }

    final /* synthetic */ void a() {
        this.f26344a.N().o(((Long) AbstractC2671f2.f25941D.b(null)).longValue());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c10;
        if (intent == null) {
            this.f26344a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f26344a.a().r().a("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                this.f26344a.a().r().a("App receiver called with unknown action");
                return;
            }
            C2760q3 c2760q3 = this.f26344a;
            c2760q3.a().w().a("[sgtm] App Receiver notified batches are available");
            c2760q3.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.p7
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    s7.this.a();
                }
            });
            return;
        }
        final C2760q3 c2760q32 = this.f26344a;
        C2301m7.a();
        if (c2760q32.w().H(null, AbstractC2671f2.f25970R0)) {
            c2760q32.a().w().a("App receiver notified triggers are available");
            c2760q32.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.q7
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C2760q3 c2760q33 = C2760q3.this;
                    if (!c2760q33.C().G()) {
                        c2760q33.a().r().a("registerTrigger called but app not eligible");
                        return;
                    }
                    c2760q33.B().t0();
                    final C2642b5 B10 = c2760q33.B();
                    Objects.requireNonNull(B10);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.r7
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            C2642b5.this.u0();
                        }
                    }).start();
                }
            });
        }
    }
}
