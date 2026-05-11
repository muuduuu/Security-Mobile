package com.google.android.gms.common;

import V6.AbstractBinderC1274f0;
import V6.AbstractC1287s;
import V6.InterfaceC1276g0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import e7.BinderC3090b;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
abstract class L {

    /* renamed from: g, reason: collision with root package name */
    static volatile InterfaceC1276g0 f23302g;

    /* renamed from: i, reason: collision with root package name */
    private static Context f23304i;

    /* renamed from: a, reason: collision with root package name */
    static final J f23296a = new A(G.m1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* renamed from: b, reason: collision with root package name */
    static final J f23297b = new B(G.m1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* renamed from: c, reason: collision with root package name */
    static final J f23298c = new C(G.m1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: d, reason: collision with root package name */
    static final J f23299d = new D(G.m1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: e, reason: collision with root package name */
    static final J f23300e = new E(G.m1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: f, reason: collision with root package name */
    static final J f23301f = new F(G.m1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: h, reason: collision with root package name */
    private static final Object f23303h = new Object();

    static synchronized void a(Context context) {
        synchronized (L.class) {
            if (f23304i != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f23304i = context.getApplicationContext();
            }
        }
    }

    static void b() {
        if (f23302g != null) {
            return;
        }
        AbstractC1287s.m(f23304i);
        synchronized (f23303h) {
            try {
                if (f23302g == null) {
                    f23302g = AbstractBinderC1274f0.k1(DynamiteModule.d(f23304i, DynamiteModule.f23557f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static W c(U u10) {
        W d10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC1287s.m(f23304i);
            try {
                b();
                AbstractC1287s.m(f23304i);
                M b10 = u10.b(f23304i);
                try {
                    O x02 = u10.a() ? f23302g.x0(b10) : f23302g.U0(b10);
                    if (x02.zza()) {
                        d10 = W.f(x02.I(), x02.u());
                    } else {
                        String j10 = x02.j();
                        PackageManager.NameNotFoundException nameNotFoundException = x02.F() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (j10 == null) {
                            j10 = "error checking package certificate";
                        }
                        d10 = W.g(x02.I(), x02.F(), j10, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    d10 = W.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                d10 = W.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d10;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    static W d(String str, G g10, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, g10, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static /* synthetic */ String e(boolean z10, String str, G g10) {
        String str2 = (z10 || !f(str, g10, true, false).f23329a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = com.google.android.gms.common.util.a.b("SHA-256");
        AbstractC1287s.m(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.k.a(b10.digest(g10.l1())), Boolean.valueOf(z10), "12451000.false");
    }

    private static W f(final String str, final G g10, final boolean z10, boolean z11) {
        try {
            b();
            AbstractC1287s.m(f23304i);
            try {
                return f23302g.T(new Q(str, g10, z10, z11), BinderC3090b.m1(f23304i.getPackageManager())) ? W.b() : new V(new Callable() { // from class: com.google.android.gms.common.I
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return L.e(z10, str, g10);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return W.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return W.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
