package R5;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* loaded from: classes2.dex */
public class q extends G {
    public q() {
        super(InetSocketAddress.class);
    }

    @Override // R5.H, D5.o
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void f(InetSocketAddress inetSocketAddress, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        String substring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    substring = "[" + hostName.substring(1) + "]";
                } else {
                    substring = hostName.substring(1);
                }
                hostName = substring;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        fVar.h2(hostName + ":" + inetSocketAddress.getPort());
    }

    @Override // R5.G, D5.o
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void g(InetSocketAddress inetSocketAddress, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.f(inetSocketAddress, InetSocketAddress.class, com.fasterxml.jackson.core.k.VALUE_STRING));
        f(inetSocketAddress, fVar, b10);
        gVar.h(fVar, g10);
    }
}
