package B4;

import Td.B;
import Td.D;
import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import Td.v;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static B f439a;

    /* renamed from: B4.a$a, reason: collision with other inner class name */
    class C0010a implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InspectorNetworkRequestListener f440a;

        C0010a(InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            this.f440a = inspectorNetworkRequestListener;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, F f10) {
            v p10 = f10.p();
            HashMap hashMap = new HashMap();
            for (String str : p10.j()) {
                hashMap.put(str, p10.c(str));
            }
            this.f440a.onHeaders(f10.f(), hashMap);
            try {
                G b10 = f10.b();
                if (b10 != null) {
                    try {
                        InputStream a10 = b10.a();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                int read = a10.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                this.f440a.onData(new String(bArr, 0, read));
                            } catch (Throwable th) {
                                a10.close();
                                throw th;
                            }
                        }
                        a10.close();
                    } finally {
                    }
                }
                this.f440a.onCompletion();
                if (b10 != null) {
                    b10.close();
                }
            } catch (IOException e10) {
                this.f440a.onError(e10.getMessage());
            }
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
            if (interfaceC1229e.e()) {
                return;
            }
            this.f440a.onError(iOException.getMessage());
        }
    }

    public static void a(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        if (f439a == null) {
            B.a aVar = new B.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f439a = aVar.g(10L, timeUnit).i0(10L, timeUnit).d0(0L, TimeUnit.MINUTES).c();
        }
        try {
            f439a.a(new D.a().x(str).b()).g1(new C0010a(inspectorNetworkRequestListener));
        } catch (IllegalArgumentException unused) {
            inspectorNetworkRequestListener.onError("Not a valid URL: " + str);
        }
    }
}
