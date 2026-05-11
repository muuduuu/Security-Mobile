package T6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class V extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f9385a;

    /* renamed from: b, reason: collision with root package name */
    private final U f9386b;

    public V(U u10) {
        this.f9386b = u10;
    }

    public final void a(Context context) {
        this.f9385a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f9385a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f9385a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f9386b.a();
            b();
        }
    }
}
