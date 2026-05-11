package V6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import b7.C1653b;
import com.google.android.gms.common.C2010b;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class y0 extends AbstractC1278i {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f11036g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Context f11037h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Handler f11038i;

    /* renamed from: j, reason: collision with root package name */
    private final x0 f11039j;

    /* renamed from: k, reason: collision with root package name */
    private final C1653b f11040k;

    /* renamed from: l, reason: collision with root package name */
    private final long f11041l;

    /* renamed from: m, reason: collision with root package name */
    private final long f11042m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Executor f11043n;

    y0(Context context, Looper looper, Executor executor) {
        x0 x0Var = new x0(this, null);
        this.f11039j = x0Var;
        this.f11037h = context.getApplicationContext();
        this.f11038i = new n7.p(looper, x0Var);
        this.f11040k = C1653b.b();
        this.f11041l = 5000L;
        this.f11042m = 300000L;
        this.f11043n = executor;
    }

    @Override // V6.AbstractC1278i
    protected final C2010b e(v0 v0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        C2010b c2010b;
        AbstractC1287s.n(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f11036g;
        synchronized (hashMap) {
            try {
                w0 w0Var = (w0) hashMap.get(v0Var);
                if (executor == null) {
                    executor = this.f11043n;
                }
                if (w0Var == null) {
                    w0Var = new w0(this, v0Var);
                    w0Var.b(serviceConnection, serviceConnection, str);
                    c2010b = w0Var.j(str, executor);
                    hashMap.put(v0Var, w0Var);
                } else {
                    this.f11038i.removeMessages(0, v0Var);
                    if (w0Var.f(serviceConnection)) {
                        String obj = v0Var.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(obj);
                        throw new IllegalStateException(sb2.toString());
                    }
                    w0Var.b(serviceConnection, serviceConnection, str);
                    int e10 = w0Var.e();
                    if (e10 == 1) {
                        serviceConnection.onServiceConnected(w0Var.i(), w0Var.h());
                    } else if (e10 == 2) {
                        c2010b = w0Var.j(str, executor);
                    }
                    c2010b = null;
                }
                if (w0Var.d()) {
                    return C2010b.f23474f;
                }
                if (c2010b == null) {
                    c2010b = new C2010b(-1);
                }
                return c2010b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V6.AbstractC1278i
    protected final void g(v0 v0Var, ServiceConnection serviceConnection, String str) {
        AbstractC1287s.n(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f11036g;
        synchronized (hashMap) {
            try {
                w0 w0Var = (w0) hashMap.get(v0Var);
                if (w0Var == null) {
                    String obj = v0Var.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!w0Var.f(serviceConnection)) {
                    String obj2 = v0Var.toString();
                    StringBuilder sb3 = new StringBuilder(obj2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(obj2);
                    throw new IllegalStateException(sb3.toString());
                }
                w0Var.c(serviceConnection, str);
                if (w0Var.g()) {
                    this.f11038i.sendMessageDelayed(this.f11038i.obtainMessage(0, v0Var), this.f11041l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ HashMap h() {
        return this.f11036g;
    }

    final /* synthetic */ Context i() {
        return this.f11037h;
    }

    final /* synthetic */ Handler j() {
        return this.f11038i;
    }

    final /* synthetic */ C1653b k() {
        return this.f11040k;
    }

    final /* synthetic */ long l() {
        return this.f11042m;
    }
}
