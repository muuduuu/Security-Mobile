package G9;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f2972a;

    /* renamed from: b, reason: collision with root package name */
    private final WifiManager f2973b;

    /* renamed from: c, reason: collision with root package name */
    private final TelephonyManager f2974c;

    /* renamed from: d, reason: collision with root package name */
    private final ReactApplicationContext f2975d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2976e = false;

    /* renamed from: f, reason: collision with root package name */
    private H9.b f2977f = H9.b.UNKNOWN;

    /* renamed from: g, reason: collision with root package name */
    private H9.a f2978g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2979h = false;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f2980i;

    e(ReactApplicationContext reactApplicationContext) {
        this.f2975d = reactApplicationContext;
        this.f2972a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f2973b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f2974c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private WritableMap b(String str) {
        WritableMap createMap;
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        int txLinkSpeedMbps;
        int rxLinkSpeedMbps;
        createMap = Arguments.createMap();
        str.hashCode();
        switch (str) {
            case "ethernet":
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                createMap.putString("ipAddress", nextElement.getHostAddress());
                                createMap.putString("subnet", f(nextElement));
                                return createMap;
                            }
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return createMap;
            case "cellular":
                H9.a aVar = this.f2978g;
                if (aVar != null) {
                    createMap.putString("cellularGeneration", aVar.label);
                }
                String networkOperatorName = this.f2974c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    createMap.putString("carrier", networkOperatorName);
                }
                return createMap;
            case "wifi":
                if (g.b(e()) && (wifiManager = this.f2973b) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            createMap.putString("ssid", ssid.replace("\"", BuildConfig.FLAVOR));
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            createMap.putString("bssid", bssid);
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        createMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    } catch (Exception unused3) {
                    }
                    try {
                        createMap.putInt("frequency", connectionInfo.getFrequency());
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        g.c(byteArray);
                        createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        g.c(byteArray2);
                        createMap.putString("subnet", f(InetAddress.getByAddress(byteArray2)));
                    } catch (Exception unused6) {
                    }
                    try {
                        createMap.putInt("linkSpeed", connectionInfo.getLinkSpeed());
                    } catch (Exception unused7) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            rxLinkSpeedMbps = connectionInfo.getRxLinkSpeedMbps();
                            createMap.putInt("rxLinkSpeed", rxLinkSpeedMbps);
                        }
                    } catch (Exception unused8) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            txLinkSpeedMbps = connectionInfo.getTxLinkSpeedMbps();
                            createMap.putInt("txLinkSpeed", txLinkSpeedMbps);
                        }
                    } catch (Exception unused9) {
                    }
                }
                return createMap;
            default:
                return createMap;
        }
    }

    private static String f(InetAddress inetAddress) {
        short s10;
        Iterator<InterfaceAddress> it = NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                s10 = 0;
                break;
            }
            InterfaceAddress next = it.next();
            if (next.getAddress().getAddress().length == 4) {
                s10 = next.getNetworkPrefixLength();
                break;
            }
        }
        int i10 = (-1) << (32 - s10);
        return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i10 >> 24) & 255), Integer.valueOf((i10 >> 16) & 255), Integer.valueOf((i10 >> 8) & 255), Integer.valueOf(i10 & 255));
    }

    protected WritableMap a(String str) {
        WritableMap createMap = Arguments.createMap();
        boolean z10 = false;
        if (g.b(e())) {
            WifiManager wifiManager = this.f2973b;
            createMap.putBoolean("isWifiEnabled", wifiManager != null ? wifiManager.isWifiEnabled() : false);
        }
        createMap.putString("type", str != null ? str : this.f2977f.label);
        boolean z11 = (this.f2977f.equals(H9.b.NONE) || this.f2977f.equals(H9.b.UNKNOWN)) ? false : true;
        createMap.putBoolean("isConnected", z11);
        if (this.f2979h && (str == null || str.equals(this.f2977f.label))) {
            z10 = true;
        }
        createMap.putBoolean("isInternetReachable", z10);
        if (str == null) {
            str = this.f2977f.label;
        }
        WritableMap b10 = b(str);
        if (z11) {
            b10.putBoolean("isConnectionExpensive", c() != null ? c().isActiveNetworkMetered() : true);
        }
        createMap.putMap(AppConstants.DETAILS, b10);
        return createMap;
    }

    ConnectivityManager c() {
        return this.f2972a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    ReactApplicationContext e() {
        return this.f2975d;
    }

    public abstract void g();

    protected void h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
    }

    public void i(boolean z10) {
        this.f2980i = Boolean.valueOf(z10);
        k(this.f2977f, this.f2978g, this.f2979h);
    }

    public abstract void j();

    void k(H9.b bVar, H9.a aVar, boolean z10) {
        Boolean bool = this.f2980i;
        if (bool != null) {
            z10 = bool.booleanValue();
        }
        boolean z11 = bVar != this.f2977f;
        boolean z12 = aVar != this.f2978g;
        boolean z13 = z10 != this.f2979h;
        if (z11 || z12 || z13) {
            this.f2977f = bVar;
            this.f2978g = aVar;
            this.f2979h = z10;
            if (this.f2976e) {
                h();
            }
        }
    }
}
