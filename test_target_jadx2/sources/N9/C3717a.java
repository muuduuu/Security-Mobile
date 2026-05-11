package n9;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3717a extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f37589a;

    public C3717a(SSLSocketFactory mSSLSocketFactory) {
        Intrinsics.checkNotNullParameter(mSSLSocketFactory, "mSSLSocketFactory");
        this.f37589a = mSSLSocketFactory;
    }

    private final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2", "TLSv1.3"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.f37589a.createSocket();
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f37589a.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f37589a.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s10, String host, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f37589a.createSocket(s10, host, i10, z10);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f37589a.createSocket(host, i10);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i10, InetAddress localHost, int i11) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket createSocket = this.f37589a.createSocket(host, i10, localHost, i11);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f37589a.createSocket(host, i10);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i10, InetAddress localAddress, int i11) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket createSocket = this.f37589a.createSocket(address, i10, localAddress, i11);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }
}
