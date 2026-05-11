package androidx.work.impl.background.systemalarm;

import D1.p;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.P;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import x1.n;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f18252a = n.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f18253a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f18254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f18255c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f18253a = intent;
            this.f18254b = context;
            this.f18255c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f18253a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f18253a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f18253a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f18253a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                n.e().a(ConstraintProxyUpdateReceiver.f18252a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.c(this.f18254b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.c(this.f18254b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.c(this.f18254b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.c(this.f18254b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f18255c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            P.n(context).t().d(new a(intent, context, goAsync()));
            return;
        }
        n.e().a(f18252a, "Ignoring unknown action " + action);
    }
}
