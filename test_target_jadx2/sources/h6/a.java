package H6;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b7.C1653b;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.common.C2018j;
import com.google.android.gms.common.C2019k;
import com.google.android.gms.common.ServiceConnectionC2005a;
import i7.AbstractBinderC3327e;
import i7.InterfaceC3328f;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC2005a f3091a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC3328f f3092b;

    /* renamed from: c, reason: collision with root package name */
    boolean f3093c;

    /* renamed from: d, reason: collision with root package name */
    final Object f3094d = new Object();

    /* renamed from: e, reason: collision with root package name */
    c f3095e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f3096f;

    /* renamed from: g, reason: collision with root package name */
    final long f3097g;

    /* renamed from: H6.a$a, reason: collision with other inner class name */
    public static final class C0076a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3098a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3099b;

        public C0076a(String str, boolean z10) {
            this.f3098a = str;
            this.f3099b = z10;
        }

        public String a() {
            return this.f3098a;
        }

        public boolean b() {
            return this.f3099b;
        }

        public String toString() {
            String str = this.f3098a;
            boolean z10 = this.f3099b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        AbstractC1287s.m(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f3096f = context;
        this.f3093c = false;
        this.f3097g = j10;
    }

    public static C0076a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0076a f10 = aVar.f(-1);
            aVar.e(f10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, BuildConfig.FLAVOR, null);
            return f10;
        } finally {
        }
    }

    private final C0076a f(int i10) {
        C0076a c0076a;
        AbstractC1287s.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f3093c) {
                    synchronized (this.f3094d) {
                        c cVar = this.f3095e;
                        if (cVar == null || !cVar.f3104d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f3093c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                AbstractC1287s.m(this.f3091a);
                AbstractC1287s.m(this.f3092b);
                try {
                    c0076a = new C0076a(this.f3092b.a(), this.f3092b.y(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0076a;
    }

    private final void g() {
        synchronized (this.f3094d) {
            c cVar = this.f3095e;
            if (cVar != null) {
                cVar.f3103c.countDown();
                try {
                    this.f3095e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f3097g;
            if (j10 > 0) {
                this.f3095e = new c(this, j10);
            }
        }
    }

    public final void c() {
        AbstractC1287s.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3096f == null || this.f3091a == null) {
                    return;
                }
                try {
                    if (this.f3093c) {
                        C1653b.b().c(this.f3096f, this.f3091a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f3093c = false;
                this.f3092b = null;
                this.f3091a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(boolean z10) {
        AbstractC1287s.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3093c) {
                    c();
                }
                Context context = this.f3096f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int j10 = C2018j.h().j(context, AbstractC2022n.f23510a);
                    if (j10 != 0 && j10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2005a serviceConnectionC2005a = new ServiceConnectionC2005a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C1653b.b().a(context, intent, serviceConnectionC2005a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f3091a = serviceConnectionC2005a;
                        try {
                            this.f3092b = AbstractBinderC3327e.p(serviceConnectionC2005a.b(10000L, TimeUnit.MILLISECONDS));
                            this.f3093c = true;
                            if (z10) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C2019k(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean e(C0076a c0076a, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (c0076a != null) {
            hashMap.put("limit_ad_tracking", true != c0076a.b() ? "0" : "1");
            String a10 = c0076a.a();
            if (a10 != null) {
                hashMap.put("ad_id_size", Integer.toString(a10.length()));
            }
        }
        if (th != null) {
            hashMap.put(AppConstants.VIDEO_RECORDING_ERROR, th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new b(this, hashMap).start();
        return true;
    }

    protected final void finalize() {
        c();
        super.finalize();
    }

    public static void b(boolean z10) {
    }
}
