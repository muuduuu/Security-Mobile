package Pc;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Pc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1119a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1119a f7724a = new C1119a();

    /* renamed from: b, reason: collision with root package name */
    private static C0151a f7725b;

    /* renamed from: Pc.a$a, reason: collision with other inner class name */
    public static final class C0151a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f7726a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f7727b;

        public C0151a(Method method, Method method2) {
            this.f7726a = method;
            this.f7727b = method2;
        }

        public final Method a() {
            return this.f7727b;
        }

        public final Method b() {
            return this.f7726a;
        }
    }

    private C1119a() {
    }

    private final C0151a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0151a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0151a(null, null);
        }
    }

    private final C0151a b(Object obj) {
        C0151a c0151a = f7725b;
        if (c0151a != null) {
            return c0151a;
        }
        C0151a a10 = a(obj);
        f7725b = a10;
        return a10;
    }

    public final Method c(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method a10 = b(recordComponent).a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(recordComponent, null);
        Intrinsics.e(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    public final Class d(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method b10 = b(recordComponent).b();
        if (b10 == null) {
            return null;
        }
        Object invoke = b10.invoke(recordComponent, null);
        Intrinsics.e(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
