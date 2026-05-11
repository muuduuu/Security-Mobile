package co.hyperverge.hypersnapsdk.data.remote;

import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class TLSSocketFactory extends SSLSocketFactory {
    private static final String TAG = "TLSSocketFactory";
    private SSLSocketFactory delegate;

    public TLSSocketFactory() {
        HVLogUtils.d(TAG, "TLSSocketFactory() called");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.delegate = sSLContext.getSocketFactory();
    }

    private Socket enableTLSOnSocket(Socket socket) {
        HVLogUtils.d(TAG, "enableTLSOnSocket() called with: socket = [" + socket + "]");
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return enableTLSOnSocket(this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        return enableTLSOnSocket(this.delegate.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
