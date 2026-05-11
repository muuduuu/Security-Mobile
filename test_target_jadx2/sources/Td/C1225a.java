package Td;

import Td.w;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Td.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1225a {

    /* renamed from: a, reason: collision with root package name */
    private final r f9927a;

    /* renamed from: b, reason: collision with root package name */
    private final SocketFactory f9928b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f9929c;

    /* renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f9930d;

    /* renamed from: e, reason: collision with root package name */
    private final C1231g f9931e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1226b f9932f;

    /* renamed from: g, reason: collision with root package name */
    private final Proxy f9933g;

    /* renamed from: h, reason: collision with root package name */
    private final ProxySelector f9934h;

    /* renamed from: i, reason: collision with root package name */
    private final w f9935i;

    /* renamed from: j, reason: collision with root package name */
    private final List f9936j;

    /* renamed from: k, reason: collision with root package name */
    private final List f9937k;

    public C1225a(String uriHost, int i10, r dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1231g c1231g, InterfaceC1226b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f9927a = dns;
        this.f9928b = socketFactory;
        this.f9929c = sSLSocketFactory;
        this.f9930d = hostnameVerifier;
        this.f9931e = c1231g;
        this.f9932f = proxyAuthenticator;
        this.f9933g = proxy;
        this.f9934h = proxySelector;
        this.f9935i = new w.a().t(sSLSocketFactory != null ? "https" : "http").g(uriHost).n(i10).c();
        this.f9936j = Wd.p.w(protocols);
        this.f9937k = Wd.p.w(connectionSpecs);
    }

    public final C1231g a() {
        return this.f9931e;
    }

    public final List b() {
        return this.f9937k;
    }

    public final r c() {
        return this.f9927a;
    }

    public final boolean d(C1225a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.b(this.f9927a, that.f9927a) && Intrinsics.b(this.f9932f, that.f9932f) && Intrinsics.b(this.f9936j, that.f9936j) && Intrinsics.b(this.f9937k, that.f9937k) && Intrinsics.b(this.f9934h, that.f9934h) && Intrinsics.b(this.f9933g, that.f9933g) && Intrinsics.b(this.f9929c, that.f9929c) && Intrinsics.b(this.f9930d, that.f9930d) && Intrinsics.b(this.f9931e, that.f9931e) && this.f9935i.n() == that.f9935i.n();
    }

    public final HostnameVerifier e() {
        return this.f9930d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1225a) {
            C1225a c1225a = (C1225a) obj;
            if (Intrinsics.b(this.f9935i, c1225a.f9935i) && d(c1225a)) {
                return true;
            }
        }
        return false;
    }

    public final List f() {
        return this.f9936j;
    }

    public final Proxy g() {
        return this.f9933g;
    }

    public final InterfaceC1226b h() {
        return this.f9932f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f9935i.hashCode()) * 31) + this.f9927a.hashCode()) * 31) + this.f9932f.hashCode()) * 31) + this.f9936j.hashCode()) * 31) + this.f9937k.hashCode()) * 31) + this.f9934h.hashCode()) * 31) + Objects.hashCode(this.f9933g)) * 31) + Objects.hashCode(this.f9929c)) * 31) + Objects.hashCode(this.f9930d)) * 31) + Objects.hashCode(this.f9931e);
    }

    public final ProxySelector i() {
        return this.f9934h;
    }

    public final SocketFactory j() {
        return this.f9928b;
    }

    public final SSLSocketFactory k() {
        return this.f9929c;
    }

    public final w l() {
        return this.f9935i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f9935i.h());
        sb3.append(':');
        sb3.append(this.f9935i.n());
        sb3.append(", ");
        if (this.f9933g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f9933g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f9934h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
