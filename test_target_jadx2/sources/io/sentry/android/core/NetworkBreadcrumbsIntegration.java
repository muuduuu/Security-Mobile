package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.C3405e;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34731a;

    /* renamed from: b, reason: collision with root package name */
    private final N f34732b;

    /* renamed from: c, reason: collision with root package name */
    private final ILogger f34733c;

    /* renamed from: d, reason: collision with root package name */
    b f34734d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f34735a;

        /* renamed from: b, reason: collision with root package name */
        final int f34736b;

        /* renamed from: c, reason: collision with root package name */
        final int f34737c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f34738d;

        /* renamed from: e, reason: collision with root package name */
        final String f34739e;

        a(NetworkCapabilities networkCapabilities, N n10) {
            io.sentry.util.n.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.n.c(n10, "BuildInfoProvider is required");
            this.f34735a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f34736b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = n10.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f34737c = signalStrength > -100 ? signalStrength : 0;
            this.f34738d = networkCapabilities.hasTransport(4);
            String d10 = io.sentry.android.core.internal.util.d.d(networkCapabilities, n10);
            this.f34739e = d10 == null ? BuildConfig.FLAVOR : d10;
        }

        boolean a(a aVar) {
            if (this.f34738d == aVar.f34738d && this.f34739e.equals(aVar.f34739e)) {
                int i10 = this.f34737c;
                int i11 = aVar.f34737c;
                if (-5 <= i10 - i11 && i10 - i11 <= 5) {
                    int i12 = this.f34735a;
                    int i13 = aVar.f34735a;
                    if (-1000 <= i12 - i13 && i12 - i13 <= 1000) {
                        int i14 = this.f34736b;
                        int i15 = aVar.f34736b;
                        if (-1000 <= i14 - i15 && i14 - i15 <= 1000) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    static final class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final io.sentry.L f34740a;

        /* renamed from: b, reason: collision with root package name */
        final N f34741b;

        /* renamed from: c, reason: collision with root package name */
        Network f34742c = null;

        /* renamed from: d, reason: collision with root package name */
        NetworkCapabilities f34743d = null;

        b(io.sentry.L l10, N n10) {
            this.f34740a = (io.sentry.L) io.sentry.util.n.c(l10, "Hub is required");
            this.f34741b = (N) io.sentry.util.n.c(n10, "BuildInfoProvider is required");
        }

        private C3405e a(String str) {
            C3405e c3405e = new C3405e();
            c3405e.l("system");
            c3405e.h("network.event");
            c3405e.i("action", str);
            c3405e.j(K1.INFO);
            return c3405e;
        }

        private a b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f34741b);
            }
            a aVar = new a(networkCapabilities, this.f34741b);
            a aVar2 = new a(networkCapabilities2, this.f34741b);
            if (aVar2.a(aVar)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.f34742c)) {
                return;
            }
            this.f34740a.w(a("NETWORK_AVAILABLE"));
            this.f34742c = network;
            this.f34743d = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            a b10;
            if (network.equals(this.f34742c) && (b10 = b(this.f34743d, networkCapabilities)) != null) {
                this.f34743d = networkCapabilities;
                C3405e a10 = a("NETWORK_CAPABILITIES_CHANGED");
                a10.i("download_bandwidth", Integer.valueOf(b10.f34735a));
                a10.i("upload_bandwidth", Integer.valueOf(b10.f34736b));
                a10.i("vpn_active", Boolean.valueOf(b10.f34738d));
                a10.i("network_type", b10.f34739e);
                int i10 = b10.f34737c;
                if (i10 != 0) {
                    a10.i("signal_strength", Integer.valueOf(i10));
                }
                io.sentry.A a11 = new io.sentry.A();
                a11.k("android:networkCapabilities", b10);
                this.f34740a.A(a10, a11);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(this.f34742c)) {
                this.f34740a.w(a("NETWORK_LOST"));
                this.f34742c = null;
                this.f34743d = null;
            }
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, N n10, ILogger iLogger) {
        this.f34731a = (Context) io.sentry.util.n.c(context, "Context is required");
        this.f34732b = (N) io.sentry.util.n.c(n10, "BuildInfoProvider is required");
        this.f34733c = (ILogger) io.sentry.util.n.c(iLogger, "ILogger is required");
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        ILogger iLogger = this.f34733c;
        K1 k12 = K1.DEBUG;
        iLogger.c(k12, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f34732b.d() < 21) {
                this.f34734d = null;
                this.f34733c.c(k12, "NetworkBreadcrumbsIntegration requires Android 5+", new Object[0]);
                return;
            }
            b bVar = new b(l10, this.f34732b);
            this.f34734d = bVar;
            if (io.sentry.android.core.internal.util.d.f(this.f34731a, this.f34733c, this.f34732b, bVar)) {
                this.f34733c.c(k12, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                a();
            } else {
                this.f34734d = null;
                this.f34733c.c(k12, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f34734d;
        if (bVar != null) {
            io.sentry.android.core.internal.util.d.g(this.f34731a, this.f34733c, this.f34732b, bVar);
            this.f34733c.c(K1.DEBUG, "NetworkBreadcrumbsIntegration remove.", new Object[0]);
        }
        this.f34734d = null;
    }
}
