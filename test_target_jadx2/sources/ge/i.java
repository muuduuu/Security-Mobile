package ge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends n {

    /* renamed from: i, reason: collision with root package name */
    public static final b f33774i = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private final Method f33775d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f33776e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f33777f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f33778g;

    /* renamed from: h, reason: collision with root package name */
    private final Class f33779h;

    private static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final List f33780a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33781b;

        /* renamed from: c, reason: collision with root package name */
        private String f33782c;

        public a(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f33780a = protocols;
        }

        public final String a() {
            return this.f33782c;
        }

        public final boolean b() {
            return this.f33781b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.b(name, "supports") && Intrinsics.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.b(name, "unsupported") && Intrinsics.b(Void.TYPE, returnType)) {
                this.f33781b = true;
                return null;
            }
            if (Intrinsics.b(name, "protocols") && objArr.length == 0) {
                return this.f33780a;
            }
            if ((Intrinsics.b(name, "selectProtocol") || Intrinsics.b(name, "select")) && Intrinsics.b(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f33780a.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f33782c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f33780a.get(0);
                    this.f33782c = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.b(name, "protocolSelected") && !Intrinsics.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f33782c = (String) obj3;
            return null;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.d(property);
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.d(method);
                Intrinsics.d(method2);
                Intrinsics.d(method3);
                Intrinsics.d(cls3);
                Intrinsics.d(cls4);
                return new i(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private b() {
        }
    }

    public i(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f33775d = putMethod;
        this.f33776e = getMethod;
        this.f33777f = removeMethod;
        this.f33778g = clientProviderClass;
        this.f33779h = serverProviderClass;
    }

    @Override // ge.n
    public void b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f33777f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // ge.n
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.f33775d.invoke(null, sslSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f33778g, this.f33779h}, new a(n.f33789a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // ge.n
    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f33776e.invoke(null, sslSocket));
            Intrinsics.e(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                n.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
