package Pc;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Pc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1120b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1120b f7728a = new C1120b();

    /* renamed from: b, reason: collision with root package name */
    private static a f7729b;

    /* renamed from: Pc.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f7730a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f7731b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f7732c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f7733d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f7730a = method;
            this.f7731b = method2;
            this.f7732c = method3;
            this.f7733d = method4;
        }

        public final Method a() {
            return this.f7731b;
        }

        public final Method b() {
            return this.f7733d;
        }

        public final Method c() {
            return this.f7732c;
        }

        public final Method d() {
            return this.f7730a;
        }
    }

    private C1120b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f7729b;
        if (aVar != null) {
            return aVar;
        }
        a a10 = a();
        f7729b = a10;
        return a10;
    }

    public final Class[] c(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method a10 = b().a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(clazz, null);
        Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    public final Object[] d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method b10 = b().b();
        if (b10 == null) {
            return null;
        }
        return (Object[]) b10.invoke(clazz, null);
    }

    public final Boolean e(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method c10 = b().c();
        if (c10 == null) {
            return null;
        }
        Object invoke = c10.invoke(clazz, null);
        Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    public final Boolean f(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method d10 = b().d();
        if (d10 == null) {
            return null;
        }
        Object invoke = d10.invoke(clazz, null);
        Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
