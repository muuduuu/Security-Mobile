package b7;

import V6.AbstractC1287s;
import V6.z0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.m;
import d7.C2998d;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1653b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f18861b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile C1653b f18862c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f18863a = new ConcurrentHashMap();

    private C1653b() {
    }

    public static C1653b b() {
        if (f18862c == null) {
            synchronized (f18861b) {
                try {
                    if (f18862c == null) {
                        f18862c = new C1653b();
                    }
                } finally {
                }
            }
        }
        C1653b c1653b = f18862c;
        AbstractC1287s.m(c1653b);
        return c1653b;
    }

    private final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C2998d.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f18863a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean h10 = h(context, intent, serviceConnection, i10, executor);
            if (h10) {
                return h10;
            }
            return false;
        } finally {
            this.f18863a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof z0);
    }

    private static void g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        if (executor == null) {
            executor = null;
        }
        if (!m.g() || executor == null) {
            return context.bindService(intent, serviceConnection, i10);
        }
        bindService = context.bindService(intent, i10, executor, serviceConnection);
        return bindService;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (f(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.f18863a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    g(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.f18863a.remove(serviceConnection);
                }
            }
        }
        g(context, serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return e(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
