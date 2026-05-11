package R6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c7.ThreadFactoryC1738b;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: e, reason: collision with root package name */
    private static D f8565e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f8566a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f8567b;

    /* renamed from: c, reason: collision with root package name */
    private x f8568c = new x(this, null);

    /* renamed from: d, reason: collision with root package name */
    private int f8569d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8567b = scheduledExecutorService;
        this.f8566a = context.getApplicationContext();
    }

    public static synchronized D b(Context context) {
        D d10;
        synchronized (D.class) {
            try {
                if (f8565e == null) {
                    m7.e.a();
                    f8565e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC1738b("MessengerIpcClient"))));
                }
                d10 = f8565e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d10;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f8569d;
        this.f8569d = i10 + 1;
        return i10;
    }

    private final synchronized Task g(A a10) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a10.toString()));
            }
            if (!this.f8568c.g(a10)) {
                x xVar = new x(this, null);
                this.f8568c = xVar;
                xVar.g(a10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a10.f8562b.a();
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new C(f(), i10, bundle));
    }
}
