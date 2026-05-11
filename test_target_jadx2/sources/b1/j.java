package B1;

import D1.o;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import z1.C5239c;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: f, reason: collision with root package name */
    private final ConnectivityManager f428f;

    /* renamed from: g, reason: collision with root package name */
    private final a f429g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            x1.n e10 = x1.n.e();
            str = k.f431a;
            e10.a(str, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f428f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            x1.n e10 = x1.n.e();
            str = k.f431a;
            e10.a(str, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f428f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, E1.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f428f = (ConnectivityManager) systemService;
        this.f429g = new a();
    }

    @Override // B1.h
    public void h() {
        String str;
        String str2;
        String str3;
        try {
            x1.n e10 = x1.n.e();
            str3 = k.f431a;
            e10.a(str3, "Registering network callback");
            o.a(this.f428f, this.f429g);
        } catch (IllegalArgumentException e11) {
            x1.n e12 = x1.n.e();
            str2 = k.f431a;
            e12.d(str2, "Received exception while registering network callback", e11);
        } catch (SecurityException e13) {
            x1.n e14 = x1.n.e();
            str = k.f431a;
            e14.d(str, "Received exception while registering network callback", e13);
        }
    }

    @Override // B1.h
    public void i() {
        String str;
        String str2;
        String str3;
        try {
            x1.n e10 = x1.n.e();
            str3 = k.f431a;
            e10.a(str3, "Unregistering network callback");
            D1.m.c(this.f428f, this.f429g);
        } catch (IllegalArgumentException e11) {
            x1.n e12 = x1.n.e();
            str2 = k.f431a;
            e12.d(str2, "Received exception while unregistering network callback", e11);
        } catch (SecurityException e13) {
            x1.n e14 = x1.n.e();
            str = k.f431a;
            e14.d(str, "Received exception while unregistering network callback", e13);
        }
    }

    @Override // B1.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5239c e() {
        return k.c(this.f428f);
    }
}
