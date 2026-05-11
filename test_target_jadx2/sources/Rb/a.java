package Rb;

import Db.C0792a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import expo.modules.kotlin.exception.l;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import qc.AbstractC3958a;
import u5.C4870a;
import vb.C5006a;
import vb.EnumC5010e;
import wb.h;
import wb.i;
import wb.j;
import wb.k;
import xb.AbstractC5139a;
import xc.m;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001a\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"LRb/a;", "Lxb/a;", "<init>", "()V", BuildConfig.FLAVOR, "p", "Landroid/os/Bundle;", "q", "()Landroid/os/Bundle;", "Landroid/net/NetworkInfo;", "netInfo", "LRb/a$a;", "s", "(Landroid/net/NetworkInfo;)LRb/a$a;", "Landroid/net/NetworkCapabilities;", "netCapabilities", "r", "(Landroid/net/NetworkCapabilities;)LRb/a$a;", BuildConfig.FLAVOR, "ipAddress", BuildConfig.FLAVOR, "w", "(I)Ljava/lang/String;", "Lxb/c;", "b", "()Lxb/c;", "Rb/a$g", "d", "LRb/a$g;", "networkCallback", "Landroid/content/Context;", "u", "()Landroid/content/Context;", "context", "Landroid/net/ConnectivityManager;", "t", "()Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/wifi/WifiInfo;", "v", "()Landroid/net/wifi/WifiInfo;", "wifiInfo", C4870a.f43493a, "expo-network_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g networkCallback = new g();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Rb.a$a, reason: collision with other inner class name */
    public static final class EnumC0167a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0167a[] $VALUES;
        private final String value;
        public static final EnumC0167a NONE = new EnumC0167a("NONE", 0, "NONE");
        public static final EnumC0167a UNKNOWN = new EnumC0167a("UNKNOWN", 1, "UNKNOWN");
        public static final EnumC0167a CELLULAR = new EnumC0167a("CELLULAR", 2, "CELLULAR");
        public static final EnumC0167a WIFI = new EnumC0167a("WIFI", 3, "WIFI");
        public static final EnumC0167a BLUETOOTH = new EnumC0167a("BLUETOOTH", 4, "BLUETOOTH");
        public static final EnumC0167a ETHERNET = new EnumC0167a("ETHERNET", 5, "ETHERNET");
        public static final EnumC0167a WIMAX = new EnumC0167a("WIMAX", 6, "WIMAX");
        public static final EnumC0167a VPN = new EnumC0167a("VPN", 7, "VPN");
        public static final EnumC0167a OTHER = new EnumC0167a("OTHER", 8, "OTHER");

        private static final /* synthetic */ EnumC0167a[] $values() {
            return new EnumC0167a[]{NONE, UNKNOWN, CELLULAR, WIFI, BLUETOOTH, ETHERNET, WIMAX, VPN, OTHER};
        }

        static {
            EnumC0167a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private EnumC0167a(String str, int i10, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static EnumC0167a valueOf(String str) {
            return (EnumC0167a) Enum.valueOf(EnumC0167a.class, str);
        }

        public static EnumC0167a[] values() {
            return (EnumC0167a[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public final boolean isDefined() {
            return (Intrinsics.b(this.value, "NONE") || Intrinsics.b(this.value, "UNKNOWN")) ? false : true;
        }
    }

    public static final class b extends m implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a aVar = a.this;
            return aVar.w(aVar.v().getIpAddress());
        }
    }

    public static final class c extends m implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Settings.Global.getInt(a.this.u().getContentResolver(), "airplane_mode_on", 0) != 0);
        }
    }

    public static final class d extends m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return a.this.q();
        }
    }

    public static final class e extends m implements Function0 {
        public e() {
            super(0);
        }

        public final void a() {
            a.this.t().registerNetworkCallback(new NetworkRequest.Builder().build(), a.this.networkCallback);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class f extends m implements Function0 {
        public f() {
            super(0);
        }

        public final void a() {
            a.this.t().unregisterNetworkCallback(a.this.networkCallback);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class g extends ConnectivityManager.NetworkCallback {
        g() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            a.this.p();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            a.this.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        f("onNetworkStateChanged", q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle q() {
        String value;
        Bundle bundle = new Bundle();
        try {
            if (Build.VERSION.SDK_INT < 29) {
                NetworkInfo activeNetworkInfo = t().getActiveNetworkInfo();
                EnumC0167a s10 = s(activeNetworkInfo);
                Intrinsics.d(activeNetworkInfo);
                bundle.putBoolean("isInternetReachable", activeNetworkInfo.isConnected());
                bundle.putString("type", s10.getValue());
                bundle.putBoolean("isConnected", s10.isDefined());
                return bundle;
            }
            Network activeNetwork = t().getActiveNetwork();
            boolean z10 = true;
            boolean z11 = activeNetwork != null;
            EnumC0167a r10 = z11 ? r(t().getNetworkCapabilities(activeNetwork)) : null;
            if (r10 == null || (value = r10.getValue()) == null) {
                value = EnumC0167a.NONE.getValue();
            }
            bundle.putString("type", value);
            bundle.putBoolean("isInternetReachable", z11);
            if (r10 == null || !r10.isDefined()) {
                z10 = false;
            }
            bundle.putBoolean("isConnected", z10);
            return bundle;
        } catch (Exception unused) {
            bundle.putString("type", EnumC0167a.UNKNOWN.getValue());
            bundle.putBoolean("isInternetReachable", false);
            bundle.putBoolean("isConnected", false);
            return bundle;
        }
    }

    private final EnumC0167a r(NetworkCapabilities netCapabilities) {
        return netCapabilities == null ? EnumC0167a.UNKNOWN : netCapabilities.hasTransport(0) ? EnumC0167a.CELLULAR : (netCapabilities.hasTransport(1) || netCapabilities.hasTransport(5)) ? EnumC0167a.WIFI : netCapabilities.hasTransport(2) ? EnumC0167a.BLUETOOTH : netCapabilities.hasTransport(3) ? EnumC0167a.ETHERNET : netCapabilities.hasTransport(4) ? EnumC0167a.VPN : EnumC0167a.UNKNOWN;
    }

    private final EnumC0167a s(NetworkInfo netInfo) {
        Integer valueOf = netInfo != null ? Integer.valueOf(netInfo.getType()) : null;
        return ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 4)) ? EnumC0167a.CELLULAR : (valueOf != null && valueOf.intValue() == 1) ? EnumC0167a.WIFI : (valueOf != null && valueOf.intValue() == 7) ? EnumC0167a.BLUETOOTH : (valueOf != null && valueOf.intValue() == 9) ? EnumC0167a.ETHERNET : (valueOf != null && valueOf.intValue() == 6) ? EnumC0167a.WIMAX : (valueOf != null && valueOf.intValue() == 17) ? EnumC0167a.VPN : EnumC0167a.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectivityManager t() {
        Object systemService = u().getSystemService("connectivity");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context u() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifiInfo v() {
        String str;
        try {
            Object systemService = u().getSystemService("wifi");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            Intrinsics.d(connectionInfo);
            return connectionInfo;
        } catch (Exception e10) {
            str = Rb.b.f8657a;
            String message = e10.getMessage();
            if (message == null) {
                message = "Wi-Fi information could not be acquired";
            }
            Log.e(str, message);
            throw new Rb.d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String w(int ipAddress) {
        if (Intrinsics.b(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN)) {
            ipAddress = Integer.reverseBytes(ipAddress);
        }
        byte[] byteArray = BigInteger.valueOf(ipAddress).toByteArray();
        if (byteArray.length < 4) {
            Intrinsics.d(byteArray);
            byteArray = Rb.c.a(byteArray);
        }
        try {
            String hostAddress = InetAddress.getByAddress(byteArray).getHostAddress();
            Intrinsics.e(hostAddress, "null cannot be cast to non-null type kotlin.String");
            return hostAddress;
        } catch (UnknownHostException unused) {
            return "0.0.0.0";
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoNetwork");
            bVar.d("onNetworkStateChanged");
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new e()));
            Map s11 = bVar.s();
            EnumC5010e enumC5010e2 = EnumC5010e.MODULE_DESTROY;
            s11.put(enumC5010e2, new C5006a(enumC5010e2, new f()));
            bVar.k().put("getNetworkStateAsync", new wb.e("getNetworkStateAsync", new C0792a[0], new d()));
            C0792a[] c0792aArr = new C0792a[0];
            b bVar2 = new b();
            Class cls = Integer.TYPE;
            bVar.k().put("getIpAddressAsync", Intrinsics.b(String.class, cls) ? new k("getIpAddressAsync", c0792aArr, bVar2) : Intrinsics.b(String.class, Boolean.TYPE) ? new h("getIpAddressAsync", c0792aArr, bVar2) : Intrinsics.b(String.class, Double.TYPE) ? new i("getIpAddressAsync", c0792aArr, bVar2) : Intrinsics.b(String.class, Float.TYPE) ? new j("getIpAddressAsync", c0792aArr, bVar2) : Intrinsics.b(String.class, String.class) ? new wb.m("getIpAddressAsync", c0792aArr, bVar2) : new wb.e("getIpAddressAsync", c0792aArr, bVar2));
            C0792a[] c0792aArr2 = new C0792a[0];
            c cVar = new c();
            bVar.k().put("isAirplaneModeEnabledAsync", Intrinsics.b(Boolean.class, cls) ? new k("isAirplaneModeEnabledAsync", c0792aArr2, cVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new h("isAirplaneModeEnabledAsync", c0792aArr2, cVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new i("isAirplaneModeEnabledAsync", c0792aArr2, cVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new j("isAirplaneModeEnabledAsync", c0792aArr2, cVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("isAirplaneModeEnabledAsync", c0792aArr2, cVar) : new wb.e("isAirplaneModeEnabledAsync", c0792aArr2, cVar));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
