package he;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public interface l {
    boolean a(SSLSocket sSLSocket);

    String b(SSLSocket sSLSocket);

    void c(SSLSocket sSLSocket, String str, List list);

    boolean isSupported();
}
