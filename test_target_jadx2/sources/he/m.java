package he;

import Td.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final a f34104j = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final Class f34105h;

    /* renamed from: i, reason: collision with root package name */
    private final Class f34106i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ l b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final l a(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.e(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.e(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.d(cls3);
                return new m(cls, cls2, cls3);
            } catch (Exception e10) {
                e eVar = e.f34086a;
                String name = B.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                eVar.a(name, 5, "unable to load android socket classes", e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f34105h = sslSocketFactoryClass;
        this.f34106i = paramClass;
    }
}
