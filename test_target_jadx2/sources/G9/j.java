package G9;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes2.dex */
public class j extends e {

    /* renamed from: j, reason: collision with root package name */
    private final a f2982j;

    /* renamed from: k, reason: collision with root package name */
    private Network f2983k;

    /* renamed from: l, reason: collision with root package name */
    private NetworkCapabilities f2984l;

    private class a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            j.this.f2983k = network;
            j.this.q(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.this.f2983k = network;
            j.this.f2984l = networkCapabilities;
            j.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (j.this.f2983k != null) {
                j.this.f2983k = network;
            }
            j.this.q(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i10) {
            j.this.f2983k = network;
            j.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.this.f2983k = null;
            j.this.f2984l = null;
            j.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            j.this.f2983k = null;
            j.this.f2984l = null;
            j.this.s();
        }

        private a() {
        }
    }

    public j(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f2983k = null;
        this.f2984l = null;
        this.f2982j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i10) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: G9.h
            @Override // java.lang.Runnable
            public final void run() {
                j.this.r();
            }
        }, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        try {
            this.f2984l = c().getNetworkCapabilities(this.f2983k);
            s();
        } catch (SecurityException unused) {
        }
    }

    @Override // G9.e
    public void g() {
        try {
            this.f2983k = c().getActiveNetwork();
            q(0);
            c().registerDefaultNetworkCallback(this.f2982j);
        } catch (SecurityException unused) {
        }
    }

    @Override // G9.e
    public void j() {
        try {
            c().unregisterNetworkCallback(this.f2982j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void s() {
        NetworkInfo networkInfo;
        H9.b bVar = H9.b.UNKNOWN;
        Network network = this.f2983k;
        NetworkCapabilities networkCapabilities = this.f2984l;
        H9.a aVar = null;
        boolean z10 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = H9.b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                bVar = H9.b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                bVar = H9.b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                bVar = H9.b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                bVar = H9.b.VPN;
            }
            if (network != null) {
                try {
                    networkInfo = c().getNetworkInfo(network);
                } catch (SecurityException unused) {
                }
                boolean z11 = (networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16) || (Build.VERSION.SDK_INT < 28 ? networkCapabilities.hasCapability(21) ^ true : network != null && networkInfo != null && !networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED))) ? false : true;
                if (networkCapabilities.hasTransport(4)) {
                    z10 = z11;
                } else if (z11 && networkCapabilities.getLinkDownstreamBandwidthKbps() != 0) {
                    z10 = true;
                }
                if (network != null && bVar == H9.b.CELLULAR && z10) {
                    aVar = H9.a.fromNetworkInfo(networkInfo);
                }
            }
            networkInfo = null;
            if (networkCapabilities.hasCapability(12)) {
            }
            if (networkCapabilities.hasTransport(4)) {
            }
            if (network != null) {
                aVar = H9.a.fromNetworkInfo(networkInfo);
            }
        } else {
            bVar = H9.b.NONE;
        }
        k(bVar, aVar, z10);
    }
}
