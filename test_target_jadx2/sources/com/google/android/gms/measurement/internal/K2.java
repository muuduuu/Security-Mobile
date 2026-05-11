package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
final class K2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final b7 f25516a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25517b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25518c;

    K2(b7 b7Var) {
        AbstractC1287s.m(b7Var);
        this.f25516a = b7Var;
    }

    public final void a() {
        b7 b7Var = this.f25516a;
        b7Var.O0();
        b7Var.b().h();
        if (this.f25517b) {
            return;
        }
        b7Var.e().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f25518c = b7Var.E0().m();
        b7Var.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f25518c));
        this.f25517b = true;
    }

    public final void b() {
        b7 b7Var = this.f25516a;
        b7Var.O0();
        b7Var.b().h();
        b7Var.b().h();
        if (this.f25517b) {
            b7Var.a().w().a("Unregistering connectivity change receiver");
            this.f25517b = false;
            this.f25518c = false;
            try {
                b7Var.e().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f25516a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    final /* synthetic */ b7 c() {
        return this.f25516a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b7 b7Var = this.f25516a;
        b7Var.O0();
        String action = intent.getAction();
        b7Var.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            b7Var.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m10 = b7Var.E0().m();
        if (this.f25518c != m10) {
            this.f25518c = m10;
            b7Var.b().t(new J2(this, m10));
        }
    }
}
