package he;

import ge.n;
import he.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public class h implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f34090f;

    /* renamed from: g, reason: collision with root package name */
    private static final k.a f34091g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f34092a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f34093b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f34094c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f34095d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f34096e;

    public static final class a {

        /* renamed from: he.h$a$a, reason: collision with other inner class name */
        public static final class C0504a implements k.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f34097a;

            C0504a(String str) {
                this.f34097a = str;
            }

            @Override // he.k.a
            public boolean a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return StringsKt.F(name, this.f34097a + '.', false, 2, null);
            }

            @Override // he.k.a
            public l b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return h.f34090f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !Intrinsics.b(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.d(cls2);
            return new h(cls2);
        }

        public final k.a c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C0504a(packageName);
        }

        public final k.a d() {
            return h.f34091g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f34090f = aVar;
        f34091g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f34092a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f34093b = declaredMethod;
        this.f34094c = sslSocketClass.getMethod("setHostname", String.class);
        this.f34095d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f34096e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // he.l
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f34092a.isInstance(sslSocket);
    }

    @Override // he.l
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f34095d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // he.l
    public void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f34093b.invoke(sslSocket, Boolean.TRUE);
                this.f34096e.invoke(sslSocket, n.f33789a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // he.l
    public boolean isSupported() {
        return ge.f.f33762e.b();
    }
}
