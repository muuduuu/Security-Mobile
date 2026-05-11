package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.InterfaceC1638a;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14304a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final b.b f14305b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1638a f14306c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f14307d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f14308e;

    f(b.b bVar, InterfaceC1638a interfaceC1638a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f14305b = bVar;
        this.f14306c = interfaceC1638a;
        this.f14307d = componentName;
        this.f14308e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f14308e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public boolean c(Uri uri, Bundle bundle, List list) {
        try {
            return this.f14305b.J(this.f14306c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
